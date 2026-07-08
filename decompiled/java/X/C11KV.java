package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11KV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KV extends AbstractC19486711Lt {
    public final InterfaceC512370K7n LL;

    public C11KV(InterfaceC512370K7n interfaceC512370K7n) {
        this.LL = interfaceC512370K7n;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) throws Throwable {
        C11KU c11ku = new C11KU(c11iy);
        c11iy.onSubscribe(c11ku);
        try {
            this.LL.LIZ(c11ku);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            c11ku.onError(th);
        }
    }
}
