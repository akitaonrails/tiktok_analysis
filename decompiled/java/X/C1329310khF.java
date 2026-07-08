package X;

import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0khF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329310khF<K, V> implements InterfaceC1325150kaX<K, V>, InterfaceC1330800kje {
    public static boolean LLIZLLLIL;
    public static final long LLJ = TimeUnit.MINUTES.toMillis(5);
    public final C1329350khJ<K, C1325210kad<K, V>> LL;
    public final C1329350khJ<K, C1325210kad<K, V>> LLILLJJLI;
    public final InterfaceC1330260kim<V> LLILLL;
    public final InterfaceC1330230kij LLILZ;
    public final InterfaceC1320070kSL<C1329770khz> LLILZIL;
    public C1329770khz LLILZLL;
    public long LLIZ;

    public final void LJII() {
        ArrayList<C1325210kad<K, V>> arrayListLIZ;
        ArrayList<C1325210kad<K, V>> arrayListLIZ2;
        synchronized (this) {
            try {
                arrayListLIZ = this.LL.LIZ();
                arrayListLIZ2 = this.LLILLJJLI.LIZ();
                LJIJI(arrayListLIZ2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJJLI(arrayListLIZ2);
        LJJI(arrayListLIZ);
        LJJII();
        if (this.LLILZLL.LJII) {
            C314750CVl.LIZ();
        }
    }

    public final synchronized int LJIIJJI() {
        return this.LLILLJJLI.LIZLLL();
    }

    public final synchronized int LJIIL() {
        return this.LL.LIZLLL();
    }

    public final synchronized int LJIILIIL() {
        return this.LL.LJI();
    }

    public final synchronized int LJIILJJIL() {
        return this.LLILLJJLI.LIZLLL() - this.LL.LIZLLL();
    }

    public final synchronized int LJIILL() {
        return this.LLILLJJLI.LJI() - this.LL.LJI();
    }

    public final synchronized int LJIILLIIL() {
        return this.LLILLJJLI.LJI();
    }

    public final synchronized void LJIIZILJ(C1325210kad c1325210kad) {
        LJIIIIZZ(this, c1325210kad);
    }

    public final void LJIL() {
        synchronized (this) {
            try {
                C1329770khz c1329770khz = this.LLILZLL;
                int iMin = Math.min(c1329770khz.LIZLLL, c1329770khz.LIZIZ - LJIILJJIL());
                C1329770khz c1329770khz2 = this.LLILZLL;
                LJJIJ(iMin, Math.min(c1329770khz2.LIZJ, c1329770khz2.LIZ - LJIILL()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LJJII() {
        if (this.LLIZ + LLJ > SystemClock.uptimeMillis()) {
            return;
        }
        this.LLIZ = SystemClock.uptimeMillis();
        this.LLILZLL = this.LLILZIL.get();
    }

    public static <K, V> void LJJ(C1325210kad<K, V> c1325210kad) {
        InterfaceC1325070kaP<K> interfaceC1325070kaP;
        if (c1325210kad != null && (interfaceC1325070kaP = c1325210kad.LJ) != null) {
            K k = c1325210kad.LIZ;
            C1325020kaK c1325020kaK = ((C1325060kaO) interfaceC1325070kaP).LIZ;
            synchronized (c1325020kaK) {
                c1325020kaK.LIZLLL.add(k);
            }
        }
    }

    public static void LJJI(ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJJIFFI((C1325210kad) it2.next());
        }
    }

    public static <K, V> void LJJIFFI(C1325210kad<K, V> c1325210kad) {
        InterfaceC1325070kaP<K> interfaceC1325070kaP;
        if (c1325210kad != null && (interfaceC1325070kaP = c1325210kad.LJ) != null) {
            K k = c1325210kad.LIZ;
            C1325020kaK c1325020kaK = ((C1325060kaO) interfaceC1325070kaP).LIZ;
            synchronized (c1325020kaK) {
                c1325020kaK.LIZLLL.remove(k);
            }
        }
    }

    @Override // X.InterfaceC1325150kaX
    public final int LIZIZ(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        ArrayList<C1325210kad<K, V>> arrayListLJIIIZ;
        ArrayList<C1325210kad<K, V>> arrayListLJIIIZ2;
        synchronized (this) {
            try {
                arrayListLJIIIZ = this.LL.LJIIIZ(interfaceC1325100kaS);
                arrayListLJIIIZ2 = this.LLILLJJLI.LJIIIZ(interfaceC1325100kaS);
                LJIJI(arrayListLJIIIZ2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJJLI(arrayListLJIIIZ2);
        LJJI(arrayListLJIIIZ);
        LJJII();
        LJIL();
        if (this.LLILZLL.LJII) {
            C314750CVl.LIZ();
        }
        return arrayListLJIIIZ2.size();
    }

    @Override // X.InterfaceC1330800kje
    public final void LIZJ(EnumC1330650kjP enumC1330650kjP) {
        double dLIZ = this.LLILZ.LIZ(enumC1330650kjP);
        synchronized (this) {
            try {
                LJJIJ(Integer.MAX_VALUE, Math.max(0, ((int) (((double) this.LLILLJJLI.LJI()) * (1.0d - dLIZ))) - LJIILL()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJJII();
        LJIL();
    }

    @Override // X.InterfaceC1325150kaX
    public final synchronized boolean LIZLLL(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        return !this.LLILLJJLI.LJFF(interfaceC1325100kaS).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJI(V r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.0kim<V> r0 = r4.LLILLL     // Catch: java.lang.Throwable -> L28
            int r3 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L28
            X.0khz r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> L28
            int r0 = r0.LJ     // Catch: java.lang.Throwable -> L28
            if (r3 > r0) goto L25
            int r1 = r4.LJIILJJIL()     // Catch: java.lang.Throwable -> L28
            X.0khz r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> L28
            int r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L28
            r2 = 1
            int r0 = r0 - r2
            if (r1 > r0) goto L25
            int r1 = r4.LJIILL()     // Catch: java.lang.Throwable -> L28
            X.0khz r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> L28
            int r0 = r0.LIZ     // Catch: java.lang.Throwable -> L28
            int r0 = r0 - r3
            if (r1 > r0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            monitor-exit(r4)
            return r2
        L28:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1329310khF.LJI(java.lang.Object):boolean");
    }

    public final synchronized void LJIIIZ(C1325210kad<K, V> c1325210kad) {
        boolean z;
        if (!this.LLILZLL.LJFF) {
            c1325210kad.getClass();
            if (c1325210kad.LIZJ > 0) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LJFF(z);
        } else if (c1325210kad != null) {
        }
        c1325210kad.LIZJ--;
    }

    public final synchronized void LJIIJ(C1325210kad<K, V> c1325210kad) {
        boolean z;
        c1325210kad.getClass();
        if (!this.LLILZLL.LJFF) {
            if (c1325210kad.LIZJ > 0) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LJFF(z);
            c1325210kad.LIZJ = 0;
        }
    }

    public final synchronized void LJIJ(C1325210kad<K, V> c1325210kad) {
        boolean z;
        if (!this.LLILZLL.LJFF) {
            c1325210kad.getClass();
            if (!c1325210kad.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LJFF(z);
        } else if (c1325210kad != null) {
        }
        c1325210kad.LIZLLL = true;
    }

    public final synchronized void LJIJI(ArrayList<C1325210kad<K, V>> arrayList) {
        Iterator<C1325210kad<K, V>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJIJ(it2.next());
        }
    }

    public final synchronized boolean LJIJJ(C1325210kad<K, V> c1325210kad) {
        if (c1325210kad == null) {
            return false;
        }
        if (c1325210kad.LIZLLL || c1325210kad.LIZJ != 0) {
            return false;
        }
        this.LL.LJII(c1325210kad.LIZ, c1325210kad);
        return true;
    }

    public final void LJIJJLI(ArrayList<C1325210kad<K, V>> arrayList) {
        Iterator<C1325210kad<K, V>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1323050kX9.LJII(LJJIIJ(it2.next()));
        }
    }

    public final synchronized C1323050kX9<V> LJJIII(final C1325210kad<K, V> c1325210kad) {
        LJIIZILJ(c1325210kad);
        return C1323050kX9.LJJIZ(c1325210kad.LIZIZ.get(), new InterfaceC1290810jh9<V>() { // from class: X.0khL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1290810jh9
            public final void LIZ(V v) {
                boolean zLJIJJ;
                C1323050kX9<V> c1323050kX9LJJIIJ;
                boolean zLJIJJ2;
                C1323050kX9<V> c1323050kX9LJJIIJ2;
                if (v instanceof C1325120kaU) {
                    C1323090kXD.LIZIZ().LIZ(((AbstractC1325130kaV) v).getUnderlyingBitmap());
                }
                final C1329310khF c1329310khF = this.LLILLJJLI;
                final C1325210kad c1325210kad2 = c1325210kad;
                if (!c1329310khF.LLILZLL.LJFF) {
                    c1325210kad2.getClass();
                }
                if (C1329310khF.LLIZLLLIL) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        synchronized (c1329310khF) {
                            try {
                                c1329310khF.LJIIIZ(c1325210kad2);
                                zLJIJJ2 = c1329310khF.LJIJJ(c1325210kad2);
                                c1323050kX9LJJIIJ2 = c1329310khF.LJJIIJ(c1325210kad2);
                            } finally {
                            }
                        }
                        C1323050kX9.LJII(c1323050kX9LJJIIJ2);
                        if (!zLJIJJ2) {
                            c1325210kad2 = null;
                        }
                        C1329310khF.LJJ(c1325210kad2);
                        c1329310khF.LJJII();
                        c1329310khF.LJIL();
                        return;
                    }
                    C1329970kiJ.LIZ().execute(new Runnable() { // from class: X.0khV
                        public final void LIZ() {
                            boolean zLJIJJ3;
                            C1323050kX9 c1323050kX9LJJIIJ3;
                            synchronized (this) {
                                try {
                                    c1329310khF.LJIIIZ(c1325210kad2);
                                    zLJIJJ3 = c1329310khF.LJIJJ(c1325210kad2);
                                    c1323050kX9LJJIIJ3 = c1329310khF.LJJIIJ(c1325210kad2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C1323050kX9.LJII(c1323050kX9LJJIIJ3);
                            C1329310khF.LJJ(zLJIJJ3 ? c1325210kad2 : null);
                            c1329310khF.LJJII();
                            c1329310khF.LJIL();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CountingMemoryCache@b3e5.releaseClientReference$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CountingMemoryCache@b3e5.releaseClientReference$1");
                        }
                    });
                    return;
                }
                synchronized (c1329310khF) {
                    try {
                        c1329310khF.LJIIIZ(c1325210kad2);
                        zLJIJJ = c1329310khF.LJIJJ(c1325210kad2);
                        c1323050kX9LJJIIJ = c1329310khF.LJJIIJ(c1325210kad2);
                    } finally {
                    }
                }
                C1323050kX9.LJII(c1323050kX9LJJIIJ);
                if (!zLJIJJ) {
                    c1325210kad2 = null;
                }
                C1329310khF.LJJ(c1325210kad2);
                c1329310khF.LJJII();
                c1329310khF.LJIL();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C1323050kX9<V> LJJIIJ(X.C1325210kad<K, V> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            X.0khz r0 = r1.LLILZLL     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.LJFF     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lb
            r2.getClass()
            goto Ld
        Lb:
            if (r2 == 0) goto L18
        Ld:
            boolean r0 = r2.LIZLLL     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            int r0 = r2.LIZJ     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L18
            X.0kX9<V> r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L1b
            goto L19
        L18:
            r0 = 0
        L19:
            monitor-exit(r1)
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1329310khF.LJJIIJ(X.0kad):X.0kX9");
    }

    public final void LJJIIJZLJL(C1325210kad<K, V> c1325210kad) {
        boolean zLJIJJ;
        C1323050kX9<V> c1323050kX9LJJIIJ;
        boolean zLJIJJ2;
        C1323050kX9<V> c1323050kX9LJJIIJ2;
        if (!this.LLILZLL.LJFF) {
            c1325210kad.getClass();
        }
        if (LLIZLLLIL) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                synchronized (this) {
                    try {
                        LJIIJ(c1325210kad);
                        zLJIJJ2 = LJIJJ(c1325210kad);
                        c1323050kX9LJJIIJ2 = LJJIIJ(c1325210kad);
                    } finally {
                    }
                }
                C1323050kX9.LJII(c1323050kX9LJJIIJ2);
                if (!zLJIJJ2) {
                    c1325210kad = null;
                }
                LJJ(c1325210kad);
                LJJII();
                LJIL();
                return;
            }
            C1329970kiJ.LIZ().execute(new ARunnableS89S0200000_20(this, c1325210kad, 248));
            return;
        }
        synchronized (this) {
            try {
                LJIIJ(c1325210kad);
                zLJIJJ = LJIJJ(c1325210kad);
                c1323050kX9LJJIIJ = LJJIIJ(c1325210kad);
            } finally {
            }
        }
        C1323050kX9.LJII(c1323050kX9LJJIIJ);
        if (!zLJIJJ) {
            c1325210kad = null;
        }
        LJJ(c1325210kad);
        LJJII();
        LJIL();
    }

    public final void LJJIIZ(InterfaceC1325100kaS interfaceC1325100kaS) {
        ArrayList<C1325210kad<K, V>> arrayListLJIIIZ;
        K k;
        ArrayList<C1325210kad<K, V>> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                arrayListLJIIIZ = this.LL.LJIIIZ(interfaceC1325100kaS);
                for (int i = 0; i < arrayListLJIIIZ.size(); i++) {
                    C1325210kad<K, V> c1325210kad = arrayListLJIIIZ.get(i);
                    arrayList.add(this.LLILLJJLI.LJIIIIZZ(c1325210kad.LIZ));
                    if (this.LLILZLL.LJII && (k = c1325210kad.LIZ) != null) {
                        C314750CVl.LIZIZ(k.toString());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJJLI(arrayList);
        LJJI(arrayListLJIIIZ);
        LJJII();
        LJIL();
        arrayList.size();
    }

    public final C1323050kX9 LJJIIZI(InterfaceC1324680kZm interfaceC1324680kZm) {
        C1325210kad<K, V> c1325210kadLJIIIIZZ;
        boolean z;
        C1323050kX9<V> c1323050kX9;
        synchronized (this) {
            try {
                c1325210kadLJIIIIZZ = this.LL.LJIIIIZZ(interfaceC1324680kZm);
                z = false;
                c1323050kX9 = null;
                if (c1325210kadLJIIIIZZ != null) {
                    C1325210kad<K, V> c1325210kadLJIIIIZZ2 = this.LLILLJJLI.LJIIIIZZ(interfaceC1324680kZm);
                    if (this.LLILZLL.LJII) {
                        C314750CVl.LIZIZ(interfaceC1324680kZm.toString());
                    }
                    if (!this.LLILZLL.LJFF) {
                        c1325210kadLJIIIIZZ2.getClass();
                        if (c1325210kadLJIIIIZZ2.LIZJ == 0) {
                            z = true;
                        }
                        C1322350kW1.LJFF(z);
                    } else {
                        if (c1325210kadLJIIIIZZ2 != null) {
                        }
                        z = true;
                    }
                    c1323050kX9 = c1325210kadLJIIIIZZ2.LIZIZ;
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LJJIFFI(c1325210kadLJIIIIZZ);
        }
        return c1323050kX9;
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9<V> get(K k) {
        C1325210kad<K, V> c1325210kadLJIIIIZZ;
        C1323050kX9<V> c1323050kX9LJJIII;
        k.getClass();
        synchronized (this) {
            try {
                c1325210kadLJIIIIZZ = this.LL.LJIIIIZZ(k);
                C1325210kad<K, V> c1325210kadLIZJ = this.LLILLJJLI.LIZJ(k);
                if (c1325210kadLIZJ != null) {
                    c1323050kX9LJJIII = LJJIII(c1325210kadLIZJ);
                } else {
                    c1323050kX9LJJIII = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJJIFFI(c1325210kadLJIIIIZZ);
        LJJII();
        LJIL();
        return c1323050kX9LJJIII;
    }

    public static void LJIIIIZZ(C1329310khF c1329310khF, C1325210kad c1325210kad) {
        boolean z;
        synchronized (c1329310khF) {
            if (!c1329310khF.LLILZLL.LJFF) {
                if (!c1325210kad.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                C1322350kW1.LJFF(z);
            }
            c1325210kad.LIZJ++;
        }
        C314720CVi.LIZIZ(c1325210kad.LIZ);
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9 LJ(InterfaceC1324680kZm interfaceC1324680kZm, C1323050kX9 c1323050kX9) {
        return LJFF(interfaceC1324680kZm, c1323050kX9, null);
    }

    public final synchronized void LJJIJ(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.LL.LIZLLL() <= iMax && this.LL.LJI() <= iMax2) {
            return;
        }
        while (true) {
            if (this.LL.LIZLLL() > iMax || this.LL.LJI() > iMax2) {
                K kLJ = this.LL.LJ();
                if (kLJ != null) {
                    this.LL.LJIIIIZZ(kLJ);
                    C1325210kad<K, V> c1325210kadLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(kLJ);
                    if (this.LLILZLL.LJII) {
                        C314750CVl.LIZIZ(kLJ.toString());
                    }
                    if (c1325210kadLJIIIIZZ != null) {
                        LJIJ(c1325210kadLJIIIIZZ);
                        C1323050kX9.LJII(LJJIIJ(c1325210kadLJIIIIZZ));
                        LJJIFFI(c1325210kadLJIIIIZZ);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0khe] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0khe] */
    public C1329310khF(final InterfaceC1330260kim<V> interfaceC1330260kim, InterfaceC1330230kij interfaceC1330230kij, InterfaceC1320070kSL<C1329770khz> interfaceC1320070kSL) {
        new WeakHashMap();
        this.LLILLL = interfaceC1330260kim;
        this.LL = new C1329350khJ<>(new InterfaceC1330260kim<C1325210kad<Object, Object>>() { // from class: X.0khe
            @Override // X.InterfaceC1330260kim
            public final int LIZ(C1325210kad<Object, Object> c1325210kad) {
                return interfaceC1330260kim.LIZ(c1325210kad.LIZIZ.get());
            }
        });
        this.LLILLJJLI = new C1329350khJ<>(new InterfaceC1330260kim<C1325210kad<Object, Object>>() { // from class: X.0khe
            @Override // X.InterfaceC1330260kim
            public final int LIZ(C1325210kad<Object, Object> c1325210kad) {
                return interfaceC1330260kim.LIZ(c1325210kad.LIZIZ.get());
            }
        });
        this.LLILZ = interfaceC1330230kij;
        this.LLILZIL = interfaceC1320070kSL;
        this.LLILZLL = interfaceC1320070kSL.get();
        this.LLIZ = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1323050kX9 LJFF(InterfaceC1324680kZm interfaceC1324680kZm, C1323050kX9 c1323050kX9, C1325060kaO c1325060kaO) {
        C1325210kad<K, V> c1325210kadLJIIIIZZ;
        C1323050kX9 c1323050kX9LJJIII;
        C1323050kX9 c1323050kX9LJJIIJ;
        interfaceC1324680kZm.getClass();
        c1323050kX9.getClass();
        LJJII();
        synchronized (this) {
            try {
                c1325210kadLJIIIIZZ = this.LL.LJIIIIZZ(interfaceC1324680kZm);
                C1325210kad<K, V> c1325210kadLJIIIIZZ2 = this.LLILLJJLI.LJIIIIZZ(interfaceC1324680kZm);
                c1323050kX9LJJIII = null;
                if (c1325210kadLJIIIIZZ2 != null) {
                    LJIJ(c1325210kadLJIIIIZZ2);
                    c1323050kX9LJJIIJ = LJJIIJ(c1325210kadLJIIIIZZ2);
                } else {
                    c1323050kX9LJJIIJ = null;
                }
                int iLIZ = this.LLILLL.LIZ((V) c1323050kX9.get());
                if (LJI(c1323050kX9.get())) {
                    C1325210kad c1325210kad = new C1325210kad(interfaceC1324680kZm, c1323050kX9, c1325060kaO);
                    this.LLILLJJLI.LJII(interfaceC1324680kZm, c1325210kad);
                    c1323050kX9LJJIII = LJJIII(c1325210kad);
                } else {
                    C1329770khz c1329770khz = this.LLILZLL;
                    if (c1329770khz.LJFF && iLIZ < Math.min(Math.min(c1329770khz.LIZ, c1329770khz.LJ), this.LLILZLL.LJI)) {
                        while (!LJI(c1323050kX9.get())) {
                            K kLJ = this.LLILLJJLI.LJ();
                            LJJIIJZLJL(this.LLILLJJLI.LIZJ(kLJ));
                            this.LLILLJJLI.LJIIIIZZ(kLJ);
                            if (this.LLILZLL.LJII && kLJ != null) {
                                C314750CVl.LIZIZ(kLJ.toString());
                            }
                        }
                        C1325210kad c1325210kad2 = new C1325210kad(interfaceC1324680kZm, c1323050kX9, c1325060kaO);
                        this.LLILLJJLI.LJII(interfaceC1324680kZm, c1325210kad2);
                        c1323050kX9LJJIII = LJJIII(c1325210kad2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1323050kX9.LJII(c1323050kX9LJJIIJ);
        LJJIFFI(c1325210kadLJIIIIZZ);
        LJIL();
        return c1323050kX9LJJIII;
    }
}
