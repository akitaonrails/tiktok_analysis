package Y;

import X.C21511519Gn;
import X.C21665319qd;
import X.C21665419qe;
import X.C389830FQf;
import X.EnumC375190EnN;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS11S0600000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final void onAnimationUpdate$0(AUListenerS11S0600000_33 aUListenerS11S0600000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        RectF rectF = (RectF) aUListenerS11S0600000_33.l0;
        float f = rectF.left;
        Rect rect = (Rect) aUListenerS11S0600000_33.l1;
        float f2 = (rectF.top - rect.top) * animatedFraction;
        float f3 = (rectF.right - rect.right) * animatedFraction;
        float f4 = (rectF.bottom - rect.bottom) * animatedFraction;
        C389830FQf c389830FQfLLLLLLL = ((C21665419qe) aUListenerS11S0600000_33.l2).LLLLLLL();
        Rect rect2 = (Rect) aUListenerS11S0600000_33.l1;
        c389830FQfLLLLLLL.setRect(new RectF(rect2.left + ((f - rect.left) * animatedFraction), rect2.top + f2, rect2.right + f3, rect2.bottom + f4));
        ((C21665419qe) aUListenerS11S0600000_33.l2).LLLLLLLLLL().setImageMatrix(C21511519Gn.LIZIZ(animatedFraction, (Matrix) aUListenerS11S0600000_33.l3, (Matrix) aUListenerS11S0600000_33.l4));
        if (animatedFraction >= 1.0f) {
            ((C21665419qe) aUListenerS11S0600000_33.l2).LLLLLLL().setCropMode((EnumC375190EnN) aUListenerS11S0600000_33.l5);
            C21665419qe c21665419qe = (C21665419qe) aUListenerS11S0600000_33.l2;
            c21665419qe.LLJZ = true;
            c21665419qe.LLLILZJ = true;
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS11S0600000_33 aUListenerS11S0600000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        RectF rectF = (RectF) aUListenerS11S0600000_33.l0;
        float f = rectF.left;
        Rect rect = (Rect) aUListenerS11S0600000_33.l1;
        float f2 = (rectF.top - rect.top) * animatedFraction;
        float f3 = (rectF.right - rect.right) * animatedFraction;
        float f4 = (rectF.bottom - rect.bottom) * animatedFraction;
        C389830FQf c389830FQfLLLLLLLZIL = ((C21665319qd) aUListenerS11S0600000_33.l2).LLLLLLLZIL();
        Rect rect2 = (Rect) aUListenerS11S0600000_33.l1;
        c389830FQfLLLLLLLZIL.setRect(new RectF(rect2.left + ((f - rect.left) * animatedFraction), rect2.top + f2, rect2.right + f3, rect2.bottom + f4));
        ((C21665319qd) aUListenerS11S0600000_33.l2).LLLLLLZZ().setImageMatrix(C21511519Gn.LIZIZ(animatedFraction, (Matrix) aUListenerS11S0600000_33.l3, (Matrix) aUListenerS11S0600000_33.l4));
        if (animatedFraction >= 1.0f) {
            ((C21665319qd) aUListenerS11S0600000_33.l2).LLLLLLLZIL().setCropMode((EnumC375190EnN) aUListenerS11S0600000_33.l5);
            ((C21665319qd) aUListenerS11S0600000_33.l2).LLLLLL(true);
        }
    }

    public AUListenerS11S0600000_33(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
