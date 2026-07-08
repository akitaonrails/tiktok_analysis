package Y;

import X.C1753580vjY;
import X.C1754060vkK;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes27.dex */
public class AUListenerS2S0100002_26 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0100002_26 aUListenerS2S0100002_26, ValueAnimator valueAnimator) {
        if (((C1753580vjY) aUListenerS2S0100002_26.l0).LLILLL) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            C1753580vjY c1753580vjY = (C1753580vjY) aUListenerS2S0100002_26.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753580vjY);
            c1753580vjY.setAlpha(animatedFraction);
            C1753580vjY c1753580vjY2 = (C1753580vjY) aUListenerS2S0100002_26.l0;
            float f = (aUListenerS2S0100002_26.f1 * (1 - animatedFraction)) + aUListenerS2S0100002_26.f2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753580vjY2);
            c1753580vjY2.setTranslationY(f);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0100002_26 aUListenerS2S0100002_26, ValueAnimator valueAnimator) {
        if (((C1754060vkK) aUListenerS2S0100002_26.l0).LLILLL) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            C1754060vkK c1754060vkK = (C1754060vkK) aUListenerS2S0100002_26.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1754060vkK);
            c1754060vkK.setAlpha(animatedFraction);
            C1754060vkK c1754060vkK2 = (C1754060vkK) aUListenerS2S0100002_26.l0;
            float f = (aUListenerS2S0100002_26.f1 * (1 - animatedFraction)) + aUListenerS2S0100002_26.f2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1754060vkK2);
            c1754060vkK2.setTranslationY(f);
        }
    }

    public AUListenerS2S0100002_26(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
