package Y;

import X.C23118094a;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import android.widget.ImageView;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS1S0400001_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f4;
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

    public static final void onAnimationUpdate$0(AUListenerS1S0400001_6 aUListenerS1S0400001_6, ValueAnimator valueAnimator) {
        if (!C23118094a.LJIIIIZZ((CoroutineContext) aUListenerS1S0400001_6.l0)) {
            ((ValueAnimator) aUListenerS1S0400001_6.l1).cancel();
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = new float[2];
        ((PathMeasure) aUListenerS1S0400001_6.l3).getPosTan(fFloatValue, fArr, null);
        C786410Ut5.Lc((ImageView) aUListenerS1S0400001_6.l2, fArr[0]);
        C786410Ut5.gd((ImageView) aUListenerS1S0400001_6.l2, fArr[1]);
        float f = aUListenerS1S0400001_6.f4;
        float f2 = (f - ((2 * fFloatValue) / 3)) / f;
        C786410Ut5.Qb((ImageView) aUListenerS1S0400001_6.l2, f2);
        C786410Ut5.rc((ImageView) aUListenerS1S0400001_6.l2, f2);
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0400001_6 aUListenerS1S0400001_6, ValueAnimator valueAnimator) {
        if (!C23118094a.LJIIIIZZ((CoroutineContext) aUListenerS1S0400001_6.l0)) {
            ((ValueAnimator) aUListenerS1S0400001_6.l1).cancel();
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = new float[2];
        ((PathMeasure) aUListenerS1S0400001_6.l3).getPosTan(fFloatValue, fArr, null);
        C786410Ut5.Lc((ImageView) aUListenerS1S0400001_6.l2, fArr[0]);
        C786410Ut5.gd((ImageView) aUListenerS1S0400001_6.l2, fArr[1]);
        float f = aUListenerS1S0400001_6.f4;
        float f2 = (f - ((2 * fFloatValue) / 3)) / f;
        C786410Ut5.Qb((ImageView) aUListenerS1S0400001_6.l2, f2);
        C786410Ut5.rc((ImageView) aUListenerS1S0400001_6.l2, f2);
    }

    public AUListenerS1S0400001_6(CoroutineContext coroutineContext, ValueAnimator valueAnimator, ImageView imageView, float f, PathMeasure pathMeasure, int i) {
        this.$t = i;
        this.l0 = coroutineContext;
        this.l1 = valueAnimator;
        this.l2 = imageView;
        this.f4 = f;
        this.l3 = pathMeasure;
    }
}
