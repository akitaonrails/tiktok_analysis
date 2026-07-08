package Y;

import X.C1091250eVH;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public class AAListenerS64S0110000_13 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$1(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z1 = true;
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

    public AAListenerS64S0110000_13(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i) {
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
    }

    public static final void onAnimationEnd$0(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
        if (!aAListenerS64S0110000_13.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aAListenerS64S0110000_13.l0);
        }
        aAListenerS64S0110000_13.z1 = false;
    }

    public static final void onAnimationEnd$1(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
        if (!aAListenerS64S0110000_13.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aAListenerS64S0110000_13.l0);
        }
    }

    public static final void onAnimationStart$1(AAListenerS64S0110000_13 aAListenerS64S0110000_13, Animator animator) {
        if (aAListenerS64S0110000_13.z1) {
            C786410Ut5.LJLLLLLL(0, (View) aAListenerS64S0110000_13.l0);
        }
    }

    public AAListenerS64S0110000_13(C1091250eVH c1091250eVH, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = c1091250eVH;
    }
}
