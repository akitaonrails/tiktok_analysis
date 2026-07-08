package Y;

import X.C19PN;
import X.C19PO;
import X.C19PP;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS4S0100002_33 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS4S0100002_33 aUListenerS4S0100002_33, ValueAnimator valueAnimator) {
        ((C19PO) aUListenerS4S0100002_33.l0).LLJJIII = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19PO c19po = (C19PO) aUListenerS4S0100002_33.l0;
        c19po.LLJI = (aUListenerS4S0100002_33.f1 - c19po.LLJJIII) + aUListenerS4S0100002_33.f2;
        c19po.invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS4S0100002_33 aUListenerS4S0100002_33, ValueAnimator valueAnimator) {
        ((C19PP) aUListenerS4S0100002_33.l0).LLJJIII = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19PP c19pp = (C19PP) aUListenerS4S0100002_33.l0;
        c19pp.LLJI = (aUListenerS4S0100002_33.f1 - c19pp.LLJJIII) + aUListenerS4S0100002_33.f2;
        c19pp.invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS4S0100002_33 aUListenerS4S0100002_33, ValueAnimator valueAnimator) {
        ((C19PN) aUListenerS4S0100002_33.l0).LLJJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19PN c19pn = (C19PN) aUListenerS4S0100002_33.l0;
        c19pn.LLIZLLLIL = (aUListenerS4S0100002_33.f1 - c19pn.LLJJ) + aUListenerS4S0100002_33.f2;
        c19pn.invalidate();
    }

    public AUListenerS4S0100002_33(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
