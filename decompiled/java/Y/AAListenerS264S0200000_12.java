package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AAListenerS264S0200000_12 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
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

    public static final void onAnimationCancel$2(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
        ((Function0) aAListenerS264S0200000_12.l1).invoke();
    }

    public static final void onAnimationEnd$2(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
        ((Function0) aAListenerS264S0200000_12.l0).invoke();
    }

    public static final void onAnimationStart$0(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
        C786410Ut5.T4((View) aAListenerS264S0200000_12.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS264S0200000_12.l0);
        ((View) aAListenerS264S0200000_12.l0).setPivotY(r1.getHeight());
        ((Function0) aAListenerS264S0200000_12.l1).invoke();
    }

    public static final void onAnimationStart$1(AAListenerS264S0200000_12 aAListenerS264S0200000_12, Animator animator) {
        C786410Ut5.T4((View) aAListenerS264S0200000_12.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS264S0200000_12.l0);
        ((View) aAListenerS264S0200000_12.l0).setPivotY(r1.getHeight());
        ((Function0) aAListenerS264S0200000_12.l1).invoke();
    }

    public AAListenerS264S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
