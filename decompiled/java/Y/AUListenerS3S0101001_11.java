package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS3S0101001_11 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
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

    public static final void onAnimationUpdate$0(AUListenerS3S0101001_11 aUListenerS3S0101001_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C786410Ut5.ed((View) aUListenerS3S0101001_11.l0, aUListenerS3S0101001_11.f2 - fFloatValue);
            if (fFloatValue >= aUListenerS3S0101001_11.i1) {
                ViewGroup.LayoutParams layoutParams = ((View) aUListenerS3S0101001_11.l0).getLayoutParams();
                layoutParams.height = (int) (fFloatValue - aUListenerS3S0101001_11.i1);
                C786410Ut5.W5((View) aUListenerS3S0101001_11.l0, layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS3S0101001_11 aUListenerS3S0101001_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C786410Ut5.ed((View) aUListenerS3S0101001_11.l0, aUListenerS3S0101001_11.f2 + fFloatValue);
            ViewGroup.LayoutParams layoutParams = ((View) aUListenerS3S0101001_11.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = aUListenerS3S0101001_11.i1 - ((int) fFloatValue);
            }
            C786410Ut5.W5((View) aUListenerS3S0101001_11.l0, marginLayoutParams);
        }
    }

    public AUListenerS3S0101001_11(float f, int i, View view, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.f2 = f;
        this.i1 = i;
    }
}
