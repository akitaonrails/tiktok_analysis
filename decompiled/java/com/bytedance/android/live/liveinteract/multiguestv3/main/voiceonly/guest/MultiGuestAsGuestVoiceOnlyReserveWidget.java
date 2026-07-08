package com.bytedance.android.live.liveinteract.multiguestv3.main.voiceonly.guest;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkMicSettingMessageUpdatedEvent;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAsGuestVoiceOnlyReserveWidget extends LiveWidget {
    public Boolean LL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.dataChannel.BQ2(this, LinkMicSettingMessageUpdatedEvent.class, new AwS594S0100000_15(this, 463));
    }
}
