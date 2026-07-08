package Y;

import X.C05XL;
import X.C09JN;
import X.C0IJT;
import X.C1086600eNm;
import X.C1086830eO9;
import X.C1130340fWK;
import X.C1135020fds;
import X.C1144460ft6;
import X.C1144530ftD;
import X.C1144590ftJ;
import X.C1144630ftN;
import X.C1144880ftm;
import X.C1151190g3x;
import X.C1161920gLG;
import X.C13LP;
import X.C158B;
import X.C1697810uHb;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C754990TjV;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C970370bMJ;
import X.C970820bN2;
import X.C973660bRc;
import X.C974800bTS;
import X.C978270bZ3;
import X.EnumC1144450ft5;
import X.EnumC919120a1e;
import X.EnumC919170a1j;
import X.InterfaceC500940Jki;
import X.InterfaceC973730bRj;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRivalsScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.data.BagItem;

/* JADX INFO: loaded from: classes18.dex */
public class AfS4S0300100_17 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS4S0300100_17 afS4S0300100_17, Object obj) throws JSONException {
        BagItemConsumeResponse.Data data;
        long j;
        long jEr;
        long j2;
        Long lValueOf;
        Map<Long, Long> mapLJJLJLI;
        Long lValueOf2;
        String string;
        boolean z;
        Object obj2;
        String str;
        C970820bN2 c970820bN2;
        C978270bZ3 c978270bZ3;
        long j3;
        C974800bTS c974800bTS;
        C978270bZ3 c978270bZ32;
        C1C7U.LIZ("MatchItemViewModel@5b2b.sendCardFromUserGuide$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (BagItemConsumeResponse.Data) baseResponse.data) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C1144590ftJ c1144590ftJ = new C1144590ftJ(jSONObject, jSONObject2);
            jSONObject2.put("match_item_expiretime", ((BagItem) afS4S0300100_17.l1).minExpireAt);
            jSONObject2.put("cost", jElapsedRealtime - afS4S0300100_17.j3);
            jSONObject2.put("log_id", baseResponse.LIZIZ);
            C1144630ftN.LJIJ(c1144590ftJ, ((BagItem) afS4S0300100_17.l1).itemType);
            C1144630ftN.LJJIFFI("match_item_send_succeed", c1144590ftJ, EnumC919120a1e.AUDIENCE_SENDER, "banner_guide");
            DataChannel dataChannel = ((MatchItemViewModel) afS4S0300100_17.l0).LLILZIL;
            long j4 = 0;
            if (dataChannel != null && (c978270bZ32 = (C978270bZ3) dataChannel.gg0(BattleLeftScoreChannel.class)) != null) {
                j = c978270bZ32.LIZ;
            } else {
                j = 0;
            }
            DataChannel dataChannel2 = ((MatchItemViewModel) afS4S0300100_17.l0).LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.gg0(BattleRivalsScoreUpdateChannel.class);
            }
            long jLIZ = C158B.LIZ();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jEr = interfaceC973730bRjYf2.er();
            } else {
                jEr = 0;
            }
            long value = jLIZ - jEr;
            if (value > 1000000) {
                DataChannel dataChannel3 = ((MatchItemViewModel) afS4S0300100_17.l0).LLILZIL;
                if (dataChannel3 != null && (c974800bTS = (C974800bTS) dataChannel3.gg0(BattleTimeLeftChannel.class)) != null) {
                    j3 = c974800bTS.LIZ;
                } else {
                    j3 = 0;
                }
                value = 1000 * (LiveInteractBattleDurationSetting.INSTANCE.getValue() - j3);
            }
            ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
            DataChannel dataChannel4 = ((MatchItemViewModel) afS4S0300100_17.l0).LLILZIL;
            if (dataChannel4 != null && (c978270bZ3 = (C978270bZ3) dataChannel4.gg0(BattleLeftScoreChannel.class)) != null) {
                j2 = c978270bZ3.LIZ;
            } else {
                j2 = 0;
            }
            DataChannel dataChannel5 = ((MatchItemViewModel) afS4S0300100_17.l0).LLILZIL;
            if (dataChannel5 != null && (c970820bN2 = (C970820bN2) dataChannel5.gg0(BattleRivalsScoreUpdateChannel.class)) != null) {
                j4 = c970820bN2.LIZ;
            }
            C1130340fWK c1130340fWKLIZ = C1135020fds.LIZ(j2, j4);
            Long lValueOf3 = null;
            if (iLiveMatchService.xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                InterfaceC973730bRj interfaceC973730bRjYf22 = iLiveMatchService.yf2(false);
                if (interfaceC973730bRjYf22 != null) {
                    mapLJJLJLI = interfaceC973730bRjYf22.LJJLJLI();
                } else {
                    mapLJJLJLI = null;
                }
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(j2 - j4);
                mapLJJLJLI = null;
            }
            C973660bRc c973660bRc = C973660bRc.LIZ;
            int i = ((BagItem) afS4S0300100_17.l1).itemType;
            long j5 = data.count;
            long j6 = c1130340fWKLIZ.LIZ;
            long j7 = c1130340fWKLIZ.LIZIZ;
            C1144880ftm c1144880ftm = (C1144880ftm) afS4S0300100_17.l2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
            C973660bRc.LJJIIJZLJL(linkedHashMap);
            C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
            linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
            String str2 = "user";
            linkedHashMap.put(C973660bRc.LJJII, "user");
            InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf23 != null) {
                lValueOf2 = Long.valueOf(interfaceC973730bRjYf23.LJJJJJL());
            } else {
                lValueOf2 = null;
            }
            linkedHashMap.put("pk_id", String.valueOf(lValueOf2));
            InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf24 != null) {
                lValueOf3 = Long.valueOf(interfaceC973730bRjYf24.LJJL());
            }
            linkedHashMap.put("channel_id", String.valueOf(lValueOf3));
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("user_id", string);
            User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
            if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "1";
            if (z) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enigma", obj2);
            linkedHashMap.put("bubble_type", "direct_use");
            linkedHashMap.put("gift_enter_from", "match_item_use_bubble");
            linkedHashMap.put("is_available", "1");
            linkedHashMap.put("match_item_cnts", String.valueOf(j5));
            linkedHashMap.put("team_score_when_used", String.valueOf(j));
            linkedHashMap.put("score_diff_with_highest_used", String.valueOf(j6));
            linkedHashMap.put("score_diff_with_lowest_used", String.valueOf(j7));
            if (lValueOf != null) {
                lValueOf.longValue();
                linkedHashMap.put("score_diff_when_used", lValueOf.toString());
            }
            if (mapLJJLJLI != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<Long, Long> entry : mapLJJLJLI.entrySet()) {
                    jSONObject3.put(String.valueOf(entry.getKey().longValue()), entry.getValue().longValue());
                }
                linkedHashMap.put("all_pair_anchor_score", C786410Ut5.J3(jSONObject3));
            }
            linkedHashMap.put("time_diff_when_used", String.valueOf(value));
            linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
            String str4 = C973660bRc.LJJII;
            if (C973660bRc.LJLLLL()) {
                str2 = "anchor";
            }
            linkedHashMap.put(str4, str2);
            EnumC1144450ft5.Companion.getClass();
            linkedHashMap.put("match_item_type", String.valueOf(C1144460ft6.LIZ(i)));
            if (c1144880ftm != null) {
                if (Intrinsics.LJFF(c1144880ftm.LJFF, "count_down")) {
                    str = "countdown";
                } else {
                    str = c1144880ftm.LJFF;
                    if (str == null) {
                        str = "";
                    }
                }
                linkedHashMap.put("trigger_type", str);
                String str5 = c1144880ftm.LJI;
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("notification_request_id", str5);
            }
            C1144530ftD.LIZ(c973660bRc, linkedHashMap);
            String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            if (!C915980Zwa.LIZLLL().L6()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enlarge_mode", str3);
            if (C970370bMJ.LJII()) {
                C973660bRc.LJZ(c973660bRc, "livesdk_send_match_item", linkedHashMap, strLIZIZ);
            } else {
                C973660bRc.LJZI(c973660bRc, "livesdk_send_match_item", linkedHashMap, strLIZIZ);
            }
            MatchItemViewModel matchItemViewModel = (MatchItemViewModel) afS4S0300100_17.l0;
            Room room = matchItemViewModel.LLILLJJLI;
            if (room != null) {
                C500260Jjc.LJJLIIIJ(matchItemViewModel.LLILZIL);
                room.getId();
            }
        } else {
            BagItem bagItem = (BagItem) afS4S0300100_17.l1;
            long j8 = afS4S0300100_17.j3;
            if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Throwable th = new Throwable("response_data_null");
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                C1144590ftJ c1144590ftJ2 = new C1144590ftJ(jSONObject4, jSONObject5);
                jSONObject5.put("match_item_expiretime", bagItem.minExpireAt);
                jSONObject5.put("cost", jElapsedRealtime2 - j8);
                C1144630ftN c1144630ftN = C1144630ftN.LIZ;
                C1144630ftN.LJIJ(c1144590ftJ2, bagItem.itemType);
                c1144630ftN.LJIIZILJ(th, jSONObject5);
                C1144630ftN.LJJIFFI("match_item_send_failed", c1144590ftJ2, EnumC919120a1e.AUDIENCE_SENDER, "banner_guide");
            }
        }
        C1C7U.LIZIZ("MatchItemViewModel@5b2b.sendCardFromUserGuide$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS4S0300100_17 afS4S0300100_17, Object obj) {
        VoteResponseData voteResponseData;
        String str;
        String str2;
        C1C7U.LIZ("LiveNormalPollViewModel@2f73.selectNormalPoll$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (voteResponseData = (VoteResponseData) baseResponse.data) != null) {
            LiveNormalPollViewModel liveNormalPollViewModel = (LiveNormalPollViewModel) afS4S0300100_17.l0;
            DataChannel dataChannel = (DataChannel) afS4S0300100_17.l1;
            PollOptionInfo pollOptionInfo = (PollOptionInfo) afS4S0300100_17.l2;
            long j = afS4S0300100_17.j3;
            liveNormalPollViewModel.LLJILJILJ = null;
            boolean zIsEmpty = voteResponseData.optionList.isEmpty();
            if (dataChannel != null) {
                int i = pollOptionInfo.optionIndex;
                List<PollOptionInfo> list = voteResponseData.optionList;
                C1086600eNm c1086600eNm = new C1086600eNm(j, i, zIsEmpty, list);
                dataChannel.LC0(SelectPollVoteEvent.class, c1086600eNm);
                boolean z = true;
                String str3 = "";
                long j2 = 0;
                String strLIZIZ = "";
                String str4 = "";
                long j3 = 0;
                int i2 = 0;
                for (PollOptionInfo pollOptionInfo2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        PollOptionInfo pollOptionInfo3 = pollOptionInfo2;
                        if (pollOptionInfo3 != null) {
                            if (i2 == 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ);
                                sbLIZ.append('{');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                j2 = pollOptionInfo3.votes;
                            } else if (j2 != pollOptionInfo3.votes) {
                                z = false;
                            }
                            long j4 = pollOptionInfo3.votes;
                            if (j3 < j4) {
                                str4 = pollOptionInfo3.displayContent;
                                j3 = j4;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append('\'');
                            sbLIZ2.append(pollOptionInfo3.displayContent);
                            sbLIZ2.append(':');
                            sbLIZ2.append(pollOptionInfo3.votes);
                            sbLIZ2.append('\'');
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ2);
                            if (i2 == 0) {
                                str2 = ",";
                            } else {
                                str2 = "}";
                            }
                            sbLIZ3.append(str2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                if (z) {
                    str4 = "tie_up";
                }
                long j5 = c1086600eNm.LIZLLL;
                PollOptionInfo pollOptionInfo4 = (PollOptionInfo) C13LP.LJJJLZIJ(c1086600eNm.LIZIZ, list);
                if (pollOptionInfo4 != null && (str = pollOptionInfo4.displayContent) != null) {
                    str3 = str;
                }
                HashMap map = new HashMap();
                map.put("poll_type", "normal_poll");
                map.put("poll_result_current", strLIZIZ);
                map.put("winner_current", str4);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_poll_click");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(Long.valueOf(C1086830eO9.LIZIZ), "poll_id");
                c474500IjALIZ.LJJII(Long.valueOf(j5), "time_remain");
                c474500IjALIZ.LJJII("click", "action_type");
                c474500IjALIZ.LJJII(str3, "poll_selection");
                c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_custom");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
            liveNormalPollViewModel.LLJILJIL = pollOptionInfo.optionIndex;
            liveNormalPollViewModel.LLJI.onNext(voteResponseData);
        }
        C1C7U.LIZIZ("LiveNormalPollViewModel@2f73.selectNormalPoll$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS4S0300100_17 afS4S0300100_17, Object obj) {
        String str;
        List<RedEnvelopInfo> list;
        C1C7U.LIZ("TreasureBoxService@5211.getEnvelopeList$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        RedEnvelopeListResponse redEnvelopeListResponse = (RedEnvelopeListResponse) baseResponse.data;
        if (redEnvelopeListResponse != null && (list = redEnvelopeListResponse.envelopList) != null) {
            DataChannel dataChannel = (DataChannel) afS4S0300100_17.l2;
            dataChannel.SX0(C754990TjV.class, Long.valueOf(System.currentTimeMillis()));
            dataChannel.zW(InitEnvelopeListChannel.class, list);
        } else {
            C20441214yg.LJ("TreasureBoxService", "err info: empty list");
        }
        RequestError requestError = baseResponse.LJ;
        if (requestError == null || (str = requestError.message) == null) {
            str = "";
        }
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS4S0300100_17.l0;
        int i = baseResponse.statusCode;
        long j = afS4S0300100_17.j3;
        List<RedEnvelopInfo> list2 = ((RedEnvelopeListResponse) baseResponse.data).envelopList;
        Boolean bool = (Boolean) afS4S0300100_17.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(i, str, j, list2, bool);
        C1C7U.LIZIZ("TreasureBoxService@5211.getEnvelopeList$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS4S0300100_17 afS4S0300100_17, Object obj) {
        String str;
        List<RedEnvelopInfo> list;
        C1C7U.LIZ("TreasureBoxService@5211.getEnvelopeList$5");
        BaseResponse baseResponse = (BaseResponse) obj;
        RedEnvelopeListResponse redEnvelopeListResponse = (RedEnvelopeListResponse) baseResponse.data;
        if (redEnvelopeListResponse != null && (list = redEnvelopeListResponse.envelopList) != null) {
            DataChannel dataChannel = (DataChannel) afS4S0300100_17.l2;
            dataChannel.SX0(C754990TjV.class, Long.valueOf(System.currentTimeMillis()));
            dataChannel.zW(InitEnvelopeListChannel.class, list);
        } else {
            C20441214yg.LJ("TreasureBoxService", "err info: empty list");
        }
        RequestError requestError = baseResponse.LJ;
        if (requestError == null || (str = requestError.message) == null) {
            str = "";
        }
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS4S0300100_17.l0;
        int i = baseResponse.statusCode;
        long j = afS4S0300100_17.j3;
        List<RedEnvelopInfo> list2 = ((RedEnvelopeListResponse) baseResponse.data).envelopList;
        Boolean bool = (Boolean) afS4S0300100_17.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(i, str, j, list2, bool);
        C1C7U.LIZIZ("TreasureBoxService@5211.getEnvelopeList$5");
    }

    public static final void accept$4(AfS4S0300100_17 afS4S0300100_17, Object obj) {
        C1C7U.LIZ("RechargeUtilKt@d250.queryDiamondList$2$4");
        C1151190g3x.LJII(false, false, SystemClock.elapsedRealtime() - afS4S0300100_17.j3, (RechargePanelInputParams) afS4S0300100_17.l0, (Map) afS4S0300100_17.l1, (Throwable) obj);
        ((C05XL) afS4S0300100_17.l2).LJIIZILJ(null);
        C1C7U.LIZIZ("RechargeUtilKt@d250.queryDiamondList$2$4");
    }

    public AfS4S0300100_17(long j, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.j3 = j;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
