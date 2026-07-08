package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835510Wq5<TResult> extends AbstractC835450Wpz<TResult> {
    public final Object LIZ = new Object();
    public final C835530Wq7<TResult> LIZIZ = new C835530Wq7<>();
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public TResult LJ;
    public Exception LJFF;

    @Override // X.AbstractC835450Wpz
    public final Exception LJIIIZ() {
        Exception exc;
        synchronized (this.LIZ) {
            try {
                exc = this.LJFF;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return exc;
    }

    @Override // X.AbstractC835450Wpz
    public final TResult LJIIJ() {
        TResult tresult;
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Task is not yet complete", this.LIZJ);
                if (this.LIZLLL) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (this.LJFF != null) {
                    throw new C835720WqQ(this.LJFF);
                }
                tresult = this.LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tresult;
    }

    @Override // X.AbstractC835450Wpz
    public final boolean LJIILIIL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // X.AbstractC835450Wpz
    public final boolean LJIILJJIL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZJ && !this.LIZLLL && this.LJFF == null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // X.AbstractC835450Wpz
    public final AbstractC835450Wpz LJIILL() {
        return LJIILLIIL(C835490Wq3.LIZ, new InterfaceC835700WqO() { // from class: X.0Wfy
            @Override // X.InterfaceC835700WqO
            public final C835510Wq5 then(Object obj) {
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return C835460Wq0.LJ(null);
            }
        });
    }

    public final void LJIJI() {
        synchronized (this.LIZ) {
            try {
                if (this.LIZJ) {
                    return;
                }
                this.LIZJ = true;
                this.LIZLLL = true;
                this.LIZIZ.LIZ(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJ() {
        synchronized (this.LIZ) {
            try {
                if (this.LIZJ) {
                    this.LIZIZ.LIZ(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC835450Wpz
    public final boolean LJIIL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC835450Wpz
    public final AbstractC835450Wpz<TResult> LIZIZ(InterfaceC834580Woa<TResult> interfaceC834580Woa) {
        LIZJ(C835490Wq3.LIZ, interfaceC834580Woa);
        return this;
    }

    @Override // X.AbstractC835450Wpz
    public final C835510Wq5 LIZLLL(InterfaceC835730WqR interfaceC835730WqR) {
        LJ(C835490Wq3.LIZ, interfaceC835730WqR);
        return this;
    }

    @Override // X.AbstractC835450Wpz
    public final C835510Wq5 LJFF(InterfaceC835710WqP interfaceC835710WqP) {
        LJI(C835490Wq3.LIZ, interfaceC835710WqP);
        return this;
    }

    @Override // X.AbstractC835450Wpz
    public final <X extends Throwable> TResult LJIIJJI(Class<X> cls) {
        TResult tresult;
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Task is not yet complete", this.LIZJ);
                if (!this.LIZLLL) {
                    if (!cls.isInstance(this.LJFF)) {
                        if (this.LJFF == null) {
                            tresult = this.LJ;
                        } else {
                            throw new C835720WqQ(this.LJFF);
                        }
                    } else {
                        throw cls.cast(this.LJFF);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tresult;
    }

    public final void LJIIZILJ(Exception exc) {
        C0W3J.LJIIIZ(exc, "Exception must not be null");
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Task is already complete", !this.LIZJ);
                this.LIZJ = true;
                this.LJFF = exc;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LJIJ(TResult tresult) {
        synchronized (this.LIZ) {
            try {
                C0W3J.LJIIJ("Task is already complete", !this.LIZJ);
                this.LIZJ = true;
                this.LJ = tresult;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ.LIZ(this);
    }

    @Override // X.AbstractC835450Wpz
    public final void LIZ(ExecutorC835500Wq4 executorC835500Wq4, InterfaceC835740WqS interfaceC835740WqS) {
        this.LIZIZ.LIZIZ(new C835580WqC(executorC835500Wq4, interfaceC835740WqS));
        LJIJJ();
    }

    @Override // X.AbstractC835450Wpz
    public final void LIZJ(Executor executor, InterfaceC834580Woa interfaceC834580Woa) {
        this.LIZIZ.LIZIZ(new C835560WqA(executor, interfaceC834580Woa));
        LJIJJ();
    }

    @Override // X.AbstractC835450Wpz
    public final C835510Wq5 LJ(Executor executor, InterfaceC835730WqR interfaceC835730WqR) {
        this.LIZIZ.LIZIZ(new C835550Wq9(executor, interfaceC835730WqR));
        LJIJJ();
        return this;
    }

    @Override // X.AbstractC835450Wpz
    public final C835510Wq5 LJI(Executor executor, InterfaceC835710WqP interfaceC835710WqP) {
        this.LIZIZ.LIZIZ(new C835540Wq8(executor, interfaceC835710WqP));
        LJIJJ();
        return this;
    }

    @Override // X.AbstractC835450Wpz
    public final <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJII(Executor executor, InterfaceC835680WqM<TResult, TContinuationResult> interfaceC835680WqM) {
        C835510Wq5 c835510Wq5 = new C835510Wq5();
        this.LIZIZ.LIZIZ(new C835630WqH(executor, interfaceC835680WqM, c835510Wq5));
        LJIJJ();
        return c835510Wq5;
    }

    @Override // X.AbstractC835450Wpz
    public final <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJIIIIZZ(Executor executor, InterfaceC835680WqM<TResult, AbstractC835450Wpz<TContinuationResult>> interfaceC835680WqM) {
        C835510Wq5 c835510Wq5 = new C835510Wq5();
        this.LIZIZ.LIZIZ(new C835610WqF(executor, interfaceC835680WqM, c835510Wq5));
        LJIJJ();
        return c835510Wq5;
    }

    @Override // X.AbstractC835450Wpz
    public final <TContinuationResult> AbstractC835450Wpz<TContinuationResult> LJIILLIIL(Executor executor, InterfaceC835700WqO<TResult, TContinuationResult> interfaceC835700WqO) {
        C835510Wq5 c835510Wq5 = new C835510Wq5();
        this.LIZIZ.LIZIZ(new C835600WqE(executor, interfaceC835700WqO, c835510Wq5));
        LJIJJ();
        return c835510Wq5;
    }
}
