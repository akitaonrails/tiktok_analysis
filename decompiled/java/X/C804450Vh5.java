package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0Vh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804450Vh5<K, V> {
    public final int LIZ;
    public final ConcurrentHashMap<K, V> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentLinkedQueue<K> LIZJ = new ConcurrentLinkedQueue<>();
    public final ReentrantReadWriteLock.ReadLock LIZLLL;
    public final ReentrantReadWriteLock.WriteLock LJ;

    public C804450Vh5(int i) {
        this.LIZ = i;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZLLL = reentrantReadWriteLock.readLock();
        this.LJ = reentrantReadWriteLock.writeLock();
    }

    public final V LIZ(K k) {
        this.LIZLLL.lock();
        try {
            if (this.LIZIZ.containsKey(k)) {
                if (this.LIZJ.remove(k)) {
                    this.LIZJ.add(k);
                }
                V v = this.LIZIZ.get(k);
                this.LIZLLL.unlock();
                return v;
            }
            this.LIZLLL.unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.unlock();
            throw th;
        }
    }

    public final void LIZIZ(K k, V v) {
        K kPoll;
        this.LJ.lock();
        try {
            if (this.LIZIZ.containsKey(k)) {
                this.LIZJ.remove(k);
            }
            if (this.LIZIZ.size() == this.LIZ && (kPoll = this.LIZJ.poll()) != null) {
                this.LIZIZ.remove(kPoll);
            }
            this.LIZIZ.put(k, v);
            this.LIZJ.add(k);
            this.LJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJ.unlock();
            throw th;
        }
    }
}
