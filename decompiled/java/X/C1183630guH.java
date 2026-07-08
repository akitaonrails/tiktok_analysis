package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0guH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183630guH<K, V> {
    public final C603820NmG<K, V> LIZ;
    public final ReentrantReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public C1183630guH(int i) {
        this.LIZ = new C603820NmG<>(i);
    }

    public final V LIZ(K k) {
        ReentrantReadWriteLock.ReadLock lock = this.LIZIZ.readLock();
        lock.lock();
        try {
            V vLIZJ = this.LIZ.LIZJ(k);
            lock.unlock();
            return vLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final void LIZIZ(Object obj, Object obj2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.LIZIZ.writeLock();
        writeLock.lock();
        try {
            this.LIZ.LIZLLL(obj, obj2);
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            writeLock.unlock();
            throw th;
        }
    }
}
