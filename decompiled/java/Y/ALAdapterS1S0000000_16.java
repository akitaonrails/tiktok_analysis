package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes17.dex */
public class ALAdapterS1S0000000_16 extends AnimatorListenerAdapter {
    public final int $t;

    public static final void onAnimationEnd$5(ALAdapterS1S0000000_16 aLAdapterS1S0000000_16, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            super.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                super.onAnimationEnd(animator);
                break;
            case 2:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                super.onAnimationEnd(animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (5 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            super.onAnimationStart(animator);
        }
    }

    public ALAdapterS1S0000000_16(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0000000_16 aLAdapterS1S0000000_16, Animator animator) {
        super.onAnimationEnd(animator);
        animator.setStartDelay(1000L);
        animator.start();
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0000000_16 aLAdapterS1S0000000_16, Animator animator) {
        super.onAnimationEnd(animator);
        animator.setStartDelay(1000L);
        animator.start();
    }
}
