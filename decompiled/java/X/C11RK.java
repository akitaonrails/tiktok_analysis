package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11RK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RK<T> extends C11PR<T> {
    public static final C11RL[] LLILLL = new C11RL[0];
    public static final C11RL[] LLILZ = new C11RL[0];
    public final AtomicReference<C11RL<T>[]> LL = new AtomicReference<>(LLILZ);
    public Throwable LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11RL<T>[] c11rlArr = this.LL.get();
        C11RL<T>[] c11rlArr2 = LLILLL;
        if (c11rlArr == c11rlArr2) {
            return;
        }
        for (C11RL<T> c11rl : this.LL.getAndSet(c11rlArr2)) {
            if (!c11rl.get()) {
                c11rl.LL.onComplete();
            }
        }
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11RL<T> c11rl = new C11RL<>(interfaceC626120Oh8, this);
        interfaceC626120Oh8.onSubscribe(c11rl);
        while (true) {
            C11RL<T>[] c11rlArr = this.LL.get();
            if (c11rlArr == LLILLL) {
                Throwable th = this.LLILLJJLI;
                if (th != null) {
                    interfaceC626120Oh8.onError(th);
                    return;
                } else {
                    interfaceC626120Oh8.onComplete();
                    return;
                }
            }
            int length = c11rlArr.length;
            C11RL<T>[] c11rlArr2 = new C11RL[length + 1];
            System.arraycopy(c11rlArr, 0, c11rlArr2, 0, length);
            c11rlArr2[length] = c11rl;
            AtomicReference<C11RL<T>[]> atomicReference = this.LL;
            while (!atomicReference.compareAndSet(c11rlArr, c11rlArr2)) {
                if (atomicReference.get() != c11rlArr) {
                    break;
                }
            }
            if (!c11rl.get()) {
                return;
            }
            LJLLLLLL(c11rl);
            return;
        }
    }

    public final void LJLLLLLL(C11RL<T> c11rl) {
        C11RL<T>[] c11rlArr;
        while (true) {
            C11RL<T>[] c11rlArr2 = this.LL.get();
            if (c11rlArr2 != LLILLL && c11rlArr2 != (c11rlArr = LLILZ)) {
                int length = c11rlArr2.length;
                for (int i = 0; i < length; i++) {
                    if (c11rlArr2[i] == c11rl) {
                        if (i >= 0) {
                            if (length != 1) {
                                c11rlArr = new C11RL[length - 1];
                                System.arraycopy(c11rlArr2, 0, c11rlArr, 0, i);
                                System.arraycopy(c11rlArr2, i + 1, c11rlArr, i, (length - i) - 1);
                            }
                            AtomicReference<C11RL<T>[]> atomicReference = this.LL;
                            while (!atomicReference.compareAndSet(c11rlArr2, c11rlArr)) {
                                if (atomicReference.get() != c11rlArr2) {
                                    break;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C11RL<T>[] c11rlArr = this.LL.get();
        C11RL<T>[] c11rlArr2 = LLILLL;
        if (c11rlArr == c11rlArr2) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLILLJJLI = th;
        for (C11RL<T> c11rl : this.LL.getAndSet(c11rlArr2)) {
            if (c11rl.get()) {
                C19489211Ms.LIZIZ(th);
            } else {
                c11rl.LL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        C1701890uOB.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C11RL<T> c11rl : this.LL.get()) {
            if (!c11rl.get()) {
                c11rl.LL.onNext(t);
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (this.LL.get() == LLILLL) {
            interfaceC420801kM.dispose();
        }
    }
}
