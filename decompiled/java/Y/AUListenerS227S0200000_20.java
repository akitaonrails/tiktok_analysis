package Y;

import X.C013C;
import X.C1295960jpS;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes21.dex */
public class AUListenerS227S0200000_20 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS227S0200000_20 aUListenerS227S0200000_20, ValueAnimator valueAnimator) {
        if (((C013C) aUListenerS227S0200000_20.l0).element) {
            ((C1295960jpS) aUListenerS227S0200000_20.l1).setFrame(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        ((C013C) aUListenerS227S0200000_20.l0).element = !r1.element;
    }

    public static final void onAnimationUpdate$1(AUListenerS227S0200000_20 aUListenerS227S0200000_20, ValueAnimator valueAnimator) {
        Integer num;
        if (((C013C) aUListenerS227S0200000_20.l0).element) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                ((C1295960jpS) aUListenerS227S0200000_20.l1).setFrame(num.intValue());
            }
        }
        ((C013C) aUListenerS227S0200000_20.l0).element = !r1.element;
    }

    public AUListenerS227S0200000_20(C013C c013c, C1295960jpS c1295960jpS, int i) {
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c1295960jpS;
    }
}
