package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSuggestUserTipsEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.BattleNoticeAnchorMatchSettings;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.MultiGuestPunishCenterActionMsg;
import com.bytedance.android.livesdk.model.message.MultiGuestSuggestMessage;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import webcast.im.NoticeboardReviewMessage;

/* JADX INFO: renamed from: X.0bnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987070bnF implements OnMessageListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        switch (this.$t) {
            case 0:
                onMessage$0(this, iMessage);
                break;
            case 1:
                onMessage$1(this, iMessage);
                break;
            case 2:
                onMessage$2(this, iMessage);
                break;
            case 3:
                onMessage$3(this, iMessage);
                break;
            case 4:
                onMessage$4(this, iMessage);
                break;
            case 5:
                onMessage$5(this, iMessage);
                break;
            case 6:
                onMessage$6(this, iMessage);
                break;
            case 7:
                onMessage$7(this, iMessage);
                break;
        }
    }

    public C987070bnF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onMessage$0(C987070bnF c987070bnF, IMessage iMessage) {
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if (iMessage != null && (iMessage instanceof LinkMessage)) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            if (linkMessage.messageType == 17 && (multiLiveUpdateUserSettingContent = linkMessage.multiLiveUpdateUserSettingContent) != null && (multiLiveAnchorPanelSettings = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings) != null) {
                ((C925010aB9) c987070bnF.l0).LIZJ(multiLiveAnchorPanelSettings, false);
            }
        }
    }

    public static final void onMessage$1(C987070bnF c987070bnF, IMessage iMessage) {
        String strM1 = ((LinkControlWidget) c987070bnF.l0).M1(414);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perception_onMessage message:");
        sbLIZ.append(iMessage);
        C1AZW.LJ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        if (iMessage instanceof MultiGuestPunishCenterActionMsg) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(3);
            LinkControlWidget linkControlWidget = (LinkControlWidget) c987070bnF.l0;
            if (linkControlWidget.LLJJJJJIL == null) {
                linkControlWidget.LLJJJJJIL = new C0KXA(linkControlWidget.dataChannel);
            }
            ((LinkControlWidget) c987070bnF.l0).LLJJJJJIL.LIZIZ(arrayList);
        }
    }

    public static final void onMessage$2(C987070bnF c987070bnF, IMessage iMessage) {
        if (iMessage instanceof MultiGuestSuggestMessage) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nk0(((C933510aOr) c987070bnF.l0).LL)) {
                ((C933510aOr) c987070bnF.l0).LL.LC0(MultiGuestAnchorSideShowGuidenceEvent.class, new C933460aOm(C930540aK4.LJIIJJI(), "", -1, true, ((MultiGuestSuggestMessage) iMessage).suggestedImage));
            } else {
                ((C933510aOr) c987070bnF.l0).LL.FQ2(MultiGuestSuggestUserTipsEvent.class);
            }
        }
    }

    public static final void onMessage$3(C987070bnF c987070bnF, IMessage iMessage) {
        if (iMessage instanceof LinkMicFanTicketMethod) {
            LinkMicFanTicketMethod linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage;
            ((C938210aWR) c987070bnF.l0).LIZLLL(linkMicFanTicketMethod.fanTicketRoomNotice, linkMicFanTicketMethod.baseMessage.createTime);
            ((C938210aWR) c987070bnF.l0).LJIIIIZZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onMessage$4(C987070bnF c987070bnF, IMessage iMessage) {
        Room room;
        long j;
        if (iMessage == 0) {
            C20441214yg.LIZIZ("MultiMatchAnchorPresent", "messageReceiver it == null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage, message = ");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZJ, iMessage));
        sbLIZ.append(", it = ");
        sbLIZ.append(iMessage);
        C20441214yg.LJIIIZ("MultiMatchAnchorPresent", C2188811AlT.LIZIZ(sbLIZ));
        if (iMessage instanceof BaseMessage) {
            if (((C974870bTZ) c987070bnF.l0).dataChannel == null) {
                C20441214yg.LIZIZ("MultiMatchAnchorPresent", "messageReceiver dataChannel == null");
                C974870bTZ c974870bTZ = (C974870bTZ) c987070bnF.l0;
                c974870bTZ.dataChannel = ((InterfaceC919320a1y) c974870bTZ.mView).provideDataChannel();
            }
            DataChannel dataChannel = ((C974870bTZ) c987070bnF.l0).dataChannel;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
            long j2 = 0;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            if (room != null) {
                j2 = room.nowTime;
            }
            if (j < j2) {
                C20441214yg.LJIIIZ("MultiMatchAnchorPresent", "onMessage, return message is old");
                return;
            }
        }
        if (iMessage instanceof LinkMicBattleMessage) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LinkMicBattleMessage, viewInterface");
            sbLIZ2.append(((C974870bTZ) c987070bnF.l0).mView.hashCode());
            C20441214yg.LIZIZ("MultiMatchAnchorPresent", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC974880bTa interfaceC974880bTa = (InterfaceC974880bTa) ((C974870bTZ) c987070bnF.l0).mView;
            if (interfaceC974880bTa != null) {
                interfaceC974880bTa.WH0((AbstractC1136060ffY) iMessage);
                return;
            }
            return;
        }
        if (iMessage instanceof CompetitionMessage) {
            InterfaceC974880bTa interfaceC974880bTa2 = (InterfaceC974880bTa) ((C974870bTZ) c987070bnF.l0).mView;
            if (interfaceC974880bTa2 == null) {
                return;
            }
            interfaceC974880bTa2.WH0((AbstractC1136060ffY) iMessage);
            return;
        }
        if (!(iMessage instanceof LinkMicBattleNoticeMessage)) {
            return;
        }
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) iMessage;
        if (linkMicBattleNoticeMessage.noticeType != 7) {
            return;
        }
        C978440bZK.LJIIIZ(((C974870bTZ) c987070bnF.l0).dataChannel, true, linkMicBattleNoticeMessage, null);
    }

    public static final void onMessage$5(C987070bnF c987070bnF, IMessage iMessage) {
        InterfaceC970770bMx interfaceC970770bMx;
        RoomLinkInfo linkMicInfo;
        long jLJJJJJL;
        boolean z;
        Map<Long, AnchorMatchSettings> mapLJII;
        AnchorMatchSettings anchorMatchSettings;
        User owner;
        Long lValueOf;
        String str = null;
        Long lValueOf2 = null;
        battleInfoResponse = null;
        BattleInfoResponse battleInfoResponse = null;
        if (iMessage instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) iMessage;
            int i = linkMicBattleMessage.action;
            if (i != 4) {
                if (i == 12) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive punish score update in audience presenter, currentBattleId=");
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null) {
                        lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ.append(lValueOf);
                    sbLIZ.append(", messageBattleId=");
                    sbLIZ.append(linkMicBattleMessage.battleId);
                    C20441214yg.LJIIIZ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel = ((C970750bMv) c987070bnF.l0).dataChannel;
                    InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf22 != null) {
                        lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
                    }
                    AnonymousClass0031.LIZ(linkMicBattleMessage, dataChannel, lValueOf2, "audience_presenter");
                    return;
                }
                return;
            }
            InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf23 != null) {
                interfaceC973730bRjYf23.LJJLIL(C158B.LIZ());
            }
            InterfaceC970770bMx interfaceC970770bMx2 = (InterfaceC970770bMx) ((C970750bMv) c987070bnF.l0).mView;
            if (interfaceC970770bMx2 == null) {
                return;
            }
            interfaceC970770bMx2.se(linkMicBattleMessage);
            return;
        }
        if (iMessage instanceof LinkMicBattleArmiesMessage) {
            InterfaceC970770bMx interfaceC970770bMx3 = (InterfaceC970770bMx) ((C970750bMv) c987070bnF.l0).mView;
            if (interfaceC970770bMx3 == null) {
                return;
            }
            interfaceC970770bMx3.Sa0((LinkMicBattleArmiesMessage) iMessage);
            return;
        }
        if (iMessage instanceof LinkMicBattleNoticeMessage) {
            LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) iMessage;
            int i2 = linkMicBattleNoticeMessage.noticeType;
            if (i2 != 7) {
                if (i2 != 8) {
                    return;
                }
                C970750bMv c970750bMv = (C970750bMv) c987070bnF.l0;
                DataChannel dataChannel2 = c970750bMv.dataChannel;
                Room room = c970750bMv.LLILLJJLI;
                if (room != null) {
                    room.getLinkMicInfo();
                }
                BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings = linkMicBattleNoticeMessage.anchorMatchSettingsNotice;
                if (battleNoticeAnchorMatchSettings == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleMatchAICommentaryAudienceNoticeMessage");
                    sbLIZ2.append(": anchorMatchSettingsNotice is null");
                    C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(false);
                long id = 0;
                if (interfaceC973730bRjYf24 != null) {
                    jLJJJJJL = interfaceC973730bRjYf24.LJJJJJL();
                } else {
                    jLJJJJJL = 0;
                }
                if (jLJJJJJL != battleNoticeAnchorMatchSettings.battleId) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handleMatchAICommentaryAudienceNoticeMessage");
                    sbLIZ3.append(": battleId does not match current battleId");
                    C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                if (!C915980Zwa.LJFF().co0()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handleMatchAICommentaryAudienceNoticeMessage");
                    sbLIZ4.append(": Not in match");
                    C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2);
                if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                    id = owner.getId();
                }
                for (Map.Entry<Long, Long> entry : battleNoticeAnchorMatchSettings.updatedSettings.entrySet()) {
                    long jLongValue = entry.getKey().longValue();
                    long jLongValue2 = entry.getValue().longValue();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("handleMatchAICommentaryAudienceNoticeMessage");
                    sbLIZ5.append(": handleMatchAICommentaryAudienceNoticeMessage: key: ");
                    sbLIZ5.append(jLongValue);
                    sbLIZ5.append(", value: ");
                    sbLIZ5.append(jLongValue2);
                    sbLIZ5.append(", currentRoomAnchorId: ");
                    sbLIZ5.append(id);
                    C20441214yg.LIZIZ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ5));
                    if (jLongValue == 5) {
                        if (jLongValue2 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        InterfaceC973730bRj interfaceC973730bRjYf25 = C915980Zwa.LJFF().yf2(false);
                        if (interfaceC973730bRjYf25 != null && (mapLJII = interfaceC973730bRjYf25.LJII()) != null && (anchorMatchSettings = mapLJII.get(Long.valueOf(id))) != null) {
                            anchorMatchSettings.enableAiCommentary = z;
                        }
                        C915980Zwa.LJ().iE1(z, dataChannel2, EnumC980470bcb.AUDIENCE_BATTLE_NOTICE_FROM_ANCHOR);
                        Text text = battleNoticeAnchorMatchSettings.displayText;
                        if (text != null && !z) {
                            C1133830fbx.LJIILIIL(text, text.defaultPattern).toString();
                        }
                    }
                }
                return;
            }
            C970750bMv c970750bMv2 = (C970750bMv) c987070bnF.l0;
            DataChannel dataChannel3 = c970750bMv2.dataChannel;
            Room room2 = c970750bMv2.LLILLJJLI;
            if (room2 != null && (linkMicInfo = room2.getLinkMicInfo()) != null) {
                battleInfoResponse = linkMicInfo.battleInfo;
            }
            C978440bZK.LJIIIZ(dataChannel3, false, linkMicBattleNoticeMessage, battleInfoResponse);
            return;
        }
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (perceptionMessage.getMessageType() != C001A.PERCEPTION_MESSAGE) {
                return;
            }
            Text text2 = perceptionMessage.toast;
            if (text2 != null) {
                str = text2.defaultPattern;
            }
            C766270U4b.LJIIJJI(C1133830fbx.LJIILIIL(text2, str).toString());
            return;
        }
        if (!(iMessage instanceof CompetitionMessage)) {
            return;
        }
        CompetitionMessage competitionMessage = (CompetitionMessage) iMessage;
        if (competitionMessage.type != EnumC982520bfu.START.getType() || (interfaceC970770bMx = (InterfaceC970770bMx) ((C970750bMv) c987070bnF.l0).mView) == null) {
            return;
        }
        interfaceC970770bMx.J32(competitionMessage);
    }

    public static final void onMessage$6(C987070bnF c987070bnF, IMessage iMessage) {
        NoticeboardReviewMessage noticeboardReviewMessage;
        C19489311Mt<Unit> c19489311Mt;
        C19489311Mt<Unit> c19489311Mt2;
        C953710avR c953710avR;
        if ((iMessage instanceof NoticeboardReviewMessage) && (noticeboardReviewMessage = (NoticeboardReviewMessage) iMessage) != null) {
            C953610avH c953610avH = (C953610avH) c987070bnF.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NoticeboardReviewMessage received messageType=");
            sbLIZ.append(noticeboardReviewMessage.messageType);
            C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
            int i = noticeboardReviewMessage.messageType;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C953720avS c953720avS = (C953720avS) c953610avH.LJIILJJIL.getValue();
                        NoticeboardReviewMessage noticeboardReviewMessage2 = (NoticeboardReviewMessage) iMessage;
                        c953720avS.getClass();
                        C953230auf.LIZ.getClass();
                        if (C953230auf.LJIIJJI() && (c953710avR = c953720avS.LIZ.get(Long.valueOf(noticeboardReviewMessage2.templateId))) != null) {
                            if (noticeboardReviewMessage2.preReviewStatus == 1) {
                                Iterator<WeakReference<InterfaceC917550Zz7>> it2 = c953710avR.LIZ.iterator();
                                while (it2.hasNext()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("updateReviewStatusForOfficialTemplate, templateId: ");
                                    sbLIZ2.append(noticeboardReviewMessage2.templateId);
                                    sbLIZ2.append(", officialMaterialType: ");
                                    sbLIZ2.append(noticeboardReviewMessage2.officialMaterialType);
                                    sbLIZ2.append(", mediaNodeId: ");
                                    sbLIZ2.append(noticeboardReviewMessage2.mediaNodeId);
                                    C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
                                    InterfaceC917550Zz7 interfaceC917550Zz7 = it2.next().get();
                                    if (interfaceC917550Zz7 != null) {
                                        interfaceC917550Zz7.LIZIZ(new C916750Zxp(noticeboardReviewMessage2.officialMaterialType, noticeboardReviewMessage2.templateId, noticeboardReviewMessage2.mediaNodeId));
                                    }
                                }
                                c953710avR.LIZ.clear();
                                return;
                            }
                            Iterator<WeakReference<InterfaceC917550Zz7>> it3 = c953710avR.LIZ.iterator();
                            while (it3.hasNext()) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("updateReviewStatusForOfficialTemplate fail, templateId: ");
                                sbLIZ3.append(noticeboardReviewMessage2.templateId);
                                sbLIZ3.append(", officialMaterialType: ");
                                sbLIZ3.append(noticeboardReviewMessage2.officialMaterialType);
                                sbLIZ3.append(", mediaNodeId: ");
                                sbLIZ3.append(noticeboardReviewMessage2.mediaNodeId);
                                C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ3));
                                InterfaceC917550Zz7 interfaceC917550Zz72 = it3.next().get();
                                if (interfaceC917550Zz72 != null) {
                                    interfaceC917550Zz72.LJ(new C916750Zxp(noticeboardReviewMessage2.officialMaterialType, noticeboardReviewMessage2.templateId, noticeboardReviewMessage2.mediaNodeId), EnumC953170auZ.REVIEW_NOT_PASSED, null);
                                }
                            }
                            c953710avR.LIZ.clear();
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap<String, C953660avM> map = c953610avH.LJ;
                NoticeboardReviewMessage noticeboardReviewMessage3 = (NoticeboardReviewMessage) iMessage;
                String str = noticeboardReviewMessage3.mediaNodeId;
                int i2 = noticeboardReviewMessage3.preReviewStatus;
                C953660avM c953660avM = map.get(str);
                if (c953660avM != null) {
                    if (i2 == 1) {
                        Iterator<WeakReference<InterfaceC917550Zz7>> it4 = c953660avM.LJFF.iterator();
                        while (it4.hasNext()) {
                            InterfaceC917550Zz7 interfaceC917550Zz73 = it4.next().get();
                            if (interfaceC917550Zz73 != null) {
                                interfaceC917550Zz73.LIZIZ(new C916750Zxp(2, 0L, str));
                            }
                        }
                        c953660avM.LJFF.clear();
                        C953660avM c953660avM2 = map.get(str);
                        if (c953660avM2 != null && (c19489311Mt2 = c953660avM2.LJI) != null) {
                            c19489311Mt2.onSuccess(Unit.LIZ);
                            return;
                        }
                        return;
                    }
                    Iterator<WeakReference<InterfaceC917550Zz7>> it5 = c953660avM.LJFF.iterator();
                    while (it5.hasNext()) {
                        InterfaceC917550Zz7 interfaceC917550Zz74 = it5.next().get();
                        if (interfaceC917550Zz74 != null) {
                            interfaceC917550Zz74.LJ(new C916750Zxp(2, 0L, str), EnumC953170auZ.REVIEW_NOT_PASSED, null);
                        }
                    }
                    c953660avM.LJFF.clear();
                    C953660avM c953660avM3 = map.get(str);
                    if (c953660avM3 != null && (c19489311Mt = c953660avM3.LJI) != null) {
                        c19489311Mt.onError(new RuntimeException("Fail to passed"));
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = noticeboardReviewMessage.postReviewStatus;
            if (i3 == 20 || i3 == 30) {
                C953760avW.LIZIZ.LIZ().LJIJ(Collections.singletonList(new Pair(noticeboardReviewMessage.mediaNodeId, Integer.valueOf(noticeboardReviewMessage.postReviewStatus))));
            }
        }
    }

    public static final void onMessage$7(C987070bnF c987070bnF, IMessage iMessage) {
        long j;
        String str;
        List<UserFanTicket> list;
        AbstractC928510aGn abstractC928510aGnLIZ;
        Map<Long, Long> mapLJJIIZI;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List<LinkListUser> listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        Map<Long, Long> mapLJJIIZI2;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        List<LinkPlayerInfo> listLJJIII2;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent;
        if (iMessage instanceof LinkMicFanTicketMethod) {
            LinkMicFanTicketMethod linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage;
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = linkMicFanTicketMethod.fanTicketRoomNotice;
            long j2 = 0;
            if (fanTicketRoomNoticeContent2 != null) {
                j = fanTicketRoomNoticeContent2.version;
            } else {
                j = 0;
            }
            AbstractC938650aX9 abstractC938650aX9 = (AbstractC938650aX9) c987070bnF.l0;
            LinkMicFanTicketMethod linkMicFanTicketMethod2 = abstractC938650aX9.LJIILJJIL;
            if (linkMicFanTicketMethod2 != null && (fanTicketRoomNoticeContent = linkMicFanTicketMethod2.fanTicketRoomNotice) != null) {
                j2 = fanTicketRoomNoticeContent.version;
            }
            if (j > j2) {
                MutableLiveData<String> mutableLiveDataLJIIIIZZ = abstractC938650aX9.LJIIIIZZ();
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent3 = linkMicFanTicketMethod.fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent3 != null) {
                    str = fanTicketRoomNoticeContent3.fanTicketIconUrl;
                } else {
                    str = null;
                }
                AbstractC938650aX9.LJIILJJIL(mutableLiveDataLJIIIIZZ, str);
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent4 = linkMicFanTicketMethod.fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent4 != null && (list = fanTicketRoomNoticeContent4.userFanTicket) != null) {
                    AbstractC938650aX9 abstractC938650aX92 = (AbstractC938650aX9) c987070bnF.l0;
                    for (UserFanTicket userFanTicket : list) {
                        if (C930540aK4.LIZJ()) {
                            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ4 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ4.LJJIII()) != null) {
                                for (LinkPlayerInfo linkPlayerInfo : listLJJIII2) {
                                    User user = linkPlayerInfo.mUser;
                                    if (user != null && user.getId() == userFanTicket.userId) {
                                        linkPlayerInfo.mFanTicket = userFanTicket.fanTicket;
                                    }
                                }
                            }
                            InterfaceC302401Fe interfaceC302401Fe2 = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                            if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ3 = interfaceC302401Fe2.LIZ()) != null && (mapLJJIIZI2 = abstractC928510aGnLIZ3.LJJIIZI()) != null) {
                                mapLJJIIZI2.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                            }
                        } else {
                            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                            if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ2.LJJIII()) != null) {
                                for (LinkListUser linkListUser : listLJJIII) {
                                    User user2 = linkListUser.user;
                                    if (user2 != null && user2.getId() == userFanTicket.userId) {
                                        linkListUser.fanTicket = userFanTicket.fanTicket;
                                    }
                                }
                            }
                            InterfaceC917640ZzG interfaceC917640ZzG2 = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                            if (interfaceC917640ZzG2 != null && (abstractC928510aGnLIZ = interfaceC917640ZzG2.LIZ()) != null && (mapLJJIIZI = abstractC928510aGnLIZ.LJJIIZI()) != null) {
                                mapLJJIIZI.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                            }
                        }
                        C939680aYo value = abstractC938650aX92.LJI().getValue();
                        if (value != null && userFanTicket.userId == value.LIZ) {
                            AbstractC938650aX9.LJIILJJIL(abstractC938650aX92.LJII(), Long.valueOf(userFanTicket.fanTicket));
                        }
                    }
                }
                ((AbstractC938650aX9) c987070bnF.l0).LJIILJJIL = linkMicFanTicketMethod;
            }
        }
    }
}
