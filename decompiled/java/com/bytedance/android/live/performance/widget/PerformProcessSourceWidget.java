package com.bytedance.android.live.performance.widget;

import X.InterfaceC1078250eAJ;
import X.InterfaceC1078330eAR;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget;

/* JADX INFO: loaded from: classes18.dex */
public abstract class PerformProcessSourceWidget extends LiveRecycleSourceWidget implements InterfaceC1078330eAR, InterfaceC1078250eAJ {
    @Override // X.InterfaceC1078250eAJ
    public final void LJLIL() {
    }

    @Override // X.InterfaceC1078250eAJ
    public final void X0() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
    }
}
