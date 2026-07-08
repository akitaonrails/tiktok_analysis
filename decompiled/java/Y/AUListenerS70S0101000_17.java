package Y;

import X.C1146260fw0;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordTipCell;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS70S0101000_17 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS70S0101000_17 aUListenerS70S0101000_17, ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * aUListenerS70S0101000_17.i1);
        if (iFloatValue > 0) {
            ((AnchorRecordTipCell) aUListenerS70S0101000_17.l0).itemView.getLayoutParams().height = iFloatValue;
            ((AnchorRecordTipCell) aUListenerS70S0101000_17.l0).itemView.requestLayout();
        } else {
            C500260Jjc.LJIILLIIL(((AnchorRecordTipCell) aUListenerS70S0101000_17.l0).itemView);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS70S0101000_17 aUListenerS70S0101000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.T4((View) aUListenerS70S0101000_17.l0, fFloatValue);
        C786410Ut5.ed((View) aUListenerS70S0101000_17.l0, aUListenerS70S0101000_17.i1 * (1 - fFloatValue));
    }

    public static final void onAnimationUpdate$2(AUListenerS70S0101000_17 aUListenerS70S0101000_17, ValueAnimator valueAnimator) {
        if (((C1146260fw0) aUListenerS70S0101000_17.l0).LLJILLL == null) {
            return;
        }
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        HorizontalScrollView horizontalScrollView = ((C1146260fw0) aUListenerS70S0101000_17.l0).LLJILLL;
        if (horizontalScrollView != null) {
            int scrollX = iIntValue - horizontalScrollView.getScrollX();
            if (C497740JfY.LJJ()) {
                HorizontalScrollView horizontalScrollView2 = ((C1146260fw0) aUListenerS70S0101000_17.l0).LLJILLL;
                if (horizontalScrollView2 != null) {
                    horizontalScrollView2.scrollTo(aUListenerS70S0101000_17.i1 - ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            HorizontalScrollView horizontalScrollView3 = ((C1146260fw0) aUListenerS70S0101000_17.l0).LLJILLL;
            if (horizontalScrollView3 != null) {
                horizontalScrollView3.scrollBy(scrollX, 0);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public AUListenerS70S0101000_17(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
