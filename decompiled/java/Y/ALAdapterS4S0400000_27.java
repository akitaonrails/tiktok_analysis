package Y;

import X.C15EO;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS4S0400000_27 extends AnimatorListenerAdapter {
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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS4S0400000_27.l2, 1.0f);
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS4S0400000_27.l2, 1.0f);
        C786410Ut5.ed((View) aLAdapterS4S0400000_27.l2, 0.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS4S0400000_27.l2, 1.0f);
        ((ViewPropertyAnimator) aLAdapterS4S0400000_27.l3).setListener(null);
        ((C15EO) aLAdapterS4S0400000_27.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS4S0400000_27.l1);
        ((C15EO) aLAdapterS4S0400000_27.l0).LLJJIJI.remove((RecyclerView.ViewHolder) aLAdapterS4S0400000_27.l1);
        ((C15EO) aLAdapterS4S0400000_27.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS4S0400000_27.l2, 0.0f);
        ((ViewPropertyAnimator) aLAdapterS4S0400000_27.l3).setListener(null);
        ((C15EO) aLAdapterS4S0400000_27.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS4S0400000_27.l1);
        ((C15EO) aLAdapterS4S0400000_27.l0).LLJJIJI.remove((RecyclerView.ViewHolder) aLAdapterS4S0400000_27.l1);
        ((C15EO) aLAdapterS4S0400000_27.l0).LJJIIZI();
    }

    public static final void onAnimationStart$0(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        ((C15EO) aLAdapterS4S0400000_27.l0).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS4S0400000_27 aLAdapterS4S0400000_27, Animator animator) {
        ((C15EO) aLAdapterS4S0400000_27.l0).getClass();
    }

    public ALAdapterS4S0400000_27(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.ViewHolder viewHolder, C15EO c15eo, int i) {
        this.$t = i;
        this.l0 = c15eo;
        this.l1 = viewHolder;
        this.l2 = view;
        this.l3 = viewPropertyAnimator;
    }
}
