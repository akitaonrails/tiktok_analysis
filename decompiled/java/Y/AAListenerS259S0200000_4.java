package Y;

import X.C1602160rnK;
import X.C345700Dgu;
import X.C428160Gqc;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AAListenerS259S0200000_4 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
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

    public static final void onAnimationCancel$1(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
        C428160Gqc c428160Gqc = (C428160Gqc) aAListenerS259S0200000_4.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428160Gqc);
        c428160Gqc.setAlpha(1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aAListenerS259S0200000_4.l1).getLayoutParams();
        marginLayoutParams.setMarginEnd(0);
        C786410Ut5.W5((View) aAListenerS259S0200000_4.l1, marginLayoutParams);
        C428160Gqc c428160Gqc2 = (C428160Gqc) aAListenerS259S0200000_4.l0;
        int visibility = c428160Gqc2.getVisibility();
        c428160Gqc2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c428160Gqc2);
    }

    public static final void onAnimationEnd$0(AAListenerS259S0200000_4 aAListenerS259S0200000_4, Animator animator) {
        Function1<View, Unit> function1 = ((C345700Dgu) aAListenerS259S0200000_4.l0).LIZJ;
        if (function1 != null) {
            function1.invoke((View) aAListenerS259S0200000_4.l1);
        }
    }

    public AAListenerS259S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
