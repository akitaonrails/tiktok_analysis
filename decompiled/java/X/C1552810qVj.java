package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552810qVj {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final Object LIZIZ = new Object();

    public final boolean LIZ() {
        AtomicBoolean atomicBoolean = this.LIZ;
        if (!atomicBoolean.get()) {
            return false;
        }
        synchronized (this.LIZIZ) {
            try {
                if (atomicBoolean.get()) {
                    try {
                        this.LIZIZ.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return false;
    }
}
