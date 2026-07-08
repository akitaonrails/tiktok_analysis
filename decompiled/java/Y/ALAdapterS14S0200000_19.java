package Y;

import X.C1214930hil;
import X.C12CY;
import X.C1450070nq1;
import X.C2188811AlT;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes20.dex */
public class ALAdapterS14S0200000_19 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationEnd(animator);
        } else {
            onAnimationEnd$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS14S0200000_19 aLAdapterS14S0200000_19, Animator animator) {
        ((C1214930hil) aLAdapterS14S0200000_19.l0).LLJILJILJ = false;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aLAdapterS14S0200000_19.l1;
        layoutParams.height = -2;
        C1214930hil c1214930hil = (C1214930hil) aLAdapterS14S0200000_19.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1214930hil);
        c1214930hil.setLayoutParams(layoutParams);
        ((C1214930hil) aLAdapterS14S0200000_19.l0).requestLayout();
    }

    public static final void onAnimationRepeat$0(ALAdapterS14S0200000_19 aLAdapterS14S0200000_19, Animator animator) {
        super.onAnimationRepeat(animator);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive onAnimationRepeat: ");
        sbLIZ.append(((ValueAnimator) aLAdapterS14S0200000_19.l0).isRunning());
        sbLIZ.append(' ');
        C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
        ((C12CY) aLAdapterS14S0200000_19.l1).LLLIZZ();
        ((C12CY) aLAdapterS14S0200000_19.l1).LLLIL();
    }

    public ALAdapterS14S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
