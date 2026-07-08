package Y;

import X.C0JSE;
import X.C1721230utN;
import X.C1721300utU;
import X.C1738480vLC;
import X.C1748340vb6;
import X.C1751630vgP;
import X.C1754640vlG;
import X.C1754770vlT;
import X.C1762400vxm;
import X.C1762410vxn;
import X.C1763720vzu;
import X.C1763840w06;
import X.C1765350w2X;
import X.C1765620w2y;
import X.C1765730w39;
import X.C19MB;
import X.C418440Gaw;
import X.C446980Hfs;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1765380w2a;
import X.KeyEventCallbackC1765760w3C;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public class AUListenerS274S0100000_26 implements ValueAnimator.AnimatorUpdateListener {
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
            case 16:
                onAnimationUpdate$16(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationUpdate$17(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationUpdate$18(this, valueAnimator);
                break;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationUpdate$20(this, valueAnimator);
                break;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                break;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                break;
        }
    }

    public AUListenerS274S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C1721230utN c1721230utN = (C1721230utN) aUListenerS274S0100000_26.l0;
            int iIntValue = num.intValue();
            C1721300utU c1721300utU = C1721300utU.LIZ;
            View view = c1721230utN.LLILLJJLI;
            c1721300utU.getClass();
            C1721300utU.LJIIJ(view, iIntValue);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        boolean z = true;
        if (iIntValue != 1) {
            z = false;
        }
        C1754640vlG c1754640vlG = (C1754640vlG) aUListenerS274S0100000_26.l0;
        if (c1754640vlG.LLLIIL != z) {
            c1754640vlG.LLLIIL = z;
            c1754640vlG.invalidate();
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((TextView) aUListenerS274S0100000_26.l0).setScrollX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ld(((ScheduleDowntimeServerDrivenActivity) aUListenerS274S0100000_26.l0).LLLLZIL(), fFloatValue);
        if (!((ScheduleDowntimeServerDrivenActivity) aUListenerS274S0100000_26.l0).LLJIJIL && fFloatValue <= C497820Jfg.LIZ(r1) / 2) {
            ScheduleDowntimeServerDrivenActivity scheduleDowntimeServerDrivenActivity = (ScheduleDowntimeServerDrivenActivity) aUListenerS274S0100000_26.l0;
            scheduleDowntimeServerDrivenActivity.LLJIJIL = true;
            View view = new View(scheduleDowntimeServerDrivenActivity);
            view.setId(View.generateViewId());
            view.setBackgroundColor(C446980Hfs.LIZ(scheduleDowntimeServerDrivenActivity, R.color.j7));
            int height = scheduleDowntimeServerDrivenActivity.LLLLZIL().getHeight() / 4;
            scheduleDowntimeServerDrivenActivity.LLLLZI().addView(view);
            C19MB c19mb = new C19MB();
            c19mb.LJII(scheduleDowntimeServerDrivenActivity.LLLLZI());
            c19mb.LJIIIIZZ(view.getId(), 4, scheduleDowntimeServerDrivenActivity.LLLLZI().getId(), 4);
            c19mb.LJIIIIZZ(view.getId(), 6, scheduleDowntimeServerDrivenActivity.LLLLZI().getId(), 6);
            c19mb.LJIIIIZZ(view.getId(), 7, scheduleDowntimeServerDrivenActivity.LLLLZI().getId(), 7);
            c19mb.LJIIJJI(view.getId(), height);
            c19mb.LIZIZ(scheduleDowntimeServerDrivenActivity.LLLLZI());
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1765350w2X c1765350w2X = (C1765350w2X) aUListenerS274S0100000_26.l0;
            float fFloatValue = f.floatValue();
            InterfaceC1765380w2a interfaceC1765380w2a = c1765350w2X.LLILZIL;
            if (interfaceC1765380w2a != null) {
                interfaceC1765380w2a.LLJLL(fFloatValue * c1765350w2X.LLIZLLLIL, c1765350w2X.LLJILJIL);
            }
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1765350w2X c1765350w2X = (C1765350w2X) aUListenerS274S0100000_26.l0;
            float fFloatValue = f.floatValue();
            InterfaceC1765380w2a interfaceC1765380w2a = c1765350w2X.LLILZIL;
            if (interfaceC1765380w2a != null) {
                interfaceC1765380w2a.LLJLL(fFloatValue * c1765350w2X.LLIZLLLIL, c1765350w2X.LLJILJIL);
            }
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        C786410Ut5.K5((C1763840w06) aUListenerS274S0100000_26.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        AnimatorSet animatorSet;
        if (((Integer) valueAnimator.getAnimatedValue()).intValue() < 3 && (animatorSet = ((PdpBodyAssem) aUListenerS274S0100000_26.l0).LLLII) != null) {
            animatorSet.start();
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1763720vzu commerceHeaderPagerFromXml = ((C1762400vxm) aUListenerS274S0100000_26.l0).getCommerceHeaderPagerFromXml();
        ViewGroup.LayoutParams layoutParams = ((C1762400vxm) aUListenerS274S0100000_26.l0).getCommerceHeaderPagerFromXml().getLayoutParams();
        layoutParams.height = iIntValue;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(commerceHeaderPagerFromXml);
        commerceHeaderPagerFromXml.setLayoutParams(layoutParams);
        C1762410vxn headerPagerAdapter = ((C1762400vxm) aUListenerS274S0100000_26.l0).getHeaderPagerAdapter();
        if (headerPagerAdapter != null) {
            headerPagerAdapter.notifyDataSetChanged();
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        Rect rect = (Rect) aUListenerS274S0100000_26.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        KeyEventCallbackC1765760w3C.LLJILJILJ = rect.width();
        KeyEventCallbackC1765760w3C.LLJILLL = rect.height();
        int i = KeyEventCallbackC1765760w3C.LLILZ;
        int i2 = KeyEventCallbackC1765760w3C.LLILLL;
        int i3 = (int) KeyEventCallbackC1765760w3C.LLJILJILJ;
        int i4 = (int) KeyEventCallbackC1765760w3C.LLJILLL;
        double d = i;
        double d2 = i2;
        double d3 = i3;
        double d4 = i4;
        if (d / d2 > d3 / d4) {
            i4 = (int) ((d3 * d2) / d);
        } else {
            i3 = (int) ((d4 * d) / d2);
        }
        C0JSE c0jse = new C0JSE(i3, i4);
        KeyEventCallbackC1765760w3C.LLJJ = c0jse.LIZ;
        KeyEventCallbackC1765760w3C.LLJJI = c0jse.LIZIZ;
        ImageView imageView = KeyEventCallbackC1765760w3C.LLJILJIL;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int[] iArr = KeyEventCallbackC1765760w3C.LLILLJJLI;
        float f = iArr[1];
        float f2 = KeyEventCallbackC1765760w3C.LLJILLL;
        float f3 = KeyEventCallbackC1765760w3C.LLJJI;
        marginLayoutParams.topMargin = (int) (f - ((f - ((f2 - f3) / 2.0f)) * fFloatValue));
        float f4 = iArr[0];
        float f5 = KeyEventCallbackC1765760w3C.LLJILJILJ;
        float f6 = KeyEventCallbackC1765760w3C.LLJJ;
        marginLayoutParams.leftMargin = (int) (f4 - ((f4 - ((f5 - f6) / 2.0f)) * fFloatValue));
        float f7 = KeyEventCallbackC1765760w3C.LLILZ;
        marginLayoutParams.width = (int) (f7 + ((f6 - f7) * fFloatValue));
        float f8 = KeyEventCallbackC1765760w3C.LLILLL;
        marginLayoutParams.height = (int) (f8 + (fFloatValue * (f3 - f8)));
        ImageView imageView2 = KeyEventCallbackC1765760w3C.LLJILJIL;
        if (imageView2 != null) {
            C786410Ut5.c6(imageView2, marginLayoutParams);
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765730w39) aUListenerS274S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationUpdate$19(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765730w39) aUListenerS274S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationUpdate$2(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1754640vlG) aUListenerS274S0100000_26.l0).LLLFF = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1754640vlG) aUListenerS274S0100000_26.l0).invalidate();
    }

    public static final void onAnimationUpdate$20(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765730w39) aUListenerS274S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationUpdate$21(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1754770vlT) aUListenerS274S0100000_26.l0).LLILZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1754770vlT) aUListenerS274S0100000_26.l0).requestLayout();
    }

    public static final void onAnimationUpdate$22(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1748340vb6 c1748340vb6 = (C1748340vb6) aUListenerS274S0100000_26.l0;
        c1748340vb6.LL = fFloatValue;
        if (c1748340vb6.LLILZLL) {
            C1748340vb6 c1748340vb62 = (C1748340vb6) aUListenerS274S0100000_26.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1748340vb62);
            c1748340vb62.setAlpha(fFloatValue);
        }
        ((C1748340vb6) aUListenerS274S0100000_26.l0).requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        C786410Ut5.K5((C1763840w06) aUListenerS274S0100000_26.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765620w2y) aUListenerS274S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationUpdate$5(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765620w2y) aUListenerS274S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationUpdate$6(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((C1765620w2y) aUListenerS274S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationUpdate$7(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() <= 0.75f) {
            ((C1738480vLC) aUListenerS274S0100000_26.l0).getDraftSubmissionItemList().getLayoutParams().height = (int) (((valueAnimator.getAnimatedFraction() * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) * 4) / 3);
        }
        if (valueAnimator.getAnimatedFraction() > 0.25f) {
            C786410Ut5.d5(((C1738480vLC) aUListenerS274S0100000_26.l0).getDraftSubmissionItemList(), ((valueAnimator.getAnimatedFraction() - 0.25f) * 4) / 3);
            C786410Ut5.LLIZLLLIL(((C1738480vLC) aUListenerS274S0100000_26.l0).getDraftSubmissionItemList(), 0);
        }
        ((C1738480vLC) aUListenerS274S0100000_26.l0).getDraftSubmissionItemList().requestLayout();
    }

    public static final void onAnimationUpdate$8(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        float f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = ((animatedFraction / 0.5f) * 0.05f) + 0.95f;
        } else {
            f = 1.0f - (((animatedFraction - 0.5f) / 0.5f) * 0.05f);
        }
        SmartImageView avatarFromXml = ((C1751630vgP) aUListenerS274S0100000_26.l0).getAvatarFromXml();
        if (avatarFromXml != null) {
            C786410Ut5.fc(avatarFromXml, f);
            C786410Ut5.Bc(avatarFromXml, f);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS274S0100000_26 aUListenerS274S0100000_26, ValueAnimator valueAnimator) {
        ((TextView) aUListenerS274S0100000_26.l0).setScrollX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
