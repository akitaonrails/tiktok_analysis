package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11MK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MK<T, U extends Collection<? super T>> extends AbstractC19484711Kz<U> implements InterfaceC478520Ipe<U> {
    public final C098D<T> LL;
    public final C11MO LLILLJJLI = new C11MO();

    @Override // X.InterfaceC478520Ipe
    public final C11NZ<U> LIZJ() {
        final C098D<T> c098d = this.LL;
        final C11MO c11mo = this.LLILLJJLI;
        return new C11J7<T, U>(c098d, c11mo) { // from class: X.11ML
            public final Callable<U> LLILLJJLI;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) throws Throwable {
                try {
                    U uCall = this.LLILLJJLI.call();
                    C1701890uOB.LIZ(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.LL.LIZIZ(new C11MM(interfaceC626120Oh8, uCall));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, interfaceC626120Oh8);
                }
            }

            {
                this.LLILLJJLI = c11mo;
            }
        };
    }

    public C11MK(C098D c098d) {
        this.LL = c098d;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super U> interfaceC19474811He) throws Throwable {
        try {
            this.LL.LIZIZ(new C11MG(interfaceC19474811He, (Collection) this.LLILLJJLI.call()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11JT.error(th, interfaceC19474811He);
        }
    }
}
