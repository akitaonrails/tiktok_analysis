package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19486711Lt implements C11IV {
    public abstract void LJIJJ(C11IY c11iy);

    public final C19485311Lf LJIILL() {
        return new C19485311Lf(this);
    }

    public final InterfaceC420801kM LJIIZILJ() {
        C19487111Lx c19487111Lx = new C19487111Lx();
        LIZIZ(c19487111Lx);
        return c19487111Lx;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11Lv] */
    public static C19486911Lv LJIIJ(final Throwable th) {
        C1701890uOB.LIZ(th, "error is null");
        return new AbstractC19486711Lt(th) { // from class: X.11Lv
            public final Throwable LL;

            {
                this.LL = th;
            }

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                C11JT.error(this.LL, c11iy);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11LJ] */
    public static C11LJ LJIIJJI(final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new AbstractC19486711Lt(interfaceC781210Ukh) { // from class: X.11LJ
            public final InterfaceC781210Ukh LL;

            {
                this.LL = interfaceC781210Ukh;
            }

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) throws Throwable {
                C11LO c11lo = new C11LO(C19487811Me.LIZIZ);
                c11iy.onSubscribe(c11lo);
                try {
                    this.LL.run();
                    if (!c11lo.isDisposed()) {
                        c11iy.onComplete();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    if (!c11lo.isDisposed()) {
                        c11iy.onError(th);
                    }
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11LI] */
    public static C11LI LJIIL(final Callable callable) {
        return new AbstractC19486711Lt(callable) { // from class: X.11LI
            public final Callable<?> LL;

            {
                this.LL = callable;
            }

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) throws Throwable {
                C11LO c11lo = new C11LO(C19487811Me.LIZIZ);
                c11iy.onSubscribe(c11lo);
                try {
                    this.LL.call();
                    if (!c11lo.isDisposed()) {
                        c11iy.onComplete();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    if (!c11lo.isDisposed()) {
                        c11iy.onError(th);
                    } else {
                        C19489211Ms.LIZIZ(th);
                    }
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11LK] */
    public static C11LK LJIILIIL(final Runnable runnable) {
        return new AbstractC19486711Lt(runnable) { // from class: X.11LK
            public final Runnable LL;

            {
                this.LL = runnable;
            }

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) throws Throwable {
                C11LO c11lo = new C11LO(C19487811Me.LIZIZ);
                c11iy.onSubscribe(c11lo);
                try {
                    this.LL.run();
                    if (!c11lo.isDisposed()) {
                        c11iy.onComplete();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    if (!c11lo.isDisposed()) {
                        c11iy.onError(th);
                    }
                }
            }
        };
    }

    @Override // X.C11IV
    public final void LIZIZ(C11IY c11iy) throws Throwable {
        C1701890uOB.LIZ(c11iy, "s is null");
        try {
            LJIJJ(c11iy);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11MA] */
    public final C11MA LIZLLL(final AbstractC19486711Lt abstractC19486711Lt) {
        return new AbstractC19486711Lt(this, abstractC19486711Lt) { // from class: X.11MA
            public final C11IV LL;
            public final C11IV LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                this.LL.LIZIZ(new C11MB(c11iy, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = abstractC19486711Lt;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11Jt] */
    public final C19481511Jt LJI(final InterfaceC781210Ukh interfaceC781210Ukh) {
        C1701890uOB.LIZ(interfaceC781210Ukh, "onFinally is null");
        return new AbstractC19486711Lt(this, interfaceC781210Ukh) { // from class: X.11Jt
            public final C11IV LL;
            public final InterfaceC781210Ukh LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                this.LL.LIZIZ(new C19481411Js(c11iy, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = interfaceC781210Ukh;
            }
        };
    }

    public final C19489111Mr LJII(InterfaceC781210Ukh interfaceC781210Ukh) {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return LJIIIZ(anonymousClass0988, anonymousClass0988, interfaceC781210Ukh);
    }

    public final C19489111Mr LJIIIIZZ(C09JN c09jn) {
        return LJIIIZ(C19487811Me.LIZLLL, c09jn, C19487811Me.LIZJ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11Ic] */
    public final C19477211Ic LJIILJJIL(final C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19486711Lt(this, c11ro) { // from class: X.11Ic
            public final C11IV LL;
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                this.LL.LIZIZ(new RunnableC19477111Ib(c11iy, this.LLILLJJLI));
            }

            {
                this.LL = this;
                this.LLILLJJLI = c11ro;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.11Ls] */
    public final C19486611Ls LJIILLIIL(InterfaceC1487280oo2 interfaceC1487280oo2) {
        C11NN c11nnLIZIZ;
        if (this instanceof InterfaceC1360530lVb) {
            c11nnLIZIZ = ((InterfaceC1360530lVb) this).LIZIZ();
        } else {
            c11nnLIZIZ = new C11NN<T>(this) { // from class: X.11Lu
                public final C11IV LLILLJJLI;

                {
                    this.LLILLJJLI = this;
                }

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super T> c11m9) {
                    this.LLILLJJLI.LIZIZ(new C11M0(c11m9));
                }
            };
        }
        c11nnLIZIZ.getClass();
        final C11OU c11ou = new C11OU(c11nnLIZIZ, interfaceC1487280oo2);
        return new AbstractC19486711Lt(c11ou) { // from class: X.11Ls
            public final C11LE<T> LL;

            {
                this.LL = c11ou;
            }

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                this.LL.subscribe(new C19486511Lr(c11iy));
            }
        };
    }

    public final C19487011Lw LJIJ(InterfaceC781210Ukh interfaceC781210Ukh) throws Throwable {
        C19487011Lw c19487011Lw = new C19487011Lw(interfaceC781210Ukh);
        LIZIZ(c19487011Lw);
        return c19487011Lw;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11Lq] */
    public final C19486411Lq LJIJJLI(final C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19486711Lt(this, c11ro) { // from class: X.11Lq
            public final C11IV LL;
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                RunnableC19486311Lp runnableC19486311Lp = new RunnableC19486311Lp(c11iy, this.LL);
                c11iy.onSubscribe(runnableC19486311Lp);
                runnableC19486311Lp.LLILLJJLI.replace(this.LLILLJJLI.LIZIZ(runnableC19486311Lp));
            }

            {
                this.LL = this;
                this.LLILLJJLI = c11ro;
            }
        };
    }

    public final C19477011Ia LJ(long j, TimeUnit timeUnit) {
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C19477011Ia(this, j, timeUnit, c11ro);
    }

    public final C19487011Lw LJIJI(C09JN c09jn, InterfaceC781210Ukh interfaceC781210Ukh) {
        C1701890uOB.LIZ(c09jn, "onError is null");
        C1701890uOB.LIZ(interfaceC781210Ukh, "onComplete is null");
        C19487011Lw c19487011Lw = new C19487011Lw(c09jn, interfaceC781210Ukh);
        LIZIZ(c19487011Lw);
        return c19487011Lw;
    }

    public final C19477011Ia LJFF(long j, TimeUnit timeUnit, C11RO c11ro) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C19477011Ia(this, j, timeUnit, c11ro);
    }

    public final C19489111Mr LJIIIZ(C09JN c09jn, C09JN c09jn2, InterfaceC781210Ukh interfaceC781210Ukh) {
        return new C19489111Mr(this, c09jn, c09jn2, interfaceC781210Ukh);
    }
}
