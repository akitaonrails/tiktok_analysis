package Y;

import X.C21390118nL;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;

/* JADX INFO: loaded from: classes33.dex */
public class AAListenerS10S0100002_32 implements Animator.AnimatorListener {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
        ((C21390118nL) aAListenerS10S0100002_32.l0).setPivotX(aAListenerS10S0100002_32.f1);
        ((C21390118nL) aAListenerS10S0100002_32.l0).setPivotY(aAListenerS10S0100002_32.f2);
        C21390118nL c21390118nL = (C21390118nL) aAListenerS10S0100002_32.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setScaleX(0.0f);
        C21390118nL c21390118nL2 = (C21390118nL) aAListenerS10S0100002_32.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL2);
        c21390118nL2.setScaleY(0.0f);
        ((C21390118nL) aAListenerS10S0100002_32.l0).setRenderNodeDriver(null);
    }

    public static final void onAnimationEnd$1(AAListenerS10S0100002_32 aAListenerS10S0100002_32, Animator animator) {
        ((C21390118nL) aAListenerS10S0100002_32.l0).setPivotX(aAListenerS10S0100002_32.f1);
        ((C21390118nL) aAListenerS10S0100002_32.l0).setPivotY(aAListenerS10S0100002_32.f2);
        C21390118nL c21390118nL = (C21390118nL) aAListenerS10S0100002_32.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL);
        c21390118nL.setScaleX(0.0f);
        C21390118nL c21390118nL2 = (C21390118nL) aAListenerS10S0100002_32.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21390118nL2);
        c21390118nL2.setScaleY(0.0f);
        ((C21390118nL) aAListenerS10S0100002_32.l0).setRenderNodeDriver(null);
    }

    public AAListenerS10S0100002_32(C21390118nL c21390118nL, float f, float f2, int i) {
        this.$t = i;
        this.l0 = c21390118nL;
        this.f1 = f;
        this.f2 = f2;
    }
}
