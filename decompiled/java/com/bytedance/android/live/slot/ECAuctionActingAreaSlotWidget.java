package com.bytedance.android.live.slot;

import X.EnumC1124020fM8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes18.dex */
public final class ECAuctionActingAreaSlotWidget extends BaseLiveECFrameSlotWidget {
    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget
    public final EnumC1124020fM8 x1() {
        return EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_ACTING_AREA;
    }
}
