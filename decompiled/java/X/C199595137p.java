package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.137p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199595137p<K, V> extends ReentrantLock {
    public final ConcurrentMapC199594137o<K, V> LL;
    public volatile int LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public volatile AtomicReferenceArray<InterfaceC199564136k<K, V>> LLILZLL;
    public final long LLIZ;
    public final ReferenceQueue<K> LLIZLLLIL;
    public final ReferenceQueue<V> LLJ;
    public final Queue<InterfaceC199564136k<K, V>> LLJI;
    public final AtomicInteger LLJIJIL = new AtomicInteger();
    public final Queue<InterfaceC199564136k<K, V>> LLJILJIL;
    public final Queue<InterfaceC199564136k<K, V>> LLJILJILJ;
    public final AnonymousClass1386 LLJILLL;

    public final void LIZIZ() {
        while (true) {
            InterfaceC199564136k<K, V> interfaceC199564136kPoll = this.LLJI.poll();
            if (interfaceC199564136kPoll == null) {
                return;
            }
            if (this.LLJILJILJ.contains(interfaceC199564136kPoll)) {
                this.LLJILJILJ.add(interfaceC199564136kPoll);
            }
        }
    }

    public final void LIZJ() {
        if (this.LL.LLIZ != C137F.LL) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.LLIZLLLIL.poll();
                if (referencePoll == null) {
                    break;
                }
                InterfaceC199564136k<K, V> interfaceC199564136k = (InterfaceC199564136k) referencePoll;
                ConcurrentMapC199594137o<K, V> concurrentMapC199594137o = this.LL;
                concurrentMapC199594137o.getClass();
                int hash = interfaceC199564136k.getHash();
                C199595137p<K, V> c199595137pLJI = concurrentMapC199594137o.LJI(hash);
                c199595137pLJI.lock();
                try {
                    AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = c199595137pLJI.LLILZLL;
                    int length = (atomicReferenceArray.length() - 1) & hash;
                    InterfaceC199564136k<K, V> interfaceC199564136k2 = atomicReferenceArray.get(length);
                    InterfaceC199564136k<K, V> next = interfaceC199564136k2;
                    while (true) {
                        if (next == null) {
                            break;
                        }
                        if (next == interfaceC199564136k) {
                            c199595137pLJI.LLILZ++;
                            InterfaceC199564136k<K, V> interfaceC199564136kLJIJI = c199595137pLJI.LJIJI(interfaceC199564136k2, next, next.getKey(), hash, next.LIZJ().get(), next.LIZJ(), EnumC199605137z.COLLECTED);
                            int i2 = c199595137pLJI.LLILLJJLI - 1;
                            atomicReferenceArray.set(length, interfaceC199564136kLJIJI);
                            c199595137pLJI.LLILLJJLI = i2;
                            break;
                        }
                        next = next.getNext();
                    }
                    c199595137pLJI.unlock();
                    c199595137pLJI.LJIJJLI();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c199595137pLJI.unlock();
                    c199595137pLJI.LJIJJLI();
                    throw th;
                }
            } while (i != 16);
        }
        if (this.LL.LLIZLLLIL != C137F.LL) {
            int i3 = 0;
            do {
                Reference<? extends V> referencePoll2 = this.LLJ.poll();
                if (referencePoll2 == null) {
                    return;
                }
                C135A<K, V> c135a = (C135A) referencePoll2;
                ConcurrentMapC199594137o<K, V> concurrentMapC199594137o2 = this.LL;
                concurrentMapC199594137o2.getClass();
                InterfaceC199564136k<K, V> interfaceC199564136kLIZIZ = c135a.LIZIZ();
                int hash2 = interfaceC199564136kLIZIZ.getHash();
                C199595137p<K, V> c199595137pLJI2 = concurrentMapC199594137o2.LJI(hash2);
                K key = interfaceC199564136kLIZIZ.getKey();
                c199595137pLJI2.lock();
                try {
                    AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray2 = c199595137pLJI2.LLILZLL;
                    int length2 = (atomicReferenceArray2.length() - 1) & hash2;
                    InterfaceC199564136k<K, V> interfaceC199564136k3 = atomicReferenceArray2.get(length2);
                    InterfaceC199564136k<K, V> next2 = interfaceC199564136k3;
                    while (true) {
                        if (next2 != null) {
                            K key2 = next2.getKey();
                            if (next2.getHash() != hash2 || key2 == null || !c199595137pLJI2.LL.LLILZIL.LIZJ(key, key2)) {
                                next2 = next2.getNext();
                            } else if (next2.LIZJ() == c135a) {
                                c199595137pLJI2.LLILZ++;
                                InterfaceC199564136k<K, V> interfaceC199564136kLJIJI2 = c199595137pLJI2.LJIJI(interfaceC199564136k3, next2, key2, hash2, c135a.get(), c135a, EnumC199605137z.COLLECTED);
                                int i4 = c199595137pLJI2.LLILLJJLI - 1;
                                atomicReferenceArray2.set(length2, interfaceC199564136kLJIJI2);
                                c199595137pLJI2.LLILLJJLI = i4;
                                c199595137pLJI2.unlock();
                                if (!c199595137pLJI2.isHeldByCurrentThread()) {
                                }
                            } else {
                                c199595137pLJI2.unlock();
                                if (!c199595137pLJI2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            c199595137pLJI2.unlock();
                            if (!c199595137pLJI2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    c199595137pLJI2.LJIJJLI();
                    i3++;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c199595137pLJI2.unlock();
                    if (!c199595137pLJI2.isHeldByCurrentThread()) {
                        c199595137pLJI2.LJIJJLI();
                    }
                    throw th2;
                }
            } while (i3 != 16);
        }
    }

    public final void LJFF() {
        AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = this.LLILZLL;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.LLILLJJLI;
        AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
        this.LLILZIL = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC199564136k<K, V> next = atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC199564136k<K, V> next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC199564136k<K, V> interfaceC199564136k = next;
                    do {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC199564136k = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    } while (next2 != null);
                    atomicReferenceArray2.set(hash, interfaceC199564136k);
                    while (next != interfaceC199564136k) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC199564136k<K, V> interfaceC199564136kLIZ = LIZ(next, atomicReferenceArray2.get(hash3));
                        if (interfaceC199564136kLIZ != null) {
                            atomicReferenceArray2.set(hash3, interfaceC199564136kLIZ);
                        } else {
                            LJIILLIIL(next);
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

    public final void LJIIL() {
        if ((this.LLJIJIL.incrementAndGet() & 63) == 0) {
            LJIJJ(this.LL.LLJJI.LIZ());
            LJIJJLI();
        }
    }

    public final void LJIJJLI() {
        if (isHeldByCurrentThread()) {
            return;
        }
        ConcurrentMapC199594137o<K, V> concurrentMapC199594137o = this.LL;
        while (true) {
            C199603137x<K, V> c199603137xPoll = concurrentMapC199594137o.LLJILLL.poll();
            if (c199603137xPoll == null) {
                return;
            }
            try {
                concurrentMapC199594137o.LLJJ.LIZJ(c199603137xPoll);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ConcurrentMapC199594137o.LLJJJJ.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public final void LJJIFFI() {
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

    public final void LJ(InterfaceC199564136k<K, V> interfaceC199564136k) {
        if (!this.LL.LIZ()) {
            return;
        }
        LIZIZ();
        if (interfaceC199564136k.LIZJ().LIZ() > this.LLIZ && !LJIIZILJ(interfaceC199564136k, interfaceC199564136k.getHash(), EnumC199605137z.SIZE)) {
            throw new AssertionError();
        }
        while (this.LLILLL > this.LLIZ) {
            for (InterfaceC199564136k<K, V> interfaceC199564136k2 : this.LLJILJILJ) {
                if (interfaceC199564136k2.LIZJ().LIZ() > 0) {
                    if (!LJIIZILJ(interfaceC199564136k2, interfaceC199564136k2.getHash(), EnumC199605137z.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public final void LJI(long j) {
        InterfaceC199564136k<K, V> interfaceC199564136kPeek;
        InterfaceC199564136k<K, V> interfaceC199564136kPeek2;
        LIZIZ();
        do {
            interfaceC199564136kPeek = this.LLJILJIL.peek();
            if (interfaceC199564136kPeek == null || !this.LL.LJ(interfaceC199564136kPeek, j)) {
                do {
                    interfaceC199564136kPeek2 = this.LLJILJILJ.peek();
                    if (interfaceC199564136kPeek2 == null || !this.LL.LJ(interfaceC199564136kPeek2, j)) {
                        return;
                    }
                } while (LJIIZILJ(interfaceC199564136kPeek2, interfaceC199564136kPeek2.getHash(), EnumC199605137z.EXPIRED));
                throw new AssertionError();
            }
        } while (LJIIZILJ(interfaceC199564136kPeek, interfaceC199564136kPeek.getHash(), EnumC199605137z.EXPIRED));
        throw new AssertionError();
    }

    public final void LJIILLIIL(InterfaceC199564136k<K, V> interfaceC199564136k) {
        K key = interfaceC199564136k.getKey();
        interfaceC199564136k.getHash();
        LIZLLL(key, interfaceC199564136k.LIZJ().get(), interfaceC199564136k.LIZJ().LIZ(), EnumC199605137z.COLLECTED);
        this.LLJILJIL.remove(interfaceC199564136k);
        this.LLJILJILJ.remove(interfaceC199564136k);
    }

    public final void LJIJJ(long j) {
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

    public final InterfaceC199564136k<K, V> LIZ(InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
        if (interfaceC199564136k.getKey() == null) {
            return null;
        }
        C135A<K, V> c135aLIZJ = interfaceC199564136k.LIZJ();
        V v = c135aLIZJ.get();
        if (v == null && c135aLIZJ.isActive()) {
            return null;
        }
        InterfaceC199564136k<K, V> interfaceC199564136kLJFF = this.LL.LLJJIII.LJFF(this, interfaceC199564136k, interfaceC199564136k2);
        interfaceC199564136kLJFF.LJIILL(c135aLIZJ.LJ(this.LLJ, v, interfaceC199564136kLJFF));
        return interfaceC199564136kLJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #1 {all -> 0x005d, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0015, B:8:0x001d, B:11:0x0026, B:13:0x002b, B:14:0x0031, B:19:0x0039, B:21:0x0043, B:24:0x0056, B:10:0x0023), top: B:33:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            r2 = r10
            int r0 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> L5d
            r1 = 0
            if (r0 == 0) goto L59
            X.137o<K, V> r0 = r2.LL     // Catch: java.lang.Throwable -> L5d
            X.138F r0 = r0.LLJJI     // Catch: java.lang.Throwable -> L5d
            long r7 = r0.LIZ()     // Catch: java.lang.Throwable -> L5d
            r5 = r11
            X.136k r3 = r2.LJIIIZ(r5, r12)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L32
            X.137o<K, V> r0 = r2.LL     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.LJ(r3, r7)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L33
            boolean r0 = r2.tryLock()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L32
            r2.LJI(r7)     // Catch: java.lang.Throwable -> L2a
            r2.unlock()     // Catch: java.lang.Throwable -> L5d
            goto L32
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            r2.unlock()     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L32:
            r3 = r1
        L33:
            if (r3 != 0) goto L39
            r2.LJIIL()
            return r1
        L39:
            X.135A r0 = r3.LIZJ()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r0.get()     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L56
            r2.LJIILL(r3, r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L5d
            X.137o<K, V> r0 = r2.LL     // Catch: java.lang.Throwable -> L5d
            X.135O<? super K, V> r9 = r0.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r2.LJIL(r3, r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L5d
            r2.LJIIL()
            return r0
        L56:
            r2.LJJIFFI()     // Catch: java.lang.Throwable -> L5d
        L59:
            r2.LJIIL()
            return r1
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            r2.LJIIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199595137p.LJII(int, java.lang.Object):java.lang.Object");
    }

    public final InterfaceC199564136k LJIIIZ(int i, Object obj) {
        for (InterfaceC199564136k<K, V> next = this.LLILZLL.get((r1.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                K key = next.getKey();
                if (key == null) {
                    LJJIFFI();
                } else if (this.LL.LLILZIL.LIZJ(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final V LJIIJ(InterfaceC199564136k<K, V> interfaceC199564136k, long j) {
        if (interfaceC199564136k.getKey() == null) {
            LJJIFFI();
            return null;
        }
        V v = interfaceC199564136k.LIZJ().get();
        if (v == null) {
            LJJIFFI();
            return null;
        }
        if (this.LL.LJ(interfaceC199564136k, j)) {
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
        return v;
    }

    public final void LJIILJJIL(InterfaceC199564136k<K, V> interfaceC199564136k, long j) {
        if (this.LL.LIZIZ()) {
            interfaceC199564136k.LJIIIZ(j);
        }
        this.LLJILJILJ.add(interfaceC199564136k);
    }

    public final void LJIILL(InterfaceC199564136k<K, V> interfaceC199564136k, long j) {
        if (this.LL.LIZIZ()) {
            interfaceC199564136k.LJIIIZ(j);
        }
        this.LLJI.add(interfaceC199564136k);
    }

    public final InterfaceC199564136k<K, V> LJIJ(InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2) {
        int i = this.LLILLJJLI;
        InterfaceC199564136k<K, V> next = interfaceC199564136k2.getNext();
        while (interfaceC199564136k != interfaceC199564136k2) {
            InterfaceC199564136k<K, V> interfaceC199564136kLIZ = LIZ(interfaceC199564136k, next);
            if (interfaceC199564136kLIZ != null) {
                next = interfaceC199564136kLIZ;
            } else {
                LJIILLIIL(interfaceC199564136k);
                i--;
            }
            interfaceC199564136k = interfaceC199564136k.getNext();
        }
        this.LLILLJJLI = i;
        return next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r12 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r4 = new X.AnonymousClass1354<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r0 = r13.LL.LLJJIII;
        r14.getClass();
        r5 = r0.LJII(r15, r13, r6, r14);
        r5.LJIILL(r4);
        r8.set(r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        r5.LJIILL(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        unlock();
        LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r12 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        r1 = LJIIIIZZ(r14, r15, r4, r4.LJFF(r14, r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        r13.LLJILLL.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        r13.LLJILLL.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        return LJJII(r5, r14, r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final java.lang.Object LJIIJJI(java.lang.Object r14, int r15, X.C135N r16) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199595137p.LJIIJJI(java.lang.Object, int, X.135N):java.lang.Object");
    }

    public final boolean LJIIZILJ(InterfaceC199564136k<K, V> interfaceC199564136k, int i, EnumC199605137z enumC199605137z) {
        AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = this.LLILZLL;
        int length = (atomicReferenceArray.length() - 1) & i;
        InterfaceC199564136k<K, V> interfaceC199564136k2 = atomicReferenceArray.get(length);
        for (InterfaceC199564136k<K, V> next = interfaceC199564136k2; next != null; next = next.getNext()) {
            if (next == interfaceC199564136k) {
                this.LLILZ++;
                InterfaceC199564136k<K, V> interfaceC199564136kLJIJI = LJIJI(interfaceC199564136k2, next, next.getKey(), i, next.LIZJ().get(), next.LIZJ(), enumC199605137z);
                int i2 = this.LLILLJJLI - 1;
                atomicReferenceArray.set(length, interfaceC199564136kLJIJI);
                this.LLILLJJLI = i2;
                return true;
            }
        }
        return false;
    }

    public final V LJJII(InterfaceC199564136k<K, V> interfaceC199564136k, K k, C135A<K, V> c135a) {
        if (c135a.isLoading()) {
            C19864312np.LJIIL(k, "Recursive load of: %s", !Thread.holdsLock(interfaceC199564136k));
            try {
                V vLIZLLL = c135a.LIZLLL();
                if (vLIZLLL != null) {
                    LJIILL(interfaceC199564136k, this.LL.LLJJI.LIZ());
                    this.LLJILLL.LIZLLL();
                    return vLIZLLL;
                }
                String strValueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(strValueOf);
                sb.append(e3.d);
                throw new C135P(sb.toString());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJILLL.LIZLLL();
                throw th;
            }
        }
        throw new AssertionError();
    }

    public C199595137p(ConcurrentMapC199594137o<K, V> concurrentMapC199594137o, int i, long j, AnonymousClass1386 anonymousClass1386) {
        boolean z;
        ReferenceQueue<K> referenceQueue;
        Queue<InterfaceC199564136k<K, V>> concurrentLinkedQueue;
        Queue<InterfaceC199564136k<K, V>> c199562136i;
        Queue<InterfaceC199564136k<K, V>> c199559136f;
        this.LL = concurrentMapC199594137o;
        this.LLIZ = j;
        anonymousClass1386.getClass();
        this.LLJILLL = anonymousClass1386;
        AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.LLILZIL = length;
        if (concurrentMapC199594137o.LLJI == EnumC199604137y.LL && length == j) {
            this.LLILZIL = length + 1;
        }
        this.LLILZLL = atomicReferenceArray;
        C137F c137f = concurrentMapC199594137o.LLIZ;
        C137D c137d = C137F.LL;
        if (c137f != c137d) {
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
        this.LLJ = concurrentMapC199594137o.LLIZLLLIL != c137d ? new ReferenceQueue<>() : null;
        if (concurrentMapC199594137o.LJIIIIZZ()) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        } else {
            concurrentLinkedQueue = ConcurrentMapC199594137o.LLJJJJLIIL;
        }
        this.LLJI = concurrentLinkedQueue;
        if (concurrentMapC199594137o.LIZJ()) {
            c199562136i = new C199562136i<>();
        } else {
            c199562136i = ConcurrentMapC199594137o.LLJJJJLIIL;
        }
        this.LLJILJIL = c199562136i;
        if (concurrentMapC199594137o.LJIIIIZZ()) {
            c199559136f = new C199559136f<>();
        } else {
            c199559136f = ConcurrentMapC199594137o.LLJJJJLIIL;
        }
        this.LLJILJILJ = c199559136f;
    }

    public final void LIZLLL(Object obj, Object obj2, int i, EnumC199605137z enumC199605137z) {
        this.LLILLL -= (long) i;
        if (enumC199605137z.LIZJ()) {
            this.LLJILLL.LIZ();
        }
        if (this.LL.LLJILLL != ConcurrentMapC199594137o.LLJJJJLIIL) {
            this.LL.LLJILLL.offer(C199603137x.create(obj, obj2, enumC199605137z));
        }
    }

    public final V LJIIIIZZ(K k, int i, AnonymousClass1354<K, V> anonymousClass1354, ListenableFuture<V> listenableFuture) throws Throwable {
        V v;
        try {
            v = (V) C23184096o.LIZ(listenableFuture);
            try {
                if (v != null) {
                    this.LLJILLL.LIZJ(anonymousClass1354.LLILLL.LIZIZ(TimeUnit.NANOSECONDS));
                    LJJI(k, i, anonymousClass1354, v);
                    return v;
                }
                String strValueOf = String.valueOf(k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
                sb.append("CacheLoader returned null for key ");
                sb.append(strValueOf);
                sb.append(e3.d);
                throw new C135P(sb.toString());
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (v == null) {
                    this.LLJILLL.LJ(anonymousClass1354.LLILLL.LIZIZ(TimeUnit.NANOSECONDS));
                    lock();
                    try {
                        AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = this.LLILZLL;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC199564136k<K, V> interfaceC199564136k = atomicReferenceArray.get(length);
                        InterfaceC199564136k<K, V> next = interfaceC199564136k;
                        while (true) {
                            if (next == null) {
                                break;
                            }
                            K key = next.getKey();
                            if (next.getHash() == i && key != null && this.LL.LLILZIL.LIZJ(k, key)) {
                                if (next.LIZJ() == anonymousClass1354) {
                                    if (anonymousClass1354.isActive()) {
                                        next.LJIILL(anonymousClass1354.LL);
                                    } else {
                                        atomicReferenceArray.set(length, LJIJ(interfaceC199564136k, next));
                                    }
                                }
                            } else {
                                next = next.getNext();
                            }
                        }
                        unlock();
                        LJIJJLI();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        unlock();
                        LJIJJLI();
                        throw th3;
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            v = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        unlock();
        LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final java.lang.Object LJIILIIL(int r12, java.lang.Object r13, java.lang.Object r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199595137p.LJIILIIL(int, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public final void LJJ(InterfaceC199564136k<K, V> interfaceC199564136k, K k, V v, long j) {
        C135A<K, V> c135aLIZJ = interfaceC199564136k.LIZJ();
        this.LL.LLJI.LIZJ();
        interfaceC199564136k.LJIILL(this.LL.LLIZLLLIL.LJFF(1, this, interfaceC199564136k, v));
        LIZIZ();
        this.LLILLL += (long) 1;
        if (this.LL.LIZIZ()) {
            interfaceC199564136k.LJIIIZ(j);
        }
        if (this.LL.LJFF()) {
            interfaceC199564136k.LJIIJJI(j);
        }
        this.LLJILJILJ.add(interfaceC199564136k);
        this.LLJILJIL.add(interfaceC199564136k);
        c135aLIZJ.LIZJ(v);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void LJJI(Object obj, int i, AnonymousClass1354 anonymousClass1354, Object obj2) {
        EnumC199605137z enumC199605137z;
        lock();
        try {
            long jLIZ = this.LL.LLJJI.LIZ();
            LJIJJ(jLIZ);
            int i2 = this.LLILLJJLI + 1;
            if (i2 > this.LLILZIL) {
                LJFF();
                i2 = this.LLILLJJLI + 1;
            }
            AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = this.LLILZLL;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC199564136k interfaceC199564136k = atomicReferenceArray.get(length);
            InterfaceC199564136k next = interfaceC199564136k;
            while (true) {
                if (next != null) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.LL.LLILZIL.LIZJ(obj, key)) {
                        C135A<K, V> c135aLIZJ = next.LIZJ();
                        V v = c135aLIZJ.get();
                        if (anonymousClass1354 == c135aLIZJ || (v == null && c135aLIZJ != ConcurrentMapC199594137o.LLJJJJJIL)) {
                            this.LLILZ++;
                            if (anonymousClass1354.isActive()) {
                                if (v == null) {
                                    enumC199605137z = EnumC199605137z.COLLECTED;
                                } else {
                                    enumC199605137z = EnumC199605137z.REPLACED;
                                }
                                LIZLLL(obj, v, anonymousClass1354.LIZ(), enumC199605137z);
                                i2--;
                            }
                            LJJ(next, obj, obj2, jLIZ);
                            this.LLILLJJLI = i2;
                            LJ(next);
                        } else {
                            LIZLLL(obj, obj2, 0, EnumC199605137z.REPLACED);
                        }
                    } else {
                        next = next.getNext();
                    }
                } else {
                    this.LLILZ++;
                    EnumC199565136l enumC199565136l = this.LL.LLJJIII;
                    obj.getClass();
                    InterfaceC199564136k interfaceC199564136kLJII = enumC199565136l.LJII(i, this, interfaceC199564136k, obj);
                    LJJ(interfaceC199564136kLJII, obj, obj2, jLIZ);
                    atomicReferenceArray.set(length, interfaceC199564136kLJII);
                    this.LLILLJJLI = i2;
                    LJ(interfaceC199564136kLJII);
                    break;
                }
            }
            unlock();
            LJIJJLI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            unlock();
            LJIJJLI();
            throw th;
        }
    }

    public final V LJIL(InterfaceC199564136k<K, V> interfaceC199564136k, final K k, final int i, V v, long j, C135O<? super K, V> c135o) {
        boolean z;
        V v2;
        final AnonymousClass1354 anonymousClass1354;
        if (this.LL.LLJILJILJ > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && j - interfaceC199564136k.LJII() > this.LL.LLJILJILJ && !interfaceC199564136k.LIZJ().isLoading()) {
            lock();
            try {
                long jLIZ = this.LL.LLJJI.LIZ();
                LJIJJ(jLIZ);
                AtomicReferenceArray<InterfaceC199564136k<K, V>> atomicReferenceArray = this.LLILZLL;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC199564136k<K, V> interfaceC199564136k2 = atomicReferenceArray.get(length);
                InterfaceC199564136k next = interfaceC199564136k2;
                while (true) {
                    v2 = null;
                    if (next != null) {
                        Object key = next.getKey();
                        if (next.getHash() == i && key != null && this.LL.LLILZIL.LIZJ(k, key)) {
                            C135A<K, V> c135aLIZJ = next.LIZJ();
                            if (!c135aLIZJ.isLoading() && jLIZ - next.LJII() >= this.LL.LLJILJILJ) {
                                this.LLILZ++;
                                anonymousClass1354 = new AnonymousClass1354(c135aLIZJ);
                                next.LJIILL(anonymousClass1354);
                            } else {
                                unlock();
                                LJIJJLI();
                                anonymousClass1354 = null;
                            }
                        } else {
                            next = next.getNext();
                        }
                    } else {
                        this.LLILZ++;
                        anonymousClass1354 = new AnonymousClass1354();
                        EnumC199565136l enumC199565136l = this.LL.LLJJIII;
                        k.getClass();
                        InterfaceC199564136k interfaceC199564136kLJII = enumC199565136l.LJII(i, this, interfaceC199564136k2, k);
                        interfaceC199564136kLJII.LJIILL(anonymousClass1354);
                        atomicReferenceArray.set(length, (InterfaceC199564136k<K, V>) interfaceC199564136kLJII);
                        break;
                    }
                }
                unlock();
                LJIJJLI();
                if (anonymousClass1354 != null) {
                    final ListenableFuture<V> listenableFutureLJFF = anonymousClass1354.LJFF(k, c135o);
                    listenableFutureLJFF.LJIIJJI(new Runnable() { // from class: X.1356
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LocalCache$Segment@89de.loadAsync$1");
                            try {
                                this.LLILZIL.LJIIIIZZ(k, i, anonymousClass1354, listenableFutureLJFF);
                            } finally {
                                try {
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                            }
                            C1C7U.LIZIZ("LocalCache$Segment@89de.loadAsync$1");
                        }
                    }, EnumC2272608vM.LL);
                    if (listenableFutureLJFF.isDone()) {
                        try {
                            v2 = (V) C23184096o.LIZ(listenableFutureLJFF);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                if (v2 != null) {
                    return v2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                unlock();
                LJIJJLI();
                throw th2;
            }
        }
        return v;
    }

    public final InterfaceC199564136k<K, V> LJIJI(InterfaceC199564136k<K, V> interfaceC199564136k, InterfaceC199564136k<K, V> interfaceC199564136k2, K k, int i, V v, C135A<K, V> c135a, EnumC199605137z enumC199605137z) {
        LIZLLL(k, v, c135a.LIZ(), enumC199605137z);
        this.LLJILJIL.remove(interfaceC199564136k2);
        this.LLJILJILJ.remove(interfaceC199564136k2);
        if (c135a.isLoading()) {
            c135a.LIZJ(null);
            return interfaceC199564136k;
        }
        return LJIJ(interfaceC199564136k, interfaceC199564136k2);
    }
}
