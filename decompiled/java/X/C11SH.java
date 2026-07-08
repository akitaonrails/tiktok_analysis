package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11SH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SH<T, U extends Collection<? super T>> extends C11SK<T, U, U> implements Runnable, InterfaceC420801kM {
    public final Callable<U> LLILZLL;
    public final long LLIZ;
    public final TimeUnit LLIZLLLIL;
    public final C11RO LLJ;
    public InterfaceC420801kM LLJI;
    public U LLJIJIL;
    public final AtomicReference<InterfaceC420801kM> LLJILJIL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        U u;
        synchronized (this) {
            try {
                u = this.LLJIJIL;
                this.LLJIJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (u != null) {
            this.LLILLL.offer(u);
            this.LLILZIL = true;
            if (LIZIZ()) {
                C11SN.LIZIZ(this.LLILLL, this.LLILLJJLI, null, this);
            }
        }
        C11JE.dispose(this.LLJILJIL);
    }

    public final void LIZLLL() throws Throwable {
        U u;
        try {
            U uCall = this.LLILZLL.call();
            C1701890uOB.LIZ(uCall, "The bufferSupplier returned a null buffer");
            U u2 = uCall;
            synchronized (this) {
                try {
                    u = this.LLJIJIL;
                    if (u != null) {
                        this.LLJIJIL = u2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (u == null) {
                C11JE.dispose(this.LLJILJIL);
                return;
            }
            InterfaceC626120Oh8<? super V> interfaceC626120Oh8 = this.LLILLJJLI;
            InterfaceC19495011Oy<U> interfaceC19495011Oy = this.LLILLL;
            if (this.LL.get() == 0 && this.LL.compareAndSet(0, 1)) {
                LIZ(interfaceC626120Oh8, u);
                if (this.LL.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                interfaceC19495011Oy.offer(u);
                if (!LIZIZ()) {
                    return;
                }
            }
            C11SN.LIZIZ(interfaceC19495011Oy, interfaceC626120Oh8, this, this);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LLILLJJLI.onError(th2);
            dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLJILJIL);
        this.LLJI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJILJIL.get() == C11JE.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        synchronized (this) {
            try {
                this.LLJIJIL = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LLILLJJLI.onError(th);
        C11JE.dispose(this.LLJILJIL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        synchronized (this) {
            try {
                U u = this.LLJIJIL;
                if (u == null) {
                    return;
                }
                u.add(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.validate(this.LLJI, interfaceC420801kM)) {
            this.LLJI = interfaceC420801kM;
            try {
                U uCall = this.LLILZLL.call();
                C1701890uOB.LIZ(uCall, "The buffer supplied is null");
                this.LLJIJIL = uCall;
                this.LLILLJJLI.onSubscribe(this);
                if (!this.LLILZ) {
                    C11RO c11ro = this.LLJ;
                    long j = this.LLIZ;
                    InterfaceC420801kM interfaceC420801kMLIZLLL = c11ro.LIZLLL(this, j, j, this.LLIZLLLIL);
                    AtomicReference<InterfaceC420801kM> atomicReference = this.LLJILJIL;
                    while (!atomicReference.compareAndSet(null, interfaceC420801kMLIZLLL)) {
                        if (atomicReference.get() != null) {
                            interfaceC420801kMLIZLLL.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                dispose();
                C11JT.error(th, this.LLILLJJLI);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C11SK, X.C11SO
    public final void LIZ(InterfaceC626120Oh8 interfaceC626120Oh8, Object obj) {
        this.LLILLJJLI.onNext((Object) obj);
    }

    public C11SH(C11PI c11pi, Callable callable, long j, TimeUnit timeUnit, C11RO c11ro) {
        super(c11pi, new C19501711Rn());
        this.LLJILJIL = new AtomicReference<>();
        this.LLILZLL = callable;
        this.LLIZ = j;
        this.LLIZLLLIL = timeUnit;
        this.LLJ = c11ro;
    }
}
