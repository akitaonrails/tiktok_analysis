package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0gpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180470gpB {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC1181010gq3> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.String r3) {
        /*
            if (r3 == 0) goto L9
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L1d
            X.0hTX r3 = X.C1205490hTX.LIZ     // Catch: java.lang.Throwable -> L35
            X.1EMR r2 = X.C1EMR.POI_SESSION_MANAGER_ERR     // Catch: java.lang.Throwable -> L35
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "session_id is null or empty when get session_info"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r3.LJ(r2, r1)     // Catch: java.lang.Throwable -> L35
            goto L40
        L1d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "get sessionInfo: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            r1.append(r3)     // Catch: java.lang.Throwable -> L35
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>> r0 = X.C1180470gpB.LIZ     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.1EMR r0 = X.C1EMR.POI_SESSION_MANAGER_ERR
            r1.LJ(r0, r2)
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1180470gpB.LIZ(java.lang.String):java.util.Map");
    }

    public static void LIZIZ(String str, Map map) {
        ConcurrentHashMap<String, Object> concurrentHashMapPutIfAbsent;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> concurrentHashMap = LIZ;
                    ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap.get(str);
                    if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                        concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                    }
                    concurrentHashMap2.putAll(map);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1205490hTX.LIZ.LJ(C1EMR.POI_SESSION_MANAGER_ERR, th);
                return;
            }
        }
        C1205490hTX.LIZ.LJ(C1EMR.POI_SESSION_MANAGER_ERR, new Exception("session_id is null or empty when put session_info"));
    }
}
