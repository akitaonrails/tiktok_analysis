package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS75S0110000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void onAnimationUpdate$0(AUListenerS75S0110000_6 aUListenerS75S0110000_6, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            View view = (View) aUListenerS75S0110000_6.l0;
            boolean z = aUListenerS75S0110000_6.z1;
            float fIntValue = num.intValue();
            if (z) {
                fIntValue *= -1.0f;
            }
            C786410Ut5.Jc(view, fIntValue);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS75S0110000_6 aUListenerS75S0110000_6, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            View view = (View) aUListenerS75S0110000_6.l0;
            boolean z = aUListenerS75S0110000_6.z1;
            float fIntValue = num.intValue();
            if (z) {
                fIntValue *= -1.0f;
            }
            C786410Ut5.Jc(view, fIntValue);
        }
    }

    public AUListenerS75S0110000_6(View view, boolean z, int i) {
        this.$t = i;
        this.l0 = view;
        this.z1 = z;
    }
}
