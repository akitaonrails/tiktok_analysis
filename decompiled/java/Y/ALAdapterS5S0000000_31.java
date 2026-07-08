package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS5S0000000_31 extends AnimatorListenerAdapter {
    public final int $t;

    public static final void onAnimationEnd$0(ALAdapterS5S0000000_31 aLAdapterS5S0000000_31, Animator animator) {
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0000000_31 aLAdapterS5S0000000_31, Animator animator) {
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0000000_31 aLAdapterS5S0000000_31, Animator animator) {
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0000000_31 aLAdapterS5S0000000_31, Animator animator) {
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public ALAdapterS5S0000000_31(int i) {
        this.$t = i;
    }
}
