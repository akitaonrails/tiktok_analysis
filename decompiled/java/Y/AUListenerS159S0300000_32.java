package Y;

import X.AnonymousClass1844;
import X.AnonymousClass1862;
import X.AnonymousClass1865;
import X.C13LZ;
import X.C184Q;
import X.C184R;
import X.C184S;
import X.C185I;
import X.C212225183j;
import X.C21390118nL;
import X.C21408918qN;
import X.C21413418r6;
import X.C21511519Gn;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS159S0300000_32 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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

    public static final void onAnimationUpdate$0(AUListenerS159S0300000_32 aUListenerS159S0300000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        String str = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        AnonymousClass1862 anonymousClass1862 = (AnonymousClass1862) aUListenerS159S0300000_32.l0;
        TuxTextView tuxTextView = anonymousClass1862.LJIIIIZZ;
        if (tuxTextView != null) {
            AnonymousClass1844 anonymousClass1844 = (AnonymousClass1844) aUListenerS159S0300000_32.l1;
            List list = (List) aUListenerS159S0300000_32.l2;
            AnonymousClass1865 anonymousClass1865LJIIL = anonymousClass1862.LJIIL();
            C185I c185i = anonymousClass1862.LJIIJJI;
            if (c185i != null) {
                str = c185i.LIZLLL;
            }
            String str2 = anonymousClass1844.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            anonymousClass1865LJIIL.LJIIL(tuxTextView, str, str2, (AnonymousClass1844) ListProtector.get(list, iIntValue), anonymousClass1862.LIZJ);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS159S0300000_32 aUListenerS159S0300000_32, ValueAnimator valueAnimator) {
        ((ImageView) aUListenerS159S0300000_32.l2).setImageMatrix(C21511519Gn.LIZIZ(((Float) valueAnimator.getAnimatedValue()).floatValue(), (Matrix) aUListenerS159S0300000_32.l0, (Matrix) aUListenerS159S0300000_32.l1));
    }

    public static final void onAnimationUpdate$2(AUListenerS159S0300000_32 aUListenerS159S0300000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        String str = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C184R c184r = (C184R) aUListenerS159S0300000_32.l0;
        TuxTextView tuxTextView = c184r.LJIIJJI;
        if (tuxTextView != null) {
            C212225183j c212225183j = (C212225183j) aUListenerS159S0300000_32.l1;
            List list = (List) aUListenerS159S0300000_32.l2;
            C184Q c184qLJIIL = c184r.LJIIL();
            C184S c184s = c184r.LJIILJJIL;
            if (c184s != null) {
                str = c184s.LIZJ;
            }
            String str2 = c212225183j.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            c184qLJIIL.LJIIJJI(tuxTextView, str, str2, (C212225183j) ListProtector.get(list, iIntValue), c184r.LIZLLL);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS159S0300000_32 aUListenerS159S0300000_32, ValueAnimator valueAnimator) {
        ((ColorDrawable) aUListenerS159S0300000_32.l1).setAlpha(C13LZ.LJ((int) ((1.0f - ((ValueAnimator) aUListenerS159S0300000_32.l0).getAnimatedFraction()) * 0.3f * 255), 0, 255));
        ((C21390118nL) aUListenerS159S0300000_32.l2).invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS159S0300000_32 aUListenerS159S0300000_32, ValueAnimator valueAnimator) {
        if (((C21413418r6) aUListenerS159S0300000_32.l0).LIZIZ.computeScrollOffset()) {
            C21408918qN c21408918qN = (C21408918qN) aUListenerS159S0300000_32.l1;
            float currX = ((C21413418r6) aUListenerS159S0300000_32.l0).LIZIZ.getCurrX();
            float f = c21408918qN.LIZJ;
            c21408918qN.LIZIZ = Math.max((-f) - (Math.abs(f) * c21408918qN.LIZ), Math.min(Math.abs(c21408918qN.LIZJ) * c21408918qN.LIZ, currX));
            ((View) aUListenerS159S0300000_32.l2).postInvalidateOnAnimation();
            return;
        }
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            return;
        }
        valueAnimator.end();
    }

    public AUListenerS159S0300000_32(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
