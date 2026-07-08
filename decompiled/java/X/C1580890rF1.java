package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0rF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580890rF1 {
    public static final boolean LIZ(Map<String, ? extends Object> map) {
        Object obj;
        Map map2 = null;
        if (map != null) {
            obj = map.get("cta_info");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map2 = (Map) obj;
        }
        if (map2 == null || !map2.containsKey("action_key")) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(String str, Map map) {
        Map map2;
        Object obj = null;
        if (map != null) {
            obj = map.get("cta_info");
        }
        if (C19719512Dh.LJII(obj) && (map2 = (Map) obj) != null) {
            map2.put("is_positive", str);
        }
    }

    public static final void LIZJ(String str, Map map) {
        Map map2;
        Object obj = null;
        if (map != null) {
            obj = map.get("cta_info");
        }
        if (C19719512Dh.LJII(obj) && (map2 = (Map) obj) != null) {
            map2.put("title", str);
        }
    }
}
