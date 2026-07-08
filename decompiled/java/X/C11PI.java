package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11PI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PI<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public InterfaceC420801kM LLILLJJLI;
    public boolean LLILLL;
    public C11PM<Object> LLILZ;
    public volatile boolean LLILZIL;

    public final void LIZ() {
        Object[] objArr;
        while (true) {
            synchronized (this) {
                try {
                    C11PM<Object> c11pm = this.LLILZ;
                    if (c11pm == null) {
                        this.LLILLL = false;
                        return;
                    }
                    this.LLILZ = null;
                    InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LL;
                    for (Object[] objArr2 = c11pm.LIZ; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (C11PO.acceptFull(objArr, interfaceC626120Oh8)) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
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

    public C11PI(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = interfaceC626120Oh8;
    }

    @Override // X.InterfaceC626120Oh8
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

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZIL) {
            return;
        }
        if (t == null) {
            this.LLILLJJLI.dispose();
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

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLJJLI, interfaceC420801kM)) {
            this.LLILLJJLI = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }
}
