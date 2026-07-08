package Y;

import X.C1775090wIF;
import X.C1775100wIG;
import X.EnumC1775120wII;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes27.dex */
public class AUListenerS60S0201000_26 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS60S0201000_26 aUListenerS60S0201000_26, ValueAnimator valueAnimator) {
        int i = aUListenerS60S0201000_26.i2;
        C1775090wIF c1775090wIF = (C1775090wIF) aUListenerS60S0201000_26.l0;
        if (i != c1775090wIF.LLJJIJI) {
            return;
        }
        c1775090wIF.LLJJJJJIL = EnumC1775120wII.LLILZ;
        c1775090wIF.LLJJJJLIIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1775090wIF) aUListenerS60S0201000_26.l0).LJIIJ((C1775100wIG) aUListenerS60S0201000_26.l1);
    }

    public static final void onAnimationUpdate$1(AUListenerS60S0201000_26 aUListenerS60S0201000_26, ValueAnimator valueAnimator) {
        int i = aUListenerS60S0201000_26.i2;
        C1775090wIF c1775090wIF = (C1775090wIF) aUListenerS60S0201000_26.l0;
        if (i != c1775090wIF.LLJJIJI) {
            return;
        }
        c1775090wIF.LLJJJJJIL = EnumC1775120wII.LLILLJJLI;
        c1775090wIF.LLJJJJLIIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1775090wIF) aUListenerS60S0201000_26.l0).LJIIJ((C1775100wIG) aUListenerS60S0201000_26.l1);
    }

    public static final void onAnimationUpdate$2(AUListenerS60S0201000_26 aUListenerS60S0201000_26, ValueAnimator valueAnimator) {
        int i = aUListenerS60S0201000_26.i2;
        C1775090wIF c1775090wIF = (C1775090wIF) aUListenerS60S0201000_26.l0;
        if (i != c1775090wIF.LLJJIJI) {
            return;
        }
        c1775090wIF.LLJJJJJIL = EnumC1775120wII.LLILLL;
        c1775090wIF.LLJJJJLIIL = 1.0f;
        c1775090wIF.LLJJL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1775090wIF) aUListenerS60S0201000_26.l0).LJIIJ((C1775100wIG) aUListenerS60S0201000_26.l1);
    }

    public AUListenerS60S0201000_26(int i, C1775090wIF c1775090wIF, C1775100wIG c1775100wIG, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = c1775090wIF;
        this.l1 = c1775100wIG;
    }
}
