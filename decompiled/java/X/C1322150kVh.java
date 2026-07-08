package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322150kVh<T> {
    public volatile boolean LIZ;
    public volatile T LIZIZ;

    public T LIZIZ() {
        throw null;
    }

    public final T LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        if (this.LIZ) {
            return this.LIZIZ;
        }
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return this.LIZIZ;
                }
                this.LIZIZ = LIZIZ();
                if (this.LIZIZ != null) {
                    this.LIZ = true;
                }
                return this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
