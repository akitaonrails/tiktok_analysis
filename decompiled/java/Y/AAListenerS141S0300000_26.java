package Y;

import X.C1759440vt0;
import X.C1759470vt3;
import X.EnumC1759580vtE;
import android.animation.Animator;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes27.dex */
public class AAListenerS141S0300000_26 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationRepeat$0(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
        ((C1759440vt0) aAListenerS141S0300000_26.l0).LJ((ViewGroup) aAListenerS141S0300000_26.l1, (EnumC1759580vtE) aAListenerS141S0300000_26.l2);
    }

    public static final void onAnimationCancel$1(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
        ((C1759470vt3) aAListenerS141S0300000_26.l0).LIZ((ViewGroup) aAListenerS141S0300000_26.l1, (EnumC1759580vtE) aAListenerS141S0300000_26.l2);
    }

    public static final void onAnimationEnd$0(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
        ((C1759440vt0) aAListenerS141S0300000_26.l0).LJ((ViewGroup) aAListenerS141S0300000_26.l1, (EnumC1759580vtE) aAListenerS141S0300000_26.l2);
    }

    public static final void onAnimationEnd$1(AAListenerS141S0300000_26 aAListenerS141S0300000_26, Animator animator) {
        ((C1759470vt3) aAListenerS141S0300000_26.l0).LIZ((ViewGroup) aAListenerS141S0300000_26.l1, (EnumC1759580vtE) aAListenerS141S0300000_26.l2);
    }

    public AAListenerS141S0300000_26(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
