package com.bytedance.android.live.performance.widget;

import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RoomRecycleFunctionWidget extends PerformProcessWidget {
    public boolean LL;

    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        this.LL = false;
    }

    public RoomRecycleFunctionWidget() {
        register(Room.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final <T> void onCustomInfoCallBack(T t) {
        if (t instanceof Room) {
            onGetRoomInfo((Room) t);
        }
        super.onCustomInfoCallBack(t);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (!this.LL && LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            View view = getView();
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
            this.LL = true;
        }
    }
}
