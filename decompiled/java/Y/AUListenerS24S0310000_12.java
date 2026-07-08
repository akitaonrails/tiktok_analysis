package Y;

import X.C20441214yg;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS24S0310000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final void onAnimationUpdate$0(AUListenerS24S0310000_12 aUListenerS24S0310000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS24S0310000_12.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            boolean z = aUListenerS24S0310000_12.z3;
            View view = (View) aUListenerS24S0310000_12.l1;
            View view2 = (View) aUListenerS24S0310000_12.l2;
            float fFloatValue = f.floatValue();
            if (!z && view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
            if (view2 != null && view2.getVisibility() == 0) {
                C786410Ut5.T4(view2, fFloatValue);
            }
        }
        C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 1 16 ");
    }

    public static final void onAnimationUpdate$1(AUListenerS24S0310000_12 aUListenerS24S0310000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS24S0310000_12.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            boolean z = aUListenerS24S0310000_12.z3;
            View view = (View) aUListenerS24S0310000_12.l1;
            View view2 = (View) aUListenerS24S0310000_12.l2;
            float fFloatValue = f.floatValue();
            if (!z) {
                C786410Ut5.T4(view, f.floatValue());
            }
            if (view2.getVisibility() == 0) {
                C786410Ut5.T4(view2, fFloatValue);
            }
        }
        C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 1 16 ");
    }

    public AUListenerS24S0310000_12(ValueAnimator valueAnimator, boolean z, View view, View view2, int i) {
        this.$t = i;
        this.l0 = valueAnimator;
        this.z3 = z;
        this.l1 = view;
        this.l2 = view2;
    }
}
