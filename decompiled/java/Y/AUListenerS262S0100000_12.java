package Y;

import X.C098200Yq;
import X.C09RB;
import X.C09RD;
import X.C0U3I;
import X.C0U7H;
import X.C0UHS;
import X.C1126110fPV;
import X.C1146260fw0;
import X.C1196530hF5;
import X.C12OM;
import X.C1324720kZq;
import X.C16F5;
import X.C189200o6;
import X.C1907530zjr;
import X.C19ME;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C746290TPf;
import X.C746320TPi;
import X.C752190Tez;
import X.C766310U4f;
import X.C774840UaQ;
import X.C775350UbF;
import X.C778020UfY;
import X.C778030UfZ;
import X.C778590UgT;
import X.C779160UhO;
import X.C779330Uhf;
import X.C779520Uhy;
import X.C781960Ulu;
import X.C786410Ut5;
import X.C950660aqW;
import X.C998110c53;
import X.InterfaceC778060Ufc;
import X.RunnableC776140UcW;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget;
import com.bytedance.android.livesdk.markviewer.AddMarkedViewerFragmentSheet;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideButtonWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS262S0100000_12 implements ValueAnimator.AnimatorUpdateListener {
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
            case 66:
                onAnimationUpdate$66(this, valueAnimator);
                break;
            case 67:
                onAnimationUpdate$67(this, valueAnimator);
                break;
            case 68:
                onAnimationUpdate$68(this, valueAnimator);
                break;
            case 69:
                onAnimationUpdate$69(this, valueAnimator);
                break;
            case 70:
                onAnimationUpdate$70(this, valueAnimator);
                break;
            case 71:
                onAnimationUpdate$71(this, valueAnimator);
                break;
        }
    }

    public AUListenerS262S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            View view = ((LiveMarketingWidget) aUListenerS262S0100000_12.l0).getView();
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
        ((C778030UfZ) aUListenerS262S0100000_12.l0).LIZ.LJIILIIL(iIntValue, iIntValue2);
        InterfaceC778060Ufc interfaceC778060Ufc = ((C778030UfZ) aUListenerS262S0100000_12.l0).LIZIZ.LJIIL;
        if (interfaceC778060Ufc != null) {
            interfaceC778060Ufc.LJFF(iIntValue, iIntValue2);
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate2To1Member");
        sbLIZ.append(", mCoHostUsersRecyclerView animator height == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$11(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateFrom0WithHeader");
        sbLIZ.append(", animator height == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$12(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animatefrom0WithoutHeader");
        sbLIZ.append(", mCoHostUsersRecyclerView animator alpha == ");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(", mCoHostUsersRecyclerView.childCount = ");
        sbLIZ.append(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS().getChildCount());
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        for (View view : new C09RD(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("animatefrom0WithoutHeader");
            sbLIZ2.append(", children it2 = ");
            sbLIZ2.append(view);
            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animatefrom0WithoutHeader");
        sbLIZ.append(", height == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$14(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animatefrom0WithoutHeader");
        sbLIZ.append(", margin == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        int i = (int) fFloatValue;
        C500260Jjc.LJLJL(i, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
        C500260Jjc.LJJLJ(i, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$15(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateFrom1Member");
        sbLIZ.append(", animator height == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$16(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        View view;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateFrom1Member");
        sbLIZ.append(", childView animator alpha == ");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(", mCoHostUsersRecyclerView.childCount = ");
        sbLIZ.append(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS().getChildCount());
        sbLIZ.append(", ");
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0;
        if (multiCoHostBeInvitedFragment.LLJJJJJIL && multiCoHostBeInvitedFragment.cS().getChildCount() >= 4) {
            View view2 = (View) C09RB.LJIJ(new C09RD(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS()));
            if (view2 != null) {
                C786410Ut5.T4(view2, fFloatValue);
                return;
            }
            return;
        }
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0;
        if (multiCoHostBeInvitedFragment2.LLJJJJJIL || multiCoHostBeInvitedFragment2.cS().getChildCount() < 3 || (view = (View) C09RB.LJIJ(new C09RD(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS()))) == null) {
            return;
        }
        C786410Ut5.T4(view, fFloatValue);
    }

    public static final void onAnimationUpdate$17(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C950660aqW c950660aqW = (C950660aqW) aUListenerS262S0100000_12.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950660aqW);
        c950660aqW.setTranslationY(fFloatValue);
    }

    public static final void onAnimationUpdate$18(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String strLJIJI = C497740JfY.LJIJI(2131854897);
        C16F5 c16f5 = ((LiveLocationScopeSettingFragment) aUListenerS262S0100000_12.l0).LLJJ;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(u.LJJ(iIntValue, e3.d));
            c16f5.setText(new SpannableString(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String strLJIJI = C497740JfY.LJIJI(2131854897);
        C16F5 c16f5 = ((LiveLocationScopeSettingSheet) aUListenerS262S0100000_12.l0).LLLIIL;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(u.LJJ(iIntValue, e3.d));
            c16f5.setText(new SpannableString(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C778030UfZ) aUListenerS262S0100000_12.l0).LIZ.LJIILJJIL(iIntValue);
        C778030UfZ c778030UfZ = (C778030UfZ) aUListenerS262S0100000_12.l0;
        InterfaceC778060Ufc interfaceC778060Ufc = c778030UfZ.LIZIZ.LJIIL;
        if (interfaceC778060Ufc != null) {
            interfaceC778060Ufc.LJFF(iIntValue, ((WindowManager.LayoutParams) c778030UfZ.LIZ.LIZJ).y);
        }
    }

    public static final void onAnimationUpdate$20(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((VideoBroadcastInteractionFragment) aUListenerS262S0100000_12.l0).oS(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int height;
        float fLIZIZ;
        C752190Tez c752190Tez = (C752190Tez) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ConstraintLayout contentView = c752190Tez.getContentView();
            if (contentView != null) {
                C786410Ut5.Ub(contentView, fFloatValue);
            }
            ConstraintLayout contentView2 = c752190Tez.getContentView();
            if (contentView2 != null) {
                C786410Ut5.uc(contentView2, fFloatValue);
            }
            ConstraintLayout contentView3 = c752190Tez.getContentView();
            float f = 0.0f;
            if (contentView3 != null) {
                if (c752190Tez.LLIZLLLIL) {
                    fLIZIZ = 0.0f;
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(215);
                }
                contentView3.setPivotX(fLIZIZ);
            }
            ConstraintLayout contentView4 = c752190Tez.getContentView();
            if (contentView4 != null) {
                if (!c752190Tez.LLJ) {
                    ConstraintLayout contentView5 = c752190Tez.getContentView();
                    if (contentView5 != null) {
                        height = contentView5.getMeasuredHeight();
                    } else {
                        height = c752190Tez.getHeight();
                    }
                    f = height;
                }
                contentView4.setPivotY(f);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        try {
            ConstraintLayout contentView = ((C752190Tez) aUListenerS262S0100000_12.l0).getContentView();
            if (contentView != null) {
                C786410Ut5.c5(contentView, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onAnimationUpdate$23(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fLIZIZ;
        C779520Uhy c779520Uhy = (C779520Uhy) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ConstraintLayout constraintLayout = c779520Uhy.LLIZLLLIL;
            if (constraintLayout != null) {
                if (!c779520Uhy.LLJJJIL) {
                    fFloatValue = 1.8f - fFloatValue;
                }
                C786410Ut5.Ub(constraintLayout, fFloatValue);
            }
            ConstraintLayout constraintLayout2 = c779520Uhy.LLIZLLLIL;
            if (constraintLayout2 != null) {
                if (!C497740JfY.LJJ()) {
                    fLIZIZ = 0.0f;
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(140);
                }
                constraintLayout2.setPivotX(fLIZIZ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onAnimationUpdate$24(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C779520Uhy c779520Uhy = (C779520Uhy) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ConstraintLayout constraintLayout = c779520Uhy.LLIZLLLIL;
            if (constraintLayout != null) {
                if (!c779520Uhy.LLJJJIL) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                C786410Ut5.c5(constraintLayout, fFloatValue);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onAnimationUpdate$25(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C779520Uhy c779520Uhy = (C779520Uhy) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C786410Ut5.Ub(c779520Uhy.LLIZLLLIL, fFloatValue);
            C786410Ut5.uc(c779520Uhy.LLIZLLLIL, fFloatValue);
            c779520Uhy.LLIZLLLIL.setPivotX(c779520Uhy.LLIZ.getWidth() / 2);
            c779520Uhy.LLIZLLLIL.setPivotY(0.0f);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationUpdate$26(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C786410Ut5.ic((TuxTextView) ((C259800zU) aUListenerS262S0100000_12.l0).element, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.Dc((TuxTextView) ((C259800zU) aUListenerS262S0100000_12.l0).element, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$27(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        IScreenComponentAbility iScreenComponentAbility = ((DetailFragmentPanel) aUListenerS262S0100000_12.l0).LLJJJ;
        if (iScreenComponentAbility != null) {
            iScreenComponentAbility.F52(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$28(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C500260Jjc.LJJZ(((Integer) valueAnimator.getAnimatedValue()).intValue(), (View) aUListenerS262S0100000_12.l0);
    }

    public static final void onAnimationUpdate$29(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C1907530zjr c1907530zjr = (C1907530zjr) aUListenerS262S0100000_12.l0;
        ViewGroup.LayoutParams layoutParams = c1907530zjr.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1907530zjr);
        c1907530zjr.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$3(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C500260Jjc.LJJLJ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((AddMarkedViewerFragmentSheet) aUListenerS262S0100000_12.l0).getView());
    }

    public static final void onAnimationUpdate$30(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        double d;
        try {
            int i = CastIntegerProtector.parseInt(valueAnimator.getAnimatedValue().toString());
            float f = i % LSPassThroughRecordSizeConfig.DEFAULT;
            if (i > 5000) {
                d = 1 - (f / 500);
                if (i == 5500) {
                    ((C766310U4f) aUListenerS262S0100000_12.l0).LIZ();
                }
            } else {
                d = f < 300.0f ? (((double) (f / DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)) * 0.7d) + 0.3d : ((double) 1) - (((double) ((f - DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) / OppoPermissionPopupMaskDelayExp.DEFAULT)) * 0.7d);
            }
            View view = ((C766310U4f) aUListenerS262S0100000_12.l0).LIZLLL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.T4(view, (float) d);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    public static final void onAnimationUpdate$31(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Float f2;
        View view = ((C774840UaQ) aUListenerS262S0100000_12.l0).LLILZ;
        float fFloatValue2 = 1.0f;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.Ob(view, fFloatValue);
        }
        View view2 = ((C774840UaQ) aUListenerS262S0100000_12.l0).LLILZ;
        if (view2 != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if ((animatedValue2 instanceof Float) && (f = (Float) animatedValue2) != null) {
                fFloatValue2 = f.floatValue();
            }
            C786410Ut5.pc(view2, fFloatValue2);
        }
    }

    public static final void onAnimationUpdate$32(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C1126110fPV) aUListenerS262S0100000_12.l0).LLILLJJLI.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        C786410Ut5.W5(((C1126110fPV) aUListenerS262S0100000_12.l0).LLILLJJLI, layoutParams);
    }

    public static final void onAnimationUpdate$33(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LinearLayout linearLayout = (LinearLayout) ((C1196530hF5) aUListenerS262S0100000_12.l0).LLILZIL.getValue();
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$34(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        View view = ((TryModeBroadcastInteractionFragment) aUListenerS262S0100000_12.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$35(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS262S0100000_12.l0).alpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$36(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS262S0100000_12.l0).alpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$37(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        if (Intrinsics.LJFF(valueAnimator.getAnimatedValue(), Float.valueOf(0.0f))) {
            C500260Jjc.LJIILIIL((ViewGroup) aUListenerS262S0100000_12.l0);
        }
    }

    public static final void onAnimationUpdate$38(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        if (Intrinsics.LJFF(valueAnimator.getAnimatedValue(), Float.valueOf(0.0f))) {
            C500260Jjc.LJIILIIL(((C0UHS) aUListenerS262S0100000_12.l0).LIZ);
        }
    }

    public static final void onAnimationUpdate$39(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float width = ((View) ((LivePreviewFollowGuideButtonWidget) aUListenerS262S0100000_12.l0).N1().getParent()).getWidth() / 2;
        ((LivePreviewFollowGuideButtonWidget) aUListenerS262S0100000_12.l0).N1().getLayoutParams().width = (int) (width + (fFloatValue * width));
        ((LivePreviewFollowGuideButtonWidget) aUListenerS262S0100000_12.l0).N1().requestLayout();
    }

    public static final void onAnimationUpdate$4(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C1324720kZq coverView = ((C0U3I) aUListenerS262S0100000_12.l0).getCoverView();
        if (coverView != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(coverView);
            coverView.setRotation(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$40(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C500260Jjc.LJJZ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((LivePreviewFollowGuideButtonWidget) aUListenerS262S0100000_12.l0).getView());
    }

    public static final void onAnimationUpdate$41(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView = ((C746320TPi) aUListenerS262S0100000_12.l0).LLILZLL;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$42(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView = ((C746320TPi) aUListenerS262S0100000_12.l0).LLILZLL;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$43(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView = ((C746320TPi) aUListenerS262S0100000_12.l0).LLILZLL;
            if (tuxTextView != null) {
                C786410Ut5.ic(tuxTextView, fFloatValue);
                C786410Ut5.Dc(tuxTextView, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$44(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C746290TPf c746290TPf = (C746290TPf) aUListenerS262S0100000_12.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c746290TPf);
            c746290TPf.setAlpha(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$45(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C746290TPf c746290TPf = (C746290TPf) aUListenerS262S0100000_12.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c746290TPf);
            c746290TPf.setAlpha(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$46(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C998110c53) aUListenerS262S0100000_12.l0).LIZIZ.LIZIZ(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$47(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((C998110c53) aUListenerS262S0100000_12.l0).LIZIZ.LIZJ(num.intValue());
        }
    }

    public static final void onAnimationUpdate$48(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        TextView textView = ((KaraokeQueueSongListFragment) aUListenerS262S0100000_12.l0).LLJJIII;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.cd(-iIntValue, textView);
        RunnableC781530UlD runnableC781530UlDVR = ((KaraokeQueueSongListFragment) aUListenerS262S0100000_12.l0).VR();
        if (runnableC781530UlDVR != null) {
            layoutParams = runnableC781530UlDVR.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            KaraokeQueueSongListFragment karaokeQueueSongListFragment = (KaraokeQueueSongListFragment) aUListenerS262S0100000_12.l0;
            TextView textView3 = karaokeQueueSongListFragment.LLJJIII;
            if (textView3 != null) {
                textView2 = textView3;
            }
            marginLayoutParams.topMargin = textView2.getHeight() - iIntValue;
            RunnableC781530UlD runnableC781530UlDVR2 = karaokeQueueSongListFragment.VR();
            if (runnableC781530UlDVR2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(runnableC781530UlDVR2);
                runnableC781530UlDVR2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$49(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        View view = ((C12OM) aUListenerS262S0100000_12.l0).LJFF;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C950660aqW c950660aqW = (C950660aqW) aUListenerS262S0100000_12.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950660aqW);
        c950660aqW.setTranslationY(fFloatValue);
    }

    public static final void onAnimationUpdate$50(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        View view = ((C12OM) aUListenerS262S0100000_12.l0).LJFF;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$51(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue("x")).floatValue();
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue("y")).floatValue();
            int iIntValue = Float.valueOf(fFloatValue).intValue();
            int iIntValue2 = Float.valueOf(fFloatValue2).intValue();
            C781960Ulu c781960Ulu = (C781960Ulu) aUListenerS262S0100000_12.l0;
            if (!c781960Ulu.LLIZ) {
                WindowManager.LayoutParams layoutParams = c781960Ulu.LLILLL;
                layoutParams.x = iIntValue;
                c781960Ulu.LLILZIL = iIntValue;
                layoutParams.y = iIntValue2;
                c781960Ulu.LLILZLL = iIntValue2;
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(c781960Ulu, 403);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aRunnableS112S0100000_12.run();
                } else {
                    C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS112S0100000_12);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ(e.getMessage(), e);
        }
    }

    public static final void onAnimationUpdate$52(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C781960Ulu c781960Ulu = (C781960Ulu) aUListenerS262S0100000_12.l0;
        if (!c781960Ulu.LLIZ) {
            c781960Ulu.LLILLL.x = iIntValue;
            c781960Ulu.LLILZIL = iIntValue;
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(c781960Ulu, 403);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aRunnableS112S0100000_12.run();
            } else {
                C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS112S0100000_12);
            }
        }
    }

    public static final void onAnimationUpdate$53(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((Function1) aUListenerS262S0100000_12.l0).invoke(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$54(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS262S0100000_12.l0).alpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$55(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS262S0100000_12.l0).alpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$56(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Object c098200Yq;
        float f;
        C778020UfY c778020UfY = (C778020UfY) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = c778020UfY.LIZLLL;
            if (view != null) {
                C786410Ut5.Ob(view, fFloatValue);
            }
            View view2 = c778020UfY.LIZLLL;
            if (view2 != null) {
                C786410Ut5.pc(view2, fFloatValue);
            }
            View view3 = c778020UfY.LIZLLL;
            float measuredHeight = 0.0f;
            if (view3 != null) {
                if (c778020UfY.LJIIIIZZ) {
                    f = 0.0f;
                } else {
                    f = c778020UfY.LJI;
                }
                view3.setPivotX(f);
            }
            View view4 = c778020UfY.LIZLLL;
            if (view4 != null) {
                if (!c778020UfY.LJIIIZ) {
                    measuredHeight = view4.getMeasuredHeight();
                }
                view4.setPivotY(measuredHeight);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C778020UfY c778020UfY2 = (C778020UfY) aUListenerS262S0100000_12.l0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c778020UfY2.LJIILLIIL(thM5exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$57(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ((C779330Uhf) aUListenerS262S0100000_12.l0).LJIILJJIL(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$58(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = ((C779330Uhf) aUListenerS262S0100000_12.l0).LJIIL;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$59(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Object c098200Yq;
        C778590UgT c778590UgT = (C778590UgT) aUListenerS262S0100000_12.l0;
        try {
            View view = c778590UgT.LIZLLL;
            if (view != null) {
                C786410Ut5.T4(view, c778590UgT.LJJI + (c778590UgT.LJJIFFI * valueAnimator.getAnimatedFraction()));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C778590UgT c778590UgT2 = (C778590UgT) aUListenerS262S0100000_12.l0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c778590UgT2.LJIILLIIL(thM5exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate0To1MemberWithHeader");
        sbLIZ.append(", height = ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$60(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Object c098200Yq;
        float f;
        C778590UgT c778590UgT = (C778590UgT) aUListenerS262S0100000_12.l0;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = c778590UgT.LIZLLL;
            if (view != null) {
                C786410Ut5.Ob(view, fFloatValue);
            }
            View view2 = c778590UgT.LIZLLL;
            if (view2 != null) {
                C786410Ut5.pc(view2, fFloatValue);
            }
            View view3 = c778590UgT.LIZLLL;
            float measuredHeight = 0.0f;
            if (view3 != null) {
                if (c778590UgT.LJIIL) {
                    f = 0.0f;
                } else {
                    f = c778590UgT.LJI;
                }
                view3.setPivotX(f);
            }
            View view4 = c778590UgT.LIZLLL;
            if (view4 != null) {
                if (!c778590UgT.LJIILIIL) {
                    measuredHeight = view4.getMeasuredHeight();
                }
                view4.setPivotY(measuredHeight);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C778590UgT c778590UgT2 = (C778590UgT) aUListenerS262S0100000_12.l0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c778590UgT2.LJIILLIIL(thM5exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$61(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C779160UhO c779160UhO = ((C778030UfZ) aUListenerS262S0100000_12.l0).LIZ;
        if (c779160UhO != null) {
            c779160UhO.LJIILJJIL(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$62(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Object c098200Yq;
        C778020UfY c778020UfY = (C778020UfY) aUListenerS262S0100000_12.l0;
        try {
            View view = c778020UfY.LIZLLL;
            if (view != null) {
                C786410Ut5.T4(view, c778020UfY.LJIIZILJ + (c778020UfY.LJIJ * valueAnimator.getAnimatedFraction()));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C778020UfY c778020UfY2 = (C778020UfY) aUListenerS262S0100000_12.l0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c778020UfY2.LJIILLIIL(thM5exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$63(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Integer num;
        float fMin;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C0U7H c0u7h = (C0U7H) aUListenerS262S0100000_12.l0;
            num.intValue();
            if (num.intValue() <= 3000.0f) {
                fMin = (Math.min(num.intValue(), LivePreCreateNextRoomPlayer.ENABLE) / 3000.0f) * 0.6f;
            } else if (num.intValue() <= 5000.0f) {
                fMin = ((Math.min(num.intValue() - LivePreCreateNextRoomPlayer.ENABLE, 2000) / 2000.0f) * 0.2f) + 0.6f;
            } else if (num.intValue() <= 8000.0f) {
                fMin = ((Math.min(num.intValue() - 5000, LivePreCreateNextRoomPlayer.ENABLE) / 3000.0f) * 0.2f) + 0.8f;
            } else {
                fMin = 0.99f;
            }
            C16F5 c16f5 = c0u7h.LJII;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131851209, String.valueOf((int) Math.floor(fMin * 100))));
            }
        }
    }

    public static final void onAnimationUpdate$64(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((RunnableC776140UcW) aUListenerS262S0100000_12.l0).LLJILJIL.setColor(num.intValue());
        }
    }

    public static final void onAnimationUpdate$65(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            RunnableC776140UcW runnableC776140UcW = (RunnableC776140UcW) aUListenerS262S0100000_12.l0;
            int iIntValue = num.intValue();
            int i = runnableC776140UcW.LLJIJIL;
            if (i != 0) {
                if (i == 1 && !C497740JfY.LJJ()) {
                    ViewParent parent = runnableC776140UcW.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                        int iLJIIZILJ = C497740JfY.LJIIZILJ();
                        int i2 = C775350UbF.LLJJ;
                        C786410Ut5.Ed(iLJIIZILJ - Math.max(iIntValue, C775350UbF.LLJJ), viewGroup2);
                    }
                }
            } else if (C497740JfY.LJJ()) {
                ViewParent parent2 = runnableC776140UcW.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    int iLJIIZILJ2 = C497740JfY.LJIIZILJ();
                    int i3 = C775350UbF.LLJJ;
                    C786410Ut5.Gc(-(iLJIIZILJ2 - Math.max(iIntValue, C775350UbF.LLJJ)), viewGroup);
                }
            }
            runnableC776140UcW.getRecordBallLayoutFromXml().getLayoutParams().width = iIntValue;
            runnableC776140UcW.getRecordBallLayoutFromXml().requestLayout();
        }
    }

    public static final void onAnimationUpdate$66(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Float f2;
        View ivRecordRedDotFromXml = ((RunnableC776140UcW) aUListenerS262S0100000_12.l0).getIvRecordRedDotFromXml();
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        float fFloatValue2 = 1.0f;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        C786410Ut5.Ob(ivRecordRedDotFromXml, fFloatValue);
        View ivRecordRedDotFromXml2 = ((RunnableC776140UcW) aUListenerS262S0100000_12.l0).getIvRecordRedDotFromXml();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        if ((animatedValue2 instanceof Float) && (f2 = (Float) animatedValue2) != null) {
            fFloatValue2 = f2.floatValue();
        }
        C786410Ut5.pc(ivRecordRedDotFromXml2, fFloatValue2);
    }

    public static final void onAnimationUpdate$67(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        View view = ((VoiceChatBroadcastInteractionFragment) aUListenerS262S0100000_12.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$68(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        C500260Jjc.LJJLJ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((AddModeratorFragment) aUListenerS262S0100000_12.l0).LLJI);
    }

    public static final void onAnimationUpdate$69(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C786410Ut5.T4((View) aUListenerS262S0100000_12.l0, fFloatValue);
            float f2 = (fFloatValue * 0.1f) + 0.9f;
            C786410Ut5.Ob((View) aUListenerS262S0100000_12.l0, f2);
            C786410Ut5.pc((View) aUListenerS262S0100000_12.l0, f2);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zero to two, mCoHostUsersRecyclerView animator alpha == ");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(", mCoHostUsersRecyclerView.childCount = ");
        sbLIZ.append(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS().getChildCount());
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        for (View view : new C09RD(((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("zero to two, children it2 = ");
            sbLIZ2.append(view);
            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$70(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C16F5 c16f5 = ((C1146260fw0) aUListenerS262S0100000_12.l0).LLJJJJLIIL;
        if (c16f5 != null) {
            layoutParams = c16f5.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
            }
        } else {
            layoutParams = null;
        }
        C16F5 c16f52 = ((C1146260fw0) aUListenerS262S0100000_12.l0).LLJJJJLIIL;
        if (c16f52 != null) {
            C786410Ut5.y6(c16f52, layoutParams);
        }
    }

    public static final void onAnimationUpdate$71(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1146260fw0 c1146260fw0 = (C1146260fw0) aUListenerS262S0100000_12.l0;
        if (c1146260fw0.LLILLL) {
            ConstraintLayout constraintLayout = c1146260fw0.LLJJJ;
            if (constraintLayout != null) {
                C500260Jjc.LJJLJ(iIntValue, constraintLayout);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = c1146260fw0.LLJJJ;
        if (constraintLayout2 == null) {
            return;
        }
        C500260Jjc.LJLJL(iIntValue, constraintLayout2);
    }

    public static final void onAnimationUpdate$8(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate0To1MemberWithoutHeader");
        sbLIZ.append(", height == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) fFloatValue, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }

    public static final void onAnimationUpdate$9(AUListenerS262S0100000_12 aUListenerS262S0100000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mCoHostUsersRecyclerView animator margin == ");
        sbLIZ.append(fFloatValue);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        int i = (int) fFloatValue;
        C500260Jjc.LJLJL(i, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
        C500260Jjc.LJJLJ(i, ((MultiCoHostBeInvitedFragment) aUListenerS262S0100000_12.l0).cS());
    }
}
