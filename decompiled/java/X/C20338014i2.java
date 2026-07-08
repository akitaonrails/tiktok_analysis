package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.14i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20338014i2 {
    public static final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AbstractC2457909k9> LIZIZ = new ConcurrentHashMap<>();

    public static AbstractC2457909k9 LIZ(String str) {
        AbstractC2457909k9 abstractC2457909k9;
        ConcurrentHashMap<String, AbstractC2457909k9> concurrentHashMap = LIZIZ;
        synchronized (concurrentHashMap) {
            try {
                abstractC2457909k9 = concurrentHashMap.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC2457909k9;
    }

    public static void LIZIZ(String str, AbstractC2457909k9 abstractC2457909k9) {
        ConcurrentHashMap<String, AbstractC2457909k9> concurrentHashMap = LIZIZ;
        synchronized (concurrentHashMap) {
            try {
                concurrentHashMap.put(str, abstractC2457909k9);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
