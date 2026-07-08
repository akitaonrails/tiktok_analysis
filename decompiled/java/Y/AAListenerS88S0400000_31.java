package Y;

import X.C15AZ;
import X.C15DV;
import X.C15FX;
import X.C20441214yg;
import X.C204747159t;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AAListenerS88S0400000_31 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static final void onAnimationCancel$0(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
    }

    public static final void onAnimationStart$4(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
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
            case 4:
                onAnimationCancel$4(this, animator);
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
            case 4:
                onAnimationEnd$4(this, animator);
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
            case 4:
                onAnimationRepeat$4(this, animator);
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
            case 4:
                onAnimationStart$4(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$1(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        ((AnimatorSet) aAListenerS88S0400000_31.l2).removeAllListeners();
        ((Function0) aAListenerS88S0400000_31.l3).invoke();
    }

    public static final void onAnimationCancel$2(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        C20441214yg.LJIIIZ(((C204747159t) aAListenerS88S0400000_31.l0).getTag(), "onAnimationCancel");
        ((C204747159t) aAListenerS88S0400000_31.l0).LLJJJJ = false;
        ((AnimatorSet) aAListenerS88S0400000_31.l1).removeAllListeners();
        C204747159t c204747159t = (C204747159t) aAListenerS88S0400000_31.l0;
        HandlerHook.viewPost(c204747159t, new ARunnableS64S0300000_31(c204747159t, (Function2) aAListenerS88S0400000_31.l3, (C15AZ) aAListenerS88S0400000_31.l2, 9));
    }

    public static final void onAnimationCancel$3(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        ((C15DV) aAListenerS88S0400000_31.l2).LIZ.LJFF();
        C500260Jjc.LJIILIIL(((C15DV) aAListenerS88S0400000_31.l2).LIZ);
        C786410Ut5.Yb(((C15DV) aAListenerS88S0400000_31.l2).LIZIZ, 1.0f);
        C786410Ut5.xc(((C15DV) aAListenerS88S0400000_31.l2).LIZIZ, 1.0f);
        ImageView imageView = ((C15DV) aAListenerS88S0400000_31.l2).LIZJ;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, 1.0f);
        }
        ImageView imageView2 = ((C15DV) aAListenerS88S0400000_31.l2).LIZJ;
        if (imageView2 != null) {
            C786410Ut5.rc(imageView2, 1.0f);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        if (((C15FX) aAListenerS88S0400000_31.l0).LL) {
            ((Function0) aAListenerS88S0400000_31.l1).invoke();
            if (!Intrinsics.LJFF((ViewGroup) aAListenerS88S0400000_31.l2, (ViewGroup) aAListenerS88S0400000_31.l3)) {
                C786410Ut5.R4(1.0f, (ViewGroup) aAListenerS88S0400000_31.l2);
            }
        }
    }

    public static final void onAnimationEnd$1(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        ((AnimatorSet) aAListenerS88S0400000_31.l0).removeAllListeners();
        ((Function0) aAListenerS88S0400000_31.l1).invoke();
    }

    public static final void onAnimationEnd$2(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        C20441214yg.LJIIIZ(((C204747159t) aAListenerS88S0400000_31.l0).getTag(), "onAnimationEnd");
        ((C204747159t) aAListenerS88S0400000_31.l0).LLJJJJ = false;
        ((AnimatorSet) aAListenerS88S0400000_31.l1).removeAllListeners();
        C204747159t c204747159t = (C204747159t) aAListenerS88S0400000_31.l0;
        HandlerHook.viewPost(c204747159t, new ARunnableS64S0300000_31(c204747159t, (Function2) aAListenerS88S0400000_31.l3, (C15AZ) aAListenerS88S0400000_31.l2, 10));
    }

    public static final void onAnimationEnd$3(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        ((C15DV) aAListenerS88S0400000_31.l0).LIZ.LJFF();
        C500260Jjc.LJIILIIL(((C15DV) aAListenerS88S0400000_31.l0).LIZ);
        ((Function0) aAListenerS88S0400000_31.l1).invoke();
    }

    public static final void onAnimationEnd$4(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        if (((C15FX) aAListenerS88S0400000_31.l0).LL) {
            ViewGroup viewGroup = (ViewGroup) aAListenerS88S0400000_31.l1;
            if (viewGroup != null) {
                C786410Ut5.R4(1.0f, viewGroup);
            }
            ViewGroup viewGroup2 = (ViewGroup) aAListenerS88S0400000_31.l1;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
            ((C15FX) aAListenerS88S0400000_31.l0).LJIILL(0, (ConstraintLayout) aAListenerS88S0400000_31.l2);
            ((Function0) aAListenerS88S0400000_31.l3).invoke();
        }
    }

    public static final void onAnimationStart$3(AAListenerS88S0400000_31 aAListenerS88S0400000_31, Animator animator) {
        C500260Jjc.LJIILIIL(((C15DV) aAListenerS88S0400000_31.l3).LIZJ);
    }

    public AAListenerS88S0400000_31(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
