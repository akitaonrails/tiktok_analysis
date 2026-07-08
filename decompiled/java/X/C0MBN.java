package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0MBN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBN {
    public static final Map<String, Long> LIZ = new HashMap();

    public static void LIZ(C1403560md0 c1403560md0, String str) {
        HashMap map = (HashMap) LIZ;
        Long l = (Long) map.get(str);
        if (l != null) {
            c1403560md0.LIZIZ(l.longValue(), "crop_encode_duration");
        }
        map.remove(str);
    }
}
