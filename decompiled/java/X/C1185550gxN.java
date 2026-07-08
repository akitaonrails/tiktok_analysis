package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185550gxN {
    public static final Map<String, Long> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(764));

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static void LIZLLL(String str, EnumC1202700hP2 enumC1202700hP2) {
        if (LIZ()) {
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cache_type", enumC1202700hP2.toString());
            linkedHashMap.put("action_type", "ttls_rd_poi_detail_cache_save");
            linkedHashMap.put("poi_id", str);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_rd_poi_detail_cache_track", linkedHashMap, null);
        }
    }

    public static void LJ(String str, Function1 function1) {
        if (!LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "log_preload_step");
        linkedHashMap.put(str, String.valueOf(System.currentTimeMillis()));
        function1.invoke(linkedHashMap);
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZIZ("ttls_rd_poi_detail_cache_track", linkedHashMap, null);
    }

    public static void LIZJ(String str, String str2, String str3) {
        if (LIZ()) {
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("poi_id", str);
            linkedHashMap.put("action_type", "ttls_rd_poi_detail_cache_read");
            Long l = (Long) ((LinkedHashMap) LIZ).get(str);
            if (l != null) {
                l.longValue();
                linkedHashMap.put("is_first_enter", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.put("time_gap", String.valueOf(System.currentTimeMillis() - l.longValue()));
            } else {
                linkedHashMap.put("is_first_enter", "1");
            }
            linkedHashMap.put("cache_type", str2);
            if (str3 != null) {
                linkedHashMap.put("cached_instance_ids", str3);
            }
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_rd_poi_detail_cache_track", linkedHashMap, null);
        }
    }

    public static void LIZIZ(boolean z, long j, int i, String str, int i2) {
        String str2 = str;
        int i3 = i;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        LJ("preload_network_end", new C1185710gxd(i3, j, str2, z));
    }
}
