package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892170zL5 {
    public static final ConcurrentHashMap<String, Object> LIZ;

    static {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("is_from_selection_scenarios", "1");
        LIZ = concurrentHashMap;
    }

    public static void LIZJ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        linkedHashMap.put("video_id", str2);
        C1018703yb.LIZIZ("rd_tiktokec_rd_fyp_button_step_event", linkedHashMap);
    }

    public static Object LIZLLL(String str, Function0 function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZIZ(jCurrentTimeMillis, 0L, str, "start");
        Object objInvoke = function0.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rd_");
        sbLIZ.append(str);
        sbLIZ.append("_duration");
        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j));
        LIZIZ(jCurrentTimeMillis2, j, str, "end");
        return objInvoke;
    }

    public static void LIZ(boolean z, String str, Long l, Map map) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("author_id", str);
        Object obj = l;
        if (l == null) {
            obj = "";
        }
        linkedHashMap.put("product_id", obj);
        linkedHashMap.put("is_from_selection_scenarios", "1");
        linkedHashMap.put("channel", "fyp_add_product_button");
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        linkedHashMap.put("is_success", str2);
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(LIZ);
        C1018703yb.LIZIZ("tiktokec_pick_affiliate_product", linkedHashMap);
    }

    public static void LIZIZ(long j, long j2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rd_position", str);
        linkedHashMap.put("rd_time", Long.valueOf(j));
        linkedHashMap.put("rd_duration", Long.valueOf(j2));
        linkedHashMap.put("rd_timing", str2);
        linkedHashMap.putAll(LIZ);
        C1018703yb.LIZIZ("rd_ec_fyp_button_sql_operation_tracker", linkedHashMap);
    }
}
