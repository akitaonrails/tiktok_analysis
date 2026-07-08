package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07lV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1956707lV {
    public static final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(Object obj, String str, boolean z) {
        if (z) {
            try {
                if (LIZ.containsKey(str)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1205490hTX.LIZ.LJ(C1EMR.POI_MEMORY_CACHE_ERR, th);
                return;
            }
        }
        LIZ.put(str, obj);
    }
}
