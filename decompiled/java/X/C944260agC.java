package X;

import Y.AfS184S0100000_15;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.CoHostFollowPromptEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStartEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkMicSettingMessageUpdatedEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStateApi;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveAnimation;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCapsuleMessageFilterVerifySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestPlayAdSwitch;
import com.bytedance.android.livesdk.model.message.ApplyAnimationContent;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.CohostFollowMessage;
import com.bytedance.android.livesdk.model.message.CohostReserveMessage;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAdMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAnimationMessage;
import com.bytedance.android.livesdk.model.message.LinkmicUserToastContent;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.ReserveContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.List;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.controller.AckStateReq;
import webcast.im.LinkStateMessage;

/* JADX INFO: renamed from: X.0agC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C944260agC extends C944360agM {
    public final /* synthetic */ C944270agD LL;

    @Override // X.C944360agM, X.InterfaceC944490agZ
    public final void n0() {
    }

    public C944260agC(C944270agD c944270agD) {
        this.LL = c944270agD;
    }

    @Override // X.C944360agM, X.InterfaceC944670agr
    public final void Gm(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C944270agD c944270agD;
        T t;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive anchor guide message, messageType = ");
        sbLIZ.append(linkMicAnchorGuideMessage.guideType);
        sbLIZ.append(", message: ");
        sbLIZ.append(linkMicAnchorGuideMessage);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!C944270agD.LLJLIL && (t = (c944270agD = this.LL).mView) != 0 && c944270agD.LLJI) {
            ((InterfaceC944250agB) t).Gm(linkMicAnchorGuideMessage);
        }
    }

    @Override // X.C944360agM, X.InterfaceC944510agb
    public final void Hr(PerceptionMessage perceptionMessage) {
        if (perceptionMessage.publicEventInfo != null) {
            ((InterfaceC944250agB) this.LL.mView).Hr(perceptionMessage);
        }
    }

    @Override // X.C944360agM, X.InterfaceC944670agr
    public final void Ht(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C944270agD c944270agD;
        T t;
        C944270agD.LJJJJLI().LJIILJJIL(linkMicAnchorGuideMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive anchor guide message, messageType = ");
        sbLIZ.append(linkMicAnchorGuideMessage.guideType);
        sbLIZ.append(", message: ");
        sbLIZ.append(linkMicAnchorGuideMessage);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!C944270agD.LLJLIL && (t = (c944270agD = this.LL).mView) != 0 && c944270agD.LLJI) {
            ((InterfaceC944250agB) t).Ht(linkMicAnchorGuideMessage);
        }
    }

    @Override // X.C944360agM, X.InterfaceC944670agr
    public final void It(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        CohostFollowMessage cohostFollowMessage = linkMicAnchorGuideMessage.cohostFollowMessage;
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null && cohostFollowMessage != null) {
            dataChannel.LC0(CoHostFollowPromptEvent.class, new C944450agV(cohostFollowMessage, linkMicAnchorGuideMessage.groupChannelId));
        }
    }

    @Override // X.C944360agM, X.InterfaceC944670agr
    public final void Jt(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        C954460awe c954460aweLLILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive anchor guide message, messageType = ");
        sbLIZ.append(linkMicAnchorGuideMessage.guideType);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C944270agD c944270agD = this.LL;
        if (c944270agD.mView != 0 && c944270agD.dataChannel != null && linkMicAnchorGuideMessage.user != null && C915980Zwa.LJII().LLI() != EnumC950120ape.Linked) {
            long id = linkMicAnchorGuideMessage.user.getId();
            if (this.LL.LLJ.getOwnerUserId() != id && (c954460aweLLILL = C915980Zwa.LJII().LLILL(id)) != null && !c954460aweLLILL.LJIIJJI.isEmpty() && this.LL.dataChannel != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("reconnecting cohost uid: ");
                sbLIZ2.append(c954460aweLLILL.LJ);
                sbLIZ2.append(" linkmicId: ");
                sbLIZ2.append(c954460aweLLILL.LJIIJJI);
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.dataChannel.LC0(MultiCoHostStreamStatsEvent.class, new C954240awI(EnumC956410azn.RECONNECTING, c954460aweLLILL.LJIIJJI));
            }
        }
    }

    @Override // X.C944360agM, X.InterfaceC490601vc
    public final void LJIILLIIL(LinkStateMessage linkStateMessage) {
        if (linkStateMessage.needAck == 1) {
            C944270agD c944270agD = this.LL;
            c944270agD.getClass();
            AckStateReq ackStateReq = new AckStateReq();
            StateReqCommon stateReqCommon = new StateReqCommon();
            stateReqCommon.scene = linkStateMessage.scene;
            stateReqCommon.channelId = linkStateMessage.channelId;
            stateReqCommon.appId = C915980Zwa.LIZJ().appId();
            stateReqCommon.liveId = C915980Zwa.LIZJ().liveId();
            stateReqCommon.myself = new Player(c944270agD.LLJ.getId(), UserService.getInstance().user().getCurrentUserId());
            ackStateReq.common = stateReqCommon;
            ackStateReq.msgId = linkStateMessage.getMessageId();
            ackStateReq.msgType = 1;
            ackStateReq.clientReceiveTime = C158B.LIZ();
            C480460Ism.LIZ().getClass();
            ((InterfaceC500100JjM) ((LinkStateApi) C480460Ism.LIZLLL(LinkStateApi.class)).sendMessageAckRx(ackStateReq).LIZLLL(c944270agD.autoDisposeWithTransformer())).LIZ(new C516201zk(linkStateMessage, 316), new C516201zk(linkStateMessage, 317));
        }
    }

    @Override // X.C944360agM, X.InterfaceC944500aga
    public final void LJJJJL(LinkMicAdMessage linkMicAdMessage) {
        if (!MultiGuestPlayAdSwitch.INSTANCE.getValue()) {
            return;
        }
        this.LL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAdStop message: ");
        sbLIZ.append(linkMicAdMessage);
        C1AZW.LJIIIIZZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestAdStopEvent.class);
        }
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LJLJJLL(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLD(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLIIJI(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLILL(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLJJLIIIJLLLLLLLZ(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
        C944270agD c944270agD = this.LL;
        C925150aBN.LJIIIZ((InterfaceC925160aBO) c944270agD.mView, c944270agD.dataChannel);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLLJL(LinkMessage linkMessage) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveAutoMatchMessage message = ");
        sbLIZ.append(linkMessage);
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        LinkerRandomMatchContent linkerRandomMatchContent = linkMessage.randomMatchContent;
        long id = 0;
        if (linkerRandomMatchContent.innerChannelId > 0) {
            i = 1;
        } else {
            i = 0;
        }
        String str = linkerRandomMatchContent.matchId;
        User user = linkerRandomMatchContent.user;
        if (user != null) {
            id = user.getId();
        }
        c958830b3hLIZ.getClass();
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "match_id", str, true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "rival_user_id", Long.valueOf(id), true);
        c958830b3hLIZ.LJIIL(Integer.valueOf(i), "is_cross_arc_active", true);
        c958830b3hLIZ.LJIJJLI("auto_match_msg_all");
    }

    @Override // X.C944360agM, X.InterfaceC944680ags
    public final void LLLLLLLLLL(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
        C944270agD c944270agD = this.LL;
        C925150aBN.LJIIL(linkMessage, (InterfaceC925160aBO) c944270agD.mView, c944270agD.dataChannel, c944270agD.LLJILJILJ);
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(LinkMicSettingMessageUpdatedEvent.class);
        }
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void LLZIL(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944670agr
    public final void Qs(LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        String strValueOf;
        C944270agD.LJJJJLI().LJIILJJIL(linkMicAnchorGuideMessage);
        User user = linkMicAnchorGuideMessage.user;
        if (user != null) {
            strValueOf = String.valueOf(user.getId());
        } else {
            strValueOf = "";
        }
        C955440ayE c955440ayE = new C955440ayE();
        c955440ayE.LJIIL(Integer.valueOf(linkMicAnchorGuideMessage.guideType), Scene.SCENE_SERVICE, true);
        c955440ayE.LJIJJLI("guide_message_receive");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive anchor guide message, reminding userId = ");
        sbLIZ.append(strValueOf);
        sbLIZ.append(", message: ");
        sbLIZ.append(linkMicAnchorGuideMessage);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.LJJJZ()) {
            return;
        }
        ((InterfaceC944250agB) this.LL.mView).Qs(linkMicAnchorGuideMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void R(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void S0(LinkMessage linkMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("link_finish_message = ");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZJ, linkMessage));
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        T t = this.LL.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC944250agB) t).Yq(linkMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944680ags
    public final void b(LinkMessage linkMessage) {
        LinkerEnterContent linkerEnterContent;
        C944270agD.LJJJJLI().LJIILJJIL(linkMessage);
        C944270agD c944270agD = this.LL;
        if (c944270agD.mView != 0 && !c944270agD.LLJI && linkMessage.LIZIZ() == C001L.AUDIENCE_LINKMIC && (linkerEnterContent = linkMessage.enterContent) != null) {
            List<ListUser> list = linkerEnterContent.listUsers;
            boolean z = true;
            if (list.size() == 1 && ((ListUser) ListProtector.get(list, 0)).user.getId() == this.LL.LLJ.getOwnerUserId()) {
                long j = linkMessage.enterContent.MultiLiveType;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("link_finish_message layoutType= ");
                sbLIZ.append(j);
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
                C944270agD c944270agD2 = this.LL;
                if (j != 1) {
                    z = false;
                }
                c944270agD2.LLJILJILJ = z;
                if (!z) {
                    Throwable th = new Throwable();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("not new multiguestV3+multilive, just skip ");
                    sbLIZ2.append(j);
                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
                    return;
                }
                C924810aAp.LJ().LJIILJJIL = ((ListUser) ListProtector.get(list, 0)).linkmicIdStr;
                C924660aAa.LIZJ = "others";
                ((InterfaceC944250agB) this.LL.mView).pF(EnumC925190aBR.AUDIENCE_OPEN);
            }
        }
    }

    @Override // X.C944360agM, X.InterfaceC944650agp
    public final void f(LinkMessage linkMessage) {
        LinkmicUserToastContent linkmicUserToastContent = linkMessage.userToastContent;
        if (linkmicUserToastContent == null) {
            return;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(linkmicUserToastContent.displayText, "");
        if ((!"pm_mt_cohost_toast_hostdc".equals(linkmicUserToastContent.displayText.key) || !((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).co0() || ((!C970370bMJ.LJ() && !C970370bMJ.LJIIIIZZ()) || linkmicUserToastContent.displayText == null)) && !TextUtils.isEmpty(spannableLJIILIIL)) {
            C766270U4b.LJIIJJI(spannableLJIILIIL.toString());
        }
    }

    @Override // X.C944360agM, X.InterfaceC944470agX
    public final void gd(CapsuleMessage capsuleMessage) {
        C944270agD.LJJJJLI().LJIILJJIL(capsuleMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveFriendGuide message = ");
        sbLIZ.append(capsuleMessage);
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C955440ayE c955440ayE = new C955440ayE();
        c955440ayE.LJJ(capsuleMessage);
        c955440ayE.LJIJJLI("capsule_message_receive");
        if (this.LL.LJJJZ() && LiveCoHostCapsuleMessageFilterVerifySetting.INSTANCE.isEnable()) {
            return;
        }
        ((InterfaceC944250agB) this.LL.mView).gd(capsuleMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944500aga
    public final void p0(LinkMicAdMessage linkMicAdMessage) {
        if (!MultiGuestPlayAdSwitch.INSTANCE.getValue()) {
            return;
        }
        this.LL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAdStart message: ");
        sbLIZ.append(linkMicAdMessage);
        C1AZW.LJIIIIZZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (linkMicAdMessage.linkAdContents.isEmpty()) {
            this.LL.getClass();
            C1AZW.LJIILJJIL("LinkControlPresenter", "linkAdContents is empty");
        } else {
            DataChannel dataChannel = this.LL.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestAdStartEvent.class, ListProtector.get(linkMicAdMessage.linkAdContents, 0));
            }
        }
    }

    @Override // X.C944360agM, X.InterfaceC944490agZ
    public final void q1(CohostReserveMessage cohostReserveMessage) {
        boolean zO1;
        long id;
        long j;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive cohost reserve message, message: ");
        sbLIZ.append(cohostReserveMessage);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (C944270agD.LLJLIL) {
            return;
        }
        C944270agD c944270agD = this.LL;
        if (c944270agD.mView == 0 || !c944270agD.LLJI || !(zO1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1())) {
            return;
        }
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null && dataChannel.gg0(C956710b0H.class) != null && Boolean.TRUE.equals(this.LL.dataChannel.gg0(C956710b0H.class))) {
            return;
        }
        long j2 = cohostReserveMessage.baseMessage.createTime;
        if (j2 < C955580ayS.LIZ || j2 < C955580ayS.LIZJ) {
            return;
        }
        C955580ayS.LIZ = System.currentTimeMillis();
        ReserveContent reserveContent = cohostReserveMessage.reserveContent;
        if (reserveContent != null) {
            C955580ayS.LIZIZ = reserveContent.redDotNum;
            User user2 = reserveContent.reserver;
            if (user2 != null) {
                C955400ayA.LJLJLJ(user2.getIdStr(), this.LL.LLJ, String.valueOf(cohostReserveMessage.reservationId), zO1);
            }
        }
        DataChannel dataChannel2 = this.LL.dataChannel;
        if (dataChannel2 != null && dataChannel2.gg0(C956770b0N.class) != null && Boolean.TRUE.equals(this.LL.dataChannel.gg0(C956770b0N.class))) {
            ReserveContent reserveContent2 = cohostReserveMessage.reserveContent;
            if (reserveContent2 != null && (user = reserveContent2.reserver) != null) {
                id = user.getId();
                j = cohostReserveMessage.timestamp;
            } else {
                id = 0;
                j = 0;
            }
            C916430ZxJ.LIZIZ(id, j);
            return;
        }
        ((InterfaceC944250agB) this.LL.mView).vA1(cohostReserveMessage);
    }

    @Override // X.C944360agM, X.InterfaceC944480agY
    public final void r0(CompetitionMessage competitionMessage) {
        int i;
        C982390bfh c982390bfhLIZ;
        long j;
        List<C982390bfh> list;
        C944270agD.LJJJJLI().LJIILJJIL(competitionMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive cohost competition message, messageType = ");
        sbLIZ.append(competitionMessage.type);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.mView == 0 || competitionMessage.type != 5) {
            return;
        }
        AbstractC982800bgM abstractC982800bgMLJII = C982440bfm.LJII(competitionMessage);
        if ((abstractC982800bgMLJII instanceof C982490bfr) && this.LL.dataChannel != null && !C915980Zwa.LJFF().xB0().isMatch()) {
            long j2 = abstractC982800bgMLJII.LIZJ.LIZJ;
            Boolean boolValueOf = Boolean.valueOf(C973910bS1.LIZ(j2));
            C982490bfr c982490bfr = (C982490bfr) abstractC982800bgMLJII;
            if (!c982490bfr.LJII.isCutshort()) {
                C20441214yg.LIZIZ("LinkControlPresenter_competition", "competition_post_MatchCutShortEvent, isCutshort=false, return");
                return;
            }
            if (boolValueOf != null && boolValueOf.booleanValue()) {
                C20441214yg.LIZIZ("LinkControlPresenter_competition", "competition_post_MatchCutShortEvent, had showed, return");
                return;
            }
            C973910bS1.LJ.put(Long.valueOf(j2), Boolean.TRUE);
            EnumC982500bfs enumC982500bfs = c982490bfr.LJI;
            CompetitionCommon competitionCommon = competitionMessage.bizCommon;
            if (competitionCommon != null) {
                i = competitionCommon.type;
            } else {
                i = -1;
            }
            if (enumC982500bfs == EnumC982500bfs.WIN) {
                C20441214yg.LIZIZ("LinkControlPresenter_competition", "competition_post_MatchCutShortEvent, now showed, show win result");
                this.LL.dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(-1, false, 1L, i));
                return;
            }
            if (enumC982500bfs == EnumC982500bfs.LOSE) {
                C20441214yg.LIZIZ("LinkControlPresenter_competition", "competition_post_MatchCutShortEvent, now showed, show lose result");
                Room room = this.LL.LLJ;
                if (room != null && (list = c982490bfr.LJFF) != null) {
                    c982390bfhLIZ = C975230bU9.LIZ(room.getOwnerUserId(), list);
                } else {
                    c982390bfhLIZ = null;
                }
                DataChannel dataChannel = this.LL.dataChannel;
                if (c982390bfhLIZ != null) {
                    j = c982390bfhLIZ.LIZJ;
                } else {
                    j = -1;
                }
                dataChannel.LC0(MatchCutShortEvent.class, new C948560an8(-1, true, j, i));
            }
        }
    }

    @Override // X.C944360agM, X.InterfaceC927660aFQ
    public final void r1(LinkmicAnimationMessage linkmicAnimationMessage) {
        ApplyAnimationContent applyAnimationContent;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveFriendsAnimationMessage LinkmicAnimationMessage = ");
        sbLIZ.append(linkmicAnimationMessage);
        C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiLiveAnimation.INSTANCE.enable() && (applyAnimationContent = linkmicAnimationMessage.applyAnimationContent) != null && applyAnimationContent.isDisplay) {
            UserService.getInstance().user().LJIIIIZZ(linkmicAnimationMessage.applyAnimationContent.userId).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS184S0100000_15(this, 212));
        }
    }
}
