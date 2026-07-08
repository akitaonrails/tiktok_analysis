package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common;

import X.C01EL;
import X.C01GV;
import X.C01GW;
import X.C01IG;
import X.C15B9;
import X.C19322110iZ;
import X.C20441214yg;
import X.C304801Gc;
import X.C334801Rq;
import X.C452501pT;
import X.C500260Jjc;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C920350a3d;
import X.C938160aWM;
import X.C941700ac4;
import X.InterfaceC1097170eep;
import X.InterfaceC924740aAi;
import X.InterfaceC941720ac6;
import X.InterfaceC941870acL;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.end.GuestShowdownEndDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGuestShowdownWidget<VM extends BaseGuestShowdownViewModel> extends LiveWidget implements InterfaceC941870acL {
    public GuestShowdownRankDialog LL;
    public GuestShowdownEndDialog LLILLJJLI;
    public VM LLILLL;
    public long LLILZ;
    public C01IG LLILZLL;
    public int LLILZIL = -1;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C5182020e((BaseGuestShowdownWidget) this, 42));
    public final C513601zK LLIZLLLIL = new C513601zK(this, 7);
    public final C513601zK LLJ = new C513601zK(this, 6);
    public final C513601zK LLJI = new C513601zK(this, 5);
    public final C513601zK LLJIJIL = new C513601zK(this, 4);

    public void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract String x1();

    public abstract void y1();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        C20441214yg.LJIIIZ(x1(), "onCreate");
        y1();
        VM vm = this.LLILLL;
        if (vm != null) {
            vm.onInit();
            vm.LLILLJJLI.observe(this, this.LLIZLLLIL);
            vm.LLILLL.observe(this, this.LLJ);
            vm.LLILZ.observe(this, this.LLJI);
            vm.LLILZIL.observe(this, this.LLJIJIL);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GuestShowdownShowEndDialogDirectlyEvent.class, new C5183020f(this, 43));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        C20441214yg.LJIIIZ(x1(), "onDestroy");
        C20441214yg.LIZIZ(x1(), "clearCache");
        VM vm = this.LLILLL;
        if (vm != null) {
            vm.clearCache();
        }
        this.LLILZ = 0L;
        this.LLILZIL = -1;
        VM vm2 = this.LLILLL;
        if (vm2 != null) {
            C15B9 c15b9 = vm2.LLIZ;
            if (c15b9 != null) {
                c15b9.LJI();
            }
            vm2.LLIZ = null;
        }
        C01IG c01ig = this.LLILZLL;
        if (c01ig != null) {
            C19322110iZ.LJII(c01ig);
        }
    }

    public final boolean D1(C01GV c01gv) {
        Boolean boolValueOf;
        int iIntValue;
        Integer numAQ2;
        GuestShowdownRankDialog guestShowdownRankDialog = this.LL;
        GuestShowdownContent guestShowdownContentZQ2 = null;
        if (guestShowdownRankDialog != null) {
            boolValueOf = Boolean.valueOf(guestShowdownRankDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        GuestShowdownRankDialog guestShowdownRankDialog2 = new GuestShowdownRankDialog(this.dataChannel, c01gv);
        VM vm = this.LLILLL;
        if (vm != null) {
            guestShowdownContentZQ2 = vm.zQ2();
        }
        VM vm2 = this.LLILLL;
        if (vm2 != null && (numAQ2 = vm2.AQ2()) != null) {
            iIntValue = numAQ2.intValue();
        } else {
            iIntValue = 2;
        }
        guestShowdownRankDialog2.LLLFF = iIntValue;
        guestShowdownRankDialog2.LLLF = guestShowdownContentZQ2;
        guestShowdownRankDialog2.uS();
        guestShowdownRankDialog2.LLJZ = new C5182020e((BaseGuestShowdownWidget) this, 345);
        this.LL = guestShowdownRankDialog2;
        return A1(guestShowdownRankDialog2, "GuestShowdownRankDialog");
    }

    public void z1(Integer num) {
        DataChannel dataChannel;
        int iIntValue;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            dataChannel2.LC0(PlayStatusChangeEvent.class, new C938160aWM(12, iIntValue));
        }
        if (num != null) {
            if (num.intValue() != 0 && num.intValue() != 4 && num.intValue() != 5) {
                if ((num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3) && (dataChannel = this.dataChannel) != null) {
                    dataChannel.FQ2(GuestShowdownUpdateFanTicketCountToPlayEvent.class);
                }
            } else {
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.FQ2(GuestShowdownRestoreFanTicketCountEvent.class);
                }
            }
        }
        if (num != null && num.intValue() != 5 && num.intValue() != 0) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "guest_showdown");
            }
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZ("guest_showdown");
                return;
            }
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 != null) {
            interfaceC941720ac6LIZIZ2.LJIL(C01EL.END, "guest_showdown");
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ2 != null) {
            interfaceC924740aAiLIZ2.LIZIZ("guest_showdown");
        }
        C20441214yg.LIZIZ(x1(), "clearCache");
        VM vm = this.LLILLL;
        if (vm != null) {
            vm.clearCache();
        }
        this.LLILZ = 0L;
        this.LLILZIL = -1;
    }

    public final boolean A1(BaseSheetFragment baseSheetFragment, String str) {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            fragment = interfaceC1097170eep.getFragment();
        } else {
            fragment = null;
        }
        if (fragment == null) {
            C20441214yg.LJ(x1(), "openSheetDialog, but fm is null");
            return false;
        }
        if (!fragment.isStateSaved()) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            if (childFragmentManager != null) {
                C19322110iZ.LJFF(childFragmentManager, baseSheetFragment, str, null, 0);
                return true;
            }
        } else {
            C20441214yg.LJ(x1(), "openSheetDialog, but fm.isStateSaved");
        }
        return false;
    }

    public boolean B1(C304801Gc c304801Gc, boolean z, GuestShowdownContent guestShowdownContent, C334801Rq c334801Rq) {
        Boolean boolValueOf;
        GuestShowdownContent guestShowdownContentZQ2 = guestShowdownContent;
        GuestShowdownEndDialog guestShowdownEndDialog = this.LLILLJJLI;
        if (guestShowdownEndDialog != null) {
            boolValueOf = Boolean.valueOf(guestShowdownEndDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        DataChannel dataChannel = this.dataChannel;
        if (guestShowdownContentZQ2 == null) {
            VM vm = this.LLILLL;
            if (vm != null) {
                guestShowdownContentZQ2 = vm.zQ2();
            } else {
                guestShowdownContentZQ2 = null;
            }
        }
        GuestShowdownEndDialog guestShowdownEndDialog2 = new GuestShowdownEndDialog(dataChannel, guestShowdownContentZQ2, z, c304801Gc, c334801Rq);
        guestShowdownEndDialog2.LLJZ = new C5182020e((BaseGuestShowdownWidget) this, 344);
        this.LLILLJJLI = guestShowdownEndDialog2;
        return A1(guestShowdownEndDialog2, "GuestShowdownEndDialog");
    }
}
