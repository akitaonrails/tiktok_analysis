package Y;

import X.C19P3;
import X.C19P4;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS21S0102000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS21S0102000_33 aUListenerS21S0102000_33, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19P3 c19p3 = (C19P3) aUListenerS21S0102000_33.l0;
        c19p3.LLJJIJI = c19p3.LIZ((int) (aUListenerS21S0102000_33.i1 + ((aUListenerS21S0102000_33.i2 - r2) * fFloatValue)));
        ((C19P3) aUListenerS21S0102000_33.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS21S0102000_33 aUListenerS21S0102000_33, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19P4 c19p4 = (C19P4) aUListenerS21S0102000_33.l0;
        c19p4.LLJL = (int) (aUListenerS21S0102000_33.i1 + ((aUListenerS21S0102000_33.i2 - r2) * fFloatValue));
        c19p4.invalidate();
    }

    public AUListenerS21S0102000_33(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
