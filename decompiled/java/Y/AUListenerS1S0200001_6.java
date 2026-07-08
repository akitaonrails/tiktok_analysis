package Y;

import X.C12ES;
import X.C421800GgM;
import X.C425820Gmq;
import X.C425830Gmr;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS1S0200001_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS1S0200001_6 aUListenerS1S0200001_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = (View) aUListenerS1S0200001_6.l0;
        if (view != null) {
            C786410Ut5.ed(view, aUListenerS1S0200001_6.f2 + fFloatValue);
        }
        View view2 = (View) aUListenerS1S0200001_6.l1;
        if (view2 != null) {
            C786410Ut5.ed(view2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0200001_6 aUListenerS1S0200001_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ed((View) aUListenerS1S0200001_6.l0, (1 - fFloatValue) * aUListenerS1S0200001_6.f2);
        View view = (View) aUListenerS1S0200001_6.l1;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS1S0200001_6 aUListenerS1S0200001_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C425820Gmq c425820Gmq = (C425820Gmq) aUListenerS1S0200001_6.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq);
        c425820Gmq.setAlpha(1.0f - fFloatValue);
        float f = 1.0f - (0.6f * fFloatValue);
        C425820Gmq c425820Gmq2 = (C425820Gmq) aUListenerS1S0200001_6.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq2);
        c425820Gmq2.setScaleX(f);
        C425820Gmq c425820Gmq3 = (C425820Gmq) aUListenerS1S0200001_6.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq3);
        c425820Gmq3.setScaleY(f);
        C425820Gmq c425820Gmq4 = (C425820Gmq) aUListenerS1S0200001_6.l0;
        float f2 = ((aUListenerS1S0200001_6.f2 * ((C425830Gmr) aUListenerS1S0200001_6.l1).LLILLL) / 2.0f) * fFloatValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq4);
        c425820Gmq4.setTranslationX(f2);
    }

    public static final void onAnimationUpdate$3(AUListenerS1S0200001_6 aUListenerS1S0200001_6, ValueAnimator valueAnimator) {
        C421800GgM c421800GgM = (C421800GgM) aUListenerS1S0200001_6.l0;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aUListenerS1S0200001_6.l1;
        float f = aUListenerS1S0200001_6.f2;
        c421800GgM.getClass();
        View view = viewHolder.itemView;
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        C786410Ut5.Jc(view, (1.0f - f2.floatValue()) * f);
        C786410Ut5.T4(view, (f2.floatValue() * 0.65999997f) + 0.34f);
        C786410Ut5.Ob(view, (f2.floatValue() * 0.100000024f) + 0.9f);
        C786410Ut5.pc(view, (f2.floatValue() * 0.100000024f) + 0.9f);
        float fLIZJ = 12.0f;
        float fFloatValue = (1.0f - f2.floatValue()) * 12.0f;
        if (viewHolder.itemView.getContext() != null) {
            fLIZJ = C12ES.LIZJ(fFloatValue, viewHolder.itemView.getContext());
        }
        C786410Ut5.ed(view, fLIZJ);
    }

    public AUListenerS1S0200001_6(Object obj, Object obj2, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f2 = f;
        this.l1 = obj2;
    }
}
