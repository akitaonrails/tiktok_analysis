package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0py9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531990py9<E> {
    public volatile boolean LIZIZ;
    public volatile Thread LIZJ;
    public final C1531990py9<E>.b<E> LIZ = new b<>(null);
    public final AtomicInteger LIZLLL = new AtomicInteger(0);

    /* JADX INFO: renamed from: X.0py9$b */
    public final class b<E> {
        public final E LIZ;
        public final AtomicReference<C1531990py9<E>.b<E>> LIZIZ = new AtomicReference<>(null);

        public final C1531990py9<E>.b<E> LIZ() {
            return this.LIZIZ.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.LIZ = obj;
        }
    }

    public final boolean LIZ(E e) {
        Thread thread;
        Thread thread2;
        if (this.LIZIZ) {
            return false;
        }
        this.LIZLLL.incrementAndGet();
        if (this.LIZIZ) {
            if (this.LIZLLL.decrementAndGet() == 0 && (thread2 = this.LIZJ) != null) {
                this.LIZJ = null;
                LockSupport.unpark(thread2);
            }
            return false;
        }
        C1531990py9<E>.b<E> bVar = new b<>(e);
        loop0: while (true) {
            C1531990py9<E>.b<E> bVarLIZ = this.LIZ.LIZ();
            bVar.LIZIZ.set(bVarLIZ);
            AtomicReference<C1531990py9<E>.b<E>> atomicReference = this.LIZ.LIZIZ;
            while (!atomicReference.compareAndSet(bVarLIZ, bVar)) {
                if (atomicReference.get() != bVarLIZ) {
                    break;
                }
            }
        }
        if (this.LIZLLL.decrementAndGet() == 0 && (thread = this.LIZJ) != null) {
            this.LIZJ = null;
            LockSupport.unpark(thread);
        }
        return true;
    }

    public final void LIZIZ(Function1<? super E, Boolean> function1) {
        C1531990py9<E>.b<E> bVarLIZ = this.LIZ.LIZ();
        while (bVarLIZ != null) {
            E e = bVarLIZ.LIZ;
            if (e == null) {
                C1532760pzO.LIZJ(C1532930pzf.LIZJ, "ConcurrentTurtleStack", "traverseIfMatched", "value is null", null, null, 48);
                bVarLIZ = bVarLIZ.LIZ();
            } else if (!function1.invoke(e).booleanValue()) {
                bVarLIZ = bVarLIZ.LIZ();
            } else {
                return;
            }
        }
    }
}
