package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08UT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08UT<T> {
    public volatile T LIZ;

    public abstract Object LIZ();

    public final T LIZIZ(Object... objArr) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = (T) LIZ();
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
