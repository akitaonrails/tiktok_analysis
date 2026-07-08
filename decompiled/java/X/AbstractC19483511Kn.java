package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19483511Kn<T> implements C11ID<T> {
    public abstract void LJIJI(C11IH<? super T> c11ih);

    public final T LIZLLL() {
        C11R3 c11r3 = new C11R3();
        LIZ(c11r3);
        return (T) c11r3.LIZ();
    }

    public final InterfaceC420801kM LJIILL() {
        return LJIJ(C19487811Me.LIZLLL, C19487811Me.LJFF, C19487811Me.LIZJ);
    }

    public static C11KZ LJ(final InterfaceC1254030ijp interfaceC1254030ijp) {
        return new AbstractC19483511Kn<T>(interfaceC1254030ijp) { // from class: X.11KZ
            public final InterfaceC1254030ijp<T> LL;

            {
                this.LL = interfaceC1254030ijp;
            }

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) throws Throwable {
                C11KY c11ky = new C11KY(c11ih);
                c11ih.onSubscribe(c11ky);
                try {
                    this.LL.LIZ(c11ky);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    c11ky.onError(th);
                }
            }
        };
    }

    public static C11LF LJIIJJI(Callable callable) {
        return new C11LF(callable);
    }

    @Override // X.C11ID
    public final void LIZ(C11IH<? super T> c11ih) throws Throwable {
        C1701890uOB.LIZ(c11ih, "observer is null");
        try {
            LJIJI(c11ih);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C19481011Jo LJFF(final InterfaceC781210Ukh interfaceC781210Ukh) {
        return new AbstractC19477911Ij<T, T>(this, interfaceC781210Ukh) { // from class: X.11Jo
            public final InterfaceC781210Ukh LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                this.LL.LIZ(new C19481111Jp(c11ih, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC781210Ukh;
            }
        };
    }

    public final C11JS LJI(InterfaceC781210Ukh interfaceC781210Ukh) {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return new C11JS(this, anonymousClass0988, anonymousClass0988, anonymousClass0988, interfaceC781210Ukh);
    }

    public final C11JS LJII(C09JN c09jn) {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return new C11JS(this, anonymousClass0988, anonymousClass0988, c09jn, C19487811Me.LIZJ);
    }

    public final C11JS LJIIIIZZ(C09JN c09jn) {
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return new C11JS(this, anonymousClass0988, c09jn, anonymousClass0988, C19487811Me.LIZJ);
    }

    public final AbstractC19483511Kn<T> LJIIIZ(final InterfaceC19483011Ki<? super T> interfaceC19483011Ki) {
        return new AbstractC19477911Ij<T, T>(this, interfaceC19483011Ki) { // from class: X.11Kj
            public final InterfaceC19483011Ki<? super T> LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                this.LL.LIZ(new C19483211Kk(c11ih, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC19483011Ki;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Jk] */
    public final C19480611Jk LJIIJ(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new AbstractC19477911Ij<T, R>(this, interfaceC1487280oo2) { // from class: X.11Jk
            public final InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super R> c11ih) {
                this.LL.LIZ(new C19480511Jj(c11ih, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11Jv] */
    public final C19481711Jv LJIIL(final InterfaceC1487280oo2 interfaceC1487280oo2) {
        return new AbstractC19477911Ij<T, R>(this, interfaceC1487280oo2) { // from class: X.11Jv
            public final InterfaceC1487280oo2<? super T, ? extends R> LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super R> c11ih) {
                this.LL.LIZ(new C19481611Ju(c11ih, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public final C19477811Ii LJIILIIL(final C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19477911Ij<T, T>(this, c11ro) { // from class: X.11Ii
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                this.LL.LIZ(new C11II(c11ih, this.LLILLJJLI));
            }

            {
                this.LLILLJJLI = c11ro;
            }
        };
    }

    public final InterfaceC420801kM LJIILLIIL(C09JN<? super T> c09jn) {
        return LJIJ(c09jn, C19487811Me.LJFF, C19487811Me.LIZJ);
    }

    public final C19483611Ko LJIJJ(final C11RO c11ro) {
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new AbstractC19477911Ij<T, T>(this, c11ro) { // from class: X.11Ko
            public final C11RO LLILLJJLI;

            @Override // X.AbstractC19483511Kn
            public final void LJIJI(C11IH<? super T> c11ih) {
                final C19483711Kp c19483711Kp = new C19483711Kp(c11ih);
                c11ih.onSubscribe(c19483711Kp);
                C19484811La c19484811La = c19483711Kp.LL;
                C11RO c11ro2 = this.LLILLJJLI;
                final C11ID<T> c11id = this.LL;
                c19484811La.replace(c11ro2.LIZIZ(new Runnable(c19483711Kp, c11id) { // from class: X.11Kq
                    public final C11IH<? super T> LL;
                    public final C11ID<T> LLILLJJLI;

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            this.LLILLJJLI.LIZ(this.LL);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }

                    {
                        this.LL = c19483711Kp;
                        this.LLILLJJLI = c11id;
                    }
                }));
            }

            {
                this.LLILLJJLI = c11ro;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11LL LJIILJJIL(long j, InterfaceC19483011Ki interfaceC19483011Ki) {
        C11NN<T> c11nnLIZIZ;
        if (this instanceof InterfaceC1360530lVb) {
            c11nnLIZIZ = ((InterfaceC1360530lVb) this).LIZIZ();
        } else {
            c11nnLIZIZ = new C11NN<T>(this) { // from class: X.11LB
                public final C11ID<T> LLILLJJLI;

                {
                    this.LLILLJJLI = this;
                }

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super T> c11m9) {
                    this.LLILLJJLI.LIZ(new C11M1(c11m9));
                }
            };
        }
        return new C11LL(c11nnLIZIZ.LJIIJJI(j, interfaceC19483011Ki));
    }

    public final InterfaceC420801kM LJIIZILJ(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2) {
        return LJIJ(c09jn, c09jn2, C19487811Me.LIZJ);
    }

    public final InterfaceC420801kM LJIJ(C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh) throws Throwable {
        C1701890uOB.LIZ(c09jn, "onSuccess is null");
        C1701890uOB.LIZ(c09jn2, "onError is null");
        C1701890uOB.LIZ(interfaceC781210Ukh, "onComplete is null");
        C11JI c11ji = new C11JI(c09jn, c09jn2, interfaceC781210Ukh);
        LIZ(c11ji);
        return c11ji;
    }

    public final C11J8 LJIJJLI(long j, TimeUnit timeUnit, C11ID c11id) {
        C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11J8(this, new C11IM(Math.max(0L, j), timeUnit, c11ro), c11id);
    }
}
