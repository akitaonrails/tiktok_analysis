package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0knV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333190knV<T> implements C01GW<T>, Serializable {
    public Function0<? extends T> LL;
    public volatile Object LLILLJJLI;
    public final Object LLILLL;

    private final Object writeReplace() {
        return new C377010EqJ(getValue());
    }

    @Override // X.C01GW
    public final T getValue() {
        T tInvoke;
        T t = (T) this.LLILLJJLI;
        C1333210knX c1333210knX = C1333210knX.LIZ;
        if (t != c1333210knX) {
            return t;
        }
        synchronized (this.LLILLL) {
            try {
                tInvoke = (T) this.LLILLJJLI;
                if (tInvoke == c1333210knX) {
                    tInvoke = this.LL.invoke();
                    this.LLILLJJLI = tInvoke;
                    this.LL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILLJJLI != C1333210knX.LIZ;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public C1333190knV(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        this.LL = function0;
        this.LLILLJJLI = C1333210knX.LIZ;
        this.LLILLL = obj == null ? this : obj;
    }
}
