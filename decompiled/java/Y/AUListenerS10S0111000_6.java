package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS10S0111000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS10S0111000_6 aUListenerS10S0111000_6, ValueAnimator valueAnimator) {
        float f;
        int i = aUListenerS10S0111000_6.i2;
        View view = (View) aUListenerS10S0111000_6.l0;
        boolean z = aUListenerS10S0111000_6.z1;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = i;
        int i2 = (int) (f2 - (f2 * animatedFraction));
        if (z) {
            f = i2;
        } else {
            f = animatedFraction * (-i);
        }
        C786410Ut5.ed(view, f);
    }

    public static final void onAnimationUpdate$1(AUListenerS10S0111000_6 aUListenerS10S0111000_6, ValueAnimator valueAnimator) {
        float f;
        int i = aUListenerS10S0111000_6.i2;
        View view = (View) aUListenerS10S0111000_6.l0;
        boolean z = aUListenerS10S0111000_6.z1;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = i;
        int i2 = (int) (f2 - (f2 * animatedFraction));
        if (z) {
            f = i2;
        } else {
            f = animatedFraction * (-i);
        }
        C786410Ut5.ed(view, f);
    }

    public static final void onAnimationUpdate$2(AUListenerS10S0111000_6 aUListenerS10S0111000_6, ValueAnimator valueAnimator) {
        float f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = aUListenerS10S0111000_6.i2;
        int i2 = (int) (i - (i * animatedFraction));
        View view = (View) aUListenerS10S0111000_6.l0;
        if (aUListenerS10S0111000_6.z1) {
            f = i2;
        } else {
            f = animatedFraction * (-i);
        }
        C786410Ut5.ed(view, f);
    }

    public AUListenerS10S0111000_6(int i, View view, boolean z, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 1:
                this.i2 = i;
                this.l0 = view;
                this.z1 = z;
                break;
            default:
                this.i2 = i;
                this.l0 = view;
                this.z1 = z;
                break;
        }
    }
}
