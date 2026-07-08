package Y;

import X.AbstractC742610TBb;
import X.AbstractC960500b6O;
import X.AbstractC962030b8r;
import X.AbstractC962220b9A;
import X.C01EI;
import X.C09JN;
import X.C0TBZ;
import X.C0UVC;
import X.C11JF;
import X.C158B;
import X.C19748512Ol;
import X.C1AZW;
import X.C1C7U;
import X.C20361214lm;
import X.C20441214yg;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C257100z3;
import X.C410901il;
import X.C462701r7;
import X.C470590Icr;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C766270U4b;
import X.C915130ZvD;
import X.C915490Zvn;
import X.C915980Zwa;
import X.C916430ZxJ;
import X.C916750Zxp;
import X.C917720ZzO;
import X.C918230a0D;
import X.C918350a0P;
import X.C918650a0t;
import X.C919700a2a;
import X.C920500a3s;
import X.C920790a4L;
import X.C923130a87;
import X.C924360aA6;
import X.C924630aAX;
import X.C924790aAn;
import X.C924810aAp;
import X.C925150aBN;
import X.C925600aC6;
import X.C925640aCA;
import X.C926820aE4;
import X.C927600aFK;
import X.C930480aJy;
import X.C944240agA;
import X.C948450amx;
import X.C951190arN;
import X.C952930auB;
import X.C953600avG;
import X.C953760avW;
import X.C954060aw0;
import X.C955400ayA;
import X.C955590ayT;
import X.C958040b2Q;
import X.C960610b6Z;
import X.C962010b8p;
import X.C962650b9r;
import X.C962820bA8;
import X.C974490bSx;
import X.C974560bT4;
import X.C974990bTl;
import X.C979440baw;
import X.C981290bdv;
import X.C981300bdw;
import X.C981360be2;
import X.C981370be3;
import X.C981480beE;
import X.C981530beJ;
import X.C981540beK;
import X.C981600beQ;
import X.C981670beX;
import X.C981680beY;
import X.C981960bf0;
import X.C982020bf6;
import X.C982440bfm;
import X.C982590bg1;
import X.C982600bg2;
import X.C982680bgA;
import X.C983450bhP;
import X.EnumC918860a1E;
import X.EnumC919100a1c;
import X.EnumC919170a1j;
import X.EnumC952940auC;
import X.EnumC953380auu;
import X.EnumC958080b2U;
import X.EnumC962960bAM;
import X.EnumC973450bRH;
import X.EnumC981380be4;
import X.EnumC981560beM;
import X.InterfaceC923600a8s;
import X.InterfaceC954180awC;
import X.InterfaceC962270b9F;
import X.InterfaceC971000bNK;
import X.InterfaceC979390bar;
import android.content.Context;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplySucceedEvent;
import com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleStart;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestDistributeStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestEarFeedbackStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.KaraokeGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardCreateAndUpdateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.live.liveinteract.multilive.model.CancelViewerSingReq;
import com.bytedance.android.live.liveinteract.multilive.model.CancelViewerSingResp;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AfS109S0300000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStagePlayBaseCoordinator@bf87.requestLinkMicLeaveApi$leaveDispose$2");
        ((C982020bf6) afS109S0300000_15.l0).LJ = false;
        C982600bg2 c982600bg2LJIIJJI = C982440bfm.LJIIJJI((C470590Icr) obj);
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l1;
        boolean z = ((C982020bf6) afS109S0300000_15.l0).LJJJJJ().LJJI;
        c974560bT4.LJIILIIL();
        c974560bT4.LJIIL(Boolean.valueOf(z), "cut_short", true);
        c974560bT4.LJIJJLI("leave_linkmic_succeed");
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(c982600bg2LJIIJJI);
        }
        C1C7U.LIZIZ("TakeStagePlayBaseCoordinator@bf87.requestLinkMicLeaveApi$leaveDispose$2");
    }

    public static final void accept$1(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStagePlayBaseCoordinator@bf87.requestQuitApi$3");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS109S0300000_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l1;
        c974560bT4.LJIIJJI(th);
        c974560bT4.LJIJJLI("punish_finish_failed");
        C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, ((C982020bf6) afS109S0300000_15.l2).LIZ.context, th);
        C1C7U.LIZIZ("TakeStagePlayBaseCoordinator@bf87.requestQuitApi$3");
    }

    public static final void accept$10(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$3");
        Throwable th = (Throwable) obj;
        ((C974990bTl) afS109S0300000_15.l0).LJ = false;
        C974490bSx c974490bSx = (C974490bSx) afS109S0300000_15.l1;
        c974490bSx.LJIIJJI(th);
        c974490bSx.LJIJJLI("prepare_failed");
        C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.PREPARE_FAILED.getReason(), null, null, 14);
        C0UVC.LIZIZ(th);
        ((Function1) afS109S0300000_15.l2).invoke(th);
        C1C7U.LIZIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$3");
    }

    public static final void accept$11(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.createChannelInternal$1$onSuccess$4$1");
        C925150aBN.LJJJJI((MultiLiveAnchorPanelSettings) afS109S0300000_15.l0);
        C20441214yg.LIZIZ("OneVn_MultiGuestV3Manager", "transform anchor setting succ");
        if (((Boolean) ((Pair) afS109S0300000_15.l1).getSecond()).booleanValue()) {
            C500260Jjc.LJJLIIIJJI(10000L, AFwS203S0000000_15.get$arr$(204));
        }
        C924630aAX.LIZ.LJIJI((MultiLiveAnchorPanelSettings) afS109S0300000_15.l2, C924810aAp.LJ().LJJIII, "anchor_create_channel_transform");
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.createChannelInternal$1$onSuccess$4$1");
    }

    public static final void accept$12(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("MultiGuestV3Manager@4508.getGuestSetting$1");
        GetGuestSettingResponse getGuestSettingResponse = (GetGuestSettingResponse) obj;
        GetGuestSettingResponse.ResponseData responseData = getGuestSettingResponse.data;
        if (responseData != null) {
            C927600aFK c927600aFK = (C927600aFK) afS109S0300000_15.l1;
            DataChannel dataChannel = (DataChannel) afS109S0300000_15.l2;
            c927600aFK.LJIILIIL().LJIJ.postValue(Integer.valueOf(responseData.guestCameraMirrorStatus));
            if (dataChannel != null) {
                dataChannel.zW(MultiGuestEarFeedbackStatus.class, Integer.valueOf(responseData.guestHearYourVoiceStatus));
                dataChannel.zW(MultiGuestDistributeStatus.class, Integer.valueOf(responseData.flowDistribute));
            }
        }
        Function2 function2 = (Function2) afS109S0300000_15.l0;
        if (function2 != null) {
            Boolean bool = Boolean.TRUE;
            GetGuestSettingResponse.ResponseData responseData2 = getGuestSettingResponse.data;
            if (responseData2 != null) {
                numValueOf = Integer.valueOf(responseData2.guestCameraMirrorStatus);
            } else {
                numValueOf = null;
            }
            function2.invoke(bool, numValueOf);
        }
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.getGuestSetting$1");
    }

    public static final void accept$13(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CatchBeansInviteeCoordinator@e746.requestRejectApi$2");
        C982590bg1 c982590bg1LJIIL = C982440bfm.LJIIL((C470590Icr) obj);
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        EnumC962960bAM enumC962960bAMLJJJJI = ((C981680beY) afS109S0300000_15.l1).LJJJJI();
        C981600beQ c981600beQ = EnumC981560beM.Companion;
        EnumC981560beM enumC981560beM = (EnumC981560beM) afS109S0300000_15.l2;
        c981600beQ.getClass();
        c974560bT4.LJJJJIZL(c982590bg1LJIIL, enumC962960bAMLJJJJI, C981600beQ.LIZ(enumC981560beM));
        C981680beY c981680beY = (C981680beY) afS109S0300000_15.l1;
        EnumC981560beM enumC981560beM2 = (EnumC981560beM) afS109S0300000_15.l2;
        if (!c981680beY.LJI) {
            c981680beY.LJFF.LJIIL.setValue(Boolean.FALSE);
            c981680beY.LJIIL.invoke(enumC981560beM2);
        }
        C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.requestRejectApi$2");
    }

    public static final void accept$14(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CatchBeansInviteeCoordinator@e746.requestRejectApi$3");
        Throwable th = (Throwable) obj;
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        EnumC962960bAM enumC962960bAMLJJJJI = ((C981680beY) afS109S0300000_15.l1).LJJJJI();
        C981600beQ c981600beQ = EnumC981560beM.Companion;
        EnumC981560beM enumC981560beM = (EnumC981560beM) afS109S0300000_15.l2;
        c981600beQ.getClass();
        c974560bT4.LJJJIL(th, enumC962960bAMLJJJJI, C981600beQ.LIZ(enumC981560beM));
        C0UVC.LIZIZ(th);
        C981680beY c981680beY = (C981680beY) afS109S0300000_15.l1;
        EnumC981560beM enumC981560beM2 = (EnumC981560beM) afS109S0300000_15.l2;
        if (!c981680beY.LJI) {
            c981680beY.LJFF.LJIIL.setValue(Boolean.FALSE);
            C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, c981680beY.LIZ.context, th);
            c981680beY.LJIILIIL.invoke(enumC981560beM2);
        }
        C1C7U.LIZIZ("CatchBeansInviteeCoordinator@e746.requestRejectApi$3");
    }

    public static final void accept$15(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiHostEoyRound2ViewBinder@8ee2.startCountDown$2");
        ((Number) obj).longValue();
        ((C962650b9r) afS109S0300000_15.l0).LJIIIZ((C962820bA8) afS109S0300000_15.l1, (C962010b8p) afS109S0300000_15.l2);
        C1C7U.LIZIZ("MultiHostEoyRound2ViewBinder@8ee2.startCountDown$2");
    }

    public static final void accept$16(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiHostEoyRound2ViewBinder@8ee2.startCountDown$3");
        C11JF c11jf = ((C962650b9r) afS109S0300000_15.l0).LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((C962650b9r) afS109S0300000_15.l0).LJIIIZ((C962820bA8) afS109S0300000_15.l1, (C962010b8p) afS109S0300000_15.l2);
        C1C7U.LIZIZ("MultiHostEoyRound2ViewBinder@8ee2.startCountDown$3");
    }

    public static final void accept$17(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CatchBeansInviterCoordinator@5d96.requestWithdrawApi$2");
        C982590bg1 c982590bg1LJIIL = C982440bfm.LJIIL((C470590Icr) obj);
        ((C974560bT4) afS109S0300000_15.l0).LJJIIJZLJL(((C981670beX) afS109S0300000_15.l1).LJJJJI(), c982590bg1LJIIL.LIZ);
        C981670beX c981670beX = (C981670beX) afS109S0300000_15.l1;
        EnumC981380be4 enumC981380be4 = (EnumC981380be4) afS109S0300000_15.l2;
        if (!c981670beX.LJFF) {
            DataChannel dataChannel = c981670beX.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
            }
            c981670beX.LJ.LJIIJJI.setValue(Boolean.FALSE);
            C0TBZ.LIZIZ();
            c981670beX.LJIIJ.invoke(enumC981380be4);
        }
        C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.requestWithdrawApi$2");
    }

    public static final void accept$18(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        FollowPair followPair;
        C1C7U.LIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.observeFollowStatusChange$1");
        C257100z3 c257100z3 = (C257100z3) obj;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null && followPair.LIZ == ((C955590ayT) afS109S0300000_15.l0).LJ.getOwnerUserId()) {
            AbstractC962220b9A abstractC962220b9A = (AbstractC962220b9A) afS109S0300000_15.l1;
            long j = c257100z3.LIZ.followStatus;
            InterfaceC962270b9F interfaceC962270b9F = (InterfaceC962270b9F) afS109S0300000_15.l2;
            abstractC962220b9A.getClass();
            AbstractC962220b9A.LJFF(j, interfaceC962270b9F);
        }
        C1C7U.LIZIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.observeFollowStatusChange$1");
    }

    public static final void accept$19(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePush$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error : ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("LiveInvitePush", C2188811AlT.LIZIZ(sbLIZ));
        ((C918650a0t) afS109S0300000_15.l0).LIZLLL((Function1) afS109S0300000_15.l1, new C918230a0D(((C918350a0P) afS109S0300000_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, false, null, th.getMessage(), th, null, 72));
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePush$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSettlementStart$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C983450bhP c983450bhP = new C983450bhP();
        c983450bhP.LIZ = baseResponse.LIZIZ;
        T t = baseResponse.data;
        c983450bhP.LIZIZ = t;
        c983450bhP.LIZJ = C982440bfm.LIZIZ(((CompetitionSettlementStartResponse.ResponseData) t).bizCommon);
        CompetitionSettleStart competitionSettleStart = ((CompetitionSettlementStartResponse.ResponseData) baseResponse.data).settleStart;
        if (competitionSettleStart != null) {
            CompetitionUserBase competitionUserBase = competitionSettleStart.initiator;
            if (competitionUserBase != null) {
                c983450bhP.LJ = C982440bfm.LJIJI(competitionUserBase);
            }
            EnumC962960bAM enumC962960bAM = c983450bhP.LIZJ.LIZ;
            long j = competitionSettleStart.plannedSettlementEndTime;
            c983450bhP.LJFF = new C981540beK(enumC962960bAM, 0L, 0L, 0L, 0L, j, (j - competitionSettleStart.extraTimeInterval) - C158B.LIZJ(), competitionSettleStart.extraTimeInterval, 0L, 0L, 1822);
        }
        C982680bgA c982680bgA = new C982680bgA(c983450bhP);
        c982680bgA.LIZ(c983450bhP);
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        String str = c982680bgA.LIZ;
        c974560bT4.LJIILIIL();
        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "log_id", str, true);
        c974560bT4.LJIJJLI("final_call_succeed");
        C981480beE c981480beELJJJJJ = ((C981960bf0) afS109S0300000_15.l1).LJJJJJ();
        ((C981960bf0) afS109S0300000_15.l1).LIZIZ.getStatus();
        C981530beJ.LIZIZ(c982680bgA, c981480beELJJJJJ, ((C981960bf0) afS109S0300000_15.l1).LIZLLL);
        ((C981960bf0) afS109S0300000_15.l1).LJFF();
        ((C981960bf0) afS109S0300000_15.l1).LJJJJJ().LJJIJIIJI.LJIILIIL = true;
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(c982680bgA);
        }
        C981960bf0 c981960bf0 = (C981960bf0) afS109S0300000_15.l1;
        C958040b2Q.LJIIJJI("settlement_start_api", c981960bf0.LIZLLL, c981960bf0.LJJJJJ(), EnumC958080b2U.TAKE_STAGE_FINAL_CALL);
        ((C981960bf0) afS109S0300000_15.l1).LJJJJLL(((C981960bf0) afS109S0300000_15.l1).LJJJJJ().LJIIJ.LIZIZ(), "settlementStart");
        C1C7U.LIZIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSettlementStart$2");
    }

    public static final void accept$20(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePushV2Legacy$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result: ");
        sbLIZ.append(c470590Icr.statusCode);
        C20441214yg.LIZIZ("LiveInviteGuest", C2188811AlT.LIZIZ(sbLIZ));
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((C918650a0t) afS109S0300000_15.l0).LIZLLL((Function1) afS109S0300000_15.l1, new C918230a0D(((C918350a0P) afS109S0300000_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, true, null, null, null, null, 120));
        } else {
            ((C918650a0t) afS109S0300000_15.l0).LIZLLL((Function1) afS109S0300000_15.l1, new C918230a0D(((C918350a0P) afS109S0300000_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, false, null, c470590Icr.LJ.prompts, null, null, 104));
        }
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePushV2Legacy$1");
    }

    public static final void accept$21(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePushV2Legacy$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("LiveInviteGuest", C2188811AlT.LIZIZ(sbLIZ));
        ((C918650a0t) afS109S0300000_15.l0).LIZLLL((Function1) afS109S0300000_15.l1, new C918230a0D(((C918350a0P) afS109S0300000_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, false, null, th.getMessage(), th, null, 72));
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePushV2Legacy$2");
    }

    public static final void accept$22(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("MultiGuestMultiTypeAdapter@bee1.setItemsWithCallback$2$1");
        C21341918fZ c21341918fZ = (C21341918fZ) obj;
        C951190arN c951190arN = (C951190arN) afS109S0300000_15.l0;
        c951190arN.LL = (List) afS109S0300000_15.l1;
        try {
            c21341918fZ.LIZJ(c951190arN);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("MultiGuestMultiTypeAdapter", e.getMessage());
            ((C951190arN) afS109S0300000_15.l0).notifyDataSetChanged();
        }
        ((ArrayList) ((C951190arN) afS109S0300000_15.l0).LLILLL).clear();
        List list = (List) afS109S0300000_15.l1;
        C951190arN c951190arN2 = (C951190arN) afS109S0300000_15.l0;
        for (Object obj2 : list) {
            if (obj2 != null) {
                ((ArrayList) c951190arN2.LLILLL).add(obj2);
            }
        }
        ((Function0) afS109S0300000_15.l2).invoke();
        C1C7U.LIZIZ("MultiGuestMultiTypeAdapter@bee1.setItemsWithCallback$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$23(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        String str;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        int size;
        C1C7U.LIZ("FeedGuestUserManager@3346.fetchUserListForFeed$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        C920500a3s.LIZ = str;
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            C924360aA6 c924360aA6 = (C924360aA6) afS109S0300000_15.l0;
            Function1 function1 = (Function1) afS109S0300000_15.l1;
            Function1 function12 = (Function1) afS109S0300000_15.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchUserListForFeed success size=");
            ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
            if (arrayList != null) {
                size = arrayList.size();
            } else {
                size = 0;
            }
            sbLIZ.append(size);
            C20441214yg.LJIIIZ("FeedGuestUserManager", C2188811AlT.LIZIZ(sbLIZ));
            c924360aA6.LJJJLZIJ().LJJIJIIJIL(multiLiveGuestInfoList);
            if (function1 != null) {
                function1.invoke(c924360aA6.LJJJLZIJ());
            }
            c924360aA6.LJJJJI(multiLiveGuestInfoList, "feed");
            if (function12 != null) {
                function12.invoke(c924360aA6.LJJJLZIJ());
            }
        }
        C1C7U.LIZIZ("FeedGuestUserManager@3346.fetchUserListForFeed$1");
    }

    public static final void accept$24(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("NoticeboardEditorOfficial@3b7a.onOfficialAccountSave$1$10");
        Throwable th = (Throwable) obj;
        ((C954060aw0) afS109S0300000_15.l0).LIZ((Context) afS109S0300000_15.l1, "", "", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create official template unsuccessfully :( :( :(, errorMsg: ");
        sbLIZ.append(th.getMessage());
        C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create official template unsuccessfully :( :( :(, errorMsg: ");
        sbLIZ2.append(th.getMessage());
        C20441214yg.LJ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
        C953760avW.LIZIZ.LIZ().LIZJ();
        ((InterfaceC971000bNK) afS109S0300000_15.l2).LJJIII(EnumC919100a1c.DISMISS_SAVE);
        C1C7U.LIZIZ("NoticeboardEditorOfficial@3b7a.onOfficialAccountSave$1$10");
    }

    public static final void accept$25(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStageInviteeCoordinator@a7a6.requestRejectApi$2");
        C982590bg1 c982590bg1LJIIL = C982440bfm.LJIIL((C470590Icr) obj);
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        EnumC962960bAM enumC962960bAMLJJJJI = ((C981370be3) afS109S0300000_15.l1).LJJJJI();
        C981600beQ c981600beQ = EnumC981560beM.Companion;
        EnumC981560beM enumC981560beM = (EnumC981560beM) afS109S0300000_15.l2;
        c981600beQ.getClass();
        c974560bT4.LJJJJIZL(c982590bg1LJIIL, enumC962960bAMLJJJJI, C981600beQ.LIZ(enumC981560beM));
        C981370be3 c981370be3 = (C981370be3) afS109S0300000_15.l1;
        EnumC981560beM enumC981560beM2 = (EnumC981560beM) afS109S0300000_15.l2;
        if (!c981370be3.LJI) {
            C981290bdv c981290bdv = c981370be3.LJFF;
            if (c981290bdv != null) {
                c981290bdv.LJIIL.setValue(Boolean.FALSE);
            }
            c981370be3.LJIIL.invoke(enumC981560beM2);
        }
        C1C7U.LIZIZ("TakeStageInviteeCoordinator@a7a6.requestRejectApi$2");
    }

    public static final void accept$26(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStageInviteeCoordinator@a7a6.requestRejectApi$3");
        Throwable th = (Throwable) obj;
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        EnumC962960bAM enumC962960bAMLJJJJI = ((C981370be3) afS109S0300000_15.l1).LJJJJI();
        C981600beQ c981600beQ = EnumC981560beM.Companion;
        EnumC981560beM enumC981560beM = (EnumC981560beM) afS109S0300000_15.l2;
        c981600beQ.getClass();
        c974560bT4.LJJJIL(th, enumC962960bAMLJJJJI, C981600beQ.LIZ(enumC981560beM));
        C0UVC.LIZIZ(th);
        C981370be3 c981370be3 = (C981370be3) afS109S0300000_15.l1;
        EnumC981560beM enumC981560beM2 = (EnumC981560beM) afS109S0300000_15.l2;
        if (!c981370be3.LJI) {
            C981290bdv c981290bdv = c981370be3.LJFF;
            if (c981290bdv != null) {
                c981290bdv.LJIIL.setValue(Boolean.FALSE);
            }
            C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, c981370be3.LIZ.context, th);
            c981370be3.LJIILIIL.invoke(enumC981560beM2);
        }
        C1C7U.LIZIZ("TakeStageInviteeCoordinator@a7a6.requestRejectApi$3");
    }

    public static final void accept$27(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CatchBeansPlayingCoordinatorAnchor@ec60.requestLinkMicLeaveApi$2");
        ((CatchBeansPlayingCoordinatorAnchor) afS109S0300000_15.l0).LJFF = false;
        C982600bg2 c982600bg2LJIIJJI = C982440bfm.LJIIJJI((C470590Icr) obj);
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l1;
        boolean z = ((CatchBeansPlayingCoordinatorAnchor) afS109S0300000_15.l0).LJJJJJ().LJJI;
        c974560bT4.LJIILIIL();
        c974560bT4.LJIIL(Boolean.valueOf(z), "cut_short", true);
        c974560bT4.LJIJJLI("leave_linkmic_succeed");
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(c982600bg2LJIIJJI);
        }
        C1C7U.LIZIZ("CatchBeansPlayingCoordinatorAnchor@ec60.requestLinkMicLeaveApi$2");
    }

    public static final void accept$28(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("CatchBeansPlayingCoordinatorAnchor@ec60.requestQuitApi$3");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS109S0300000_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l1;
        c974560bT4.LJIIJJI(th);
        c974560bT4.LJIJJLI("punish_finish_failed");
        C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, ((CatchBeansPlayingCoordinatorAnchor) afS109S0300000_15.l2).LIZ.context, th);
        C1C7U.LIZIZ("CatchBeansPlayingCoordinatorAnchor@ec60.requestQuitApi$3");
    }

    public static final void accept$29(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStageInviterCoordinator@dae5.requestCancelApi$dispose$2");
        C982590bg1 c982590bg1LJIIL = C982440bfm.LJIIL((C470590Icr) obj);
        ((C974560bT4) afS109S0300000_15.l0).LJJIIJZLJL(((C981360be2) afS109S0300000_15.l1).LJJJJI(), c982590bg1LJIIL.LIZ);
        C981360be2 c981360be2 = (C981360be2) afS109S0300000_15.l1;
        EnumC981380be4 enumC981380be4 = (EnumC981380be4) afS109S0300000_15.l2;
        if (!c981360be2.LJI) {
            DataChannel dataChannel = c981360be2.LIZ.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
            }
            C981300bdw c981300bdw = c981360be2.LJFF;
            if (c981300bdw != null) {
                c981300bdw.LJIIL.setValue(Boolean.FALSE);
                c981300bdw.LJIIJ.setValue(Boolean.TRUE);
            }
            if (c981360be2.LJFF != null) {
                AbstractC742610TBb.LIZIZ();
            }
            LinkDialog linkDialog = c981360be2.LJ;
            if (linkDialog != null) {
                linkDialog.dismiss();
            }
            c981360be2.LJ = null;
            c981360be2.LJIIJJI.invoke(enumC981380be4);
        }
        C1C7U.LIZIZ("TakeStageInviterCoordinator@dae5.requestCancelApi$dispose$2");
    }

    public static final void accept$3(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSettlementStart$3");
        Throwable th = (Throwable) obj;
        C974560bT4 c974560bT4 = (C974560bT4) afS109S0300000_15.l0;
        c974560bT4.LJIIJJI(th);
        c974560bT4.LJIJJLI("final_call_failed");
        Function1 function1 = (Function1) afS109S0300000_15.l1;
        if (function1 != null) {
            function1.invoke(th);
        }
        C915490Zvn.LIZ(EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, ((C981960bf0) afS109S0300000_15.l2).LIZ.context, th);
        C1C7U.LIZIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSettlementStart$3");
    }

    public static final void accept$30(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("KaraokeAnchorViewModel@ea0.openViewerApplySing$2");
        C924810aAp.LJ().LJJIII = (MultiLiveAnchorPanelSettings) afS109S0300000_15.l0;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJ((MultiLiveAnchorPanelSettings) afS109S0300000_15.l0);
        }
        Function1 function1 = (Function1) afS109S0300000_15.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C924630aAX.LIZ.LJIJI((MultiLiveAnchorPanelSettings) afS109S0300000_15.l2, C924810aAp.LJ().LJJIII, "karaoke_panel_allow");
        C1C7U.LIZIZ("KaraokeAnchorViewModel@ea0.openViewerApplySing$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.bytedance.android.livesdk.model.message.linkcore.CancelApplyResponse, com.bytedance.android.livesdk.model.message.linkcore.LinkMicUplinkBaseResp] */
    public static final void accept$31(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        long jCurrentTimeMillis;
        long jLongValue;
        Long l;
        LinkMicCommonResp linkMicCommonResp;
        C1C7U.LIZ("KaraokeGuestViewModel@53a9.cancelApplyViewerSing$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        ((KaraokeGuestViewModel) afS109S0300000_15.l0).LLIZLLLIL = false;
        if (((CancelViewerSingResp) baseResponse.data).isOnlyDelSong) {
            C917720ZzO.LIZ.getClass();
            C917720ZzO.LJII("KaraokeGuestViewModel", "only delete song", null);
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                KaraokeGuestViewModel karaokeGuestViewModel = (KaraokeGuestViewModel) afS109S0300000_15.l0;
                CancelViewerSingReq cancelViewerSingReq = (CancelViewerSingReq) afS109S0300000_15.l1;
                karaokeGuestViewModel.getClass();
                CancelApplyData.Builder builder = new CancelApplyData.Builder();
                builder.setBizCancelApplyParams(cancelViewerSingReq.multiGuestReqExtra);
                CancelApplyData cancelApplyDataBuild = builder.build();
                ((KaraokeGuestViewModel) afS109S0300000_15.l0).getClass();
                ?? cancelApplyResponse = new CancelApplyResponse();
                CancelViewerSingResp cancelViewerSingResp = (CancelViewerSingResp) baseResponse.data;
                if (cancelViewerSingResp != null) {
                    linkMicCommonResp = cancelViewerSingResp.commonResp;
                } else {
                    linkMicCommonResp = null;
                }
                cancelApplyResponse.commonResp = linkMicCommonResp;
                C926820aE4 c926820aE4 = new C926820aE4();
                c926820aE4.data = cancelApplyResponse;
                interfaceC954180awCLLJLL.LLJILJIL(2, cancelApplyDataBuild, c926820aE4, null);
            }
            C944240agA.LJFF("LinkIn_leave_Success", "position:cancel");
            C948450amx c948450amx = C948450amx.LIZIZ;
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                multiGuestDataHolder.LJJJLL = -1;
            }
            C924790aAn.LIZLLL().LJII(0);
            C925150aBN.LJIIJ(((KaraokeGuestViewModel) afS109S0300000_15.l0).LL);
            DataChannel dataChannel = ((KaraokeGuestViewModel) afS109S0300000_15.l0).LL;
            if (dataChannel != null) {
                dataChannel.FQ2(LinkInRoomAudienceCancelApplySucceedEvent.class);
            }
            C924810aAp.LJ().LJJIJIL = true;
            KaraokeGuestViewModel karaokeGuestViewModel2 = (KaraokeGuestViewModel) afS109S0300000_15.l0;
            karaokeGuestViewModel2.getClass();
            C925600aC6.LIZ = "karaoke_request";
            MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            C920790a4L.LIZ("KalaPageAlert", "disconnectBtn");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (multiGuestDataHolder2 != null) {
                jCurrentTimeMillis = multiGuestDataHolder2.LJI;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
            DataChannel dataChannel2 = karaokeGuestViewModel2.LL;
            if (dataChannel2 != null && (l = (Long) dataChannel2.gg0(MultiGuestGuestSelfSendGiftData.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C925640aCA.LJIIZILJ("click", j, 0L, "apply", null, null, 0, 0, C923130a87.LIZIZ(multiGuestDataHolder2, jLongValue), null, null, 1780);
        }
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("KaraokeGuestViewModel@53a9.cancelApplyViewerSing$1");
    }

    public static final void accept$32(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("KaraokeGuestViewModel@53a9.cancelApplyViewerSing$2");
        Throwable th = (Throwable) obj;
        ((KaraokeGuestViewModel) afS109S0300000_15.l0).LLIZLLLIL = false;
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJII("KaraokeGuestViewModel", "cancelApplyViewerSing failed,", th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:cancel; throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_leave_Failed", C2188811AlT.LIZIZ(sbLIZ));
        C501540Jlg.LIZLLL(((KaraokeGuestWidget) afS109S0300000_15.l1).context, th, 2131840684);
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("KaraokeGuestViewModel@53a9.cancelApplyViewerSing$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        Long lValueOf;
        long j;
        ReserveResponse.ResponseData responseData;
        ReserveResponse.ResponseData responseData2;
        C1C7U.LIZ("BaseMultiCoHostInviteListPresenter@7cd8.reserve$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Room room = (Room) afS109S0300000_15.l0;
        C955590ayT c955590ayT = (C955590ayT) afS109S0300000_15.l1;
        if (baseResponse != null && (responseData2 = (ReserveResponse.ResponseData) baseResponse.data) != null) {
            lValueOf = Long.valueOf(responseData2.reservationId);
        } else {
            lValueOf = null;
        }
        C955400ayA.LJLJLLL(room, c955590ayT, String.valueOf(lValueOf));
        long ownerUserId = ((C955590ayT) afS109S0300000_15.l1).LJ.getOwnerUserId();
        if (baseResponse != null && (responseData = (ReserveResponse.ResponseData) baseResponse.data) != null) {
            j = responseData.createdTimestamp;
        } else {
            j = 0;
        }
        C916430ZxJ.LIZ(ownerUserId, j);
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) ((AbstractC960500b6O) afS109S0300000_15.l2).LL;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.ht();
        }
        AbstractC960500b6O abstractC960500b6O = (AbstractC960500b6O) afS109S0300000_15.l2;
        Room room2 = ((C955590ayT) afS109S0300000_15.l1).LJ;
        C410901il c410901il = abstractC960500b6O.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c410901il) {
            if (obj2 instanceof C955590ayT) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((C955590ayT) obj3).LJ.getId() == room2.getId()) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            RivalExtraInfo rivalExtraInfo = ((C955590ayT) ListProtector.get(arrayList2, 0)).LJIIJ;
            if (rivalExtraInfo != null) {
                RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
                reserveInfo.replyStatus = 0;
                rivalExtraInfo.reserveInfo = reserveInfo;
            }
            for (Object obj4 : arrayList2) {
                MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView2 = (MultiCoHostInviteListContract$AbsView) abstractC960500b6O.LL;
                if (multiCoHostInviteListContract$AbsView2 != null) {
                    multiCoHostInviteListContract$AbsView2.rS(abstractC960500b6O.LLJILJILJ.indexOf(obj4));
                }
            }
        }
        C1C7U.LIZIZ("BaseMultiCoHostInviteListPresenter@7cd8.reserve$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        long j;
        ReserveResponse.ResponseData responseData;
        ReserveResponse.ResponseData responseData2;
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.reserve$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Room room = (Room) afS109S0300000_15.l0;
        C955590ayT c955590ayT = (C955590ayT) afS109S0300000_15.l1;
        Long lValueOf = null;
        if (baseResponse != null && (responseData2 = (ReserveResponse.ResponseData) baseResponse.data) != null) {
            lValueOf = Long.valueOf(responseData2.reservationId);
        }
        C955400ayA.LJLJLLL(room, c955590ayT, String.valueOf(lValueOf));
        long ownerUserId = ((C955590ayT) afS109S0300000_15.l1).LJ.getOwnerUserId();
        if (baseResponse != null && (responseData = (ReserveResponse.ResponseData) baseResponse.data) != null) {
            j = responseData.createdTimestamp;
        } else {
            j = 0;
        }
        C916430ZxJ.LIZ(ownerUserId, j);
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) ((C960610b6Z) afS109S0300000_15.l2).LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.ht();
        }
        C960610b6Z c960610b6Z = (C960610b6Z) afS109S0300000_15.l2;
        Room room2 = ((C955590ayT) afS109S0300000_15.l1).LJ;
        Iterator<Object> it2 = c960610b6Z.LLILZIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getId() == room2.getId()) {
                if (next != null && (next instanceof C955590ayT)) {
                    int iIndexOf = c960610b6Z.LLILZIL.indexOf(next);
                    RivalExtraInfo rivalExtraInfo = ((C955590ayT) next).LJIIJ;
                    if (rivalExtraInfo != null) {
                        RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
                        reserveInfo.replyStatus = 0;
                        rivalExtraInfo.reserveInfo = reserveInfo;
                    }
                    MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView2 = (MultiCoHostSearchContract$AbsView) c960610b6Z.LL;
                    if (multiCoHostSearchContract$AbsView2 != null) {
                        multiCoHostSearchContract$AbsView2.dS(iIndexOf, false);
                    }
                }
            }
        }
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.reserve$1");
    }

    public static final void accept$6(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        Context context;
        C1C7U.LIZ("KaraokeGuestViewModel@53a9.sendApplyRequest$2");
        Throwable th = (Throwable) obj;
        ((KaraokeGuestViewModel) afS109S0300000_15.l0).LLIZ = false;
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJII("KaraokeGuestViewModel", "applyViewerSing failed,", th);
        C915130ZvD.LIZ(th);
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) afS109S0300000_15.l1;
        if (interfaceC923600a8s != null) {
            interfaceC923600a8s.zP(new C919700a2a(th));
        }
        InterfaceC923600a8s interfaceC923600a8s2 = (InterfaceC923600a8s) afS109S0300000_15.l1;
        if (interfaceC923600a8s2 != null) {
            context = interfaceC923600a8s2.getContext();
        } else {
            context = null;
        }
        C501540Jlg.LIZLLL(context, th, 2131840684);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_Guest_Apply_Failed", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("KaraokeGuestViewModel@53a9.sendApplyRequest$2");
    }

    public static final void accept$7(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("NoticeboardEntity@cd1e.prepareNoticeboardDraft$draftDisposable$2");
        Throwable th = (Throwable) obj;
        String strLIZ = C01EI.LIZ(306, ((NoticeboardEntity) afS109S0300000_15.l0).LLJJJJJIL.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareNoticeboardDraft error=");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(", noticeboardData=");
        sbLIZ.append((C916750Zxp) afS109S0300000_15.l1);
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Function1 function1 = (Function1) afS109S0300000_15.l2;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("NoticeboardEntity@cd1e.prepareNoticeboardDraft$draftDisposable$2");
    }

    public static final void accept$8(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("NoticeboardEntity@cd1e.readyToEdit$1");
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, (C916750Zxp) afS109S0300000_15.l0);
        InterfaceC979390bar interfaceC979390bar = (InterfaceC979390bar) afS109S0300000_15.l1;
        if (interfaceC979390bar != null) {
            interfaceC979390bar.LIZIZ(((C20361214lm) afS109S0300000_15.l2).LIZIZ, json);
        }
        C1C7U.LIZIZ("NoticeboardEntity@cd1e.readyToEdit$1");
    }

    public static final void accept$9(AfS109S0300000_15 afS109S0300000_15, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.createBoard$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createNoticeboard success logid=");
        sbLIZ.append(baseResponse.LIZIZ);
        C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        C952930auB.LIZ(EnumC952940auC.CREATE, EnumC953380auu.API_CALL, CardStruct.IStatusCode.DEFAULT, "");
        ((Function2) afS109S0300000_15.l0).invoke(Boolean.TRUE, baseResponse);
        DataChannel dataChannel = (DataChannel) afS109S0300000_15.l1;
        if (dataChannel != null) {
            dataChannel.zW(NoticeboardCreateAndUpdateChannel.class, new C462701r7(((C953600avG) afS109S0300000_15.l2).LIZ));
        }
        C1C7U.LIZIZ("NoticeboardUtils@5337.createBoard$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS109S0300000_15(X.C981960bf0 r2, X.C974560bT4 r3, kotlin.jvm.functions.Function1 r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS109S0300000_15.<init>(X.0bf0, X.0bT4, kotlin.jvm.functions.Function1, int):void");
    }

    public AfS109S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
