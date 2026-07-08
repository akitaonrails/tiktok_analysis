package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P6<T> extends AbstractC19492911Od<T> {
    public final C19500111Qx<T> LLILLJJLI;
    public final AtomicReference<Runnable> LLILLL;
    public final boolean LLILZ;
    public volatile boolean LLILZIL;
    public Throwable LLILZLL;
    public final AtomicReference<C11M9<? super T>> LLIZ;
    public volatile boolean LLIZLLLIL;
    public final AtomicBoolean LLJ;
    public final C11P7 LLJI;
    public final AtomicLong LLJIJIL;
    public boolean LLJILJIL;

    public final void LJIJI() {
        if (getAndIncrement() != 0) {
            return;
        }
        C11M9<? super T> c11m9 = this.LLIZ.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (c11m9 == null) {
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                c11m9 = this.LLIZ.get();
            }
        }
        if (!this.LLJILJIL) {
            C19500111Qx<T> c19500111Qx = this.LLILLJJLI;
            boolean z = !this.LLILZ;
            int iAddAndGet3 = 1;
            do {
                long j = this.LLJIJIL.get();
                long j2 = 0;
                while (true) {
                    if (j != j2) {
                        boolean z2 = this.LLILZIL;
                        T tPoll = c19500111Qx.poll();
                        boolean z3 = tPoll == null;
                        if (!LJIJ(z, z2, z3, c11m9, c19500111Qx)) {
                            if (z3) {
                                break;
                            }
                            c11m9.onNext(tPoll);
                            j2++;
                        } else {
                            return;
                        }
                    } else if (LJIJ(z, this.LLILZIL, c19500111Qx.isEmpty(), c11m9, c19500111Qx)) {
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.LLJIJIL.addAndGet(-j2);
                }
                iAddAndGet3 = addAndGet(-iAddAndGet3);
            } while (iAddAndGet3 != 0);
            return;
        }
        C19500111Qx<T> c19500111Qx2 = this.LLILLJJLI;
        boolean z4 = !this.LLILZ;
        while (!this.LLIZLLLIL) {
            boolean z5 = this.LLILZIL;
            if (z4 && z5 && this.LLILZLL != null) {
                c19500111Qx2.clear();
                this.LLIZ.lazySet(null);
                c11m9.onError(this.LLILZLL);
                return;
            }
            c11m9.onNext(null);
            if (z5) {
                this.LLIZ.lazySet(null);
                Throwable th = this.LLILZLL;
                if (th != null) {
                    c11m9.onError(th);
                    return;
                } else {
                    c11m9.onComplete();
                    return;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        c19500111Qx2.clear();
        this.LLIZ.lazySet(null);
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILZIL || this.LLIZLLLIL) {
            return;
        }
        this.LLILZIL = true;
        Runnable andSet = this.LLILLL.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        LJIJI();
    }

    public C11P6() {
        C1701890uOB.LIZIZ(8, "capacityHint");
        this.LLILLJJLI = new C19500111Qx<>(8);
        this.LLILLL = new AtomicReference<>(null);
        this.LLILZ = true;
        this.LLIZ = new AtomicReference<>();
        this.LLJ = new AtomicBoolean();
        this.LLJI = new C11NT<T>() { // from class: X.11P7
            public static final long serialVersionUID = -4896760517184205454L;

            @Override // X.C11NT, X.C11LR
            public final void cancel() {
                if (this.LL.LLIZLLLIL) {
                    return;
                }
                this.LL.LLIZLLLIL = true;
                Runnable andSet = this.LL.LLILLL.getAndSet(null);
                if (andSet != null) {
                    andSet.run();
                }
                C11P6 c11p6 = this.LL;
                if (c11p6.LLJILJIL || c11p6.LLJI.getAndIncrement() != 0) {
                    return;
                }
                this.LL.LLILLJJLI.clear();
                this.LL.LLIZ.lazySet(null);
            }

            @Override // X.C11NT, X.InterfaceC19494911Ox
            public final void clear() {
                this.LL.LLILLJJLI.clear();
            }

            @Override // X.C11NT, X.InterfaceC19494911Ox
            public final boolean isEmpty() {
                return this.LL.LLILLJJLI.isEmpty();
            }

            @Override // X.C11NT, X.InterfaceC19494911Ox
            public final T poll() {
                return this.LL.LLILLJJLI.poll();
            }

            @Override // X.C11NT, X.C11LR
            public final void request(long j) {
                if (C11NC.validate(j)) {
                    C19492311Nx.LIZ(this.LL.LLJIJIL, j);
                    this.LL.LJIJI();
                }
            }

            @Override // X.C11NT, X.InterfaceC19495111Oz
            public final int requestFusion(int i) {
                if ((i & 2) != 0) {
                    this.LL.LLJILJIL = true;
                    return 2;
                }
                return 0;
            }
        };
        this.LLJIJIL = new AtomicLong();
    }

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) {
        if (!this.LLJ.get() && this.LLJ.compareAndSet(false, true)) {
            c11m9.onSubscribe(this.LLJI);
            this.LLIZ.set(c11m9);
            if (this.LLIZLLLIL) {
                this.LLIZ.lazySet(null);
                return;
            } else {
                LJIJI();
                return;
            }
        }
        C11NS.error(new IllegalStateException("This processor allows only a single Subscriber"), c11m9);
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.LLILZIL && !this.LLIZLLLIL) {
            this.LLILZLL = th;
            this.LLILZIL = true;
            Runnable andSet = this.LLILLL.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            LJIJI();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        C1701890uOB.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.LLILZIL && !this.LLIZLLLIL) {
            this.LLILLJJLI.offer(t);
            LJIJI();
        }
    }

    @Override // X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (!this.LLILZIL && !this.LLIZLLLIL) {
            c11lr.request(Long.MAX_VALUE);
        } else {
            c11lr.cancel();
        }
    }

    public final boolean LJIJ(boolean z, boolean z2, boolean z3, C11M9<? super T> c11m9, C19500111Qx<T> c19500111Qx) {
        if (this.LLIZLLLIL) {
            c19500111Qx.clear();
            this.LLIZ.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.LLILZLL != null) {
                c19500111Qx.clear();
                this.LLIZ.lazySet(null);
                c11m9.onError(this.LLILZLL);
                return true;
            }
            if (z3) {
                Throwable th = this.LLILZLL;
                this.LLIZ.lazySet(null);
                if (th != null) {
                    c11m9.onError(th);
                    return true;
                }
                c11m9.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }
}
