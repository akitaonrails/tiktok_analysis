package Y;

import X.C0FW6;
import X.C348440DlK;
import X.C390660FTk;
import X.C817403Hg;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AUListenerS3S0402000_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onAnimationUpdate$0(AUListenerS3S0402000_5 aUListenerS3S0402000_5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = C390660FTk.LIZIZ;
        float f2 = ((C817403Hg) aUListenerS3S0402000_5.l0).element;
        ((Function2) aUListenerS3S0402000_5.l1).invoke(Float.valueOf(f * (fFloatValue - f2) * aUListenerS3S0402000_5.i4), Float.valueOf(C390660FTk.LIZJ * (fFloatValue - f2) * aUListenerS3S0402000_5.i5));
        float f3 = (1 - fFloatValue) * C390660FTk.LIZLLL;
        if (!C390660FTk.LJ) {
            f3 = ((C348440DlK) aUListenerS3S0402000_5.l2).LJIIJ;
        }
        if (f3 == 0.0f) {
            f3 = 1.0E-4f;
        }
        C348440DlK c348440DlK = (C348440DlK) aUListenerS3S0402000_5.l2;
        c348440DlK.LJIIJ = f3;
        ((C0FW6) aUListenerS3S0402000_5.l3).LIZLLL(c348440DlK);
        ((C817403Hg) aUListenerS3S0402000_5.l0).element = fFloatValue;
    }

    public static final void onAnimationUpdate$1(AUListenerS3S0402000_5 aUListenerS3S0402000_5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = -C390660FTk.LIZIZ;
        float f2 = ((C817403Hg) aUListenerS3S0402000_5.l0).element;
        ((Function2) aUListenerS3S0402000_5.l1).invoke(Float.valueOf(f * (fFloatValue - f2) * aUListenerS3S0402000_5.i4), Float.valueOf((-C390660FTk.LIZJ) * (fFloatValue - f2) * aUListenerS3S0402000_5.i5));
        float f3 = C390660FTk.LIZLLL * fFloatValue;
        if (C390660FTk.LJ) {
            f3 = ((C348440DlK) aUListenerS3S0402000_5.l2).LJIIJ;
        }
        if (f3 == 0.0f) {
            f3 = 1.0E-4f;
        }
        C348440DlK c348440DlK = (C348440DlK) aUListenerS3S0402000_5.l2;
        c348440DlK.LJIIJ = f3;
        ((C0FW6) aUListenerS3S0402000_5.l3).LIZLLL(c348440DlK);
        ((C817403Hg) aUListenerS3S0402000_5.l0).element = fFloatValue;
    }

    public AUListenerS3S0402000_5(C817403Hg c817403Hg, int i, int i2, AObjectS361S0200000_29 aObjectS361S0200000_29, C348440DlK c348440DlK, C0FW6 c0fw6, int i3) {
        this.$t = i3;
        this.l0 = c817403Hg;
        this.i4 = i;
        this.i5 = i2;
        this.l1 = aObjectS361S0200000_29;
        this.l2 = c348440DlK;
        this.l3 = c0fw6;
    }
}
