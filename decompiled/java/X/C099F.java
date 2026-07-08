package X;

import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.099F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099F<T> extends JobSupport implements C05XL<T> {
    @Override // X.AnonymousClass0957
    public final T LIZLLL() {
        return (T) LJJJIL();
    }

    @Override // X.AnonymousClass0957
    public final InterfaceC2192541ArU<T> LLIIIJ() {
        return LJJJJLI();
    }

    public C099F(C09AE c09ae) {
        super(true);
        LJJLI(c09ae);
    }

    @Override // X.C05XL
    public final boolean LJIIZILJ(T t) {
        return LJJLIIIJILLIZJL(t);
    }

    @Override // X.C05XL
    public final boolean LJJJJJ(Throwable th) {
        return LJJLIIIJILLIZJL(new CompletedExceptionally(th, false, 2, null));
    }

    @Override // X.AnonymousClass0957
    public final Object LJLIIIL(InterfaceC1364105Vn<? super T> interfaceC1364105Vn) throws Throwable {
        Object objLJJIIJ = LJJIIJ(interfaceC1364105Vn);
        C099R.LJFF();
        return objLJJIIJ;
    }
}
