package Y;

import X.AbstractC1912160zrK;
import X.C1295960jpS;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes29.dex */
public class ALAdapterS10S0110000_28 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                onAnimationEnd$1(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0110000_28 aLAdapterS10S0110000_28, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS10S0110000_28.z1) {
            ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LIZIZ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0110000_28 aLAdapterS10S0110000_28, Animator animator) {
        if (!aLAdapterS10S0110000_28.z1) {
            AbstractC1912160zrK abstractC1912160zrK = (AbstractC1912160zrK) aLAdapterS10S0110000_28.l0;
            if (!abstractC1912160zrK.LLJI) {
                C786410Ut5.LJLLLLLL(4, abstractC1912160zrK.LLILZ);
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS10S0110000_28 aLAdapterS10S0110000_28, Animator animator) {
        if (!aLAdapterS10S0110000_28.z1) {
            C786410Ut5.LJLLLLLL(8, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILLJJLI);
            C786410Ut5.LJLLLLLL(8, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILZIL);
            C786410Ut5.LJLLLLLL(0, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILLL);
            View view = ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILLL;
            if (view instanceof C1295960jpS) {
                ((C1295960jpS) view).playAnimation();
            }
            ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LIZIZ();
        }
    }

    public static final void onAnimationStart$1(ALAdapterS10S0110000_28 aLAdapterS10S0110000_28, Animator animator) {
        if (aLAdapterS10S0110000_28.z1) {
            C786410Ut5.LJLLLLLL(0, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILLJJLI);
            ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).getClass();
            C786410Ut5.LJLLLLLL(8, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILLL);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS10S0110000_28 aLAdapterS10S0110000_28, Animator animator) {
        if (aLAdapterS10S0110000_28.z1) {
            C786410Ut5.LJLLLLLL(0, ((AbstractC1912160zrK) aLAdapterS10S0110000_28.l0).LLILZ);
        }
    }

    public ALAdapterS10S0110000_28(boolean z, AbstractC1912160zrK abstractC1912160zrK, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = abstractC1912160zrK;
    }
}
