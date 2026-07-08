package Y;

import X.C616140OEq;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class AUListenerS77S0110000_9 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS77S0110000_9 aUListenerS77S0110000_9, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        View view = ((C616140OEq) aUListenerS77S0110000_9.l0).LIZJ;
        if (view != null) {
            if (!aUListenerS77S0110000_9.z1) {
                animatedFraction = 1.0f - animatedFraction;
            }
            C786410Ut5.T4(view, animatedFraction);
        }
        View view2 = ((C616140OEq) aUListenerS77S0110000_9.l0).LIZJ;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS77S0110000_9 aUListenerS77S0110000_9, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        LinearLayout linearLayout = ((C616140OEq) aUListenerS77S0110000_9.l0).LIZLLL;
        if (linearLayout != null) {
            if (!aUListenerS77S0110000_9.z1) {
                animatedFraction = 1.0f - animatedFraction;
            }
            C786410Ut5.W4(linearLayout, animatedFraction);
        }
        LinearLayout linearLayout2 = ((C616140OEq) aUListenerS77S0110000_9.l0).LIZLLL;
        if (linearLayout2 != null) {
            linearLayout2.requestLayout();
        }
    }

    public AUListenerS77S0110000_9(C616140OEq c616140OEq, boolean z, int i) {
        this.$t = i;
        this.l0 = c616140OEq;
        this.z1 = z;
    }
}
