package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes36.dex */
public class AAListenerS19S0100001_35 implements Animator.AnimatorListener {
    public final int $t;
    public float f1;
    public Object l0;

    public static final void onAnimationCancel$1(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
        C786410Ut5.T4((View) aAListenerS19S0100001_35.l0, aAListenerS19S0100001_35.f1);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS19S0100001_35.l0);
    }

    public static final void onAnimationEnd$1(AAListenerS19S0100001_35 aAListenerS19S0100001_35, Animator animator) {
        C786410Ut5.T4((View) aAListenerS19S0100001_35.l0, aAListenerS19S0100001_35.f1);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS19S0100001_35.l0);
    }

    public AAListenerS19S0100001_35(View view, float f, int i) {
        this.$t = i;
        this.l0 = view;
        this.f1 = f;
    }
}
