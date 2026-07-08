package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.anchor;

import X.C01E8;
import X.C0KVU;
import X.C299601Ec;
import X.C497740JfY;
import X.C766270U4b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownAnchorWidget extends BaseVmWidget<CountdownAnchorViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final String A1() {
        return "CountdownAnchorWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final Class<CountdownAnchorViewModel> z1() {
        return CountdownAnchorViewModel.class;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final void B1(C299601Ec c299601Ec) {
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        if (linkerMediaChangeOperator != null && linkerMediaChangeOperator.operatorType == 1) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843222, C0KVU.LIZIZ(linkerMediaChangeOperator.displayId, linkerMediaChangeOperator.nickName), C01E8.LJ(c299601Ec.LIZJ)));
        }
        super.B1(c299601Ec);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget
    public final void C1(C299601Ec c299601Ec) {
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        if (linkerMediaChangeOperator != null && linkerMediaChangeOperator.operatorType == 1) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843223, C0KVU.LIZIZ(linkerMediaChangeOperator.displayId, linkerMediaChangeOperator.nickName), C01E8.LJ(c299601Ec.LIZJ)));
        }
        super.C1(c299601Ec);
        y1(c299601Ec);
    }
}
