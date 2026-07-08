package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970760bMw {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(BattleInfoResponse battleInfoResponse) {
        long jLIZIZ;
        long jMax;
        long j;
        boolean z;
        Integer numValueOf;
        Map<Long, BattleTeamUserArmies> map;
        Map<Long, BattleTeamResult> map2;
        Map<Long, BattleTeamUserArmies> map3;
        Long l = battleInfoResponse.channelId;
        long channelId = C915980Zwa.LJI().LJIIJ().getChannelId();
        if (l != null && l.longValue() == channelId) {
            BattleSetting battleSetting = battleInfoResponse.setting;
            if (battleSetting == null) {
                jMax = LiveInteractBattleDurationSetting.INSTANCE.getValue();
            } else {
                if (MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled()) {
                    jLIZIZ = C974520bT0.LIZ();
                } else {
                    jLIZIZ = C158B.LIZIZ();
                }
                if (jLIZIZ <= 0) {
                    jLIZIZ = System.currentTimeMillis();
                }
                jMax = ((long) battleSetting.duration) - (Math.max(0L, jLIZIZ - battleSetting.startTimeMs) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            C20441214yg.LJIIIZ("MatchIdentifierUtils", "getMatchRemainSecondForAudience: remainSecond = " + jMax);
            BattleSetting battleSetting2 = battleInfoResponse.setting;
            if (battleSetting2 != null) {
                j = battleSetting2.extraDurationSecond;
            } else {
                j = 0;
            }
            long j2 = jMax + j;
            Long l2 = battleInfoResponse.battleId;
            if (l2 != null && l2.longValue() != 0) {
                BattleSetting battleSetting3 = battleInfoResponse.setting;
                if (battleSetting3 != null && battleSetting3.status == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numValueOf2 = null;
                if (z || (battleSetting3 != null && battleSetting3.status == 3)) {
                    if (C500260Jjc.LJJJI(C973890bRz.LJII(l2))) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("validateBattleInfo");
                        sbLIZ.append(": battleId is expired: ");
                        sbLIZ.append(l2);
                        sbLIZ.append(". OveredBattleIds = ");
                        sbLIZ.append(C973890bRz.LJIILL);
                        C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ));
                        return false;
                    }
                    BattleSetting battleSetting4 = battleInfoResponse.setting;
                    if (battleSetting4 != null && (numValueOf = Integer.valueOf(battleSetting4.status)) != null) {
                        if (numValueOf.intValue() == 1) {
                            BattleSetting battleSetting5 = battleInfoResponse.setting;
                            if (battleSetting5 != null && battleSetting5.battleType == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType() && ((map3 = battleInfoResponse.teamArmies) == null || map3.isEmpty())) {
                                return false;
                            }
                            if (j2 > 0) {
                                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                                if (interfaceC973730bRjYf2 != null) {
                                    interfaceC973730bRjYf2.LJIIJJI();
                                    return true;
                                }
                                return true;
                            }
                            C20441214yg.LJ("MatchIdentifierUtils", "validateBattleInfo: Match data is expired. realRemainTime = " + j2);
                            return false;
                        }
                        if (numValueOf.intValue() == 3) {
                            long value = j2 + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                            if (value > 0) {
                                BattleSetting battleSetting6 = battleInfoResponse.setting;
                                if (battleSetting6 != null && battleSetting6.battleType == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType() && ((map = battleInfoResponse.teamArmies) == null || map.isEmpty() || (map2 = battleInfoResponse.teamBattleResult) == null || map2.isEmpty())) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("validateBattleInfo");
                                    sbLIZ2.append(": battle info individual match punish missing result");
                                    C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ2));
                                    return false;
                                }
                                InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                                if (interfaceC973730bRjYf22 != null) {
                                    interfaceC973730bRjYf22.LJJII();
                                    return true;
                                }
                                return true;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("validateBattleInfo");
                            sbLIZ3.append(": Match data is expired. punishDuration = ");
                            sbLIZ3.append(value);
                            C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ3));
                            return false;
                        }
                    }
                    BattleSetting battleSetting7 = battleInfoResponse.setting;
                    if (battleSetting7 != null && battleSetting7.status >= 2) {
                        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
                            C974540bT2.LIZ.LJJJJL(battleInfoResponse);
                        } else {
                            C974480bSw.LIZ.LJIJJLI(battleInfoResponse);
                            return false;
                        }
                    }
                    return false;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("validateBattleInfo");
                sbLIZ4.append(": not in Match , status = ");
                BattleSetting battleSetting8 = battleInfoResponse.setting;
                if (battleSetting8 != null) {
                    numValueOf2 = Integer.valueOf(battleSetting8.status);
                }
                sbLIZ4.append(numValueOf2);
                C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ4));
                return false;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("validateBattleInfo");
            sbLIZ5.append(": battleId is null or empty ");
            C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ5));
            return false;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("validateBattleInfo");
        sbLIZ6.append(": channelId has changed");
        C20441214yg.LJ("MatchIdentifierUtils", C2188811AlT.LIZIZ(sbLIZ6));
        return false;
    }

    public static void LIZ(LiveWidget liveWidget, long j, int i, Function1 function1, Function1 function12) {
        Room room;
        long id;
        long channelId = C915980Zwa.LJII().getChannelId();
        DataChannel dataChannel = liveWidget.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C480460Ism.LIZ().getClass();
        LinkBattleApi linkBattleApi = (LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class);
        long ownerUserId = 0;
        if (room != null) {
            id = room.getId();
            ownerUserId = room.getOwnerUserId();
        } else {
            id = 0;
        }
        ((C0J1N) linkBattleApi.getInfo(id, channelId, j, ownerUserId, i).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(liveWidget))).LIZ(new AfS184S0100000_15(function1, (Function1<? super C470590Icr<Unit>, Unit>) 166), new AfS184S0100000_15(function12, (Function1<? super C470590Icr<Unit>, Unit>) 166));
    }
}
