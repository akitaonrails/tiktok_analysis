package X;

import a75.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.138e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199610138e<K, V> extends ReentrantLock {
    public final c<K, V> LL;
    public volatile int LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public volatile AtomicReferenceArray<InterfaceC199613138h<K, V>> LLILZLL;
    public final long LLIZ;
    public final ReferenceQueue<K> LLIZLLLIL;
    public final ReferenceQueue<V> LLJ;
    public final Queue<InterfaceC199613138h<K, V>> LLJI;
    public final AtomicInteger LLJIJIL = new AtomicInteger();
    public final Queue<InterfaceC199613138h<K, V>> LLJILJIL;
    public final Queue<InterfaceC199613138h<K, V>> LLJILJILJ;

    public final void LIZIZ() {
        while (true) {
            InterfaceC199613138h<K, V> interfaceC199613138hPoll = this.LLJI.poll();
            if (interfaceC199613138hPoll == null) {
                return;
            }
            if (this.LLJILJILJ.contains(interfaceC199613138hPoll)) {
                this.LLJILJILJ.add(interfaceC199613138hPoll);
            }
        }
    }

    public final void LIZJ() {
        if (this.LL.LLIZ != C139I.LL) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.LLIZLLLIL.poll();
                if (referencePoll == null) {
                    break;
                }
                InterfaceC199613138h<K, V> interfaceC199613138h = (InterfaceC199613138h) referencePoll;
                c<K, V> cVar = this.LL;
                cVar.getClass();
                int hash = interfaceC199613138h.getHash();
                C199610138e<K, V> c199610138eLJI = cVar.LJI(hash);
                c199610138eLJI.lock();
                try {
                    AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = c199610138eLJI.LLILZLL;
                    int length = (atomicReferenceArray.length() - 1) & hash;
                    InterfaceC199613138h<K, V> interfaceC199613138h2 = atomicReferenceArray.get(length);
                    InterfaceC199613138h<K, V> next = interfaceC199613138h2;
                    while (true) {
                        if (next == null) {
                            break;
                        }
                        if (next == interfaceC199613138h) {
                            c199610138eLJI.LLILZ++;
                            InterfaceC199613138h<K, V> interfaceC199613138hLJIILIIL = c199610138eLJI.LJIILIIL(interfaceC199613138h2, next, next.getKey(), hash, next.LIZJ().get(), next.LIZJ(), AnonymousClass1391.COLLECTED);
                            int i2 = c199610138eLJI.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, interfaceC199613138hLJIILIIL);
                            c199610138eLJI.LLILLJJLI = i2;
                            break;
                        }
                        next = next.getNext();
                    }
                    c199610138eLJI.unlock();
                    c199610138eLJI.LJIILL();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c199610138eLJI.unlock();
                    c199610138eLJI.LJIILL();
                    throw th;
                }
            } while (i != 16);
        }
        if (this.LL.LLIZLLLIL != C139I.LL) {
            int i3 = 0;
            do {
                Reference<? extends V> referencePoll2 = this.LLJ.poll();
                if (referencePoll2 == null) {
                    return;
                }
                InterfaceC199612138g<K, V> interfaceC199612138g = (InterfaceC199612138g) referencePoll2;
                c<K, V> cVar2 = this.LL;
                cVar2.getClass();
                InterfaceC199613138h<K, V> interfaceC199613138hLIZIZ = interfaceC199612138g.LIZIZ();
                int hash2 = interfaceC199613138hLIZIZ.getHash();
                C199610138e<K, V> c199610138eLJI2 = cVar2.LJI(hash2);
                K key = interfaceC199613138hLIZIZ.getKey();
                c199610138eLJI2.lock();
                try {
                    AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray2 = c199610138eLJI2.LLILZLL;
                    int length2 = (atomicReferenceArray2.length() - 1) & hash2;
                    InterfaceC199613138h<K, V> interfaceC199613138h3 = atomicReferenceArray2.get(length2);
                    InterfaceC199613138h<K, V> next2 = interfaceC199613138h3;
                    while (true) {
                        if (next2 != null) {
                            K key2 = next2.getKey();
                            if (next2.getHash() != hash2 || key2 == null || !c199610138eLJI2.LL.LLILZIL.LIZJ(key, key2)) {
                                next2 = next2.getNext();
                            } else if (next2.LIZJ() == interfaceC199612138g) {
                                c199610138eLJI2.LLILZ++;
                                InterfaceC199613138h<K, V> interfaceC199613138hLJIILIIL2 = c199610138eLJI2.LJIILIIL(interfaceC199613138h3, next2, key2, hash2, interfaceC199612138g.get(), interfaceC199612138g, AnonymousClass1391.COLLECTED);
                                int i4 = c199610138eLJI2.LLILLJJLI - 1;
                                atomicReferenceArray2.set(length2, interfaceC199613138hLJIILIIL2);
                                c199610138eLJI2.LLILLJJLI = i4;
                                c199610138eLJI2.unlock();
                                if (!c199610138eLJI2.isHeldByCurrentThread()) {
                                }
                            } else {
                                c199610138eLJI2.unlock();
                                if (!c199610138eLJI2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            c199610138eLJI2.unlock();
                            if (!c199610138eLJI2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    c199610138eLJI2.LJIILL();
                    i3++;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c199610138eLJI2.unlock();
                    if (!c199610138eLJI2.isHeldByCurrentThread()) {
                        c199610138eLJI2.LJIILL();
                    }
                    throw th2;
                }
            } while (i3 != 16);
        }
    }

    public final void LJFF() {
        AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = this.LLILZLL;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.LLILLJJLI;
        AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
        this.LLILZIL = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC199613138h<K, V> next = atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC199613138h<K, V> next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC199613138h<K, V> interfaceC199613138h = next;
                    do {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC199613138h = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    } while (next2 != null);
                    atomicReferenceArray2.set(hash, interfaceC199613138h);
                    while (next != interfaceC199613138h) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC199613138h<K, V> interfaceC199613138hLIZ = LIZ(next, atomicReferenceArray2.get(hash3));
                        if (interfaceC199613138hLIZ != null) {
                            atomicReferenceArray2.set(hash3, interfaceC199613138hLIZ);
                        } else {
                            LJIIJJI(next);
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.LLILZLL = atomicReferenceArray2;
        this.LLILLJJLI = i;
    }

    public final void LJIIIZ() {
        if ((this.LLJIJIL.incrementAndGet() & 63) == 0) {
            LJIILJJIL(this.LL.LLJJ.LIZ());
            LJIILL();
        }
    }

    public final void LJIILL() {
        if (isHeldByCurrentThread()) {
            return;
        }
        getClass();
    }

    public final void LJIIZILJ() {
        if (tryLock()) {
            try {
                LIZJ();
                unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                unlock();
                throw th;
            }
        }
    }

    public final void LJ(InterfaceC199613138h<K, V> interfaceC199613138h) {
        if (!this.LL.LIZ()) {
            return;
        }
        LIZIZ();
        if (interfaceC199613138h.LIZJ().LIZ() > this.LLIZ && !LJIIL(interfaceC199613138h, interfaceC199613138h.getHash(), AnonymousClass1391.SIZE)) {
            throw new AssertionError();
        }
        while (this.LLILLL > this.LLIZ) {
            for (InterfaceC199613138h<K, V> interfaceC199613138h2 : this.LLJILJILJ) {
                if (interfaceC199613138h2.LIZJ().LIZ() > 0) {
                    if (!LJIIL(interfaceC199613138h2, interfaceC199613138h2.getHash(), AnonymousClass1391.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public final void LJI(long j) {
        InterfaceC199613138h<K, V> interfaceC199613138hPeek;
        InterfaceC199613138h<K, V> interfaceC199613138hPeek2;
        LIZIZ();
        do {
            interfaceC199613138hPeek = this.LLJILJIL.peek();
            if (interfaceC199613138hPeek == null || !this.LL.LJ(interfaceC199613138hPeek, j)) {
                do {
                    interfaceC199613138hPeek2 = this.LLJILJILJ.peek();
                    if (interfaceC199613138hPeek2 == null || !this.LL.LJ(interfaceC199613138hPeek2, j)) {
                        return;
                    }
                } while (LJIIL(interfaceC199613138hPeek2, interfaceC199613138hPeek2.getHash(), AnonymousClass1391.EXPIRED));
                throw new AssertionError();
            }
        } while (LJIIL(interfaceC199613138hPeek, interfaceC199613138hPeek.getHash(), AnonymousClass1391.EXPIRED));
        throw new AssertionError();
    }

    public final void LJIIJJI(InterfaceC199613138h<K, V> interfaceC199613138h) {
        K key = interfaceC199613138h.getKey();
        interfaceC199613138h.getHash();
        LIZLLL(key, interfaceC199613138h.LIZJ().get(), interfaceC199613138h.LIZJ().LIZ(), AnonymousClass1391.COLLECTED);
        this.LLJILJIL.remove(interfaceC199613138h);
        this.LLJILJILJ.remove(interfaceC199613138h);
    }

    public final void LJIILJJIL(long j) {
        if (tryLock()) {
            try {
                LIZJ();
                LJI(j);
                this.LLJIJIL.set(0);
                unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                unlock();
                throw th;
            }
        }
    }

    public final InterfaceC199613138h<K, V> LIZ(InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2) {
        if (interfaceC199613138h.getKey() == null) {
            return null;
        }
        InterfaceC199612138g<K, V> interfaceC199612138gLIZJ = interfaceC199613138h.LIZJ();
        V v = interfaceC199612138gLIZJ.get();
        if (v == null && interfaceC199612138gLIZJ.isActive()) {
            return null;
        }
        InterfaceC199613138h<K, V> interfaceC199613138hLJFF = this.LL.LLJJI.LJFF(this, interfaceC199613138h, interfaceC199613138h2);
        interfaceC199612138gLIZJ.LIZLLL(this.LLJ, v, interfaceC199613138hLJFF);
        interfaceC199613138hLJFF.LJIILL(interfaceC199612138gLIZJ);
        return interfaceC199613138hLJFF;
    }

    public final Object LJII(int i, Object obj) {
        try {
            if (this.LLILLJJLI != 0) {
                long jLIZ = this.LL.LLJJ.LIZ();
                InterfaceC199613138h<K, V> interfaceC199613138hLJIIIIZZ = LJIIIIZZ(i, jLIZ, obj);
                if (interfaceC199613138hLJIIIIZZ == null) {
                    LJIIIZ();
                    return null;
                }
                V v = interfaceC199613138hLJIIIIZZ.LIZJ().get();
                if (v != null) {
                    if (this.LL.LIZIZ()) {
                        interfaceC199613138hLJIIIIZZ.LJIIIZ(jLIZ);
                    }
                    this.LLJI.add(interfaceC199613138hLJIIIIZZ);
                    LJIIIZ();
                    return v;
                }
                LJIIZILJ();
            }
            LJIIIZ();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIZ();
            throw th;
        }
    }

    public C199610138e(c<K, V> cVar, int i, long j) {
        boolean z;
        ReferenceQueue<K> referenceQueue;
        Queue<InterfaceC199613138h<K, V>> concurrentLinkedQueue;
        Queue<InterfaceC199613138h<K, V>> c199615138j;
        Queue<InterfaceC199613138h<K, V>> c199616138k;
        this.LL = cVar;
        this.LLIZ = j;
        AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.LLILZIL = length;
        if (cVar.LLJI == EnumC20531082n.LL && length == j) {
            this.LLILZIL = length + 1;
        }
        this.LLILZLL = atomicReferenceArray;
        C139J c139j = cVar.LLIZ;
        C139J c139j2 = C139I.LL;
        if (c139j != c139j2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            referenceQueue = new ReferenceQueue<>();
        } else {
            referenceQueue = null;
        }
        this.LLIZLLLIL = referenceQueue;
        this.LLJ = cVar.LLIZLLLIL != c139j2 ? new ReferenceQueue<>() : null;
        if (cVar.LJIIIIZZ()) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        } else {
            concurrentLinkedQueue = c.LLJJJ;
        }
        this.LLJI = concurrentLinkedQueue;
        if (cVar.LIZJ()) {
            c199615138j = new C199615138j<>();
        } else {
            c199615138j = c.LLJJJ;
        }
        this.LLJILJIL = c199615138j;
        if (cVar.LJIIIIZZ()) {
            c199616138k = new C199616138k<>();
        } else {
            c199616138k = c.LLJJJ;
        }
        this.LLJILJILJ = c199616138k;
    }

    public final InterfaceC199613138h LJIIIIZZ(int i, long j, Object obj) {
        for (InterfaceC199613138h<K, V> next = this.LLILZLL.get((r1.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                K key = next.getKey();
                if (key == null) {
                    LJIIZILJ();
                } else if (this.LL.LLILZIL.LIZJ(obj, key)) {
                    if (this.LL.LJ(next, j)) {
                        if (tryLock()) {
                            try {
                                LJI(j);
                                unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                unlock();
                                throw th;
                            }
                        }
                        return null;
                    }
                    return next;
                }
            }
        }
        return null;
    }

    public final boolean LJIIL(InterfaceC199613138h<K, V> interfaceC199613138h, int i, AnonymousClass1391 anonymousClass1391) {
        AtomicReferenceArray<InterfaceC199613138h<K, V>> atomicReferenceArray = this.LLILZLL;
        int length = (atomicReferenceArray.length() - 1) & i;
        InterfaceC199613138h<K, V> interfaceC199613138h2 = atomicReferenceArray.get(length);
        for (InterfaceC199613138h<K, V> next = interfaceC199613138h2; next != null; next = next.getNext()) {
            if (next == interfaceC199613138h) {
                this.LLILZ++;
                InterfaceC199613138h<K, V> interfaceC199613138hLJIILIIL = LJIILIIL(interfaceC199613138h2, next, next.getKey(), i, next.LIZJ().get(), next.LIZJ(), anonymousClass1391);
                int i2 = this.LLILLJJLI - 1;
                atomicReferenceArray.set(length, interfaceC199613138hLJIILIIL);
                this.LLILLJJLI = i2;
                return true;
            }
        }
        return false;
    }

    public final void LJIILLIIL(InterfaceC199613138h interfaceC199613138h, final Object obj, long j) {
        InterfaceC199612138g<K, V> interfaceC199612138gLIZJ = interfaceC199613138h.LIZJ();
        this.LL.LLJI.getClass();
        getClass();
        interfaceC199613138h.LJIILL(new InterfaceC199612138g<K, V>(obj) { // from class: X.138m
            public final V LIZ;

            @Override // X.InterfaceC199612138g
            public int LIZ() {
                return 1;
            }

            @Override // X.InterfaceC199612138g
            public final InterfaceC199613138h<K, V> LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC199612138g
            public final void LIZJ() {
            }

            @Override // X.InterfaceC199612138g
            public final InterfaceC199612138g<K, V> LIZLLL(ReferenceQueue<V> referenceQueue, V v, InterfaceC199613138h<K, V> interfaceC199613138h2) {
                return this;
            }

            @Override // X.InterfaceC199612138g
            public final boolean isActive() {
                return true;
            }

            @Override // X.InterfaceC199612138g
            public final void isLoading() {
            }

            @Override // X.InterfaceC199612138g
            public final V get() {
                return this.LIZ;
            }

            {
                this.LIZ = obj;
            }
        });
        LIZIZ();
        this.LLILLL += (long) 1;
        if (this.LL.LIZIZ()) {
            interfaceC199613138h.LJIIIZ(j);
        }
        if (this.LL.LJFF()) {
            interfaceC199613138h.LJIIJJI(j);
        }
        this.LLJILJILJ.add(interfaceC199613138h);
        this.LLJILJIL.add(interfaceC199613138h);
        interfaceC199612138gLIZJ.LIZJ();
    }

    public final void LIZLLL(Object obj, Object obj2, int i, AnonymousClass1391 anonymousClass1391) {
        this.LLILLL -= (long) i;
        if (this.LL.LLJILLL != c.LLJJJ) {
            AnonymousClass1381.create(obj, obj2, anonymousClass1391);
            getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        unlock();
        LJIILL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r10, java.lang.Object r11, java.lang.Object r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199610138e.LJIIJ(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public final InterfaceC199613138h<K, V> LJIILIIL(InterfaceC199613138h<K, V> interfaceC199613138h, InterfaceC199613138h<K, V> interfaceC199613138h2, K k, int i, V v, InterfaceC199612138g<K, V> interfaceC199612138g, AnonymousClass1391 anonymousClass1391) {
        LIZLLL(k, v, interfaceC199612138g.LIZ(), anonymousClass1391);
        this.LLJILJIL.remove(interfaceC199613138h2);
        this.LLJILJILJ.remove(interfaceC199613138h2);
        interfaceC199612138g.isLoading();
        int i2 = this.LLILLJJLI;
        InterfaceC199613138h<K, V> next = interfaceC199613138h2.getNext();
        while (interfaceC199613138h != interfaceC199613138h2) {
            InterfaceC199613138h<K, V> interfaceC199613138hLIZ = LIZ(interfaceC199613138h, next);
            if (interfaceC199613138hLIZ != null) {
                next = interfaceC199613138hLIZ;
            } else {
                LJIIJJI(interfaceC199613138h);
                i2--;
            }
            interfaceC199613138h = interfaceC199613138h.getNext();
        }
        this.LLILLJJLI = i2;
        return next;
    }
}
