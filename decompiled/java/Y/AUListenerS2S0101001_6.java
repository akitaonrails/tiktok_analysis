package Y;

import X.C20639615pa;
import X.C425830Gmr;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS2S0101001_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0101001_6 aUListenerS2S0101001_6, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        ViewGroup viewGroup = ((C20639615pa) aUListenerS2S0101001_6.l0).LLJJIJIL;
        if (viewGroup != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = aUListenerS2S0101001_6.f2;
            }
            C786410Ut5.bd(fFloatValue * aUListenerS2S0101001_6.i1, viewGroup);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0101001_6 aUListenerS2S0101001_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 1; i < aUListenerS2S0101001_6.i1; i++) {
            View view = (View) ListProtector.get(((C425830Gmr) aUListenerS2S0101001_6.l0).LLILZ, i);
            float f = aUListenerS2S0101001_6.f2 * ((C425830Gmr) aUListenerS2S0101001_6.l0).LLILLL * fFloatValue;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationX(f);
        }
    }

    public AUListenerS2S0101001_6(int i, Object obj, float f, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
        this.f2 = f;
    }
}
