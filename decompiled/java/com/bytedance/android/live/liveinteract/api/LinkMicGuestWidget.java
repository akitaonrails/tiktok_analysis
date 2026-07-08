package com.bytedance.android.live.liveinteract.api;

import X.C465900IOu;
import X.C945320ahu;
import X.InterfaceC926810aE3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes16.dex */
public abstract class LinkMicGuestWidget extends LiveWidget implements InterfaceC926810aE3 {
    @Override // X.InterfaceC944150ag1
    public void LLJJJJLIIL() {
    }

    @Override // X.InterfaceC926810aE3
    public void LLJJL(C945320ahu c945320ahu, DataChannel dataChannel, String str) {
    }

    @Override // X.InterfaceC926810aE3
    public boolean i(Runnable runnable, boolean z, boolean z2, C465900IOu c465900IOu, String str, boolean z3, EnterRoomConfig enterRoomConfig) {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
    }
}
