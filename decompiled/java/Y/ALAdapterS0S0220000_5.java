package Y;

import X.C388170FJv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0220000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationEnd(animator);
        } else {
            onAnimationEnd$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0220000_5 aLAdapterS0S0220000_5, Animator animator) {
        C388170FJv.LJIIJJI((C388170FJv) aLAdapterS0S0220000_5.l0, aLAdapterS0S0220000_5.z2, aLAdapterS0S0220000_5.z3, (Function0) aLAdapterS0S0220000_5.l1);
        ((C388170FJv) aLAdapterS0S0220000_5.l0).getSoftKeyBoardListener().LIZIZ((C388170FJv) aLAdapterS0S0220000_5.l0);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0220000_5 aLAdapterS0S0220000_5, Animator animator) {
        C388170FJv.LJIIJJI((C388170FJv) aLAdapterS0S0220000_5.l0, aLAdapterS0S0220000_5.z2, aLAdapterS0S0220000_5.z3, (Function0) aLAdapterS0S0220000_5.l1);
        ((C388170FJv) aLAdapterS0S0220000_5.l0).getSoftKeyBoardListener().LIZIZ((C388170FJv) aLAdapterS0S0220000_5.l0);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0220000_5 aLAdapterS0S0220000_5, Animator animator) {
        C388170FJv.LJIIJJI((C388170FJv) aLAdapterS0S0220000_5.l0, aLAdapterS0S0220000_5.z2, aLAdapterS0S0220000_5.z3, (Function0) aLAdapterS0S0220000_5.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0220000_5(C388170FJv c388170FJv, C388170FJv c388170FJv2, boolean z, boolean z2, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = c388170FJv;
        this.z2 = c388170FJv2;
        this.z3 = z;
        this.l1 = z2;
    }
}
