package com.bytedance.android.live.publicscreen.api;

import X.C07WS;
import X.C1109770ez9;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;

/* JADX INFO: loaded from: classes18.dex */
public abstract class IPublicScreenHolderWidget extends RoomRecycleWidget {
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public C07WS x1() {
        return null;
    }

    public abstract C1109770ez9 y1();
}
