package Y;

import X.C1657890tFD;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public class ALAdapterS3S0400000_19 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS3S0400000_19 aLAdapterS3S0400000_19, Animator animator) {
        ((Animator) aLAdapterS3S0400000_19.l0).removeAllListeners();
        ((C1657890tFD) aLAdapterS3S0400000_19.l1).LLJILLL.remove((Pair) aLAdapterS3S0400000_19.l2);
        C1657890tFD c1657890tFD = (C1657890tFD) aLAdapterS3S0400000_19.l1;
        View view = (View) aLAdapterS3S0400000_19.l3;
        c1657890tFD.getClass();
        C1657890tFD.LJFF(view);
    }

    public static final void onAnimationCancel$1(ALAdapterS3S0400000_19 aLAdapterS3S0400000_19, Animator animator) {
        ((Animator) aLAdapterS3S0400000_19.l0).removeAllListeners();
        ((C1657890tFD) aLAdapterS3S0400000_19.l1).LLJILLL.remove((Pair) aLAdapterS3S0400000_19.l2);
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0400000_19 aLAdapterS3S0400000_19, Animator animator) {
        ((Animator) aLAdapterS3S0400000_19.l0).removeAllListeners();
        ((C1657890tFD) aLAdapterS3S0400000_19.l1).LLJILLL.remove((Pair) aLAdapterS3S0400000_19.l2);
        C1657890tFD c1657890tFD = (C1657890tFD) aLAdapterS3S0400000_19.l1;
        View view = (View) aLAdapterS3S0400000_19.l3;
        c1657890tFD.getClass();
        C1657890tFD.LJFF(view);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0400000_19 aLAdapterS3S0400000_19, Animator animator) {
        Integer numValueOf;
        ((Animator) aLAdapterS3S0400000_19.l0).removeAllListeners();
        ((C1657890tFD) aLAdapterS3S0400000_19.l1).LLJILLL.remove((Pair) aLAdapterS3S0400000_19.l2);
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS3S0400000_19.l3).getLayoutParams();
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.height);
        } else {
            numValueOf = null;
        }
        ViewGroup.LayoutParams layoutParams2 = ((View) aLAdapterS3S0400000_19.l3).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        ((View) aLAdapterS3S0400000_19.l3).requestLayout();
        C1657890tFD c1657890tFD = (C1657890tFD) aLAdapterS3S0400000_19.l1;
        HandlerHook.viewPost(c1657890tFD.LLILLJJLI, new ARunnableS52S0300000_19(c1657890tFD, (View) aLAdapterS3S0400000_19.l3, numValueOf, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS3S0400000_19(Animator animator, Animator animator2, C1657890tFD c1657890tFD, Pair<? extends View, ? extends Animator> pair, View view) {
        this.$t = view;
        this.l0 = animator;
        this.l1 = animator2;
        this.l2 = c1657890tFD;
        this.l3 = pair;
    }
}
