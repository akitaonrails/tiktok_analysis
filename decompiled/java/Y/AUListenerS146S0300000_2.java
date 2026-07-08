package Y;

import X.C013C;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AUListenerS146S0300000_2 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS146S0300000_2 aUListenerS146S0300000_2, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) ((ValueAnimator) aUListenerS146S0300000_2.l0).getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS146S0300000_2.l1;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = iIntValue;
        }
        C786410Ut5.W5((View) aUListenerS146S0300000_2.l2, (ViewGroup.MarginLayoutParams) aUListenerS146S0300000_2.l1);
    }

    public static final void onAnimationUpdate$1(AUListenerS146S0300000_2 aUListenerS146S0300000_2, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS146S0300000_2.l0).getLayoutParams();
        layoutParams.height = iIntValue;
        C786410Ut5.W5((View) aUListenerS146S0300000_2.l0, layoutParams);
        if (((C013C) aUListenerS146S0300000_2.l1).element) {
            Function0 function0 = (Function0) aUListenerS146S0300000_2.l2;
            if (function0 != null) {
                function0.invoke();
            }
            ((C013C) aUListenerS146S0300000_2.l1).element = false;
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS146S0300000_2 aUListenerS146S0300000_2, ValueAnimator valueAnimator) {
        if (!((View) aUListenerS146S0300000_2.l0).isAttachedToWindow()) {
            ((ValueAnimator) aUListenerS146S0300000_2.l1).cancel();
            return;
        }
        ((ViewGroup.LayoutParams) aUListenerS146S0300000_2.l2).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS146S0300000_2.l0).requestLayout();
    }

    public AUListenerS146S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
