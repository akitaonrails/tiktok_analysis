package Y;

import X.C1775090wIF;
import X.C1775100wIG;
import X.EnumC1775120wII;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class ALAdapterS1S0201000_26 extends AnimatorListenerAdapter {
    public final int $t;
    public int i2;
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

    public static final void onAnimationEnd$0(ALAdapterS1S0201000_26 aLAdapterS1S0201000_26, Animator animator) {
        int i = aLAdapterS1S0201000_26.i2;
        C1775090wIF c1775090wIF = (C1775090wIF) aLAdapterS1S0201000_26.l0;
        if (i != c1775090wIF.LLJJIJI) {
            return;
        }
        c1775090wIF.LLJJIJIIJIL = null;
        C1775090wIF c1775090wIF2 = (C1775090wIF) aLAdapterS1S0201000_26.l0;
        C1775100wIG c1775100wIG = (C1775100wIG) aLAdapterS1S0201000_26.l1;
        c1775090wIF2.getClass();
        c1775090wIF2.LLJJJJJIL = EnumC1775120wII.LLILLL;
        c1775090wIF2.LLJJJJLIIL = 1.0f;
        c1775090wIF2.LLJJL = 0.0f;
        c1775090wIF2.LJIIJ(c1775100wIG);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setInterpolator(c1775090wIF2.LLJJJJ);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS60S0201000_26(i, c1775090wIF2, c1775100wIG, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS1S0201000_26(i, c1775090wIF2, c1775100wIG, 1));
        valueAnimatorOfFloat.start();
        c1775090wIF2.LLJJIJIL = valueAnimatorOfFloat;
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0201000_26 aLAdapterS1S0201000_26, Animator animator) {
        final int i = aLAdapterS1S0201000_26.i2;
        final C1775090wIF c1775090wIF = (C1775090wIF) aLAdapterS1S0201000_26.l0;
        if (i != c1775090wIF.LLJJIJI) {
            return;
        }
        c1775090wIF.LLJJIJIL = null;
        C1775100wIG c1775100wIG = (C1775100wIG) aLAdapterS1S0201000_26.l1;
        c1775090wIF.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(c1775090wIF.LLJJJJ);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS60S0201000_26(i, c1775090wIF, c1775100wIG, 0));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0wIH
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                int i2 = i;
                C1775090wIF c1775090wIF2 = c1775090wIF;
                int i3 = c1775090wIF2.LLJJIJI;
                if (i2 != i3) {
                    return;
                }
                c1775090wIF2.LLJJJ = null;
                if (i2 == i3) {
                    C1775100wIG c1775100wIG2 = c1775090wIF2.LLJJIII;
                    if (c1775100wIG2 != null) {
                        c1775090wIF2.LLJJJJJIL = EnumC1775120wII.LL;
                        c1775090wIF2.LLJJJJLIIL = 0.0f;
                        c1775090wIF2.LLJJL = 0.0f;
                        c1775090wIF2.LJIIJ(c1775100wIG2);
                    }
                    Function1<? super Boolean, Unit> function1 = c1775090wIF2.LLJJJIL;
                    if (function1 != null) {
                        c1775090wIF2.LLJJJIL = null;
                        function1.invoke(Boolean.TRUE);
                    }
                }
            }
        });
        valueAnimatorOfFloat.start();
        c1775090wIF.LLJJJ = valueAnimatorOfFloat;
    }

    public ALAdapterS1S0201000_26(int i, C1775090wIF c1775090wIF, C1775100wIG c1775100wIG, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = c1775090wIF;
        this.l1 = c1775100wIG;
    }
}
