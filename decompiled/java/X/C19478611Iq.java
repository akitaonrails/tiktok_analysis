package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478611Iq<T> extends AbstractC19484711Kz<T> {
    public final Callable<? extends InterfaceC19473011Gm<? extends T>> LL;

    public C19478611Iq(Callable<? extends InterfaceC19473011Gm<? extends T>> callable) {
        this.LL = callable;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) throws Throwable {
        try {
            InterfaceC19473011Gm<? extends T> interfaceC19473011GmCall = this.LL.call();
            C1701890uOB.LIZ(interfaceC19473011GmCall, "The singleSupplier returned a null SingleSource");
            interfaceC19473011GmCall.LIZ(interfaceC19474811He);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11JT.error(th, interfaceC19474811He);
        }
    }
}
