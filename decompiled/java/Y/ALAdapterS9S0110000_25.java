package Y;

import X.C1659140tHE;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.tux.input.TuxTextView;
import iyl.i3;

/* JADX INFO: loaded from: classes26.dex */
public class ALAdapterS9S0110000_25 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS9S0110000_25 aLAdapterS9S0110000_25, Animator animator) {
        float f;
        super.onAnimationCancel(animator);
        if (!aLAdapterS9S0110000_25.z1) {
            C786410Ut5.LLLLZLL(((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ(), 8);
        }
        TuxTextView tuxTextViewLJJ = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ();
        i3 i3VarLJIILLIIL = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJIILLIIL();
        if (i3VarLJIILLIIL != null && i3VarLJIILLIIL.LLIZLLLIL) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.B5(tuxTextViewLJJ, f);
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0110000_25 aLAdapterS9S0110000_25, Animator animator) {
        int i;
        super.onAnimationEnd(animator);
        TuxTextView tuxTextViewLJJ = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ();
        if (aLAdapterS9S0110000_25.z1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextViewLJJ, i);
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0110000_25 aLAdapterS9S0110000_25, Animator animator) {
        int i;
        float f;
        super.onAnimationEnd(animator);
        TuxTextView tuxTextViewLJJ = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ();
        if (aLAdapterS9S0110000_25.z1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextViewLJJ, i);
        TuxTextView tuxTextViewLJJ2 = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ();
        i3 i3VarLJIILLIIL = ((C1659140tHE) aLAdapterS9S0110000_25.l0).LJIILLIIL();
        if (i3VarLJIILLIIL != null && i3VarLJIILLIIL.LLIZLLLIL) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.B5(tuxTextViewLJJ2, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$2(Y.ALAdapterS9S0110000_25 r9, android.animation.Animator r10) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS9S0110000_25.onAnimationEnd$2(Y.ALAdapterS9S0110000_25, android.animation.Animator):void");
    }

    public static final void onAnimationStart$0(ALAdapterS9S0110000_25 aLAdapterS9S0110000_25, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LLLLZLL(((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ(), 0);
    }

    public static final void onAnimationStart$1(ALAdapterS9S0110000_25 aLAdapterS9S0110000_25, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LLLLZLL(((C1659140tHE) aLAdapterS9S0110000_25.l0).LJJ(), 0);
    }

    public ALAdapterS9S0110000_25(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
