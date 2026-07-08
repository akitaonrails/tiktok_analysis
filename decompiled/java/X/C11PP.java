package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11PP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PP<T> implements InterfaceC420801kM, C11PT<Object> {
    public final InterfaceC626120Oh8<? super T> LL;
    public final C11PQ<T> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C11PM<Object> LLILZIL;
    public boolean LLILZLL;
    public volatile boolean LLIZ;
    public long LLIZLLLIL;

    public final void LIZ() {
        C11PM<Object> c11pm;
        while (!this.LLIZ) {
            synchronized (this) {
                try {
                    c11pm = this.LLILZIL;
                    if (c11pm == null) {
                        this.LLILZ = false;
                        return;
                    }
                    this.LLILZIL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c11pm.LIZJ(this);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLILLJJLI.LJZ(this);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZ;
    }

    @Override // X.C11PT, X.InterfaceC19483011Ki
    public final boolean test(Object obj) {
        if (!this.LLIZ && !C11PO.accept(obj, this.LL)) {
            return false;
        }
        return true;
    }

    public C11PP(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C11PQ<T> c11pq) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c11pq;
    }

    public final void LIZIZ(long j, Object obj) {
        if (this.LLIZ) {
            return;
        }
        if (!this.LLILZLL) {
            synchronized (this) {
                try {
                    if (this.LLIZ) {
                        return;
                    }
                    if (this.LLIZLLLIL == j) {
                        return;
                    }
                    if (this.LLILZ) {
                        C11PM<Object> c11pm = this.LLILZIL;
                        if (c11pm == null) {
                            c11pm = new C11PM<>();
                            this.LLILZIL = c11pm;
                        }
                        c11pm.LIZIZ(obj);
                        return;
                    }
                    this.LLILLL = true;
                    this.LLILZLL = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        test(obj);
    }
}
