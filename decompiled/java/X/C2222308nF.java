package X;

import com.bytedance.geckox.utils.FileLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222308nF {
    public static final Map<String, Lock> LIZJ = new HashMap();
    public static final ReentrantLock LIZLLL = new ReentrantLock();
    public final String LIZ;
    public final FileLock LIZIZ;

    public final void LIZIZ() {
        try {
            this.LIZIZ.LJI();
            this.LIZIZ.LIZLLL();
            Lock lock = (Lock) ((HashMap) LIZJ).get(this.LIZ);
            if (lock == null) {
                LIZLLL.unlock();
            } else {
                lock.unlock();
                LIZLLL.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL.unlock();
            throw th;
        }
    }

    public static C2222308nF LIZ(String str) throws Throwable {
        FileLock fileLockLIZIZ;
        LIZLLL.lock();
        Lock reentrantLock = null;
        try {
            fileLockLIZIZ = FileLock.LIZIZ(str);
            try {
                Map<String, Lock> map = LIZJ;
                Lock lock = (Lock) ((HashMap) map).get(str);
                if (lock == null) {
                    try {
                        reentrantLock = new ReentrantLock();
                        ((HashMap) map).put(str, reentrantLock);
                    } catch (Throwable th) {
                        th = th;
                        reentrantLock = lock;
                        TryCatchGuardChecker.doCheck(th);
                        LIZLLL.unlock();
                        if (reentrantLock != null) {
                            reentrantLock.unlock();
                        }
                        if (fileLockLIZIZ != null) {
                            fileLockLIZIZ.LJI();
                            fileLockLIZIZ.LIZLLL();
                        }
                        throw th;
                    }
                } else {
                    reentrantLock = lock;
                }
                reentrantLock.lock();
                return new C2222308nF(str, fileLockLIZIZ);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileLockLIZIZ = null;
        }
    }

    public C2222308nF(String str, FileLock fileLock) {
        this.LIZ = str;
        this.LIZIZ = fileLock;
    }
}
