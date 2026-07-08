package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0JGN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGN<T> implements C01GW<T> {
    public final Function0<T> LL;
    public T LLILLJJLI;

    @Override // X.C01GW
    public final T getValue() {
        T t = this.LLILLJJLI;
        if (t != null) {
            return t;
        }
        T tInvoke = this.LL.invoke();
        this.LLILLJJLI = tInvoke;
        return tInvoke;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILLJJLI != null;
    }

    public C0JGN(AFwS205S0000000_17 aFwS205S0000000_17, boolean z) {
        this.LL = aFwS205S0000000_17;
        if (!z) {
            this.LLILLJJLI = (T) aFwS205S0000000_17.invoke();
        }
    }
}
