package Y;

import X.C118300cf;
import X.C19QG;
import X.C19QH;
import X.C21561119Zp;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS160S0300000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS160S0300000_33 aUListenerS160S0300000_33, ValueAnimator valueAnimator) {
        ((C21561119Zp) aUListenerS160S0300000_33.l0).setInScroll(true);
        ((C118300cf) aUListenerS160S0300000_33.l1).element = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C118300cf c118300cf = (C118300cf) aUListenerS160S0300000_33.l2;
        int i = c118300cf.element;
        C118300cf c118300cf2 = (C118300cf) aUListenerS160S0300000_33.l1;
        int i2 = c118300cf2.element;
        if (i != i2) {
            C21561119Zp c21561119Zp = (C21561119Zp) aUListenerS160S0300000_33.l0;
            if (i2 > i + c21561119Zp.LLJJL) {
                c118300cf.element = i2;
                c21561119Zp.setAnimationY(c118300cf2.element);
                ((C21561119Zp) aUListenerS160S0300000_33.l0).invalidate();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS160S0300000_33 aUListenerS160S0300000_33, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.ed((View) aUListenerS160S0300000_33.l0, (-fFloatValue) * ((C19QH) aUListenerS160S0300000_33.l1).getHeight());
        C786410Ut5.ed(((C19QG) aUListenerS160S0300000_33.l2).LIZ, (1 - fFloatValue) * ((C19QH) aUListenerS160S0300000_33.l1).getHeight());
        ((View) aUListenerS160S0300000_33.l0).invalidate();
        ((C19QG) aUListenerS160S0300000_33.l2).LIZ.invalidate();
    }

    public AUListenerS160S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
