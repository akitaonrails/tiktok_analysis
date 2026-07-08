package Y;

import X.C259800zU;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AAListenerS258S0200000_2 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationEnd$0(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
        C786410Ut5.T4((View) aAListenerS258S0200000_2.l0, 1.0f);
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS258S0200000_2.l0);
        Function0 function0 = (Function0) ((C259800zU) aAListenerS258S0200000_2.l1).element;
        if (function0 != null) {
            function0.invoke();
        }
        ((C259800zU) aAListenerS258S0200000_2.l1).element = null;
    }

    public static final void onAnimationCancel$1(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aAListenerS258S0200000_2.l1).getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5((View) aAListenerS258S0200000_2.l1, layoutParams);
    }

    public static final void onAnimationEnd$1(AAListenerS258S0200000_2 aAListenerS258S0200000_2, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aAListenerS258S0200000_2.l0).getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5((View) aAListenerS258S0200000_2.l0, layoutParams);
    }

    public AAListenerS258S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
