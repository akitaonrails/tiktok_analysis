package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11PK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PK<T, U, R> extends AtomicReference<U> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -312246233408980075L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC500500Jk0<? super T, ? super U, ? extends R> LLILLJJLI;
    public final AtomicReference<InterfaceC420801kM> LLILLL = new AtomicReference<>();
    public final AtomicReference<InterfaceC420801kM> LLILZ = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILLL);
        C11JE.dispose(this.LLILZ);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(this.LLILLL.get());
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11JE.dispose(this.LLILZ);
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILZ);
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        U u = get();
        if (u != null) {
            try {
                R rApply = this.LLILLJJLI.apply(t, u);
                C1701890uOB.LIZ(rApply, "The combiner returned a null value");
                this.LL.onNext(rApply);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                dispose();
                this.LL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLILLL, interfaceC420801kM);
    }

    public C11PK(C11PI c11pi, InterfaceC500500Jk0 interfaceC500500Jk0) {
        this.LL = c11pi;
        this.LLILLJJLI = interfaceC500500Jk0;
    }
}
