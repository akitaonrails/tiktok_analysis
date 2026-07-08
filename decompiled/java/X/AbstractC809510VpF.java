package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC809510VpF<T> {
    public volatile T LIZ;

    public abstract C809490VpD LIZLLL();

    public final T LJ(Object... objArr) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = (T) LIZLLL();
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
