package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: X.0kiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1330070kiT<V> implements InterfaceC1329200kh4<V> {
    public final Class<?> LL = getClass();
    public final InterfaceC1328250kfX LLILLJJLI;
    public final C1329300khE LLILLL;
    public final SparseArray<C1330080kiU<V>> LLILZ;
    public final Set<V> LLILZIL;
    public boolean LLILZLL;
    public final C1330100kiW LLIZ;
    public final C1330100kiW LLIZLLLIL;
    public final InterfaceC1330150kib LLJ;

    public abstract V LIZIZ(int i);

    public final synchronized void LJ() {
        C1322350kW1.LJFF(!LJIIL() || this.LLIZLLLIL.LIZIZ == 0);
    }

    public abstract void LJFF(V v);

    public abstract int LJIIIIZZ(int i);

    public abstract int LJIIIZ(V v);

    public abstract int LJIIJ(int i);

    public final synchronized boolean LJIIL() {
        boolean z;
        if (this.LLIZ.LIZIZ + this.LLIZLLLIL.LIZIZ > this.LLILLL.LIZIZ) {
            z = true;
            this.LLJ.LJ();
        } else {
            z = false;
        }
        return z;
    }

    public final void LJIILL() {
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILJJIL(this.LL, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.LLIZ.LIZ), Integer.valueOf(this.LLIZ.LIZIZ), Integer.valueOf(this.LLIZLLLIL.LIZ), Integer.valueOf(this.LLIZLLLIL.LIZIZ));
        }
    }

    public final synchronized void LJIJ() {
        if (LJIIL()) {
            LJIIZILJ(this.LLILLL.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:4:0x000b, B:6:0x001a, B:7:0x003b, B:8:0x003e, B:11:0x0043, B:13:0x0052, B:15:0x0058, B:17:0x005e, B:19:0x007e, B:20:0x0092, B:23:0x0097, B:24:0x009f, B:26:0x00a5, B:27:0x00b8), top: B:33:0x000b }] */
    @Override // X.InterfaceC1329200kh4, X.InterfaceC1290810jh9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(V r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1330070kiT.LIZ(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1330800kje
    public final void LIZJ(EnumC1330650kjP enumC1330650kjP) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            try {
                this.LLILLL.getClass();
                arrayList = new ArrayList(this.LLILZ.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.LLILZ.size(); i2++) {
                    C1330080kiU<V> c1330080kiUValueAt = this.LLILZ.valueAt(i2);
                    if (((LinkedList) c1330080kiUValueAt.LIZJ).size() > 0) {
                        arrayList.add(c1330080kiUValueAt);
                    }
                    sparseIntArray.put(this.LLILZ.keyAt(i2), c1330080kiUValueAt.LJ);
                }
                LJIILJJIL(sparseIntArray);
                C1330100kiW c1330100kiW = this.LLIZLLLIL;
                c1330100kiW.LIZ = 0;
                c1330100kiW.LIZIZ = 0;
                LJIILL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (i = 0; i < arrayList.size(); i++) {
            C1330080kiU c1330080kiU = (C1330080kiU) arrayList.get(i);
            while (true) {
                Object objLIZIZ = c1330080kiU.LIZIZ();
                if (objLIZIZ == null) {
                    break;
                } else {
                    LJFF(objLIZIZ);
                }
            }
        }
    }

    public final synchronized boolean LIZLLL(int i) {
        C1329300khE c1329300khE = this.LLILLL;
        int i2 = c1329300khE.LIZ;
        int i3 = this.LLIZ.LIZIZ;
        if (i > i2 - i3) {
            this.LLJ.LJI();
            return false;
        }
        int i4 = c1329300khE.LIZIZ;
        if (i > i4 - (i3 + this.LLIZLLLIL.LIZIZ)) {
            LJIIZILJ(i4 - i);
        }
        if (i > i2 - (this.LLIZ.LIZIZ + this.LLIZLLLIL.LIZIZ)) {
            this.LLJ.LJI();
            return false;
        }
        return true;
    }

    public final synchronized C1330080kiU<V> LJI(int i) {
        C1330080kiU<V> c1330080kiU = this.LLILZ.get(i);
        if (c1330080kiU == null && this.LLILZLL) {
            if (C1328570kg3.LJIIJ(2)) {
                C1328570kg3.LJIIJJI(this.LL, "creating new bucket %s", Integer.valueOf(i));
            }
            C1330080kiU<V> c1330080kiULJIILLIIL = LJIILLIIL(i);
            this.LLILZ.put(i, c1330080kiULJIILLIIL);
            return c1330080kiULJIILLIIL;
        }
        return c1330080kiU;
    }

    public final synchronized C1330080kiU<V> LJII(int i) {
        return this.LLILZ.get(i);
    }

    public synchronized V LJIIJJI(C1330080kiU<V> c1330080kiU) {
        V vLIZIZ;
        vLIZIZ = c1330080kiU.LIZIZ();
        if (vLIZIZ != null) {
            c1330080kiU.LJ++;
        }
        return vLIZIZ;
    }

    public boolean LJIILIIL(V v) {
        v.getClass();
        return true;
    }

    public final synchronized void LJIILJJIL(SparseIntArray sparseIntArray) {
        this.LLILZ.clear();
        SparseIntArray sparseIntArray2 = this.LLILLL.LIZJ;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int iKeyAt = sparseIntArray2.keyAt(i);
                int iValueAt = sparseIntArray2.valueAt(i);
                int i2 = sparseIntArray.get(iKeyAt, 0);
                SparseArray<C1330080kiU<V>> sparseArray = this.LLILZ;
                LJIIJ(iKeyAt);
                this.LLILLL.getClass();
                sparseArray.put(iKeyAt, new C1330080kiU<>(iKeyAt, iValueAt, i2));
            }
            this.LLILZLL = false;
        } else {
            this.LLILZLL = true;
        }
    }

    public C1330080kiU<V> LJIILLIIL(int i) {
        LJIIJ(i);
        this.LLILLL.getClass();
        return new C1330080kiU<>(i, Integer.MAX_VALUE, 0);
    }

    public final synchronized void LJIIZILJ(int i) {
        int i2 = this.LLIZ.LIZIZ;
        int i3 = this.LLIZLLLIL.LIZIZ;
        int iMin = Math.min((i2 + i3) - i, i3);
        if (iMin <= 0) {
            return;
        }
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIILIIL(this.LL, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.LLIZ.LIZIZ + this.LLIZLLLIL.LIZIZ), Integer.valueOf(iMin));
        }
        LJIILL();
        for (int i4 = 0; i4 < this.LLILZ.size() && iMin > 0; i4++) {
            C1330080kiU<V> c1330080kiUValueAt = this.LLILZ.valueAt(i4);
            do {
                V vLIZIZ = c1330080kiUValueAt.LIZIZ();
                if (vLIZIZ != null) {
                    LJFF(vLIZIZ);
                    int i5 = c1330080kiUValueAt.LIZ;
                    iMin -= i5;
                    this.LLIZLLLIL.LIZ(i5);
                }
            } while (iMin > 0);
        }
        LJIILL();
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIIL(this.LL, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.LLIZ.LIZIZ + this.LLIZLLLIL.LIZIZ));
        }
    }

    @Override // X.InterfaceC1329200kh4
    public final V get(int i) throws Throwable {
        V vLIZIZ;
        boolean z;
        V vLJIIJJI;
        LJ();
        final int iLJIIIIZZ = LJIIIIZZ(i);
        synchronized (this) {
            try {
                C1330080kiU<V> c1330080kiULJI = LJI(iLJIIIIZZ);
                if (c1330080kiULJI != null && (vLJIIJJI = LJIIJJI(c1330080kiULJI)) != null) {
                    C1322350kW1.LJFF(this.LLILZIL.add(vLJIIJJI));
                    int iLJIIIZ = LJIIIZ(vLJIIJJI);
                    LJIIJ(iLJIIIZ);
                    C1330100kiW c1330100kiW = this.LLIZ;
                    c1330100kiW.LIZ++;
                    c1330100kiW.LIZIZ += iLJIIIZ;
                    this.LLIZLLLIL.LIZ(iLJIIIZ);
                    this.LLJ.LIZ();
                    LJIILL();
                    if (C1328570kg3.LJIIJ(2)) {
                        C1328570kg3.LJIIL(this.LL, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vLJIIJJI)), Integer.valueOf(iLJIIIZ));
                    }
                    return vLJIIJJI;
                }
                LJIIJ(iLJIIIIZZ);
                if (LIZLLL(iLJIIIIZZ)) {
                    C1330100kiW c1330100kiW2 = this.LLIZ;
                    c1330100kiW2.LIZ++;
                    c1330100kiW2.LIZIZ += iLJIIIIZZ;
                    if (c1330080kiULJI != null) {
                        c1330080kiULJI.LJ++;
                    }
                    try {
                        vLIZIZ = LIZIZ(iLJIIIIZZ);
                    } catch (Throwable th) {
                        synchronized (this) {
                            try {
                                this.LLIZ.LIZ(iLJIIIIZZ);
                                C1330080kiU<V> c1330080kiULJI2 = LJI(iLJIIIIZZ);
                                if (c1330080kiULJI2 != null) {
                                    if (c1330080kiULJI2.LJ > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C1322350kW1.LJFF(z);
                                    c1330080kiULJI2.LJ--;
                                }
                                if (!Error.class.isInstance(th)) {
                                    if (!RuntimeException.class.isInstance(th)) {
                                        vLIZIZ = null;
                                    } else {
                                        throw ((Throwable) RuntimeException.class.cast(th));
                                    }
                                } else {
                                    throw ((Throwable) Error.class.cast(th));
                                }
                            } finally {
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            C1322350kW1.LJFF(this.LLILZIL.add(vLIZIZ));
                            LJIJ();
                            this.LLJ.LIZLLL();
                            LJIILL();
                            if (C1328570kg3.LJIIJ(2)) {
                                C1328570kg3.LJIIL(this.LL, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vLIZIZ)), Integer.valueOf(iLJIIIIZZ));
                            }
                        } finally {
                        }
                    }
                    return vLIZIZ;
                }
                final int i2 = this.LLILLL.LIZ;
                final int i3 = this.LLIZ.LIZIZ;
                final int i4 = this.LLIZLLLIL.LIZIZ;
                throw new RuntimeException(i2, i3, i4, iLJIIIIZZ) { // from class: X.0V02
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Pool hard cap violation? Hard cap = ");
                        sbLIZ.append(i2);
                        sbLIZ.append(" Used size = ");
                        sbLIZ.append(i3);
                        sbLIZ.append(" Free size = ");
                        sbLIZ.append(i4);
                        sbLIZ.append(" Request size = ");
                        sbLIZ.append(iLJIIIIZZ);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            } finally {
            }
        }
    }

    public AbstractC1330070kiT(InterfaceC1328250kfX interfaceC1328250kfX, C1329300khE c1329300khE, C1330500kjA c1330500kjA) {
        interfaceC1328250kfX.getClass();
        this.LLILLJJLI = interfaceC1328250kfX;
        c1329300khE.getClass();
        this.LLILLL = c1329300khE;
        c1330500kjA.getClass();
        this.LLJ = c1330500kjA;
        this.LLILZ = new SparseArray<>();
        LJIILJJIL(new SparseIntArray(0));
        this.LLILZIL = Collections.newSetFromMap(new IdentityHashMap());
        this.LLIZLLLIL = new C1330100kiW();
        this.LLIZ = new C1330100kiW();
    }
}
