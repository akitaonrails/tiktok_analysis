package Y;

import X.C1590506Kp;
import X.C1602160rnK;
import X.C1643806c8;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class AAListenerS315S0100000_2 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$1(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationEnd$2(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
    }

    public static final void onAnimationStart$5(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
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
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
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
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
            case 5:
                onAnimationRepeat$5(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
        }
    }

    public AAListenerS315S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$3(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$4(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$5(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        C1590506Kp c1590506Kp = (C1590506Kp) aAListenerS315S0100000_2.l0;
        c1590506Kp.LIZJ(c1590506Kp.LLIZ);
    }

    public static final void onAnimationEnd$0(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationEnd$3(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationEnd$4(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationEnd$5(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        C1590506Kp c1590506Kp = (C1590506Kp) aAListenerS315S0100000_2.l0;
        c1590506Kp.LIZJ(c1590506Kp.LLIZ);
    }

    public static final void onAnimationRepeat$0(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public static final void onAnimationRepeat$3(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public static final void onAnimationRepeat$4(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public static final void onAnimationStart$0(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    public static final void onAnimationStart$1(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        View view = (View) aAListenerS315S0100000_2.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(0, (View) aAListenerS315S0100000_2.l0);
            C786410Ut5.T4((View) aAListenerS315S0100000_2.l0, 0.0f);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationStart$2(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        C1643806c8 c1643806c8 = (C1643806c8) aAListenerS315S0100000_2.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1643806c8);
        c1643806c8.setAlpha(0.0f);
        C1643806c8 c1643806c82 = (C1643806c8) aAListenerS315S0100000_2.l0;
        int visibility = c1643806c82.getVisibility();
        c1643806c82.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1643806c82);
    }

    public static final void onAnimationStart$3(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    public static final void onAnimationStart$4(AAListenerS315S0100000_2 aAListenerS315S0100000_2, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS315S0100000_2.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
