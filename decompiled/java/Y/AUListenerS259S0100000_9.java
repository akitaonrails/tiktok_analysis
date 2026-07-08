package Y;

import X.C2441009hQ;
import X.C418440Gaw;
import X.C619260OQq;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiCell;

/* JADX INFO: loaded from: classes10.dex */
public class AUListenerS259S0100000_9 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
        }
    }

    public AUListenerS259S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS259S0100000_9 aUListenerS259S0100000_9, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        GradientDrawable gradientDrawable = (GradientDrawable) ((BulletinEmojiCell) aUListenerS259S0100000_9.l0).LLIZ.getValue();
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(((BulletinEmojiCell) aUListenerS259S0100000_9.l0).P5(), (int) (((Number) r1.LLILZLL.getValue()).intValue() * (1 - fFloatValue))));
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS259S0100000_9 aUListenerS259S0100000_9, ValueAnimator valueAnimator) {
        ((View) aUListenerS259S0100000_9.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS259S0100000_9.l0).requestLayout();
    }

    public static final void onAnimationUpdate$2(AUListenerS259S0100000_9 aUListenerS259S0100000_9, ValueAnimator valueAnimator) {
        ((View) aUListenerS259S0100000_9.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS259S0100000_9.l0).requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS259S0100000_9 aUListenerS259S0100000_9, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.T4((View) aUListenerS259S0100000_9.l0, f.floatValue());
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS259S0100000_9 aUListenerS259S0100000_9, ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable = ((C619260OQq) aUListenerS259S0100000_9.l0).LLILZ;
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        ((C619260OQq) aUListenerS259S0100000_9.l0).invalidate();
    }
}
