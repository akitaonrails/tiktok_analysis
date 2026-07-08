package com.bytedance.android.live.liveinteract.api;

import X.InterfaceC781470Ul7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseLinkControlWidget extends LiveWidget implements InterfaceC781470Ul7 {
    public boolean LL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract CoHostLiveWidget x1();

    public abstract void y1();

    public abstract void z1();
}
