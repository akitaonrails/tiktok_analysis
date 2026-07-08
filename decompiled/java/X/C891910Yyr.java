package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0Yyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891910Yyr {
    public static final ConcurrentHashMap<String, C0ZH7> LIZ = new ConcurrentHashMap<>();
    public static final ReentrantReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public static void LIZ(String str) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.remove(str);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
