package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest;

import X.C20441214yg;
import X.C2188811AlT;
import X.C948450amx;
import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest.GuestTextHeaderViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes.dex */
public final class GuestTextHeaderWidget extends BaseTextHeaderWidget<GuestTextHeaderViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget
    public final String x1() {
        return "GuestTextHeaderWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget
    public final void y1() {
        Fragment fragment;
        C20441214yg.LIZIZ("GuestTextHeaderWidget", "initViewModel");
        try {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null || !fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
                return;
            }
            final DataChannel dataChannel = this.dataChannel;
            VM vm = (VM) new ViewModelProvider(fragment, new ViewModelProvider.Factory(dataChannel) { // from class: X.01O6
                public final DataChannel LIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                {
                    this.LIZ = dataChannel;
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(GuestTextHeaderViewModel.class)) {
                        return new GuestTextHeaderViewModel(this.LIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
            }).get(GuestTextHeaderViewModel.class);
            this.LL = vm;
            C20441214yg.LIZIZ("GuestTextHeaderService", "create");
            C948450amx.LIZIZ.LJFF(new GuestTextHeaderService(this.dataChannel, (GuestTextHeaderViewModel) vm), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initViewModel error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GuestTextHeaderWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.BaseTextHeaderWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("GuestTextHeaderService", "release");
        C948450amx.LIZIZ.LJI("GUEST_TEXT_HEADER");
    }
}
