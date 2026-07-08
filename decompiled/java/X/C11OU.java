package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11OU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OU<T> extends C11M6<T, T> {
    public final InterfaceC1487280oo2<? super C11NN<Throwable>, ? extends C11LE<?>> LLILLL;

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) throws Throwable {
        C11PH c11ph = new C11PH(c11m9);
        final C11P6 c11p6 = new C11P6();
        boolean z = c11p6 instanceof C11PG;
        AbstractC19492911Od<T> abstractC19492911Od = c11p6;
        if (!z) {
            abstractC19492911Od = new AbstractC19492911Od<T>(c11p6) { // from class: X.11PG
                public final AbstractC19492911Od<T> LLILLJJLI;
                public boolean LLILLL;
                public C11PM<Object> LLILZ;
                public volatile boolean LLILZIL;

                public final void LJIJ() {
                    C11PM<Object> c11pm;
                    while (true) {
                        synchronized (this) {
                            try {
                                c11pm = this.LLILZ;
                                if (c11pm == null) {
                                    this.LLILLL = false;
                                    return;
                                }
                                this.LLILZ = null;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        c11pm.LIZ(this.LLILLJJLI);
                    }
                }

                @Override // X.C11M9
                public final void onComplete() {
                    if (this.LLILZIL) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            if (this.LLILZIL) {
                                return;
                            }
                            this.LLILZIL = true;
                            if (!this.LLILLL) {
                                this.LLILLL = true;
                                this.LLILLJJLI.onComplete();
                                return;
                            }
                            C11PM<Object> c11pm = this.LLILZ;
                            if (c11pm == null) {
                                c11pm = new C11PM<>();
                                this.LLILZ = c11pm;
                            }
                            c11pm.LIZIZ(C11PO.complete());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                {
                    this.LLILLJJLI = c11p6;
                }

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super T> c11m92) {
                    this.LLILLJJLI.subscribe(c11m92);
                }

                @Override // X.C11M9
                public final void onError(Throwable th) {
                    if (this.LLILZIL) {
                        C19489211Ms.LIZIZ(th);
                        return;
                    }
                    synchronized (this) {
                        try {
                            boolean z2 = true;
                            if (!this.LLILZIL) {
                                this.LLILZIL = true;
                                if (this.LLILLL) {
                                    C11PM<Object> c11pm = this.LLILZ;
                                    if (c11pm == null) {
                                        c11pm = new C11PM<>();
                                        this.LLILZ = c11pm;
                                    }
                                    c11pm.LIZ[0] = C11PO.error(th);
                                    return;
                                }
                                this.LLILLL = true;
                                z2 = false;
                            }
                            if (z2) {
                                C19489211Ms.LIZIZ(th);
                            } else {
                                this.LLILLJJLI.onError(th);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.C11M9
                public final void onNext(T t) {
                    if (this.LLILZIL) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            if (this.LLILZIL) {
                                return;
                            }
                            if (this.LLILLL) {
                                C11PM<Object> c11pm = this.LLILZ;
                                if (c11pm == null) {
                                    c11pm = new C11PM<>();
                                    this.LLILZ = c11pm;
                                }
                                C11PO.next(t);
                                c11pm.LIZIZ(t);
                                return;
                            }
                            this.LLILLL = true;
                            this.LLILLJJLI.onNext(t);
                            LJIJ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.C11M9
                public final void onSubscribe(C11LR c11lr) {
                    boolean z2 = true;
                    if (!this.LLILZIL) {
                        synchronized (this) {
                            try {
                                if (!this.LLILZIL) {
                                    if (this.LLILLL) {
                                        C11PM<Object> c11pm = this.LLILZ;
                                        if (c11pm == null) {
                                            c11pm = new C11PM<>();
                                            this.LLILZ = c11pm;
                                        }
                                        c11pm.LIZIZ(C11PO.subscription(c11lr));
                                        return;
                                    }
                                    this.LLILLL = true;
                                    z2 = false;
                                }
                                if (!z2) {
                                    this.LLILLJJLI.onSubscribe(c11lr);
                                    LJIJ();
                                    return;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    c11lr.cancel();
                }
            };
        }
        try {
            C11LE<?> c11leApply = this.LLILLL.apply(abstractC19492911Od);
            C1701890uOB.LIZ(c11leApply, "handler returned a null Publisher");
            C11LE<?> c11le = c11leApply;
            C11OT c11ot = new C11OT(this.LLILLJJLI);
            C11OW<T, Throwable> c11ow = new C11OW<T, Throwable>(c11ph, abstractC19492911Od, c11ot) { // from class: X.11OV
                public static final long serialVersionUID = -2680129890138081029L;

                @Override // X.C11M9
                public final void onComplete() {
                    this.LLJIJIL.cancel();
                    this.LLJ.onComplete();
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C11M9
                public final void onError(Throwable th) {
                    setSubscription(C11NS.INSTANCE);
                    long j = this.LLJILJIL;
                    if (j != 0) {
                        this.LLJILJIL = 0L;
                        produced(j);
                    }
                    this.LLJIJIL.request(1L);
                    this.LLJI.onNext((U) th);
                }
            };
            c11ot.LLILZ = c11ow;
            c11m9.onSubscribe(c11ow);
            c11le.subscribe(c11ot);
            c11ot.onNext(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11NS.error(th, c11m9);
        }
    }

    public C11OU(C11NN<T> c11nn, InterfaceC1487280oo2<? super C11NN<Throwable>, ? extends C11LE<?>> interfaceC1487280oo2) {
        super(c11nn);
        this.LLILLL = interfaceC1487280oo2;
    }
}
