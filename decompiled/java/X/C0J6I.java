package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J6I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0J6I<T> {
    public volatile T LIZ;

    public abstract T LIZ();

    public final T LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = LIZ();
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
