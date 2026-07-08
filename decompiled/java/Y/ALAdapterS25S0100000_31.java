package Y;

import X.C01TT;
import X.C0GY9;
import X.C1104930erL;
import X.C1143100fqu;
import X.C1145830fvJ;
import X.C118300cf;
import X.C1308910kAL;
import X.C1324720kZq;
import X.C159B;
import X.C159G;
import X.C15CT;
import X.C15D3;
import X.C15DF;
import X.C15IT;
import X.C16EG;
import X.C16EH;
import X.C20441214yg;
import X.C20481615Ck;
import X.C20481815Cm;
import X.C20496615Ie;
import X.C20519915Rd;
import X.C20575915fJ;
import X.C20588315hJ;
import X.C2276411E8h;
import X.C418440Gaw;
import X.C427330GpH;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C970370bMJ;
import X.EnumC586570MzX;
import X.InterfaceC20588415hK;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.bytedance.android.live.liveinteract.match.business.event.MatchWinStreakLowAlphaChannel;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.EcSearchBarAnimationConfig;
import com.ss.android.ugc.aweme.base.ui.AudioControlView$AudioControlHandler;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS25S0100000_31 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 8:
                onAnimationCancel$0(this, animator);
                break;
            case 15:
                onAnimationCancel$1(this, animator);
                break;
            case 16:
                onAnimationCancel$2(this, animator);
                break;
            case 22:
                onAnimationCancel$3(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationCancel$4(this, animator);
                break;
            case 37:
                onAnimationCancel$5(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 30:
            default:
                super.onAnimationEnd(animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$12(this, animator);
                break;
            case 14:
                onAnimationEnd$13(this, animator);
                break;
            case 15:
                onAnimationEnd$14(this, animator);
                break;
            case 16:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$16(this, animator);
                break;
            case 19:
                onAnimationEnd$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$18(this, animator);
                break;
            case 21:
                onAnimationEnd$19(this, animator);
                break;
            case 22:
                onAnimationEnd$20(this, animator);
                break;
            case 23:
                onAnimationEnd$21(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$22(this, animator);
                break;
            case 25:
                onAnimationEnd$23(this, animator);
                break;
            case 26:
                onAnimationEnd$24(this, animator);
                break;
            case 27:
                onAnimationEnd$25(this, animator);
                break;
            case 28:
                onAnimationEnd$26(this, animator);
                break;
            case 29:
                onAnimationEnd$27(this, animator);
                break;
            case 31:
                onAnimationEnd$28(this, animator);
                break;
            case 32:
                onAnimationEnd$29(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$30(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$31(this, animator);
                break;
            case 35:
                onAnimationEnd$32(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationEnd$33(this, animator);
                break;
            case 37:
                onAnimationEnd$34(this, animator);
                break;
            case 38:
                onAnimationEnd$35(this, animator);
                break;
            case 39:
                onAnimationEnd$36(this, animator);
                break;
            case 40:
                onAnimationEnd$37(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$0(this, animator);
                break;
            case 15:
                onAnimationStart$1(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationStart$2(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$3(this, animator);
                break;
            case 22:
                onAnimationStart$4(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$5(this, animator);
                break;
            case 30:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationStart$7(this, animator);
                break;
            case 39:
                onAnimationStart$8(this, animator);
                break;
            case 40:
                onAnimationStart$9(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS25S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C159B c159b = ((C159G) aLAdapterS25S0100000_31.l0).LIZLLL;
        if (c159b != null) {
            c159b.LIZ(true);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationCancel(animator);
        C1143100fqu c1143100fqu = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LJFF();
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationCancel(animator);
        C1143100fqu c1143100fqu = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LJFF();
        }
        C1143100fqu c1143100fqu2 = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu2 != null) {
            C786410Ut5.LLLILZ(c1143100fqu2, 8);
        }
        C1324720kZq c1324720kZq = ((C15DF) aLAdapterS25S0100000_31.l0).LLJJL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        View view = ((C15DF) aLAdapterS25S0100000_31.l0).LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).zp(-2);
        DataChannel dataChannel = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(MatchWinStreakLowAlphaChannel.class, Boolean.FALSE);
        }
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLJJJJ = EnumC586570MzX.NONE;
    }

    public static final void onAnimationCancel$4(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.Ob(((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZ, 1.0f);
        C786410Ut5.pc(((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZ, 1.0f);
        C20575915fJ c20575915fJ = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ.LIZIZ.setHint(c20575915fJ.LJI);
        C20575915fJ c20575915fJ2 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ2.LIZIZ.setText(c20575915fJ2.LJI);
    }

    public static final void onAnimationCancel$5(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationCancel(animator);
        C20575915fJ c20575915fJ = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ.LIZIZ.setText(c20575915fJ.LJI);
        C20575915fJ c20575915fJ2 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ2.LIZIZ.setHint(c20575915fJ2.LJII);
    }

    public static final void onAnimationEnd$0(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C15IT c15it = (C15IT) aLAdapterS25S0100000_31.l0;
        if (c15it != null) {
            c15it.LIZ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        InterfaceC20588415hK interfaceC20588415hK = ((C20588315hJ) aLAdapterS25S0100000_31.l0).LL;
        if (interfaceC20588415hK != null) {
            interfaceC20588415hK.LIZ();
        }
        C20588315hJ.LLILLL = false;
        ((C20588315hJ) aLAdapterS25S0100000_31.l0).getClass();
    }

    public static final void onAnimationEnd$10(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
    }

    public static final void onAnimationEnd$11(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
        C20441214yg.LIZIZ("EndIncentiveSettlementFragmentV2", "play ranking title change anim end");
    }

    public static final void onAnimationEnd$12(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C16EH c16eh = ((C16EG) aLAdapterS25S0100000_31.l0).LLILZLL;
        if (c16eh != null) {
            c16eh.onHide();
            ((C16EG) aLAdapterS25S0100000_31.l0).LLIZ = null;
        }
    }

    public static final void onAnimationEnd$13(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        ((VideoProgressBarAssem) aLAdapterS25S0100000_31.l0).Ep().vQ2(0, false);
    }

    public static final void onAnimationEnd$14(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C1143100fqu c1143100fqu = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LJFF();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C1324720kZq c1324720kZq = ((C15DF) aLAdapterS25S0100000_31.l0).LLJJL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        C1143100fqu c1143100fqu = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LJFF();
        }
        C1143100fqu c1143100fqu2 = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu2 != null) {
            C786410Ut5.LLLILZ(c1143100fqu2, 8);
        }
        View view = ((C15DF) aLAdapterS25S0100000_31.l0).LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$16(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C15DF c15df = (C15DF) aLAdapterS25S0100000_31.l0;
        C1143100fqu c1143100fqu = c15df.LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LIZ(c15df.LLJJL);
        }
        C1143100fqu c1143100fqu2 = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu2 != null) {
            C786410Ut5.LLLILZ(c1143100fqu2, 0);
        }
    }

    public static final void onAnimationEnd$17(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C15DF) aLAdapterS25S0100000_31.l0).LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$18(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        RelativeLayout relativeLayout = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIIJIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        }
        RelativeLayout relativeLayout2 = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIIJIL;
        if (relativeLayout2 != null) {
            C786410Ut5.Y4(relativeLayout2, 1.0f);
        }
        RelativeLayout relativeLayout3 = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIL;
        if (relativeLayout3 != null) {
            C786410Ut5.LLIIL(relativeLayout3, 8);
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C1104930erL c1104930erL = ((EnigmaPaywallDialog) aLAdapterS25S0100000_31.l0).LLLJ;
        if (c1104930erL != null) {
            c1104930erL.LIZIZ();
        }
        ((EnigmaPaywallDialog) aLAdapterS25S0100000_31.l0).LLLJ = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C786410Ut5.LLJJIII((C1324720kZq) aLAdapterS25S0100000_31.l0, 8);
        C786410Ut5.h5((C1324720kZq) aLAdapterS25S0100000_31.l0, 1.0f);
        C786410Ut5.Qc((C1324720kZq) aLAdapterS25S0100000_31.l0, 0.0f);
    }

    public static final void onAnimationEnd$20(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C20441214yg.LIZIZ("MatchCountDownAssem", "animator end");
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).zp(-2);
        DataChannel dataChannel = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(MatchWinStreakLowAlphaChannel.class, Boolean.FALSE);
        }
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLJJJJ = EnumC586570MzX.NONE;
    }

    public static final void onAnimationEnd$21(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLJJ;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C20441214yg.LIZ("holder  end");
    }

    public static final void onAnimationEnd$23(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C1145830fvJ c1145830fvJ = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLJJIJIIJIL;
        if (c1145830fvJ != null) {
            C786410Ut5.LLJLILLLLZIIL(c1145830fvJ, 8);
        }
        C427330GpH c427330GpH = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLJJIJI;
        if (c427330GpH != null) {
            C786410Ut5.LLJLLIL(c427330GpH, 8);
        }
    }

    public static final void onAnimationEnd$24(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C16EG c16eg = ((VideoProgressBarAssem) aLAdapterS25S0100000_31.l0).LLL;
        if (c16eg != null) {
            c16eg.LIZ();
            C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VoiceAdjust", "addVolume");
            AudioControlView$AudioControlHandler audioControlView$AudioControlHandler = c16eg.LLJI;
            if (audioControlView$AudioControlHandler != null) {
                audioControlView$AudioControlHandler.sendEmptyMessage(2);
            }
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C16EG c16eg = ((VideoProgressBarAssem) aLAdapterS25S0100000_31.l0).LLL;
        if (c16eg != null) {
            c16eg.LIZ();
            C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VoiceAdjust", "cutVolume");
            c16eg.LLJI.sendEmptyMessage(3);
        }
    }

    public static final void onAnimationEnd$26(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
    }

    public static final void onAnimationEnd$27(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
    }

    public static final void onAnimationEnd$28(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        ((C15CT) aLAdapterS25S0100000_31.l0).LLJJ = true;
    }

    public static final void onAnimationEnd$29(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        ((C20481615Ck) aLAdapterS25S0100000_31.l0).getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C786410Ut5.LLJJIII((C1324720kZq) aLAdapterS25S0100000_31.l0, 8);
        C786410Ut5.h5((C1324720kZq) aLAdapterS25S0100000_31.l0, 1.0f);
        C786410Ut5.Qc((C1324720kZq) aLAdapterS25S0100000_31.l0, 0.0f);
    }

    public static final void onAnimationEnd$30(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
    }

    public static final void onAnimationEnd$31(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C15D3 c15d3 = ((C20481615Ck) aLAdapterS25S0100000_31.l0).LLJJIII;
        if (c15d3 != null) {
            c15d3.LIZ();
        }
    }

    public static final void onAnimationEnd$32(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C20481815Cm c20481815Cm = (C20481815Cm) aLAdapterS25S0100000_31.l0;
        c20481815Cm.LJI.sf(c20481815Cm.LIZ);
    }

    public static final void onAnimationEnd$33(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C20575915fJ c20575915fJ = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        if (c20575915fJ.LJFF) {
            c20575915fJ.getClass();
            C118300cf c118300cf = new C118300cf();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, c20575915fJ.LJI.length());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS233S0200000_31(c118300cf, c20575915fJ, 15));
            valueAnimatorOfInt.addListener(new ALAdapterS25S0100000_31(c20575915fJ, 37));
            c20575915fJ.LIZLLL = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            return;
        }
        c20575915fJ.LIZIZ.setHint(c20575915fJ.LJI);
        C20575915fJ c20575915fJ2 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ2.LIZIZ.setText(c20575915fJ2.LJI);
    }

    public static final void onAnimationEnd$34(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C20575915fJ c20575915fJ = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        c20575915fJ.LIZIZ.setHint(c20575915fJ.LJII);
        if (((C20575915fJ) aLAdapterS25S0100000_31.l0).LJFF && ((Number) EcSearchBarAnimationConfig.LIZJ.getValue()).intValue() == 2) {
            C20575915fJ c20575915fJ2 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
            Drawable background = c20575915fJ2.LIZ.getBackground();
            C118300cf c118300cf = new C118300cf();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c20575915fJ2.LIZ.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(0);
                gradientDrawable.setStroke(5, iIntValue);
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(10));
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{background, gradientDrawable});
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 0);
                valueAnimatorOfInt.setDuration(600L);
                valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS158S0300000_31(c20575915fJ2, gradientDrawable, c118300cf, 3));
                valueAnimatorOfInt.addListener(new ALAdapterS14S0300000_31(layerDrawable, c20575915fJ2, background, 2));
                c20575915fJ2.LJ = valueAnimatorOfInt;
                valueAnimatorOfInt.start();
            }
        }
    }

    public static final void onAnimationEnd$35(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS25S0100000_31.l0).invoke();
    }

    public static final void onAnimationEnd$36(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C01TT.LIZLLL(new AwS575S0100000_31((C20519915Rd) aLAdapterS25S0100000_31.l0, 1602));
    }

    public static final void onAnimationEnd$37(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C01TT.LIZLLL(new AwS575S0100000_31((C20519915Rd) aLAdapterS25S0100000_31.l0, 1603));
    }

    public static final void onAnimationEnd$4(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C786410Ut5.LLJJIII((C1324720kZq) aLAdapterS25S0100000_31.l0, 8);
        C786410Ut5.h5((C1324720kZq) aLAdapterS25S0100000_31.l0, 1.0f);
        C786410Ut5.Qc((C1324720kZq) aLAdapterS25S0100000_31.l0, 0.0f);
    }

    public static final void onAnimationEnd$5(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "animateScoreReveal: animation ended");
        if (C970370bMJ.LJ()) {
            ((C15DF) aLAdapterS25S0100000_31.l0).LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C500260Jjc.LJIILIIL((TuxTextView) aLAdapterS25S0100000_31.l0);
        C786410Ut5.B5((TuxTextView) aLAdapterS25S0100000_31.l0, 1.0f);
    }

    public static final void onAnimationEnd$7(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C786410Ut5.Vc((TuxTextView) aLAdapterS25S0100000_31.l0, 0.0f);
    }

    public static final void onAnimationEnd$8(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        C159B c159b = ((C159G) aLAdapterS25S0100000_31.l0).LIZLLL;
        if (c159b != null) {
            c159b.LIZ(false);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) aLAdapterS25S0100000_31.l0;
        endIncentiveSettlementFragmentV2.sf(endIncentiveSettlementFragmentV2.LLILZIL);
    }

    public static final void onAnimationStart$0(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        ((C16EG) aLAdapterS25S0100000_31.l0).LIZ();
    }

    public static final void onAnimationStart$1(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        C1143100fqu c1143100fqu = ((C15DF) aLAdapterS25S0100000_31.l0).LLJL;
        if (c1143100fqu != null) {
            c1143100fqu.LJ(false);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        View view = ((C15DF) aLAdapterS25S0100000_31.l0).LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        RelativeLayout relativeLayout = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIIJIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        }
        RelativeLayout relativeLayout2 = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIIJIL;
        if (relativeLayout2 != null) {
            C786410Ut5.Y4(relativeLayout2, 0.0f);
        }
        RelativeLayout relativeLayout3 = ((C20496615Ie) aLAdapterS25S0100000_31.l0).LLJJIJIL;
        if (relativeLayout3 != null) {
            C786410Ut5.LLIIL(relativeLayout3, 0);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        DataChannel dataChannel = ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(MatchWinStreakLowAlphaChannel.class, Boolean.TRUE);
        }
        C20441214yg.LIZIZ("MatchCountDownAssem", "animator start");
    }

    public static final void onAnimationStart$5(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        C20441214yg.LIZ(" holder  start");
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).getClass();
        ((MatchCountDownAssem) aLAdapterS25S0100000_31.l0).cp().xQ2();
    }

    public static final void onAnimationStart$6(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) aLAdapterS25S0100000_31.l0;
        C786410Ut5.LJLIIL(300L, endIncentiveSettlementFragment.PR(), new ARunnableS131S0100000_31(endIncentiveSettlementFragment, 141));
    }

    public static final void onAnimationStart$7(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        super.onAnimationStart(animator);
        ((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZ.setPivotX(r1.getWidth() / 2.0f);
        ((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZ.setPivotY(r1.getHeight() / 2.0f);
        C20575915fJ c20575915fJ = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        View view = c20575915fJ.LIZ;
        c20575915fJ.getClass();
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            parent = viewGroup.getParent();
        }
        C20575915fJ c20575915fJ2 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        CharSequence text = c20575915fJ2.LIZIZ.getText();
        if (text == null) {
            text = "";
        }
        c20575915fJ2.LJI = text;
        C20575915fJ c20575915fJ3 = (C20575915fJ) aLAdapterS25S0100000_31.l0;
        CharSequence hint = c20575915fJ3.LIZIZ.getHint();
        if (hint == null) {
            hint = "";
        }
        c20575915fJ3.LJII = hint;
        ((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZIZ.setText("");
        ((C20575915fJ) aLAdapterS25S0100000_31.l0).LIZIZ.setHint("");
    }

    public static final void onAnimationStart$8(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        ((C20519915Rd) aLAdapterS25S0100000_31.l0).LJIIIZ = true;
    }

    public static final void onAnimationStart$9(ALAdapterS25S0100000_31 aLAdapterS25S0100000_31, Animator animator) {
        ((C20519915Rd) aLAdapterS25S0100000_31.l0).LJIIIZ = true;
    }
}
