package Y;

import X.C1846020y8e;
import X.C1846070y8j;
import X.C1846150y8r;
import X.C1846240y90;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS155S0300000_27 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS155S0300000_27 aUListenerS155S0300000_27, ValueAnimator valueAnimator) {
        ((C1846070y8j) aUListenerS155S0300000_27.l0).LIZIZ((View) aUListenerS155S0300000_27.l1, (View) aUListenerS155S0300000_27.l2, valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$1(AUListenerS155S0300000_27 aUListenerS155S0300000_27, ValueAnimator valueAnimator) {
        ((C1846150y8r) aUListenerS155S0300000_27.l0).LIZIZ((View) aUListenerS155S0300000_27.l1, (View) aUListenerS155S0300000_27.l2, valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$2(AUListenerS155S0300000_27 aUListenerS155S0300000_27, ValueAnimator valueAnimator) {
        ((C1846020y8e) aUListenerS155S0300000_27.l0).LIZIZ((View) aUListenerS155S0300000_27.l1, (View) aUListenerS155S0300000_27.l2, valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$3(AUListenerS155S0300000_27 aUListenerS155S0300000_27, ValueAnimator valueAnimator) {
        ((C1846240y90) aUListenerS155S0300000_27.l0).LIZIZ((View) aUListenerS155S0300000_27.l1, (View) aUListenerS155S0300000_27.l2, valueAnimator.getAnimatedFraction());
    }

    public AUListenerS155S0300000_27(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
