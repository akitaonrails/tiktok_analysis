package com.bytedance.android.live.broadcast.api;

import X.C006A;
import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public interface IBroadcastDialogManager extends C006A {
    void addDialogToManager(Dialog dialog);

    void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer);

    /* bridge */ /* synthetic */ void onInit();

    void promoteTasks();
}
