package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846410XIh<T> {
    public Function0<? extends T> LIZ;
    public volatile Object LIZIZ = C846420XIi.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T tInvoke;
        T t = (T) this.LIZIZ;
        C846420XIi c846420XIi = C846420XIi.LIZ;
        if (t != c846420XIi) {
            return t;
        }
        synchronized (this.LIZJ) {
            try {
                tInvoke = (T) this.LIZIZ;
                if (tInvoke == c846420XIi) {
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
        return this.LIZIZ != C846420XIi.LIZ ? String.valueOf(LIZ()) : "Lazy value not initialized yet.";
    }

    public C846410XIh(Function0 function0) {
        this.LIZ = function0;
    }

    public final void LIZIZ(T t) {
        if (Intrinsics.LJFF(this.LIZIZ, C846420XIi.LIZ)) {
            synchronized (this.LIZJ) {
                try {
                    this.LIZIZ = t;
                    this.LIZ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.LIZIZ = t;
    }
}
