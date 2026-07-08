package Y;

import X.C0GSW;
import X.C0GU1;
import X.C0IG0;
import X.C0IJV;
import X.C0KVZ;
import X.C1117710fBx;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C1489080oqw;
import X.C16FZ;
import X.C475460Iki;
import X.C480130IsF;
import X.C484860Izs;
import X.C490900JMy;
import X.C497740JfY;
import X.C498170JgF;
import X.C500260Jjc;
import X.C521020Kc0;
import X.C521210KcJ;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.profile.cell.FrameExplanationCell;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeOptWidget;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS257S0100000_7 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS257S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = (View) aUListenerS257S0100000_7.l0;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view2 = (View) aUListenerS257S0100000_7.l0;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS257S0100000_7.l0;
        if (livePlayFragment.LLLLLJLJLL != null && Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            ViewGroup.LayoutParams layoutParams = livePlayFragment.LLLLLJLJLL.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.getMarginEnd() != iIntValue) {
                    marginLayoutParams.setMarginEnd(iIntValue);
                    C786410Ut5.X5(layoutParams, livePlayFragment.LLLLLJLJLL);
                }
            }
            livePlayFragment.jU(new C0IG0());
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C480130IsF) aUListenerS257S0100000_7.l0).h0(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        View view = ((RecommendSwipeOptWidget) aUListenerS257S0100000_7.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.ed(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        LiveDrawerEntranceWidget liveDrawerEntranceWidget = (LiveDrawerEntranceWidget) aUListenerS257S0100000_7.l0;
        liveDrawerEntranceWidget.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null && (animatedValue instanceof Integer)) {
            liveDrawerEntranceWidget.F1(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C0IJV) aUListenerS257S0100000_7.l0).LIZIZ(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue;
        float fFloatValue2;
        C1324720kZq c1324720kZq = ((C475460Iki) aUListenerS257S0100000_7.l0).LJ;
        float fFloatValue3 = 0.0f;
        if (c1324720kZq != null) {
            Float f = (Float) valueAnimator.getAnimatedValue();
            if (f != null) {
                fFloatValue2 = f.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            C786410Ut5.md(c1324720kZq, fFloatValue2);
        }
        C1295960jpS c1295960jpS = ((C475460Iki) aUListenerS257S0100000_7.l0).LJIIJJI;
        if (c1295960jpS != null) {
            Float f2 = (Float) valueAnimator.getAnimatedValue();
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            C786410Ut5.ld(c1295960jpS, fFloatValue);
        }
        C16FZ c16fz = ((C475460Iki) aUListenerS257S0100000_7.l0).LJIIJ;
        if (c16fz != null) {
            Float f3 = (Float) valueAnimator.getAnimatedValue();
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
            c16fz.setTranslationY(fFloatValue3);
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJILJILJ;
        if (viewGroup != null) {
            C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        C0GSW c0gsw = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJILLL;
        if (c0gsw != null) {
            c0gsw.setStartPointAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        C0GSW c0gsw = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJILLL;
        if (c0gsw != null) {
            c0gsw.setEndPointAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJI;
        if (viewGroup != null) {
            C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        }
        View view = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJIII;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJI;
        if (viewGroup != null) {
            C786410Ut5.Gc(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        }
        ViewGroup viewGroup2 = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJI;
        if (viewGroup2 != null) {
            C786410Ut5.bd(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup2);
        }
        View view = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJIII;
        if (view != null) {
            C786410Ut5.Jc(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
        View view2 = ((GoLiveViewHolder) aUListenerS257S0100000_7.l0).LLJJIII;
        if (view2 != null) {
            C786410Ut5.ed(view2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ((Function2) aUListenerS257S0100000_7.l0).invoke(Float.valueOf((animatedFraction * 1.0f) + 0.2f), Float.valueOf(1.0f - animatedFraction));
    }

    public static final void onAnimationUpdate$20(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        C490900JMy c490900JMy = (C490900JMy) aUListenerS257S0100000_7.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c490900JMy);
        c490900JMy.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$21(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameExplanationCell frameExplanationCell = (FrameExplanationCell) aUListenerS257S0100000_7.l0;
        float f = fFloatValue - frameExplanationCell.LLJJIII;
        C1324720kZq c1324720kZq = frameExplanationCell.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.Qc(c1324720kZq, f);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.Qc(c1324720kZq2, f);
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameExplanationCell frameExplanationCell = (FrameExplanationCell) aUListenerS257S0100000_7.l0;
        float f = fFloatValue - frameExplanationCell.LLJJIJIIJIL;
        C1324720kZq c1324720kZq = frameExplanationCell.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.md(c1324720kZq, f);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.md(c1324720kZq2, f);
        }
    }

    public static final void onAnimationUpdate$23(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1324720kZq c1324720kZq = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.Yb(c1324720kZq, fFloatValue);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLILZLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.xc(c1324720kZq2, fFloatValue);
        }
        C1324720kZq c1324720kZq3 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq3 != null) {
            C786410Ut5.Yb(c1324720kZq3, fFloatValue);
        }
        C1324720kZq c1324720kZq4 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq4 != null) {
            C786410Ut5.xc(c1324720kZq4, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$24(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameExplanationCell frameExplanationCell = (FrameExplanationCell) aUListenerS257S0100000_7.l0;
        float f = fFloatValue - frameExplanationCell.LLJJIII;
        C1324720kZq c1324720kZq = frameExplanationCell.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.Qc(c1324720kZq, f);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.Qc(c1324720kZq2, f);
        }
    }

    public static final void onAnimationUpdate$25(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameExplanationCell frameExplanationCell = (FrameExplanationCell) aUListenerS257S0100000_7.l0;
        float f = fFloatValue - frameExplanationCell.LLJJIJIIJIL;
        C1324720kZq c1324720kZq = frameExplanationCell.LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.md(c1324720kZq, f);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.md(c1324720kZq2, f);
        }
    }

    public static final void onAnimationUpdate$26(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1324720kZq c1324720kZq = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLILZLL;
        if (c1324720kZq != null) {
            C786410Ut5.Yb(c1324720kZq, fFloatValue);
        }
        C1324720kZq c1324720kZq2 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLILZLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.xc(c1324720kZq2, fFloatValue);
        }
        C1324720kZq c1324720kZq3 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq3 != null) {
            C786410Ut5.Yb(c1324720kZq3, fFloatValue);
        }
        C1324720kZq c1324720kZq4 = ((FrameExplanationCell) aUListenerS257S0100000_7.l0).LLIZ;
        if (c1324720kZq4 != null) {
            C786410Ut5.xc(c1324720kZq4, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$27(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aUListenerS257S0100000_7.l0;
        ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.LLLIIII.getLayoutParams();
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.X5(layoutParams, liveRoomUserInfoWidget.LLLIIII);
    }

    public static final void onAnimationUpdate$28(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aUListenerS257S0100000_7.l0;
        ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.LLLIIII.getLayoutParams();
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.X5(layoutParams, liveRoomUserInfoWidget.LLLIIII);
    }

    public static final void onAnimationUpdate$29(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        C0KVZ c0kvz = ((C1117710fBx) aUListenerS257S0100000_7.l0).LLJJI;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0kvz);
        c0kvz.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            for (View view : (View[]) aUListenerS257S0100000_7.l0) {
                C786410Ut5.T4(view, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$30(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C484860Izs) aUListenerS257S0100000_7.l0).LJIIIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$31(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Lb(fFloatValue, (ViewGroup) aUListenerS257S0100000_7.l0);
        C786410Ut5.mc(fFloatValue, (ViewGroup) aUListenerS257S0100000_7.l0);
        ViewGroup viewGroup = (ViewGroup) aUListenerS257S0100000_7.l0;
        float f = fFloatValue * 2;
        if (f > 1.0f) {
            f = 1.0f;
        }
        C786410Ut5.R4(f, viewGroup);
    }

    public static final void onAnimationUpdate$32(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        C498170JgF c498170JgF;
        C0GU1 c0gu1;
        int left;
        C1489080oqw c1489080oqw = (C1489080oqw) aUListenerS257S0100000_7.l0;
        View view = null;
        if (c1489080oqw != null) {
            view = c1489080oqw.LIZIZ;
        }
        if ((view instanceof C498170JgF) && (c498170JgF = (C498170JgF) view) != null && (c0gu1 = c498170JgF.LL) != null) {
            if (C497740JfY.LJJ()) {
                left = c498170JgF.getRight();
            } else {
                left = c498170JgF.getLeft();
            }
            c0gu1.setMaskEdge(left);
        }
    }

    public static final void onAnimationUpdate$33(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Lb(fFloatValue, (ViewGroup) aUListenerS257S0100000_7.l0);
        C786410Ut5.mc(fFloatValue, (ViewGroup) aUListenerS257S0100000_7.l0);
        ViewGroup viewGroup = (ViewGroup) aUListenerS257S0100000_7.l0;
        float f = fFloatValue * 2;
        if (f > 1.0f) {
            f = 1.0f;
        }
        C786410Ut5.R4(f, viewGroup);
    }

    public static final void onAnimationUpdate$34(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJJZ = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C521020Kc0 c521020Kc0 = ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
    }

    public static final void onAnimationUpdate$35(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJLI = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C521020Kc0 c521020Kc0 = ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
    }

    public static final void onAnimationUpdate$36(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJL = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C521020Kc0 c521020Kc0 = ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
    }

    public static final void onAnimationUpdate$37(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJJZ = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C521020Kc0 c521020Kc0 = ((C521210KcJ) aUListenerS257S0100000_7.l0).LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
    }

    public static final void onAnimationUpdate$38(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        View view = ((ProgrammedLiveFollowCardWidget) aUListenerS257S0100000_7.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$39(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        View view = ((ProgrammedLiveFollowCardWidget) aUListenerS257S0100000_7.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            for (View view : (View[]) aUListenerS257S0100000_7.l0) {
                if (C500260Jjc.LJJJJIZL(view)) {
                    C786410Ut5.T4(view, fFloatValue);
                }
            }
        }
    }

    public static final void onAnimationUpdate$40(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        if (((DrawGuessStatusWidget) aUListenerS257S0100000_7.l0).LLJJI) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = ((DrawGuessStatusWidget) aUListenerS257S0100000_7.l0).getView();
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$41(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (C497740JfY.LJJ()) {
            View view = (View) aUListenerS257S0100000_7.l0;
            if (view != null) {
                C500260Jjc.LJLJJI(iIntValue, view);
                return;
            }
            return;
        }
        View view2 = (View) aUListenerS257S0100000_7.l0;
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJLI(iIntValue, view2);
    }

    public static final void onAnimationUpdate$5(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C1324720kZq c1324720kZq = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C1324720kZq c1324720kZq2 = ((DrawGuessCanvasWidget) aUListenerS257S0100000_7.l0).LLILLL;
            if (c1324720kZq2 != null) {
                c1324720kZq = c1324720kZq2;
            }
            C786410Ut5.h5(c1324720kZq, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        View view = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            View view2 = ((DrawGuessToolbarWidget) aUListenerS257S0100000_7.l0).LLJILJIL;
            if (view2 == null) {
                view2 = null;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = (int) fFloatValue;
            View view3 = ((DrawGuessToolbarWidget) aUListenerS257S0100000_7.l0).LLJILJIL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((LiveProfileSheet) aUListenerS257S0100000_7.l0).LLLFFI;
        if (viewGroup != null) {
            C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((LiveProfileSheet) aUListenerS257S0100000_7.l0).LLLFFI;
        if (viewGroup != null) {
            C786410Ut5.R4(((Float) valueAnimator.getAnimatedValue()).floatValue(), viewGroup);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS257S0100000_7 aUListenerS257S0100000_7, ValueAnimator valueAnimator) {
        ((HangoutRoomFeedAssem) aUListenerS257S0100000_7.l0).ip(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
