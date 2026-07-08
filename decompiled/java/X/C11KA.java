package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11KA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KA<T, R> extends C11NZ<R> {
    public final T LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) throws Throwable {
        try {
            C098D<? extends R> c098dApply = this.LLILLJJLI.apply(this.LL);
            C1701890uOB.LIZ(c098dApply, "The mapper returned a null ObservableSource");
            C098D<? extends R> c098d = c098dApply;
            if (c098d instanceof Callable) {
                try {
                    Object objCall = ((Callable) c098d).call();
                    if (objCall == null) {
                        C11JT.complete(interfaceC626120Oh8);
                        return;
                    }
                    C11K8 c11k8 = new C11K8(interfaceC626120Oh8, objCall);
                    interfaceC626120Oh8.onSubscribe(c11k8);
                    c11k8.run();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, interfaceC626120Oh8);
                    return;
                }
            }
            c098d.LIZIZ(interfaceC626120Oh8);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11JT.error(th2, interfaceC626120Oh8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11KA(InterfaceC1487280oo2 interfaceC1487280oo2, Object obj) {
        this.LL = obj;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
