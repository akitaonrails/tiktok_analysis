package Y;

import X.C01GW;
import X.C0RR7;
import X.C616140OEq;
import X.C694320RLi;
import X.C695730RQt;
import X.C695740RQu;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AAListenerS134S0300000_9 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
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

    public static final void onAnimationCancel$1(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        ((Function0) aAListenerS134S0300000_9.l0).invoke();
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS134S0300000_9.l1);
        View view = ((C616140OEq) aAListenerS134S0300000_9.l2).LIZJ;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
    }

    public static final void onAnimationEnd$1(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        ((Function0) aAListenerS134S0300000_9.l0).invoke();
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS134S0300000_9.l1);
        View view = ((C616140OEq) aAListenerS134S0300000_9.l2).LIZJ;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
    }

    public static final void onAnimationStart$0(AAListenerS134S0300000_9 aAListenerS134S0300000_9, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS134S0300000_9.l0);
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS134S0300000_9.l1);
        C786410Ut5.T4((View) aAListenerS134S0300000_9.l1, 0.0f);
        C786410Ut5.W5((View) aAListenerS134S0300000_9.l1, (ViewGroup.MarginLayoutParams) aAListenerS134S0300000_9.l2);
        if (C0RR7.LIZ() || LowScreenOptimizeAB.LJ() || C695730RQt.LIZ()) {
            C01GW c01gw = C694320RLi.LIZ;
            C695740RQu.LJ(R.id.elp, (View) aAListenerS134S0300000_9.l1, Boolean.TRUE);
        }
    }

    public AAListenerS134S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
