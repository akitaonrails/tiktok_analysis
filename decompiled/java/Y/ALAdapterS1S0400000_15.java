package Y;

import X.C0IPN;
import X.C1126540fQC;
import X.C1143920fsE;
import X.C12ES;
import X.C1324720kZq;
import X.C934320aQA;
import X.C934330aQB;
import X.C934600aQc;
import X.C934620aQe;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class ALAdapterS1S0400000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0400000_15 aLAdapterS1S0400000_15, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(0, (C1126540fQC) aLAdapterS1S0400000_15.l0);
        C12ES.LJIILL(0, (C1324720kZq) aLAdapterS1S0400000_15.l1);
        ((C934330aQB) aLAdapterS1S0400000_15.l2).LIZ(false);
        C934330aQB c934330aQB = (C934330aQB) aLAdapterS1S0400000_15.l2;
        C1126540fQC c1126540fQC = (C1126540fQC) aLAdapterS1S0400000_15.l0;
        C934600aQc c934600aQc = (C934600aQc) aLAdapterS1S0400000_15.l3;
        c934330aQB.getClass();
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1126540fQC;
        c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
        c1143920fsE.LIZJ = "interact_request_enhanced.webp";
        c1143920fsE.LJFF = true;
        c1143920fsE.LJI = 2;
        c1143920fsE.LJIIJJI = true;
        c1143920fsE.LJ = c934600aQc;
        c1143920fsE.LIZLLL();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0400000_15 aLAdapterS1S0400000_15, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(0, (C1126540fQC) aLAdapterS1S0400000_15.l0);
        C12ES.LJIILL(0, (C1324720kZq) aLAdapterS1S0400000_15.l1);
        ((C934320aQA) aLAdapterS1S0400000_15.l2).LIZJ(false);
        C934320aQA c934320aQA = (C934320aQA) aLAdapterS1S0400000_15.l2;
        C1126540fQC c1126540fQC = (C1126540fQC) aLAdapterS1S0400000_15.l0;
        C934620aQe c934620aQe = (C934620aQe) aLAdapterS1S0400000_15.l3;
        c934320aQA.getClass();
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1126540fQC;
        c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
        c1143920fsE.LIZJ = "interact_request_enhanced.webp";
        c1143920fsE.LJFF = true;
        c1143920fsE.LJI = 2;
        c1143920fsE.LJIIJJI = true;
        c1143920fsE.LJ = c934620aQe;
        c1143920fsE.LIZLLL();
    }

    public ALAdapterS1S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
