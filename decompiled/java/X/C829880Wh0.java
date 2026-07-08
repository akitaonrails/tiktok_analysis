package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0Wh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829880Wh0 {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final HashMap<String, InterfaceC830810WiV> LIZIZ;

    static {
        HashMap<String, InterfaceC830810WiV> map = new HashMap<>();
        LIZIZ = map;
        map.put("GlobalStrategyStream", C829890Wh1.LJI);
    }

    public static final void LIZ(String str, InterfaceC830810WiV interfaceC830810WiV) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
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
            HashMap<String, InterfaceC830810WiV> map = LIZIZ;
            if (map.get(str) == null) {
                map.put(str, interfaceC830810WiV);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
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
