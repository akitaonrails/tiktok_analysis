package com.bytedance.android.live.pin.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GameLinkLayoutLandDataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapeCommentPinnedWidget extends MainScreenCommentPinnedWidget {
    @Override // com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget, com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget, com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(dataChannel.LLILZ, GameLinkLayoutLandDataChannel.class, new AwS596S0100000_17(this, 62));
        }
    }
}
