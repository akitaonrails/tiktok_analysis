package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19479611Ja<T, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<R>, InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -8948264376121066672L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(R r) {
        this.LL.onNext(r);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        try {
            C098D<? extends R> c098dApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c098dApply, "The mapper returned a null Publisher");
            c098dApply.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LL.onError(th);
        }
    }

    public C19479611Ja(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
