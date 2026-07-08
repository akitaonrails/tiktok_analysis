package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchChooseModeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973890bRz {
    public static BattleTeamResult LIZJ;
    public static Map<Long, BattleTeamResult> LIZLLL;
    public static BattleTeamResult LJ;
    public static boolean LJFF;
    public static int LJI;
    public static long LJII;
    public static MultiMatchPrepareResponse LJIIJJI;
    public static Map<Long, BattleABTestList> LJIIL;
    public static List<GiftMode> LJIILIIL;
    public static Long LJIILJJIL;
    public static final C974450bSt LIZ = new C974450bSt("data_battle_state", AFwS250S0000000_15.get$arr$(165));
    public static final C974450bSt LIZIZ = new C974450bSt("data_battle_rematch_state", null);
    public static final C098J<Long, Boolean> LJIIIIZZ = new C098J<>();
    public static EnumC919170a1j LJIIIZ = EnumC919170a1j.UNKNOWN;
    public static final HashMap<Boolean, List<BattleTeamUser>> LJIIJ = new HashMap<>();
    public static final C098J<String, Boolean> LJIILL = new C098J<>();

    public static Map LIZJ() {
        MultiMatchPrepareResponse multiMatchPrepareResponse;
        if (LiveMatchChooseModeSetting.INSTANCE.isEnable()) {
            return LJIIL;
        }
        if (!C915980Zwa.LJII().LLFFF() || C915980Zwa.LJII().LLILZLL(true).size() == 2 || (multiMatchPrepareResponse = LJIIJJI) == null) {
            return null;
        }
        return multiMatchPrepareResponse.abTestSettings;
    }

    public static List LIZLLL() {
        MultiMatchPrepareResponse multiMatchPrepareResponse;
        if (LiveMatchChooseModeSetting.INSTANCE.isEnable()) {
            return LJIILIIL;
        }
        if (!C915980Zwa.LJII().LLFFF() || C915980Zwa.LJII().LLILZLL(true).size() == 2 || (multiMatchPrepareResponse = LJIIJJI) == null) {
            return null;
        }
        return multiMatchPrepareResponse.giftMode;
    }

    public static void LJI() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf = room != null ? Long.valueOf(room.getOwnerUserId()) : null;
        C915980Zwa.LJI().LJIIJ().LLJJJIL();
        Intrinsics.LJFF(null, lValueOf);
    }

    public static BattleABTestList LJ() {
        Map mapLIZJ = LIZJ();
        if (mapLIZJ != null) {
            return (BattleABTestList) mapLIZJ.get(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        return null;
    }

    public static void LJFF() {
        List<GiftMode> listLIZLLL = LIZLLL();
        Map<String, String> mapLIZIZ = InterfaceC1106030et7.s7.LIZIZ();
        Map<String, String> mapLIZIZ2 = InterfaceC1106030et7.r7.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (listLIZLLL != null) {
            for (GiftMode giftMode : listLIZLLL) {
                long j = giftMode.releaseVersion;
                if (j <= 0) {
                    j = 1;
                }
                if (mapLIZIZ.containsKey(String.valueOf(giftMode.giftId))) {
                    if (mapLIZIZ.containsKey(String.valueOf(giftMode.giftId))) {
                        String str = mapLIZIZ.get(String.valueOf(giftMode.giftId));
                        if (str == null) {
                            str = "1";
                        }
                        if (!Intrinsics.LJFF(str, String.valueOf(j))) {
                            linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                            linkedHashMap2.put(String.valueOf(giftMode.giftId), CardStruct.IStatusCode.DEFAULT);
                        }
                    }
                    linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                    String strValueOf = String.valueOf(giftMode.giftId);
                    String str2 = mapLIZIZ2.get(String.valueOf(giftMode.giftId));
                    linkedHashMap2.put(strValueOf, str2 != null ? str2 : "1");
                } else {
                    linkedHashMap.put(String.valueOf(giftMode.giftId), String.valueOf(j));
                    linkedHashMap2.put(String.valueOf(giftMode.giftId), CardStruct.IStatusCode.DEFAULT);
                }
            }
        }
        InterfaceC1106030et7.s7.LJFF(linkedHashMap);
        InterfaceC1106030et7.r7.LJFF(linkedHashMap2);
    }

    public static void LIZ(Long l) {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        sbLIZ.append(jLongValue);
        sbLIZ.append(',');
        sbLIZ.append(C930540aK4.LJII());
        LJIILL.put(C2188811AlT.LIZIZ(sbLIZ), Boolean.TRUE);
    }

    public static GiftMode LIZIZ(long j) {
        List<GiftMode> listLIZLLL = LIZLLL();
        if (listLIZLLL != null) {
            for (GiftMode giftMode : listLIZLLL) {
                if (giftMode.giftId == j) {
                    return giftMode;
                }
            }
            return null;
        }
        return null;
    }

    public static Boolean LJII(Long l) {
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        sbLIZ.append(jLongValue);
        sbLIZ.append(',');
        sbLIZ.append(C930540aK4.LJII());
        return LJIILL.get(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIIZ(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        Map<Long, BattleABTestList> map;
        ArrayList arrayList;
        Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> map2;
        MatchSettingsInfo matchSettingsInfo;
        List<GiftMode> list;
        List<GiftMode> list2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupMultiPrepareBattleData, multiPrepareBattleResponse = ");
        sbLIZ.append(multiMatchPrepareResponse);
        sbLIZ.append(", prepareBattleData = ");
        sbLIZ.append((Object) null);
        C20441214yg.LIZIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI = multiMatchPrepareResponse;
        if (multiMatchPrepareResponse != null) {
            map = multiMatchPrepareResponse.abTestSettings;
        } else {
            map = null;
        }
        LJIIL = map;
        if (multiMatchPrepareResponse != null && (list2 = multiMatchPrepareResponse.giftMode) != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = new ArrayList();
        }
        LJIILIIL = arrayList;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            if (multiMatchPrepareResponse != null) {
                map2 = multiMatchPrepareResponse.availableMatchOptions;
            } else {
                map2 = null;
            }
            interfaceC975810bV5LIZLLL.LJJIIZI(map2);
            if (multiMatchPrepareResponse != null) {
                matchSettingsInfo = multiMatchPrepareResponse.matchSettingsInfo;
            } else {
                matchSettingsInfo = null;
            }
            interfaceC975810bV5LIZLLL.LJIIIIZZ(matchSettingsInfo);
            if (multiMatchPrepareResponse == null || (list = multiMatchPrepareResponse.giftMode) == null) {
                list = C13BV.INSTANCE;
            }
            interfaceC975810bV5LIZLLL.LJJIIJ(list);
            Integer num = (Integer) interfaceC975810bV5LIZLLL.LJIILLIIL().getValue();
            if (num != null && num.intValue() == 1 && C156900it.LJIIJJI(interfaceC975810bV5LIZLLL.LIZIZ())) {
                interfaceC975810bV5LIZLLL.LJJIIJZLJL(null, true, true);
            }
        }
    }

    public static void LJIIIIZZ(int i, String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(MatchStatusRestEvent.class, Integer.valueOf(i));
        }
        if (i != 1) {
            if (i != 2) {
                LIZ.LJLILLLLZI(str, false);
                LIZIZ.LJLILLLLZI(str, true);
                LJIIIZ = EnumC919170a1j.UNKNOWN;
                return;
            }
            LIZIZ.LJLILLLLZI(str, true);
            return;
        }
        LIZ.LJLILLLLZI(str, false);
        LJIIIZ = EnumC919170a1j.UNKNOWN;
    }
}
