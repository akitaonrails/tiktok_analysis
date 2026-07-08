package Y;

import X.AlertDialogC1377870lxZ;
import X.C1004960cG6;
import X.C1004980cG8;
import X.C1037280d6E;
import X.C1037300d6G;
import X.C1051930dTr;
import X.C1058500deS;
import X.C1066550drR;
import X.C1073840e3C;
import X.C1074010e3T;
import X.C1075690e6B;
import X.C1077050e8N;
import X.C1295960jpS;
import X.C1414130mu3;
import X.C1447770nmJ;
import X.C1447790nmL;
import X.C1558520qew;
import X.C1628270sTR;
import X.C1754650vlH;
import X.C18NR;
import X.C18NS;
import X.C20286814Zm;
import X.C2188811AlT;
import X.C427870Gq9;
import X.C612110Nzd;
import X.C631370Opb;
import X.C786410Ut5;
import X.C991140bto;
import X.C991760buo;
import X.C994580bzM;
import X.C994880bzq;
import X.C998340c5Q;
import X.C999120c6g;
import X.DialogC1718130uoN;
import X.InterfaceC1049140dPM;
import X.InterfaceC679410Qkt;
import X.InterfaceC998100c52;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayContentAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.videogeneration.TakoVideoGenProgressAssem;
import com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS265S0100000_16 implements ValueAnimator.AnimatorUpdateListener {
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
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                break;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                break;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                break;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                break;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                break;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationUpdate$33(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationUpdate$34(this, valueAnimator);
                break;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationUpdate$36(this, valueAnimator);
                break;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                break;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                break;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                break;
            case 40:
                onAnimationUpdate$40(this, valueAnimator);
                break;
            case 41:
                onAnimationUpdate$41(this, valueAnimator);
                break;
            case 42:
                onAnimationUpdate$42(this, valueAnimator);
                break;
            case 43:
                onAnimationUpdate$43(this, valueAnimator);
                break;
            case 44:
                onAnimationUpdate$44(this, valueAnimator);
                break;
            case 45:
                onAnimationUpdate$45(this, valueAnimator);
                break;
            case 46:
                onAnimationUpdate$46(this, valueAnimator);
                break;
            case 47:
                onAnimationUpdate$47(this, valueAnimator);
                break;
            case 48:
                onAnimationUpdate$48(this, valueAnimator);
                break;
            case 49:
                onAnimationUpdate$49(this, valueAnimator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationUpdate$50(this, valueAnimator);
                break;
            case 51:
                onAnimationUpdate$51(this, valueAnimator);
                break;
            case 52:
                onAnimationUpdate$52(this, valueAnimator);
                break;
            case 53:
                onAnimationUpdate$53(this, valueAnimator);
                break;
            case 54:
                onAnimationUpdate$54(this, valueAnimator);
                break;
            case 55:
                onAnimationUpdate$55(this, valueAnimator);
                break;
            case 56:
                onAnimationUpdate$56(this, valueAnimator);
                break;
            case 57:
                onAnimationUpdate$57(this, valueAnimator);
                break;
            case 58:
                onAnimationUpdate$58(this, valueAnimator);
                break;
            case 59:
                onAnimationUpdate$59(this, valueAnimator);
                break;
            case 60:
                onAnimationUpdate$60(this, valueAnimator);
                break;
            case 61:
                onAnimationUpdate$61(this, valueAnimator);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationUpdate$62(this, valueAnimator);
                break;
            case 63:
                onAnimationUpdate$63(this, valueAnimator);
                break;
            case 64:
                onAnimationUpdate$64(this, valueAnimator);
                break;
            case 65:
                onAnimationUpdate$65(this, valueAnimator);
                break;
        }
    }

    public AUListenerS265S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        GradientDrawable gradientDrawable;
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        Drawable background = null;
        if (frameLayout != null) {
            background = frameLayout.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        boolean z = true;
        if (iIntValue != 1) {
            z = false;
        }
        C1754650vlH c1754650vlH = (C1754650vlH) aUListenerS265S0100000_16.l0;
        if (c1754650vlH.LLLIILIL != z) {
            c1754650vlH.LLLIILIL = z;
            c1754650vlH.invalidate();
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C1754650vlH) aUListenerS265S0100000_16.l0).LLLFFI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1754650vlH) aUListenerS265S0100000_16.l0).invalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.R4(f.floatValue(), (ViewGroup) aUListenerS265S0100000_16.l0);
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((C994580bzM) aUListenerS265S0100000_16.l0).LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iIntValue;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        ((C994580bzM) aUListenerS265S0100000_16.l0).LLILLL.requestLayout();
    }

    public static final void onAnimationUpdate$14(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((C994580bzM) aUListenerS265S0100000_16.l0).LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iIntValue;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        ((C994580bzM) aUListenerS265S0100000_16.l0).LLILLL.requestLayout();
    }

    public static final void onAnimationUpdate$15(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS265S0100000_16.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$16(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS265S0100000_16.l0).getLayoutParams();
        layoutParams.height = iIntValue;
        C786410Ut5.W5((View) aUListenerS265S0100000_16.l0, layoutParams);
    }

    public static final void onAnimationUpdate$17(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C1051930dTr c1051930dTr = (C1051930dTr) aUListenerS265S0100000_16.l0;
        c1051930dTr.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TuxIconView tuxIconView = c1051930dTr.LL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.x5(tuxIconView, fFloatValue);
    }

    public static final void onAnimationUpdate$18(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C1051930dTr c1051930dTr = (C1051930dTr) aUListenerS265S0100000_16.l0;
        c1051930dTr.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TuxIconView tuxIconView = c1051930dTr.LL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.x5(tuxIconView, fFloatValue);
    }

    public static final void onAnimationUpdate$19(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C427870Gq9 c427870Gq9 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLII;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c427870Gq9 != null) {
            layoutParams = c427870Gq9.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        C427870Gq9 c427870Gq92 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLII;
        if (c427870Gq92 != null) {
            C786410Ut5.F6(c427870Gq92, layoutParams);
        }
        C612110Nzd c612110Nzd = C612110Nzd.LIZ;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0)).getAweme();
        c612110Nzd.getClass();
        if (C612110Nzd.LIZIZ(aweme)) {
            FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
            if (frameLayout != null && (layoutParams2 = frameLayout.getLayoutParams()) != null) {
                layoutParams2.width = iIntValue;
                layoutParams2.height = iIntValue;
            }
            FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
            if (frameLayout2 != null) {
                C786410Ut5.a6(frameLayout2, layoutParams2);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        if (frameLayout != null) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            frameLayout.setPadding(iIntValue, iIntValue, iIntValue, iIntValue);
        }
    }

    public static final void onAnimationUpdate$20(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
                layoutParams.height = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    public static final void onAnimationUpdate$21(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIIIL;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIIIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    public static final void onAnimationUpdate$23(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C991760buo c991760buo = (C991760buo) aUListenerS265S0100000_16.l0;
        C786410Ut5.f5(c991760buo.LLILLL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$24(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C991760buo c991760buo = (C991760buo) aUListenerS265S0100000_16.l0;
        Function2<? super Float, ? super Float, Unit> function2 = c991760buo.LLJIJIL;
        if (function2 != null) {
            function2.invoke(Float.valueOf(c991760buo.LLJI), valueAnimator.getAnimatedValue());
        }
        C786410Ut5.ld(c991760buo.LLILLL, ((Float) valueAnimator.getAnimatedValue()).floatValue() + c991760buo.LLJI);
    }

    public static final void onAnimationUpdate$25(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C1447790nmL c1447790nmL = ((C1447770nmJ) aUListenerS265S0100000_16.l0).LIZIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1447790nmL);
            c1447790nmL.setAlpha(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$26(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<C991140bto> it2 = ((FeedCleanComponent) aUListenerS265S0100000_16.l0).LLJILJIL.iterator();
        while (it2.hasNext()) {
            View view = it2.next().LIZIZ.get();
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
        }
        FeedCleanComponent feedCleanComponent = (FeedCleanComponent) aUListenerS265S0100000_16.l0;
        feedCleanComponent.getClass();
        IFriendsTabLayoutAbility iFriendsTabLayoutAbility = (IFriendsTabLayoutAbility) C1558520qew.LIZ(C1558520qew.LJIIL(feedCleanComponent), IFriendsTabLayoutAbility.class, null);
        if (iFriendsTabLayoutAbility != null) {
            iFriendsTabLayoutAbility.Sl2(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$27(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showWithAnimV2 alpha: ");
        sbLIZ.append(((ViewGroup) aUListenerS265S0100000_16.l0).getAlpha());
        C1628270sTR.LIZIZ("CameraEffectCarouselBottomFuncComponentScene", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationUpdate$28(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aUListenerS265S0100000_16.l0).getLayoutParams();
        marginLayoutParams.bottomMargin = iIntValue;
        C786410Ut5.W5((View) aUListenerS265S0100000_16.l0, marginLayoutParams);
    }

    public static final void onAnimationUpdate$29(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((LabelContainerWidget) aUListenerS265S0100000_16.l0).R1().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        ((LabelContainerWidget) aUListenerS265S0100000_16.l0).R1().requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        TuxTextView tuxTextView = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLLJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.B5(tuxTextView, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$30(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((C998340c5Q) aUListenerS265S0100000_16.l0).LIZLLL().LIZJ(num.intValue());
        }
    }

    public static final void onAnimationUpdate$31(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C998340c5Q) aUListenerS265S0100000_16.l0).LIZLLL().LIZIZ(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$32(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).setBackgroundColor(num.intValue());
        }
    }

    public static final void onAnimationUpdate$33(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).LLLIIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$34(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C994880bzq) aUListenerS265S0100000_16.l0).LLJ.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C994880bzq c994880bzq = (C994880bzq) aUListenerS265S0100000_16.l0;
        FrameLayout.LayoutParams layoutParams = c994880bzq.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c994880bzq);
        c994880bzq.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$35(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C994880bzq) aUListenerS265S0100000_16.l0).LLJ.setMarginEnd(((Integer) valueAnimator.getAnimatedValue()).intValue());
        C994880bzq c994880bzq = (C994880bzq) aUListenerS265S0100000_16.l0;
        FrameLayout.LayoutParams layoutParams = c994880bzq.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c994880bzq);
        c994880bzq.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$36(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C786410Ut5.W4((LinearLayout) aUListenerS265S0100000_16.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$37(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1058500deS c1058500deS = (C1058500deS) aUListenerS265S0100000_16.l0;
            float fFloatValue = f.floatValue();
            InterfaceC679410Qkt interfaceC679410Qkt = c1058500deS.LLILZ;
            if (interfaceC679410Qkt != null) {
                interfaceC679410Qkt.LLJLL(fFloatValue * c1058500deS.LLIZ, c1058500deS.LLJIJIL);
            }
        }
    }

    public static final void onAnimationUpdate$38(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1058500deS c1058500deS = (C1058500deS) aUListenerS265S0100000_16.l0;
            float fFloatValue = f.floatValue();
            InterfaceC679410Qkt interfaceC679410Qkt = c1058500deS.LLILZ;
            if (interfaceC679410Qkt != null) {
                interfaceC679410Qkt.LLJLL(fFloatValue * c1058500deS.LLIZ, c1058500deS.LLJIJIL);
            }
        }
    }

    public static final void onAnimationUpdate$39(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C1066550drR) aUListenerS265S0100000_16.l0).setScrollOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        TuxTextView tuxTextView = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLLJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setMaxWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$40(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C1066550drR) aUListenerS265S0100000_16.l0).setScrollOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$41(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).m61(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$42(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).LLLIIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$43(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).LLLIIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$44(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).LLLIIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$45(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).LLLIIL(num.intValue());
        }
    }

    public static final void onAnimationUpdate$46(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).XV1(num.intValue());
        }
    }

    public static final void onAnimationUpdate$47(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((InterfaceC998100c52) aUListenerS265S0100000_16.l0).setBackgroundColor(num.intValue());
        }
    }

    public static final void onAnimationUpdate$48(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((MiniGameInstantPlayContentAssem) aUListenerS265S0100000_16.l0).Gp(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$49(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        View view = ((C999120c6g) aUListenerS265S0100000_16.l0).LIZ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C786410Ut5.W5(view, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onAnimationUpdate$5(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLLL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    public static final void onAnimationUpdate$50(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        View view = ((C999120c6g) aUListenerS265S0100000_16.l0).LIZ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C786410Ut5.W5(view, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onAnimationUpdate$51(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C786410Ut5.W4((LinearLayout) aUListenerS265S0100000_16.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$52(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C1037300d6G) aUListenerS265S0100000_16.l0).setBottomMargin(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$53(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1075690e6B c1075690e6B = (C1075690e6B) aUListenerS265S0100000_16.l0;
        c1075690e6B.LIZLLL(fFloatValue, 0, 2, (View) c1075690e6B.LJIIIZ.getValue());
        C1075690e6B c1075690e6B2 = (C1075690e6B) aUListenerS265S0100000_16.l0;
        c1075690e6B2.LIZLLL(fFloatValue, 1, 0, (View) c1075690e6B2.LJIIJ.getValue());
        C1075690e6B c1075690e6B3 = (C1075690e6B) aUListenerS265S0100000_16.l0;
        c1075690e6B3.LIZLLL(fFloatValue, 2, 1, (View) c1075690e6B3.LJIIJJI.getValue());
    }

    public static final void onAnimationUpdate$54(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        HorizontalScrollView horizontalScrollView = ((C1077050e8N) aUListenerS265S0100000_16.l0).LJFF;
        if (horizontalScrollView == null) {
            horizontalScrollView = null;
        }
        horizontalScrollView.scrollTo((int) ((Float) valueAnimator.getAnimatedValue()).floatValue(), 0);
    }

    public static final void onAnimationUpdate$55(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C1004980cG8.LIZ((C1004960cG6) aUListenerS265S0100000_16.l0, num.intValue());
        }
    }

    public static final void onAnimationUpdate$56(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C1037280d6E) aUListenerS265S0100000_16.l0).LJI(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$57(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((View) aUListenerS265S0100000_16.l0).scrollTo(0, num.intValue());
        }
    }

    public static final void onAnimationUpdate$58(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout linearLayout = ((C1414130mu3) aUListenerS265S0100000_16.l0).LLJJJJLIIL;
        if (linearLayout != null) {
            layoutParams = linearLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = iIntValue;
        LinearLayout linearLayout2 = ((C1414130mu3) aUListenerS265S0100000_16.l0).LLJJJJLIIL;
        if (linearLayout2 != null) {
            C786410Ut5.d6(linearLayout2, marginLayoutParams);
        }
    }

    public static final void onAnimationUpdate$59(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        ((TakoVideoGenProgressAssem) aUListenerS265S0100000_16.l0).up(iIntValue);
        ((TakoVideoGenProgressAssem) aUListenerS265S0100000_16.l0).tp(iIntValue);
    }

    public static final void onAnimationUpdate$6(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C427870Gq9 c427870Gq9 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLII;
        if (c427870Gq9 != null) {
            layoutParams = c427870Gq9.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        C427870Gq9 c427870Gq92 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLII;
        if (c427870Gq92 != null) {
            C786410Ut5.F6(c427870Gq92, layoutParams);
        }
    }

    public static final void onAnimationUpdate$60(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            DialogC1718130uoN dialogC1718130uoN = (DialogC1718130uoN) aUListenerS265S0100000_16.l0;
            float fFloatValue = f.floatValue();
            C1295960jpS c1295960jpS = dialogC1718130uoN.LLILZ;
            if (c1295960jpS != null) {
                C786410Ut5.f5(c1295960jpS, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$61(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        C1074010e3T emptyPagePowerListFromXml = ((C1073840e3C) aUListenerS265S0100000_16.l0).getEmptyPagePowerListFromXml();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(emptyPagePowerListFromXml);
        emptyPagePowerListFromXml.setAlpha(animatedFraction);
    }

    public static final void onAnimationUpdate$62(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        View view = ((AlertDialogC1377870lxZ) aUListenerS265S0100000_16.l0).LLJJ;
        if (view != null) {
            view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((AlertDialogC1377870lxZ) aUListenerS265S0100000_16.l0).LLJJ.requestLayout();
        }
    }

    public static final void onAnimationUpdate$63(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        View viewLIZ;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C20286814Zm c20286814Zm = (C20286814Zm) aUListenerS265S0100000_16.l0;
        c20286814Zm.LJJIIJ(c20286814Zm.LJJIJIIJI, fFloatValue);
        C20286814Zm c20286814Zm2 = (C20286814Zm) aUListenerS265S0100000_16.l0;
        InterfaceC1049140dPM interfaceC1049140dPM = c20286814Zm2.LJJLIIIJLLLLLLLZ;
        if (interfaceC1049140dPM != null) {
            viewLIZ = interfaceC1049140dPM.LIZ();
        } else {
            viewLIZ = null;
        }
        c20286814Zm2.LJJIIJ(viewLIZ, fFloatValue);
        ((C20286814Zm) aUListenerS265S0100000_16.l0).LJJIFFI(fFloatValue, true);
        ((C20286814Zm) aUListenerS265S0100000_16.l0).LJJII(fFloatValue);
    }

    public static final void onAnimationUpdate$64(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C18NS) aUListenerS265S0100000_16.l0).setPivotX(0.0f);
        ((C18NS) aUListenerS265S0100000_16.l0).setPivotY(r1.getHeight());
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((C18NS) aUListenerS265S0100000_16.l0).getAnchorImgFromXml().getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue;
        C786410Ut5.G6(((C18NS) aUListenerS265S0100000_16.l0).getAnchorProductImgFromXml(), layoutParams);
    }

    public static final void onAnimationUpdate$65(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ((C18NR) aUListenerS265S0100000_16.l0).setPivotX(0.0f);
        ((C18NR) aUListenerS265S0100000_16.l0).setPivotY(r1.getHeight());
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((C18NR) aUListenerS265S0100000_16.l0).getAnchorImgFromXml().getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue;
        C786410Ut5.G6(((C18NR) aUListenerS265S0100000_16.l0).getAnchorProductImgFromXml(), layoutParams);
    }

    public static final void onAnimationUpdate$7(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
        if (frameLayout3 != null && (layoutParams2 = frameLayout3.getLayoutParams()) != null) {
            layoutParams2.width = iIntValue;
        }
        FrameLayout frameLayout4 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIL;
        if (frameLayout4 != null) {
            C786410Ut5.a6(frameLayout4, layoutParams2);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIIIL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLIIIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
        FrameLayout frameLayout3 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        if (frameLayout3 != null && (layoutParams2 = frameLayout3.getLayoutParams()) != null) {
            layoutParams2.width = iIntValue;
        }
        FrameLayout frameLayout4 = ((VideoMusicCoverAssem) aUListenerS265S0100000_16.l0).LLLLJ;
        if (frameLayout4 != null) {
            C786410Ut5.a6(frameLayout4, layoutParams2);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS265S0100000_16 aUListenerS265S0100000_16, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aUListenerS265S0100000_16.l0).getLayoutParams();
        marginLayoutParams.bottomMargin = iIntValue;
        C786410Ut5.W5((View) aUListenerS265S0100000_16.l0, marginLayoutParams);
    }
}
