package Y;

import X.C1DY2;
import X.C1DYE;
import X.C1DYS;
import X.C201955140j;
import X.C2251071D8v;
import X.C2261031Def;
import X.C2261051Deh;
import X.C2273021Dy0;
import X.C2273031Dy1;
import X.C830690WiJ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public class ALAdapterS28S0100000_35 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
            default:
                super.onAnimationCancel(animator);
                break;
            case 7:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                break;
            case 4:
                onAnimationStart$1(this, animator);
                break;
            case 5:
            case 6:
            default:
                super.onAnimationStart(animator);
                break;
            case 7:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public ALAdapterS28S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2261051Deh) aLAdapterS28S0100000_35.l0).LIZ.LIZIZ(1);
    }

    public static final void onAnimationCancel$1(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        C1DY2 c1dy2 = ((C1DYE) aLAdapterS28S0100000_35.l0).LJ;
        if (c1dy2 != null) {
            c1dy2.LIZJ();
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishProgressCalculator", "onAnimationEnd");
        ((C2251071D8v) aLAdapterS28S0100000_35.l0).LJIIJJI = false;
    }

    public static final void onAnimationEnd$1(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishProgressCalculator", "uploadTargetAnimation onAnimationEnd");
        ((C2251071D8v) aLAdapterS28S0100000_35.l0).LJIILL = false;
    }

    public static final void onAnimationEnd$2(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        if (Intrinsics.LJFF(((C1DYS) aLAdapterS28S0100000_35.l0).LJIIIZ, animator)) {
            ((C1DYS) aLAdapterS28S0100000_35.l0).LJIIIZ = null;
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2273021Dy0) aLAdapterS28S0100000_35.l0).getClass();
        ((C2273021Dy0) aLAdapterS28S0100000_35.l0).LIZIZ();
    }

    public static final void onAnimationEnd$4(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2273031Dy1) aLAdapterS28S0100000_35.l0).getClass();
        ((C2273031Dy1) aLAdapterS28S0100000_35.l0).LIZIZ();
    }

    public static final void onAnimationEnd$5(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2261051Deh) aLAdapterS28S0100000_35.l0).LIZ.LIZIZ(0);
    }

    public static final void onAnimationEnd$6(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2261031Def) aLAdapterS28S0100000_35.l0).LJII();
    }

    public static final void onAnimationEnd$7(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        C1DY2 c1dy2 = ((C1DYE) aLAdapterS28S0100000_35.l0).LJ;
        if (c1dy2 != null) {
            c1dy2.LIZ();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2273021Dy0) aLAdapterS28S0100000_35.l0).getClass();
        ((C2273021Dy0) aLAdapterS28S0100000_35.l0).LIZJ();
    }

    public static final void onAnimationStart$1(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        ((C2273031Dy1) aLAdapterS28S0100000_35.l0).getClass();
        ((C2273031Dy1) aLAdapterS28S0100000_35.l0).LIZJ();
    }

    public static final void onAnimationStart$2(ALAdapterS28S0100000_35 aLAdapterS28S0100000_35, Animator animator) {
        C1DY2 c1dy2 = ((C1DYE) aLAdapterS28S0100000_35.l0).LJ;
        if (c1dy2 != null) {
            c1dy2.LIZIZ();
        }
    }
}
