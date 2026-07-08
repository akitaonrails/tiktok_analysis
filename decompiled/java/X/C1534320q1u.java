package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534320q1u<E> {
    public volatile boolean LIZIZ;
    public boolean LIZLLL;
    public C1534730q2Z LJ;
    public final C1534320q1u<E>.b<E> LIZ = new b<>(null);
    public final AtomicInteger LIZJ = new AtomicInteger(0);

    /* JADX INFO: renamed from: X.0q1u$b */
    public final class b<E> {
        public final E LIZ;
        public final AtomicReference<C1534320q1u<E>.b<E>> LIZIZ = new AtomicReference<>(null);

        public final C1534320q1u<E>.b<E> LIZ() {
            return this.LIZIZ.get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.LIZ = obj;
        }
    }

    public final boolean LIZIZ() {
        return this.LIZ.LIZ() == null && this.LIZJ.get() <= 0 && this.LIZ.LIZ() == null;
    }

    public final boolean LIZ(E e) {
        if (this.LIZIZ) {
            return false;
        }
        this.LIZJ.incrementAndGet();
        C1534320q1u<E>.b<E> bVar = new b<>(e);
        loop0: while (true) {
            C1534320q1u<E>.b<E> bVarLIZ = this.LIZ.LIZ();
            bVar.LIZIZ.set(bVarLIZ);
            AtomicReference<C1534320q1u<E>.b<E>> atomicReference = this.LIZ.LIZIZ;
            while (!atomicReference.compareAndSet(bVarLIZ, bVar)) {
                if (atomicReference.get() != bVarLIZ) {
                    break;
                }
            }
        }
        this.LIZJ.decrementAndGet();
        this.LIZLLL = true;
        C1534730q2Z c1534730q2Z = this.LJ;
        if (c1534730q2Z != null) {
            c1534730q2Z.LIZ();
        }
        return true;
    }

    public final void LIZJ(Function1<? super E, Boolean> function1) {
        E e;
        for (C1534320q1u<E>.b<E> bVarLIZ = this.LIZ.LIZ(); bVarLIZ != null; bVarLIZ = bVarLIZ.LIZ()) {
            while (true) {
                e = bVarLIZ.LIZ;
                if (e != null) {
                    break;
                } else {
                    C1533480q0Y.LIZJ("ForestConcurrentStack", null, null, null, "value is null", null, null, null, null, null, null, 8174);
                }
            }
            if (function1.invoke(e).booleanValue()) {
                return;
            }
        }
    }
}
