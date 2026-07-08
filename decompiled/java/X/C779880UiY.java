package X;

import Y.AAListenerS323S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779880UiY implements InterfaceC779250UhX {
    public final C778030UfZ LIZ;
    public final C778030UfZ LIZIZ;
    public final C779330Uhf LIZJ;
    public final InterfaceC779960Uig LIZLLL;
    public final C778030UfZ LJ;
    public final C779260UhY LJFF;
    public final InterfaceC777000Udu LJI;
    public final C779240UhW LJII;
    public final C779530Uhz LJIIIIZZ;
    public final int LJIIIZ;
    public final BPEAHandler LJIIJ;
    public final C779970Uih LJIIJJI;
    public final List<InterfaceC780000Uik> LJIIL;
    public C778500UgK LJIILIIL;
    public C778500UgK LJIILJJIL;
    public boolean LJIILL;
    public CharSequence LJIILLIIL;
    public final C777080Ue2 LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public C779870UiX LJIL;
    public C780030Uin LJJ;
    public C780040Uio LJJI;
    public ConstraintFloatWindowLayout LJJIFFI;
    public final List<C779160UhO> LJJII;
    public final C779160UhO LJJIII;
    public final C779160UhO LJJIIJ;
    public final C779160UhO LJJIIJZLJL;
    public final C779930Uid LJJIIZ;
    public final C779940Uie LJJIIZI;
    public final C779950Uif LJJIJ;
    public final C779890UiZ LJJIJIIJI;
    public final C779900Uia LJJIJIIJIL;
    public final C779910Uib LJJIJIL;
    public final C779920Uic LJJIJL;
    public boolean LJJIJLIJ;

    @Override // X.InterfaceC779250UhX
    public final void LIZJ() {
    }

    public final boolean LJIIJJI() {
        return C1697810uHb.LJIIJJI(this.LJJIJIIJIL, this.LJJIJIIJI, this.LJJIJIL, this.LJJIJL).contains(this.LJIL);
    }

    @Override // X.InterfaceC779250UhX
    public final void LIZ() {
        InterfaceC777000Udu interfaceC777000Udu = this.LJI;
        if (interfaceC777000Udu != null) {
            interfaceC777000Udu.LIZ();
        }
    }

    @Override // X.InterfaceC779250UhX
    public final void LIZIZ() {
        InterfaceC777000Udu interfaceC777000Udu = this.LJI;
        if (interfaceC777000Udu != null) {
            interfaceC777000Udu.LIZIZ();
        }
    }

    @Override // X.InterfaceC779250UhX
    public final void LIZLLL() {
        LJIIL(this.LJ);
        ConstraintFloatWindowLayout constraintFloatWindowLayout = this.LJJIFFI;
        if (constraintFloatWindowLayout != null) {
            C779160UhO c779160UhO = this.LJ.LIZ;
            constraintFloatWindowLayout.LIZIZ(c779160UhO != null ? c779160UhO.LIZLLL : null, false);
        }
    }

    @Override // X.InterfaceC779250UhX
    public final boolean LJ() {
        InterfaceC779960Uig interfaceC779960Uig = this.LIZLLL;
        if (interfaceC779960Uig != null) {
            return interfaceC779960Uig.LJJII();
        }
        return false;
    }

    @Override // X.InterfaceC779250UhX
    public final boolean LJFF() {
        return Intrinsics.LJFF(this.LJIL, this.LJJIJIIJIL);
    }

    public final void LJII() {
        int i;
        int i2;
        C780040Uio c780040Uio = this.LJJI;
        if (c780040Uio != null) {
            int iIntValue = Integer.valueOf(c780040Uio.LJ).intValue();
            C779330Uhf c779330Uhf = this.LIZJ;
            if (c779330Uhf != null) {
                c779330Uhf.LJII = iIntValue;
                int i3 = c779330Uhf.LJI;
                if (iIntValue == 1) {
                    i = -i3;
                    View view = c779330Uhf.LIZLLL;
                    if (view != null) {
                        C786410Ut5.Ib(view, 0.0f);
                    }
                    i2 = 0;
                } else {
                    int iLIZIZ = C779350Uhh.LIZIZ();
                    i = iLIZIZ + i3;
                    i2 = iLIZIZ - i3;
                    View view2 = c779330Uhf.LIZLLL;
                    if (view2 != null) {
                        C786410Ut5.Ib(view2, 180.0f);
                    }
                }
                c779330Uhf.LJIILLIIL(i, i2, true);
            }
            LJIIL(this.LIZ);
            ConstraintFloatWindowLayout constraintFloatWindowLayout = this.LJJIFFI;
            if (constraintFloatWindowLayout != null) {
                C779160UhO c779160UhO = this.LIZ.LIZ;
                constraintFloatWindowLayout.LIZIZ(c779160UhO != null ? c779160UhO.LIZLLL : null, false);
            }
        }
    }

    public final AbstractC777950UfR LJIIIIZZ() {
        InterfaceC779960Uig interfaceC779960Uig = this.LIZLLL;
        if (interfaceC779960Uig != null) {
            return interfaceC779960Uig.LJII();
        }
        return null;
    }

    public final EnumC778100Ufg LJIIIZ() {
        InterfaceC779960Uig interfaceC779960Uig = this.LIZLLL;
        if (interfaceC779960Uig == null || !interfaceC779960Uig.LJJII()) {
            return EnumC778100Ufg.LIVE_TIP_UNKNOWN;
        }
        InterfaceC779960Uig interfaceC779960Uig2 = this.LIZLLL;
        if (interfaceC779960Uig2 != null) {
            return interfaceC779960Uig2.LIZLLL();
        }
        return null;
    }

    public final void LJIIJ() {
        C779160UhO c779160UhO = this.LJ.LIZ;
        if (c779160UhO != null) {
            c779160UhO.LJIILIIL(this.LJIJ, this.LJIJI);
        }
        LJIIL(this.LJ);
        ConstraintFloatWindowLayout constraintFloatWindowLayout = this.LJJIFFI;
        if (constraintFloatWindowLayout != null) {
            C779160UhO c779160UhO2 = this.LJ.LIZ;
            constraintFloatWindowLayout.LIZIZ(c779160UhO2 != null ? c779160UhO2.LIZLLL : null, false);
        }
    }

    public final void LJIILL() {
        View viewLIZIZ = this.LIZIZ.LIZIZ();
        if (viewLIZIZ instanceof AbstractC776930Udn) {
            AbstractC776930Udn abstractC776930Udn = (AbstractC776930Udn) viewLIZIZ;
            if (abstractC776930Udn.getMeasuredWidth() > 0) {
                abstractC776930Udn.LJIILLIIL(this.LJIIIZ + this.LIZ.LIZIZ().getMeasuredWidth());
            }
        }
    }

    @Override // X.InterfaceC779250UhX
    public final void LJI(EnumC779790UiP enumC779790UiP) {
        if (Intrinsics.LJFF(this.LJIL, this.LJJIJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stateMachine is destroy, cmd=");
            sbLIZ.append(enumC779790UiP);
            C20441214yg.LJ("GameUiStateMachine2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!this.LJIL.LIZJ(enumC779790UiP)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("not handleCommand, state=");
            sbLIZ2.append(this.LJIL);
            sbLIZ2.append(", cmd=");
            sbLIZ2.append(enumC779790UiP);
            C20441214yg.LJ("GameUiStateMachine2", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJIIL(C778030UfZ c778030UfZ) {
        for (C779160UhO c779160UhO : this.LJJII) {
            c779160UhO.LJFF(c778030UfZ.LIZ.getResId(), this.LJIIJJI.LIZIZ, c779160UhO.LIZLLL);
        }
    }

    public static void LJIILIIL(C779880UiY c779880UiY, C779870UiX c779870UiX) {
        c779880UiY.getClass();
        C786410Ut5.LJJZZIII(c779880UiY.LJIIJ, new ARunnableS112S0100000_12(new AwS256S0300000_12(c779870UiX, (EnumC779790UiP) null, c779880UiY, 11), 427));
    }

    public static void LJIILJJIL(C778030UfZ c778030UfZ, int i, int i2, Function0 function0) {
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(200L).start();
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(c778030UfZ, 61));
        valueAnimatorOfInt.addListener(new AAListenerS323S0100000_12(function0, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0Uid] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0Uie] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0Uif] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.0Uia] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Uib] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0Uic] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C779880UiY(X.C778030UfZ r5, X.C778030UfZ r6, X.C779330Uhf r7, X.InterfaceC779960Uig r8, X.C778030UfZ r9, X.C779260UhY r10, X.InterfaceC777000Udu r11, X.C779240UhW r12, X.C779530Uhz r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779880UiY.<init>(X.0UfZ, X.0UfZ, X.0Uhf, X.0Uig, X.0UfZ, X.0UhY, X.0Udu, X.0UhW, X.0Uhz):void");
    }
}
