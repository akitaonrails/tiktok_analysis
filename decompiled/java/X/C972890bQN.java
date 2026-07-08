package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0bQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972890bQN {
    public static final C972890bQN LIZ = new C972890bQN();
    public static final AtomicLong LIZIZ = new AtomicLong(100);
    public static final Map<Long, InterfaceC972900bQO> LIZJ = new LinkedHashMap();

    public final long LIZ(InterfaceC972900bQO interfaceC972900bQO) {
        long jIncrementAndGet;
        synchronized (this) {
            try {
                jIncrementAndGet = LIZIZ.incrementAndGet();
                LIZJ.put(Long.valueOf(jIncrementAndGet), interfaceC972900bQO);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jIncrementAndGet;
    }

    public final void LIZIZ(long j) {
        synchronized (this) {
            try {
                Map<Long, InterfaceC972900bQO> map = LIZJ;
                if (((InterfaceC972900bQO) ((LinkedHashMap) map).get(Long.valueOf(j))) == null) {
                    return;
                }
                map.remove(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
