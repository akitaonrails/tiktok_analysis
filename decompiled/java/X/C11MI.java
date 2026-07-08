package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11MI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MI<T, U extends Collection<? super T>> extends AbstractC19484711Kz<U> implements InterfaceC1360530lVb<U> {
    public final C11NN<T> LL;
    public final Callable<U> LLILLJJLI;

    @Override // X.InterfaceC1360530lVb
    public final C11NN<U> LIZIZ() {
        final C11NN<T> c11nn = this.LL;
        final Callable<U> callable = this.LLILLJJLI;
        return new C11M6<T, U>(c11nn, callable) { // from class: X.11MJ
            public final Callable<U> LLILLL;

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super U> c11m9) throws Throwable {
                try {
                    U uCall = this.LLILLL.call();
                    C1701890uOB.LIZ(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.LLILLJJLI.LJIILL(new C11M8(c11m9, uCall));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11NS.error(th, c11m9);
                }
            }

            {
                this.LLILLL = callable;
            }
        };
    }

    public C11MI(C11NW c11nw) {
        Callable<U> callableAsCallable = EnumC23083092r.asCallable();
        this.LL = c11nw;
        this.LLILLJJLI = callableAsCallable;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super U> interfaceC19474811He) throws Throwable {
        try {
            U uCall = this.LLILLJJLI.call();
            C1701890uOB.LIZ(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.LL.LJIILL(new C11MH(interfaceC19474811He, uCall));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11JT.error(th, interfaceC19474811He);
        }
    }
}
