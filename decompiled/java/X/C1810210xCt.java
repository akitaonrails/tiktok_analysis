package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810210xCt {
    public static long LIZ;
    public static final HashMap<Pair<Integer, Integer>, Long> LIZIZ = new HashMap<>();
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static final HashMap<Pair<Integer, Integer>, Long> LJ = new HashMap<>();
    public static final HashMap<Pair<Integer, Integer>, Long> LJFF = new HashMap<>();
    public static final HashMap<Pair<Integer, Integer>, Long> LJI = new HashMap<>();
    public static final HashMap<Pair<Integer, Integer>, Long> LJII = new HashMap<>();
    public static final HashMap<Pair<Integer, Integer>, Integer> LJIIIIZZ = new HashMap<>();
    public static String LJIIIZ = "room_entrance_click";
    public static DataChannel LJIIJ;

    public static void LJIIIIZZ() {
        LIZJ = -1;
        LIZ = 0L;
        LJ.clear();
        LJFF.clear();
        LJI.clear();
        LJII.clear();
        LIZIZ.clear();
        LJIIIIZZ.clear();
        LJIIJ = null;
        LJIIIZ = "room_entrance_click";
    }

    public static void LIZLLL(int i, int i2) {
        LJ.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
        LJIIIIZZ.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Integer.valueOf(EnumC1779460wPI.LOADING.getType()));
    }

    public static void LJFF(int i, int i2, boolean z) {
        HashMap<Pair<Integer, Integer>, Long> map = LIZIZ;
        if (map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2))) == null) {
            map.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            if (z) {
                LIZJ = i;
                LIZLLL = i2;
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, int i, int i2, List list) {
        String str;
        long id;
        String string;
        long jLongValue;
        RoomAuthStatus roomAuthStatus;
        C0K04.LJIIIZ(jSONObject, "use_simple_user", true);
        C0K04.LJIIIZ(jSONObject, "layout_optimize", true);
        C0K04.LJIIIZ(jSONObject, "data_cache", true);
        if (i == LIZJ && i2 == LIZLLL) {
            str = "first_appear";
        } else {
            str = "switch_tab";
        }
        C0K04.LJFF("show_type", str, jSONObject);
        DataChannel dataChannel = LJIIJ;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C0K04.LJ("room_id", id, jSONObject);
            Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            }
            C0K04.LJ("anchor_id", ownerUserId, jSONObject);
            C0K04.LJ("user_id", UserService.getInstance().user().getCurrentUserId(), jSONObject);
            int giftRankSwitchStatus = -1;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                    sb.append(C235000vU.LIZ(((RankTabInfo) ListProtector.get(list, i3)).rankType, ((RankTabInfo) ListProtector.get(list, i3)).LIZIZ).rankName);
                    if (i3 != list.size() - 1) {
                        sb.append(", ");
                    }
                }
                string = sb.toString();
            } else {
                string = "";
            }
            C0K04.LJFF("current_all_rank_type", string, jSONObject);
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                C0K04.LIZLLL(1, "is_anchor", jSONObject);
                Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
                if (room3 != null && (roomAuthStatus = room3.mRoomAuthStatus) != null) {
                    giftRankSwitchStatus = roomAuthStatus.getGiftRankSwitchStatus();
                }
                C0K04.LIZLLL(giftRankSwitchStatus, "opt_out_enable", jSONObject);
            } else {
                C0K04.LIZLLL(0, "is_anchor", jSONObject);
                Long l = (Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                C0K04.LJ("opt_out_enable", jLongValue, jSONObject);
            }
            C501590Jll.LJFF(jSONObject);
        }
    }

    public static void LIZJ(int i, int i2, EnumC1811400xEo enumC1811400xEo, RankTypeV2 rankTypeV2, List list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        C0K04.LJFF("current_entity_rank_type", C235000vU.LIZ(i, i2).rankName, jSONObject);
        C0K04.LJFF("current_entrance_rank_type", rankTypeV2.rankName, jSONObject);
        C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
        LIZ(jSONObject3, i, i2, list);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_ranklist_entity_gift_panel_click", jSONObject, jSONObject2, jSONObject4);
    }

    public static void LIZIZ(int i, int i2, EnumC1811400xEo enumC1811400xEo, int i3, int i4, List list) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        HashMap<Pair<Integer, Integer>, Long> map = LJFF;
        if (!map.containsKey(new Pair(Integer.valueOf(i), Integer.valueOf(i2))) || !LJI.containsKey(new Pair(Integer.valueOf(i), Integer.valueOf(i2)))) {
            map.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            long jLongValue8 = 0;
            LJI.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), 0L);
            LJIIIIZZ.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Integer.valueOf(EnumC1779460wPI.ERROR.getType()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            C0K04.LJFF("current_entity_rank_type", C235000vU.LIZ(i, i2).rankName, jSONObject);
            C0K04.LJFF("current_entrance_rank_type", C235000vU.LIZ(i3, i4).rankName, jSONObject);
            C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
            LIZ(jSONObject3, i, i2, list);
            Long l = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            HashMap<Pair<Integer, Integer>, Long> map2 = LJ;
            Long l2 = map2.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            C0K04.LJ("event_duration", jLongValue - jLongValue2, jSONObject2);
            Long l3 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            } else {
                jLongValue3 = 0;
            }
            Long l4 = map2.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l4 != null) {
                jLongValue4 = l4.longValue();
            } else {
                jLongValue4 = 0;
            }
            C0K04.LJ("event_duration", jLongValue3 - jLongValue4, jSONObject3);
            Long l5 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l5 != null) {
                jLongValue5 = l5.longValue();
            } else {
                jLongValue5 = 0;
            }
            HashMap<Pair<Integer, Integer>, Long> map3 = LIZIZ;
            Long l6 = map3.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l6 != null) {
                jLongValue6 = l6.longValue();
            } else {
                jLongValue6 = 0;
            }
            C0K04.LJ("event_duration_all", jLongValue5 - jLongValue6, jSONObject2);
            Long l7 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l7 != null) {
                jLongValue7 = l7.longValue();
            } else {
                jLongValue7 = 0;
            }
            Long l8 = map3.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l8 != null) {
                jLongValue8 = l8.longValue();
            }
            C0K04.LJ("event_duration_all", jLongValue7 - jLongValue8, jSONObject3);
            C0K04.LJII("extra", jSONObject4, jSONObject3);
            C1CC2.LJ("ttlive_ranklist_entity_is_null", jSONObject, jSONObject2, jSONObject4);
        }
    }

    public static void LJII(RankListV2Response.RankInfo rankInfo, String str, RankTypeV2 rankTypeV2, EnumC1811400xEo enumC1811400xEo, RankTypeV2 rankTypeV22, List list) {
        long id;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LJFF("current_entity_rank_type", rankTypeV2.rankName, jSONObject);
        C0K04.LJFF("current_entrance_rank_type", rankTypeV22.rankName, jSONObject);
        C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
        LIZ(jSONObject3, rankTypeV2.type, rankTypeV2.rankPhase, list);
        C0K04.LJFF("use_type", str, jSONObject3);
        User user = rankInfo.user;
        long jLongValue4 = 0;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        C0K04.LJ("target_user_id", id, jSONObject3);
        if (Intrinsics.LJFF(str, "enter_room")) {
            C0K04.LJ("target_room_id", rankInfo.roomId, jSONObject3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZ = jCurrentTimeMillis;
        HashMap<Pair<Integer, Integer>, Long> map = LJ;
        Long l = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C0K04.LJ("event_duration", jCurrentTimeMillis - jLongValue, jSONObject2);
        long j = LIZ;
        Long l2 = map.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        C0K04.LJ("event_duration", j - jLongValue2, jSONObject3);
        long j2 = LIZ;
        HashMap<Pair<Integer, Integer>, Long> map2 = LIZIZ;
        Long l3 = map2.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        C0K04.LJ("event_duration_all", j2 - jLongValue3, jSONObject2);
        long j3 = LIZ;
        Long l4 = map2.get(new Pair(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)));
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        }
        C0K04.LJ("event_duration_all", j3 - jLongValue4, jSONObject3);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_ranklist_entity_user_click", jSONObject, jSONObject2, jSONObject4);
    }

    public static void LJ(int i, int i2, EnumC1811400xEo enumC1811400xEo, int i3, int i4, List list, int i5) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        HashMap<Pair<Integer, Integer>, Long> map = LJFF;
        if (!map.containsKey(new Pair(Integer.valueOf(i), Integer.valueOf(i2)))) {
            map.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            C0K04.LJFF("current_entity_rank_type", C235000vU.LIZ(i, i2).rankName, jSONObject);
            C0K04.LJFF("current_entrance_rank_type", C235000vU.LIZ(i3, i4).rankName, jSONObject);
            C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
            LIZ(jSONObject3, i, i2, list);
            C0K04.LJFF("event_name", "event_request", jSONObject);
            C0K04.LIZLLL(i5, "response_size", jSONObject3);
            Long l = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            long jLongValue8 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            HashMap<Pair<Integer, Integer>, Long> map2 = LJ;
            Long l2 = map2.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            C0K04.LJ("event_duration", jLongValue - jLongValue2, jSONObject2);
            Long l3 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            } else {
                jLongValue3 = 0;
            }
            Long l4 = map2.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l4 != null) {
                jLongValue4 = l4.longValue();
            } else {
                jLongValue4 = 0;
            }
            C0K04.LJ("event_duration", jLongValue3 - jLongValue4, jSONObject3);
            Long l5 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l5 != null) {
                jLongValue5 = l5.longValue();
            } else {
                jLongValue5 = 0;
            }
            HashMap<Pair<Integer, Integer>, Long> map3 = LIZIZ;
            Long l6 = map3.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l6 != null) {
                jLongValue6 = l6.longValue();
            } else {
                jLongValue6 = 0;
            }
            C0K04.LJ("event_duration_all", jLongValue5 - jLongValue6, jSONObject2);
            Long l7 = map.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l7 != null) {
                jLongValue7 = l7.longValue();
            } else {
                jLongValue7 = 0;
            }
            Long l8 = map3.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l8 != null) {
                jLongValue8 = l8.longValue();
            }
            C0K04.LJ("event_duration_all", jLongValue7 - jLongValue8, jSONObject3);
            C0K04.LJII("extra", jSONObject4, jSONObject3);
            C1CC2.LJ("ttlive_ranklist_entity_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0245 A[PHI: r0
      0x0245: PHI (r0v86 java.lang.String) = (r0v73 java.lang.String), (r0v84 java.lang.String), (r0v96 java.lang.String) binds: [B:67:0x0242, B:53:0x0207, B:41:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.Throwable r12, int r13, int r14, X.EnumC1811400xEo r15, int r16, int r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1810210xCt.LJI(java.lang.Throwable, int, int, X.0xEo, int, int, java.util.List):void");
    }
}
