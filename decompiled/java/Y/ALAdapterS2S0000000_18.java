package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes19.dex */
public class ALAdapterS2S0000000_18 extends AnimatorListenerAdapter {
    public final int $t;

    public static final void onAnimationEnd$0(ALAdapterS2S0000000_18 aLAdapterS2S0000000_18, Animator animator) {
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0000000_18 aLAdapterS2S0000000_18, Animator animator) {
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public ALAdapterS2S0000000_18(int i) {
        this.$t = i;
    }
}
