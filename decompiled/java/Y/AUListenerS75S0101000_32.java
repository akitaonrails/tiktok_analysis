package Y;

import X.AnonymousClass1863;
import X.C20441214yg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C978750bZp;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS75S0101000_32 implements ValueAnimator.AnimatorUpdateListener {
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
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        int iIntValue = aUListenerS75S0101000_32.i1 + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout linearLayout = ((C978750bZp) aUListenerS75S0101000_32.l0).LJIIIIZZ;
        if (linearLayout == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorEndFir, newGiftSelectLl is null");
        } else {
            C500260Jjc.LJLJL(iIntValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        int iIntValue = aUListenerS75S0101000_32.i1 - ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout linearLayout = ((C978750bZp) aUListenerS75S0101000_32.l0).LJII;
        if (linearLayout == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorEndSec, giftSelectLl is null");
        } else {
            C500260Jjc.LJJLJ(iIntValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        int iIntValue = aUListenerS75S0101000_32.i1 + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout linearLayout = ((C978750bZp) aUListenerS75S0101000_32.l0).LJII;
        if (linearLayout == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorStartFir, giftSelectLl is null");
        } else {
            C500260Jjc.LJJLJ(iIntValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        int iIntValue = aUListenerS75S0101000_32.i1 - ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout linearLayout = ((C978750bZp) aUListenerS75S0101000_32.l0).LJIIIIZZ;
        if (linearLayout == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorStartSec, newGiftSelectLl is null");
        } else {
            C500260Jjc.LJLJL(iIntValue, linearLayout);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        ((AnonymousClass1863) aUListenerS75S0101000_32.l0).LJIJ().setClipBounds(new Rect(0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), aUListenerS75S0101000_32.i1));
    }

    public static final void onAnimationUpdate$5(AUListenerS75S0101000_32 aUListenerS75S0101000_32, ValueAnimator valueAnimator) {
        C786410Ut5.ed((View) aUListenerS75S0101000_32.l0, aUListenerS75S0101000_32.i1 * (1 - valueAnimator.getAnimatedFraction()));
    }

    public AUListenerS75S0101000_32(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
