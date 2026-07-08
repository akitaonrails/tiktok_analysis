package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002190cBd<T> implements InterfaceC1023650ckF<T, T> {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Function1<C1196804mE, T> LIZJ;

    @Override // X.InterfaceC1023650ckF
    public final T LIZ(T t) {
        return t;
    }

    @Override // X.InterfaceC1023650ckF
    public final Function1<C1196804mE, T> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1023650ckF
    public final boolean LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1023650ckF
    public final String getName() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1002190cBd(String str, boolean z, Function1<? super C1196804mE, ? extends T> function1) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = function1;
    }
}
