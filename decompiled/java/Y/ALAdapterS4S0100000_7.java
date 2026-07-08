package Y;

import X.AbstractC498420Jge;
import X.C0IH6;
import X.C0III;
import X.C0J70;
import X.C0KVZ;
import X.C1096340edU;
import X.C1117710fBx;
import X.C1143920fsE;
import X.C12ES;
import X.C1324720kZq;
import X.C16F5;
import X.C19748612Om;
import X.C19MB;
import X.C1ACA;
import X.C274990Aq9;
import X.C466280IQg;
import X.C479760Ire;
import X.C497740JfY;
import X.C498170JgF;
import X.C500260Jjc;
import X.C519420KYq;
import X.C521020Kc0;
import X.C521210KcJ;
import X.C786410Ut5;
import X.CountDownTimerC521500Kcm;
import X.InterfaceC482890Iwh;
import X.InterfaceC519430KYr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.profile.cell.FrameExplanationCell;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class ALAdapterS4S0100000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$13(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationCancel$0(this, animator);
                break;
            case 27:
                onAnimationCancel$1(this, animator);
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case 15:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case 19:
            case 22:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$11(this, animator);
                break;
            case 14:
                onAnimationEnd$12(this, animator);
                break;
            case 16:
                onAnimationEnd$13(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$15(this, animator);
                break;
            case 21:
                onAnimationEnd$16(this, animator);
                break;
            case 23:
                onAnimationEnd$17(this, animator);
                break;
            case 26:
                onAnimationEnd$18(this, animator);
                break;
            case 27:
                onAnimationEnd$19(this, animator);
                break;
            case 28:
                onAnimationEnd$20(this, animator);
                break;
            case 29:
                onAnimationEnd$21(this, animator);
                break;
            case 30:
                onAnimationEnd$22(this, animator);
                break;
            case 31:
                onAnimationEnd$23(this, animator);
                break;
            case 32:
                onAnimationEnd$24(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$25(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 7:
                onAnimationStart$0(this, animator);
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 21:
            case 23:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            default:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$1(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$2(this, animator);
                break;
            case 15:
                onAnimationStart$3(this, animator);
                break;
            case 16:
                onAnimationStart$4(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$5(this, animator);
                break;
            case 19:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$7(this, animator);
                break;
            case 22:
                onAnimationStart$8(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$9(this, animator);
                break;
            case 25:
                onAnimationStart$10(this, animator);
                break;
            case 28:
                onAnimationStart$11(this, animator);
                break;
            case 32:
                onAnimationStart$12(this, animator);
                break;
        }
    }

    public ALAdapterS4S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_7.l0).z1(true);
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((C479760Ire) aLAdapterS4S0100000_7.l0).LIZIZ();
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        View view;
        Object parent = ((C466280IQg) aLAdapterS4S0100000_7.l0).getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            HandlerHook.viewPost(view, new ARunnableS107S0100000_7((C466280IQg) aLAdapterS4S0100000_7.l0, 6));
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C466280IQg c466280IQg = (C466280IQg) aLAdapterS4S0100000_7.l0;
        c466280IQg.animate().alpha(0.0f).setDuration(200L).setListener(new ALAdapterS4S0100000_7(c466280IQg, 0));
    }

    public static final void onAnimationEnd$10(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS4S0100000_7.l0);
    }

    public static final void onAnimationEnd$11(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        NextLiveData<Boolean> nextLiveData;
        ViewGroup viewGroup = ((GoLiveGuideCardWidget) aLAdapterS4S0100000_7.l0).LLJJIJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        C1ACA c1acaZ1 = ((GoLiveGuideCardWidget) aLAdapterS4S0100000_7.l0).z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJLZIJ = false;
        }
        ((GoLiveGuideCardWidget) aLAdapterS4S0100000_7.l0).hide();
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = ((GoLiveGuideCardWidget) aLAdapterS4S0100000_7.l0).M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILZLL) != null) {
            nextLiveData.setValue(Boolean.TRUE);
        }
    }

    public static final void onAnimationEnd$12(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS4S0100000_7.l0);
    }

    public static final void onAnimationEnd$14(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C500260Jjc.LJIILIIL(((AbstractC498420Jge) aLAdapterS4S0100000_7.l0).LJJI());
    }

    public static final void onAnimationEnd$15(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C500260Jjc.LLFFF(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJILLL);
        C500260Jjc.LLFFF(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJJ);
        FrameExplanationCell frameExplanationCell = (FrameExplanationCell) aLAdapterS4S0100000_7.l0;
        frameExplanationCell.LLJILLL = null;
        frameExplanationCell.LLJJ = null;
        frameExplanationCell.LJJ();
        C500260Jjc.LJIILIIL(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLILLL);
    }

    public static final void onAnimationEnd$16(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C786410Ut5.LLJZ(((C1117710fBx) aLAdapterS4S0100000_7.l0).LLJJI, 0);
        C0KVZ c0kvz = ((C1117710fBx) aLAdapterS4S0100000_7.l0).LLJJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0kvz);
        c0kvz.setAlpha(1.0f);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$17(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        View view = ((LiveEndCardWidget) aLAdapterS4S0100000_7.l0).contentView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C0IH6.LIZ(C0III.CARD_DISMISSED);
        ((LiveEndCardWidget) aLAdapterS4S0100000_7.l0).D1("normal");
    }

    public static final void onAnimationEnd$18(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        MicRoomUserInfoWidget micRoomUserInfoWidget = (MicRoomUserInfoWidget) aLAdapterS4S0100000_7.l0;
        C1096340edU c1096340edU = micRoomUserInfoWidget.LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LJJIIJ = false;
        }
        micRoomUserInfoWidget.E1(true);
    }

    public static final void onAnimationEnd$19(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((C479760Ire) aLAdapterS4S0100000_7.l0).LIZIZ();
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        LiveBroadcastFragment liveBroadcastFragment = (LiveBroadcastFragment) aLAdapterS4S0100000_7.l0;
        C1324720kZq c1324720kZqSS = liveBroadcastFragment.sS();
        if (c1324720kZqSS != null) {
            C786410Ut5.LLJJIII(c1324720kZqSS, 8);
        }
        C1324720kZq c1324720kZqSS2 = liveBroadcastFragment.sS();
        if (c1324720kZqSS2 != null) {
            c1324720kZqSS2.setImageBitmap(null);
        }
    }

    public static final void onAnimationEnd$20(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        InterfaceC519430KYr interfaceC519430KYr = ((C519420KYq) aLAdapterS4S0100000_7.l0).LLJLLL;
        if (interfaceC519430KYr != null) {
            interfaceC519430KYr.LIZIZ();
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C521020Kc0 c521020Kc0 = ((C521210KcJ) aLAdapterS4S0100000_7.l0).LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C521210KcJ c521210KcJ = (C521210KcJ) aLAdapterS4S0100000_7.l0;
        c521210KcJ.LJJLI = 0;
        c521210KcJ.LJJL = 255;
        String str = c521210KcJ.LJJLIIIIJ;
        if (str != null) {
            c521210KcJ.LJJJLZIJ = str;
        }
        c521210KcJ.LJJLIIIIJ = null;
        C521020Kc0 c521020Kc0 = c521210KcJ.LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$23(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C521210KcJ c521210KcJ = (C521210KcJ) aLAdapterS4S0100000_7.l0;
        c521210KcJ.LJJLI = 0;
        c521210KcJ.LJJL = 255;
        String str = c521210KcJ.LJJLIIIIJ;
        if (str != null) {
            c521210KcJ.LJJJLZIJ = str;
        }
        c521210KcJ.LJJLIIIIJ = null;
        C521020Kc0 c521020Kc0 = c521210KcJ.LJJLIIIJ;
        if (c521020Kc0 != null) {
            c521020Kc0.LIZ();
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$24(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = ((DrawGuessStatusWidget) aLAdapterS4S0100000_7.l0).LLIZLLLIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.start();
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        Iterator<InterfaceC482890Iwh> it2 = ((C0J70) aLAdapterS4S0100000_7.l0).LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
        ((C0J70) aLAdapterS4S0100000_7.l0).LJFF(true);
        ((C0J70) aLAdapterS4S0100000_7.l0).LIZJ(C274990Aq9.LIZ());
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        View view = ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_7.l0).LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_7.l0).LLJIJIL = false;
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((DrawerFeedLiveFragmentV2) aLAdapterS4S0100000_7.l0).LLJIJIL = false;
    }

    public static final void onAnimationEnd$5(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        View view = ((BaseDrawerFeedLiveFragment) aLAdapterS4S0100000_7.l0).LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ((BaseDrawerFeedLiveFragment) aLAdapterS4S0100000_7.l0).LLJJIJIL = false;
    }

    public static final void onAnimationEnd$6(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((BaseDrawerFeedLiveFragment) aLAdapterS4S0100000_7.l0).LLJJIJIL = false;
    }

    public static final void onAnimationEnd$7(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C1143920fsE c1143920fsE = ((DrawGuessCanvasWidget) aLAdapterS4S0100000_7.l0).LLJ;
        if (c1143920fsE != null) {
            c1143920fsE.LJFF();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super/*com.bytedance.ies.sdk.widgets.LiveWidget*/.hide();
    }

    public static final void onAnimationEnd$9(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        long jLongValue;
        Long l;
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_7.l0).z1(true);
        Handler handlerC1 = ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_7.l0).C1();
        FollowCard followCard = ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_7.l0).LLJJ;
        if (followCard != null && (l = followCard.duration) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        C786410Ut5.LJLJJI(2, jLongValue, handlerC1);
    }

    public static final void onAnimationStart$0(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        for (View view : (View[]) aLAdapterS4S0100000_7.l0) {
            C500260Jjc.LLFFF(view);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        View view = ((DrawGuessStatusWidget) aLAdapterS4S0100000_7.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        super/*com.bytedance.ies.sdk.widgets.LiveWidget*/.show();
    }

    public static final void onAnimationStart$10(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C1096340edU c1096340edU = ((MicRoomUserInfoWidget) aLAdapterS4S0100000_7.l0).LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LJJIIJ = true;
            ImageView imageView = c1096340edU.LJJIIJZLJL;
            if (imageView != null) {
                C12ES.LJIILL(8, imageView);
            }
        }
        ((MicRoomUserInfoWidget) aLAdapterS4S0100000_7.l0).E1(false);
    }

    public static final void onAnimationStart$11(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        InterfaceC519430KYr interfaceC519430KYr = ((C519420KYq) aLAdapterS4S0100000_7.l0).LLJLLL;
        if (interfaceC519430KYr != null) {
            interfaceC519430KYr.LIZ();
        }
    }

    public static final void onAnimationStart$12(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        View view = ((DrawGuessStatusWidget) aLAdapterS4S0100000_7.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        ((DrawGuessStatusWidget) aLAdapterS4S0100000_7.l0).show();
        DrawGuessStatusWidget drawGuessStatusWidget = (DrawGuessStatusWidget) aLAdapterS4S0100000_7.l0;
        drawGuessStatusWidget.LLJI = true;
        DrawGuessStatusWidget.M1(drawGuessStatusWidget);
    }

    public static final void onAnimationStart$2(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        ((ProgrammedLiveFollowCardWidget) aLAdapterS4S0100000_7.l0).show();
    }

    public static final void onAnimationStart$3(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) ((HeaderCell) aLAdapterS4S0100000_7.l0).LLILLL);
        c19mb.LJI(R.id.user_name_group, 7);
        c19mb.LJIIIZ(R.id.p97, 7, R.id.hjx, 6, (int) C497740JfY.LIZIZ(16.0f));
        c19mb.LIZIZ((ConstraintLayout) ((HeaderCell) aLAdapterS4S0100000_7.l0).LLILLL);
        LiveIconView liveIconView = ((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJ;
        if (liveIconView != null) {
            ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
            layoutParams.width = (int) C497740JfY.LIZIZ(14.0f);
            layoutParams.height = (int) C497740JfY.LIZIZ(14.0f);
            C786410Ut5.w6(liveIconView, layoutParams);
        }
        C16F5 c16f5 = ((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJI;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, 0.0f);
        }
        C500260Jjc.LLFFF(((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJI);
        final HeaderCell headerCell = (HeaderCell) aLAdapterS4S0100000_7.l0;
        C498170JgF c498170JgF = headerCell.LLJILLL;
        if (c498170JgF != null) {
            C519420KYq c519420KYq = new C519420KYq();
            c519420KYq.LLJLLL = new InterfaceC519430KYr() { // from class: X.0KYo
                @Override // X.InterfaceC519430KYr
                public final void LIZ() {
                    C0GU1 c0gu1 = headerCell.LLIZLLLIL;
                    if (c0gu1 != null) {
                        c0gu1.setDrawMask(true);
                    }
                }

                @Override // X.InterfaceC519430KYr
                public final void LIZIZ() {
                    C0GU1 c0gu1 = headerCell.LLIZLLLIL;
                    if (c0gu1 != null) {
                        c0gu1.setDrawMask(true);
                    }
                }
            };
            C19748612Om.LIZ(c498170JgF, c519420KYq);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) ((HeaderCell) aLAdapterS4S0100000_7.l0).LLILLL);
        c19mb.LJI(R.id.user_name_group, 7);
        c19mb.LJIIIZ(R.id.p97, 7, R.id.a2s, 6, (int) C497740JfY.LIZIZ(16.0f));
        c19mb.LIZIZ((ConstraintLayout) ((HeaderCell) aLAdapterS4S0100000_7.l0).LLILLL);
        LiveIconView liveIconView = ((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJ;
        if (liveIconView != null) {
            ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
            layoutParams.width = (int) C497740JfY.LIZIZ(16.0f);
            layoutParams.height = (int) C497740JfY.LIZIZ(16.0f);
            C786410Ut5.w6(liveIconView, layoutParams);
        }
        C16F5 c16f5 = ((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJI;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, 0.0f);
        }
        C500260Jjc.LJIILIIL(((HeaderCell) aLAdapterS4S0100000_7.l0).LLJJI);
        final HeaderCell headerCell = (HeaderCell) aLAdapterS4S0100000_7.l0;
        C498170JgF c498170JgF = headerCell.LLJILLL;
        if (c498170JgF != null) {
            C519420KYq c519420KYq = new C519420KYq();
            c519420KYq.LLJLLL = new InterfaceC519430KYr() { // from class: X.0KYp
                @Override // X.InterfaceC519430KYr
                public final void LIZ() {
                    C0GU1 c0gu1 = headerCell.LLIZLLLIL;
                    if (c0gu1 != null) {
                        c0gu1.setDrawMask(true);
                    }
                }

                @Override // X.InterfaceC519430KYr
                public final void LIZIZ() {
                    C0GU1 c0gu1 = headerCell.LLIZLLLIL;
                    if (c0gu1 != null) {
                        c0gu1.setDrawMask(false);
                    }
                }
            };
            C19748612Om.LIZ(c498170JgF, c519420KYq);
        }
    }

    public static final void onAnimationStart$5(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        C500260Jjc.LLFFF(((AbstractC498420Jge) aLAdapterS4S0100000_7.l0).LJJI());
        ImageView imageViewLJJI = ((AbstractC498420Jge) aLAdapterS4S0100000_7.l0).LJJI();
        if (imageViewLJJI != null) {
            C786410Ut5.V4(imageViewLJJI, 1.0f);
        }
    }

    public static final void onAnimationStart$6(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        C500260Jjc.LJIILLIIL(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJJ);
        C500260Jjc.LJIILLIIL(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJILLL);
    }

    public static final void onAnimationStart$7(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        C500260Jjc.LJIILLIIL(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJILLL);
        C500260Jjc.LJIILLIIL(((FrameExplanationCell) aLAdapterS4S0100000_7.l0).LLJJ);
    }

    public static final void onAnimationStart$8(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        C786410Ut5.fd(((LiveSurveyWidgetV2) aLAdapterS4S0100000_7.l0).T1(), ((LiveSurveyWidgetV2) aLAdapterS4S0100000_7.l0).T1().getMeasuredHeight());
        C786410Ut5.LJZ(0, ((LiveSurveyWidgetV2) aLAdapterS4S0100000_7.l0).T1());
    }

    public static final void onAnimationStart$9(ALAdapterS4S0100000_7 aLAdapterS4S0100000_7, Animator animator) {
        super.onAnimationStart(animator);
        View view = ((LiveEndCardWidget) aLAdapterS4S0100000_7.l0).LLJJJJLIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }
}
