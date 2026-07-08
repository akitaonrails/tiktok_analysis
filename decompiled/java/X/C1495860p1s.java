package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0p1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495860p1s extends AbstractC1496390p2j {
    public final /* synthetic */ C1495430p1B LLILZ;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC1495410p19 interfaceC1495410p19;
        C1495430p1B c1495430p1B = this.LLILZ;
        synchronized (c1495430p1B.LIZLLL) {
            try {
                interfaceC1495410p19 = c1495430p1B.LJIILJJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c1495430p1B.LJIIIIZZ(true, interfaceC1495410p19, -1L, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495860p1s(InterfaceC1496620p36 interfaceC1496620p36, InterfaceC1496780p3M interfaceC1496780p3M, C1495430p1B c1495430p1B) {
        super(interfaceC1496620p36, interfaceC1496780p3M);
        this.LLILZ = c1495430p1B;
    }
}
