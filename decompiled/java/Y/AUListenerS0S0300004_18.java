package Y;

import X.C19HL;
import X.C2188811AlT;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;

/* JADX INFO: loaded from: classes19.dex */
public class AUListenerS0S0300004_18 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0300004_18 aUListenerS0S0300004_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (Float.isNaN(fFloatValue)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnim value: ");
        sbLIZ.append(fFloatValue);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = ((PoiRecommendDishesDetailFragment) aUListenerS0S0300004_18.l0).LLJILJIL;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        ViewGroup viewGroup = ((PoiRecommendDishesDetailFragment) aUListenerS0S0300004_18.l0).LLJILLL;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
        C786410Ut5.T4((View) aUListenerS0S0300004_18.l1, fFloatValue);
        C19HL c19hl = (C19HL) aUListenerS0S0300004_18.l2;
        float f2 = aUListenerS0S0300004_18.f3;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl);
        c19hl.setTranslationX(f2 - (fFloatValue * f2));
        C19HL c19hl2 = (C19HL) aUListenerS0S0300004_18.l2;
        float f3 = aUListenerS0S0300004_18.f4;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl2);
        c19hl2.setTranslationY(f3 - (fFloatValue * f3));
        C19HL c19hl3 = (C19HL) aUListenerS0S0300004_18.l2;
        float f4 = aUListenerS0S0300004_18.f5;
        float f5 = 1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl3);
        c19hl3.setScaleX(f4 + ((f5 - f4) * fFloatValue));
        C19HL c19hl4 = (C19HL) aUListenerS0S0300004_18.l2;
        float f6 = aUListenerS0S0300004_18.f6;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl4);
        c19hl4.setScaleY(f6 + (fFloatValue * (f5 - f6)));
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0300004_18 aUListenerS0S0300004_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (Float.isNaN(fFloatValue)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnim value: ");
        sbLIZ.append(fFloatValue);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = ((PoiDishesGalleryFragment) aUListenerS0S0300004_18.l0).LLJILJIL;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        ViewGroup viewGroup = ((PoiDishesGalleryFragment) aUListenerS0S0300004_18.l0).LLJILLL;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
        C786410Ut5.T4((View) aUListenerS0S0300004_18.l1, fFloatValue);
        C19HL c19hl = (C19HL) aUListenerS0S0300004_18.l2;
        float f2 = aUListenerS0S0300004_18.f3;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl);
        c19hl.setTranslationX(f2 - (fFloatValue * f2));
        C19HL c19hl2 = (C19HL) aUListenerS0S0300004_18.l2;
        float f3 = aUListenerS0S0300004_18.f4;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl2);
        c19hl2.setTranslationY(f3 - (fFloatValue * f3));
        C19HL c19hl3 = (C19HL) aUListenerS0S0300004_18.l2;
        float f4 = aUListenerS0S0300004_18.f5;
        float f5 = 1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl3);
        c19hl3.setScaleX(f4 + ((f5 - f4) * fFloatValue));
        C19HL c19hl4 = (C19HL) aUListenerS0S0300004_18.l2;
        float f6 = aUListenerS0S0300004_18.f6;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl4);
        c19hl4.setScaleY(f6 + (fFloatValue * (f5 - f6)));
    }

    public AUListenerS0S0300004_18(Object obj, Object obj2, Object obj3, float f, float f2, float f3, float f4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.f3 = f;
        this.f4 = f2;
        this.f5 = f3;
        this.f6 = f4;
    }
}
