package Y;

import X.C0H1U;
import X.C1751830vgj;
import X.C197039127h;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV2VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS20S0102000_32 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS20S0102000_32 aUListenerS20S0102000_32, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C197039127h c197039127hQ6 = ((USSESSellerModuleV2VH) aUListenerS20S0102000_32.l0).q6();
        if (c197039127hQ6 != null) {
            ViewGroup.LayoutParams layoutParams = c197039127hQ6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
            c197039127hQ6.requestLayout();
        }
        C1751830vgj c1751830vgjF6 = ((USSESSellerModuleV2VH) aUListenerS20S0102000_32.l0).f6();
        if (c1751830vgjF6 != null) {
            int i = aUListenerS20S0102000_32.i1;
            int i2 = aUListenerS20S0102000_32.i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1751830vgjF6);
            c1751830vgjF6.setAlpha(1.0f - ((iIntValue - i) / (i2 - i)));
            if (iIntValue == i2) {
                C0H1U.LIZIZ(c1751830vgjF6);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS20S0102000_32 aUListenerS20S0102000_32, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C197039127h c197039127hI6 = ((USSESSellerModuleVH) aUListenerS20S0102000_32.l0).i6();
        if (c197039127hI6 != null) {
            ViewGroup.LayoutParams layoutParams = c197039127hI6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
            c197039127hI6.requestLayout();
        }
        C1751830vgj c1751830vgjE6 = ((USSESSellerModuleVH) aUListenerS20S0102000_32.l0).e6();
        if (c1751830vgjE6 != null) {
            int i = aUListenerS20S0102000_32.i1;
            int i2 = aUListenerS20S0102000_32.i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1751830vgjE6);
            c1751830vgjE6.setAlpha(1.0f - ((iIntValue - i) / (i2 - i)));
            if (iIntValue == i2) {
                C0H1U.LIZIZ(c1751830vgjE6);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS20S0102000_32 aUListenerS20S0102000_32, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C197039127h c197039127hA7 = ((USSESSellerModuleV3VH) aUListenerS20S0102000_32.l0).a7();
        if (c197039127hA7 != null) {
            ViewGroup.LayoutParams layoutParams = c197039127hA7.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
            c197039127hA7.requestLayout();
        }
        C1751830vgj c1751830vgjT6 = ((USSESSellerModuleV3VH) aUListenerS20S0102000_32.l0).T6();
        if (c1751830vgjT6 != null) {
            int i = aUListenerS20S0102000_32.i1;
            int i2 = aUListenerS20S0102000_32.i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1751830vgjT6);
            c1751830vgjT6.setAlpha(1.0f - ((iIntValue - i) / (i2 - i)));
            if (iIntValue == i2) {
                C0H1U.LIZIZ(c1751830vgjT6);
            }
        }
    }

    public AUListenerS20S0102000_32(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
