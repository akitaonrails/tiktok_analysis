package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor;

import X.AnonymousClass0206;
import X.AnonymousClass0207;
import X.C01GV;
import X.C01GW;
import X.C01IA;
import X.C01Z9;
import X.C01ZC;
import X.C098J;
import X.C1548820qPI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C304801Gc;
import X.C305201Gg;
import X.C334801Rq;
import X.C452501pT;
import X.C500260Jjc;
import X.C513601zK;
import X.C515301zb;
import X.C5182020e;
import X.C5183020f;
import X.C935490aS3;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC936960aUQ;
import X.InterfaceC1097170eep;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownEntranceClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnClosedMessageReceivedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownShowEndDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownUpdatePlaySettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownIdleSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownInPunishmentSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownOngoingSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.GuestShowdownConfigChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownAnchorWidget extends BaseGuestShowdownWidget<GuestShowdownAnchorViewModel> {
    public GuestShowdownIdleSettingsDialog LLJILJIL;
    public GuestShowdownOngoingSettingsDialog LLJILJILJ;
    public GuestShowdownInPunishmentSettingsDialog LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(47));
    public final C098J<String, Long> LLJJI = new C098J<>(3);
    public final C513601zK LLJJIII = new C513601zK(this, 3);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C5182020e(this, 37));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C5182020e(this, 38));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C5182020e(this, 40));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C5182020e(this, 39));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C5182020e(this, 41));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C5182020e(this, 36));

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
        return "GuestShowdownAnchorWidget";
    }

    public final int G1() {
        C305201Gg c305201Gg;
        Integer num;
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) this.LLILLL;
        return (guestShowdownAnchorViewModel == null || (c305201Gg = guestShowdownAnchorViewModel.LLJJIII.LJIL) == null || (num = c305201Gg.LIZIZ) == null) ? MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().maxLoserNum : num.intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, X.InterfaceC941870acL
    public final void end() {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) this.LLILLL;
        if (guestShowdownAnchorViewModel != null) {
            guestShowdownAnchorViewModel.FQ2(1);
        }
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        VM vm = this.LLILLL;
        return vm != 0 && vm.CQ2();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final void y1() {
        Fragment fragment;
        C20441214yg.LIZIZ("GuestShowdownAnchorWidget", "initViewModel");
        try {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
                return;
            }
            final DataChannel dataChannel = this.dataChannel;
            final Context context = this.context;
            ViewModelProvider.Factory factory = new ViewModelProvider.Factory(context, dataChannel) { // from class: X.01O2
                public final DataChannel LIZ;
                public final Context LIZIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(GuestShowdownAnchorViewModel.class)) {
                        return new GuestShowdownAnchorViewModel(this.LIZIZ, this.LIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }

                {
                    this.LIZ = dataChannel;
                    this.LIZIZ = context;
                }
            };
            if (!fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
                return;
            }
            this.LLILLL = (VM) ViewModelProviders.of(fragment, factory).get(GuestShowdownAnchorViewModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initViewModel error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GuestShowdownAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (C01ZC.LIZIZ()) {
            C1548820qPI.LIZLLL("multi_guest_lynx_panel_status_change", (C515301zb) this.LLJJIJI.getValue());
        }
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) this.LLILLL;
        if (guestShowdownAnchorViewModel != null) {
            guestShowdownAnchorViewModel.LLJI.observe(this, this.LLJJIII);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GuestShowdownEntranceClickEvent.class, new C5183020f(this, 39));
            dataChannel.BQ2(this, GuestShowdownUpdatePlaySettingEvent.class, new C5183020f(this, 40));
            dataChannel.BQ2(this, GuestShowdownShowEndDialogEvent.class, new C5183020f(this, 41));
            dataChannel.BQ2(this, GuestShowdownOnClosedMessageReceivedEvent.class, AnonymousClass0207.get$arr$(14));
            dataChannel.BQ2(this, GuestShowdownConfigChannel.class, new C5183020f(this, 42));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (C01ZC.LIZIZ()) {
            C1548820qPI.LJIIIIZZ("multi_guest_lynx_panel_status_change", (C515301zb) this.LLJJIJI.getValue());
        }
    }

    public final void E1(GuestShowdownConfig guestShowdownConfig) {
        long j = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().maxPunishmentDuration;
        long j2 = guestShowdownConfig.duration;
        if (j2 <= 0) {
            j = 60;
        } else if (j2 <= j) {
            j = j2;
        }
        int iG1 = G1();
        int i = guestShowdownConfig.loserNum;
        if (i < 0) {
            iG1 = 0;
        } else if (i <= iG1) {
            iG1 = i;
        }
        guestShowdownConfig.duration = j;
        guestShowdownConfig.loserNum = iG1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final webcast.data.multi_guest_play.GuestShowdownConfig F1(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2a
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel r0 = r4.LLILLL
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel) r0
            if (r0 == 0) goto L12
            androidx.lifecycle.MutableLiveData<webcast.data.multi_guest_play.GuestShowdownConfig> r0 = r0.LLJIJIL
            java.lang.Object r3 = r0.getValue()
            webcast.data.multi_guest_play.GuestShowdownConfig r3 = (webcast.data.multi_guest_play.GuestShowdownConfig) r3
        L10:
            if (r3 != 0) goto L29
        L12:
            webcast.data.multi_guest_play.GuestShowdownConfig r3 = new webcast.data.multi_guest_play.GuestShowdownConfig
            r3.<init>()
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting r2 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting.INSTANCE
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.GuestShowDownConfig r0 = r2.getSettingValue()
            long r0 = r0.defaultDuration
            r3.duration = r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.GuestShowDownConfig r0 = r2.getSettingValue()
            int r0 = r0.defaultLoserNum
            r3.loserNum = r0
        L29:
            return r3
        L2a:
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel r0 = r4.LLILLL
            if (r0 == 0) goto L12
            androidx.lifecycle.MutableLiveData<webcast.data.multi_guest_play.GuestShowdownConfig> r0 = r0.LLILZIL
            java.lang.Object r3 = r0.getValue()
            webcast.data.multi_guest_play.GuestShowdownConfig r3 = (webcast.data.multi_guest_play.GuestShowdownConfig) r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget.F1(boolean):webcast.data.multi_guest_play.GuestShowdownConfig");
    }

    public final boolean H1(C334801Rq c334801Rq) {
        Integer numAQ2;
        GuestShowdownConfig guestShowdownConfigF1;
        C946060aj6 c946060aj6LIZIZ;
        C946050aj5 c946050aj5LIZIZ;
        Function0<Unit> function0;
        List<LinkPlayerInfo> value;
        Integer numValueOf;
        VM vm = this.LLILLL;
        Boolean boolValueOf = null;
        if (vm != 0) {
            numAQ2 = vm.AQ2();
        } else {
            numAQ2 = null;
        }
        int iIntValue = 0;
        boolean zA1 = true;
        if (numAQ2 != null && numAQ2.intValue() != 5 && numAQ2.intValue() != 0) {
            if (numAQ2.intValue() != 1 && numAQ2.intValue() != 2 && numAQ2.intValue() != 3) {
                if (numAQ2.intValue() != 4) {
                    return false;
                }
                VM vm2 = this.LLILLL;
                if (vm2 != 0) {
                    vm2.EQ2(2);
                }
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) this.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuestShowdownAnchorViewModel.LLJJIJI;
                    guestShowdownAnchorViewModel.GQ2(true);
                }
                return B1((C304801Gc) this.LLJJJJ.getValue(), true, null, c334801Rq);
            }
            VM vm3 = this.LLILLL;
            if (vm3 != 0) {
                vm3.EQ2(1);
            }
            return D1((C01GV) this.LLJJJIL.getValue());
        }
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = (GuestShowdownAnchorViewModel) this.LLILLL;
        if (guestShowdownAnchorViewModel2 != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C5182020e(guestShowdownAnchorViewModel2, 307));
        }
        GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog = this.LLJILJIL;
        if (guestShowdownIdleSettingsDialog != null) {
            boolValueOf = Boolean.valueOf(guestShowdownIdleSettingsDialog.isVisible());
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            DataChannel dataChannel = this.dataChannel;
            C946060aj6 c946060aj6LIZIZ2 = C01Z9.LIZIZ(dataChannel);
            if (c946060aj6LIZIZ2 != null && (guestShowdownConfigF1 = (GuestShowdownConfig) c946060aj6LIZIZ2.LIZ()) != null) {
                E1(guestShowdownConfigF1);
            } else {
                guestShowdownConfigF1 = F1(false);
            }
            int iG1 = G1();
            GuestShowdownAnchorViewModel guestShowdownAnchorViewModel3 = (GuestShowdownAnchorViewModel) this.LLILLL;
            if (guestShowdownAnchorViewModel3 != null && (value = guestShowdownAnchorViewModel3.LLJI.getValue()) != null && (numValueOf = Integer.valueOf(value.size())) != null) {
                iIntValue = numValueOf.intValue();
            }
            GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog2 = new GuestShowdownIdleSettingsDialog(dataChannel, guestShowdownConfigF1, "playbook_entity", iG1, iIntValue, (C01IA) this.LLJJIJIIJIL.getValue(), System.currentTimeMillis(), c334801Rq);
            guestShowdownIdleSettingsDialog2.LLJZ = new C5182020e(this, 309);
            this.LLJILJIL = guestShowdownIdleSettingsDialog2;
            zA1 = A1(guestShowdownIdleSettingsDialog2, "GuestShowdownIdleSettingsDialog");
            if (zA1 && (c946060aj6LIZIZ = C01Z9.LIZIZ(this.dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6LIZIZ.LIZIZ()) != null && (function0 = c946050aj5LIZIZ.LIZ.LJ) != null) {
                function0.invoke();
            }
        }
        return zA1;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I1(X.C334801Rq r8) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget.I1(X.01Rq):boolean");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final void z1(Integer num) {
        Boolean boolValueOf;
        GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog;
        super.z1(num);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(EnumC936960aUQ.GUEST_SHOWDOWN, isRunning()));
        }
        if (num != null) {
            int iIntValue = num.intValue();
            GuestShowdownRankDialog guestShowdownRankDialog = this.LL;
            Boolean boolValueOf2 = null;
            if (guestShowdownRankDialog != null) {
                boolValueOf = Boolean.valueOf(guestShowdownRankDialog.isVisible());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                if (iIntValue == 4) {
                    GuestShowdownRankDialog guestShowdownRankDialog2 = this.LL;
                    if (guestShowdownRankDialog2 != null) {
                        guestShowdownRankDialog2.close(1);
                    }
                } else {
                    GuestShowdownRankDialog guestShowdownRankDialog3 = this.LL;
                    if (guestShowdownRankDialog3 != null) {
                        guestShowdownRankDialog3.LLLFF = iIntValue;
                        guestShowdownRankDialog3.uS();
                    }
                }
            }
            GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog2 = this.LLJILJILJ;
            if (guestShowdownOngoingSettingsDialog2 != null) {
                boolValueOf2 = Boolean.valueOf(guestShowdownOngoingSettingsDialog2.isVisible());
            }
            if (C500260Jjc.LJJJI(boolValueOf2) && iIntValue == 4 && (guestShowdownOngoingSettingsDialog = this.LLJILJILJ) != null) {
                guestShowdownOngoingSettingsDialog.close(1);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget
    public final boolean B1(C304801Gc c304801Gc, boolean z, GuestShowdownContent guestShowdownContent, C334801Rq c334801Rq) {
        if (C01ZC.LIZIZ()) {
            return I1(c334801Rq);
        }
        return super.B1(c304801Gc, z, guestShowdownContent, c334801Rq);
    }
}
