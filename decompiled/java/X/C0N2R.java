package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0N2R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2R {
    public static final Map<String, Object> LIZ(Map<String, ? extends Object> map) {
        return C2097908Jt.LIZJ(new Pair("app_measurement_ext", new LinkedHashMap(map)));
    }

    public static final Map<String, Object> LIZIZ(Map<String, Object> map) {
        Object objRemove = map.remove("app_measurement_ext");
        if (C19719512Dh.LJII(objRemove)) {
            return (Map) objRemove;
        }
        return null;
    }

    public static final void LIZJ(Map<String, Object> map, Map<String, ? extends Object> map2) {
        if (map2 != null && (!map2.isEmpty())) {
            map.put("app_measurement_ext", map2);
        }
    }
}
