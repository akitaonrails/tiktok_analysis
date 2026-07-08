package X;

import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class AnimationAnimationListenerC1620700sHE implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
    }

    public static final void onAnimationRepeat$3(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                break;
            case 1:
                onAnimationEnd$1(this, animation);
                break;
            case 2:
                onAnimationEnd$2(this, animation);
                break;
            case 3:
                onAnimationEnd$3(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                break;
            case 1:
                onAnimationRepeat$1(this, animation);
                break;
            case 2:
                onAnimationRepeat$2(this, animation);
                break;
            case 3:
                onAnimationRepeat$3(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                break;
            case 1:
                onAnimationStart$1(this, animation);
                break;
            case 2:
                onAnimationStart$2(this, animation);
                break;
            case 3:
                onAnimationStart$3(this, animation);
                break;
        }
    }

    public AnimationAnimationListenerC1620700sHE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        C1581460rFw c1581460rFw = (C1581460rFw) animationAnimationListenerC1620700sHE.l0;
        if (c1581460rFw.LIZLLL) {
            return;
        }
        C786410Ut5.T4(c1581460rFw.LIZIZ, 0.0f);
        Function0<Unit> function0 = ((C1581460rFw) animationAnimationListenerC1620700sHE.l0).LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        Function0<Unit> function0;
        C1581460rFw c1581460rFw = (C1581460rFw) animationAnimationListenerC1620700sHE.l0;
        if (!c1581460rFw.LIZLLL && (function0 = c1581460rFw.LIZJ) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        C1595800rd4 c1595800rd4 = (C1595800rd4) animationAnimationListenerC1620700sHE.l0;
        if (c1595800rd4.LIZIZ) {
            return;
        }
        c1595800rd4.LIZ.I4();
    }

    public static final void onAnimationEnd$3(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        C1595800rd4 c1595800rd4 = (C1595800rd4) animationAnimationListenerC1620700sHE.l0;
        if (c1595800rd4.LIZIZ) {
            return;
        }
        c1595800rd4.LIZ.I4();
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        C786410Ut5.T4(((C1581460rFw) animationAnimationListenerC1620700sHE.l0).LIZIZ, 1.0f);
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        ((C1595800rd4) animationAnimationListenerC1620700sHE.l0).LIZIZ = false;
    }

    public static final void onAnimationStart$3(AnimationAnimationListenerC1620700sHE animationAnimationListenerC1620700sHE, Animation animation) {
        ((C1595800rd4) animationAnimationListenerC1620700sHE.l0).LIZIZ = false;
    }
}
