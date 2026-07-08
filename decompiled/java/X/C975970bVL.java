package X;

import Y.ARunnableS84S0200000_15;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchSourceChannel;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyArmiesMessageBlockSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMockRematchRecommendPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.BattleAICommentaryMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS3S0101200_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C975970bVL extends C975800bV4<InterfaceC976360bVy> implements InterfaceC975720bUw {
    public final BattleInfoResponse LJI;
    public C975960bVK LJII;
    public boolean LJIIIIZZ;
    public C974530bT1 LJIIIZ;
    public final BPEAHandler LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final ARunnableS84S0200000_15 LJIILJJIL;

    public static int LJJJJL() {
        return LiveMatchDropOffSetting.INSTANCE.isEnable() ? 2 : 3;
    }

    public final long LJJIJLIJ() {
        long jMax;
        C975960bVK c975960bVK = this.LJII;
        BattleSetting battleSetting = c975960bVK != null ? c975960bVK.LJII : null;
        if (battleSetting == null) {
            C20441214yg.LJ("MultiMatchStateMatching", "getMatchModel setting is null ");
            jMax = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            long jLIZ = MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled() ? C974520bT0.LIZ() : C158B.LIZIZ();
            if (jLIZ <= 0) {
                jLIZ = System.currentTimeMillis();
            }
            jMax = ((long) battleSetting.duration) - (Math.max(0L, jLIZ - battleSetting.startTimeMs) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMatchRemainSecond, remainSecond  = ");
        sbLIZ.append(jMax);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        return jMax;
    }

    public final void LJJJJJ() {
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 844);
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 870);
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            interfaceC976360bVy.LJJIJIIJI(interfaceC975520bUc != null ? interfaceC975520bUc.d3() : false, awS559S0100000_15, awS594S0100000_15);
        }
    }

    public final void LJJJJJL() {
        if (C963580bBM.LIZ() && C970370bMJ.LJ()) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 != null) {
                c955010axXI30.LJJI(C957840b26.LIZJ);
                return;
            }
            return;
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if ((interfaceC975520bUc != null ? interfaceC975520bUc.LJIIIZ() : null) != EnumC919170a1j.MATCH_TYPE_2V2) {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if ((interfaceC975520bUc2 != null ? interfaceC975520bUc2.LJIIIZ() : null) != EnumC919170a1j.MATCH_TYPE_1VN) {
                return;
            }
        }
        C01GW c01gw = C958050b2R.LIZ;
        C975960bVK c975960bVK = this.LJII;
        C958050b2R.LIZ(0L, c975960bVK != null ? c975960bVK.LJIIJJI : null);
    }

    public static Map LJJIJIIJIL(LinkMicBattleMessage linkMicBattleMessage) {
        List<UserArmiesWrapper> list;
        HashMap map = new HashMap();
        if (C970370bMJ.LJIIJ() && (list = linkMicBattleMessage.armies) != null) {
            for (UserArmiesWrapper userArmiesWrapper : list) {
                Long l = userArmiesWrapper.userId;
                if (l != null && userArmiesWrapper.userArmies != null) {
                    long jLongValue = l.longValue();
                    BattleUserArmies battleUserArmies = userArmiesWrapper.userArmies;
                    if (battleUserArmies != null) {
                        map.put(Long.valueOf(jLongValue), battleUserArmies);
                    }
                }
            }
        }
        return map;
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        DataChannel dataChannel;
        C975960bVK c975960bVKM3;
        RecommendedPlaybookInfo recommendedPlaybookInfo;
        C954460awe c954460awe;
        EnumC964170bCJ enumC964170bCJY2;
        boolean z;
        ArrayList<TeamUsersInfo> arrayList;
        DataChannel dataChannel2;
        Long l;
        String str;
        List<Long> list;
        DataChannel dataChannel3;
        List<? extends TeamUsersInfo> list2;
        C954460awe next;
        Boolean boolValueOf = null;
        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
            int i = linkMicBattleMessage.action;
            if (i != 5) {
                switch (i) {
                    case 8:
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        JSONObject jSONObject = new JSONObject();
                        C974540bT2.LJIJ(linkMicBattleMessage, jSONObject);
                        C0K04.LJ("battle_id", linkMicBattleMessage.battleId, jSONObject);
                        C974540bT2.LJIJJLI(jSONObject, false);
                        c974540bT2.LLIIIJ("quit_message", jSONObject, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
                        if (C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                            long j = linkMicBattleMessage.actionByUserId;
                            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                            if (listLLILZLL != null) {
                                Iterator<C954460awe> it2 = listLLILZLL.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (next.LJ == j) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                c954460awe = next;
                            } else {
                                c954460awe = null;
                            }
                            InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
                            if (interfaceC976360bVy != null) {
                                interfaceC976360bVy.LJJII(c954460awe, new AwS381S0200000_15(this, linkMicBattleMessage, 114));
                            }
                            C974540bT2 c974540bT22 = C974540bT2.LIZ;
                            JSONObject jSONObject2 = new JSONObject();
                            C974540bT2.LJIJJLI(jSONObject2, false);
                            c974540bT22.LLIIIJ("quit_panel_show", jSONObject2, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
                            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                            if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
                                enumC964170bCJY2 = EnumC964170bCJ.NONE;
                            }
                            if ((EnumC964170bCJ.MATCH_START.compareTo(enumC964170bCJY2) <= 0 && enumC964170bCJY2.compareTo(EnumC964170bCJ.SETTLE_START) < 0) || EnumC964170bCJ.PUNISH_START.compareTo(enumC964170bCJY2) > 0 || enumC964170bCJY2.compareTo(EnumC964170bCJ.DRAW) >= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            C975960bVK c975960bVK = this.LJII;
                            if (c975960bVK != null && (list2 = c975960bVK.LJJIJ) != null) {
                                arrayList = new ArrayList(list2);
                            } else {
                                arrayList = null;
                            }
                            if (!z) {
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                if (interfaceC975520bUc2 != null && (dataChannel3 = interfaceC975520bUc2.getDataChannel()) != null) {
                                    dataChannel3.gg0(BattleTimeLeftChannel.class);
                                }
                                LiveInteractBattleDurationSetting.INSTANCE.getValue();
                            } else {
                                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                if (interfaceC975520bUc3 != null && (dataChannel2 = interfaceC975520bUc3.getDataChannel()) != null && (l = (Long) dataChannel2.gg0(BattlePunishTimeLeftChannel.class)) != null) {
                                    l.longValue();
                                }
                                LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                            }
                            C973660bRc c973660bRc = C973660bRc.LIZ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
                            C973660bRc.LJJIIJZLJL(linkedHashMap);
                            C973660bRc.LJJIJ(arrayList, linkedHashMap);
                            C973660bRc.LJIL(c973660bRc, linkedHashMap, true, 12);
                            C973660bRc.LJII(linkedHashMap, false);
                            linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
                            if (!z) {
                                str = "disconnect_pk";
                            } else {
                                str = "disconnect_punish";
                            }
                            linkedHashMap.put("request_type", str);
                            C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
                            String str2 = C973660bRc.LJJIIZI;
                            Object obj = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str2);
                            Object obj2 = "";
                            if (obj == null) {
                                obj = "";
                            }
                            linkedHashMap.put(str2, obj);
                            if (arrayList != null) {
                                for (TeamUsersInfo teamUsersInfo : arrayList) {
                                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                                    if (interfaceC973730bRjYf2 != null && teamUsersInfo.teamId == interfaceC973730bRjYf2.LJJJJJ() && (list = teamUsersInfo.userIds) != null) {
                                        for (Long l2 : list) {
                                            C973660bRc c973660bRc2 = C973660bRc.LIZ;
                                            long jLJJIJLIJ = C973660bRc.LJJIJLIJ();
                                            if (l2 != null && l2.longValue() == jLJJIJLIJ) {
                                                linkedHashMap.put(C973660bRc.LJJI, String.valueOf(C973660bRc.LJJIJLIJ()));
                                            } else {
                                                linkedHashMap.put(C973660bRc.LJJ, l2.toString());
                                            }
                                        }
                                    }
                                }
                            }
                            String str3 = C973660bRc.LJJ;
                            Object obj3 = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str3);
                            if (obj3 != null) {
                                obj2 = obj3;
                            }
                            linkedHashMap.put(str3, obj2);
                            C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
                            String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
                            if (strLIZIZ == null) {
                                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                                int size = C915980Zwa.LJII().LLILZLL(true).size();
                                c917350Zyn.getClass();
                                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
                            }
                            C973710bRh.LIZ(linkedHashMap);
                            C973660bRc.LJZ(c973660bRc, "livesdk_pk_disconnect_received", linkedHashMap, strLIZIZ);
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        LJJIL(linkMicBattleMessage, false);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        LJJIL(linkMicBattleMessage, true);
                        break;
                }
            } else {
                MatchPunishExtraInfo matchPunishExtraInfo = linkMicBattleMessage.matchPunishExtraInfo;
                if (matchPunishExtraInfo != null) {
                    recommendedPlaybookInfo = matchPunishExtraInfo.recommendedPlaybookInfo;
                } else {
                    recommendedPlaybookInfo = null;
                }
                RecommendedPlaybookInfo mockInfo = LiveMockRematchRecommendPlaybookIdSetting.INSTANCE.getMockInfo();
                if (mockInfo == null) {
                    mockInfo = recommendedPlaybookInfo;
                }
                C978340bZA.LIZIZ = mockInfo;
                C978340bZA.LIZ = mockInfo;
                if (recommendedPlaybookInfo != null) {
                    C978340bZA.LIZJ = null;
                    C978340bZA.LIZ(AFwS250S0000000_15.get$arr$(202));
                }
            }
        }
        if (abstractC1136060ffY instanceof LinkMicBattleArmiesMessage) {
            LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = (LinkMicBattleArmiesMessage) abstractC1136060ffY;
            InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
            long jLJJJJJL = 0;
            if ((interfaceC975520bUc4 != null && (c975960bVKM3 = interfaceC975520bUc4.m3()) != null && c975960bVKM3.LJ == 0) || C976040bVS.LJIIJ(this, linkMicBattleArmiesMessage.battleId)) {
                C20441214yg.LIZIZ("MultiMatchStateMatching", "onArmies Message");
                if (linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.OPT_OUT_UPDATE.getValue()) {
                    List list3 = linkMicBattleArmiesMessage.teamArmies;
                    if (list3 == null) {
                        list3 = C13BV.INSTANCE;
                    }
                    C976060bVU.LIZIZ(this, list3, linkMicBattleArmiesMessage.armies, linkMicBattleArmiesMessage.fromUserId, linkMicBattleArmiesMessage.giftId, false, 16);
                    LJIJJ(linkMicBattleArmiesMessage.enigmaBattleExtraInfo);
                } else if (LiveCoHostIcyArmiesMessageBlockSetting.INSTANCE.isEnable() && linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.UPDATE_EFFECT.getValue()) {
                    C20441214yg.LIZIZ("MultiMatchStateMatching", "only update effect when triggerReason=UPDATE_EFFECT(5)");
                } else if (this.LIZ == EnumC964170bCJ.MATCH_START) {
                    C975960bVK c975960bVK2 = this.LJII;
                    if (c975960bVK2 == null || c975960bVK2.LJIJJ == null) {
                        new LinkedHashMap();
                    }
                    this.LJIIIZ = new C974530bT1(linkMicBattleArmiesMessage.baseMessage.createTime, linkMicBattleArmiesMessage.logId, linkMicBattleArmiesMessage.getMessageId());
                    List list4 = linkMicBattleArmiesMessage.teamArmies;
                    if (list4 == null) {
                        list4 = C13BV.INSTANCE;
                    }
                    C976060bVU.LIZIZ(this, list4, linkMicBattleArmiesMessage.armies, linkMicBattleArmiesMessage.fromUserId, linkMicBattleArmiesMessage.giftId, false, 16);
                    LJIJJ(linkMicBattleArmiesMessage.enigmaBattleExtraInfo);
                }
            } else {
                C974540bT2 c974540bT23 = C974540bT2.LIZ;
                JSONObject jSONObject3 = new JSONObject();
                C0K04.LJ("battle_id", linkMicBattleArmiesMessage.battleId, jSONObject3);
                InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf22 != null) {
                    jLJJJJJL = interfaceC973730bRjYf22.LJJJJJL();
                }
                C0K04.LJ("current_battle_id", jLJJJJJL, jSONObject3);
                C0K04.LJFF("sub_type", "battle_id_invalid", jSONObject3);
                c974540bT23.LLIIIJ("score_not_add_issue", jSONObject3, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
            }
        }
        if (abstractC1136060ffY instanceof BattleAICommentaryMessage) {
            BattleAICommentaryMessage battleAICommentaryMessage = (BattleAICommentaryMessage) abstractC1136060ffY;
            InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
            if (interfaceC975520bUc5 != null) {
                boolValueOf = Boolean.valueOf(interfaceC975520bUc5.isAnchor());
            }
            boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
            InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
            if (interfaceC975520bUc6 != null && (dataChannel = interfaceC975520bUc6.getDataChannel()) != null) {
                C976160bVe c976160bVe = C976160bVe.LIZ;
                synchronized (c976160bVe) {
                    C973720bRi c973720bRi = new C973720bRi(battleAICommentaryMessage, dataChannel, zLIZIZ);
                    c973720bRi.LJIIJ = C974520bT0.LIZ();
                    c973720bRi.LJIIIZ = battleAICommentaryMessage.baseMessage.createTime;
                    boolean zLIZIZ2 = C976160bVe.LIZIZ(c973720bRi);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addMessage: queue.size ");
                    LinkedList<C973720bRi> linkedList = C976160bVe.LIZIZ;
                    sbLIZ.append(linkedList.size());
                    sbLIZ.append(" isConsuming: ");
                    sbLIZ.append(C976160bVe.LIZJ);
                    sbLIZ.append(", isAnchor ");
                    sbLIZ.append(zLIZIZ);
                    sbLIZ.append(", isMessageValid ");
                    sbLIZ.append(zLIZIZ2);
                    C20441214yg.LIZIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (!zLIZIZ2) {
                        return;
                    }
                    if (!linkedList.isEmpty()) {
                        C973720bRi c973720bRiPoll = linkedList.poll();
                        if (c973720bRiPoll != null) {
                            C973660bRc.LIZ.LJJJJI("block", c973720bRiPoll, true, "discard", null);
                        }
                        linkedList.clear();
                    }
                    linkedList.offer(c973720bRi);
                    c976160bVe.LIZ();
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAICommentaryMessage: data channel is null isAnchor ");
            sbLIZ2.append(zLIZIZ);
            C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC975690bUt
    public void LJI(EnumC975850bV9 enumC975850bV9) {
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJFF();
        }
        this.LJIIJ.removeCallbacks(this.LJIILJJIL);
    }

    public final void LJJIJIIJI(EnumC975850bV9 enumC975850bV9) {
        EnumC964170bCJ enumC964170bCJY2;
        List<? extends TeamUsersInfo> list;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        List<? extends TeamUsersInfo> list2;
        Room roomInfo;
        EnumC919170a1j enumC919170a1jLJIIIZ2;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            enumC964170bCJY2 = interfaceC975520bUc.Y2();
        } else {
            enumC964170bCJY2 = null;
        }
        if (enumC964170bCJY2 == EnumC964170bCJ.MATCH_END) {
            return;
        }
        String str = "cut_short";
        if (!a0.LJJIIZI(enumC975850bV9.getSource(), "cut_short", false) && !a0.LJJIIZI(enumC975850bV9.getSource(), "list_change", false)) {
            str = "normal";
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LLIIII(str, true);
        boolean zLJII = C970370bMJ.LJII();
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            list = c975960bVK.LJJIJ;
        } else {
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matching_end_");
        sbLIZ.append(enumC975850bV9.getSource());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc2.LJIIIZ()) == null) {
            enumC919170a1jLJIIIZ = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
        }
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c917350Zyn.getClass();
        String strLIZIZ2 = C917350Zyn.LIZIZ(enumC919170a1jLJIIIZ, size);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        c973660bRc.LJJJLIIL(strLIZIZ2, strLIZIZ, list, zLJII, false);
        boolean zLJII2 = C970370bMJ.LJII();
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null) {
            list2 = c975960bVK2.LJJIJ;
        } else {
            list2 = null;
        }
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null) {
            roomInfo = interfaceC975520bUc3.getRoomInfo();
        } else {
            roomInfo = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("matching_");
        sbLIZ2.append(enumC975850bV9.getSource());
        c973660bRc.LJJJJZ(zLJII2, list2, null, roomInfo, C2188811AlT.LIZIZ(sbLIZ2));
        C955400ayA.LJJJJIZL();
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIIJ(enumC975850bV9.getSource());
        String source = enumC975850bV9.getSource();
        InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
        if (interfaceC975520bUc4 == null || (enumC919170a1jLJIIIZ2 = interfaceC975520bUc4.LJIIIZ()) == null) {
            enumC919170a1jLJIIIZ2 = EnumC919170a1j.MATCH_TYPE_1VN;
        }
        C974540bT2.LLD(source, enumC919170a1jLJIIIZ2);
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJFF();
        }
        C975800bV4.LJJII(this, null, enumC975850bV9, 3);
    }

    public final boolean LJJJI(Long l) {
        C975960bVK c975960bVK;
        MutableLiveData<List<C976480bWA>> mutableLiveData;
        List<C976480bWA> value;
        C976480bWA next;
        List<C976800bWg> list;
        if (l == null || l.longValue() == 0 || (c975960bVK = this.LJII) == null || (mutableLiveData = c975960bVK.LJJJLIIL) == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        Iterator<C976480bWA> it2 = value.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C976480bWA c976480bWA = next;
        if (c976480bWA == null || (list = c976480bWA.LJFF) == null || ((ArrayList) list).size() != 1) {
            return false;
        }
        return true;
    }

    public final void LJJJIL(int i) {
        List<? extends TeamUsersInfo> list;
        boolean zLJII = C970370bMJ.LJII();
        C975960bVK c975960bVK = this.LJII;
        List<? extends TeamUsersInfo> list2 = null;
        if (c975960bVK != null) {
            list = c975960bVK.LJJIJ;
        } else {
            list = null;
        }
        C973670bRd.LIZ(i, zLJII, list);
        boolean zLJII2 = C970370bMJ.LJII();
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null) {
            list2 = c975960bVK2.LJJIJ;
        }
        C973660bRc.LIZ.LJLJI(i, zLJII2, true, list2);
    }

    public final void LJJJJ(EnumC975850bV9 enumC975850bV9) {
        Boolean boolValueOf;
        EnumC964170bCJ enumC964170bCJY2;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null) {
                enumC964170bCJY2 = interfaceC975520bUc2.Y2();
            } else {
                enumC964170bCJY2 = null;
            }
            if (enumC964170bCJY2 == EnumC964170bCJ.MATCH_START) {
                LJIJ(EnumC964170bCJ.SETTLE_START, enumC975850bV9, null, null);
            }
        }
    }

    public final void LJJJJI(Integer num) {
        if (num != null) {
            num.intValue();
            InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
            if (interfaceC976360bVy != null) {
                interfaceC976360bVy.LJII(num.intValue());
            }
        }
    }

    public final void LJJJJIZL(String str) {
        DataChannel dataChannel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishLynxMatchData triggerMessage = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" battle info = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("suzhexundebug", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.zW(LynxMatchSourceChannel.class, new C963590bBN(this.LIZLLL, this.LJI));
        }
    }

    public final void LJJJJLI(LinkMicBattleMessage linkMicBattleMessage) {
        Long lValueOf;
        Integer numValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Integer numValueOf2 = Integer.valueOf(linkMicBattleMessage.battleSetting.inviteType);
        Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
        Map<Long, LeagueScoreInfo> map2 = linkMicBattleMessage.leagueScoreInfoMap;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            lValueOf = Long.valueOf(battleSetting.extraDurationSecond);
        } else {
            lValueOf = null;
        }
        BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
        if (battleSetting2 != null) {
            numValueOf = Integer.valueOf(battleSetting2.battleType);
        } else {
            numValueOf = null;
        }
        BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
        if (battleSetting3 != null) {
            lValueOf2 = Long.valueOf(battleSetting3.channelId);
        } else {
            lValueOf2 = null;
        }
        BattleSetting battleSetting4 = linkMicBattleMessage.battleSetting;
        if (battleSetting4 != null) {
            lValueOf3 = Long.valueOf(battleSetting4.startTimeMs);
        } else {
            lValueOf3 = null;
        }
        LJJJJLL(numValueOf2, map, map2, linkMicBattleMessage, null, lValueOf, numValueOf, lValueOf2, lValueOf3);
    }

    @Override // X.InterfaceC975720bUw
    public final void g3(C975960bVK c975960bVK) {
        this.LJII = c975960bVK;
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void h3(String str) {
        Boolean boolValueOf;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.isAnchor());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            return;
        }
        super.h3(str);
        LJJJJJ();
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public void LJFF(long j, String str) {
        EnumC919170a1j enumC919170a1jLJIIIZ;
        long jLJLILLLLZI;
        List<C954460awe> list;
        Long lValueOf;
        C975960bVK c975960bVK;
        C975990bVN c975990bVN;
        Room roomInfo;
        User owner;
        Boolean boolValueOf;
        List<Long> list2;
        C975990bVN c975990bVN2;
        EnumC919170a1j enumC919170a1jLJIIIZ2;
        EnumC919170a1j enumC919170a1jLJIIIZ3;
        C975990bVN c975990bVN3;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ();
        } else {
            enumC919170a1jLJIIIZ = null;
        }
        long id = 0;
        if (enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_1V1) {
            C975960bVK c975960bVK2 = this.LJII;
            if (c975960bVK2 != null) {
                jLJLILLLLZI = c975960bVK2.LJLILLLLZI();
            } else {
                jLJLILLLLZI = 0;
            }
        } else {
            C975960bVK c975960bVK3 = this.LJII;
            if (c975960bVK3 != null && (list = c975960bVK3.LJJJLL) != null) {
                jLJLILLLLZI = 0;
                for (C954460awe c954460awe : list) {
                    if (Intrinsics.LJFF(c954460awe.LJIIJJI, str)) {
                        jLJLILLLLZI = c954460awe.LJ;
                    }
                }
            } else {
                jLJLILLLLZI = 0;
            }
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C975960bVK c975960bVK4 = this.LJII;
        if (c975960bVK4 != null && (c975990bVN3 = c975960bVK4.LJJJLZIJ) != null) {
            lValueOf = Long.valueOf(c975990bVN3.LIZLLL(Long.valueOf(jLJLILLLLZI)));
        } else {
            lValueOf = null;
        }
        boolean zLJJJI = LJJJI(lValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft , leaveReason = ");
        sbLIZ.append(j);
        sbLIZ.append(" , leaveUid =- ");
        sbLIZ.append(jLJLILLLLZI);
        sbLIZ.append(", belongTeam = ");
        sbLIZ.append(lValueOf);
        sbLIZ.append(", isTeamOnlyOneAnchor = ");
        sbLIZ.append(zLJJJI);
        sbLIZ.append(", linkMicId = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        LJJIJIL(212, jLJLILLLLZI, j);
        if (listLLILZLL.size() >= LJJJJL()) {
            if (C176600m4.LIZIZ(Boolean.valueOf(zLJJJI))) {
                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                if (interfaceC975520bUc2 != null) {
                    enumC919170a1jLJIIIZ2 = interfaceC975520bUc2.LJIIIZ();
                } else {
                    enumC919170a1jLJIIIZ2 = null;
                }
                if (enumC919170a1jLJIIIZ2 != EnumC919170a1j.MATCH_TYPE_2V2) {
                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                    if (interfaceC975520bUc3 != null) {
                        enumC919170a1jLJIIIZ3 = interfaceC975520bUc3.LJIIIZ();
                    } else {
                        enumC919170a1jLJIIIZ3 = null;
                    }
                    if (enumC919170a1jLJIIIZ3 == EnumC919170a1j.MATCH_TYPE_1VN) {
                    }
                }
                C766270U4b.LIZLLL(2131853326);
                c975960bVK = this.LJII;
                if (c975960bVK != null) {
                    c975990bVN.LJIIJJI(listLLILZLL);
                    c975990bVN.LJ();
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update Armies when UserLeft, leaveReason = ");
            sbLIZ2.append(j);
            sbLIZ2.append(",linkmicId = ");
            sbLIZ2.append(str);
            C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
            C975960bVK c975960bVK5 = this.LJII;
            if (c975960bVK5 != null && (c975990bVN2 = c975960bVK5.LJJJLZIJ) != null) {
                c975990bVN2.LJIIJJI(listLLILZLL);
                c975990bVN2.LJ();
            }
            LiveMatchDropOffSetting liveMatchDropOffSetting = LiveMatchDropOffSetting.INSTANCE;
            if (liveMatchDropOffSetting.isEnable()) {
                C786410Ut5.LJLIIL(liveMatchDropOffSetting.getToastDelayTimeMs(), this.LJIIJ, new Runnable() { // from class: X.0bWH
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MultiMatchStateMatching@ddf9.onUserLeft$4");
                        try {
                            if (C970370bMJ.LJI()) {
                                C766270U4b.LIZLLL(2131853325);
                            } else {
                                C766270U4b.LIZLLL(2131853326);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MultiMatchStateMatching@ddf9.onUserLeft$4");
                    }
                });
            } else {
                C766270U4b.LIZLLL(2131853325);
            }
            C975960bVK c975960bVK6 = this.LJII;
            if (c975960bVK6 != null) {
                id = c975960bVK6.LJJJJJ();
            } else {
                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                if (interfaceC975520bUc4 != null && (roomInfo = interfaceC975520bUc4.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                    id = owner.getId();
                }
            }
            C976060bVU.LIZJ(this, id, 0L, 0L);
            C975960bVK c975960bVK7 = this.LJII;
            if (c975960bVK7 != null) {
                boolValueOf = Boolean.valueOf(c975960bVK7.LIZIZ);
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                C01GW c01gw = C958050b2R.LIZ;
                C975960bVK c975960bVK8 = this.LJII;
                if (c975960bVK8 != null) {
                    list2 = c975960bVK8.LJIIJJI;
                } else {
                    list2 = null;
                }
                C958050b2R.LIZ(jLJLILLLLZI, list2);
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            JSONObject jSONObject = new JSONObject();
            C974540bT2.LJIJJLI(jSONObject, false);
            c974540bT2.LLIIIJ("transfer_to_1v1v1", jSONObject, new JSONObject(), new JSONObject(), true, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C20441214yg.LIZIZ("MatchTracking2", "update when UserListChanged");
            C973660bRc.LJIIZILJ(c973660bRc, new LinkedHashMap(), false, false, null, 14);
        } else {
            C766270U4b.LIZLLL(2131853326);
            c975960bVK = this.LJII;
            if (c975960bVK != null && (c975990bVN = c975960bVK.LJJJLZIJ) != null) {
                c975990bVN.LJIIJJI(listLLILZLL);
                c975990bVN.LJ();
            }
        }
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJFF();
        }
        C786410Ut5.LJLIIL(1000L, this.LJIIJ, this.LJIILJJIL);
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIL(List list, List list2) {
        long id;
        Room roomInfo;
        User owner;
        C975990bVN c975990bVN;
        DataChannel dataChannel;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on host list changed coHost User list size, numHost = ");
        sbLIZ.append(listLLILZLL.size());
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        C389001fE.LIZ("LiveMatchNumHostDidChangeEvent", null, System.currentTimeMillis(), false);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        Boolean boolValueOf = null;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(null, Integer.valueOf(listLLILZLL.size()), null, 5));
        }
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc2.isAnchor());
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) && listLLILZLL.size() >= LJJJJL()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("on host list changed coHost User list size  = ");
            sbLIZ2.append(listLLILZLL.size());
            C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
            C975960bVK c975960bVK = this.LJII;
            if (c975960bVK != null && (c975990bVN = c975960bVK.LJJJLZIJ) != null) {
                c975990bVN.LJIIJJI(listLLILZLL);
                c975990bVN.LJ();
            }
            C975960bVK c975960bVK2 = this.LJII;
            if (c975960bVK2 != null) {
                id = c975960bVK2.LJJJJJ();
            } else {
                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                if (interfaceC975520bUc3 != null && (roomInfo = interfaceC975520bUc3.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                    id = owner.getId();
                } else {
                    id = 0;
                }
            }
            C976060bVU.LIZJ(this, id, 0L, 0L);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975970bVL.LJJIJ(java.lang.String, boolean):void");
    }

    public final void LJJIL(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        Boolean boolValueOf;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        JSONObject jSONObject = new JSONObject();
        C974540bT2.LJIJ(linkMicBattleMessage, jSONObject);
        C0K04.LIZLLL(z ? 1 : 0, "is_turn_off", jSONObject);
        C974540bT2.LJIJJLI(jSONObject, false);
        c974540bT2.LLIIIJ("quit_declined_message", jSONObject, new JSONObject(), new JSONObject(), true, C915980Zwa.LJFF().xB0());
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            c975960bVK.LJJIL = z;
            c975960bVK.LJJJ = false;
            c975960bVK.LJJIZ.LIZIZ();
        }
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        if (interfaceC976360bVy != null) {
            interfaceC976360bVy.LJFF();
        }
        C975960bVK c975960bVK2 = this.LJII;
        Integer numValueOf = null;
        if (c975960bVK2 != null) {
            boolValueOf = Boolean.valueOf(c975960bVK2.LJJJ);
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853344));
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853345));
        }
        this.LJIIIIZZ = false;
        C975960bVK c975960bVK3 = this.LJII;
        if (c975960bVK3 != null) {
            c975960bVK3.LJJLJ = null;
        }
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleDeclineQuitMsg isReMatch:");
        sbLIZ.append(zLIZ);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJJ(Boolean bool, EnumC973680bRe enumC973680bRe) {
        String str;
        String str2;
        long j;
        List<BattleTeamUserArmies> list;
        long id;
        Room roomInfo;
        User owner;
        List<? extends TeamUsersInfo> list2;
        BattleTeamUserArmies next;
        DataChannel dataChannel;
        C974800bTS c974800bTS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C951420ark c951420arkLLFF = C915980Zwa.LJI().LIZ().LLFF();
        DataChannel dataChannel2 = null;
        if (c951420arkLLFF != null) {
            str = c951420arkLLFF.LIZ;
        } else {
            str = null;
        }
        if (C500260Jjc.LJJIIZ(str)) {
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("cohost_invite_request_from", str);
        }
        if (C176600m4.LIZIZ(bool)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_live_end", str2);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        long j2 = 0;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
            j = c974800bTS.LIZIZ;
        } else {
            j = 0;
        }
        linkedHashMap.put("item_extend_connection_time", String.valueOf(j));
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            list = c975960bVK.LJJIJL;
            id = c975960bVK.LJJJJJ();
        } else {
            list = null;
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
        }
        if (list != null) {
            Iterator<BattleTeamUserArmies> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Long l = next.teamId;
                    if (l != null && l.longValue() == id && id != 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BattleTeamUserArmies battleTeamUserArmies = next;
            if (battleTeamUserArmies != null) {
                j2 = battleTeamUserArmies.hostRank;
            }
        }
        linkedHashMap.put("individual_rank", String.valueOf(j2));
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null) {
            list2 = c975960bVK2.LJJIJ;
        } else {
            list2 = null;
        }
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null) {
            dataChannel2 = interfaceC975520bUc3.getDataChannel();
        }
        C973660bRc.LIZ.LJJLIIIJLJLI(list2, true ^ C970370bMJ.LJIIJ(), enumC973680bRe, dataChannel2, linkedHashMap);
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void f3(int i, boolean z) {
        String str;
        super.f3(i, z);
        if (C915980Zwa.LJFF().xB0().isMatch()) {
            C766270U4b.LIZLLL(2131842776);
            str = "in_match";
        } else {
            C766270U4b.LIZLLL(2131851643);
            str = "mode_started";
        }
        C974540bT2.LIZ.LJJJJJ(String.valueOf(i), EnumC964160bCI.BLOCKED, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    @Override // X.C976040bVS, X.InterfaceC975690bUt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIIIZZ(int r15, int r16, com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason r17) {
        /*
            r14 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onLinkmicFinish, finishReason = "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " ,detailCode = "
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = " , abnorReason = "
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiMatchStateMatching"
            X.C20441214yg.LIZIZ(r0, r1)
            r2 = r14
            X.0bUc r0 = r2.LIZIZ
            if (r0 == 0) goto L77
            X.0a1j r1 = r0.LJIIIZ()
        L32:
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_1V1
            r8 = 0
            if (r1 != r0) goto L65
            X.0bVK r0 = r2.LJII
            if (r0 == 0) goto L74
            long r4 = r0.LJLILLLLZI()
        L40:
            r3 = 103(0x67, float:1.44E-43)
            long r6 = (long) r15
            r2.LJJIJIL(r3, r4, r6)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r1 = X.C915980Zwa.LJII()
            r0 = 1
            java.util.List r0 = r1.LLILZLL(r0)
            int r1 = r0.size()
            int r0 = LJJJJL()
            if (r1 >= r0) goto L79
            X.0bV2 r0 = r2.LJIILJJIL()
            X.0bVy r0 = (X.InterfaceC976360bVy) r0
            if (r0 == 0) goto L64
            r0.LJFF()
        L64:
            return
        L65:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            if (r0 == 0) goto L74
            long r4 = r0.getCurrentUserId()
            goto L40
        L74:
            r4 = 0
            goto L40
        L77:
            r1 = 0
            goto L32
        L79:
            X.0bVK r0 = r2.LJII
            if (r0 == 0) goto L89
            long r8 = r0.LJJJJJ()
        L81:
            r10 = 0
            r7 = r2
            r12 = r10
            X.C976060bVU.LIZJ(r7, r8, r10, r12)
            return
        L89:
            X.0bUc r0 = r2.LIZIZ
            if (r0 == 0) goto L81
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.getRoomInfo()
            if (r0 == 0) goto L81
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L81
            long r8 = r0.getId()
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975970bVL.LJIIIIZZ(int, int, com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason):void");
    }

    public final void LJJIJIL(int i, long j, long j2) {
        EnumC964170bCJ enumC964170bCJY2;
        EnumC964170bCJ enumC964170bCJY22;
        int i2;
        long j3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        long currentUserId;
        InterfaceC500940Jki interfaceC500940JkiUser2;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        EnumC919170a1j enumC919170a1jLJIIIZ = null;
        if (interfaceC975520bUc != null) {
            enumC964170bCJY2 = interfaceC975520bUc.Y2();
        } else {
            enumC964170bCJY2 = null;
        }
        boolean z = false;
        if (enumC964170bCJY2 == EnumC964170bCJ.MATCH_START) {
            i2 = 1;
        } else {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null) {
                enumC964170bCJY22 = interfaceC975520bUc2.Y2();
            } else {
                enumC964170bCJY22 = null;
            }
            if (enumC964170bCJY22 == EnumC964170bCJ.PUNISH_START) {
                i2 = 2;
            } else {
                i2 = 0;
            }
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        String strLJJIJIIJIL = C974540bT2.LJJIJIIJIL(i, j2);
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null) {
            enumC919170a1jLJIIIZ = interfaceC975520bUc3.LJIIIZ();
        }
        if (enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_1V1) {
            if (i == 103 && j2 == 1) {
                z = true;
            }
            if (SettingsManager.INSTANCE.getBooleanValue("live_match_1v1_self_leave_finish_fix_enable", true) && z && (interfaceC500940JkiUser2 = UserService.getInstance().user()) != null) {
                currentUserId = interfaceC500940JkiUser2.getCurrentUserId();
            } else {
                currentUserId = j;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doOnHostLeft 1v1: leaveSource=");
            sbLIZ.append(i);
            sbLIZ.append(", leftAnchorId=");
            sbLIZ.append(j);
            sbLIZ.append(", reason=");
            sbLIZ.append(j2);
            sbLIZ.append(", isSelfLeaveIn1V1=");
            sbLIZ.append(z);
            sbLIZ.append(", quitUid=");
            sbLIZ.append(currentUserId);
            C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
            LJJIJL(this, currentUserId, i, j2, null, 24);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("doOnHostLeft: leaveSource ");
        sbLIZ2.append(i);
        sbLIZ2.append(", leftAnchorId ");
        sbLIZ2.append(j);
        sbLIZ2.append(", leaveOfFinishReason ");
        sbLIZ2.append(j2);
        sbLIZ2.append(", leaveOrFinishRequestSource ");
        sbLIZ2.append(strLJJIJIIJIL);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        long jLJJL = 0;
        if (LiveMatchDropOffSetting.INSTANCE.battleFinishDisabledForOthers()) {
            if (j == 0 || ((interfaceC500940JkiUser = UserService.getInstance().user()) != null && j == interfaceC500940JkiUser.getCurrentUserId())) {
                if (i == 103 && j2 != 1) {
                    return;
                }
            } else {
                return;
            }
        }
        InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            j3 = c975960bVK.LJ;
            jLJJL = c975960bVK.LJJL();
        } else {
            j3 = 0;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("coordinator is ");
        sbLIZ3.append(interfaceC976360bVy);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ3));
        if (interfaceC976360bVy == null) {
            return;
        }
        interfaceC976360bVy.LJJJ(j3, jLJJL, j, i2, strLJJIJIIJIL, new AwS3S0101200_15(this, j2, j, i2, 0), new C976310bVt(this, j2, j));
    }

    public C975970bVL(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage);
        this.LJI = battleInfoResponse;
        this.LJIIJ = new BPEAHandler(Looper.getMainLooper());
        this.LJIILJJIL = new ARunnableS84S0200000_15(this, interfaceC975520bUc, 50);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(X.C975970bVL r14, kotlin.jvm.functions.Function1 r15, kotlin.jvm.functions.Function0 r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975970bVL.LJJIZ(X.0bVL, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, int):void");
    }

    public static void LJJIJL(C975970bVL c975970bVL, long j, int i, long j2, Integer num, int i2) {
        AFwS203S0000000_15 aFwS203S0000000_15;
        long j3 = j2;
        if ((i2 & 4) != 0) {
            j3 = -1;
        }
        Integer num2 = null;
        if ((i2 & 8) != 0) {
            aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(332);
        } else {
            aFwS203S0000000_15 = null;
        }
        if ((i2 & 16) == 0) {
            num2 = num;
        }
        c975970bVL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request finish or punish finish, quitUid = ");
        sbLIZ.append(j);
        sbLIZ.append(", source = ");
        sbLIZ.append(i);
        sbLIZ.append(", leaveOrFinishReason = ");
        sbLIZ.append(j3);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        EnumC964170bCJ enumC964170bCJ = c975970bVL.LIZ;
        if (enumC964170bCJ == EnumC964170bCJ.MATCH_START) {
            C976230bVl.LIZ(c975970bVL, (InterfaceC976360bVy) c975970bVL.LJIILJJIL(), i, true, j, 0, j3, 48);
        } else {
            if (enumC964170bCJ != EnumC964170bCJ.PUNISH_START) {
                return;
            }
            C976300bVs.LIZ(c975970bVL, (InterfaceC976360bVy) c975970bVL.LJIILJJIL(), i, true, j, aFwS203S0000000_15, num2);
        }
    }

    public final void LJJJJLL(Integer num, Map<Long, GiftGalleryBadgeInfo> map, Map<Long, LeagueScoreInfo> map2, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse, Long l, Integer num2, Long l2, Long l3) {
        Long lValueOf;
        EnigmaBattleSetting enigmaBattleSetting;
        EnigmaBattleExtraInfo enigmaBattleExtraInfo;
        Map<Long, AnchorMatchSettings> map3;
        InterfaceC975520bUc interfaceC975520bUc;
        Long lValueOf2;
        DataChannel dataChannel;
        Room roomLJJLIIIIJ;
        User owner;
        User owner2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C975960bVK c975960bVKM3;
        long channelId;
        long jLIZ;
        C975960bVK c975960bVKM32;
        C975960bVK c975960bVKM33;
        C975990bVN c975990bVN;
        long jLongValue;
        Room roomInfo;
        Room roomInfo2;
        boolean zLIZ = C959180b4G.LIZ(num);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleOpenMsg  isFromReMatch source:");
        sbLIZ.append(zLIZ);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateMatchModel, messageId:");
        BattleSetting battleSetting = null;
        if (linkMicBattleMessage != null) {
            lValueOf = Long.valueOf(linkMicBattleMessage.getMessageId());
        } else {
            lValueOf = null;
        }
        sbLIZ2.append(lValueOf);
        sbLIZ2.append(" leagueInfo = ");
        sbLIZ2.append(map);
        sbLIZ2.append(", leagueScore = ");
        sbLIZ2.append(map2);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        C976040bVS.LJJ(map, map2);
        if (battleInfoResponse != null) {
            enigmaBattleSetting = battleInfoResponse.enigmaBattleSetting;
        } else {
            enigmaBattleSetting = null;
        }
        LJIJJLI(enigmaBattleSetting);
        if (battleInfoResponse != null) {
            enigmaBattleExtraInfo = battleInfoResponse.enigmaBattleExtraInfo;
        } else {
            enigmaBattleExtraInfo = null;
        }
        LJIJJ(enigmaBattleExtraInfo);
        if (battleInfoResponse != null) {
            map3 = battleInfoResponse.anchorMatchSettings;
        } else {
            map3 = null;
        }
        LJIJI(map3);
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if ((interfaceC975520bUc2 != null && (roomInfo2 = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo2.getOwner()) != null) || ((interfaceC975520bUc = this.LIZIZ) != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null)) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("RoomInfo = ");
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null && (roomInfo = interfaceC975520bUc3.getRoomInfo()) != null) {
            owner2 = roomInfo.getOwner();
        } else {
            owner2 = null;
        }
        sbLIZ3.append(owner2);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ3));
        InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
        if (interfaceC975520bUc4 != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc4.isAnchor());
        } else {
            boolValueOf = null;
        }
        boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
        long jLongValue2 = 0;
        if (zLIZIZ && lValueOf2 != null && lValueOf2.longValue() == 0) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                lValueOf2 = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
            } else {
                lValueOf2 = null;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("current Anchor Id = ");
        sbLIZ4.append(lValueOf2);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ4));
        InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
        if (interfaceC975520bUc5 != null && (c975960bVKM33 = interfaceC975520bUc5.m3()) != null && (c975990bVN = c975960bVKM33.LJJJLZIJ) != null) {
            C20441214yg.LJIIIZ("MatchModelUpdater", "clearEnigmaInfo: ");
            C975960bVK c975960bVK = c975990bVN.LIZ;
            c975960bVK.LJJLIIIJJIZ = 0L;
            c975960bVK.LJJLIIIJL = 0L;
            c975990bVN.LIZJ();
            if (lValueOf2 != null) {
                jLongValue = lValueOf2.longValue();
            } else {
                jLongValue = 0;
            }
            c975990bVN.LJI(linkMicBattleMessage, battleInfoResponse, jLongValue);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("getMatchModel setting =isRematch =  ");
        InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
        if (interfaceC975520bUc6 != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC975520bUc6.d3());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ5.append(boolValueOf2);
        sbLIZ5.append(", setting isnull = ");
        InterfaceC975520bUc interfaceC975520bUc7 = this.LIZIZ;
        if (interfaceC975520bUc7 != null && (c975960bVKM32 = interfaceC975520bUc7.m3()) != null) {
            battleSetting = c975960bVKM32.LJII;
        }
        sbLIZ5.append(battleSetting);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ5));
        long jLJJIJLIJ = LJJIJLIJ();
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        long j = jLJJIJLIJ + jLongValue2;
        InterfaceC975520bUc interfaceC975520bUc8 = this.LIZIZ;
        if (interfaceC975520bUc8 != null) {
            interfaceC975520bUc8.k3(C918130a03.LIZ(num2));
        }
        InterfaceC975520bUc interfaceC975520bUc9 = this.LIZIZ;
        if (interfaceC975520bUc9 != null && (c975960bVKM3 = interfaceC975520bUc9.m3()) != null) {
            c975960bVKM3.LJJII = C974520bT0.LIZ();
            if (l2 != null) {
                channelId = l2.longValue();
            } else {
                channelId = C915980Zwa.LJII().getChannelId();
            }
            c975960bVKM3.LJIIIZ = channelId;
            if (l3 != null) {
                jLIZ = l3.longValue();
            } else {
                jLIZ = C974520bT0.LIZ();
            }
            c975960bVKM3.LJJIII = jLIZ;
            c975960bVKM3.LJJIIJZLJL = j;
            ((HashMap) c975960bVKM3.LJIJJ).clear();
            this.LJII = c975960bVKM3;
        }
    }
}
