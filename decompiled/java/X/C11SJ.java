package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11SJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SJ<T, U extends Collection<? super T>> extends C11SK<T, U, U> implements Runnable, InterfaceC420801kM {
    public final Callable<U> LLILZLL;
    public final long LLIZ;
    public final TimeUnit LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final C11RN LLJIJIL;
    public U LLJILJIL;
    public InterfaceC420801kM LLJILJILJ;
    public InterfaceC420801kM LLJILLL;
    public long LLJJ;
    public long LLJJI;

    public final void LIZLLL() throws Throwable {
        try {
            U uCall = this.LLILZLL.call();
            C1701890uOB.LIZ(uCall, "The bufferSupplier returned a null buffer");
            U u = uCall;
            synchronized (this) {
                try {
                    U u2 = this.LLJILJIL;
                    if (u2 == null || this.LLJJ != this.LLJJI) {
                        return;
                    }
                    this.LLJILJIL = u;
                    LIZJ(u2, this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            dispose();
            this.LLILLJJLI.onError(th2);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLJILLL.dispose();
        this.LLJIJIL.dispose();
        synchronized (this) {
            try {
                this.LLJILJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        U u;
        this.LLJIJIL.dispose();
        synchronized (this) {
            try {
                u = this.LLJILJIL;
                this.LLJILJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLL.offer(u);
        this.LLILZIL = true;
        if (LIZIZ()) {
            C11SN.LIZIZ(this.LLILLL, this.LLILLJJLI, this, this);
        }
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

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        synchronized (this) {
            try {
                this.LLJILJIL = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LLILLJJLI.onError(th);
        this.LLJIJIL.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        synchronized (this) {
            try {
                U u = this.LLJILJIL;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.LLJ) {
                    return;
                }
                this.LLJILJIL = null;
                this.LLJJ++;
                if (this.LLJI) {
                    this.LLJILJILJ.dispose();
                }
                LIZJ(u, this);
                try {
                    U uCall = this.LLILZLL.call();
                    C1701890uOB.LIZ(uCall, "The buffer supplied is null");
                    U u2 = uCall;
                    synchronized (this) {
                        try {
                            this.LLJILJIL = u2;
                            this.LLJJI++;
                        } finally {
                        }
                    }
                    if (this.LLJI) {
                        C11RN c11rn = this.LLJIJIL;
                        long j = this.LLIZ;
                        this.LLJILJILJ = c11rn.LIZLLL(this, j, j, this.LLIZLLLIL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    this.LLILLJJLI.onError(th);
                    dispose();
                }
            } finally {
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.validate(this.LLJILLL, interfaceC420801kM)) {
            this.LLJILLL = interfaceC420801kM;
            try {
                U uCall = this.LLILZLL.call();
                C1701890uOB.LIZ(uCall, "The buffer supplied is null");
                this.LLJILJIL = uCall;
                this.LLILLJJLI.onSubscribe(this);
                C11RN c11rn = this.LLJIJIL;
                long j = this.LLIZ;
                this.LLJILJILJ = c11rn.LIZLLL(this, j, j, this.LLIZLLLIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                interfaceC420801kM.dispose();
                C11JT.error(th, this.LLILLJJLI);
                this.LLJIJIL.dispose();
            }
        }
    }

    @Override // X.C11SK, X.C11SO
    public final void LIZ(InterfaceC626120Oh8 interfaceC626120Oh8, Object obj) {
        interfaceC626120Oh8.onNext(obj);
    }

    public C11SJ(C11PI c11pi, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, C11RN c11rn) {
        super(c11pi, new C19501711Rn());
        this.LLILZLL = callable;
        this.LLIZ = j;
        this.LLIZLLLIL = timeUnit;
        this.LLJ = i;
        this.LLJI = z;
        this.LLJIJIL = c11rn;
    }
}
