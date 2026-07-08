package X;

import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.EffectingCard;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974480bSw extends C944730agx {
    public static boolean LIZIZ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static final C974480bSw LIZ = new C974480bSw();
    public static final List<String> LIZJ = new ArrayList();

    static {
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        LIZLLL = System.currentTimeMillis();
        LJ = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<com.bytedance.android.livesdk.model.message.battle.BattleResult, com.bytedance.android.livesdk.model.message.battle.BattleResult> LJIJI(java.util.Map<java.lang.Long, com.bytedance.android.livesdk.model.message.battle.BattleResult> r10) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            boolean r0 = com.bytedance.android.livesdkapi.depend.model.live.Room.isValid(r1)
            r9 = 0
            if (r0 == 0) goto L6c
            if (r1 == 0) goto L6a
            long r0 = r1.getOwnerUserId()
        L17:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L1b:
            if (r10 == 0) goto L68
            java.lang.Object r6 = r10.get(r8)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LJIJJ()
            java.util.Iterator r7 = r0.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r5 = r7.next()
            r0 = r5
            X.0awe r0 = (X.C954460awe) r0
            long r3 = r0.LJ
            if (r8 == 0) goto L46
            long r1 = r8.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
        L46:
            r9 = r5
        L47:
            X.0awe r9 = (X.C954460awe) r9
            if (r9 == 0) goto L5b
            long r0 = r9.LJ
        L4d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r9 = r10.get(r0)
        L55:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r9)
            return r0
        L5b:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0aym r0 = r0.LJIIJ()
            long r0 = r0.LLJJJIL()
            goto L4d
        L68:
            r6 = r9
            goto L55
        L6a:
            r8 = r9
            goto L1b
        L6c:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974480bSw.LJIJI(java.util.Map):kotlin.Pair");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LJIJJ(String str) {
        switch (str.hashCode()) {
            case -1758566754:
                if (!str.equals("battle_expired")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            case -1231931002:
                if (!str.equals("coHost_identified")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            case -942110601:
                if (!str.equals("room_enter_identify")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            case 223250167:
                if (!str.equals("sei_identify_succeed")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            case 1591260759:
                if (!str.equals("sei_identify_start")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            case 1694949608:
                if (!str.equals("sei_identify_failed")) {
                    return "ttlive_client_audience_match_monitor";
                }
                return "ttlive_client_audience_match_identify_monitor";
            default:
                return "ttlive_client_audience_match_monitor";
        }
    }

    public final void LJIJJLI(BattleInfoResponse battleInfoResponse) {
        Map<Long, BattleResult> map;
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        if (battleInfoResponse != null) {
            Long l = battleInfoResponse.battleId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C0K04.LJ("battle_id", jLongValue, jSONObject);
        }
        Map<Long, BattleResult> map2 = null;
        if (battleInfoResponse != null) {
            map = battleInfoResponse.resultMap;
        } else {
            map = null;
        }
        Pair<BattleResult, BattleResult> pairLJIJI = LJIJI(map);
        LJIILLIIL(jSONObject, pairLJIJI.getFirst(), pairLJIJI.getSecond());
        if (battleInfoResponse != null && battleInfoResponse.resultMap != null) {
            Gson gson = C19748512Ol.LIZJ;
            if (battleInfoResponse != null) {
                map2 = battleInfoResponse.resultMap;
            }
            C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(gson, map2), jSONObject);
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, "room_enter", jSONObject);
        LJJIIJ(0, "update_result", jSONObject);
    }

    public static final void LJIIZILJ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    C0K04.LIZLLL(((Number) obj).intValue(), next, jSONObject2);
                } else if (obj instanceof Long) {
                    C0K04.LJ(next, ((Number) obj).longValue(), jSONObject2);
                } else if (obj instanceof String) {
                    C0K04.LJFF(next, (String) obj, jSONObject2);
                } else if (obj instanceof Boolean) {
                    C0K04.LJIIIZ(jSONObject2, next, ((Boolean) obj).booleanValue());
                } else {
                    jSONObject2.putOpt(next, obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZLLL("msg error: metric shouldn't set this type value, else adapt in this");
            }
        }
    }

    public static final void LJIJ(JSONObject jSONObject, boolean z) {
        String str;
        long jLJ = C978520bZS.LJ(z);
        if (jLJ != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_gift_only", str, jSONObject);
        C0K04.LJ("only_gift_id", jLJ, jSONObject);
    }

    public static final void LJJIFFI(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C974480bSw c974480bSw = LIZ;
        C944730agx.LJIIL(th, jSONObject);
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZLLL, jSONObject);
        LJIJ(jSONObject, false);
        c974480bSw.LJJIIJ(1, "battle_info_failed", jSONObject);
    }

    public final void LJIILL(JSONObject jSONObject, C974450bSt c974450bSt) {
        InterfaceC2262081DgM currentUser;
        String idStr;
        long id;
        long ownerUserId;
        String str;
        long channelId;
        LiveMode streamType;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        String strLIZ = null;
        if (interfaceC500940JkiUser != null) {
            currentUser = interfaceC500940JkiUser.getCurrentUser();
        } else {
            currentUser = null;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (Room.isValid(room)) {
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
        } else {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("room_id", idStr, jSONObject);
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        C0K04.LJFF("live_type", strLIZ, jSONObject);
        if (!jSONObject.has("channel_id")) {
            if (C915980Zwa.LJI().LJIIJ().getChannelId() == 0) {
                channelId = c974450bSt.LJJ;
            } else {
                channelId = C915980Zwa.LJI().LJIIJ().getChannelId();
            }
            C0K04.LJ("channel_id", channelId, jSONObject);
        }
        if (!jSONObject.has("battle_id")) {
            C0K04.LJ("battle_id", c974450bSt.LJLIIIL(), jSONObject);
        }
        if (currentUser != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        if (Room.isValid(room) && room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C0K04.LJFF("current_user_id", C501590Jll.LIZ(), jSONObject);
        C0K04.LJ("current_anchor_id", ownerUserId, jSONObject);
        if (!jSONObject.has("guest_anchor_id")) {
            C0K04.LJ("guest_anchor_id", C915980Zwa.LJI().LJIIJ().LLJJJIL(), jSONObject);
        }
        if (!jSONObject.has("role_type")) {
            if (id > 0 && ownerUserId > 0 && id == ownerUserId) {
                if (c974450bSt.LJI) {
                    str = "inviter";
                } else {
                    str = "invitee";
                }
            } else {
                str = "audience";
            }
            C0K04.LJFF("role_type", str, jSONObject);
        }
        if (!jSONObject.has("battle_time")) {
            C0K04.LJ("battle_time", c974450bSt.LJIIZILJ, jSONObject);
        }
        if (!jSONObject.has("punish_time")) {
            C0K04.LJ("punish_time", c974450bSt.LJIJ, jSONObject);
        }
        C0K04.LJFF("uid_list", C13LP.LJJLIIIJ(C915980Zwa.LJII().LLILZLL(true), ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(187), 30), jSONObject);
        C944730agx.LJIILIIL(jSONObject);
        C985690bl1.LIZ.getClass();
        C0K04.LIZLLL(C985690bl1.LJ, "game_resource_status", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(org.json.JSONObject r8, com.bytedance.android.livesdk.model.message.battle.BattleResult r9, com.bytedance.android.livesdk.model.message.battle.BattleResult r10) {
        /*
            r2 = 0
            if (r9 == 0) goto L6c
            long r0 = r9.score
        L6:
            if (r10 == 0) goto La
            long r2 = r10.score
        La:
            if (r9 == 0) goto L6a
            int r4 = r9.result
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L12:
            r6 = 1
            r5 = 2
            if (r7 == 0) goto L67
            int r4 = r7.intValue()
            if (r4 != r5) goto L55
            java.lang.String r7 = "draw"
        L1e:
            java.lang.String r4 = "result"
            X.C0K04.LJFF(r4, r7, r8)
            java.lang.String r4 = "left_score"
            X.C0K04.LJ(r4, r0, r8)
            java.lang.String r0 = "right_score"
            X.C0K04.LJ(r0, r2, r8)
            java.lang.String r0 = "final_result"
            X.C0K04.LJFF(r0, r7, r8)
            X.0bSt r0 = X.C973890bRz.LIZ
            r0.getClass()
            X.0bCJ r0 = r0.LJLIL()
            int[] r1 = X.C948520an4.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L52
            if (r0 == r5) goto L4f
            java.lang.String r1 = "other"
        L49:
            java.lang.String r0 = "current_status"
            X.C0K04.LJFF(r0, r1, r8)
            return
        L4f:
            java.lang.String r1 = "punishing"
            goto L49
        L52:
            java.lang.String r1 = "linked"
            goto L49
        L55:
            int r4 = r7.intValue()
            if (r4 != 0) goto L5e
            java.lang.String r7 = "win"
            goto L1e
        L5e:
            int r4 = r7.intValue()
            if (r4 != r6) goto L67
            java.lang.String r7 = "lost"
            goto L1e
        L67:
            java.lang.String r7 = "none"
            goto L1e
        L6a:
            r7 = 0
            goto L12
        L6c:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974480bSw.LJIILLIIL(org.json.JSONObject, com.bytedance.android.livesdk.model.message.battle.BattleResult, com.bytedance.android.livesdk.model.message.battle.BattleResult):void");
    }

    public final void LJJI(String str, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("source", str, jSONObject);
        LJIJ(jSONObject, z2);
        if (z) {
            LJJIII(this, "data_reset", jSONObject, z2, 56);
        } else {
            LJJIIJ(0, "data_reset", jSONObject);
        }
    }

    public final void LJJIIJ(int i, String str, JSONObject jSONObject) {
        LJIILL(jSONObject, C973890bRz.LIZ);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LIZLLL(LIZIZ ? 1 : 0, "is_sdk", jSONObject);
        String strLJIJJ = LJIJJ(str);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
        C0K04.LIZLLL(1, "new_arch_control", new JSONObject());
        C0K04.LJFF("match_progress_opt", "1", jSONObject);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(strLJIJJ)) {
            C1CC2.LJIIIIZZ(strLJIJJ, i, jSONObject);
        }
        C962910bAH.LIZJ(str, jSONObject, null, null, false, 1, false);
    }

    public static final void LJJII(String str, BattleInfoResponse battleInfoResponse, boolean z, boolean z2) {
        boolean z3;
        int i;
        long j;
        JSONObject jSONObject = new JSONObject();
        Gson gson = C19748512Ol.LIZJ;
        C0K04.LJFF("response", GsonProtectorUtils.toJson(gson, battleInfoResponse), jSONObject);
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject);
        C0K04.LJ("cost", System.currentTimeMillis() - LIZLLL, jSONObject);
        C974480bSw c974480bSw = LIZ;
        if (z) {
            z3 = z2;
        } else {
            z3 = false;
        }
        LJIJ(jSONObject, z3);
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "battle_status", jSONObject);
        Pair<BattleResult, BattleResult> pairLJIJI = LJIJI(battleInfoResponse.resultMap);
        LJIILLIIL(jSONObject, pairLJIJI.getFirst(), pairLJIJI.getSecond());
        if (Intrinsics.LJFF(str, "audience_result")) {
            C0K04.LIZLLL(C974520bT0.LIZIZ ? 1 : 0, "time_calibrated", jSONObject);
            C0K04.LJ("min_half_rtt", C974520bT0.LIZ, jSONObject);
            C0K04.LJ("time_before_calibrated", System.currentTimeMillis(), jSONObject);
            C0K04.LJ("time_after_calibrated", C974520bT0.LIZ(), jSONObject);
            C0K04.LJ("calibrated_diff", C974520bT0.LIZ() - System.currentTimeMillis(), jSONObject);
            C0K04.LJ("t3_current_diff_time", C974520bT0.LJ - C974520bT0.LJFF, jSONObject);
            C0K04.LJFF("calibrated_log_id", C974520bT0.LIZJ, jSONObject);
            C0K04.LJFF("calibrated_path", C974520bT0.LIZLLL, jSONObject);
            C0K04.LJ("calibrated_t3_time", C974520bT0.LJ, jSONObject);
            C0K04.LJ("calibrated_update_interval", System.currentTimeMillis() - C974520bT0.LJFF, jSONObject);
            BattleSetting battleSetting2 = C973890bRz.LIZ.LJ;
            if (battleSetting2 != null) {
                j = battleSetting2.startTimeMs;
            } else {
                j = 0;
            }
            C0K04.LJ("server_start_time", j, jSONObject);
        }
        if (z) {
            LJJIII(c974480bSw, "battle_info_succeed", jSONObject, z2, 56);
        } else {
            c974480bSw.LJJIIJ(0, "battle_info_succeed", jSONObject);
        }
        Map<Long, BattleResult> map = battleInfoResponse.resultMap;
        if (map != null) {
            C0K04.LJFF("battle_result", GsonProtectorUtils.toJson(gson, map), jSONObject);
        }
        Map<Long, EffectingCard> map2 = battleInfoResponse.battleItemCards;
        if (map2 != null && !map2.isEmpty()) {
            C0K04.LJFF("battle_item_cards", GsonProtectorUtils.toJson(gson, battleInfoResponse.battleItemCards), jSONObject);
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, "battle_info", jSONObject);
        if (!z) {
            c974480bSw.LJJIIJ(0, "update_result", jSONObject);
        }
    }

    public final void LJJIIJZLJL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJIILL(jSONObject, C973890bRz.LIZ);
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LIZLLL(LIZIZ ? 1 : 0, "is_sdk", jSONObject);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c917350Zyn.getClass();
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
        C0K04.LJFF("match_type", C917350Zyn.LIZJ(C915980Zwa.LJFF().xB0()), jSONObject2);
        LJIIZILJ(jSONObject3, jSONObject);
        String strLJIJJ = LJIJJ(str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(strLJIJJ)) {
            C1CC2.LJI(strLJIJJ, jSONObject2, jSONObject3, jSONObject);
        }
        C962910bAH.LIZJ(str, jSONObject, jSONObject2, jSONObject3, false, 1, false);
    }

    public static void LJJ(DataChannel dataChannel, List list, C974530bT1 c974530bT1, EnumC976420bW4 enumC976420bW4, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                BattleTeamResult battleTeamResult = (BattleTeamResult) obj;
                Long l = battleTeamResult.teamId;
                linkedHashMap.put(Long.valueOf(l != null ? l.longValue() : i2), battleTeamResult);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJIL(dataChannel, linkedHashMap, c974530bT1, enumC976420bW4, z, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(X.C974480bSw r6, java.lang.String r7, org.json.JSONObject r8, boolean r9, int r10) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974480bSw.LJJIII(X.0bSw, java.lang.String, org.json.JSONObject, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121 A[PHI: r2
      0x0121: PHI (r2v2 long) = (r2v1 long), (r2v9 long) binds: [B:60:0x011d, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(com.bytedance.ies.sdk.datachannel.DataChannel r15, java.util.Map r16, X.C974530bT1 r17, X.EnumC976420bW4 r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974480bSw.LJIL(com.bytedance.ies.sdk.datachannel.DataChannel, java.util.Map, X.0bT1, X.0bW4, boolean, boolean):void");
    }
}
