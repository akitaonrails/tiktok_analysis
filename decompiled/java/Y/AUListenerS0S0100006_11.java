package Y;

import X.C0STE;
import X.C0STJ;
import X.C13LZ;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS0S0100006_11 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0100006_11 aUListenerS0S0100006_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = aUListenerS0S0100006_11.f1;
        float f2 = f + ((aUListenerS0S0100006_11.f2 - f) * fFloatValue);
        C786410Ut5.Ob(((C0STE) aUListenerS0S0100006_11.l0).LL, f2);
        C786410Ut5.pc(((C0STE) aUListenerS0S0100006_11.l0).LL, f2);
        View view = ((C0STE) aUListenerS0S0100006_11.l0).LL;
        float f3 = aUListenerS0S0100006_11.f3;
        C786410Ut5.Jc(view, f3 + ((aUListenerS0S0100006_11.f4 - f3) * fFloatValue));
        View view2 = ((C0STE) aUListenerS0S0100006_11.l0).LL;
        float f4 = aUListenerS0S0100006_11.f5;
        C786410Ut5.ed(view2, f4 + ((aUListenerS0S0100006_11.f6 - f4) * fFloatValue));
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0100006_11 aUListenerS0S0100006_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = aUListenerS0S0100006_11.f1;
        float f2 = f + ((aUListenerS0S0100006_11.f2 - f) * fFloatValue);
        C786410Ut5.Ob(((C0STE) aUListenerS0S0100006_11.l0).LL, f2);
        C786410Ut5.pc(((C0STE) aUListenerS0S0100006_11.l0).LL, f2);
        View view = ((C0STE) aUListenerS0S0100006_11.l0).LL;
        float f3 = aUListenerS0S0100006_11.f3;
        C786410Ut5.Jc(view, f3 + ((aUListenerS0S0100006_11.f4 - f3) * fFloatValue));
        View view2 = ((C0STE) aUListenerS0S0100006_11.l0).LL;
        float f4 = aUListenerS0S0100006_11.f5;
        C786410Ut5.ed(view2, f4 + ((aUListenerS0S0100006_11.f6 - f4) * fFloatValue));
        C0STE c0ste = (C0STE) aUListenerS0S0100006_11.l0;
        C0STJ c0stj = c0ste.LLILZ;
        float f5 = c0ste.LLLIIL;
        float f6 = f5 - 0.5f;
        float fLIZLLL = 0.0f;
        if (f6 > 0.0f) {
            fLIZLLL = C13LZ.LIZLLL((f5 - f2) / f6, 0.0f, 1.0f);
        }
        c0stj.n(fLIZLLL);
    }

    public AUListenerS0S0100006_11(float f, float f2, C0STE c0ste, float f3, float f4, float f5, float f6, int i) {
        this.$t = i;
        this.f1 = f;
        this.f2 = f2;
        this.l0 = c0ste;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.f6 = f6;
    }
}
