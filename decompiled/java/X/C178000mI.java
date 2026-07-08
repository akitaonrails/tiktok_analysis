package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C178000mI {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();

    public static final void LIZIZ(int i, String str) {
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(':');
            sbLIZ.append(i);
            concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static final boolean LIZ(int i, long j, long j2, String str) {
        if (str != null && str.length() != 0 && j > 0) {
            if (str != null && str.length() != 0) {
                ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(':');
                sbLIZ.append(i);
                Long l = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
                if (l != null) {
                    if (SystemClock.elapsedRealtime() - l.longValue() <= j) {
                        return true;
                    }
                }
            }
            if (j2 > 0 && System.currentTimeMillis() - j2 <= j) {
                return true;
            }
        }
        return false;
    }
}
