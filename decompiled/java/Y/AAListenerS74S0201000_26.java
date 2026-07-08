package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes27.dex */
public class AAListenerS74S0201000_26 implements Animator.AnimatorListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$1(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
        ((ViewGroup.MarginLayoutParams) aAListenerS74S0201000_26.l0).bottomMargin = aAListenerS74S0201000_26.i2;
        C786410Ut5.W5((View) aAListenerS74S0201000_26.l1, (ViewGroup.MarginLayoutParams) aAListenerS74S0201000_26.l0);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS74S0201000_26.l1);
        C786410Ut5.T4((View) aAListenerS74S0201000_26.l1, 1.0f);
    }

    public static final void onAnimationEnd$1(AAListenerS74S0201000_26 aAListenerS74S0201000_26, Animator animator) {
        ((ViewGroup.MarginLayoutParams) aAListenerS74S0201000_26.l0).bottomMargin = aAListenerS74S0201000_26.i2;
        C786410Ut5.W5((View) aAListenerS74S0201000_26.l1, (ViewGroup.MarginLayoutParams) aAListenerS74S0201000_26.l0);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS74S0201000_26.l1);
        C786410Ut5.T4((View) aAListenerS74S0201000_26.l1, 1.0f);
    }

    public AAListenerS74S0201000_26(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, int i2) {
        this.$t = i2;
        this.l0 = marginLayoutParams;
        this.i2 = i;
        this.l1 = view;
    }
}
