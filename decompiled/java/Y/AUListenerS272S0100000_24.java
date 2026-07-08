package Y;

import X.AbstractC1592930rYR;
import X.C01GW;
import X.C1592450rXf;
import X.C1592470rXh;
import X.C1592940rYS;
import X.C1592950rYT;
import X.C1610740s1A;
import X.C1610750s1B;
import X.C1610760s1C;
import X.C1610770s1D;
import X.C1619010sEV;
import X.C19RF;
import X.C293690BfD;
import X.C294120Bfu;
import X.C386801es;
import X.C786410Ut5;
import X.EnumC1610470s0j;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.internal.AwS36S0001000_24;

/* JADX INFO: loaded from: classes25.dex */
public class AUListenerS272S0100000_24 implements ValueAnimator.AnimatorUpdateListener {
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
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationUpdate$24(this, valueAnimator);
                break;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                break;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                break;
        }
    }

    public AUListenerS272S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C19RF c19rf = (C19RF) aUListenerS272S0100000_24.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        c19rf.setRadius(fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        C1592950rYT c1592950rYT = ((AbstractC1592930rYR) aUListenerS272S0100000_24.l0).LL;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1592950rYT.setTabRefreshScaleX(fFloatValue);
        c1592950rYT.setTabRefreshScaleY(fFloatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = ((animatedFraction / 0.5f) * 0.05f) + 0.95f;
        } else {
            f = 1.0f - (((animatedFraction - 0.5f) / 0.5f) * 0.05f);
        }
        Iterator<T> it2 = ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZ.iterator();
        while (it2.hasNext()) {
            View view = ((C1610750s1B) it2.next()).LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f);
                C786410Ut5.pc(view, f);
            }
        }
        if (990 <= iIntValue && iIntValue < 1000) {
            C1610760s1C c1610760s1C = (C1610760s1C) aUListenerS272S0100000_24.l0;
            if (!c1610760s1C.LIZLLL) {
                c1610760s1C.LIZLLL = true;
                ValueAnimator valueAnimator2 = c1610760s1C.LJIIIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        boolean z;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Iterator<T> it2 = ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZ.iterator();
        while (it2.hasNext()) {
            C1610770s1D c1610770s1D = ((C1610750s1B) it2.next()).LJ;
            if (c1610770s1D != null && 1000 <= iIntValue) {
                if (iIntValue < 1751) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c1610770s1D.setStrokeWide(((iIntValue + C386801es.DEFAULT) * 1.0f) / 750);
                }
                if (iIntValue > 1750) {
                    c1610770s1D.setStrokeWide(0.99f);
                    c1610770s1D.setSize(0.0f);
                } else if (1000 <= iIntValue && iIntValue < 1501) {
                    c1610770s1D.LLIZ = c1610770s1D.LLILZLL + (11 * (((iIntValue + C386801es.DEFAULT) * 1.0f) / 500));
                    c1610770s1D.postInvalidate();
                }
            }
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
        } else {
            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
        }
        View view = ((C1610740s1A) aUListenerS272S0100000_24.l0).LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, f);
            C786410Ut5.pc(view, f);
        }
        if (730 <= iIntValue && iIntValue < 740) {
            C1610740s1A c1610740s1A = (C1610740s1A) aUListenerS272S0100000_24.l0;
            if (!c1610740s1A.LJII) {
                c1610740s1A.LJII = true;
                C01GW c01gw = C293690BfD.LIZ;
                if (C293690BfD.LIZIZ) {
                    ValueAnimator valueAnimator2 = c1610740s1A.LJIILL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                        return;
                    }
                    return;
                }
                c1610740s1A.LJIJ = true;
            }
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
        } else {
            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
        }
        View view = ((C1610740s1A) aUListenerS272S0100000_24.l0).LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, f);
            C786410Ut5.pc(view, f);
        }
        if (730 <= iIntValue && iIntValue < 740) {
            C1610740s1A c1610740s1A = (C1610740s1A) aUListenerS272S0100000_24.l0;
            if (!c1610740s1A.LJII) {
                c1610740s1A.LJII = true;
                C01GW c01gw = C293690BfD.LIZ;
                if (C293690BfD.LIZIZ) {
                    ValueAnimator valueAnimator2 = c1610740s1A.LJIILL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                        return;
                    }
                    return;
                }
                c1610740s1A.LJIJ = true;
            }
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue >= 0 && iIntValue <= ((C1610740s1A) aUListenerS272S0100000_24.l0).LJIIJ) {
            float f = iIntValue * 1.0f;
            float f2 = f / r1.LJIIJ;
            C1610770s1D c1610770s1D = ((C1610740s1A) aUListenerS272S0100000_24.l0).LJ;
            if (c1610770s1D != null) {
                c1610770s1D.setFraction(f2);
            }
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = ((animatedFraction / 0.5f) * 0.05f) + 0.95f;
        } else {
            f = 1.0f - (((animatedFraction - 0.5f) / 0.5f) * 0.05f);
        }
        View view = ((C1610740s1A) aUListenerS272S0100000_24.l0).LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, f);
            C786410Ut5.pc(view, f);
        }
        if (990 <= iIntValue && iIntValue < 1000) {
            C1610740s1A c1610740s1A = (C1610740s1A) aUListenerS272S0100000_24.l0;
            if (!c1610740s1A.LJII) {
                c1610740s1A.LJII = true;
                C01GW c01gw = C293690BfD.LIZ;
                if (C293690BfD.LIZIZ) {
                    ValueAnimator valueAnimator2 = c1610740s1A.LJIILL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                        return;
                    }
                    return;
                }
                c1610740s1A.LJIJ = true;
            }
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        boolean z;
        int i;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1610770s1D c1610770s1D = ((C1610740s1A) aUListenerS272S0100000_24.l0).LJ;
        if (c1610770s1D != null && 1000 <= iIntValue) {
            if (iIntValue < 1751) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c1610770s1D.setStrokeWide(((iIntValue + C386801es.DEFAULT) * 1.0f) / 750);
            }
            if (iIntValue > 1750) {
                c1610770s1D.setStrokeWide(0.99f);
                c1610770s1D.setSize(0.0f);
            } else {
                if (1000 > iIntValue || iIntValue >= 1501) {
                    return;
                }
                float f = ((iIntValue - LSPassThroughRecordSizeConfig.DEFAULT) * 1.0f) / 500;
                if (C294120Bfu.LIZJ()) {
                    i = 12;
                } else {
                    i = 11;
                }
                c1610770s1D.LLIZ = c1610770s1D.LLILZLL + (i * f);
                c1610770s1D.postInvalidate();
            }
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (animatedFraction <= 0.5f) {
            f = ((animatedFraction / 0.5f) * 0.05f) + 0.95f;
        } else {
            f = 1.0f - (((animatedFraction - 0.5f) / 0.5f) * 0.05f);
        }
        View view = ((C1610740s1A) aUListenerS272S0100000_24.l0).LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, f);
            C786410Ut5.pc(view, f);
        }
        if (990 <= iIntValue && iIntValue < 1000) {
            C1610740s1A c1610740s1A = (C1610740s1A) aUListenerS272S0100000_24.l0;
            if (!c1610740s1A.LJII) {
                c1610740s1A.LJII = true;
                C01GW c01gw = C293690BfD.LIZ;
                if (C293690BfD.LIZIZ) {
                    ValueAnimator valueAnimator2 = c1610740s1A.LJIILL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                        return;
                    }
                    return;
                }
                c1610740s1A.LJIJ = true;
            }
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        boolean z;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1610740s1A c1610740s1A = (C1610740s1A) aUListenerS272S0100000_24.l0;
        C1610770s1D c1610770s1D = c1610740s1A.LJ;
        if (c1610770s1D != null) {
            if (c1610740s1A.LJFF == EnumC1610470s0j.SPECIAL_STRONG) {
                f = 0.12f;
            } else {
                f = 0.07f;
            }
            if (iIntValue >= 0) {
                if (iIntValue < 901) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c1610770s1D.setSizeScale((((iIntValue * 1.0f) / 900) * f) + 1.0f);
                }
                if (iIntValue >= 0 && iIntValue < 1001) {
                    c1610770s1D.setStrokeWide((iIntValue * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
    }

    public static final void onAnimationUpdate$2(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((AbstractC1592930rYR) aUListenerS272S0100000_24.l0).LL.setTabRefreshRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((TuxIconView) aUListenerS272S0100000_24.l0).setTintColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.Lb(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        ViewGroup viewGroup3 = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.mc(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup2);
    }

    public static final void onAnimationUpdate$22(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.Lb(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        ViewGroup viewGroup3 = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.mc(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup2);
    }

    public static final void onAnimationUpdate$23(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.bd(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
    }

    public static final void onAnimationUpdate$24(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.bd(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
    }

    public static final void onAnimationUpdate$25(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1619010sEV) aUListenerS272S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
    }

    public static final void onAnimationUpdate$26(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C1592450rXf) aUListenerS272S0100000_24.l0).setSelectedTabIndicatorColor(iIntValue);
        ((C1592450rXf) aUListenerS272S0100000_24.l0).LJJII(new AwS36S0001000_24(iIntValue, 14));
    }

    public static final void onAnimationUpdate$3(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((C1592450rXf) aUListenerS272S0100000_24.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        ((C1592450rXf) aUListenerS272S0100000_24.l0).LLILLL.invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((C1592470rXh) aUListenerS272S0100000_24.l0).getMSelectedIndicatorPaint().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        ((C1592470rXh) aUListenerS272S0100000_24.l0).postInvalidateOnAnimation();
    }

    public static final void onAnimationUpdate$5(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((C1592940rYS) aUListenerS272S0100000_24.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        ((C1592940rYS) aUListenerS272S0100000_24.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
        } else {
            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
        }
        Iterator<T> it2 = ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZ.iterator();
        while (it2.hasNext()) {
            View view = ((C1610750s1B) it2.next()).LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f);
                C786410Ut5.pc(view, f);
            }
        }
        if (730 <= iIntValue && iIntValue < 740) {
            C1610760s1C c1610760s1C = (C1610760s1C) aUListenerS272S0100000_24.l0;
            if (!c1610760s1C.LIZLLL) {
                c1610760s1C.LIZLLL = true;
                ValueAnimator valueAnimator2 = c1610760s1C.LJIIIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        float f;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.5f) {
            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
        } else {
            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
        }
        Iterator<T> it2 = ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZ.iterator();
        while (it2.hasNext()) {
            View view = ((C1610750s1B) it2.next()).LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f);
                C786410Ut5.pc(view, f);
            }
        }
        if (730 <= iIntValue && iIntValue < 740) {
            C1610760s1C c1610760s1C = (C1610760s1C) aUListenerS272S0100000_24.l0;
            if (!c1610760s1C.LIZLLL) {
                c1610760s1C.LIZLLL = true;
                ValueAnimator valueAnimator2 = c1610760s1C.LJIIIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS272S0100000_24 aUListenerS272S0100000_24, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue >= 0 && iIntValue <= ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZJ) {
            float f = iIntValue * 1.0f;
            float f2 = f / r1.LIZJ;
            Iterator<T> it2 = ((C1610760s1C) aUListenerS272S0100000_24.l0).LIZ.iterator();
            while (it2.hasNext()) {
                C1610770s1D c1610770s1D = ((C1610750s1B) it2.next()).LJ;
                if (c1610770s1D != null) {
                    c1610770s1D.setFraction(f2);
                }
            }
        }
    }
}
