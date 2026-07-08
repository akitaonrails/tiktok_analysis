package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0km5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332310km5<T> {
    public Function0<? extends T> LIZ;
    public volatile Object LIZIZ = C1333170knT.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T tInvoke;
        T t = (T) this.LIZIZ;
        C1333170knT c1333170knT = C1333170knT.LIZ;
        if (t != c1333170knT) {
            return t;
        }
        synchronized (this.LIZJ) {
            try {
                tInvoke = (T) this.LIZIZ;
                if (tInvoke == c1333170knT) {
                    Function0<? extends T> function0 = this.LIZ;
                    if (function0 == null) {
                        Intrinsics.LJIIL();
                    }
                    tInvoke = function0.invoke();
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
        return this.LIZIZ != C1333170knT.LIZ ? String.valueOf(LIZ()) : "Lazy value not initialized yet.";
    }

    public C1332310km5(Function0 function0) {
        this.LIZ = function0;
    }

    public final void LIZIZ(T t) {
        if (Intrinsics.LJFF(this.LIZIZ, C1333170knT.LIZ)) {
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
