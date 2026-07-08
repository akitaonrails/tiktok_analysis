package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C593510NPp<T> {
    public volatile boolean LIZ = false;
    public volatile T LIZIZ;

    public T LIZIZ() {
        throw null;
    }

    public final T LIZ() {
        T t;
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        if (this.LIZ) {
            return this.LIZIZ;
        }
        synchronized (this) {
            try {
                if (!this.LIZ) {
                    this.LIZIZ = LIZIZ();
                    this.LIZ = true;
                }
                t = this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return t;
    }
}
