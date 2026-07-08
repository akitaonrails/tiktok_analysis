package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0p7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1499420p7c<K, V> {
    public final ConcurrentHashMap<String, C1499440p7e> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str) {
        C1499440p7e c1499440p7eRemove = this.LIZ.remove(str);
        if (c1499440p7eRemove != null) {
            ReentrantLock reentrantLock = c1499440p7eRemove.LIZ;
            reentrantLock.lock();
            try {
                c1499440p7eRemove.LIZIZ.signalAll();
                reentrantLock.unlock();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((C1499410p7b) this).LIZJ);
                sbLIZ.append(": remove pending cache lock for ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
