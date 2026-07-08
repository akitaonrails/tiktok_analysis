package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest;

import X.AnonymousClass0207;
import X.C01GW;
import X.C01ZB;
import X.C01ZC;
import X.C1548820qPI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C304801Gc;
import X.C334801Rq;
import X.C452501pT;
import X.C515301zb;
import X.C5182020e;
import X.C5183020f;
import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAndAudienceRoleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownEntranceClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnCalculatingMessageReceivedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnClosedMessageReceivedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownShowEndDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest.GuestShowdownGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownGuestWidget extends BaseGuestShowdownWidget<GuestShowdownGuestViewModel> {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C5182020e(this, 45));

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "guest_showdown";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final String x1() {
        return "GuestShowdownGuestWidget";
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        VM vm = this.LLILLL;
        return vm != 0 && vm.CQ2();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final void y1() {
        Fragment fragment;
        C20441214yg.LIZIZ("GuestShowdownGuestWidget", "initViewModel");
        try {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
                return;
            }
            final DataChannel dataChannel = this.dataChannel;
            ViewModelProvider.Factory factory = new ViewModelProvider.Factory(dataChannel) { // from class: X.01O4
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
                    if (cls.isAssignableFrom(GuestShowdownGuestViewModel.class)) {
                        return new GuestShowdownGuestViewModel(this.LIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
            };
            if (!fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
                return;
            }
            this.LLILLL = (VM) ViewModelProviders.of(fragment, factory).get(GuestShowdownGuestViewModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initViewModel error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GuestShowdownGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (C01ZC.LIZIZ()) {
            C1548820qPI.LIZLLL("multi_guest_lynx_panel_status_change", (C515301zb) this.LLJILJIL.getValue());
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GuestShowdownEntranceClickEvent.class, new C5183020f(this, 44));
            dataChannel.BQ2(this, GuestShowdownShowEndDialogEvent.class, new C5183020f(this, 45));
            dataChannel.BQ2(this, GuestShowdownOnCalculatingMessageReceivedEvent.class, AnonymousClass0207.get$arr$(15));
            dataChannel.BQ2(this, GuestShowdownOnClosedMessageReceivedEvent.class, AnonymousClass0207.get$arr$(16));
            dataChannel.BQ2(this, MultiGuestAndAudienceRoleChannel.class, new C5183020f(this, 46));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (C01ZC.LIZIZ()) {
            C1548820qPI.LJIIIIZZ("multi_guest_lynx_panel_status_change", (C515301zb) this.LLJILJIL.getValue());
        }
    }

    public final boolean E1(C334801Rq c334801Rq) {
        int iIntValue;
        String str;
        GuestShowdownContent value;
        Integer numAQ2;
        VM vm = this.LLILLL;
        if (vm != 0 && (numAQ2 = vm.AQ2()) != null) {
            iIntValue = numAQ2.intValue();
        } else {
            iIntValue = 0;
        }
        if (c334801Rq != null) {
            str = c334801Rq.LIZ;
        } else {
            str = null;
        }
        String str2 = "playbook";
        if (!Intrinsics.LJFF(str, "playbook")) {
            if (Intrinsics.LJFF(str, "play_panel")) {
                str2 = "funkit";
            } else if (c334801Rq == null || (str2 = c334801Rq.LIZ) == null) {
                str2 = "unknown";
            }
        }
        if (iIntValue != 0 && iIntValue != 5) {
            C01ZB c01zb = (C01ZB) this.LLIZ.getValue();
            VM vm2 = this.LLILLL;
            if (vm2 != 0) {
                value = vm2.LLILZLL.getValue();
            } else {
                value = null;
            }
            c01zb.LIZJ(c334801Rq, null, value, str2);
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current user role is not anchor, can't handle this click event. current gameplay status: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LJ("GuestShowdownGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final boolean B1(C304801Gc c304801Gc, boolean z, GuestShowdownContent guestShowdownContent, C334801Rq c334801Rq) {
        if (C01ZC.LIZIZ()) {
            return E1(c334801Rq);
        }
        return super.B1(c304801Gc, z, guestShowdownContent, c334801Rq);
    }
}
