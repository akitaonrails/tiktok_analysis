package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11N4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11N4<T, U> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<U>> LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public final AtomicReference<InterfaceC420801kM> LLILZ = new AtomicReference<>();
    public volatile long LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
        C11JE.dispose(this.LLILZ);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        InterfaceC420801kM interfaceC420801kM = this.LLILZ.get();
        if (interfaceC420801kM != C11JE.DISPOSED) {
            ((C11N3) interfaceC420801kM).LIZ();
            C11JE.dispose(this.LLILZ);
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILZ);
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        if (this.LLILZLL) {
            return;
        }
        long j = this.LLILZIL + 1;
        this.LLILZIL = j;
        InterfaceC420801kM interfaceC420801kM = this.LLILZ.get();
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        try {
            C098D<U> c098dApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c098dApply, "The ObservableSource supplied is null");
            C098D<U> c098d = c098dApply;
            C11N3 c11n3 = new C11N3(this, j, t);
            AtomicReference<InterfaceC420801kM> atomicReference = this.LLILZ;
            while (!atomicReference.compareAndSet(interfaceC420801kM, c11n3)) {
                if (atomicReference.get() != interfaceC420801kM) {
                    return;
                }
            }
            c098d.LIZIZ(c11n3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            dispose();
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11N4(C11PI c11pi, InterfaceC1487280oo2 interfaceC1487280oo2) {
        this.LL = c11pi;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
