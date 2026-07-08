package Y;

import X.C19407110wH;
import X.C19407310wJ;
import X.C19407410wK;
import X.C19417010xs;
import X.C19417110xt;
import X.C19670811xi;
import android.animation.ValueAnimator;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS231S0200000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        ((C19407310wJ) aUListenerS231S0200000_29.l1).LLIZ.setProgressIfCircle(((Float) ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        ((C19407110wH) aUListenerS231S0200000_29.l1).LLIZLLLIL.setProgressIfCircle(((Float) ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$2(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        ((C19407410wK) aUListenerS231S0200000_29.l1).LLJI.setProgressIfCircle(((Float) ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        if (((CreativeDialogWrapper) aUListenerS231S0200000_29.l0).isShowing()) {
            ((CreativeDialogWrapper) aUListenerS231S0200000_29.l0).updateProgress(((Integer) ((ValueAnimator) aUListenerS231S0200000_29.l1).getAnimatedValue()).intValue(), true);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        if (((CreativeDialogWrapper) aUListenerS231S0200000_29.l0).isShowing()) {
            ((CreativeDialogWrapper) aUListenerS231S0200000_29.l0).updateProgress(((Integer) ((ValueAnimator) aUListenerS231S0200000_29.l1).getAnimatedValue()).intValue(), true);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue()).floatValue();
        C19670811xi c19670811xi = ((C19417010xs) aUListenerS231S0200000_29.l1).LLJILJILJ;
        if (c19670811xi != null) {
            c19670811xi.setProgressIfCircle(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C19417110xt) aUListenerS231S0200000_29.l1).LLILZ.setProgressIfCircle(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS231S0200000_29 aUListenerS231S0200000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) ((ValueAnimator) aUListenerS231S0200000_29.l0).getAnimatedValue()).floatValue();
        C19670811xi c19670811xi = ((InstantCloneRecordFragment) aUListenerS231S0200000_29.l1).LLJIJIL;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        c19670811xi.setProgressIfCircle(fFloatValue);
    }

    public AUListenerS231S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
