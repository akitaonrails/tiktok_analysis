package Y;

import X.C1180060goW;
import X.C19HL;
import X.C19HN;
import X.C2188811AlT;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;

/* JADX INFO: loaded from: classes19.dex */
public class AUListenerS0S0302005_18 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f5;
    public float f6;
    public float f7;
    public float f8;
    public float f9;
    public int i3;
    public int i4;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0302005_18 aUListenerS0S0302005_18, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
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
        View view = ((PoiRecommendDishesDetailFragment) aUListenerS0S0302005_18.l0).LLJILJIL;
        if (view != null) {
            float f2 = aUListenerS0S0302005_18.f5;
            C786410Ut5.T4(view, f2 - (f2 * fFloatValue));
        }
        View view2 = (View) aUListenerS0S0302005_18.l1;
        float f3 = aUListenerS0S0302005_18.f5;
        C786410Ut5.T4(view2, f3 - (f3 * fFloatValue));
        C19HL c19hl = (C19HL) aUListenerS0S0302005_18.l2;
        float f4 = aUListenerS0S0302005_18.f6 * fFloatValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl);
        c19hl.setTranslationX(f4);
        C19HL c19hl2 = (C19HL) aUListenerS0S0302005_18.l2;
        float f5 = aUListenerS0S0302005_18.f7 * fFloatValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl2);
        c19hl2.setTranslationY(f5);
        float f6 = 1;
        C1180060goW.LJIIJJI((C19HL) aUListenerS0S0302005_18.l2, (int) (aUListenerS0S0302005_18.i3 * (f6 - ((f6 - aUListenerS0S0302005_18.f8) * fFloatValue))));
        C1180060goW.LJIIIZ((int) (aUListenerS0S0302005_18.i4 * (f6 - (fFloatValue * (f6 - aUListenerS0S0302005_18.f9)))), (C19HL) aUListenerS0S0302005_18.l2);
        PoiRecommendDishesDetailFragment poiRecommendDishesDetailFragment = (PoiRecommendDishesDetailFragment) aUListenerS0S0302005_18.l0;
        C19HL c19hl3 = (C19HL) aUListenerS0S0302005_18.l2;
        poiRecommendDishesDetailFragment.getClass();
        Drawable drawable = c19hl3.getDrawable();
        if (drawable != null) {
            int width = c19hl3.getWidth();
            int height = c19hl3.getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (width != 0 && height != 0) {
                float f7 = intrinsicWidth / intrinsicHeight;
                Matrix matrixLIZLLL = C19HN.LIZLLL();
                if (f7 > 1.3333334f) {
                    float f8 = width;
                    float f9 = f8 / f7;
                    float f10 = height;
                    float fAbs = Math.abs(f10 - f9) / 2.0f;
                    if (f9 <= f10 && f9 > 0.0f) {
                        float f11 = ((width * 3) / 4.0f) / f9;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("transformImage scale:");
                        sbLIZ2.append(f11);
                        sbLIZ2.append(", boundWidth:");
                        sbLIZ2.append(f9);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        matrixLIZLLL.postScale(f11, f11, f8 / 2.0f, (f9 / 2.0f) + fAbs);
                    } else {
                        return;
                    }
                } else if (f7 > 1.0f) {
                    float f12 = width;
                    float f13 = f12 / f7;
                    float f14 = height;
                    float fAbs2 = Math.abs(f14 - f13) / 2.0f;
                    if (f13 > f14 || f13 <= 0.0f) {
                        return;
                    }
                    float f15 = f13 / f13;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("transformImage scale:");
                    sbLIZ3.append(f15);
                    sbLIZ3.append(", boundWidth:");
                    sbLIZ3.append(f13);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    matrixLIZLLL.postScale(f15, f15, f12 / 2.0f, (f13 / 2.0f) + fAbs2);
                } else {
                    float f16 = height;
                    float f18 = f7 * f16;
                    float f19 = width;
                    float fAbs3 = Math.abs(f19 - f18) / 2.0f;
                    if (f18 > f19 || f18 <= 0.0f) {
                        return;
                    }
                    float f20 = f19 / f18;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("transformImage scale:");
                    sbLIZ4.append(f20);
                    sbLIZ4.append(", boundWidth:");
                    sbLIZ4.append(f18);
                    sbLIZ4.append(",imageViewWidth:");
                    sbLIZ4.append(width);
                    sbLIZ4.append(",imageViewHeight:");
                    sbLIZ4.append(height);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    matrixLIZLLL.postScale(f20, f20, (f18 / 2.0f) + fAbs3, f16 / 2.0f);
                }
                c19hl3.LJIIJJI(matrixLIZLLL, 0L, null, null);
                C19HN.LIZJ(matrixLIZLLL);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0302005_18 aUListenerS0S0302005_18, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
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
        View view = ((PoiDishesGalleryFragment) aUListenerS0S0302005_18.l0).LLJILJIL;
        if (view != null) {
            float f2 = aUListenerS0S0302005_18.f5;
            C786410Ut5.T4(view, f2 - (f2 * fFloatValue));
        }
        View view2 = (View) aUListenerS0S0302005_18.l1;
        float f3 = aUListenerS0S0302005_18.f5;
        C786410Ut5.T4(view2, f3 - (f3 * fFloatValue));
        C19HL c19hl = (C19HL) aUListenerS0S0302005_18.l2;
        float f4 = aUListenerS0S0302005_18.f6 * fFloatValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl);
        c19hl.setTranslationX(f4);
        C19HL c19hl2 = (C19HL) aUListenerS0S0302005_18.l2;
        float f5 = aUListenerS0S0302005_18.f7 * fFloatValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19hl2);
        c19hl2.setTranslationY(f5);
        float f6 = 1;
        C1180060goW.LJIIJJI((C19HL) aUListenerS0S0302005_18.l2, (int) (aUListenerS0S0302005_18.i3 * (f6 - ((f6 - aUListenerS0S0302005_18.f8) * fFloatValue))));
        C1180060goW.LJIIIZ((int) (aUListenerS0S0302005_18.i4 * (f6 - (fFloatValue * (f6 - aUListenerS0S0302005_18.f9)))), (C19HL) aUListenerS0S0302005_18.l2);
        PoiDishesGalleryFragment poiDishesGalleryFragment = (PoiDishesGalleryFragment) aUListenerS0S0302005_18.l0;
        C19HL c19hl3 = (C19HL) aUListenerS0S0302005_18.l2;
        poiDishesGalleryFragment.getClass();
        Drawable drawable = c19hl3.getDrawable();
        if (drawable != null) {
            int width = c19hl3.getWidth();
            int height = c19hl3.getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (width != 0 && height != 0) {
                float f7 = intrinsicWidth / intrinsicHeight;
                Matrix matrixLIZLLL = C19HN.LIZLLL();
                if (f7 > 1.3333334f) {
                    float f8 = width;
                    float f9 = f8 / f7;
                    float f10 = height;
                    float fAbs = Math.abs(f10 - f9) / 2.0f;
                    if (f9 <= f10 && f9 > 0.0f) {
                        float f11 = ((width * 3) / 4.0f) / f9;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("transformImage scale:");
                        sbLIZ2.append(f11);
                        sbLIZ2.append(", boundWidth:");
                        sbLIZ2.append(f9);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        matrixLIZLLL.postScale(f11, f11, f8 / 2.0f, (f9 / 2.0f) + fAbs);
                    } else {
                        return;
                    }
                } else if (f7 > 1.0f) {
                    float f12 = width;
                    float f13 = f12 / f7;
                    float f14 = height;
                    float fAbs2 = Math.abs(f14 - f13) / 2.0f;
                    if (f13 > f14 || f13 <= 0.0f) {
                        return;
                    }
                    float f15 = f13 / f13;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("transformImage scale:");
                    sbLIZ3.append(f15);
                    sbLIZ3.append(", boundWidth:");
                    sbLIZ3.append(f13);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    matrixLIZLLL.postScale(f15, f15, f12 / 2.0f, (f13 / 2.0f) + fAbs2);
                } else {
                    float f16 = height;
                    float f18 = f7 * f16;
                    float f19 = width;
                    float fAbs3 = Math.abs(f19 - f18) / 2.0f;
                    if (f18 > f19 || f18 <= 0.0f) {
                        return;
                    }
                    float f20 = f19 / f18;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("transformImage scale:");
                    sbLIZ4.append(f20);
                    sbLIZ4.append(", boundWidth:");
                    sbLIZ4.append(f18);
                    sbLIZ4.append(",imageViewWidth:");
                    sbLIZ4.append(width);
                    sbLIZ4.append(",imageViewHeight:");
                    sbLIZ4.append(height);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    matrixLIZLLL.postScale(f20, f20, (f18 / 2.0f) + fAbs3, f16 / 2.0f);
                }
                c19hl3.LJIIJJI(matrixLIZLLL, 0L, null, null);
                C19HN.LIZJ(matrixLIZLLL);
            }
        }
    }

    public AUListenerS0S0302005_18(Object obj, float f, Object obj2, Object obj3, float f2, float f3, int i, float f4, int i2, float f5, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.f5 = f;
        this.l1 = obj2;
        this.l2 = obj3;
        this.f6 = f2;
        this.f7 = f3;
        this.i3 = i;
        this.f8 = f4;
        this.i4 = i2;
        this.f9 = f5;
    }
}
