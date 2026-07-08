package Y;

import X.C0PRV;
import X.C0Q5E;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class AUListenerS218S0200000_10 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationUpdate$0(AUListenerS218S0200000_10 aUListenerS218S0200000_10, ValueAnimator valueAnimator) {
        ((C0PRV) aUListenerS218S0200000_10.l0).LIZLLL(((Float) valueAnimator.getAnimatedValue()).floatValue());
        ((View) aUListenerS218S0200000_10.l1).requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS218S0200000_10 aUListenerS218S0200000_10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = new Matrix();
        C0Q5E c0q5e = (C0Q5E) aUListenerS218S0200000_10.l0;
        matrix.postScale(fFloatValue, c0q5e.LJFF, c0q5e.LJI, c0q5e.LJII);
        ((TextureView) aUListenerS218S0200000_10.l1).setTransform(matrix);
    }

    public static final void onAnimationUpdate$2(AUListenerS218S0200000_10 aUListenerS218S0200000_10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = new Matrix();
        C0Q5E c0q5e = (C0Q5E) aUListenerS218S0200000_10.l0;
        matrix.postScale(c0q5e.LJ, fFloatValue, c0q5e.LJI, c0q5e.LJII);
        ((TextureView) aUListenerS218S0200000_10.l1).setTransform(matrix);
    }

    public AUListenerS218S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
