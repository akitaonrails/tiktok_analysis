package Y;

import android.animation.Animator;

/* JADX INFO: loaded from: classes12.dex */
public class AAListenerS170S0000000_11 implements Animator.AnimatorListener {
    public final int $t;

    public static final void onAnimationCancel$0(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS170S0000000_11 aAListenerS170S0000000_11, Animator animator) {
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

    public AAListenerS170S0000000_11(int i) {
        this.$t = i;
    }
}
