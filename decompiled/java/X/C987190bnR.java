package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplyFailEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestResumeApplyStateFromHangup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostResumeLeaveGroupCleanup;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987190bnR implements InterfaceC920680a4A {
    public final int $t;
    public Object l0;

    public static final void LIZ$12(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
    }

    public static final void LIZ$7(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
    }

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
            case 14:
                LIZ$14(this, linkCoreError, th);
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
            case 14:
                onSuccess$14(this, obj);
                break;
        }
    }

    public C987190bnR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSuccess$0(C987190bnR c987190bnR, Object obj) {
        String strU3;
        long followStatus;
        FollowInfo followInfo;
        DataChannel dataChannel;
        C944240agA.LJFF("LinkIn_leave_Success", "position:cancel");
        if (C924990aB7.LIZJ() && (dataChannel = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel) != null) {
            dataChannel.zW(MultiGuestPreApprovedChannel.class, new Pair(Boolean.FALSE, 0));
        }
        DataChannel dataChannel2 = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(GuestResumeApplyStateFromHangup.class, Boolean.FALSE);
        }
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) c987190bnR.l0;
        multiGuestV3GuestPresenter.isCanceling = false;
        multiGuestV3GuestPresenter.getMultiGuestDataHolder().LJJJLL = -1;
        ((MultiGuestV3GuestPresenter) c987190bnR.l0).linkPlayerState.LJII(0);
        C925150aBN.LJIIJ(((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel);
        C917810ZzX.LIZ.getClass();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            strU3 = "";
        }
        String strLJI = C917810ZzX.LJI();
        User owner = ((MultiGuestV3GuestPresenter) c987190bnR.l0).room.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strU3, strLJI, 4, null, followStatus, C927600aFK.LJII(), C932290aMt.LIZ());
        DataChannel dataChannel3 = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.FQ2(LinkInRoomAudienceCancelApplySucceedEvent.class);
        }
        C924810aAp.LJ().LJJIJIL = true;
        InterfaceC920780a4K interfaceC920780a4K = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dialogView;
        if (interfaceC920780a4K != null) {
            interfaceC920780a4K.onCancelSuccess();
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) ((MultiGuestV3GuestPresenter) c987190bnR.l0).mView;
            if (interfaceC923600a8s != null) {
                interfaceC923600a8s.Ue2();
            }
            if (C943590af7.LIZ == 3) {
                C917810ZzX.LIZJ(((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel);
            }
        }
    }

    public static final void onSuccess$1(C987190bnR c987190bnR, Object obj) {
        CancelApplyJoinGroupResult cancelApplyJoinGroupResult = (CancelApplyJoinGroupResult) obj;
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            String str = cancelApplyJoinGroupResult.logId;
            if (str == null) {
                str = "";
            }
            interfaceC950010apT.LIZ(new C920600a42(1, str, 4));
        }
    }

    public static final void onSuccess$10(C987190bnR c987190bnR, Object obj) {
        BizJoinDirectResponseData bizJoinDirectResponseData;
        int i;
        int i2;
        DirectJoinResult directJoinResult = (DirectJoinResult) obj;
        BizJoinDirectResponse bizJoinDirectResponse = directJoinResult.joinDirectResp;
        Long lValueOf = null;
        if (bizJoinDirectResponse != null) {
            bizJoinDirectResponseData = bizJoinDirectResponse.responseData;
        } else {
            bizJoinDirectResponseData = null;
        }
        InterfaceC925980aCi interfaceC925980aCi = (InterfaceC925980aCi) c987190bnR.l0;
        EnumC925940aCe enumC925940aCe = EnumC925940aCe.LINKED;
        if (bizJoinDirectResponseData != null) {
            lValueOf = Long.valueOf(bizJoinDirectResponseData.linkTypePermission);
        }
        if (bizJoinDirectResponseData != null) {
            i = bizJoinDirectResponseData.layoutTypeAction;
            i2 = bizJoinDirectResponseData.fixMicNumAction;
        } else {
            i = 0;
            i2 = 0;
        }
        interfaceC925980aCi.LIZIZ(new C055500If(enumC925940aCe, lValueOf, i, i2, directJoinResult.spotList, null, null, null, directJoinResult, 224));
    }

    public static final void onSuccess$11(C987190bnR c987190bnR, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAndKickOutAllGuestsForConflicts");
        sbLIZ.append(", onSuccess value = ");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = (MultiHostCrossAdapterImpl) c987190bnR.l0;
        C943590af7.LIZJ("checkAndKickOutAllGuestsForConflicts", multiHostCrossAdapterImpl.LLJILJIL, multiHostCrossAdapterImpl.LLILLL);
    }

    public static final void onSuccess$12(C987190bnR c987190bnR, Object obj) {
        if (CohostResumeLeaveGroupCleanup.INSTANCE.isEnabled()) {
            ((MultiHostCrossAdapterImpl) c987190bnR.l0).LLZZLLIL("handleCohostResumeLeaveGroup", true, false);
        }
    }

    public static final void onSuccess$13(C987190bnR c987190bnR, Object obj) {
        ((InterfaceC914930Zut) c987190bnR.l0).onSuccess(Unit.LIZ);
    }

    public static final void onSuccess$14(C987190bnR c987190bnR, Object obj) {
        long followStatus;
        FollowInfo followInfo;
        AbstractC928510aGn abstractC928510aGnLIZLLL;
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZLLL = interfaceC917640ZzG.LIZLLL()) != null) {
            C921170a4x.LJIILLIIL(abstractC928510aGnLIZLLL, UserService.getInstance().user().getCurrentUserId());
        }
        C1AZW.LJIIJ(12, "MGEnterActionExecutorV2", "leave channel succ for leave_source_when_enter_room", null, null);
        C924630aAX.LJJIJIIJIL(10011);
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = ((C925990aCj) c987190bnR.l0).LIZIZ.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 6, "10011", followStatus, C927600aFK.LJII(), C932290aMt.LIZ());
    }

    public static final void onSuccess$2(C987190bnR c987190bnR, Object obj) {
        PermitApplyGroupResult permitApplyGroupResult = (PermitApplyGroupResult) obj;
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            String str = permitApplyGroupResult.logId;
            if (str == null) {
                str = "";
            }
            interfaceC950010apT.LIZ(new C920610a43(1, str, 4));
        }
    }

    public static final void onSuccess$3(C987190bnR c987190bnR, Object obj) {
        CancelInviteJoinGroupResult cancelInviteJoinGroupResult = (CancelInviteJoinGroupResult) obj;
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            String str = cancelInviteJoinGroupResult.logId;
            if (str == null) {
                str = "";
            }
            interfaceC950010apT.LIZ(new C920600a42(0, str, 4));
        }
    }

    public static final void onSuccess$4(C987190bnR c987190bnR, Object obj) {
        RechargeResult rechargeResult = (RechargeResult) obj;
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        String str = rechargeResult.logId;
        if (str == null) {
            str = "";
        }
        interfaceC950010apT.LIZ(new C920590a41(str, rechargeResult.channelId, rechargeResult.isCrossArch(), 8));
    }

    public static final void onSuccess$5(C987190bnR c987190bnR, Object obj) {
        ReplyInviteGroupResult replyInviteGroupResult = (ReplyInviteGroupResult) obj;
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            String str = replyInviteGroupResult.logId;
            if (str == null) {
                str = "";
            }
            interfaceC950010apT.LIZ(new C920610a43(0, str, 4));
        }
    }

    public static final void onSuccess$6(C987190bnR c987190bnR, Object obj) {
        long followStatus;
        LiveDialogFragment liveDialogFragment;
        FollowInfo followInfo;
        C944240agA.LJFF("LinkIn_leave_Success", "position:cancel");
        C923650a8x c923650a8x = (C923650a8x) c987190bnR.l0;
        c923650a8x.LLJJIJI = false;
        MultiGuestDataHolder multiGuestDataHolder = c923650a8x.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJJLL = -1;
        }
        ((C923650a8x) c987190bnR.l0).LLJILLL.LJII(0);
        DataChannel dataChannel = ((C923650a8x) c987190bnR.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GuestResumeApplyStateFromHangup.class, Boolean.FALSE);
        }
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = ((C923650a8x) c987190bnR.l0).LL.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 4, null, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        C925150aBN.LJIIJ(((C923650a8x) c987190bnR.l0).dataChannel);
        DataChannel dataChannel2 = ((C923650a8x) c987190bnR.l0).dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(LinkInRoomAudienceCancelApplySucceedEvent.class);
        }
        C924810aAp.LJ().LJJIJIL = true;
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = ((C923650a8x) c987190bnR.l0).LLIZLLLIL;
        if (voiceChatUserInfoFragment != null && (liveDialogFragment = voiceChatUserInfoFragment.LLILLL) != null) {
            liveDialogFragment.dismiss();
        }
    }

    public static final void onSuccess$7(C987190bnR c987190bnR, Object obj) {
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ != null) {
            interfaceC937900aVwLJIIIIZZ.LJJJLIIL();
        }
    }

    public static final void onSuccess$8(C987190bnR c987190bnR, Object obj) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "cancel apply request succeed", false);
        C923760a98 c923760a98 = (C923760a98) c987190bnR.l0;
        c923760a98.LLJILJIL = false;
        c923760a98.LJJJLZIJ().LJJJLL = -1;
        ((C923760a98) c987190bnR.l0).LLJJIJIIJIL.LJII(0);
        DataChannel dataChannel = ((C923760a98) c987190bnR.l0).dataChannel;
        if (!C925050aBD.LJIIJJI(C925050aBD.LJFF())) {
            C925050aBD.LJII(dataChannel);
        }
        C924810aAp.LJ().LJJIJIL = true;
        InterfaceC920780a4K interfaceC920780a4K = ((C923760a98) c987190bnR.l0).LLJJIJI;
        if (interfaceC920780a4K != null) {
            interfaceC920780a4K.onCancelSuccess();
        }
    }

    public static final void onSuccess$9(C987190bnR c987190bnR, Object obj) {
        BizApplyResponseData bizApplyResponseData;
        Long lValueOf;
        PerceptionMessage perceptionMessage;
        ApplyResult applyResult = (ApplyResult) obj;
        BizApplyResponse bizApplyResponse = applyResult.multiGuestRespExtra;
        PerceptionMessage perceptionMessage2 = null;
        if (bizApplyResponse != null) {
            bizApplyResponseData = bizApplyResponse.responseData;
        } else {
            bizApplyResponseData = null;
        }
        InterfaceC925980aCi interfaceC925980aCi = (InterfaceC925980aCi) c987190bnR.l0;
        EnumC925940aCe enumC925940aCe = EnumC925940aCe.WAITING_APPLY;
        if (bizApplyResponseData != null) {
            lValueOf = Long.valueOf(bizApplyResponseData.linkTypePermission);
        } else {
            lValueOf = null;
        }
        if (bizApplyResponseData != null) {
            perceptionMessage2 = bizApplyResponseData.perceptionInfo;
            perceptionMessage = bizApplyResponseData.hostPerceptionInfo;
        } else {
            perceptionMessage = null;
        }
        interfaceC925980aCi.LIZIZ(new C055500If(enumC925940aCe, lValueOf, 0, 0, null, perceptionMessage2, perceptionMessage, applyResult, null, 284));
    }

    public static final void LIZ$0(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        String strU3;
        long followStatus;
        FollowInfo followInfo;
        if (th != null) {
            ((MultiGuestV3GuestPresenter) c987190bnR.l0).logThrowable(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:cancel; throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_leave_Failed", C2188811AlT.LIZIZ(sbLIZ));
        ((MultiGuestV3GuestPresenter) c987190bnR.l0).isCanceling = false;
        C917810ZzX.LIZ.getClass();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            strU3 = "";
        }
        String strLJI = C917810ZzX.LJI();
        User owner = ((MultiGuestV3GuestPresenter) c987190bnR.l0).room.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strU3, strLJI, 4, null, followStatus, C927600aFK.LJII(), C932290aMt.LIZ());
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomAudienceCancelApplyFailEvent.class, th);
        }
        InterfaceC920780a4K interfaceC920780a4K = ((MultiGuestV3GuestPresenter) c987190bnR.l0).dialogView;
        if (interfaceC920780a4K == null) {
            return;
        }
        interfaceC920780a4K.eg(th);
    }

    public static final void LIZ$1(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            interfaceC950010apT.LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
        }
    }

    public static final void LIZ$10(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        C925860aCW.LIZIZ(linkCoreError.errorCode, linkCoreError.errorMsg);
        ((InterfaceC925980aCi) c987190bnR.l0).LIZ(linkCoreError.errorCode, linkCoreError.errorMsg, th);
    }

    public static final void LIZ$11(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAndKickOutAllGuestsForConflicts");
        sbLIZ.append(", onFail, error = ");
        sbLIZ.append(linkCoreError);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ$13(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        ((InterfaceC914930Zut) c987190bnR.l0).LIZ(linkCoreError.errorCode, linkCoreError.errorMsg, th);
    }

    public static final void LIZ$14(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        String message;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF("MGEnterActionExecutorV2", "leave channel failed for leave_source_when_enter_room,", message, null);
        C924630aAX.LJJIIZI(10011, th);
    }

    public static final void LIZ$2(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        C954400awY.LIZ().LJIIL("apply_permit_fail", "applyPermit", th, null);
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            interfaceC950010apT.LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
        }
    }

    public static final void LIZ$3(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            interfaceC950010apT.LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
        }
    }

    public static final void LIZ$4(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        ((InterfaceC950010apT) c987190bnR.l0).LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
    }

    public static final void LIZ$5(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        InterfaceC950010apT interfaceC950010apT = (InterfaceC950010apT) c987190bnR.l0;
        if (interfaceC950010apT != null) {
            interfaceC950010apT.LIZIZ(new C952350atF(linkCoreError.errorCode, linkCoreError.errorMsg), th);
        }
    }

    public static final void LIZ$6(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        long followStatus;
        FollowInfo followInfo;
        if (th != null) {
            ((C923650a8x) c987190bnR.l0).logThrowable(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:cancel; throwable:");
        sbLIZ.append(th);
        C944240agA.LJFF("LinkIn_leave_Failed", C2188811AlT.LIZIZ(sbLIZ));
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = ((C923650a8x) c987190bnR.l0).LL.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 4, null, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        C923650a8x c923650a8x = (C923650a8x) c987190bnR.l0;
        c923650a8x.LLJJIJI = false;
        DataChannel dataChannel = c923650a8x.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomAudienceCancelApplyFailEvent.class, th);
        }
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = ((C923650a8x) c987190bnR.l0).LLIZLLLIL;
        if (voiceChatUserInfoFragment == null) {
            return;
        }
        voiceChatUserInfoFragment.eg(th);
    }

    public static final void LIZ$8(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel apply request failed, ");
        ((C923760a98) c987190bnR.l0).getClass();
        sbLIZ.append(C923760a98.LJJJZ(th));
        C944230ag9.LIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
        if (th != null) {
            ((C923760a98) c987190bnR.l0).logThrowable(th);
        }
        C923760a98 c923760a98 = (C923760a98) c987190bnR.l0;
        c923760a98.LLJILJIL = false;
        InterfaceC920780a4K interfaceC920780a4K = c923760a98.LLJJIJI;
        if (interfaceC920780a4K == null) {
            return;
        }
        interfaceC920780a4K.eg(th);
    }

    public static final void LIZ$9(C987190bnR c987190bnR, LinkCoreError linkCoreError, Throwable th) {
        C925860aCW.LIZIZ(linkCoreError.errorCode, linkCoreError.errorMsg);
        ((InterfaceC925980aCi) c987190bnR.l0).LIZ(linkCoreError.errorCode, linkCoreError.errorMsg, th);
    }
}
