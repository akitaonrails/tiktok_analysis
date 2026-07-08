package X;

import X.AbstractC1585770rMt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585210rLz<T extends AbstractC1585770rMt> implements C01GW<T> {
    public Function0<? extends T> LL;
    public Object LLILLJJLI = C1585630rMf.LIZ;

    @Override // X.C01GW
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final T getValue() {
        Function0<? extends T> function0;
        if (this.LLILLJJLI == C1585630rMf.LIZ && (function0 = this.LL) != null) {
            this.LLILLJJLI = function0.invoke();
            this.LL = null;
        }
        return (T) this.LLILLJJLI;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILLJJLI != C1585630rMf.LIZ;
    }

    public C1585210rLz(Function0<? extends T> function0) {
        this.LL = function0;
    }
}
