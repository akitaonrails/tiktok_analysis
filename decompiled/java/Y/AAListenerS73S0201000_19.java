package Y;

import X.C1262850iy3;
import X.C2187451AjH;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS33S0001000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AAListenerS73S0201000_19 implements Animator.AnimatorListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$1(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
        ((ViewGroup.MarginLayoutParams) aAListenerS73S0201000_19.l0).bottomMargin = aAListenerS73S0201000_19.i2;
        C786410Ut5.W5((View) aAListenerS73S0201000_19.l1, (ViewGroup.MarginLayoutParams) aAListenerS73S0201000_19.l0);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS73S0201000_19.l1);
        C786410Ut5.T4((View) aAListenerS73S0201000_19.l1, 1.0f);
    }

    public static final void onAnimationEnd$0(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
        CustomDialogFragment customDialogFragment = ((C1262850iy3) aAListenerS73S0201000_19.l0).LLJILJIL;
        if (customDialogFragment != null) {
            customDialogFragment.MR(new AwS33S0001000_19(aAListenerS73S0201000_19.i2, 13));
        }
        int i = C2187451AjH.LIZ;
        Function0 function0 = (Function0) aAListenerS73S0201000_19.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(AAListenerS73S0201000_19 aAListenerS73S0201000_19, Animator animator) {
        ((ViewGroup.MarginLayoutParams) aAListenerS73S0201000_19.l0).bottomMargin = aAListenerS73S0201000_19.i2;
        C786410Ut5.W5((View) aAListenerS73S0201000_19.l1, (ViewGroup.MarginLayoutParams) aAListenerS73S0201000_19.l0);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS73S0201000_19.l1);
        C786410Ut5.T4((View) aAListenerS73S0201000_19.l1, 1.0f);
    }

    public AAListenerS73S0201000_19(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
