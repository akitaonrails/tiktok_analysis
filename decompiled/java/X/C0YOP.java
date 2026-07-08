package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YOP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, int i, Map map, int i2) {
        String str2;
        LinkedHashMap linkedHashMap;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = -2;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            map = null;
        }
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (linkedHashMap.get("trigger_reason") == null) {
            linkedHashMap.put("trigger_reason", str);
        }
        if (linkedHashMap.get("push_msg_id") == null) {
            linkedHashMap.put("push_msg_id", str2);
        }
        ((C876310YZh) c0yi5LIZ).LIZ.LJIIJJI(i, z, linkedHashMap);
    }
}
