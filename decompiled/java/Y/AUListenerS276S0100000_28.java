package Y;

import X.C16FB;
import X.C1898700zVc;
import X.C1905680zgs;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;

/* JADX INFO: loaded from: classes29.dex */
public class AUListenerS276S0100000_28 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationUpdate$6(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        ((MeasureLinearLayout) aUListenerS276S0100000_28.l0).getClass();
    }

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
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
        }
    }

    public AUListenerS276S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        ((C16FB) aUListenerS276S0100000_28.l0).setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        ((C1905680zgs) aUListenerS276S0100000_28.l0).LJJIJ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((C1905680zgs) aUListenerS276S0100000_28.l0).LLJILJIL);
    }

    public static final void onAnimationUpdate$2(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.3f) {
            fFloatValue = 0.3f;
        }
        LiveBubbleUtil.LIZ.getClass();
        View viewLIZLLL = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL != null) {
            C786410Ut5.Ob(viewLIZLLL, fFloatValue);
        }
        View viewLIZLLL2 = LiveBubbleUtil.LIZLLL();
        if (viewLIZLLL2 != null) {
            C786410Ut5.pc(viewLIZLLL2, fFloatValue);
        }
        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1905680zgs) aUListenerS276S0100000_28.l0).getClass();
        C1905680zgs.LJJIIZ(fFloatValue, fFloatValue2);
    }

    public static final void onAnimationUpdate$3(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1905680zgs) aUListenerS276S0100000_28.l0).getClass();
        C1905680zgs.LJJIIZ(0.3f + fFloatValue, fFloatValue);
    }

    public static final void onAnimationUpdate$4(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        C786410Ut5.T4(((C1905680zgs) aUListenerS276S0100000_28.l0).LLJ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS276S0100000_28 aUListenerS276S0100000_28, ValueAnimator valueAnimator) {
        ((C1898700zVc) aUListenerS276S0100000_28.l0).getCoinTextView().setText(valueAnimator.getAnimatedValue().toString());
    }

    public AUListenerS276S0100000_28(MeasureLinearLayout measureLinearLayout, boolean z, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = measureLinearLayout;
    }
}
