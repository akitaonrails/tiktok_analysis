package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CBX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBX<T> {
    public Function0<? extends T> LIZ;
    public volatile Object LIZIZ = C0CBY.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T tInvoke;
        T t = (T) this.LIZIZ;
        C0CBY c0cby = C0CBY.LIZ;
        if (t != c0cby) {
            return t;
        }
        synchronized (this.LIZJ) {
            try {
                tInvoke = (T) this.LIZIZ;
                if (tInvoke == c0cby) {
                    tInvoke = this.LIZ.invoke();
                    this.LIZIZ = tInvoke;
                    this.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return this.LIZIZ != C0CBY.LIZ ? String.valueOf(LIZ()) : "Lazy value not initialized yet.";
    }

    public C0CBX(C0CBV c0cbv) {
        this.LIZ = c0cbv;
    }
}
