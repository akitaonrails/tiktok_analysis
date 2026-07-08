package X;

import Y.ARunnableS11S2100000_23;
import Y.ARunnableS6S2200000_23;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0qPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549240qPy implements InterfaceC1521740phc {
    public final InterfaceC1521740phc LIZ;
    public final ExecutorService LIZIZ = C786410Ut5.h4();

    public C1549240qPy(C1960107m3 c1960107m3) {
        this.LIZ = c1960107m3;
    }

    @Override // X.InterfaceC1521740phc
    public final void d(String str, String str2) {
        this.LIZIZ.submit(new ARunnableS11S2100000_23(this, str, str2, 12));
    }

    @Override // X.InterfaceC1521740phc
    public final void e(String str, String str2) {
        this.LIZIZ.submit(new ARunnableS11S2100000_23(this, str, str2, 15));
    }

    @Override // X.InterfaceC1521740phc
    public final void i(String str, String str2) {
        this.LIZIZ.submit(new ARunnableS11S2100000_23(this, str, str2, 13));
    }

    @Override // X.InterfaceC1521740phc
    public final void w(String str, String str2) {
        this.LIZIZ.submit(new ARunnableS11S2100000_23(this, str, str2, 14));
    }

    @Override // X.InterfaceC1521740phc
    public final void e(String str, String str2, Throwable th) {
        this.LIZIZ.submit(new ARunnableS6S2200000_23(th, str, this, str2, 5));
    }
}
