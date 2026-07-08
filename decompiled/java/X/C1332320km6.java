package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0km6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332320km6<T> {
    public Function0<? extends T> LIZ;
    public volatile Object LIZIZ = C1333160knS.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T tInvoke;
        T t = (T) this.LIZIZ;
        C1333160knS c1333160knS = C1333160knS.LIZ;
        if (t != c1333160knS) {
            return t;
        }
        synchronized (this.LIZJ) {
            try {
                tInvoke = (T) this.LIZIZ;
                if (tInvoke == c1333160knS) {
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
        return this.LIZIZ != C1333160knS.LIZ ? String.valueOf(LIZ()) : "Lazy value not initialized yet.";
    }

    public C1332320km6(Function0 function0) {
        this.LIZ = function0;
    }

    public final void LIZIZ(T t) {
        if (Intrinsics.LJFF(this.LIZIZ, C1333160knS.LIZ)) {
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
