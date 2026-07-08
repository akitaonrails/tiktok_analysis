package X;

import X.AnonymousClass1376;
import X.C137C;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1376, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AnonymousClass1376<K, V, E extends C137C<K, V, E>, S extends AnonymousClass1376<K, V, E, S>> extends ReentrantLock {
    public static final /* synthetic */ int LLIZ = 0;
    public final AnonymousClass1375<K, V, E, S> LL;
    public volatile int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public volatile AtomicReferenceArray<E> LLILZIL;
    public final AtomicInteger LLILZLL = new AtomicInteger();

    public void LJ() {
    }

    public void LJFF() {
    }

    public abstract S LJIIJ();

    public final void LIZJ() {
        AtomicReferenceArray<E> atomicReferenceArray = this.LLILZIL;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.LLILLJJLI;
        RunnableC19502511Rv runnableC19502511Rv = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
        this.LLILZ = (runnableC19502511Rv.length() * 3) / 4;
        int length2 = runnableC19502511Rv.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            E next = atomicReferenceArray.get(i2);
            if (next != null) {
                C137C next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    runnableC19502511Rv.set(hash, next);
                } else {
                    C137C c137c = next;
                    do {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            c137c = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    } while (next2 != null);
                    runnableC19502511Rv.set(hash, c137c);
                    while (next != c137c) {
                        int hash3 = next.getHash() & length2;
                        C137C c137c2 = (C137C) runnableC19502511Rv.get(hash3);
                        C137B<K, V, E, S> c137b = this.LL.LLILZLL;
                        LJIIJ();
                        C137C c137cLJ = c137b.LJ(this, next, c137c2);
                        if (c137cLJ != null) {
                            runnableC19502511Rv.set(hash3, c137cLJ);
                        } else {
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.LLILZIL = runnableC19502511Rv;
        this.LLILLJJLI = i;
    }

    public final void LJI() {
        if ((this.LLILZLL.incrementAndGet() & 63) == 0) {
            LJIIIZ();
        }
    }

    public final void LJIIIZ() {
        if (tryLock()) {
            try {
                LJFF();
                this.LLILZLL.set(0);
                unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                unlock();
                throw th;
            }
        }
    }

    public final void LJIIL() {
        if (tryLock()) {
            try {
                LJFF();
                unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                unlock();
                throw th;
            }
        }
    }

    public final void LIZ(ReferenceQueue<K> referenceQueue) {
        int i = 0;
        do {
            Reference<? extends K> referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                C137C c137c = (C137C) referencePoll;
                AnonymousClass1375<K, V, E, S> anonymousClass1375 = this.LL;
                anonymousClass1375.getClass();
                int hash = c137c.getHash();
                AnonymousClass1376<K, V, E, S> anonymousClass1376LIZIZ = anonymousClass1375.LIZIZ(hash);
                anonymousClass1376LIZIZ.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = anonymousClass1376LIZIZ.LLILZIL;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    E e = atomicReferenceArray.get(length);
                    C137C next = e;
                    while (true) {
                        if (next == null) {
                            break;
                        }
                        if (next != c137c) {
                            next = next.getNext();
                        } else {
                            anonymousClass1376LIZIZ.LLILLL++;
                            C137C c137cLJIIIIZZ = anonymousClass1376LIZIZ.LJIIIIZZ(e, next);
                            int i2 = anonymousClass1376LIZIZ.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, (E) c137cLJIIIIZZ);
                            anonymousClass1376LIZIZ.LLILLJJLI = i2;
                            break;
                        }
                    }
                    anonymousClass1376LIZIZ.unlock();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    anonymousClass1376LIZIZ.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    public final void LIZIZ(ReferenceQueue<V> referenceQueue) {
        int i = 0;
        do {
            Reference<? extends V> referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                C137R<K, V, E> c137r = (C137R) referencePoll;
                AnonymousClass1375<K, V, E, S> anonymousClass1375 = this.LL;
                anonymousClass1375.getClass();
                C137C c137cLIZIZ = c137r.LIZIZ();
                int hash = c137cLIZIZ.getHash();
                AnonymousClass1376<K, V, E, S> anonymousClass1376LIZIZ = anonymousClass1375.LIZIZ(hash);
                Object key = c137cLIZIZ.getKey();
                anonymousClass1376LIZIZ.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = anonymousClass1376LIZIZ.LLILZIL;
                    int length = (atomicReferenceArray.length() - 1) & hash;
                    E e = atomicReferenceArray.get(length);
                    C137C next = e;
                    while (true) {
                        if (next == null) {
                            break;
                        }
                        Object key2 = next.getKey();
                        if (next.getHash() == hash && key2 != null && anonymousClass1376LIZIZ.LL.LLILZIL.LIZJ(key, key2)) {
                            if (((C137O) next).LIZJ() == c137r) {
                                anonymousClass1376LIZIZ.LLILLL++;
                                C137C c137cLJIIIIZZ = anonymousClass1376LIZIZ.LJIIIIZZ(e, next);
                                int i2 = anonymousClass1376LIZIZ.LLILLJJLI - 1;
                                atomicReferenceArray.set(length, (E) c137cLJIIIIZZ);
                                anonymousClass1376LIZIZ.LLILLJJLI = i2;
                            }
                        } else {
                            next = next.getNext();
                        }
                    }
                    anonymousClass1376LIZIZ.unlock();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    anonymousClass1376LIZIZ.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    public AnonymousClass1376(AnonymousClass1375 anonymousClass1375, int i) {
        this.LL = anonymousClass1375;
        AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.LLILZ = length;
        if (length == -1) {
            this.LLILZ = 0;
        }
        this.LLILZIL = atomicReferenceArray;
    }

    public final C137C LIZLLL(int i, Object obj) {
        if (this.LLILLJJLI != 0) {
            for (E next = this.LLILZIL.get((r1.length() - 1) & i); next != null; next = next.getNext()) {
                if (next.getHash() == i) {
                    Object key = next.getKey();
                    if (key == null) {
                        LJIIL();
                    } else if (this.LL.LLILZIL.LIZJ(obj, key)) {
                        return next;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final E LJIIIIZZ(E e, E e2) {
        int i = this.LLILLJJLI;
        E e3 = (E) e2.getNext();
        while (e != e2) {
            C137B<K, V, E, S> c137b = this.LL.LLILZLL;
            LJIIJ();
            C137C c137cLJ = c137b.LJ(this, e, e3);
            if (c137cLJ != null) {
                e3 = (E) c137cLJ;
            } else {
                i--;
            }
            e = (E) e.getNext();
        }
        this.LLILLJJLI = i;
        return e3;
    }

    public final void LJIIJJI(E e, V v) {
        C137B<K, V, E, S> c137b = this.LL.LLILZLL;
        LJIIJ();
        c137b.LIZLLL(this, e, v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LJII(int i, Object obj, Object obj2, boolean z) {
        lock();
        try {
            LJIIIZ();
            int i2 = this.LLILLJJLI + 1;
            if (i2 > this.LLILZ) {
                LIZJ();
                i2 = this.LLILLJJLI + 1;
            }
            AtomicReferenceArray<E> atomicReferenceArray = this.LLILZIL;
            int length = (atomicReferenceArray.length() - 1) & i;
            E e = atomicReferenceArray.get(length);
            for (C137C next = e; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.LL.LLILZIL.LIZJ(obj, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        this.LLILLL++;
                        LJIIJJI(next, obj2);
                        this.LLILLJJLI = this.LLILLJJLI;
                        unlock();
                        return null;
                    }
                    if (z) {
                        unlock();
                        return value;
                    }
                    this.LLILLL++;
                    LJIIJJI(next, obj2);
                    unlock();
                    return value;
                }
            }
            this.LLILLL++;
            C137B<K, V, E, S> c137b = this.LL.LLILZLL;
            LJIIJ();
            C137C c137cLJFF = c137b.LJFF(this, obj, i, e);
            LJIIJJI(c137cLJFF, obj2);
            atomicReferenceArray.set(length, (E) c137cLJFF);
            this.LLILLJJLI = i2;
            unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            unlock();
            throw th;
        }
    }
}
