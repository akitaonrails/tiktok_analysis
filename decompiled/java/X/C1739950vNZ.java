package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739950vNZ {
    public static final C1739950vNZ LIZ = new C1739950vNZ();
    public static String LIZIZ = "init";

    public static void LIZ(String str, String str2, String str3) {
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        linkedHashMap.put("result", "fail");
        if (str2 != null) {
            linkedHashMap.put("detail", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("channel_name", str3);
        }
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_native_prefetch_debug", linkedHashMap);
    }

    public static void LIZIZ(C1739950vNZ c1739950vNZ, String str, String str2, String str3, String str4, Integer num, String str5, Long l, Long l2, Long l3, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            l2 = null;
        }
        if ((i & 256) != 0) {
            l3 = null;
        }
        if ((i & 512) != 0) {
            map = null;
        }
        if ((i & 1024) != 0) {
            map2 = null;
        }
        c1739950vNZ.getClass();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = LIZIZ;
        }
        linkedHashMap.put("stage", str);
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        linkedHashMap.put("channel_name", str3);
        if (str4 != null) {
            linkedHashMap.put("api_path", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("error_msg", str5);
        }
        if (num != null) {
            linkedHashMap.put("request_order", Integer.valueOf(num.intValue()));
        }
        if (l != null) {
            linkedHashMap.put("duration", Long.valueOf(l.longValue()));
        }
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(map);
            if (l2 != null) {
                l2.longValue();
                linkedHashMap2.put("request_start_time", l2.toString());
            }
            if (l3 != null) {
                l3.longValue();
                linkedHashMap2.put("request_end_time", l3.toString());
            }
            String strLIZLLL = C314470CUj.LIZLLL(linkedHashMap2);
            if (strLIZLLL != null) {
                linkedHashMap.put("extra_timing_info", strLIZLLL);
            }
        }
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_ug_native_prefetch_process", linkedHashMap);
    }
}
