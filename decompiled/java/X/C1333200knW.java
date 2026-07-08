package X;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0knW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333200knW<T> implements C01GW<T>, Serializable {
    public Function0<? extends T> LL;
    public Object LLILLJJLI = C1333210knX.LIZ;

    private final Object writeReplace() {
        return new C377010EqJ(getValue());
    }

    @Override // X.C01GW
    public T getValue() {
        if (this.LLILLJJLI == C1333210knX.LIZ) {
            this.LLILLJJLI = this.LL.invoke();
            this.LL = null;
        }
        return (T) this.LLILLJJLI;
    }

    @Override // X.C01GW
    public boolean isInitialized() {
        return this.LLILLJJLI != C1333210knX.LIZ;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public C1333200knW(Function0<? extends T> function0) {
        this.LL = function0;
    }
}
