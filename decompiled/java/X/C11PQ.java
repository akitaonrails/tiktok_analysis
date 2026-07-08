package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.11PQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PQ<T> extends C11PR<T> {
    public static final Object[] LLIZ = new Object[0];
    public static final C11PP[] LLIZLLLIL = new C11PP[0];
    public static final C11PP[] LLJ = new C11PP[0];
    public final AtomicReference<Object> LL;
    public final AtomicReference<C11PP<T>[]> LLILLJJLI;
    public final Lock LLILLL;
    public final Lock LLILZ;
    public final AtomicReference<Throwable> LLILZIL;
    public long LLILZLL;

    public final T LJLZ() {
        T t = (T) this.LL.get();
        if (C11PO.isComplete(t) || C11PO.isError(t)) {
            return null;
        }
        C11PO.getValue(t);
        return t;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        AtomicReference<Throwable> atomicReference = this.LLILZIL;
        C11NG c11ng = C11QG.LIZ;
        do {
            if (atomicReference.compareAndSet(null, c11ng)) {
                Object objComplete = C11PO.complete();
                AtomicReference<C11PP<T>[]> atomicReference2 = this.LLILLJJLI;
                C11PP<T>[] c11ppArr = LLJ;
                C11PP<T>[] andSet = atomicReference2.getAndSet(c11ppArr);
                if (andSet != c11ppArr) {
                    this.LLILZ.lock();
                    this.LLILZLL++;
                    this.LL.lazySet(objComplete);
                    this.LLILZ.unlock();
                }
                for (C11PP<T> c11pp : andSet) {
                    c11pp.LIZIZ(this.LLILZLL, objComplete);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    public C11PQ() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LLILLL = reentrantReadWriteLock.readLock();
        this.LLILZ = reentrantReadWriteLock.writeLock();
        this.LLILLJJLI = new AtomicReference<>(LLIZLLLIL);
        this.LL = new AtomicReference<>();
        this.LLILZIL = new AtomicReference<>();
    }

    public static <T> C11PQ<T> LJLLLLLL(T t) {
        C11PQ<T> c11pq = new C11PQ<>();
        AtomicReference<Object> atomicReference = c11pq.LL;
        C1701890uOB.LIZ(t, "defaultValue is null");
        atomicReference.lazySet(t);
        return c11pq;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11PP<T> c11pp = new C11PP<>(interfaceC626120Oh8, this);
        interfaceC626120Oh8.onSubscribe(c11pp);
        while (true) {
            C11PP<T>[] c11ppArr = this.LLILLJJLI.get();
            boolean z = false;
            if (c11ppArr == LLJ) {
                Throwable th = this.LLILZIL.get();
                if (th == C11QG.LIZ) {
                    interfaceC626120Oh8.onComplete();
                    return;
                } else {
                    interfaceC626120Oh8.onError(th);
                    return;
                }
            }
            int length = c11ppArr.length;
            C11PP<T>[] c11ppArr2 = new C11PP[length + 1];
            System.arraycopy(c11ppArr, 0, c11ppArr2, 0, length);
            c11ppArr2[length] = c11pp;
            AtomicReference<C11PP<T>[]> atomicReference = this.LLILLJJLI;
            while (!atomicReference.compareAndSet(c11ppArr, c11ppArr2)) {
                if (atomicReference.get() != c11ppArr) {
                    break;
                }
            }
            if (c11pp.LLIZ) {
                LJZ(c11pp);
                return;
            }
            if (c11pp.LLIZ) {
                return;
            }
            synchronized (c11pp) {
                try {
                    if (!c11pp.LLIZ) {
                        if (!c11pp.LLILLL) {
                            C11PQ<T> c11pq = c11pp.LLILLJJLI;
                            Lock lock = c11pq.LLILLL;
                            lock.lock();
                            c11pp.LLIZLLLIL = c11pq.LLILZLL;
                            Object obj = c11pq.LL.get();
                            lock.unlock();
                            if (obj != null) {
                                z = true;
                            }
                            c11pp.LLILZ = z;
                            c11pp.LLILLL = true;
                            if (obj == null || c11pp.test(obj)) {
                                return;
                            }
                            c11pp.LIZ();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    public final void LJZ(C11PP<T> c11pp) {
        C11PP<T>[] c11ppArr;
        while (true) {
            C11PP<T>[] c11ppArr2 = this.LLILLJJLI.get();
            int length = c11ppArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c11ppArr2[i] != c11pp) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    c11ppArr = LLIZLLLIL;
                } else {
                    c11ppArr = new C11PP[length - 1];
                    System.arraycopy(c11ppArr2, 0, c11ppArr, 0, i);
                    System.arraycopy(c11ppArr2, i + 1, c11ppArr, i, (length - i) - 1);
                }
                AtomicReference<C11PP<T>[]> atomicReference = this.LLILLJJLI;
                while (!atomicReference.compareAndSet(c11ppArr2, c11ppArr)) {
                    if (atomicReference.get() != c11ppArr2) {
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
        C1701890uOB.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.LLILZIL;
        do {
            if (atomicReference.compareAndSet(null, th)) {
                Object objError = C11PO.error(th);
                AtomicReference<C11PP<T>[]> atomicReference2 = this.LLILLJJLI;
                C11PP<T>[] c11ppArr = LLJ;
                C11PP<T>[] andSet = atomicReference2.getAndSet(c11ppArr);
                if (andSet != c11ppArr) {
                    this.LLILZ.lock();
                    this.LLILZLL++;
                    this.LL.lazySet(objError);
                    this.LLILZ.unlock();
                }
                for (C11PP<T> c11pp : andSet) {
                    c11pp.LIZIZ(this.LLILZLL, objError);
                }
                return;
            }
        } while (atomicReference.get() == null);
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        C1701890uOB.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LLILZIL.get() != null) {
            return;
        }
        C11PO.next(t);
        this.LLILZ.lock();
        this.LLILZLL++;
        this.LL.lazySet(t);
        this.LLILZ.unlock();
        for (C11PP<T> c11pp : this.LLILLJJLI.get()) {
            c11pp.LIZIZ(this.LLILZLL, t);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (this.LLILZIL.get() != null) {
            interfaceC420801kM.dispose();
        }
    }
}
