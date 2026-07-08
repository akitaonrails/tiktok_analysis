package com.bytedance.android.live.liveinteract.voicechat.api;

import X.C945320ahu;
import X.InterfaceC781470Ul7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsVoiceChatControlWidget extends LiveWidget implements InterfaceC781470Ul7 {
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void x1(C945320ahu c945320ahu);
}
