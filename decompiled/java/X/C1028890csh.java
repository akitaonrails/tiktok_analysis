package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0csh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1028890csh<T> implements InterfaceC1023690ckJ<T, T> {
    public final String LIZ;
    public final Function1<C1028760csU, T> LIZIZ;

    @Override // X.InterfaceC1023690ckJ
    public final T LIZ(T t) {
        return t;
    }

    @Override // X.InterfaceC1023690ckJ
    public final Function1<C1028760csU, T> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1023690ckJ
    public final String getName() {
        return this.LIZ;
    }

    public C1028890csh(String str, Function1 function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
