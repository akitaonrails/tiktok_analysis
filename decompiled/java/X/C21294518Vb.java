package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18Vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21294518Vb {
    public final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>();

    public final void LIZJ() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.LIZ;
        concurrentHashMap.clear();
        concurrentHashMap.put("preload", 0);
        concurrentHashMap.put("upload", 0);
        concurrentHashMap.put("capture_frame", 0);
        concurrentHashMap.put("change_picture", 0);
        concurrentHashMap.put("delete_preload", 0);
        concurrentHashMap.put("delete_upload", 0);
    }

    public C21294518Vb() {
        LIZJ();
    }

    public final Map<String, Integer> LIZIZ() {
        if (!C291270BbJ.LIZ()) {
            return null;
        }
        HashMap map = new HashMap();
        map.putAll(this.LIZ);
        LIZJ();
        return map;
    }

    public static void LIZ(String str, Map map) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        concurrentHashMap.put(str, Integer.valueOf(iIntValue + 1));
    }
}
