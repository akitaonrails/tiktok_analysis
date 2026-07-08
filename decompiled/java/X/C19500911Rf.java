package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11Rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19500911Rf<T> extends AtomicBoolean implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -7419642935409022375L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C19500811Re<T> LLILLJJLI;
    public final RunnableC19501011Rg LLILLL;
    public InterfaceC420801kM LLILZ;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.LLILLJJLI.LJLLLL(this.LLILLL);
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZ.dispose();
        if (compareAndSet(false, true)) {
            C19500811Re<T> c19500811Re = this.LLILLJJLI;
            RunnableC19501011Rg runnableC19501011Rg = this.LLILLL;
            synchronized (c19500811Re) {
                try {
                    RunnableC19501011Rg runnableC19501011Rg2 = c19500811Re.LLILLL;
                    if (runnableC19501011Rg2 == null || runnableC19501011Rg2 != runnableC19501011Rg) {
                        return;
                    }
                    long j = runnableC19501011Rg.LLILLJJLI - 1;
                    runnableC19501011Rg.LLILLJJLI = j;
                    if (j == 0 && runnableC19501011Rg.LLILLL) {
                        c19500811Re.LJLLLLLL(runnableC19501011Rg);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.LLILLJJLI.LJLLLL(this.LLILLL);
            this.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZ, interfaceC420801kM)) {
            this.LLILZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19500911Rf(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C19500811Re<T> c19500811Re, RunnableC19501011Rg runnableC19501011Rg) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c19500811Re;
        this.LLILLL = runnableC19501011Rg;
    }
}
