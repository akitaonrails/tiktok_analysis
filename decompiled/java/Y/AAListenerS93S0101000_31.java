package Y;

import X.C15DF;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes32.dex */
public class AAListenerS93S0101000_31 implements Animator.AnimatorListener {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationEnd$2(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$1(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
        ((View) aAListenerS93S0101000_31.l0).setBackgroundColor(aAListenerS93S0101000_31.i1);
    }

    public static final void onAnimationCancel$2(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
        ((View) aAListenerS93S0101000_31.l0).setBackgroundColor(aAListenerS93S0101000_31.i1);
    }

    public static final void onAnimationEnd$0(AAListenerS93S0101000_31 aAListenerS93S0101000_31, Animator animator) {
        C15DF c15df = (C15DF) aAListenerS93S0101000_31.l0;
        c15df.LLLIILIL = false;
        c15df.LLJILJILJ = aAListenerS93S0101000_31.i1;
    }

    public AAListenerS93S0101000_31(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
