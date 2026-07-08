package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public class AAListenerS29S0301000_16 implements Animator.AnimatorListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$1(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
        C786410Ut5.T4((View) aAListenerS29S0301000_16.l0, 1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aAListenerS29S0301000_16.l1;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = aAListenerS29S0301000_16.i3;
        }
        C786410Ut5.W5((View) aAListenerS29S0301000_16.l0, (ViewGroup.MarginLayoutParams) aAListenerS29S0301000_16.l1);
        Function0 function0 = (Function0) aAListenerS29S0301000_16.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(AAListenerS29S0301000_16 aAListenerS29S0301000_16, Animator animator) {
        C786410Ut5.T4((View) aAListenerS29S0301000_16.l0, 1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aAListenerS29S0301000_16.l1;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = aAListenerS29S0301000_16.i3;
        }
        C786410Ut5.W5((View) aAListenerS29S0301000_16.l0, (ViewGroup.MarginLayoutParams) aAListenerS29S0301000_16.l1);
        Function0 function0 = (Function0) aAListenerS29S0301000_16.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public AAListenerS29S0301000_16(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, AwS560S0100000_16 awS560S0100000_16, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.l1 = marginLayoutParams;
        this.i3 = i;
        this.l2 = awS560S0100000_16;
    }
}
