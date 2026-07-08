package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801420VcC {
    public static final String LIZ = C807330Vlj.LIZIZ.LJ();
    public static final Map<String, String> LIZIZ;

    static {
        LinkedHashMap linkedHashMap;
        List<String> list = C0VGA.LIZ().btmPageEventAutoTraceWhitelist;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (String str : list) {
                linkedHashMap.put(str, str);
            }
        } else {
            linkedHashMap = null;
        }
        LIZIZ = linkedHashMap;
    }
}
