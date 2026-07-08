package Y;

import X.C14JI;
import X.C14JM;
import X.C14JT;
import X.C14JU;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes31.dex */
public class ALAdapterS24S0200000_30 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationEnd$0(ALAdapterS24S0200000_30 aLAdapterS24S0200000_30, Animator animator) {
        ((C14JT) aLAdapterS24S0200000_30.l0).LIZIZ(1.0f);
        C14JU.LJ((View) aLAdapterS24S0200000_30.l1, (C14JT) aLAdapterS24S0200000_30.l0);
    }

    public static final void onAnimationEnd$1(ALAdapterS24S0200000_30 aLAdapterS24S0200000_30, Animator animator) {
        ((C14JM) aLAdapterS24S0200000_30.l0).LIZ.LJ(1.0f);
        C14JI.LJFF((View) aLAdapterS24S0200000_30.l1, (C14JM) aLAdapterS24S0200000_30.l0);
    }

    public ALAdapterS24S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
