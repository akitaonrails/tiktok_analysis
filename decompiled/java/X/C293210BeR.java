package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0BeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293210BeR {
    public static C293180BeO LIZ(String str) {
        ConcurrentHashMap<String, C293180BeO> concurrentHashMap = C293180BeO.LJ;
        C293180BeO c293180BeO = concurrentHashMap.get(str);
        if (c293180BeO == null) {
            synchronized (concurrentHashMap) {
                try {
                    c293180BeO = concurrentHashMap.get(str);
                    if (c293180BeO == null) {
                        c293180BeO = new C293180BeO(str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c293180BeO;
    }
}
