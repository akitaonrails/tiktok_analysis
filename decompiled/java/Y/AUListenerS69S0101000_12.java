package Y;

import X.C1129860fVY;
import X.C19ME;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS69S0101000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final void onAnimationUpdate$0(AUListenerS69S0101000_12 aUListenerS69S0101000_12, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            View view = ((LiveMarketingWidget) aUListenerS69S0101000_12.l0).LL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = iIntValue;
                View view2 = ((LiveMarketingWidget) aUListenerS69S0101000_12.l0).LL;
                if (view2 != null) {
                    C786410Ut5.W5(view2, marginLayoutParams);
                }
                float f = iIntValue / aUListenerS69S0101000_12.i1;
                View view3 = ((LiveMarketingWidget) aUListenerS69S0101000_12.l0).LLILLJJLI;
                if (view3 != null) {
                    C786410Ut5.T4(view3, f);
                }
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS69S0101000_12 aUListenerS69S0101000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.T4(((C1129860fVY) aUListenerS69S0101000_12.l0).LLLLII, fFloatValue);
        int i = (int) (fFloatValue * aUListenerS69S0101000_12.i1);
        if (i > 0) {
            ((C1129860fVY) aUListenerS69S0101000_12.l0).LLLLII.getLayoutParams().height = i;
            ((C1129860fVY) aUListenerS69S0101000_12.l0).LLLLII.requestLayout();
        } else {
            C500260Jjc.LJIILLIIL(((C1129860fVY) aUListenerS69S0101000_12.l0).LLLLII);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS69S0101000_12 aUListenerS69S0101000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = ((PreviewRevisionMoreWidget) aUListenerS69S0101000_12.l0).LLJ;
        if (frameLayout != null) {
            C500260Jjc.LJJZ(aUListenerS69S0101000_12.i1 + ((int) fFloatValue), frameLayout);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS69S0101000_12 aUListenerS69S0101000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((PreviewRevisionMoreWidget) aUListenerS69S0101000_12.l0).getClass();
        FrameLayout frameLayout = ((PreviewRevisionMoreWidget) aUListenerS69S0101000_12.l0).LLJ;
        if (frameLayout != null) {
            C500260Jjc.LJJZ(aUListenerS69S0101000_12.i1 + ((int) fFloatValue), frameLayout);
        }
        if (fFloatValue >= C418440Gaw.LIZIZ(16)) {
            ((PreviewRevisionMoreWidget) aUListenerS69S0101000_12.l0).getClass();
            ((PreviewRevisionMoreWidget) aUListenerS69S0101000_12.l0).getClass();
        }
    }

    public AUListenerS69S0101000_12(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
