package com.bawei.pindao;

import android.app.Application;

import org.xutils.x;

/**
 * Created by yufuhao on 2017/5/27.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
