package Y;

import X.C616140OEq;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class AUListenerS2S0303000_9 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0303000_9 aUListenerS2S0303000_9, ValueAnimator valueAnimator) {
        if (((C616140OEq) aUListenerS2S0303000_9.l0).LIZJ == null || ((View) aUListenerS2S0303000_9.l1) == null) {
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        C786410Ut5.T4((View) aUListenerS2S0303000_9.l1, f);
        int i = (int) (animatedFraction * aUListenerS2S0303000_9.i3);
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS2S0303000_9.l1).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (f * aUListenerS2S0303000_9.i3);
        }
        int i2 = aUListenerS2S0303000_9.i4 - i;
        ViewGroup.LayoutParams layoutParams2 = ((View) aUListenerS2S0303000_9.l2).getLayoutParams();
        if (layoutParams2 != null) {
            int i3 = aUListenerS2S0303000_9.i5;
            if (i2 < i3) {
                i2 = i3;
            }
            layoutParams2.width = i2;
        }
        View view = ((C616140OEq) aUListenerS2S0303000_9.l0).LIZJ;
        if (view != null) {
            view.requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0303000_9 aUListenerS2S0303000_9, ValueAnimator valueAnimator) {
        if (((C616140OEq) aUListenerS2S0303000_9.l0).LIZJ == null || ((LinearLayout) aUListenerS2S0303000_9.l1) == null) {
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C786410Ut5.W4((LinearLayout) aUListenerS2S0303000_9.l1, animatedFraction);
        int i = (int) ((aUListenerS2S0303000_9.i3 * animatedFraction) + aUListenerS2S0303000_9.i4);
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS2S0303000_9.l2).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        int i2 = (int) ((animatedFraction * aUListenerS2S0303000_9.i5) + aUListenerS2S0303000_9.i4);
        ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) aUListenerS2S0303000_9.l1).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i2;
        }
        View view = ((C616140OEq) aUListenerS2S0303000_9.l0).LIZJ;
        if (view != null) {
            view.requestLayout();
        }
    }

    public AUListenerS2S0303000_9(Object obj, Object obj2, int i, int i2, Object obj3, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = obj3;
        this.i5 = i3;
    }
}
