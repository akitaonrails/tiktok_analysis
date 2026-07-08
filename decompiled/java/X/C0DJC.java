package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0DJC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJC implements InterfaceC1487280oo2<C11NZ<? extends Throwable>, C11NZ<?>> {
    public final int LL;
    public final long LLILLJJLI;
    public int LLILLL;

    @Override // X.InterfaceC1487280oo2
    public final C11NZ<?> apply(C11NZ<? extends Throwable> c11nz) {
        return c11nz.LJJJ(new InterfaceC1487280oo2() { // from class: X.0DJD
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                C0DJC c0djc = this.LL;
                int i = c0djc.LLILLL;
                int i2 = i + 1;
                c0djc.LLILLL = i2;
                if (i < c0djc.LL) {
                    return C11NZ.LJLJJLL(c0djc.LLILLJJLI * ((long) i2), TimeUnit.MILLISECONDS);
                }
                return C11NZ.LJJIJLIJ(th);
            }
        }, false);
    }

    public C0DJC(int i, long j) {
        this.LL = i;
        this.LLILLJJLI = j;
    }
}
