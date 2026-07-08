package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838220WuS<TResult> {
    public final C838190WuP<TResult> LIZ = new C838190WuP<>();

    public final void LIZ(Exception exc) {
        C838190WuP<TResult> c838190WuP = this.LIZ;
        ReentrantLock reentrantLock = c838190WuP.LIZ;
        reentrantLock.lock();
        try {
            if (c838190WuP.LIZJ) {
                reentrantLock.unlock();
                "Cannot set the error on a completed task.".toString();
                throw new IllegalStateException("Cannot set the error on a completed task.");
            }
            c838190WuP.LIZJ = true;
            c838190WuP.LIZIZ.signalAll();
            c838190WuP.LIZ();
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
