package Y;

import X.C0E55;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public class AUListenerS55S0201000_5 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS55S0201000_5 aUListenerS55S0201000_5, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            float[] fArr = (float[]) aUListenerS55S0201000_5.l0;
            ((C0E55) aUListenerS55S0201000_5.l1).LJIILJJIL(fArr[0], fArr[1] - (aUListenerS55S0201000_5.i2 * fFloatValue), fArr[2], fArr[3], null);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS55S0201000_5 aUListenerS55S0201000_5, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            float[] fArr = (float[]) aUListenerS55S0201000_5.l0;
            ((C0E55) aUListenerS55S0201000_5.l1).LJIILJJIL(fArr[0], fArr[1] + (aUListenerS55S0201000_5.i2 * fFloatValue), fArr[2], fArr[3], null);
        }
    }

    public AUListenerS55S0201000_5(float[] fArr, int i, C0E55 c0e55, int i2) {
        this.$t = i2;
        this.l0 = fArr;
        this.i2 = i;
        this.l1 = c0e55;
    }
}
