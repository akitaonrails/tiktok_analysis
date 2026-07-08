package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BR6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BR6<T> {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public T LIZJ;

    public abstract T LIZIZ();

    public final T LIZ() {
        if (this.LIZJ != null || this.LIZ) {
            return this.LIZJ;
        }
        if (this.LIZIZ) {
            return this.LIZJ;
        }
        synchronized (this) {
            try {
                if (this.LIZIZ) {
                    return this.LIZJ;
                }
                this.LIZIZ = true;
                this.LIZJ = LIZIZ();
                this.LIZIZ = true;
                return this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
