package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: X.1DFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252811DFn implements Closeable {
    public static final AtomicIntegerFieldUpdater<AbstractC2252811DFn> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AbstractC2252811DFn.class, "sharedLock");
    public volatile int sharedLock;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.sharedLock == -1) {
                    return;
                }
                if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                doClose();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public abstract void doClose();

    public void storeFence() {
        this.sharedLock = 0;
    }

    public void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    public void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i - 1));
    }
}
