package Y;

import X.C1166690gSx;
import X.C1196950hFl;
import X.C1196960hFm;
import X.C786410Ut5;
import X.EnumC1181950grZ;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamic.PoiDynamicBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicDetailNavBar;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.normal.PoiDetailNavBar;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.PoiHeaderPopTextAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes19.dex */
public class AUListenerS267S0100000_18 implements ValueAnimator.AnimatorUpdateListener {
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
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                break;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                break;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                break;
        }
    }

    public AUListenerS267S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.T4(((PoiDynamicBottomBarComponent) aUListenerS267S0100000_18.l0).ap(), fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.T4(((PoiScrollBottomBarComponent) aUListenerS267S0100000_18.l0).LJJIJL(), fFloatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ViewGroup viewGroup = ((C1196950hFl) aUListenerS267S0100000_18.l0).LLJJIJIIJIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = iIntValue;
                layoutParams = layoutParams2;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ViewGroup viewGroup = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJJJJJIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iIntValue;
                layoutParams = layoutParams2;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup viewGroup = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJILLL;
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            C1196960hFm c1196960hFm = (C1196960hFm) aUListenerS267S0100000_18.l0;
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue;
            ViewGroup viewGroup2 = c1196960hFm.LLJILLL;
            if (viewGroup2 != null) {
                C786410Ut5.X5(layoutParams, viewGroup2);
            }
        }
        if (animatedFraction < 0.6f) {
            SmartImageView smartImageView = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJILJIL;
            if (smartImageView != null) {
                C786410Ut5.u5(smartImageView, 1 - animatedFraction);
            }
            SmartImageView smartImageView2 = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJILJILJ;
            if (smartImageView2 != null) {
                C786410Ut5.u5(smartImageView2, 0.0f);
                return;
            }
            return;
        }
        SmartImageView smartImageView3 = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJILJILJ;
        if (smartImageView3 != null) {
            C786410Ut5.u5(smartImageView3, animatedFraction);
        }
        SmartImageView smartImageView4 = ((C1196960hFm) aUListenerS267S0100000_18.l0).LLJILJIL;
        if (smartImageView4 == null) {
            return;
        }
        C786410Ut5.u5(smartImageView4, 0.0f);
    }

    public static final void onAnimationUpdate$13(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        ConstraintLayout constraintLayout = ((PoiReviewsListItemCell) aUListenerS267S0100000_18.l0).LLJLILLLLZIIL;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        ConstraintLayout constraintLayout = ((RefactorTTReviewCell) aUListenerS267S0100000_18.l0).LLJJ;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            View view = ((C1166690gSx) aUListenerS267S0100000_18.l0).LLJ;
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue / 2);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        PoiDynamicDetailNavBar poiDynamicDetailNavBar = (PoiDynamicDetailNavBar) aUListenerS267S0100000_18.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        poiDynamicDetailNavBar.LLJJIJI = fFloatValue;
    }

    public static final void onAnimationUpdate$3(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        TextView textView = ((PoiDetailNavBar) aUListenerS267S0100000_18.l0).LLJJIJI;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(fFloatValue, textView);
        if (((PoiDetailNavBar) aUListenerS267S0100000_18.l0).sp().getState().LLILLL == EnumC1181950grZ.TOP_MAP) {
            TuxIconView tuxIconView2 = ((PoiDetailNavBar) aUListenerS267S0100000_18.l0).LLJJJ;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, fFloatValue);
            }
            TuxIconView tuxIconView3 = ((PoiDetailNavBar) aUListenerS267S0100000_18.l0).LLJJIJIIJIL;
            if (tuxIconView3 != null) {
                tuxIconView = tuxIconView3;
            }
            C786410Ut5.x5(tuxIconView, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        PoiHeaderPopTextAssem poiHeaderPopTextAssem = (PoiHeaderPopTextAssem) aUListenerS267S0100000_18.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        poiHeaderPopTextAssem.LLJLL = fFloatValue;
        PoiHeaderPopTextAssem poiHeaderPopTextAssem2 = (PoiHeaderPopTextAssem) aUListenerS267S0100000_18.l0;
        poiHeaderPopTextAssem2.AI(poiHeaderPopTextAssem2.LLJLL);
    }

    public static final void onAnimationUpdate$5(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.T4(((PoiDetailBottomBarAssem) aUListenerS267S0100000_18.l0).LJJIJL(), fFloatValue);
    }

    public static final void onAnimationUpdate$6(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS267S0100000_18.l0).getLayoutParams();
        View view = (View) aUListenerS267S0100000_18.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            layoutParams.width = num.intValue();
        }
        view.requestLayout();
    }

    public static final void onAnimationUpdate$7(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num;
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS267S0100000_18.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view = (View) aUListenerS267S0100000_18.l0;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                int iIntValue = num.intValue();
                marginLayoutParams.height = iIntValue;
                marginLayoutParams.topMargin = iIntValue - view.getHeight();
            }
            view.requestLayout();
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS267S0100000_18.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS267S0100000_18 aUListenerS267S0100000_18, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ViewGroup viewGroup = ((C1196950hFl) aUListenerS267S0100000_18.l0).LLJJIJI;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iIntValue;
                layoutParams = layoutParams2;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }
}
