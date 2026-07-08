package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class AUListenerS93S0400000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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

    public static final void onAnimationUpdate$0(AUListenerS93S0400000_4 aUListenerS93S0400000_4, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS93S0400000_4.l0;
        int i = -iIntValue;
        view.setPadding(i, view.getPaddingTop(), iIntValue, ((View) aUListenerS93S0400000_4.l0).getPaddingBottom());
        View view2 = (View) aUListenerS93S0400000_4.l1;
        view2.setPadding(i, view2.getPaddingTop(), iIntValue, ((View) aUListenerS93S0400000_4.l1).getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) aUListenerS93S0400000_4.l2).setMarginStart(iIntValue);
        C786410Ut5.W5((View) aUListenerS93S0400000_4.l3, (ViewGroup.MarginLayoutParams) aUListenerS93S0400000_4.l2);
    }

    public static final void onAnimationUpdate$1(AUListenerS93S0400000_4 aUListenerS93S0400000_4, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS93S0400000_4.l0;
        int i = -iIntValue;
        view.setPadding(iIntValue, view.getPaddingTop(), i, ((View) aUListenerS93S0400000_4.l0).getPaddingBottom());
        View view2 = (View) aUListenerS93S0400000_4.l1;
        view2.setPadding(iIntValue, view2.getPaddingTop(), i, ((View) aUListenerS93S0400000_4.l1).getPaddingBottom());
        ((ViewGroup.MarginLayoutParams) aUListenerS93S0400000_4.l2).setMarginStart(iIntValue);
        C786410Ut5.W5((View) aUListenerS93S0400000_4.l3, (ViewGroup.MarginLayoutParams) aUListenerS93S0400000_4.l2);
    }

    public AUListenerS93S0400000_4(View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, View view3, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = marginLayoutParams;
        this.l3 = view3;
    }
}
