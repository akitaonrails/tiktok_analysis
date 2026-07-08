package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC824140WUq<T> {
    public volatile T LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public abstract T LIZ(Object... objArr);

    public final T LIZIZ(Object... objArr) {
        if (!this.LIZIZ.get() && this.LIZ == null) {
            synchronized (this) {
                try {
                    if (!this.LIZIZ.get() && this.LIZ == null) {
                        this.LIZ = LIZ(objArr);
                        this.LIZIZ.set(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }
}
