package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1571440qzm<T> implements C01GW<T> {
    public volatile Object LL = C1571450qzn.LIZ;
    public final Object LLILLJJLI = this;

    public abstract T LIZ();

    @Override // X.C01GW
    public final T getValue() {
        T tLIZ;
        T t = (T) this.LL;
        C1571450qzn c1571450qzn = C1571450qzn.LIZ;
        if (t != c1571450qzn) {
            return t;
        }
        synchronized (this.LLILLJJLI) {
            try {
                tLIZ = (T) this.LL;
                if (tLIZ == c1571450qzn) {
                    tLIZ = LIZ();
                    this.LL = tLIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tLIZ;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LL != C1571450qzn.LIZ;
    }
}
