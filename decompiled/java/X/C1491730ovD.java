package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ovD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491730ovD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1491690ov9 c1491690ov9, Map map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj6 = null;
        if (map != null) {
            obj = map.get("setup_timing");
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map5 = (Map) obj) != null) {
            for (Map.Entry entry : map5.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lynx_setup_");
                sbLIZ.append(entry.getKey());
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
        }
        if (map != null) {
            obj2 = map.get("metrics");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Map) && (map4 = (Map) obj2) != null) {
            for (Map.Entry entry2 : map4.entrySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("lynx_metric_");
                sbLIZ2.append(entry2.getKey());
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), entry2.getValue());
            }
        }
        if (map != null) {
            obj3 = map.get("update_timings");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Map) && (map2 = (Map) obj3) != null) {
            Object obj7 = map2.get("__lynx_timing_actual_fmp");
            if ((obj7 instanceof Map) && (map3 = (Map) obj7) != null) {
                for (Map.Entry entry3 : map3.entrySet()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("lynx_update_");
                    sbLIZ3.append(entry3.getKey());
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), entry3.getValue());
                }
            }
        }
        if (map != null) {
            obj4 = map.get("url");
        } else {
            obj4 = null;
        }
        linkedHashMap.put("lynx_url", obj4);
        if (map != null) {
            obj5 = map.get("thread_strategy");
        } else {
            obj5 = null;
        }
        linkedHashMap.put("lynx_thread_strategy", obj5);
        if (map != null) {
            obj6 = map.get("has_reload");
        }
        linkedHashMap.put("lynx_has_reload", obj6);
        c1491690ov9.LJ(linkedHashMap);
    }
}
