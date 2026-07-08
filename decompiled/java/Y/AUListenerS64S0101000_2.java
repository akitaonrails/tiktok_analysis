package Y;

import X.C1322110kVd;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class AUListenerS64S0101000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS64S0101000_2 aUListenerS64S0101000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS64S0101000_2.l0).getLayoutParams();
        int i = aUListenerS64S0101000_2.i1;
        layoutParams.width = (int) (i * fFloatValue);
        layoutParams.height = (int) (i * fFloatValue);
        C786410Ut5.W5((View) aUListenerS64S0101000_2.l0, layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS64S0101000_2 aUListenerS64S0101000_2, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS64S0101000_2.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (aUListenerS64S0101000_2.i1 + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void onAnimationUpdate$2(AUListenerS64S0101000_2 aUListenerS64S0101000_2, ValueAnimator valueAnimator) {
        if (aUListenerS64S0101000_2.i1 > 0) {
            ((View) aUListenerS64S0101000_2.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        View view = (View) aUListenerS64S0101000_2.l0;
        float animatedFraction = 1.0f - (valueAnimator.getAnimatedFraction() * 2.0f);
        if (animatedFraction < 0.0f) {
            animatedFraction = 0.0f;
        }
        C786410Ut5.T4(view, animatedFraction);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS64S0101000_2(int r2, android.view.View r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS64S0101000_2.<init>(int, android.view.View, int):void");
    }

    public AUListenerS64S0101000_2(int i, C1322110kVd c1322110kVd, int i2) {
        this.$t = i2;
        this.l0 = c1322110kVd;
        this.i1 = i;
    }
}
