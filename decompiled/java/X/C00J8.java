package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00J8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00J8 {
    public static final Map<String, Object> LIZ;
    public static final Map<String, Object> LIZIZ;

    static {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        LIZ = mapLJ;
        Map<String, Object> map = (Map) C0C64.LJIILLIIL().LJJII(Map.class, mapLJ, "ecom_security_verify_sdk_exp_feature_android", true);
        if (map != null) {
            mapLJ = map;
        }
        LIZIZ = mapLJ;
    }

    public static HashMap LIZ() {
        HashMap map = new HashMap();
        Map<String, Object> map2 = LIZIZ;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }
}
