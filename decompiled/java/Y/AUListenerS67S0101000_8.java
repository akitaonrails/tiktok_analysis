package Y;

import X.C529030Kov;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public class AUListenerS67S0101000_8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS67S0101000_8 aUListenerS67S0101000_8, ValueAnimator valueAnimator) {
        C529030Kov c529030Kov = (C529030Kov) aUListenerS67S0101000_8.l0;
        C786410Ut5.bd(((Float) valueAnimator.getAnimatedValue()).floatValue() * aUListenerS67S0101000_8.i1, c529030Kov.LLJJJJJIL);
    }

    public static final void onAnimationUpdate$1(AUListenerS67S0101000_8 aUListenerS67S0101000_8, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS67S0101000_8.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i = aUListenerS67S0101000_8.i1;
            View view = (View) aUListenerS67S0101000_8.l0;
            if (num != null) {
                marginLayoutParams.bottomMargin = i - num.intValue();
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    public AUListenerS67S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
