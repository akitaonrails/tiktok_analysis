package Y;

import X.C674050QcF;
import X.C674070QcH;
import X.EnumC674020QcC;
import android.animation.Animator;

/* JADX INFO: loaded from: classes11.dex */
public class AAListenerS135S0300000_10 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$1(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
        ((C674050QcF) aAListenerS135S0300000_10.l0).LJIIIIZZ.LIZJ((C674070QcH) aAListenerS135S0300000_10.l1);
        ((C674050QcF) aAListenerS135S0300000_10.l0).LJIIIZ.LIZ((EnumC674020QcC) aAListenerS135S0300000_10.l2);
    }

    public static final void onAnimationEnd$1(AAListenerS135S0300000_10 aAListenerS135S0300000_10, Animator animator) {
        ((C674050QcF) aAListenerS135S0300000_10.l0).LJIIIIZZ.LIZJ((C674070QcH) aAListenerS135S0300000_10.l1);
        ((C674050QcF) aAListenerS135S0300000_10.l0).LJIIIZ.LIZ((EnumC674020QcC) aAListenerS135S0300000_10.l2);
    }

    public AAListenerS135S0300000_10(C674050QcF c674050QcF, C674070QcH c674070QcH, EnumC674020QcC enumC674020QcC, int i) {
        this.$t = i;
        this.l0 = c674050QcF;
        this.l1 = c674070QcH;
        this.l2 = enumC674020QcC;
    }
}
