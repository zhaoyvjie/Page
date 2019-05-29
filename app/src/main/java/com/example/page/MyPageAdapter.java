package com.example.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return  new FirstFragment();
        }
        else  if(position==1){
            return new SecondFragment();
        }
        else  if(position==2){
            return new ThirdFragment();
        }
        return null;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String str =new String();
        if(position==0)
            str="埃菲尔铁塔";
        else if(position==1)
            str="卢浮宫";
        if(position==2)
            str="凯旋门";

        return "Title" + str;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
