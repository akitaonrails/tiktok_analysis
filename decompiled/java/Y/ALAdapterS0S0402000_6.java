package Y;

import X.C423520Gj8;
import X.C424510Gkj;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS0S0402000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public int i4;
    public int i5;
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

    public static final void onAnimationCancel$0(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        if (aLAdapterS0S0402000_6.i4 != 0) {
            C786410Ut5.Jc((View) aLAdapterS0S0402000_6.l1, 0.0f);
        }
        if (aLAdapterS0S0402000_6.i5 != 0) {
            C786410Ut5.ed((View) aLAdapterS0S0402000_6.l1, 0.0f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        if (aLAdapterS0S0402000_6.i4 != 0) {
            C786410Ut5.Jc((View) aLAdapterS0S0402000_6.l2, 0.0f);
        }
        if (aLAdapterS0S0402000_6.i5 != 0) {
            C786410Ut5.ed((View) aLAdapterS0S0402000_6.l2, 0.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS0S0402000_6.l2).setListener(null);
        ((C423520Gj8) aLAdapterS0S0402000_6.l3).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS0S0402000_6.l0);
        ((C423520Gj8) aLAdapterS0S0402000_6.l3).LLJJI.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_6.l0);
        ((C423520Gj8) aLAdapterS0S0402000_6.l3).LJJIIZI();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS0S0402000_6.l3).setListener(null);
        ((C424510Gkj) aLAdapterS0S0402000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS0S0402000_6.l1);
        ((C424510Gkj) aLAdapterS0S0402000_6.l0).LLJJI.remove((RecyclerView.ViewHolder) aLAdapterS0S0402000_6.l1);
        ((C424510Gkj) aLAdapterS0S0402000_6.l0).LJJIIZI();
    }

    public static final void onAnimationStart$0(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        ((C423520Gj8) aLAdapterS0S0402000_6.l3).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS0S0402000_6 aLAdapterS0S0402000_6, Animator animator) {
        ((C424510Gkj) aLAdapterS0S0402000_6.l0).getClass();
    }

    public ALAdapterS0S0402000_6(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3) {
        this.$t = i3;
        this.l3 = obj;
        this.l0 = obj2;
        this.i4 = i;
        this.l1 = obj3;
        this.i5 = i2;
        this.l2 = obj4;
    }
}
