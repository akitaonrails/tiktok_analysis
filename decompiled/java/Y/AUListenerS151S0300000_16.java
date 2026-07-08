package Y;

import X.C1017680cac;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS151S0300000_16 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS151S0300000_16 aUListenerS151S0300000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS151S0300000_16.l0;
        if (view != null) {
            C1017680cac c1017680cac = (C1017680cac) aUListenerS151S0300000_16.l1;
            Drawable drawable = (Drawable) aUListenerS151S0300000_16.l2;
            c1017680cac.getClass();
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(iIntValue);
            }
            view.setBackground(drawable);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS151S0300000_16 aUListenerS151S0300000_16, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS151S0300000_16.l0).height = ((Integer) ((ValueAnimator) aUListenerS151S0300000_16.l1).getAnimatedValue()).intValue();
        C786410Ut5.a6((FrameLayout) aUListenerS151S0300000_16.l2, (ViewGroup.LayoutParams) aUListenerS151S0300000_16.l0);
    }

    public static final void onAnimationUpdate$2(AUListenerS151S0300000_16 aUListenerS151S0300000_16, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS151S0300000_16.l0).height = ((Integer) ((ValueAnimator) aUListenerS151S0300000_16.l1).getAnimatedValue()).intValue();
        C786410Ut5.a6((FrameLayout) aUListenerS151S0300000_16.l2, (ViewGroup.LayoutParams) aUListenerS151S0300000_16.l0);
    }

    public AUListenerS151S0300000_16(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
