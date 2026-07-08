package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11R5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R5<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final C11R7[] LLILZIL = new C11R7[0];
    public static final C11R7[] LLILZLL = new C11R7[0];
    public final AtomicReference<C11R5<T>> LL;
    public final AtomicReference<InterfaceC420801kM> LLILZ = new AtomicReference<>();
    public final AtomicReference<C11R7<T>[]> LLILLJJLI = new AtomicReference<>(LLILZIL);
    public final AtomicBoolean LLILLL = new AtomicBoolean();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        AtomicReference<C11R7<T>[]> atomicReference = this.LLILLJJLI;
        C11R7<T>[] c11r7Arr = LLILZLL;
        if (atomicReference.getAndSet(c11r7Arr) != c11r7Arr) {
            AtomicReference<C11R5<T>> atomicReference2 = this.LL;
            while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
            }
            C11JE.dispose(this.LLILZ);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.get() == LLILZLL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        AtomicReference<C11R5<T>> atomicReference = this.LL;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        for (C11R7<T> c11r7 : this.LLILLJJLI.getAndSet(LLILZLL)) {
            c11r7.LL.onComplete();
        }
    }

    public C11R5(AtomicReference<C11R5<T>> atomicReference) {
        this.LL = atomicReference;
    }

    public final void LIZ(C11R7<T> c11r7) {
        C11R7<T>[] c11r7Arr;
        while (true) {
            C11R7<T>[] c11r7Arr2 = this.LLILLJJLI.get();
            int length = c11r7Arr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (!c11r7Arr2[i].equals(c11r7)) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c11r7Arr = LLILZIL;
                } else {
                    c11r7Arr = new C11R7[length - 1];
                    System.arraycopy(c11r7Arr2, 0, c11r7Arr, 0, i);
                    System.arraycopy(c11r7Arr2, i + 1, c11r7Arr, i, (length - i) - 1);
                }
                AtomicReference<C11R7<T>[]> atomicReference = this.LLILLJJLI;
                while (!atomicReference.compareAndSet(c11r7Arr2, c11r7Arr)) {
                    if (atomicReference.get() != c11r7Arr2) {
                        break;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        AtomicReference<C11R5<T>> atomicReference = this.LL;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        C11R7<T>[] andSet = this.LLILLJJLI.getAndSet(LLILZLL);
        if (andSet.length != 0) {
            for (C11R7<T> c11r7 : andSet) {
                c11r7.LL.onError(th);
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        for (C11R7<T> c11r7 : this.LLILLJJLI.get()) {
            c11r7.LL.onNext(t);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLILZ, interfaceC420801kM);
    }
}
