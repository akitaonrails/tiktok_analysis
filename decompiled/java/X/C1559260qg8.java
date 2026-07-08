package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559260qg8<T> implements C01GW<T> {
    public final boolean LL;
    public final Function0<T> LLILLJJLI;
    public T LLILLL;

    @Override // X.C01GW
    public final T getValue() {
        T t = this.LLILLL;
        return t == null ? (T) C725430Scv.LIZLLL(C1561880qkM.LIZ, new C723430SZh(), new C1559270qg9(this)) : t;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LL;
    }

    public C1559260qg8(Function0 function0, boolean z) {
        this.LL = z;
        this.LLILLJJLI = function0;
    }
}
