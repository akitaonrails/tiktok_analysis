package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20113813my {
    public static InterfaceC20112813mo LIZIZ() {
        InterfaceC20112813mo c20113713mx;
        synchronized (C20113713mx.LIZIZ) {
            try {
                c20113713mx = C20113713mx.LIZIZ;
                if (c20113713mx instanceof C20113613mw) {
                    c20113713mx = new C20113713mx();
                    C20113713mx.LIZIZ = c20113713mx;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c20113713mx;
    }

    public static C20113913mz LIZ(String str, ConcurrentHashMap concurrentHashMap) {
        C20113913mz c20113913mz = (C20113913mz) concurrentHashMap.get(str);
        if (c20113913mz == null) {
            C20114013n0 c20114013n0 = new C20114013n0();
            c20114013n0.LIZIZ = str;
            C20113913mz c20113913mz2 = new C20113913mz(c20114013n0);
            concurrentHashMap.put(str, c20113913mz2);
            return c20113913mz2;
        }
        return c20113913mz;
    }
}
