package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.audience;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownAudienceWidget extends BaseVmWidget<CountdownAudienceViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final String A1() {
        return "CountdownAudienceWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final Class<CountdownAudienceViewModel> z1() {
        return CountdownAudienceViewModel.class;
    }
}
