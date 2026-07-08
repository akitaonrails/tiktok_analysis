package Y;

import X.C2261111Den;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes36.dex */
public class AUListenerS5S0100002_35 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final void onAnimationUpdate$0(AUListenerS5S0100002_35 aUListenerS5S0100002_35, ValueAnimator valueAnimator) {
        C786410Ut5.Fd(((C2261111Den) aUListenerS5S0100002_35.l0).LIZ, aUListenerS5S0100002_35.f1 + (aUListenerS5S0100002_35.f2 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$1(AUListenerS5S0100002_35 aUListenerS5S0100002_35, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = ((C2261111Den) aUListenerS5S0100002_35.l0).LIZ;
        float f = aUListenerS5S0100002_35.f1;
        C786410Ut5.Fd(view, f + ((aUListenerS5S0100002_35.f2 - f) * fFloatValue));
    }

    public static final void onAnimationUpdate$2(AUListenerS5S0100002_35 aUListenerS5S0100002_35, ValueAnimator valueAnimator) {
        C786410Ut5.Fd(((C2261111Den) aUListenerS5S0100002_35.l0).LIZ, aUListenerS5S0100002_35.f1 + (aUListenerS5S0100002_35.f2 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$3(AUListenerS5S0100002_35 aUListenerS5S0100002_35, ValueAnimator valueAnimator) {
        C786410Ut5.Fd(((C2261111Den) aUListenerS5S0100002_35.l0).LIZ, aUListenerS5S0100002_35.f1 + (aUListenerS5S0100002_35.f2 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public AUListenerS5S0100002_35(C2261111Den c2261111Den, float f, float f2, int i) {
        this.$t = i;
        this.l0 = c2261111Den;
        this.f1 = f;
        this.f2 = f2;
    }
}
