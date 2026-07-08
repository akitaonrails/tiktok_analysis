package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1291250jhr {
    public static final Map<String, Object> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("animation_type", "");
    }

    public static void LIZ(AbstractC1313520kHm abstractC1313520kHm, String str, String str2) {
        Map<String, C1297940jse> map = abstractC1313520kHm.LLJIJIL;
        if (map != null && map.containsKey(str)) {
            Map<String, Object> map2 = LIZ;
            ((HashMap) map2).put("animation_type", str2);
            abstractC1313520kHm.LLILZ.LLILLL.LIZJ(new C1294230jmf(abstractC1313520kHm.LLJJ, str, map2));
        }
    }
}
