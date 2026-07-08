package com.bytedance.android.live.liveinteract.voicechat.main;

import X.C465900IOu;
import X.C945320ahu;
import X.InterfaceC926780aE0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsVoiceChatWidget extends AbsVoiceChatSubWidget {
    public InterfaceC926780aE0 LL;

    public void A1(C945320ahu c945320ahu) {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract boolean x1(Runnable runnable, boolean z, C465900IOu c465900IOu, boolean z2);

    public abstract boolean y1();

    public abstract void z1(String str, boolean z);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.LL = null;
    }
}
