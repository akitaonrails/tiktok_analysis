package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740770T3z {
    public static final Map<Integer, InterfaceC21138317np> LIZ = new ConcurrentHashMap();

    public static InterfaceC21138317np LIZ(int i) {
        Map<Integer, InterfaceC21138317np> map = LIZ;
        InterfaceC21138317np interfaceC21138317np = (InterfaceC21138317np) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        if (interfaceC21138317np != null) {
            return interfaceC21138317np;
        }
        synchronized (map) {
            try {
                InterfaceC21138317np interfaceC21138317np2 = (InterfaceC21138317np) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (interfaceC21138317np2 != null) {
                    return interfaceC21138317np2;
                }
                InterfaceC21138317np interfaceC21138317npLIZ = C16I1.LIZ(i);
                if (interfaceC21138317npLIZ != null) {
                    ((ConcurrentHashMap) map).put(Integer.valueOf(i), interfaceC21138317npLIZ);
                }
                return interfaceC21138317npLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
