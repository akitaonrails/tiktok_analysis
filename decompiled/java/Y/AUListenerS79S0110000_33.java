package Y;

import X.AbstractC21570219bI;
import X.AbstractC21574719c1;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS79S0110000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS79S0110000_33 aUListenerS79S0110000_33, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        AbstractC21574719c1 abstractC21574719c1 = (AbstractC21574719c1) aUListenerS79S0110000_33.l0;
        if (aUListenerS79S0110000_33.z1) {
            fFloatValue = 1.0f - fFloatValue;
        }
        if (abstractC21574719c1.LLILZIL != null && abstractC21574719c1.LLILZLL != null && !abstractC21574719c1.LLIZ.isEmpty()) {
            Rect rectEvaluate = abstractC21574719c1.LLIZLLLIL.evaluate(fFloatValue, abstractC21574719c1.LLILZIL, abstractC21574719c1.LLIZ);
            Rect rectEvaluate2 = abstractC21574719c1.LLJ.evaluate(fFloatValue, abstractC21574719c1.LLILZLL, abstractC21574719c1.LLIZ);
            if (rectEvaluate != null && rectEvaluate2 != null) {
                if (Intrinsics.LJFF(rectEvaluate, abstractC21574719c1.LLIZ) && Intrinsics.LJFF(rectEvaluate2, abstractC21574719c1.LLIZ)) {
                    abstractC21574719c1.LLILLL = false;
                    abstractC21574719c1.LLILZ = false;
                    return;
                }
                abstractC21574719c1.LL.set(rectEvaluate);
                abstractC21574719c1.LLILLL = true;
                abstractC21574719c1.LLILLJJLI.set(rectEvaluate2);
                abstractC21574719c1.LLILZ = !Intrinsics.LJFF(abstractC21574719c1.LLILLJJLI, abstractC21574719c1.LL);
                abstractC21574719c1.invalidate();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS79S0110000_33 aUListenerS79S0110000_33, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC21570219bI abstractC21570219bI = (AbstractC21570219bI) aUListenerS79S0110000_33.l0;
        if (aUListenerS79S0110000_33.z1) {
            fFloatValue = 1.0f - fFloatValue;
        }
        abstractC21570219bI.LIZJ(fFloatValue);
    }

    public AUListenerS79S0110000_33(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
