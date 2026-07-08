package X;

import Y.ARunnableS84S0200000_15;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.LiveInviteGuestSelectedChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.linkroom.QuickCoHostStatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.PreviewMgGuideInviteUidListChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorResumeSharedBgEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.OneTapGoLiveEventV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.QuickStartLayoutCreatedChannelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.IAnchorQuickConnectAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHLeaveJoinGroupBizContent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponseData;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkApplyingChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableInviteComponentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlaybookNonMultiGuestConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveGroupChatEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEnableFromCreateChannel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS27S0001000_12;
import kotlin.jvm.internal.AwS41S0301000_12;
import tikcast.linkmic.controller.LinkedUserInfo;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multilive_biz.BizResumeResponse;

/* JADX INFO: renamed from: X.0bnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987180bnQ implements InterfaceC920680a4A {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC920680a4A
    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, linkCoreError, th);
                break;
            case 1:
                LIZ$1(this, linkCoreError, th);
                break;
            case 2:
                LIZ$2(this, linkCoreError, th);
                break;
            case 3:
                LIZ$3(this, linkCoreError, th);
                break;
            case 4:
                LIZ$4(this, linkCoreError, th);
                break;
            case 5:
                LIZ$5(this, linkCoreError, th);
                break;
            case 6:
                LIZ$6(this, linkCoreError, th);
                break;
            case 7:
                LIZ$7(this, linkCoreError, th);
                break;
            case 8:
                LIZ$8(this, linkCoreError, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, linkCoreError, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, linkCoreError, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, linkCoreError, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, linkCoreError, th);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, linkCoreError, th);
                break;
        }
    }

    @Override // X.InterfaceC920680a4A
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSuccess$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onSuccess$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSuccess$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onSuccess$13(this, obj);
                break;
        }
    }

    public static final void onSuccess$0(C987180bnQ c987180bnQ, Object obj) {
        C925320aBe c925320aBe = C925320aBe.LIZ;
        DataChannel dataChannel = (DataChannel) c987180bnQ.l0;
        c925320aBe.getClass();
        C925320aBe.LJFF(dataChannel);
        C924630aAX.LJJJIL(2L, C930540aK4.LJIIL());
    }

    public static final void onSuccess$1(C987180bnQ c987180bnQ, Object obj) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        String strLogTAG = ((C921520a5W) c987180bnQ.l0).logTAG(1154);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switch layout since enableShowMultiGuestLayout ");
        sbLIZ.append(((Layout) c987180bnQ.l1).layoutId);
        C1AZW.LJIIJ(12, strLogTAG, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJIZL(((Layout) c987180bnQ.l1).layoutId, false, false, true, false, new C916150Zwr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccess$10(X.C987180bnQ r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C987180bnQ.onSuccess$10(X.0bnQ, java.lang.Object):void");
    }

    public static final void onSuccess$11(C987180bnQ c987180bnQ, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestManagePanel_kickOutAll onSuccess value:");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("kick_out_all", C2188811AlT.LIZIZ(sbLIZ));
        ((C932420aN6) c987180bnQ.l0).dismiss();
        List list = (List) c987180bnQ.l1;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                C921920a6A.LJIIJ(jLongValue, "kickoff_all");
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C921920a6A.LIZ(jLongValue, -1L, C927600aFK.LJII(), null);
            }
        }
    }

    public static final void onSuccess$12(C987180bnQ c987180bnQ, Object obj) {
        C918650a0t c918650a0t = (C918650a0t) c987180bnQ.l0;
        C918350a0P c918350a0P = (C918350a0P) c987180bnQ.l1;
        Function1<C918230a0D, Unit> function1 = c918350a0P.LIZJ.LIZJ;
        C918230a0D c918230a0D = new C918230a0D(c918350a0P.LIZIZ(), EnumC918860a1E.UNIFIED, true, null, null, null, ((InviteResult) obj).originData, 56);
        c918650a0t.getClass();
        C918650a0t.LJ(function1, c918230a0D);
    }

    public static final void onSuccess$13(C987180bnQ c987180bnQ, Object obj) {
        boolean z;
        DataChannel dataChannel;
        long j;
        ResumeResp resumeResp;
        List<LinkedUserInfo> list;
        EnumC925190aBR enumC925190aBR;
        IInteractService iInteractService;
        DataChannel dataChannel2;
        String strLJIILIIL;
        List list2;
        LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        List<User> list3;
        ListByTypeResponse.ReservedUser reservedUser;
        BizCreateChannelResponseData bizCreateChannelResponseData;
        DataChannel dataChannel3;
        ResumeResp resumeResp2;
        BizResumeResponse bizResumeResponse;
        BizResumeResponse.ResponseData responseData;
        ResumeResp resumeResp3;
        BizResumeResponse bizResumeResponse2;
        BizResumeResponse.ResponseData responseData2;
        Long lValueOf;
        BizCreateChannelResponseData bizCreateChannelResponseData2;
        BizResumeResponse bizResumeResponse3;
        BizResumeResponse.ResponseData responseData3;
        ResumeResp resumeResp4;
        BizResumeResponse bizResumeResponse4;
        BizResumeResponse.ResponseData responseData4;
        TextHeaderPlayContent textHeaderPlayContent;
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        ResumeResp resumeResp5;
        BizResumeResponse bizResumeResponse5;
        BizResumeResponse.ResponseData responseData5;
        GuestShowdownContent guestShowdownContent;
        InterfaceC938530aWx interfaceC938530aWxLIZ;
        ResumeResp resumeResp6;
        BizResumeResponse bizResumeResponse6;
        BizResumeResponse.ResponseData responseData6;
        ResumeResp resumeResp7;
        BizResumeResponse bizResumeResponse7;
        BizResumeResponse.ResponseData responseData7;
        CreateChannelResult createChannelResult = (CreateChannelResult) obj;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        String str = ((C944270agD) c987180bnQ.l1).LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAndTurnOnMultiGuest -> ");
        sbLIZ.append(createChannelResult);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ(str, strLIZIZ);
        if (((EnumC925190aBR) c987180bnQ.l0) == EnumC925190aBR.USER_CLICK) {
            HashMap map = new HashMap();
            C925640aCA.LIZLLL(map);
            map.put("open_method", "manual");
            C925640aCA.LJJI("livesdk_anchor_guest_connection_open", map, true);
        } else {
            HashMap map2 = new HashMap();
            C925640aCA.LIZLLL(map2);
            map2.put("open_method", "auto");
            C925640aCA.LJJI("livesdk_anchor_guest_connection_open", map2, true);
        }
        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
        if (interfaceC945610aiNLIZ != null) {
            interfaceC945610aiNLIZ.LIZLLL(createChannelResult);
        }
        C944270agD c944270agD = (C944270agD) c987180bnQ.l1;
        c944270agD.getClass();
        InterfaceC944250agB interfaceC944250agB = (InterfaceC944250agB) c944270agD.mView;
        if (interfaceC944250agB != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(interfaceC944250agB);
            if (interfaceC665370Q7zLIZIZ != null) {
                C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, true);
            }
            interfaceC944250agB.pF((EnumC925190aBR) c987180bnQ.l0);
        }
        if (MultiGuestLiveShowSetting.INSTANCE.isV1() && (resumeResp7 = createChannelResult.resumeResp) != null && (bizResumeResponse7 = resumeResp7.multiGuestRespExtra) != null && (responseData7 = bizResumeResponse7.data) != null && responseData7.isShowing && responseData7.showContent != null) {
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null) {
                interfaceC302601FgLIZ.LJIILJJIL(responseData7.showContent);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resume callback liveShowService: ");
            sbLIZ2.append(interfaceC302601FgLIZ);
            C20441214yg.LIZIZ("live_show_resume", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C927800aFe.LIZIZ() && (resumeResp6 = createChannelResult.resumeResp) != null && (bizResumeResponse6 = resumeResp6.multiGuestRespExtra) != null && (responseData6 = bizResumeResponse6.data) != null && responseData6.countdownContents != null) {
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ != null) {
                interfaceC421301kRLIZIZ.LIZIZ(responseData6.countdownContents);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("resume callback countdownService: ");
            sbLIZ3.append(interfaceC421301kRLIZIZ);
            C20441214yg.LIZIZ("countdown_resume", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount() && (resumeResp5 = createChannelResult.resumeResp) != null && (bizResumeResponse5 = resumeResp5.multiGuestRespExtra) != null && (responseData5 = bizResumeResponse5.data) != null && (guestShowdownContent = responseData5.guestShowdownContent) != null && (interfaceC938530aWxLIZ = C01IB.LIZ()) != null) {
            interfaceC938530aWxLIZ.LJIIJJI(guestShowdownContent);
        }
        C20441214yg.LIZIZ("LinkControlPresenter", "resumeTextHeader");
        if (C931810aM7.LIZJ(((C944270agD) c987180bnQ.l1).LLJI) && (resumeResp4 = createChannelResult.resumeResp) != null && (bizResumeResponse4 = resumeResp4.multiGuestRespExtra) != null && (responseData4 = bizResumeResponse4.data) != null && (textHeaderPlayContent = responseData4.textHeaderContent) != null && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null) {
            interfaceC971790bObLIZIZ.LJIILIIL(textHeaderPlayContent);
        }
        ResumeResp resumeResp8 = createChannelResult.resumeResp;
        if (resumeResp8 != null && (bizResumeResponse3 = resumeResp8.multiGuestRespExtra) != null && (responseData3 = bizResumeResponse3.data) != null && responseData3.countdownForAllContent != null) {
            InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
            if (interfaceC927690aFTLIZ != null) {
                interfaceC927690aFTLIZ.LJ(responseData3.countdownForAllContent);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("resume callback countDownForAllService: ");
            sbLIZ4.append(interfaceC927690aFTLIZ);
            C20441214yg.LIZIZ("count_down_for_all_resume", C2188811AlT.LIZIZ(sbLIZ4));
        }
        BizCreateChannelResponse bizCreateChannelResponse = createChannelResult.multiGuestRespExtra;
        if (bizCreateChannelResponse != null && (bizCreateChannelResponseData2 = bizCreateChannelResponse.responseData) != null && !bizCreateChannelResponseData2.socialGameAvailable.isEmpty()) {
            boolean zContains = createChannelResult.multiGuestRespExtra.responseData.socialGameAvailable.contains(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Let's dance Enable: ");
            sbLIZ5.append(zContains);
            sbLIZ5.append(". ");
            sbLIZ5.append(createChannelResult.multiGuestRespExtra.responseData.socialGameAvailable);
            C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ5));
            DataChannel dataChannel4 = ((C944270agD) c987180bnQ.l1).dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.zW(MultiLetsDanceEnableFromCreateChannel.class, Boolean.valueOf(zContains));
            }
        } else {
            C20441214yg.LIZIZ("LinkControlPresenter", "Let's dance Enable: false");
            DataChannel dataChannel5 = ((C944270agD) c987180bnQ.l1).dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.zW(MultiLetsDanceEnableFromCreateChannel.class, Boolean.FALSE);
            }
        }
        if (C758560TpG.LIZ() && !C978390bZF.LIZ() && !LinkMicPlaybookNonMultiGuestConfigSetting.INSTANCE.isCodeTechSwitchForAndroidEnable() && (resumeResp3 = createChannelResult.resumeResp) != null && (bizResumeResponse2 = resumeResp3.multiGuestRespExtra) != null && (responseData2 = bizResumeResponse2.data) != null && responseData2.activePlaybook != null) {
            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(((C944270agD) c987180bnQ.l1).dataChannel);
            if (playbookAnchorServiceV2LIZIZ != null) {
                ActivePlaybook activePlaybook = responseData2.activePlaybook;
                String strLIZ = C01EI.LIZ(0, "PlaybookAnchorServiceV2");
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("resumeForMultiGuest, activePlayId=");
                if (activePlaybook != null) {
                    lValueOf = Long.valueOf(activePlaybook.playId);
                } else {
                    lValueOf = null;
                }
                sbLIZ6.append(lValueOf);
                C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ6), null, null);
                PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) playbookAnchorServiceV2LIZIZ.LLILLJJLI;
                if (playbookAnchorViewModel != null && activePlaybook != null) {
                    C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
                    c20384514pX.getClass();
                    String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorModel");
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("resumeLiveForMultiGuest, activePlayId=");
                    sbLIZ7.append(activePlaybook.playId);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ7), null, null);
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    C978360bZC.LJIIIZ = "auto_apply";
                    C978360bZC.LJIIJ = "live_stop_continue";
                    c20384514pX.LJJIII(activePlaybook, "resumeLiveForMultiGuest", false, true);
                    Playbook playbook = activePlaybook.playbook;
                    if (playbook != null) {
                        c20384514pX.LJJJI(playbook);
                    }
                }
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("resume callback iPlaybookAnchorService: ");
            sbLIZ8.append(playbookAnchorServiceV2LIZIZ);
            C20441214yg.LIZIZ("playbook_resume", C2188811AlT.LIZIZ(sbLIZ8));
        }
        if (MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnable() && (resumeResp2 = createChannelResult.resumeResp) != null && (bizResumeResponse = resumeResp2.multiGuestRespExtra) != null && (responseData = bizResumeResponse.data) != null && responseData.quickCallAutoApprove == 1) {
            C20441214yg.LIZIZ("LinkControlPresenter", "onResume  QUICK_CALL_AUTO_APPROVE_START");
            DataChannel dataChannel6 = ((C944270agD) c987180bnQ.l1).dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.SX0(C956820b0S.class, Long.valueOf(createChannelResult.resumeResp.multiGuestRespExtra.data.quickCallAutoApproveStartMs));
            }
            DataChannel dataChannel7 = ((C944270agD) c987180bnQ.l1).dataChannel;
            if (dataChannel7 != null && dataChannel7.gg0(C956790b0P.class) != null) {
                IAnchorQuickConnectAbility iAnchorQuickConnectAbility = (IAnchorQuickConnectAbility) C1555540qa8.LIZIZ((InterfaceC665370Q7z) ((C944270agD) c987180bnQ.l1).dataChannel.gg0(C956790b0P.class), IAnchorQuickConnectAbility.class, null);
                if (iAnchorQuickConnectAbility != null) {
                    C20441214yg.LIZIZ("LinkControlPresenter", "onResume  ability != null");
                    iAnchorQuickConnectAbility.getViewModel().AQ2(Long.valueOf(createChannelResult.resumeResp.multiGuestRespExtra.data.quickCallAutoApproveStartMs));
                } else {
                    C20441214yg.LIZIZ("LinkControlPresenter", "onResume  ability = null");
                }
            }
        }
        BizCreateChannelResponse bizCreateChannelResponse2 = createChannelResult.multiGuestRespExtra;
        if (bizCreateChannelResponse2 != null && (bizCreateChannelResponseData = bizCreateChannelResponse2.responseData) != null) {
            String strLJ = C936270aTJ.LJ(bizCreateChannelResponseData.backgroundStickerId);
            if (!TextUtils.isEmpty(strLJ) && (dataChannel3 = ((C944270agD) c987180bnQ.l1).dataChannel) != null) {
                dataChannel3.LC0(AnchorResumeSharedBgEvent.class, strLJ);
                ((C944270agD) c987180bnQ.l1).dataChannel.SX0(C956780b0O.class, strLJ);
            }
        }
        DataChannel dataChannel8 = ((C944270agD) c987180bnQ.l1).dataChannel;
        if (dataChannel8 != null && dataChannel8.gg0(C956910b0b.class) != null && (reservedUser = (ListByTypeResponse.ReservedUser) ((C944270agD) c987180bnQ.l1).dataChannel.gg0(C956910b0b.class)) != null) {
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS84S0200000_15(c987180bnQ, reservedUser, 79));
            ((C944270agD) c987180bnQ.l1).dataChannel.SX0(C956910b0b.class, null);
        }
        if (MultiGuestGuideEnableInviteComponentSetting.isEnable()) {
            C944270agD c944270agD2 = (C944270agD) c987180bnQ.l1;
            if (c944270agD2.mView != 0 && c944270agD2.dataChannel != null) {
                C20441214yg.LIZIZ("LinkControlPresenter", "batchInviteGuest, lifeCycle:${getViewInterface().getLifecycle()}");
                Lifecycle lifecycle = ((LifecycleOwner) ((C944270agD) c987180bnQ.l1).mView).getLifecycle();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                C0J9U c0j9u = (C0J9U) dataChannelGlobal.gg0(LiveInviteGuestSelectedChannel.class);
                if ((c0j9u == null || (list3 = c0j9u.LIZ) == null || list3.isEmpty()) && (list2 = (List) dataChannelGlobal.gg0(PreviewMgGuideInviteUidListChannel.class)) != null && list2.isEmpty()) {
                    C20441214yg.LIZIZ("MultiGuestUtil", "batchInviteGuest, selectedData is empty");
                } else if (lifecycle != null && (lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) != null) {
                    C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, null, null, new C932200aMk(null), 3);
                }
            }
        }
        if (LiveGroupChatEnableSetting.INSTANCE.enable()) {
            if (!C931790aM5.LIZIZ()) {
                DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                Object objGg0 = dataChannelGlobal2.gg0(C930910aKf.class);
                if (objGg0 != null && (dataChannel2 = ((C944270agD) c987180bnQ.l1).dataChannel) != null) {
                    dataChannel2.LC0(OneTapGoLiveEventV2.class, objGg0);
                    ((C944270agD) c987180bnQ.l1).getClass();
                    Bundle bundle = (Bundle) dataChannelGlobal2.gg0(C931430aLV.class);
                    if (bundle != null) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("invite_guest_uid_list");
                        if (!C927830aFh.LIZ(stringArrayList)) {
                            if (C916490ZxP.LIZJ() != null) {
                                MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                                Objects.requireNonNull(multiGuestDataHolderLIZJ);
                                strLJIILIIL = multiGuestDataHolderLIZJ.LJIILIIL();
                            } else {
                                strLJIILIIL = "panel_Golive";
                            }
                            for (String str2 : stringArrayList) {
                                C921640a5i.LIZ(0, "chat_live", CastLongProtector.parseLong(str2), "room");
                                C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "emptyGuideInviteOutRoomFriend");
                                c927240aEk.LJ = str2;
                                c927240aEk.LIZ();
                                long j2 = CastLongProtector.parseLong(str2);
                                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                                C307001Gy.LIZ().getClass();
                                C925600aC6.LJIIJ(j2, C927600aFK.LJII(), "chat_live", "", "", 0, 0, false, -1, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, null, null, false);
                                C921640a5i.LIZ(0, "outside_live_room", CastLongProtector.parseLong(str2), "room");
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (((C944270agD) c987180bnQ.l1).LLJI && (((enumC925190aBR = (EnumC925190aBR) c987180bnQ.l0) == EnumC925190aBR.AUTO_START || enumC925190aBR == EnumC925190aBR.ACTIVITY_PAGE_OPEN) && ((iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) == null || !iInteractService.ae()))) {
            C20441214yg.LIZIZ("linkmic_anchor_resume", "resume failed");
            DataChannel dataChannel9 = ((C944270agD) c987180bnQ.l1).dataChannel;
            if (dataChannel9 != null) {
                dataChannel9.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, "resume_broadcastfailed_without_guest");
            }
        }
        if (createChannelResult.isResume && (resumeResp = createChannelResult.resumeResp) != null && (list = resumeResp.linkedUserInfo) != null && list.size() > 1) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("QuickStartLayout needReOpenLayoutForResume:");
        sbLIZ9.append(z);
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ9));
        if (z && (dataChannel = ((C944270agD) c987180bnQ.l1).dataChannel) != null) {
            if (((EnumC925190aBR) c987180bnQ.l0) != EnumC925190aBR.RESTART_AFTER_CO_HOST) {
                j = 0;
            } else {
                j = 2000;
            }
            dataChannel.SX0(C750050TbX.class, Long.valueOf(j));
            ((C944270agD) c987180bnQ.l1).dataChannel.FQ2(QuickStartLayoutCreatedChannelEvent.class);
        }
        if (C01ZE.LIZ() && C927810aFf.LIZ() != null) {
            ((C941600abu) C927810aFf.LIZ()).LJIIJJI();
        }
    }

    public static final void onSuccess$2(C987180bnQ c987180bnQ, Object obj) {
        C924810aAp.LJ().LJIIJJI(false);
        Runnable runnable = ((C918080Zzy) c987180bnQ.l0).LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
        List list = (List) c987180bnQ.l1;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                C921920a6A.LJIIJ(jLongValue, "kickoff_all");
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C921920a6A.LIZ(jLongValue, -1L, C927600aFK.LJII(), null);
            }
        }
    }

    public static final void onSuccess$3(C987180bnQ c987180bnQ, Object obj) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        ((MultiLiveSettingDialog) c987180bnQ.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiLiveAnchorSettingDialog_");
        sbLIZ.append(982);
        C1AZW.LJIIJ(12, C2188811AlT.LIZIZ(sbLIZ), "turn on to switch layout", null, null);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJIZL(((Layout) c987180bnQ.l1).layoutId, false, false, true, false, new C916150Zwr());
        }
    }

    public static final void onSuccess$4(C987180bnQ c987180bnQ, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLiveAsAnchorListDialogV2_kickOutAll onSuccess value:");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("kick_out_all", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJI((MultiLiveAsAnchorListDialogV2) c987180bnQ.l0);
        List list = (List) c987180bnQ.l1;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                C921920a6A.LJIIJ(jLongValue, "kickoff_all");
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C921920a6A.LIZ(jLongValue, -1L, C927600aFK.LJII(), null);
            }
        }
        ((MultiLiveAsAnchorListDialogV2) c987180bnQ.l0).s = true;
    }

    public static final void onSuccess$5(C987180bnQ c987180bnQ, Object obj) {
        LeaveGroupResult leaveGroupResult = (LeaveGroupResult) obj;
        ((MultiHostCrossAdapterImpl) c987180bnQ.l0).LLLLLZIL();
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987180bnQ.l1;
        if (interfaceC950010apT != null) {
            String str = leaveGroupResult.logId;
            if (str == null) {
                str = "";
            }
            BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse = leaveGroupResult.cohostRespExtra;
            MHLeaveJoinGroupBizContent mHLeaveJoinGroupBizContent = new MHLeaveJoinGroupBizContent();
            if (bizLeaveJoinGroupResponse != null) {
                mHLeaveJoinGroupBizContent.feedbackShowReason = bizLeaveJoinGroupResponse.feedbackShowReason;
                mHLeaveJoinGroupBizContent.feedbackContentType = bizLeaveJoinGroupResponse.feedbackContentType;
            }
            interfaceC950010apT.LIZ(new C920630a45(str, mHLeaveJoinGroupBizContent, 4));
        }
        C943590af7.LJ(0, 0, ((MultiHostCrossAdapterImpl) c987180bnQ.l0).LLJILJIL, "onCohostEnd");
    }

    public static final void onSuccess$6(C987180bnQ c987180bnQ, Object obj) {
        InterfaceC920680a4A interfaceC920680a4A = (InterfaceC920680a4A) c987180bnQ.l0;
        if (interfaceC920680a4A != null) {
            interfaceC920680a4A.onSuccess(obj);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leaveGroup");
        sbLIZ.append(", onSuccess, value = ");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = ((MultiHostCrossAdapterImpl) c987180bnQ.l1).LLJILJIL;
        if (dataChannel != null) {
            dataChannel.LC0(QuickCoHostStatusChangeEvent.class, "leave");
        }
    }

    public static final void onSuccess$7(C987180bnQ c987180bnQ, Object obj) {
        long followStatus;
        FollowInfo followInfo;
        C921170a4x.LJIILLIIL((InterfaceC921200a50) c987180bnQ.l0, UserService.getInstance().user().getCurrentUserId());
        C20441214yg.LIZIZ("VoiceChatWatchPresenter", "leave channel succ for leave_source_when_enter_room");
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = ((C923650a8x) c987180bnQ.l1).LL.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 6, "10011", followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
    }

    public static final void onSuccess$8(C987180bnQ c987180bnQ, Object obj) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "leave channel succeed", false);
        InterfaceC923020a7w interfaceC923020a7w = (InterfaceC923020a7w) c987180bnQ.l0;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Iterator it2 = interfaceC923020a7w.LIZIZ().iterator();
        while (it2.hasNext()) {
            if (((LinkPlayerInfo) it2.next()).mUser.getId() == currentUserId) {
                it2.remove();
            }
        }
    }

    public static final void onSuccess$9(C987180bnQ c987180bnQ, Object obj) {
        BizApplyResponseData bizApplyResponseData;
        Long lValueOf;
        Boolean boolValueOf;
        User owner;
        FollowInfo followInfo;
        int i;
        long id;
        User owner2;
        User owner3;
        PerceptionMessage perceptionMessage;
        ApplyResult applyResult = (ApplyResult) obj;
        C925720aCI c925720aCI = (C925720aCI) c987180bnQ.l0;
        c925720aCI.LLJI = false;
        DataChannel dataChannel = c925720aCI.LLILZIL;
        if (dataChannel != null) {
            dataChannel.zW(GameLinkApplyingChannel.class, Boolean.FALSE);
        }
        BizApplyResponse bizApplyResponse = applyResult.multiGuestRespExtra;
        Boolean boolValueOf2 = null;
        if (bizApplyResponse != null) {
            bizApplyResponseData = bizApplyResponse.responseData;
        } else {
            bizApplyResponseData = null;
        }
        AbstractC923750a97 abstractC923750a97 = ((C925720aCI) c987180bnQ.l0).LLILLL;
        if (abstractC923750a97 != null) {
            if (bizApplyResponseData != null) {
                perceptionMessage = bizApplyResponseData.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (AbstractC923750a97.onInterceptPunishedMessageNew$liveinteract_impl_release$default(abstractC923750a97, perceptionMessage, null, 2, null)) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkPermissionType = ");
        if (bizApplyResponseData != null) {
            lValueOf = Long.valueOf(bizApplyResponseData.linkTypePermission);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C944230ag9.LIZ("GameLinkInteractDialogPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
        if (bizApplyResponseData != null) {
            C924250a9v.LIZ().LJJII(bizApplyResponseData.linkTypePermission);
        }
        C925770aCN c925770aCN = (C925770aCN) c987180bnQ.l1;
        if (c925770aCN != null) {
            boolValueOf = Boolean.valueOf(c925770aCN.LIZLLL);
        } else {
            boolValueOf = null;
        }
        long followStatus = 0;
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C925720aCI c925720aCI2 = (C925720aCI) c987180bnQ.l0;
            c925720aCI2.getClass();
            FollowPair followPair = new FollowPair();
            Room room = c925720aCI2.LLILZ;
            if (room != null && (owner3 = room.getOwner()) != null) {
                boolValueOf2 = Boolean.valueOf(owner3.isFollower);
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                i = 2;
            } else {
                i = 1;
            }
            followPair.followStatus = i;
            Room room2 = c925720aCI2.LLILZ;
            if (room2 != null && (owner2 = room2.getOwner()) != null) {
                id = owner2.getId();
            } else {
                id = 0;
            }
            followPair.LIZ = id;
            followPair.LIZJ = followPair.followStatus;
            UserService.getInstance().user().LJIIJJI(followPair);
        }
        C925720aCI c925720aCI3 = (C925720aCI) c987180bnQ.l0;
        if (c925720aCI3.LL == 0) {
            return;
        }
        if (bizApplyResponseData != null && bizApplyResponseData.linkTypePermission == 2) {
            GameLinkDataHolder gameLinkDataHolderLJIILL = c925720aCI3.LJIILL();
            if (gameLinkDataHolderLJIILL != null) {
                gameLinkDataHolderLJIILL.LIZ();
            }
            if (c925720aCI3.LLILZLL != 2) {
                C766270U4b.LJIIJJI(C497740JfY.LJII().getString(2131843597));
                C445101oH.LIZ();
            }
            c925720aCI3.LLILZLL = 2;
        }
        C924790aAn.LIZLLL().LJII(1);
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        C925720aCI c925720aCI4 = (C925720aCI) c987180bnQ.l0;
        c924790aAnLIZLLL.LJIIL = c925720aCI4.LLILZLL;
        Room room3 = c925720aCI4.LLILZ;
        if (room3 != null && (owner = room3.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        }
        HashMap map = new HashMap();
        map.put("guest_connection_type", "voice");
        map.put("weight_decay_type", String.valueOf(-1));
        map.put("anchor_relationship", String.valueOf(followStatus));
        if (!TextUtils.isEmpty(C924770aAl.LIZ)) {
            map.put("request_page", C924770aAl.LIZ);
        }
        GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
        if (gameLinkDataHolderLIZ != null) {
            map.put("guest_permission", gameLinkDataHolderLIZ.LJIILJJIL());
        }
        map.put("link_id", C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)));
        map.put("apply_connection_type", CardStruct.IStatusCode.DEFAULT);
        map.put("request_platform", "room");
        map.put("connected_guest_cnt", String.valueOf(C924250a9v.LIZ().LJJIFFI));
        map.put("layout_setting", C924650aAZ.LJ().getFirst());
        map.put("window_setting", C924650aAZ.LJ().getSecond());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_apply");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        C924810aAp.LJ().LJJIJIL = false;
        InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) ((C925720aCI) c987180bnQ.l0).LL;
        if (interfaceC925780aCO == null) {
            return;
        }
        interfaceC925780aCO.ZK();
    }

    public C987180bnQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void LIZ$0(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        C501540Jlg.LIZLLL((Context) c987180bnQ.l1, th, 2131853452);
        C924630aAX.LJJJ(th, 2L, C930540aK4.LJIIL());
    }

    public static final void LIZ$1(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        C1AZW.LJFF(((C921520a5W) c987180bnQ.l0).logTAG(1263), "switch layout since enableShowMultiGuestLayout changePosition error", null, null);
    }

    public static final void LIZ$10(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        C925860aCW.LIZIZ(linkCoreError.errorCode, linkCoreError.errorMsg);
        ((InterfaceC925980aCi) c987180bnQ.l1).LIZ(linkCoreError.errorCode, linkCoreError.errorMsg, th);
    }

    public static final void LIZ$11(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestManagePanel_kickOutAll onFail error:");
        sbLIZ.append(linkCoreError);
        C20441214yg.LIZIZ("kick_out_all", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ$12(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        String message;
        C918650a0t c918650a0t = (C918650a0t) c987180bnQ.l0;
        C918350a0P c918350a0P = (C918350a0P) c987180bnQ.l1;
        Function1<C918230a0D, Unit> function1 = c918350a0P.LIZJ.LIZJ;
        EnumC918870a1F enumC918870a1FLIZIZ = c918350a0P.LIZIZ();
        EnumC918860a1E enumC918860a1E = EnumC918860a1E.UNIFIED;
        Integer numValueOf = Integer.valueOf(linkCoreError.errorCode);
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C918230a0D c918230a0D = new C918230a0D(enumC918870a1FLIZIZ, enumC918860a1E, false, numValueOf, message, th, null, 64);
        c918650a0t.getClass();
        C918650a0t.LJ(function1, c918230a0D);
    }

    public static final void LIZ$13(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        EnumC925190aBR enumC925190aBR;
        ((C944270agD) c987180bnQ.l1).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createChannel failed-->");
        sbLIZ.append(linkCoreError);
        C919310a1x.LIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C944270agD c944270agD = (C944270agD) c987180bnQ.l1;
        DataChannel dataChannel = c944270agD.dataChannel;
        if (dataChannel != null && c944270agD.LLJI && ((enumC925190aBR = (EnumC925190aBR) c987180bnQ.l0) == EnumC925190aBR.AUTO_START || enumC925190aBR == EnumC925190aBR.ACTIVITY_PAGE_OPEN)) {
            dataChannel.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, "create_channel_failed");
        }
        C944270agD c944270agD2 = (C944270agD) c987180bnQ.l1;
        c944270agD2.getClass();
        if (th != null) {
            c944270agD2.logThrowable(th);
        }
        InterfaceC777420Uea interfaceC777420Uea = null;
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 31011) {
            C944270agD c944270agD3 = (C944270agD) c987180bnQ.l1;
            if (c944270agD3.mView != 0) {
                DataChannel dataChannel2 = c944270agD3.dataChannel;
                if (dataChannel2 != null) {
                    interfaceC777420Uea = (InterfaceC777420Uea) dataChannel2.gg0(C782140UmC.class);
                }
                Context context = ((InterfaceC919320a1y) c944270agD3.mView).getContext();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) c944270agD3.mView;
                if (context != null && lifecycleOwner != null) {
                    C784540Uq4.LIZIZ(context, lifecycleOwner, new AwS27S0001000_12(2, 0), new AwS41S0301000_12(context, lifecycleOwner, interfaceC777420Uea, 2, 1));
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC944250agB interfaceC944250agB = (InterfaceC944250agB) ((C944270agD) c987180bnQ.l1).mView;
        if (interfaceC944250agB != null) {
            interfaceC944250agB.jX((EnumC925190aBR) c987180bnQ.l0, th);
        }
        DataChannel dataChannel3 = ((C944270agD) c987180bnQ.l1).dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C956910b0b.class, null);
        }
    }

    public static final void LIZ$2(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        Runnable runnable = ((C918080Zzy) c987180bnQ.l0).LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void LIZ$3(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        ((MultiLiveSettingDialog) c987180bnQ.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiLiveAnchorSettingDialog_");
        sbLIZ.append(993);
        C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "turn on to switch layout changePosition error", null, null);
    }

    public static final void LIZ$4(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLiveAsAnchorListDialogV2_kickOutAll onFail error:");
        sbLIZ.append(linkCoreError);
        C20441214yg.LIZIZ("kick_out_all", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ$5(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987180bnQ.l1;
        if (interfaceC950010apT != null) {
            interfaceC950010apT.LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
        }
    }

    public static final void LIZ$6(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leaveGroup");
        sbLIZ.append(", onFail, error = ");
        sbLIZ.append(linkCoreError);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC920680a4A interfaceC920680a4A = (InterfaceC920680a4A) c987180bnQ.l0;
        if (interfaceC920680a4A != null) {
            interfaceC920680a4A.LIZ(linkCoreError, th);
        }
        ((MultiHostCrossAdapterImpl) c987180bnQ.l1).LLZZLLIL("leaveGroup", true, false);
    }

    public static final void LIZ$7(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        String message;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF("VoiceChatWatchPresenter", "leave channel failed for leave_source_when_enter_room,", message, null);
    }

    public static final void LIZ$8(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leave channel failed, ");
        ((C923760a98) c987180bnQ.l1).getClass();
        sbLIZ.append(C923760a98.LJJJZ(th));
        C944230ag9.LIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static final void LIZ$9(C987180bnQ c987180bnQ, LinkCoreError linkCoreError, Throwable th) {
        InterfaceC923600a8s interfaceC923600a8s;
        DataChannel dataChannel = ((C925720aCI) c987180bnQ.l0).LLILZIL;
        if (dataChannel != null) {
            dataChannel.zW(GameLinkApplyingChannel.class, Boolean.FALSE);
        }
        AbstractC923750a97 abstractC923750a97 = ((C925720aCI) c987180bnQ.l0).LLILLL;
        if (abstractC923750a97 != null && (interfaceC923600a8s = (InterfaceC923600a8s) abstractC923750a97.mView) != null) {
            interfaceC923600a8s.FZ(new C925120aBK(th));
        }
        C925720aCI c925720aCI = (C925720aCI) c987180bnQ.l0;
        c925720aCI.LLJI = false;
        T t = c925720aCI.LL;
        if (t == 0) {
            return;
        }
        ((InterfaceC925780aCO) t).zo(th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guest apply failed throwable:");
        sbLIZ.append(th);
        C20441214yg.LJIIIZ("GameLinkInteractDialogPresenter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
