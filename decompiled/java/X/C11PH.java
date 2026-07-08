package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11PH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PH<T> implements C11PF<T>, C11LR {
    public final C11M9<? super T> LL;
    public C11LR LLILLJJLI;
    public boolean LLILLL;
    public C11PM<Object> LLILZ;
    public volatile boolean LLILZIL;

    public final void LIZ() {
        C11PM<Object> c11pm;
        do {
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
        } while (!c11pm.LIZ(this.LL));
    }

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.cancel();
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
                if (!this.LLILLL) {
                    this.LLILZIL = true;
                    this.LLILLL = true;
                    this.LL.onComplete();
                } else {
                    C11PM<Object> c11pm = this.LLILZ;
                    if (c11pm == null) {
                        c11pm = new C11PM<>();
                        this.LLILZ = c11pm;
                    }
                    c11pm.LIZIZ(C11PO.complete());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C11PH(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILZIL) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.LLILZIL) {
                    if (this.LLILLL) {
                        this.LLILZIL = true;
                        C11PM<Object> c11pm = this.LLILZ;
                        if (c11pm == null) {
                            c11pm = new C11PM<>();
                            this.LLILZ = c11pm;
                        }
                        c11pm.LIZ[0] = C11PO.error(th);
                        return;
                    }
                    this.LLILZIL = true;
                    this.LLILLL = true;
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

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLILZIL) {
            return;
        }
        if (t == null) {
            this.LLILLJJLI.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
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
                this.LL.onNext(t);
                LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        this.LLILLJJLI.request(j);
    }
}
