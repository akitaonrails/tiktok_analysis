package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.CrossScreenSeiInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136370fg3 {
    public static final C1136370fg3 LIZ = new C1136370fg3();

    public static String LIZLLL() {
        return C2640010k.LIZIZ() ? "_anchor" : C1128450fTH.LJJIJ() ? "_guest" : "";
    }

    public static Map LIZ(InterfaceC1136020ffU interfaceC1136020ffU, C1136540fgK c1136540fgK) {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        if (interfaceC1136020ffU == null) {
            return C2097608Jq.LJ();
        }
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
        long j5 = 0;
        if (interactiveGiftInfoLJJIII != null) {
            j = interactiveGiftInfoLJJIII.crossScreenRole;
        } else {
            j = 0;
        }
        if (j != 0) {
            i = 1;
        } else {
            i = 0;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_cross_screen_gift", Integer.valueOf(i)), new Pair("gift_id", Long.valueOf(interfaceC1136020ffU.getGiftId())), new Pair("current_user_team_id", Long.valueOf(C1128450fTH.LJIILIIL())), new Pair("sticker_scene", C1128450fTH.LJIIJ().getDesc()));
        if (i != 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("cross_screen_role", Long.valueOf(j));
            if (c1136540fgK != null) {
                j2 = c1136540fgK.LJIIIIZZ;
            } else {
                j2 = 0;
            }
            pairArr[1] = new Pair("cross_screen_selected_effect_id", Long.valueOf(j2));
            if (c1136540fgK != null && c1136540fgK.LJIIIZ) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            pairArr[2] = new Pair("is_single_action", Long.valueOf(j3));
            if (interactiveGiftInfoLJJIII != null) {
                j4 = interactiveGiftInfoLJJIII.uniqId;
            } else {
                j4 = 0;
            }
            pairArr[3] = new Pair("cross_screen_order_id", Long.valueOf(j4));
            if (interactiveGiftInfoLJJIII != null) {
                j5 = interactiveGiftInfoLJJIII.toUserTeamId;
            }
            pairArr[4] = new Pair("gift_recipient_team_id", Long.valueOf(j5));
            mapLJIIJ.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            if (c1136540fgK != null) {
                mapLJIIJ.putAll(C2097608Jq.LJIIJ(new Pair("source", c1136540fgK.LJIIJ), new Pair("alternate_source_status", c1136540fgK.LJIIJJI)));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public static Map LIZJ(GiftMessage giftMessage, C1136540fgK c1136540fgK) {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        if (giftMessage == null) {
            return C2097608Jq.LJ();
        }
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
        long j5 = 0;
        if (interactiveGiftInfo != null) {
            j = interactiveGiftInfo.crossScreenRole;
        } else {
            j = 0;
        }
        if (j != 0) {
            i = 1;
        } else {
            i = 0;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_cross_screen_gift", Integer.valueOf(i)), new Pair("gift_id", Long.valueOf(giftMessage.giftId)), new Pair("current_user_team_id", Long.valueOf(C1128450fTH.LJIILIIL())), new Pair("sticker_scene", C1128450fTH.LJIIJ().getDesc()));
        if (i != 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("cross_screen_role", Long.valueOf(j));
            if (c1136540fgK != null) {
                j2 = c1136540fgK.LJIIIIZZ;
            } else {
                j2 = 0;
            }
            pairArr[1] = new Pair("cross_screen_selected_effect_id", Long.valueOf(j2));
            if (c1136540fgK != null && c1136540fgK.LJIIIZ) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            pairArr[2] = new Pair("is_single_action", Long.valueOf(j3));
            if (interactiveGiftInfo != null) {
                j4 = interactiveGiftInfo.uniqId;
            } else {
                j4 = 0;
            }
            pairArr[3] = new Pair("cross_screen_order_id", Long.valueOf(j4));
            if (interactiveGiftInfo != null) {
                j5 = interactiveGiftInfo.toUserTeamId;
            }
            pairArr[4] = new Pair("gift_recipient_team_id", Long.valueOf(j5));
            mapLJIIJ.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            if (c1136540fgK != null) {
                mapLJIIJ.putAll(C2097608Jq.LJIIJ(new Pair("source", c1136540fgK.LJIIJ), new Pair("alternate_source_status", c1136540fgK.LJIIJJI)));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    public static void LJ(String str, JSONObject jSONObject) {
        C1CC2.LIZJ(str, jSONObject, new JSONObject(), new JSONObject());
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(CrossScreenSeiInfo crossScreenSeiInfo, long j) {
        try {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("sei_receive_timestamp", Long.valueOf(j)), new Pair("sei_latency", Long.valueOf(j - crossScreenSeiInfo.seiWriteTimestamp)));
            mapLJIIJ.putAll(LIZIZ(crossScreenSeiInfo, 2L, 0L, false));
            JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(mapLJIIJ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gift_cross_screen_sei_receive");
            sbLIZ.append(LIZLLL());
            LJ(C2188811AlT.LIZIZ(sbLIZ), jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJI(GiftMessage giftMessage, String str) {
        try {
            JSONObject jSONObject = new JSONObject(LIZJ(giftMessage, null));
            try {
                C1135800ff8.LIZJ(giftMessage, jSONObject, jSONObject);
                jSONObject.put("ignore_type", str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            User user = giftMessage.fromUser;
            if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                LJ("gift_tray_ignore_self", jSONObject);
            }
            LJ("gift_tray_ignore".concat(LIZLLL()), jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static Map LIZIZ(CrossScreenSeiInfo crossScreenSeiInfo, long j, long j2, boolean z) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_cross_screen_gift", 1), new Pair("cross_screen_role", Long.valueOf(j)), new Pair("cross_screen_selected_effect_id", Long.valueOf(j2)), new Pair("is_single_action", Integer.valueOf(z ? 1 : 0)), new Pair("gift_id", Long.valueOf(crossScreenSeiInfo.giftId)), new Pair("price", Integer.valueOf(crossScreenSeiInfo.price)), new Pair("duration", Long.valueOf(crossScreenSeiInfo.duration)), new Pair("cross_screen_order_id", Long.valueOf(crossScreenSeiInfo.crossScreenId)), new Pair("gift_recipient_team_id", Long.valueOf(crossScreenSeiInfo.teamId)), new Pair("current_user_team_id", Long.valueOf(C1128450fTH.LJIILIIL())), new Pair("repeat_count", Integer.valueOf(crossScreenSeiInfo.repeatCount)), new Pair("sei_write_timestamp", Long.valueOf(crossScreenSeiInfo.seiWriteTimestamp)), new Pair("sticker_scene", C1128450fTH.LJIIJ().getDesc()));
        C1135180fe8.LIZJ(mapLJIIJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
