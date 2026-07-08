package X;

import com.bytedance.geckox.utils.FileLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08nE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222208nE {
    public static final Map<String, Lock> LIZJ = new HashMap();
    public final FileLock LIZ;
    public final String LIZIZ;

    public final void LIZIZ() {
        Map<String, Lock> map = LIZJ;
        synchronized (map) {
            try {
                try {
                    this.LIZ.LJI();
                    this.LIZ.LIZLLL();
                    ((Lock) ((HashMap) map).get(this.LIZIZ)).unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((Lock) ((HashMap) LIZJ).get(this.LIZIZ)).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static C2222208nE LIZ(String str) {
        Map<String, Lock> map = LIZJ;
        synchronized (map) {
            try {
                Lock reentrantLock = (Lock) ((HashMap) map).get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    ((HashMap) map).put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockLJFF = FileLock.LJFF(str);
                    if (fileLockLJFF == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new C2222208nE(str, fileLockLJFF);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    reentrantLock.unlock();
                    C2222008nC.LIZ(new RuntimeException(e));
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C2222208nE(String str, FileLock fileLock) {
        this.LIZIZ = str;
        this.LIZ = fileLock;
    }
}
