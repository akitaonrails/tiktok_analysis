package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19495711Pf<T> extends AtomicInteger implements C09AJ<T> {
    public static final long serialVersionUID = 4883307006032401862L;
    public final C09AJ<T> LL;
    public final C19487711Md LLILLJJLI = new C19487711Md();
    public final C19500111Qx<T> LLILLL = new C19500111Qx<>(16);
    public volatile boolean LLILZ;

    public final void LIZ() {
        C09AJ<T> c09aj = this.LL;
        C19500111Qx<T> c19500111Qx = this.LLILLL;
        C19487711Md c19487711Md = this.LLILLJJLI;
        int iAddAndGet = 1;
        while (!c09aj.isDisposed()) {
            if (c19487711Md.get() != null) {
                c19500111Qx.clear();
                c09aj.onError(c19487711Md.terminate());
                return;
            }
            boolean z = this.LLILZ;
            T tPoll = c19500111Qx.poll();
            boolean z2 = tPoll == null;
            if (z) {
                if (z2) {
                    c09aj.onComplete();
                    return;
                }
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            c09aj.onNext(tPoll);
        }
        c19500111Qx.clear();
    }

    @Override // X.C09AJ, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.isDisposed();
    }

    @Override // X.InterfaceC947803nA
    public final void onComplete() {
        if (this.LL.isDisposed() || this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.LL.toString();
    }

    public C19495711Pf(C09AJ<T> c09aj) {
        this.LL = c09aj;
    }

    @Override // X.InterfaceC947803nA
    public final void onError(Throwable th) {
        if (!tryOnError(th)) {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC947803nA
    public final void onNext(T t) {
        if (!this.LL.isDisposed() && !this.LLILZ) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.LL.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                C19500111Qx<T> c19500111Qx = this.LLILLL;
                synchronized (c19500111Qx) {
                    try {
                        c19500111Qx.offer(t);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            LIZ();
        }
    }

    @Override // X.C09AJ
    public final void setCancellable(C11KX c11kx) {
        this.LL.setCancellable(c11kx);
    }

    @Override // X.C09AJ
    public final void setDisposable(InterfaceC420801kM interfaceC420801kM) {
        this.LL.setDisposable(interfaceC420801kM);
    }

    @Override // X.C09AJ
    public final boolean tryOnError(Throwable th) {
        if (!this.LL.isDisposed() && !this.LLILZ) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.LLILLJJLI.addThrowable(th)) {
                this.LLILZ = true;
                if (getAndIncrement() == 0) {
                    LIZ();
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
