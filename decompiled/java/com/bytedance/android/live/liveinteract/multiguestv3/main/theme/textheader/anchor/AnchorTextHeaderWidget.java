package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C01OF;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC1097170eep;
import X.InterfaceC971790bOb;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorTextHeaderWidget extends BaseTextHeaderWidget<AnchorTextHeaderViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget
    public final String x1() {
        return "AnchorTextHeaderWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget
    public final void y1() {
        Fragment fragment;
        AnchorTextHeaderService anchorTextHeaderService;
        C20441214yg.LIZIZ("AnchorTextHeaderWidget", "initViewModel");
        try {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null || !fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
                return;
            }
            AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = null;
            C01OF.LIZ(this.dataChannel, fragment, null, 4);
            InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
            if ((interfaceC971790bObLIZIZ instanceof AnchorTextHeaderService) && (anchorTextHeaderService = (AnchorTextHeaderService) interfaceC971790bObLIZIZ) != null) {
                anchorTextHeaderViewModelLJIIZILJ = anchorTextHeaderService.LJIIZILJ();
            }
            this.LL = anchorTextHeaderViewModelLJIIZILJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initViewModel error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("AnchorTextHeaderWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, TextHeaderClickEvent.class, AFwS250S0000000_15.get$arr$(73));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C01OF.LIZJ();
    }
}
