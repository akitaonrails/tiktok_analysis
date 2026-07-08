package Y;

import X.C0HE1;
import X.C437600HDy;
import X.C453470HqL;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS66S0101000_6 implements ValueAnimator.AnimatorUpdateListener {
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS66S0101000_6 aUListenerS66S0101000_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.M5((C453470HqL) aUListenerS66S0101000_6.l0, fFloatValue);
        C453470HqL c453470HqL = (C453470HqL) aUListenerS66S0101000_6.l0;
        C786410Ut5.Bd(c453470HqL, c453470HqL.LLJILJILJ * (1.0f - fFloatValue));
        C453470HqL c453470HqL2 = (C453470HqL) aUListenerS66S0101000_6.l0;
        int i = (int) (aUListenerS66S0101000_6.i1 * fFloatValue);
        ViewGroup.LayoutParams layoutParams = c453470HqL2.getLayoutParams();
        if (i < 0) {
            i = 0;
        }
        layoutParams.height = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c453470HqL2);
        c453470HqL2.setLayoutParams(layoutParams);
        c453470HqL2.requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS66S0101000_6 aUListenerS66S0101000_6, ValueAnimator valueAnimator) {
        C437600HDy c437600HDy = (C437600HDy) aUListenerS66S0101000_6.l0;
        C0HE1[] c0he1Arr = c437600HDy.LLJJLIIIJLLLLLLLZ;
        if (c0he1Arr != null) {
            c0he1Arr[aUListenerS66S0101000_6.i1].LIZLLL = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            c437600HDy.invalidate();
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS66S0101000_6 aUListenerS66S0101000_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.M5((C453470HqL) aUListenerS66S0101000_6.l0, fFloatValue);
        C453470HqL c453470HqL = (C453470HqL) aUListenerS66S0101000_6.l0;
        C786410Ut5.Bd(c453470HqL, c453470HqL.LLJILJILJ * (1.0f - fFloatValue));
        C453470HqL c453470HqL2 = (C453470HqL) aUListenerS66S0101000_6.l0;
        int i = (int) (aUListenerS66S0101000_6.i1 * fFloatValue);
        ViewGroup.LayoutParams layoutParams = c453470HqL2.getLayoutParams();
        if (i < 0) {
            i = 0;
        }
        layoutParams.height = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c453470HqL2);
        c453470HqL2.setLayoutParams(layoutParams);
        c453470HqL2.requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS66S0101000_6 aUListenerS66S0101000_6, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        TextView textView = (TextView) aUListenerS66S0101000_6.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = aUListenerS66S0101000_6.i1;
        }
        textView.setTextColor(iIntValue);
    }

    public AUListenerS66S0101000_6(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
