package X;

import Y.ACListenerS150S0100000_15;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEnableFromCreateChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935380aRs implements InterfaceC1102810env {
    public DataChannel LL;

    @Override // X.InterfaceC1102810env
    public final void J() {
    }

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIIZ("click", "room_funkit_icon");
        if (C758560TpG.LIZ()) {
            RedDotExtensionKt.LIZ(C0UX6.RED_DOT_PLAY_AND_TOOL_ENTRANCE);
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            C927840aFi c927840aFi = C927840aFi.LIZ;
            AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(497);
            c927840aFi.getClass();
            C927840aFi.LIZIZ(dataChannel, "room_funkit_icon", aFwS203S0000000_15);
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        DataChannel dataChannel;
        View view;
        this.LL = c1099960ejK.LIZJ;
        if (C758560TpG.LIZ()) {
            RedDotExtensionKt.LJI(c945840aik.findViewById(R.id.y7r), null, null, C0UX6.RED_DOT_PLAY_AND_TOOL_ENTRANCE, null);
        }
        if (C924210a9r.LIZ() && C924220a9s.LIZJ()) {
            RedDotExtensionKt.LJI(c945840aik.findViewById(R.id.y7r), c1099960ejK.LIZIZ, null, C0UX6.GUEST_COUNT_DOWN_ENTRANCE_DIRECT, null);
        }
        if (C942160aco.LIZ() && (dataChannel = this.LL) != null && Intrinsics.LJFF(dataChannel.gg0(MultiLetsDanceEnableFromCreateChannel.class), Boolean.TRUE) && !C917810ZzX.LJII() && MultiGuestSocialGameLetsDanceSetting.config().bubbleSwitch && !InterfaceC934710aQn.Mc.LIZIZ().booleanValue() && (view = c945840aik.LIZIZ) != null) {
            C785230UrB c785230UrB = new C785230UrB(view);
            c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785230UrB.LJIIIZ = true;
            c785230UrB.LJJIIJ = true;
            c785230UrB.LJIJJ = C20642515q3.LJI(2131854430);
            C1119810fFL c1119810fFLLJIIIIZZ = C011Z.LIZ.LJIIIIZZ();
            if (c785230UrB.LIZ != null && c1119810fFLLJIIIIZZ != null) {
                c785230UrB.LJIJI = new AbstractC1119600fF0() { // from class: X.0fF2
                    public final int LIZIZ = R.drawable.el0;

                    @Override // X.AbstractC1119600fF0
                    public final void LIZJ() {
                    }

                    @Override // X.AbstractC1119600fF0
                    public final EnumC1119730fFD LIZ() {
                        return EnumC1119730fFD.DRAWABLE;
                    }

                    @Override // X.AbstractC1119600fF0
                    public final void LIZIZ(C1119650fF5 c1119650fF5) {
                        Drawable drawableLJIIJ = C497740JfY.LJIIJ(this.LIZIZ);
                        if (drawableLJIIJ != null) {
                            c1119650fF5.LIZ(drawableLJIIJ);
                        } else {
                            new Throwable();
                            c1119650fF5.LIZIZ();
                        }
                    }
                };
            }
            c785230UrB.LJIILL = new C987210bnT(this, 10);
            c785230UrB.LJ = new ACListenerS150S0100000_15(this, 310);
            C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.MULTI_GUEST_LETS_DANCE_BUBBLE, this.LL);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIIZ("show", "room_funkit_icon");
    }
}
