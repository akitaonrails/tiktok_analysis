package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0rll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601190rll {
    public static void LIZ(Lock lock) {
        if (lock != null) {
            try {
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(Lock lock) {
        if (!C052X.LIZIZ() && lock != null) {
            try {
                lock.tryLock(1500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(lock);
                throw th;
            }
            LIZ(lock);
        }
    }
}
