package Y;

import X.C0SOW;
import X.C0SS3;
import X.C0SS4;
import X.C0SU0;
import X.C0SV7;
import X.C118300cf;
import X.C1AV2;
import X.C1AVH;
import X.C2180521AVm;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C426320Gne;
import X.C719890SLr;
import X.C723170SYh;
import X.C730970Slr;
import X.C732790Son;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC2180541AVo;
import X.InterfaceC20097013kG;
import X.InterfaceC20343214is;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS219S0200000_11 implements ValueAnimator.AnimatorUpdateListener {
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
            case 16:
                onAnimationUpdate$16(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationUpdate$17(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationUpdate$18(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        ((C719890SLr) aUListenerS219S0200000_11.l0).LJIILLIIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C426320Gne) aUListenerS219S0200000_11.l1).LIZ(((C719890SLr) aUListenerS219S0200000_11.l0).LJIILLIIL, false);
    }

    public static final void onAnimationUpdate$1(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        ((C0SV7) aUListenerS219S0200000_11.l0).LJIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((SmartImagePhotoViewHolderV2) aUListenerS219S0200000_11.l1).LLJLLIL.invalidate();
    }

    public static final void onAnimationUpdate$10(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C0SOW c0sow = (C0SOW) aUListenerS219S0200000_11.l0;
            ImageView imageView = (ImageView) aUListenerS219S0200000_11.l1;
            int iIntValue = num.intValue();
            c0sow.getClass();
            C0SOW.LJIILJJIL(iIntValue, imageView);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        if (((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LJJJJZI()) {
            valueAnimator.cancel();
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.V4((ImageView) aUListenerS219S0200000_11.l1, fFloatValue);
        View viewLJJI = ((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LJJI();
        if (viewLJJI != null) {
            C786410Ut5.T4(viewLJJI, 1 - fFloatValue);
        }
        int iLJI = C2441009hQ.LJI(fFloatValue, ((Number) ((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LLLJIL.getValue()).intValue(), -16777216);
        C0SS3 c0ss3 = ((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LLILZIL;
        if (c0ss3 != null) {
            c0ss3.LIZIZ(iLJI, false);
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        Float f;
        C1AV2 c1av2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            List<View> list = (List) aUListenerS219S0200000_11.l0;
            C1AV2 c1av22 = (C1AV2) aUListenerS219S0200000_11.l1;
            float fFloatValue = f.floatValue();
            for (View view : list) {
                if (fFloatValue == 0.0f && (view instanceof InterfaceC20343214is)) {
                    if (c1av22 == null) {
                        c1av2 = (C1AV2) C1AVH.LJIILIIL.getValue();
                    } else {
                        c1av2 = c1av22;
                    }
                    C2180521AVm.LIZ(view, EnumC2180541AVo.V_ALPHA, c1av2);
                }
                C786410Ut5.T4(view, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (View view : (List) aUListenerS219S0200000_11.l0) {
            if ((view instanceof InterfaceC20343214is) && fFloatValue == 0.0f) {
                C2180521AVm.LIZ(view, EnumC2180541AVo.V_ALPHA, (C1AV2) aUListenerS219S0200000_11.l1);
            }
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = fFloatValue - ((C817403Hg) aUListenerS219S0200000_11.l0).element;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aUListenerS219S0200000_11.l1;
        if (verticalViewPager.LLLLIILLL) {
            verticalViewPager.LLLLZIL((-f) * C418440Gaw.LIZIZ(56));
        }
        ((C817403Hg) aUListenerS219S0200000_11.l0).element = fFloatValue;
    }

    public static final void onAnimationUpdate$15(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() - ((C118300cf) aUListenerS219S0200000_11.l0).element;
        if (iIntValue == 0) {
            return;
        }
        int i = -iIntValue;
        C0SS4 c0ss4 = (C0SS4) aUListenerS219S0200000_11.l1;
        if (i == 0) {
            c0ss4.getClass();
        } else {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            RecyclerView recyclerView = c0ss4.LIZ;
            if (recyclerView instanceof InterfaceC20097013kG) {
                recyclerView.dispatchNestedPreScroll(0, i, iArr, iArr2, 1);
            }
        }
        ((C118300cf) aUListenerS219S0200000_11.l0).element = ((C0SS4) aUListenerS219S0200000_11.l1).LIZIZ.invoke().intValue();
    }

    public static final void onAnimationUpdate$16(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        if (((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LJJJJZI()) {
            valueAnimator.cancel();
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup viewGroup = (ViewGroup) aUListenerS219S0200000_11.l1;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
        View view = ((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l0).LLJILLL;
        if (view != null) {
            C786410Ut5.T4(view, 1 - fFloatValue);
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0SU0 c0su0 = (C0SU0) aUListenerS219S0200000_11.l0;
        if (c0su0 != null) {
            C786410Ut5.Cd(c0su0, fFloatValue * ((PostModeNestHeaderComponent) aUListenerS219S0200000_11.l1).LLLILZ);
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS219S0200000_11.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            VideoShareAssem videoShareAssem = (VideoShareAssem) aUListenerS219S0200000_11.l1;
            float fFloatValue = f.floatValue();
            TuxIconView tuxIconView = (TuxIconView) videoShareAssem.getContentView().findViewById(R.id.qvq);
            if (tuxIconView != null) {
                C786410Ut5.hc(tuxIconView, fFloatValue);
                C786410Ut5.Cc(tuxIconView, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TuxIconView tuxIconView = (TuxIconView) aUListenerS219S0200000_11.l0;
        if (tuxIconView != null) {
            C786410Ut5.hc(tuxIconView, fFloatValue);
        }
        TuxIconView tuxIconView2 = (TuxIconView) aUListenerS219S0200000_11.l0;
        if (tuxIconView2 != null) {
            C786410Ut5.Cc(tuxIconView2, fFloatValue);
        }
        ((C723170SYh) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$3(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TuxIconView tuxIconView = (TuxIconView) aUListenerS219S0200000_11.l0;
        if (tuxIconView != null) {
            C786410Ut5.hc(tuxIconView, fFloatValue);
        }
        TuxIconView tuxIconView2 = (TuxIconView) aUListenerS219S0200000_11.l0;
        if (tuxIconView2 != null) {
            C786410Ut5.Cc(tuxIconView2, fFloatValue);
        }
        ((C723170SYh) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        ((GradientDrawable) aUListenerS219S0200000_11.l0).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        ((ViewGroup) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$5(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        ((C732790Son) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        ((C732790Son) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        ((C730970Slr) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS219S0200000_11.l0, fFloatValue);
        ((C730970Slr) aUListenerS219S0200000_11.l1).invalidate();
    }

    public static final void onAnimationUpdate$9(AUListenerS219S0200000_11 aUListenerS219S0200000_11, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C0SOW c0sow = (C0SOW) aUListenerS219S0200000_11.l0;
            ImageView imageView = (ImageView) aUListenerS219S0200000_11.l1;
            int iIntValue = num.intValue();
            c0sow.getClass();
            C0SOW.LJIILJJIL(iIntValue, imageView);
        }
    }

    public AUListenerS219S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
