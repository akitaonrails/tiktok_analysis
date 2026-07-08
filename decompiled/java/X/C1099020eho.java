package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099020eho {
    public static final Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;

    public static void LIZIZ(String str, Map map) {
        map.putAll(LIZ);
        C501590Jll.LIZLLL(map);
        C1CC2.LJII(0, str, map);
        map.put("event_name", str);
        C1143300frE.LJIIJJI().LJII("ttlive_hybrid", map);
    }

    public static final void LIZ(String str, String str2, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("container_id", str);
        linkedHashMap.put("card_name", str2);
        linkedHashMap.put("exposed", Boolean.valueOf(z));
        LIZIZ("ttlive_short_touch_add_item", linkedHashMap);
    }
}
