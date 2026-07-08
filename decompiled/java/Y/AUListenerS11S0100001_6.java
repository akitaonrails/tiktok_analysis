package Y;

import X.C1609220ryi;
import X.C1609500rzA;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS11S0100001_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
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

    public static final void onAnimationUpdate$0(AUListenerS11S0100001_6 aUListenerS11S0100001_6, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C1609220ryi c1609220ryi = (C1609220ryi) aUListenerS11S0100001_6.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = aUListenerS11S0100001_6.f1;
        }
        c1609220ryi.LLJILJIL = fFloatValue;
        ((C1609220ryi) aUListenerS11S0100001_6.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS11S0100001_6 aUListenerS11S0100001_6, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C1609500rzA c1609500rzA = (C1609500rzA) aUListenerS11S0100001_6.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = aUListenerS11S0100001_6.f1;
        }
        c1609500rzA.LLJJIJI = fFloatValue;
        ((C1609500rzA) aUListenerS11S0100001_6.l0).invalidate();
    }

    public AUListenerS11S0100001_6(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
