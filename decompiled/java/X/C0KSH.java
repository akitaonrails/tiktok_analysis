package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KSH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSH {
    public static int LIZ;
    public static String LIZIZ = "";
    public static boolean LIZJ;
    public static long LIZLLL;

    public static Map LIZ(Throwable th) {
        Pair[] pairArr = new Pair[4];
        String strLJ = C512300K7g.LJ(th);
        String str = "";
        if (strLJ == null) {
            strLJ = "";
        }
        pairArr[0] = new Pair("log_id", strLJ);
        pairArr[1] = new Pair("error_code", String.valueOf(C512300K7g.LIZIZ(th)));
        pairArr[2] = new Pair("detail_error_code", String.valueOf(C512300K7g.LIZIZ(th)));
        String strLIZLLL = C512300K7g.LIZLLL(th);
        if (strLIZLLL == null) {
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
        } else {
            str = strLIZLLL;
        }
        pairArr[3] = new Pair("detail_error_msg", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LIZIZ(C0KP3 c0kp3) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("source", "super_fan");
        if (c0kp3.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("payment_type", str);
        pairArr[2] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        pairArr[3] = new Pair("to_user_id", c0kp3.LJIIIIZZ);
        pairArr[4] = new Pair("source_page", c0kp3.LJIIL);
        pairArr[5] = new Pair("enter_from", c0kp3.LJIILIIL);
        int i = c0kp3.LJII;
        if (i == 5) {
            str2 = "treasure_box";
        } else if (i == 1) {
            str2 = "purchase";
        } else if (i == 2) {
            str2 = "renew";
        } else {
            str2 = "";
        }
        pairArr[6] = new Pair("action_type", str2);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static Map LIZJ(C0KSK c0ksk) {
        String str;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("source", "super_fan");
        if (c0ksk.LJIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("payment_type", str);
        pairArr[2] = new Pair("user_id", String.valueOf(c0ksk.LIZ));
        pairArr[3] = new Pair("to_user_id", String.valueOf(c0ksk.LIZIZ));
        pairArr[4] = new Pair("source_page", c0ksk.LJII);
        pairArr[5] = new Pair("enter_from", c0ksk.LJIIIIZZ);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LJIIIZ(DataChannel dataChannel, String str) {
        long jLIZIZ;
        LIZLLL = System.currentTimeMillis();
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_fetch_package_start");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        "1".toString();
        map.put("payment_type", "1");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJIILJJIL(DataChannel dataChannel, String str) {
        long jLIZIZ;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_fans_club_superfan_purchase_page_retry_click");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        "1".toString();
        map.put("payment_type", "1");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LIZLLL(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_contract_status_result");
        c512030K6fLIZ.LIZLLL.putAll(map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        LJIIJJI(i, "contract_finish", map, z);
    }

    public static void LJ(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_create_contract_result");
        c512030K6fLIZ.LIZLLL.putAll(map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        if (!z) {
            LJIIJJI(i, "create_contract", map, false);
        }
    }

    public static void LJFF(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_fetch_product_result");
        c512030K6fLIZ.LIZLLL.putAll(map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJI(int i, boolean z, Map map) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_iap_result");
        c512030K6fLIZ.LIZLLL.putAll(map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        if (!z) {
            LJIIJJI(i, "iap", map, false);
        }
    }

    public static void LJIIIIZZ(DataChannel dataChannel, String str, boolean z) {
        long jLIZIZ;
        String str2;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_fetch_package_result");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        String str3 = "1";
        "1".toString();
        map.put("payment_type", "1");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map3.put("is_success", str2);
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis() - LIZLLL), "duration");
        if (!LIZJ) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map4 = c512030K6fLIZ.LIZLLL;
        str3.toString();
        map4.put("is_retry", str3);
        if (!z) {
            c512030K6fLIZ.LIZ(Integer.valueOf(LIZ), "error_code");
            c512030K6fLIZ.LIZ(LIZIZ, "error_msg");
        }
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        if (LIZJ) {
            LIZJ = false;
        }
    }

    public static void LJIILL(DataChannel dataChannel, String str, boolean z) {
        String str2;
        long jLIZIZ;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_package_page_clicked");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        "1".toString();
        map.put("payment_type", "1");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map2.put("purchase_enable", str2);
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map3.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        long jLIZIZ2 = 0;
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        if (Intrinsics.LJFF("1", "1")) {
            jLIZIZ2 = UserService.getInstance().user().getCurrentUserId();
        } else if (dataChannel != null) {
            jLIZIZ2 = C500260Jjc.LIZIZ(dataChannel);
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ2), "to_user_id");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJIIJ(DataChannel dataChannel, String str, boolean z, boolean z2) {
        long jLIZIZ;
        String str2;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_fans_club_superfan_purchase_page_loaded");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        String str3 = "1";
        "1".toString();
        map.put("payment_type", "1");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map3.put("is_success", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map4 = c512030K6fLIZ.LIZLLL;
        str3.toString();
        map4.put("enable_purchase", str3);
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJIIJJI(int i, String str, Map map, boolean z) {
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_payment_result");
        c512030K6fLIZ.LIZLLL.putAll(map);
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("stage", str);
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJIILIIL(DataChannel dataChannel, String str, String str2, String str3) {
        long jLIZIZ;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_start_purchase_super_fan");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        str.toString();
        map.put("payment_type", str);
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map2.put("action_type", str2);
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str3.toString();
        map3.put("enter_from", str3);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        long jLIZIZ2 = 0;
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        if (Intrinsics.LJFF(str, "1")) {
            jLIZIZ2 = UserService.getInstance().user().getCurrentUserId();
        } else if (dataChannel != null) {
            jLIZIZ2 = C500260Jjc.LIZIZ(dataChannel);
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ2), "to_user_id");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJII(long j, DataChannel dataChannel, String str, boolean z, boolean z2) {
        long jLIZIZ;
        String str2;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_package_page_close");
        Map<String, String> map = c512030K6fLIZ.LIZLLL;
        String str3 = "1";
        "1".toString();
        map.put("payment_type", "1");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("enter_from", str);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        c512030K6fLIZ.LIZ(Long.valueOf(j), "duration");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map3.put("in_purchase", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, String> map4 = c512030K6fLIZ.LIZLLL;
        str3.toString();
        map4.put("is_loading", str3);
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }

    public static void LJIIL(DataChannel dataChannel, String str, String str2, String str3, int i, boolean z, String str4, Map map) {
        long jLIZIZ;
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_superfan_payment_result");
        Map<String, String> map2 = c512030K6fLIZ.LIZLLL;
        str.toString();
        map2.put("payment_type", str);
        Map<String, String> map3 = c512030K6fLIZ.LIZLLL;
        str2.toString();
        map3.put("action_type", str2);
        Map<String, String> map4 = c512030K6fLIZ.LIZLLL;
        str3.toString();
        map4.put("enter_from", str3);
        c512030K6fLIZ.LIZ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        long jLIZIZ2 = 0;
        if (dataChannel != null) {
            jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
        } else {
            jLIZIZ = 0;
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ), "anchor_id");
        if (Intrinsics.LJFF(str, "1")) {
            jLIZIZ2 = UserService.getInstance().user().getCurrentUserId();
        } else if (dataChannel != null) {
            jLIZIZ2 = C500260Jjc.LIZIZ(dataChannel);
        }
        c512030K6fLIZ.LIZ(Long.valueOf(jLIZIZ2), "to_user_id");
        c512030K6fLIZ.LIZ(Integer.valueOf(i), "duration");
        c512030K6fLIZ.LIZ(Boolean.valueOf(z), "is_success");
        Map<String, String> map5 = c512030K6fLIZ.LIZLLL;
        str4.toString();
        map5.put("stage", str4);
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c512030K6fLIZ.LIZLLL.putAll((Map<? extends String, ? extends String>) map);
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
    }
}
