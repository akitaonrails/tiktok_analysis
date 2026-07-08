package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class AAListenerS18S0100001_15 implements Animator.AnimatorListener {
    public final int $t;
    public float f1;
    public Object l0;

    public static final void onAnimationRepeat$0(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS18S0100001_15.l0, aAListenerS18S0100001_15.f1);
        C786410Ut5.Ob((View) aAListenerS18S0100001_15.l0, 1.0f);
        C786410Ut5.pc((View) aAListenerS18S0100001_15.l0, 1.0f);
    }

    public static final void onAnimationCancel$1(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS18S0100001_15.l0, aAListenerS18S0100001_15.f1);
        C786410Ut5.Ob((View) aAListenerS18S0100001_15.l0, 1.0f);
        C786410Ut5.pc((View) aAListenerS18S0100001_15.l0, 1.0f);
    }

    public static final void onAnimationEnd$0(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS18S0100001_15.l0, aAListenerS18S0100001_15.f1);
        C786410Ut5.Ob((View) aAListenerS18S0100001_15.l0, 1.0f);
        C786410Ut5.pc((View) aAListenerS18S0100001_15.l0, 1.0f);
    }

    public static final void onAnimationEnd$1(AAListenerS18S0100001_15 aAListenerS18S0100001_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS18S0100001_15.l0, aAListenerS18S0100001_15.f1);
        C786410Ut5.Ob((View) aAListenerS18S0100001_15.l0, 1.0f);
        C786410Ut5.pc((View) aAListenerS18S0100001_15.l0, 1.0f);
    }

    public AAListenerS18S0100001_15(View view, float f, int i) {
        this.$t = i;
        this.l0 = view;
        this.f1 = f;
    }
}
