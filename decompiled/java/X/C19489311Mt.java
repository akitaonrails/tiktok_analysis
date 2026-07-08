package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489311Mt<T> extends AbstractC19484711Kz<T> implements InterfaceC19474811He<T> {
    public static final C19489411Mu[] LLILZIL = new C19489411Mu[0];
    public static final C19489411Mu[] LLILZLL = new C19489411Mu[0];
    public T LLILLL;
    public Throwable LLILZ;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean();
    public final AtomicReference<C19489411Mu<T>[]> LL = new AtomicReference<>(LLILZIL);

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
        C19489411Mu<T> c19489411Mu = new C19489411Mu<>(interfaceC19474811He, this);
        interfaceC19474811He.onSubscribe(c19489411Mu);
        while (true) {
            C19489411Mu<T>[] c19489411MuArr = this.LL.get();
            if (c19489411MuArr == LLILZLL) {
                Throwable th = this.LLILZ;
                if (th != null) {
                    interfaceC19474811He.onError(th);
                    return;
                } else {
                    interfaceC19474811He.onSuccess(this.LLILLL);
                    return;
                }
            }
            int length = c19489411MuArr.length;
            C19489411Mu<T>[] c19489411MuArr2 = new C19489411Mu[length + 1];
            System.arraycopy(c19489411MuArr, 0, c19489411MuArr2, 0, length);
            c19489411MuArr2[length] = c19489411Mu;
            AtomicReference<C19489411Mu<T>[]> atomicReference = this.LL;
            while (!atomicReference.compareAndSet(c19489411MuArr, c19489411MuArr2)) {
                if (atomicReference.get() != c19489411MuArr) {
                    break;
                }
            }
            if (!c19489411Mu.isDisposed()) {
                return;
            }
            LJJJIL(c19489411Mu);
            return;
        }
    }

    public final void LJJJIL(C19489411Mu<T> c19489411Mu) {
        C19489411Mu<T>[] c19489411MuArr;
        while (true) {
            C19489411Mu<T>[] c19489411MuArr2 = this.LL.get();
            int length = c19489411MuArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c19489411MuArr2[i] != c19489411Mu) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c19489411MuArr = LLILZIL;
                } else {
                    c19489411MuArr = new C19489411Mu[length - 1];
                    System.arraycopy(c19489411MuArr2, 0, c19489411MuArr, 0, i);
                    System.arraycopy(c19489411MuArr2, i + 1, c19489411MuArr, i, (length - i) - 1);
                }
                AtomicReference<C19489411Mu<T>[]> atomicReference = this.LL;
                while (!atomicReference.compareAndSet(c19489411MuArr2, c19489411MuArr)) {
                    if (atomicReference.get() != c19489411MuArr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            this.LLILZ = th;
            for (C19489411Mu<T> c19489411Mu : this.LL.getAndSet(LLILZLL)) {
                c19489411Mu.LL.onError(th);
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (this.LL.get() == LLILZLL) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        C1701890uOB.LIZ(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            this.LLILLL = t;
            for (C19489411Mu<T> c19489411Mu : this.LL.getAndSet(LLILZLL)) {
                c19489411Mu.LL.onSuccess(t);
            }
        }
    }
}
