package Y;

import X.C1619980sG4;
import X.C16F5;
import X.C1838180xw0;
import X.C1846020y8e;
import X.C1846070y8j;
import X.C1846150y8r;
import X.C1846240y90;
import X.InterfaceC1838190xw1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS4S0101000_27 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846070y8j) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846150y8r) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846020y8e) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846240y90) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        InterfaceC1838190xw1 interfaceC1838190xw1 = ((C1838180xw0) aLAdapterS4S0101000_27.l0).LLJI;
        if (interfaceC1838190xw1 != null) {
            interfaceC1838190xw1.LIZLLL(aLAdapterS4S0101000_27.i1);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846070y8j) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationStart$1(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846150y8r) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationStart$2(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846020y8e) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationStart$3(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ((C1846240y90) aLAdapterS4S0101000_27.l0).setSelectedPosition(aLAdapterS4S0101000_27.i1);
    }

    public static final void onAnimationStart$4(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        ProgressBar progressBar;
        super.onAnimationStart(animator);
        C1838180xw0 c1838180xw0 = (C1838180xw0) aLAdapterS4S0101000_27.l0;
        int i = aLAdapterS4S0101000_27.i1;
        C16F5 c16f5 = c1838180xw0.LLILZ;
        if (c16f5 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 1.5f);
            objectAnimatorOfFloat.setDuration(230L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 1.5f);
            objectAnimatorOfFloat2.setDuration(230L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.5f, 0.75f);
            objectAnimatorOfFloat3.setDuration(170L);
            objectAnimatorOfFloat3.setStartDelay(610L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.5f, 0.75f);
            objectAnimatorOfFloat4.setDuration(170L);
            objectAnimatorOfFloat4.setStartDelay(610L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.75f, 1.0f);
            objectAnimatorOfFloat5.setDuration(330L);
            objectAnimatorOfFloat5.setStartDelay(780L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.75f, 1.0f);
            objectAnimatorOfFloat6.setDuration(330L);
            objectAnimatorOfFloat6.setStartDelay(780L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJI());
            AnimatorSet animatorSet = new AnimatorSet();
            c1838180xw0.LLJ = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            AnimatorSet animatorSet2 = c1838180xw0.LLJ;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS4S0101000_27(c1838180xw0, i, 5));
            }
            AnimatorSet animatorSet3 = c1838180xw0.LLJ;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
        C1838180xw0 c1838180xw02 = (C1838180xw0) aLAdapterS4S0101000_27.l0;
        ProgressBar progressBar2 = c1838180xw02.LLILLJJLI;
        if (progressBar2 != null && (progressBar = c1838180xw02.LLILLL) != null) {
            AnimatorSet animatorSetE0 = C1838180xw0.e0(progressBar2);
            AnimatorSet animatorSetE02 = C1838180xw0.e0(progressBar);
            animatorSetE0.addListener(new ALAdapterS22S0100000_27(c1838180xw02, 6));
            animatorSetE0.start();
            animatorSetE02.start();
        }
    }

    public static final void onAnimationStart$5(ALAdapterS4S0101000_27 aLAdapterS4S0101000_27, Animator animator) {
        super.onAnimationStart(animator);
        InterfaceC1838190xw1 interfaceC1838190xw1 = ((C1838180xw0) aLAdapterS4S0101000_27.l0).LLJI;
        if (interfaceC1838190xw1 != null) {
            interfaceC1838190xw1.LIZ();
        }
    }

    public ALAdapterS4S0101000_27(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
