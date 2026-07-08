package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MQ<T, U> extends AbstractC19484711Kz<U> implements InterfaceC478520Ipe<U> {
    public final C098D<T> LL;
    public final Callable<? extends U> LLILLJJLI;
    public final C11L5<? super U, ? super T> LLILLL;

    @Override // X.InterfaceC478520Ipe
    public final C11NZ<U> LIZJ() {
        final C098D<T> c098d = this.LL;
        final Callable<? extends U> callable = this.LLILLJJLI;
        final C11L5<? super U, ? super T> c11l5 = this.LLILLL;
        return new C11J7<T, U>(c098d, callable, c11l5) { // from class: X.11MR
            public final Callable<? extends U> LLILLJJLI;
            public final C11L5<? super U, ? super T> LLILLL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
                try {
                    U uCall = this.LLILLJJLI.call();
                    C1701890uOB.LIZ(uCall, "The initialSupplier returned a null value");
                    this.LL.LIZIZ(new C11MS(interfaceC626120Oh8, uCall, this.LLILLL));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11JT.error(th, interfaceC626120Oh8);
                }
            }

            {
                this.LLILLJJLI = callable;
                this.LLILLL = c11l5;
            }
        };
    }

    public C11MQ(C11NZ c11nz) {
        Callable<? extends U> callable = new Callable() { // from class: X.05XC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("RecommendMusicApiKt@4c9e.getSoftLinkMusic$3");
                ArrayList arrayList = new ArrayList();
                C1C7U.LIZIZ("RecommendMusicApiKt@4c9e.getSoftLinkMusic$3");
                return arrayList;
            }
        };
        C11L5<? super U, ? super T> c11l5 = new C11L5() { // from class: X.0anQ
            @Override // X.C11L5
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        };
        this.LL = c11nz;
        this.LLILLJJLI = callable;
        this.LLILLL = c11l5;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super U> interfaceC19474811He) {
        try {
            U uCall = this.LLILLJJLI.call();
            C1701890uOB.LIZ(uCall, "The initialSupplier returned a null value");
            this.LL.LIZIZ(new C11MP(interfaceC19474811He, uCall, this.LLILLL));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11JT.error(th, interfaceC19474811He);
        }
    }
}
