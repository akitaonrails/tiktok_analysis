package Y;

import X.C1C7U;
import X.C20361214lm;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916800Zxu;
import X.C921180a4y;
import X.C923330a8R;
import X.C928340aGW;
import X.C928360aGY;
import X.C928400aGc;
import X.C928450aGh;
import X.C936720aU2;
import X.C937980aW4;
import X.C938000aW6;
import X.C939750aYv;
import X.C946210ajL;
import X.C952540atY;
import X.C974690bTH;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.EnumC918990a1R;
import X.InterfaceC1103130eoR;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import X.InterfaceC943880afa;
import X.RunnableC928390aGb;
import Y.ACListenerS150S0100000_15;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestBubbleShowEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS16S0210000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0aGb, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0aGb, java.lang.Runnable] */
    public final void LIZ$0() {
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.MULTIGUEST;
        if (!enumC1102750enp.isShowing((DataChannel) this.l0) && !EnumC1102740eno.MULTIGUEST.isShowing((DataChannel) this.l0)) {
            final View view = EnumC1102750enp.SHARE.getView((DataChannel) this.l0);
            if (view == null) {
                view = EnumC1102740eno.SHARE.getView((DataChannel) this.l0);
            }
            if (!C500260Jjc.LJJJJIZL(view) || view == null) {
                return;
            }
            final C928360aGY c928360aGY = (C928360aGY) this.l1;
            final boolean z = this.z2;
            final int i = 2;
            final String str = "room_share_icon";
            final boolean z2 = true;
            final AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(c928360aGY, view, 3);
            RunnableC928390aGb runnableC928390aGb = C928340aGW.LLILZLL;
            if (runnableC928390aGb != null) {
                C473410IhP.LJ(runnableC928390aGb);
                C928340aGW.LLILZLL = null;
            }
            ?? r4 = new Runnable() { // from class: X.0aGb
                public final void LIZ() {
                    Object c098200Yq;
                    Long l;
                    final C928360aGY c928360aGY2 = c928360aGY;
                    View view2 = view;
                    boolean z3 = z2;
                    Function0<Unit> function0 = awS416S0200000_15;
                    final int i2 = i;
                    final boolean z4 = z;
                    final String str2 = str;
                    try {
                        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "showInviteToolTip run tooltipRunnable");
                        String strValueOf = String.valueOf(c928360aGY2.LIZ);
                        String strValueOf2 = String.valueOf(c928360aGY2.LIZIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strValueOf);
                        sbLIZ.append('_');
                        sbLIZ.append(strValueOf2);
                        l = C914730ZuZ.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (l != null && System.currentTimeMillis() - l.longValue() <= 120000) {
                        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "Skip the bubble display because the push message has been displayed within the last 120 seconds");
                        Set<C928440aGg> set = C928420aGe.LIZ;
                        C928420aGe.LIZJ(c928360aGY2.LIZ, c928360aGY2.LIZLLL);
                        return;
                    }
                    if (C928340aGW.LLILLJJLI != 0) {
                        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                        C1113800f5e.LIZJ(EnumC1120860fH2.MULTI_GUEST_INVITE_SENSE_BUBBLE);
                    }
                    C785220UrA c785220UrA = new C785220UrA(view2);
                    c785220UrA.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785220UrA.LJIIIZ = true;
                    c785220UrA.LJJIIJ = true;
                    c785220UrA.LJJIII = z3;
                    c785220UrA.LJIJJ = C497740JfY.LJIJI(2131854547);
                    c785220UrA.LJFF(Collections.singletonList(c928360aGY2.LIZJ));
                    c785220UrA.LJ = new ACListenerS150S0100000_15(function0, 5);
                    c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0aGZ
                        @Override // X.InterfaceC254600ye
                        public final void onShow() {
                            DataChannel dataChannel;
                            C928340aGW.LLILLJJLI = i2;
                            Set<C928440aGg> set2 = C928420aGe.LIZ;
                            C928360aGY c928360aGY3 = c928360aGY2;
                            C928420aGe.LIZJ(c928360aGY3.LIZ, c928360aGY3.LIZLLL);
                            WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                            if (weakReference != null && (dataChannel = weakReference.get()) != null) {
                                dataChannel.zW(MultiGuestBubbleShowEvent.class, "invite_receive");
                            }
                            C928340aGW.LIZIZ("show", c928360aGY2, z4, str2);
                        }
                    };
                    c785220UrA.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0aGa
                        @Override // X.InterfaceC254900yh
                        public final void x1(int i3) {
                            DataChannel dataChannel;
                            C928340aGW.LLILLJJLI = 0;
                            WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                            if (weakReference != null && (dataChannel = weakReference.get()) != null) {
                                dataChannel.zW(MultiGuestBubbleShowEvent.class, null);
                            }
                            if (i3 == 7) {
                                C928340aGW.LIZIZ("click", c928360aGY2, z4, str2);
                            }
                        }
                    };
                    C1119590fEz c1119590fEz = new C1119590fEz(c785220UrA);
                    C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
                    EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.MULTI_GUEST_INVITE_SENSE_BUBBLE;
                    WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                    c1113800f5e2.LJ(c1119590fEz, enumC1120860fH2, weakReference != null ? weakReference.get() : null);
                    C928340aGW.LLILZLL = null;
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("showInviteToopTip Exception: ");
                        sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                        C20441214yg.LJ("MultiGuestEnhanceInviteSenseHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestEnhanceInviteSenseHelper@8162.showInviteToolTip$tooltipRunnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestEnhanceInviteSenseHelper@8162.showInviteToolTip$tooltipRunnable$1");
                }
            };
            C928340aGW.LLILZLL = r4;
            C473410IhP.LIZJ(r4, Mp4ScreenVideoLoadTimeout.CONTROL);
            return;
        }
        final View view2 = enumC1102750enp.getView((DataChannel) this.l0);
        if (view2 == null) {
            view2 = EnumC1102740eno.MULTIGUEST.getView((DataChannel) this.l0);
        }
        if (view2 != null) {
            final C928360aGY c928360aGY2 = (C928360aGY) this.l1;
            final boolean z3 = this.z2;
            DataChannel dataChannel = (DataChannel) this.l0;
            final int i2 = 1;
            final String str2 = "room_mg_icon";
            C923330a8R c923330a8R = C923330a8R.LIZ;
            final boolean zLJFF = C923330a8R.LJFF();
            final AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(c928360aGY2, view2, dataChannel, 0);
            RunnableC928390aGb runnableC928390aGb2 = C928340aGW.LLILZLL;
            if (runnableC928390aGb2 != null) {
                C473410IhP.LJ(runnableC928390aGb2);
                C928340aGW.LLILZLL = null;
            }
            ?? r42 = new Runnable() { // from class: X.0aGb
                public final void LIZ() {
                    Object c098200Yq;
                    Long l;
                    final C928360aGY c928360aGY22 = c928360aGY2;
                    View view22 = view2;
                    boolean z32 = zLJFF;
                    Function0<Unit> function0 = awS259S0300000_15;
                    final int i22 = i2;
                    final boolean z4 = z3;
                    final String str22 = str2;
                    try {
                        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "showInviteToolTip run tooltipRunnable");
                        String strValueOf = String.valueOf(c928360aGY22.LIZ);
                        String strValueOf2 = String.valueOf(c928360aGY22.LIZIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strValueOf);
                        sbLIZ.append('_');
                        sbLIZ.append(strValueOf2);
                        l = C914730ZuZ.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (l != null && System.currentTimeMillis() - l.longValue() <= 120000) {
                        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "Skip the bubble display because the push message has been displayed within the last 120 seconds");
                        Set<C928440aGg> set = C928420aGe.LIZ;
                        C928420aGe.LIZJ(c928360aGY22.LIZ, c928360aGY22.LIZLLL);
                        return;
                    }
                    if (C928340aGW.LLILLJJLI != 0) {
                        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                        C1113800f5e.LIZJ(EnumC1120860fH2.MULTI_GUEST_INVITE_SENSE_BUBBLE);
                    }
                    C785220UrA c785220UrA = new C785220UrA(view22);
                    c785220UrA.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785220UrA.LJIIIZ = true;
                    c785220UrA.LJJIIJ = true;
                    c785220UrA.LJJIII = z32;
                    c785220UrA.LJIJJ = C497740JfY.LJIJI(2131854547);
                    c785220UrA.LJFF(Collections.singletonList(c928360aGY22.LIZJ));
                    c785220UrA.LJ = new ACListenerS150S0100000_15(function0, 5);
                    c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0aGZ
                        @Override // X.InterfaceC254600ye
                        public final void onShow() {
                            DataChannel dataChannel2;
                            C928340aGW.LLILLJJLI = i22;
                            Set<C928440aGg> set2 = C928420aGe.LIZ;
                            C928360aGY c928360aGY3 = c928360aGY22;
                            C928420aGe.LIZJ(c928360aGY3.LIZ, c928360aGY3.LIZLLL);
                            WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                            if (weakReference != null && (dataChannel2 = weakReference.get()) != null) {
                                dataChannel2.zW(MultiGuestBubbleShowEvent.class, "invite_receive");
                            }
                            C928340aGW.LIZIZ("show", c928360aGY22, z4, str22);
                        }
                    };
                    c785220UrA.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0aGa
                        @Override // X.InterfaceC254900yh
                        public final void x1(int i3) {
                            DataChannel dataChannel2;
                            C928340aGW.LLILLJJLI = 0;
                            WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                            if (weakReference != null && (dataChannel2 = weakReference.get()) != null) {
                                dataChannel2.zW(MultiGuestBubbleShowEvent.class, null);
                            }
                            if (i3 == 7) {
                                C928340aGW.LIZIZ("click", c928360aGY22, z4, str22);
                            }
                        }
                    };
                    C1119590fEz c1119590fEz = new C1119590fEz(c785220UrA);
                    C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
                    EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.MULTI_GUEST_INVITE_SENSE_BUBBLE;
                    WeakReference<DataChannel> weakReference = C928340aGW.LLILLL;
                    c1113800f5e2.LJ(c1119590fEz, enumC1120860fH2, weakReference != null ? weakReference.get() : null);
                    C928340aGW.LLILZLL = null;
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("showInviteToopTip Exception: ");
                        sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                        C20441214yg.LJ("MultiGuestEnhanceInviteSenseHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestEnhanceInviteSenseHelper@8162.showInviteToolTip$tooltipRunnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestEnhanceInviteSenseHelper@8162.showInviteToolTip$tooltipRunnable$1");
                }
            };
            C928340aGW.LLILZLL = r42;
            C473410IhP.LIZJ(r42, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }

    public final void LIZ$1() {
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.MULTIGUEST;
        if (!enumC1102750enp.isShowing((DataChannel) this.l0) && !EnumC1102740eno.MULTIGUEST.isShowing((DataChannel) this.l0)) {
            View view = EnumC1102750enp.SHARE.getView((DataChannel) this.l0);
            if (view == null) {
                view = EnumC1102740eno.SHARE.getView((DataChannel) this.l0);
            }
            if (!C500260Jjc.LJJJJIZL(view) || view == null) {
                return;
            }
            C928450aGh c928450aGh = (C928450aGh) this.l1;
            C928400aGc.LJI(c928450aGh, 2, "room_share_icon", this.z2, view, true, new AwS416S0200000_15(c928450aGh, view, 5));
            return;
        }
        View view2 = enumC1102750enp.getView((DataChannel) this.l0);
        if (view2 == null) {
            view2 = EnumC1102740eno.MULTIGUEST.getView((DataChannel) this.l0);
        }
        if (view2 != null) {
            C928450aGh c928450aGh2 = (C928450aGh) this.l1;
            boolean z = this.z2;
            DataChannel dataChannel = (DataChannel) this.l0;
            C923330a8R c923330a8R = C923330a8R.LIZ;
            C928400aGc.LJI(c928450aGh2, 1, "room_mg_icon", z, view2, C923330a8R.LJFF(), new AwS259S0300000_15(c928450aGh2, view2, dataChannel, 1));
        }
    }

    public final void LIZ$2() {
        ((Runnable) this.l0).run();
        if (((InterfaceC1103130eoR) this.l1).getVisibility() == 0) {
            if (this.z2) {
                C786410Ut5.Pd(ObjectAnimator.ofFloat(((InterfaceC1103130eoR) this.l1).LJ(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L));
                return;
            }
            View viewLJ = ((InterfaceC1103130eoR) this.l1).LJ();
            if (viewLJ != null) {
                C786410Ut5.T4(viewLJ, 1.0f);
            }
        }
    }

    public final void LIZ$3() {
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        float cornerRadius;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        ArrayList arrayList = new ArrayList();
        float fLJIIIIZZ = 0.0f;
        if (!this.z2) {
            InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ2 = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
            String layoutBusinessType = null;
            if (interfaceC937900aVwLJIIIIZZ2 != null && (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLJIIIIZZ2.LJJJJZ()) != null) {
                layoutBusinessType = interfaceC937820aVoLJJJJZ2.getLayoutBusinessType();
            }
            if (!(Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT.getBusinessType()) || Intrinsics.LJFF(layoutBusinessType, EnumC918990a1R.FLOAT_FIX.getBusinessType())) || (interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ())) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
                cornerRadius = 0.0f;
            } else {
                WindowMaskAssem windowMaskAssem = (WindowMaskAssem) this.l1;
                cornerRadius = 0.0f;
                for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                    if (!interfaceC937840aVq.LIZJ() && interfaceC937840aVq.LJJIIJ().getChildCount() != 0) {
                        if (C936720aU2.LIZIZ() && C500260Jjc.LJJIIZ(interfaceC937840aVq.LJ())) {
                            Rect rectLJFF = interfaceC937840aVq.LJFF();
                            int i = C939750aYv.LLILZLL;
                            int iLIZ = C938000aW6.LIZ();
                            windowMaskAssem.getClass();
                            arrayList.add(new Rect(rectLJFF.left - iLIZ, rectLJFF.top - iLIZ, rectLJFF.right + iLIZ, rectLJFF.bottom + iLIZ));
                        } else {
                            arrayList.add(interfaceC937840aVq.LJFF());
                        }
                        if (C936720aU2.LIZIZ() && cornerRadius == 0.0f) {
                            cornerRadius = interfaceC937840aVq.getCornerRadius();
                        }
                    }
                }
            }
            if (C936720aU2.LIZIZ()) {
                fLJIIIIZZ = cornerRadius;
            } else {
                Float f = (Float) this.l0;
                if (f != null) {
                    fLJIIIIZZ = f.floatValue();
                } else {
                    C937980aW4 c937980aW4Zp = ((WindowMaskAssem) this.l1).zp();
                    if (c937980aW4Zp.LLILZIL && !LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.isV0(c937980aW4Zp.LL) && !C916800Zxu.LJFF()) {
                        fLJIIIIZZ = c937980aW4Zp.LJIIIIZZ();
                    }
                }
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal != null) {
            dataChannelGlobal.HQ2(LivePublicScreenClipChannel.class, new C946210ajL(arrayList, fLJIIIIZZ));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendclipevent => ");
        sbLIZ.append(arrayList);
        sbLIZ.append(" , size = ");
        sbLIZ.append(arrayList.size());
        C20441214yg.LIZIZ("maskhollow", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$0(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestEnhanceInviteSenseHelper@8162.postNextShow$1");
        try {
            aRunnableS16S0210000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestEnhanceInviteSenseHelper@8162.postNextShow$1");
    }

    public static final void run$1(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestSuspendJoinedHelper@aee3.postNextShow$1");
        try {
            aRunnableS16S0210000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestSuspendJoinedHelper@aee3.postNextShow$1");
    }

    public static final void run$2(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aRunnableS16S0210000_15.l0;
        boolean z = aRunnableS16S0210000_15.z2;
        C952540atY c952540atY = (C952540atY) aRunnableS16S0210000_15.l1;
        linkControlWidget.getClass();
        C1C7U.LIZ("LinkControlWidget@1079.loadLinkCrossWidget$1L");
        InterfaceC943880afa interfaceC943880afa = linkControlWidget.LLJILLL;
        if (interfaceC943880afa != null && linkControlWidget.isViewValid()) {
            linkControlWidget.LLIZ = (CoHostLiveWidget) interfaceC943880afa.LIZJ(6, z, c952540atY);
            if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                CoHostLiveWidget coHostLiveWidget = linkControlWidget.LLIZ;
                if ((coHostLiveWidget instanceof MultiCoHostWidget) && linkControlWidget.LLJILJILJ) {
                    ((MultiCoHostWidget) coHostLiveWidget).F1(linkControlWidget.LLJ);
                }
            }
        }
        C1C7U.LIZIZ("LinkControlWidget@1079.loadLinkCrossWidget$1L");
    }

    public static final void run$3(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("LinkMicAnimationManager@e696.enter$enterRunnable$1");
        try {
            aRunnableS16S0210000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LinkMicAnimationManager@e696.enter$enterRunnable$1");
    }

    public static final void run$4(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("NoticeboardEntity@cd1e.noticeboardDialogCallback$1$onDialogDismiss$1$1");
        try {
            NoticeboardEntity noticeboardEntity = (NoticeboardEntity) aRunnableS16S0210000_15.l0;
            PlayEntityUtilKt.LJ(noticeboardEntity, 2, (C20361214lm) aRunnableS16S0210000_15.l1, noticeboardEntity.LLJJL);
            if (aRunnableS16S0210000_15.z2) {
                PlayEntityUtilKt.LIZLLL((NoticeboardEntity) aRunnableS16S0210000_15.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NoticeboardEntity@cd1e.noticeboardDialogCallback$1$onDialogDismiss$1$1");
    }

    public static final void run$5(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchMessageManager@80ed.filterOutArmiesMessage$1");
        try {
            ((C974690bTH) aRunnableS16S0210000_15.l0).LIZ((LinkMicBattleArmiesMessage) aRunnableS16S0210000_15.l1, aRunnableS16S0210000_15.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchMessageManager@80ed.filterOutArmiesMessage$1");
    }

    public static final void run$6(ARunnableS16S0210000_15 aRunnableS16S0210000_15) {
        boolean zLIZ;
        C1C7U.LIZ("WindowMaskAssem@cbd6.sendClipEvent$1");
        try {
            aRunnableS16S0210000_15.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WindowMaskAssem@cbd6.sendClipEvent$1");
    }

    public ARunnableS16S0210000_15(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }

    public ARunnableS16S0210000_15(DataChannel dataChannel, Room room, C928450aGh c928450aGh, boolean z, int i) {
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = c928450aGh;
        this.z2 = z;
    }
}
