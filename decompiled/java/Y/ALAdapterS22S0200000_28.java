package Y;

import X.AbstractC1912160zrK;
import X.C1295960jpS;
import X.C1897280zTK;
import X.C1898700zVc;
import X.C1902360zbW;
import X.C1911410zq7;
import X.C19212010Ec;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.touchpoint.api.model.Animation;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class ALAdapterS22S0200000_28 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                C1911410zq7.LIZ("NewUserLaunchActivity", "onAnimationCancel");
                break;
            case 1:
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                onAnimationCancel$1(this, animator);
                break;
            case 4:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

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
                onAnimationEnd$4(this, animator);
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
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
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationCancel(animator);
        Function1 function1 = (Function1) aLAdapterS22S0200000_28.l0;
        if (function1 != null) {
            function1.invoke(3);
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationCancel(animator);
        ((Function0) aLAdapterS22S0200000_28.l1).invoke();
    }

    public static final void onAnimationEnd$0(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        ((ControlSloganFragment) aLAdapterS22S0200000_28.l1).bS(false);
        ControlSloganFragment controlSloganFragment = (ControlSloganFragment) aLAdapterS22S0200000_28.l1;
        controlSloganFragment.getClass();
        ControlSloganFragment controlSloganFragment2 = (ControlSloganFragment) aLAdapterS22S0200000_28.l1;
        controlSloganFragment2.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - controlSloganFragment2.LLJIJIL;
        long j = 0;
        if (jElapsedRealtime <= 0) {
            jElapsedRealtime = 0;
        }
        long j2 = 1500 - jElapsedRealtime;
        BPEAHandler bPEAHandler = controlSloganFragment.LLJI;
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(controlSloganFragment, 68);
        if (j2 > 0) {
            j = j2;
        }
        C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS128S0100000_28);
    }

    public static final void onAnimationEnd$1(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationEnd(animator);
        ((AbstractC1912160zrK) aLAdapterS22S0200000_28.l0).getClass();
        Function0 function0 = (Function0) aLAdapterS22S0200000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        C1898700zVc c1898700zVc = (C1898700zVc) aLAdapterS22S0200000_28.l1;
        if (!c1898700zVc.LLJJJJLIIL && c1898700zVc.getHasBreathLottie() && ((C1898700zVc) aLAdapterS22S0200000_28.l1).getBreathLottieLoadSuccess()) {
            C786410Ut5.LLLLLIL(((C1898700zVc) aLAdapterS22S0200000_28.l1).getLottieView(), 8);
            C786410Ut5.LLLLLIL(((C1898700zVc) aLAdapterS22S0200000_28.l1).getBreathLottieView(), 0);
        }
        Function1 function1 = (Function1) aLAdapterS22S0200000_28.l0;
        if (function1 != null) {
            function1.invoke(2);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        C1295960jpS c1295960jpS = ((C1897280zTK) aLAdapterS22S0200000_28.l0).LJIIJJI;
        if (c1295960jpS != null) {
            Animation animation = (Animation) aLAdapterS22S0200000_28.l1;
            c1295960jpS.setMinAndMaxFrame(animation.transitionFrame, animation.endFrame);
        }
        C1295960jpS c1295960jpS2 = ((C1897280zTK) aLAdapterS22S0200000_28.l0).LJIIJJI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS3 = ((C1897280zTK) aLAdapterS22S0200000_28.l0).LJIIJJI;
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS4 = ((C1897280zTK) aLAdapterS22S0200000_28.l0).LJIIJJI;
        if (c1295960jpS4 != null) {
            c1295960jpS4.playAnimation();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS22S0200000_28.l1).invoke();
    }

    public static final void onAnimationEnd$5(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS22S0200000_28.l0);
        if (C19212010Ec.LIZJ.LJJIJ()) {
            C786410Ut5.LJLLLLLL(0, (View) aLAdapterS22S0200000_28.l1);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        C786410Ut5.V4((ImageView) aLAdapterS22S0200000_28.l0, 1.0f);
        C1911410zq7.LIZ("NewUserLaunchActivity", "onAnimationStart");
    }

    public static final void onAnimationStart$1(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationStart(animator);
        ((AbstractC1912160zrK) aLAdapterS22S0200000_28.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        Function1 function1 = (Function1) aLAdapterS22S0200000_28.l0;
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        super.onAnimationStart(animator);
        Function0<Unit> function0 = ((C1902360zbW) aLAdapterS22S0200000_28.l0).LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$4(ALAdapterS22S0200000_28 aLAdapterS22S0200000_28, Animator animator) {
        View view;
        if (C19212010Ec.LIZJ.LJJIJ() && (view = (View) aLAdapterS22S0200000_28.l0) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = (View) aLAdapterS22S0200000_28.l1;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    public ALAdapterS22S0200000_28(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
