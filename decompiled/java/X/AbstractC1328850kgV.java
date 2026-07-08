package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0kgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1328850kgV<K, T extends Closeable> implements InterfaceC1327390ke9<T> {
    public final Map<K, AbstractC1328850kgV<K, T>.a> LIZ = new HashMap();
    public final InterfaceC1327390ke9<T> LIZIZ;

    /* JADX INFO: renamed from: X.0kgV$a */
    public class a {
        public final K LIZ;
        public final CopyOnWriteArraySet<Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1>> LIZIZ = new CopyOnWriteArraySet<>();
        public T LIZJ;
        public float LIZLLL;
        public int LJ;
        public C1328860kgW LJFF;
        public AbstractC1328850kgV<K, T>.a.C0000a LJI;

        public final synchronized boolean LIZJ() {
            Iterator<Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1>> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1327930kf1) it2.next().second).LIZLLL()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean LIZLLL() {
            Iterator<Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1>> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (!((InterfaceC1327930kf1) it2.next().second).LJI()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized EnumC1331380kka LJ() {
            EnumC1331380kka higherPriority;
            higherPriority = EnumC1331380kka.LOW;
            Iterator<Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1>> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                higherPriority = EnumC1331380kka.getHigherPriority(higherPriority, ((InterfaceC1327930kf1) it2.next().second).getPriority());
            }
            return higherPriority;
        }

        public final void LJIIIIZZ() {
            synchronized (this) {
                try {
                    C1322350kW1.LIZIZ(this.LJFF == null);
                    C1322350kW1.LIZIZ(this.LJI == null);
                    if (this.LIZIZ.isEmpty()) {
                        AbstractC1328850kgV.this.LJIIIIZZ(this.LIZ, this);
                        return;
                    }
                    InterfaceC1327930kf1 interfaceC1327930kf1 = (InterfaceC1327930kf1) this.LIZIZ.iterator().next().second;
                    C1328860kgW c1328860kgW = new C1328860kgW(interfaceC1327930kf1.LJFF(), interfaceC1327930kf1.getId(), interfaceC1327930kf1.LIZ(), interfaceC1327930kf1.LIZJ(), interfaceC1327930kf1.LIZIZ(), LIZLLL(), LIZJ(), LJ());
                    this.LJFF = c1328860kgW;
                    AbstractC1328850kgV<K, T>.a.C0000a c0000a = new C0000a();
                    this.LJI = c0000a;
                    AbstractC1328850kgV.this.LIZIZ.LIZIZ(c0000a, c1328860kgW);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public final synchronized List<InterfaceC1330340kiu> LJIIIZ() {
            C1328860kgW c1328860kgW = this.LJFF;
            if (c1328860kgW == null) {
                return null;
            }
            return c1328860kgW.LJIIJJI(LIZJ());
        }

        public final synchronized List<InterfaceC1330340kiu> LJIIJ() {
            C1328860kgW c1328860kgW = this.LJFF;
            if (c1328860kgW == null) {
                return null;
            }
            return c1328860kgW.LJIIL(LIZLLL());
        }

        public final synchronized List<InterfaceC1330340kiu> LJIIJJI() {
            C1328860kgW c1328860kgW = this.LJFF;
            if (c1328860kgW == null) {
                return null;
            }
            return c1328860kgW.LJIILIIL(LJ());
        }

        /* JADX INFO: renamed from: X.0kgV$a$a, reason: collision with other inner class name */
        public class C0000a extends AbstractC1327820keq<T> {
            @Override // X.AbstractC1327820keq
            public final void LJFF() {
                try {
                    C1336010ks3.LIZIZ();
                    a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.LJI == this) {
                                aVar.LJI = null;
                                aVar.LJFF = null;
                                a.LIZIZ(aVar.LIZJ);
                                aVar.LIZJ = null;
                                aVar.LJIIIIZZ();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    C1336010ks3.LIZIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1336010ks3.LIZIZ();
                    throw th2;
                }
            }

            public C0000a() {
            }

            @Override // X.AbstractC1327820keq
            public final void LJI(Throwable th) {
                try {
                    C1336010ks3.LIZIZ();
                    a.this.LJFF(this, th);
                    C1336010ks3.LIZIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1336010ks3.LIZIZ();
                    throw th2;
                }
            }

            @Override // X.AbstractC1327820keq
            public final void LJIIIIZZ(float f) {
                try {
                    C1336010ks3.LIZIZ();
                    a.this.LJII(this, f);
                    C1336010ks3.LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1336010ks3.LIZIZ();
                    throw th;
                }
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
            @Override // X.AbstractC1327820keq
            public final void LJII(int i, Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    C1336010ks3.LIZIZ();
                    a.this.LJI(this, closeable, i);
                    C1336010ks3.LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1336010ks3.LIZIZ();
                    throw th;
                }
            }
        }

        public static void LIZIZ(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
        }

        public a(K k) {
            this.LIZ = k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean LIZ(InterfaceC1328020kfA<T> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
            final Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1> pairCreate = Pair.create(interfaceC1328020kfA, interfaceC1327930kf1);
            synchronized (this) {
                try {
                    if (AbstractC1328850kgV.this.LJFF(this.LIZ) != this) {
                        return false;
                    }
                    this.LIZIZ.add(pairCreate);
                    List<InterfaceC1330340kiu> listLJIIJ = LJIIJ();
                    List<InterfaceC1330340kiu> listLJIIJJI = LJIIJJI();
                    List<InterfaceC1330340kiu> listLJIIIZ = LJIIIZ();
                    Closeable closeableLIZJ = this.LIZJ;
                    float f = this.LIZLLL;
                    int i = this.LJ;
                    C1328860kgW.LJIIIIZZ(listLJIIJ);
                    C1328860kgW.LJIIIZ(listLJIIJJI);
                    C1328860kgW.LJII(listLJIIIZ);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableLIZJ != this.LIZJ) {
                                    closeableLIZJ = null;
                                } else if (closeableLIZJ != null) {
                                    closeableLIZJ = AbstractC1328850kgV.this.LIZJ(closeableLIZJ);
                                }
                            }
                            if (closeableLIZJ != null) {
                                if (f > 0.0f) {
                                    interfaceC1328020kfA.LIZ(f);
                                }
                                interfaceC1328020kfA.LIZJ(i, closeableLIZJ);
                                LIZIZ(closeableLIZJ);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kgX
                        @Override // X.C1330860kjk, X.InterfaceC1330340kiu
                        public final void LIZ() {
                            C1328860kgW.LJII(this.LIZIZ.LJIIIZ());
                        }

                        @Override // X.C1330860kjk, X.InterfaceC1330340kiu
                        public final void LIZIZ() {
                            C1328860kgW.LJIIIZ(this.LIZIZ.LJIIJJI());
                        }

                        @Override // X.InterfaceC1330340kiu
                        public final void LIZJ() {
                            boolean zRemove;
                            List<InterfaceC1330340kiu> list;
                            C1328860kgW c1328860kgW;
                            List<InterfaceC1330340kiu> listLJIIJJI2;
                            List<InterfaceC1330340kiu> listLJIIIZ2;
                            synchronized (this.LIZIZ) {
                                try {
                                    zRemove = this.LIZIZ.LIZIZ.remove(pairCreate);
                                    list = null;
                                    if (!zRemove) {
                                        c1328860kgW = null;
                                    } else if (this.LIZIZ.LIZIZ.isEmpty()) {
                                        c1328860kgW = this.LIZIZ.LJFF;
                                    } else {
                                        List<InterfaceC1330340kiu> listLJIIJ2 = this.LIZIZ.LJIIJ();
                                        listLJIIJJI2 = this.LIZIZ.LJIIJJI();
                                        listLJIIIZ2 = this.LIZIZ.LJIIIZ();
                                        c1328860kgW = null;
                                        list = listLJIIJ2;
                                    }
                                    listLJIIJJI2 = null;
                                    listLJIIIZ2 = null;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                            C1328860kgW.LJIIIIZZ(list);
                            C1328860kgW.LJIIIZ(listLJIIJJI2);
                            C1328860kgW.LJII(listLJIIIZ2);
                            if (c1328860kgW != null) {
                                c1328860kgW.LJIIJ();
                            }
                            if (zRemove) {
                                ((InterfaceC1328020kfA) pairCreate.first).LIZIZ();
                            }
                        }

                        @Override // X.C1330860kjk, X.InterfaceC1330340kiu
                        public final void LIZLLL() {
                            C1328860kgW.LJIIIIZZ(this.LIZIZ.LJIIJ());
                        }
                    });
                    return true;
                } finally {
                }
            }
        }

        public final void LJFF(AbstractC1328850kgV<K, T>.a.C0000a c0000a, Throwable th) {
            synchronized (this) {
                try {
                    if (this.LJI != c0000a) {
                        return;
                    }
                    this.LIZIZ.clear();
                    AbstractC1328850kgV.this.LJIIIIZZ(this.LIZ, this);
                    LIZIZ(this.LIZJ);
                    this.LIZJ = null;
                    for (Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1> pair : this.LIZIZ) {
                        synchronized (pair) {
                            try {
                                ((InterfaceC1328020kfA) pair.first).onFailure(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void LJII(AbstractC1328850kgV<K, T>.a.C0000a c0000a, float f) {
            synchronized (this) {
                try {
                    if (this.LJI != c0000a) {
                        return;
                    }
                    this.LIZLLL = f;
                    for (Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1> pair : this.LIZIZ) {
                        synchronized (pair) {
                            try {
                                ((InterfaceC1328020kfA) pair.first).LIZ(f);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, all -> 0x0070, blocks: (B:20:0x0046, B:22:0x0052, B:25:0x0061, B:26:0x0064, B:33:0x0074, B:34:0x0077, B:28:0x0066, B:29:0x006d, B:24:0x005a), top: B:46:0x0046 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJI(X.AbstractC1328850kgV<K, T>.a.C0000a r6, T r7, int r8) {
            /*
                r5 = this;
                monitor-enter(r5)
                X.0kgV<K, T>$a$a r0 = r5.LJI     // Catch: java.lang.Throwable -> L7f
                if (r0 == r6) goto L7
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
                return
            L7:
                T extends java.io.Closeable r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L7f
                LIZIZ(r0)     // Catch: java.lang.Throwable -> L7f
                r0 = 0
                r5.LIZJ = r0     // Catch: java.lang.Throwable -> L7f
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<X.0kfA<T extends java.io.Closeable>, X.0kf1>> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L7f
                java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L7f
                boolean r0 = X.AbstractC1327820keq.LJ(r8)     // Catch: java.lang.Throwable -> L7f
                if (r0 == 0) goto L27
                X.0kgV r0 = X.AbstractC1328850kgV.this     // Catch: java.lang.Throwable -> L7f
                java.io.Closeable r0 = r0.LIZJ(r7)     // Catch: java.lang.Throwable -> L7f
                r5.LIZJ = r0     // Catch: java.lang.Throwable -> L7f
                r5.LJ = r8     // Catch: java.lang.Throwable -> L7f
            L25:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
                goto L34
            L27:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<X.0kfA<T extends java.io.Closeable>, X.0kf1>> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L7f
                r0.clear()     // Catch: java.lang.Throwable -> L7f
                X.0kgV r1 = X.AbstractC1328850kgV.this     // Catch: java.lang.Throwable -> L7f
                K r0 = r5.LIZ     // Catch: java.lang.Throwable -> L7f
                r1.LJIIIIZZ(r0, r5)     // Catch: java.lang.Throwable -> L7f
                goto L25
            L34:
                r1 = 0
            L35:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L7e
                java.lang.Object r3 = r4.next()
                android.util.Pair r3 = (android.util.Pair) r3
                monitor-enter(r3)
                int r2 = r1 + 1
                if (r1 == 0) goto L66
                X.0kgV r0 = X.AbstractC1328850kgV.this     // Catch: java.lang.Throwable -> L78
                X.0kiM r1 = r0.LJI(r7)     // Catch: java.lang.Throwable -> L78
                X.0kiM r0 = X.C1328540kg0.LIZJ()     // Catch: java.lang.Throwable -> L78
                if (r1 != r0) goto L66
                X.0kgV r0 = X.AbstractC1328850kgV.this     // Catch: java.lang.Throwable -> L78
                java.io.Closeable r1 = r0.LIZLLL(r7)     // Catch: java.lang.Throwable -> L78
                if (r1 == 0) goto L66
                java.lang.Object r0 = r3.first     // Catch: java.lang.Throwable -> L70
                X.0kfA r0 = (X.InterfaceC1328020kfA) r0     // Catch: java.lang.Throwable -> L70
                r0.LIZJ(r8, r1)     // Catch: java.lang.Throwable -> L70
                LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L78
                goto L6e
            L66:
                java.lang.Object r0 = r3.first     // Catch: java.lang.Throwable -> L78
                X.0kfA r0 = (X.InterfaceC1328020kfA) r0     // Catch: java.lang.Throwable -> L78
                r0.LIZJ(r8, r7)     // Catch: java.lang.Throwable -> L78
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L78
            L6e:
                r1 = r2
                goto L35
            L70:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L70
                LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
                throw r0     // Catch: java.lang.Throwable -> L78
            L78:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L78
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L78
                throw r0
            L7e:
                return
            L7f:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1328850kgV.a.LJI(X.0kgV$a$a, java.io.Closeable, int):void");
        }
    }

    public abstract T LIZJ(T t);

    public T LIZLLL(T t) {
        return null;
    }

    public abstract C1330000kiM LJI(T t);

    public abstract K LJII(InterfaceC1327930kf1 interfaceC1327930kf1);

    public AbstractC1328850kgV(InterfaceC1327390ke9<T> interfaceC1327390ke9) {
        this.LIZIZ = interfaceC1327390ke9;
    }

    public final synchronized AbstractC1328850kgV<K, T>.a LJ(K k) {
        AbstractC1328850kgV<K, T>.a aVar;
        aVar = new a(k);
        ((HashMap) this.LIZ).put(k, aVar);
        return aVar;
    }

    public final synchronized AbstractC1328850kgV<K, T>.a LJFF(K k) {
        return (a) ((HashMap) this.LIZ).get(k);
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<T> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        AbstractC1328850kgV<K, T>.a aVarLJFF;
        boolean z;
        try {
            C1336010ks3.LIZIZ();
            K kLJII = LJII(interfaceC1327930kf1);
            do {
                synchronized (this) {
                    try {
                        aVarLJFF = LJFF(kLJII);
                        if (aVarLJFF == null) {
                            aVarLJFF = LJ(kLJII);
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } while (!aVarLJFF.LIZ(interfaceC1328020kfA, interfaceC1327930kf1));
            if (z) {
                aVarLJFF.LJIIIIZZ();
            }
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public final synchronized void LJIIIIZZ(K k, AbstractC1328850kgV<K, T>.a aVar) {
        if (((HashMap) this.LIZ).get(k) == aVar) {
            ((HashMap) this.LIZ).remove(k);
        }
    }
}
