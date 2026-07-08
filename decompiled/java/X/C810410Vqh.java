package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810410Vqh<T> {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile T LIZJ;

    public T LIZIZ() {
        throw null;
    }

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
                this.LIZJ = LIZIZ();
                this.LIZIZ = true;
                return this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(T t) {
        this.LIZJ = t;
        this.LIZ = true;
    }
}
