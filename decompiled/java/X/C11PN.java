package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11PN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PN<T> extends C11PR<T> implements C11PT<Object> {
    public final C11PR<T> LL;
    public boolean LLILLJJLI;
    public C11PM<Object> LLILLL;
    public volatile boolean LLILZ;

    public final void LJLLLLLL() {
        C11PM<Object> c11pm;
        while (true) {
            synchronized (this) {
                try {
                    c11pm = this.LLILLL;
                    if (c11pm == null) {
                        this.LLILLJJLI = false;
                        return;
                    }
                    this.LLILLL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c11pm.LIZJ(this);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZ) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILZ) {
                    return;
                }
                this.LLILZ = true;
                if (!this.LLILLJJLI) {
                    this.LLILLJJLI = true;
                    this.LL.onComplete();
                    return;
                }
                C11PM<Object> c11pm = this.LLILLL;
                if (c11pm == null) {
                    c11pm = new C11PM<>();
                    this.LLILLL = c11pm;
                }
                c11pm.LIZIZ(C11PO.complete());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C11PN(C11PR<T> c11pr) {
        this.LL = c11pr;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL.LIZIZ(interfaceC626120Oh8);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.LLILZ) {
                    this.LLILZ = true;
                    if (this.LLILLJJLI) {
                        C11PM<Object> c11pm = this.LLILLL;
                        if (c11pm == null) {
                            c11pm = new C11PM<>();
                            this.LLILLL = c11pm;
                        }
                        c11pm.LIZ[0] = C11PO.error(th);
                        return;
                    }
                    this.LLILLJJLI = true;
                    z = false;
                }
                if (z) {
                    C19489211Ms.LIZIZ(th);
                } else {
                    this.LL.onError(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZ) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILZ) {
                    return;
                }
                if (this.LLILLJJLI) {
                    C11PM<Object> c11pm = this.LLILLL;
                    if (c11pm == null) {
                        c11pm = new C11PM<>();
                        this.LLILLL = c11pm;
                    }
                    C11PO.next(t);
                    c11pm.LIZIZ(t);
                    return;
                }
                this.LLILLJJLI = true;
                this.LL.onNext(t);
                LJLLLLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        boolean z = true;
        if (!this.LLILZ) {
            synchronized (this) {
                try {
                    if (!this.LLILZ) {
                        if (this.LLILLJJLI) {
                            C11PM<Object> c11pm = this.LLILLL;
                            if (c11pm == null) {
                                c11pm = new C11PM<>();
                                this.LLILLL = c11pm;
                            }
                            c11pm.LIZIZ(C11PO.disposable(interfaceC420801kM));
                            return;
                        }
                        this.LLILLJJLI = true;
                        z = false;
                    }
                    if (!z) {
                        this.LL.onSubscribe(interfaceC420801kM);
                        LJLLLLLL();
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        interfaceC420801kM.dispose();
    }

    @Override // X.C11PT, X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        return C11PO.acceptFull(obj, this.LL);
    }
}
