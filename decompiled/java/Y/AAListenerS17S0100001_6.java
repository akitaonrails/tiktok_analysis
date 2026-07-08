package Y;

import X.C427110Gov;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class AAListenerS17S0100001_6 implements Animator.AnimatorListener {
    public final int $t;
    public float f1;
    public Object l0;

    public static final void onAnimationCancel$1(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationEnd$2(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$0(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
        C427110Gov c427110Gov = (C427110Gov) aAListenerS17S0100001_6.l0;
        float f = aAListenerS17S0100001_6.f1;
        c427110Gov.LLJJLIIIJLLLLLLLZ = f;
        c427110Gov.LJJJJJ(f);
        ((C427110Gov) aAListenerS17S0100001_6.l0).requestLayout();
        ((C427110Gov) aAListenerS17S0100001_6.l0).invalidate();
    }

    public static final void onAnimationCancel$2(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
        C786410Ut5.T4((View) aAListenerS17S0100001_6.l0, aAListenerS17S0100001_6.f1);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS17S0100001_6.l0);
    }

    public static final void onAnimationEnd$1(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
        C427110Gov c427110Gov = (C427110Gov) aAListenerS17S0100001_6.l0;
        float f = aAListenerS17S0100001_6.f1;
        c427110Gov.LLJJLIIIJLLLLLLLZ = f;
        c427110Gov.LJJJJJ(f);
        ((C427110Gov) aAListenerS17S0100001_6.l0).requestLayout();
        ((C427110Gov) aAListenerS17S0100001_6.l0).invalidate();
    }

    public static final void onAnimationEnd$3(AAListenerS17S0100001_6 aAListenerS17S0100001_6, Animator animator) {
        C786410Ut5.T4((View) aAListenerS17S0100001_6.l0, aAListenerS17S0100001_6.f1);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS17S0100001_6.l0);
    }

    public AAListenerS17S0100001_6(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
