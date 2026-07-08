package Y;

import X.C1088810eRL;
import X.C1096340edU;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS15S0102000_17 implements ValueAnimator.AnimatorUpdateListener {
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS15S0102000_17 aUListenerS15S0102000_17, ValueAnimator valueAnimator) {
        C786410Ut5.od(((C1088810eRL) aUListenerS15S0102000_17.l0).LLILLJJLI, r0.getHeight() * ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.od(((C1088810eRL) aUListenerS15S0102000_17.l0).LLILLL, r0.getHeight() * (1 - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * (-1.0f));
        C1088810eRL c1088810eRL = (C1088810eRL) aUListenerS15S0102000_17.l0;
        ViewGroup.LayoutParams layoutParams = c1088810eRL.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (aUListenerS15S0102000_17.i1 + ((aUListenerS15S0102000_17.i2 - r1) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        } else {
            layoutParams = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088810eRL);
        c1088810eRL.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS15S0102000_17 aUListenerS15S0102000_17, ValueAnimator valueAnimator) {
        C1096340edU c1096340edU = (C1096340edU) aUListenerS15S0102000_17.l0;
        int i = aUListenerS15S0102000_17.i1;
        int i2 = aUListenerS15S0102000_17.i2;
        c1096340edU.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = c1096340edU.LJ.getLayoutParams();
        int i3 = (int) (fFloatValue * i);
        layoutParams.width = i3;
        if (i3 <= i2) {
            layoutParams.height = i3;
        }
        C786410Ut5.X5(layoutParams, c1096340edU.LJ);
    }

    public static final void onAnimationUpdate$2(AUListenerS15S0102000_17 aUListenerS15S0102000_17, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            View view = (View) aUListenerS15S0102000_17.l0;
            int i = aUListenerS15S0102000_17.i1;
            int i2 = aUListenerS15S0102000_17.i2;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i + ((int) (i2 * fFloatValue));
                C786410Ut5.W5(view, layoutParams);
                C786410Ut5.T4((View) aUListenerS15S0102000_17.l0, fFloatValue);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public AUListenerS15S0102000_17(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
