package Y;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AAListenerS260S0200000_5 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$0(Y.AAListenerS260S0200000_5 r5, android.animation.Animator r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS260S0200000_5.onAnimationEnd$0(Y.AAListenerS260S0200000_5, android.animation.Animator):void");
    }

    public static final void onAnimationEnd$1(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.play((ObjectAnimator) aAListenerS260S0200000_5.l0).with((ObjectAnimator) aAListenerS260S0200000_5.l1);
        animatorSet.setStartDelay(100L);
        animatorSet.start();
    }

    public static final void onAnimationEnd$2(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
        Function0 function0 = (Function0) aAListenerS260S0200000_5.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$2(AAListenerS260S0200000_5 aAListenerS260S0200000_5, Animator animator) {
        Function0 function0 = (Function0) aAListenerS260S0200000_5.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public AAListenerS260S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
