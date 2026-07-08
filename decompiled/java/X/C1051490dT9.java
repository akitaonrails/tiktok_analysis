package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051490dT9<T> {
    public Function0<? extends T> LIZ;
    public volatile Object LIZIZ = C1051500dTA.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T tInvoke;
        T t = (T) this.LIZIZ;
        C1051500dTA c1051500dTA = C1051500dTA.LIZ;
        if (t != c1051500dTA) {
            return t;
        }
        synchronized (this.LIZJ) {
            try {
                tInvoke = (T) this.LIZIZ;
                if (tInvoke == c1051500dTA) {
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
        return this.LIZIZ != C1051500dTA.LIZ ? String.valueOf(LIZ()) : "Lazy value not initialized yet.";
    }

    public C1051490dT9(Function0 function0) {
        this.LIZ = function0;
    }

    public final void LIZIZ(T t) {
        if (Intrinsics.LJFF(this.LIZIZ, C1051500dTA.LIZ)) {
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
