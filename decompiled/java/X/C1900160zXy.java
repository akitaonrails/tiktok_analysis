package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0zXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900160zXy implements InterfaceC1487280oo2<C11NZ<? extends Throwable>, C11NZ<?>> {
    public final int LL;
    public final long LLILLJJLI;
    public int LLILLL;

    @Override // X.InterfaceC1487280oo2
    public final C11NZ<?> apply(C11NZ<? extends Throwable> c11nz) {
        return c11nz.LJJJ(new InterfaceC1487280oo2<Throwable, C11NZ<?>>() { // from class: X.0zXz
            @Override // X.InterfaceC1487280oo2
            public final C11NZ<?> apply(Throwable th) {
                Throwable th2 = th;
                C1900160zXy c1900160zXy = this.LL;
                int i = c1900160zXy.LLILLL;
                c1900160zXy.LLILLL = i + 1;
                if (i < c1900160zXy.LL) {
                    return C11NZ.LJLJJLL(c1900160zXy.LLILLJJLI, TimeUnit.MILLISECONDS);
                }
                return C11NZ.LJJIJLIJ(th2);
            }
        }, false);
    }

    public C1900160zXy(int i, long j) {
        this.LL = i;
        this.LLILLJJLI = j;
    }
}
