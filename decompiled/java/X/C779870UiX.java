package X;

import android.view.View;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C779870UiX {
    public final String LIZ;
    public EnumC779790UiP LIZIZ;
    public final /* synthetic */ C779880UiY LIZJ;

    public void LIZIZ() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LIZ(C779870UiX c779870UiX) {
        InterfaceC779960Uig interfaceC779960Uig;
        if (Intrinsics.LJFF(this, this.LIZJ.LJJIJIIJIL)) {
            C779880UiY c779880UiY = this.LIZJ;
            if (!c779880UiY.LJIIJJI.LJ && (interfaceC779960Uig = c779880UiY.LIZLLL) != null) {
                interfaceC779960Uig.LJIIIIZZ();
            }
            InterfaceC779960Uig interfaceC779960Uig2 = this.LIZJ.LIZLLL;
            if (interfaceC779960Uig2 != null) {
                interfaceC779960Uig2.LIZJ(true);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this, this.LIZJ.LJJIJIIJI)) {
            InterfaceC779960Uig interfaceC779960Uig3 = this.LIZJ.LIZLLL;
            if (interfaceC779960Uig3 != null) {
                interfaceC779960Uig3.LJIIIIZZ();
            }
            InterfaceC779960Uig interfaceC779960Uig4 = this.LIZJ.LIZLLL;
            if (interfaceC779960Uig4 == null) {
                return;
            }
            interfaceC779960Uig4.LIZJ(false);
            return;
        }
        if (!Intrinsics.LJFF(this, this.LIZJ.LJJIJIL)) {
            return;
        }
        C779880UiY c779880UiY2 = this.LIZJ;
        if (c779880UiY2.LJIIJJI.LJ) {
            return;
        }
        InterfaceC779960Uig interfaceC779960Uig5 = c779880UiY2.LIZLLL;
        if (interfaceC779960Uig5 != null) {
            interfaceC779960Uig5.LJIIIIZZ();
        }
        InterfaceC779960Uig interfaceC779960Uig6 = this.LIZJ.LIZLLL;
        if (interfaceC779960Uig6 == null) {
            return;
        }
        interfaceC779960Uig6.LIZJ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZJ(X.EnumC779790UiP r8) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779870UiX.LIZJ(X.0UiP):boolean");
    }

    public final void LIZLLL(Object obj) {
        Boolean boolValueOf;
        View view = null;
        if (obj instanceof AbstractC777950UfR) {
            C779880UiY c779880UiY = this.LIZJ;
            InterfaceC779960Uig interfaceC779960Uig = c779880UiY.LIZLLL;
            if (interfaceC779960Uig != null) {
                boolValueOf = Boolean.valueOf(interfaceC779960Uig.LJIIIZ((AbstractC777950UfR) obj, Intrinsics.LJFF(this, c779880UiY.LJJIJIIJIL)));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C779240UhW c779240UhW = this.LIZJ.LJII;
                if (c779240UhW != null) {
                    c779240UhW.LJIILLIIL(false);
                }
                this.LIZJ.LJ.getClass();
                C779880UiY c779880UiY2 = this.LIZJ;
                C780040Uio c780040Uio = c779880UiY2.LJJI;
                if (c780040Uio != null) {
                    c780040Uio.LIZLLL = false;
                }
                c779880UiY2.LJIIL(c779880UiY2.LIZ);
                C779880UiY c779880UiY3 = this.LIZJ;
                ConstraintFloatWindowLayout constraintFloatWindowLayout = c779880UiY3.LJJIFFI;
                if (constraintFloatWindowLayout != null) {
                    C779160UhO c779160UhO = c779880UiY3.LIZ.LIZ;
                    if (c779160UhO != null) {
                        view = c779160UhO.LIZLLL;
                    }
                    constraintFloatWindowLayout.LIZIZ(view, false);
                }
                C779880UiY c779880UiY4 = this.LIZJ;
                C780040Uio c780040Uio2 = c779880UiY4.LJJI;
                if (c780040Uio2 != null) {
                    c780040Uio2.LIZLLL = true;
                }
                C779530Uhz c779530Uhz = c779880UiY4.LJIIIIZZ;
                if (c779530Uhz != null) {
                    c779530Uhz.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (!(obj instanceof C778500UgK)) {
            C20441214yg.LJ("GameUiStateMachine2", C786410Ut5.j4("remind param should be TipMessage ! current is", Arrays.copyOf(new Object[]{obj}, 1)));
            return;
        }
        C778500UgK c778500UgK = (C778500UgK) obj;
        if (c778500UgK.LIZJ < 0) {
            return;
        }
        CharSequence charSequence = c778500UgK.LIZ;
        EnumC778100Ufg enumC778100Ufg = EnumC778100Ufg.values()[c778500UgK.LIZJ];
        InterfaceC779960Uig interfaceC779960Uig2 = this.LIZJ.LIZLLL;
        if (interfaceC779960Uig2 != null && interfaceC779960Uig2.LJIIJ() == 0 && enumC778100Ufg.getPriority() != 0) {
            return;
        }
        InterfaceC779960Uig interfaceC779960Uig3 = this.LIZJ.LIZLLL;
        if (interfaceC779960Uig3 != null && interfaceC779960Uig3.LJIIJ() == 1) {
            C779880UiY c779880UiY5 = this.LIZJ;
            c779880UiY5.LJIILJJIL = c779880UiY5.LJIILIIL;
        }
        C779880UiY c779880UiY6 = this.LIZJ;
        c779880UiY6.LJIILIIL = c778500UgK;
        if (enumC778100Ufg == EnumC778100Ufg.LIVE_TIP_MESSAGE_MUTING_TIP) {
            c779880UiY6.LJIILL = true;
            c779880UiY6.LJIILLIIL = charSequence;
        }
        C779240UhW c779240UhW2 = c779880UiY6.LJII;
        if (c779240UhW2 != null) {
            c779240UhW2.LJIILLIIL(false);
        }
        C779880UiY c779880UiY7 = this.LIZJ;
        InterfaceC779960Uig interfaceC779960Uig4 = c779880UiY7.LIZLLL;
        if (interfaceC779960Uig4 != null) {
            interfaceC779960Uig4.LJFF(enumC778100Ufg, charSequence, Intrinsics.LJFF(this, c779880UiY7.LJJIJIIJIL), c778500UgK.LJ);
        }
        this.LIZJ.LJ.getClass();
        C779880UiY c779880UiY8 = this.LIZJ;
        C780040Uio c780040Uio3 = c779880UiY8.LJJI;
        if (c780040Uio3 != null) {
            c780040Uio3.LIZLLL = false;
        }
        c779880UiY8.LJIIL(c779880UiY8.LIZ);
        C779880UiY c779880UiY9 = this.LIZJ;
        ConstraintFloatWindowLayout constraintFloatWindowLayout2 = c779880UiY9.LJJIFFI;
        if (constraintFloatWindowLayout2 != null) {
            C779160UhO c779160UhO2 = c779880UiY9.LIZ.LIZ;
            if (c779160UhO2 != null) {
                view = c779160UhO2.LIZLLL;
            }
            constraintFloatWindowLayout2.LIZIZ(view, false);
        }
        C779880UiY c779880UiY10 = this.LIZJ;
        C780040Uio c780040Uio4 = c779880UiY10.LJJI;
        if (c780040Uio4 != null) {
            c780040Uio4.LIZLLL = true;
        }
        C779530Uhz c779530Uhz2 = c779880UiY10.LJIIIIZZ;
        if (c779530Uhz2 != null) {
            c779530Uhz2.LIZ();
        }
        if (c778500UgK.LIZLLL != null || c778500UgK.LIZJ == EnumC778100Ufg.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP.ordinal()) {
            C779090UhH.LIZIZ("show", c778500UgK.LIZLLL);
        }
        Object obj2 = c778500UgK.LJ;
        if (obj2 instanceof C778610UgV) {
            int i = c778500UgK.LIZJ;
            if (i == EnumC778100Ufg.LIVE_TIP_GAMING_GOODY_BAG.ordinal()) {
                C155100ib.LIZJ("goody_bag", ((C778610UgV) obj2).LIZ);
                return;
            }
            if (i == EnumC778100Ufg.LIVE_TIP_GAMING_TREASURE.ordinal()) {
                C155100ib.LIZJ("treasure_box", ((C778610UgV) obj2).LIZ);
            } else if (i == EnumC778100Ufg.LIVE_TIP_GAMING_SUB_GOAL.ordinal()) {
                C155100ib.LIZJ("sub_goal", ((C778610UgV) obj2).LIZ);
            } else {
                if (i != EnumC778100Ufg.LIVE_TIP_GAMING_LIVE_GOAL.ordinal()) {
                    return;
                }
                C155100ib.LIZJ("live_goal", ((C778610UgV) obj2).LIZ);
            }
        }
    }

    public C779870UiX(C779880UiY c779880UiY, String str) {
        this.LIZJ = c779880UiY;
        this.LIZ = str;
    }
}
