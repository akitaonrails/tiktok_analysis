package X;

import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0kr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335440kr8 implements InterfaceC1326920kdO, InterfaceC1326930kdP {
    public static final Class<?> LJIILLIIL = C1335440kr8.class;
    public static final long LJIIZILJ = TimeUnit.HOURS.toMillis(2);
    public static final long LJIJ = TimeUnit.MINUTES.toMillis(30);
    public final long LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public final C1335500krE LIZLLL;
    public final Set<String> LJ;
    public long LJFF;
    public final long LJI;
    public final C1335460krA LJII;
    public final InterfaceC1335470krB LJIIIIZZ;
    public final InterfaceC1335630krR LJIIIZ;
    public final InterfaceC1331440kkg LJIIJ;
    public final boolean LJIIJJI;
    public final C1335530krH LJIIL;
    public final C1335650krT LJIILIIL;
    public final Object LJIILJJIL = new Object();
    public final float LJIILL;

    @Override // X.InterfaceC1326920kdO
    public final C1325500kb6 LIZ() {
        return this.LJIIIIZZ.LIZ();
    }

    @Override // X.InterfaceC1326930kdP
    public final void LJFF() {
        synchronized (this.LJIILJJIL) {
            try {
                LJIILJJIL();
                long jLIZIZ = this.LJIIL.LIZIZ();
                long j = this.LJI;
                if (j <= 0 || jLIZIZ <= 0 || jLIZIZ < j) {
                    return;
                }
                double d = 1.0d - (j / jLIZIZ);
                if (d > 0.02d) {
                    LJIJ(d);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIILJJIL() {
        boolean z;
        this.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1335530krH c1335530krH = this.LJIIL;
        synchronized (c1335530krH) {
            z = c1335530krH.LIZ;
        }
        if (z) {
            long j = this.LJFF;
            if (j != -1 && jCurrentTimeMillis - j <= LJIJ) {
                return false;
            }
        }
        return LJIILL();
    }

    public final boolean LJIILL() {
        boolean z;
        Set<String> set;
        this.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LJIIZILJ + jCurrentTimeMillis;
        Set<String> hashSet = (this.LJIIJJI && ((HashSet) this.LJ).isEmpty()) ? this.LJ : this.LJIIJJI ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            int size2 = 0;
            for (InterfaceC1335610krP interfaceC1335610krP : this.LJIIIIZZ.LJ()) {
                i++;
                size += interfaceC1335610krP.getSize();
                if (interfaceC1335610krP.getTimestamp() > j) {
                    i2++;
                    size2 = (int) (((long) size2) + interfaceC1335610krP.getSize());
                    jMax = Math.max(interfaceC1335610krP.getTimestamp() - jCurrentTimeMillis, jMax);
                    z2 = true;
                } else if (this.LJIIJJI) {
                    hashSet.add(interfaceC1335610krP.getId());
                }
            }
            if (z2) {
                InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Future timestamp found in ");
                sbLIZ.append(i2);
                sbLIZ.append(" files , with a total size of ");
                sbLIZ.append(size2);
                sbLIZ.append(" bytes, and a maximum time delta of ");
                sbLIZ.append(jMax);
                sbLIZ.append("ms");
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC1331440kkg.getClass();
            }
            long j2 = i;
            if (this.LJIIL.LIZ() == j2 && this.LJIIL.LIZIZ() == size) {
                z = true;
            } else {
                if (this.LJIIJJI && (set = this.LJ) != hashSet) {
                    ((HashSet) set).clear();
                    this.LJ.addAll(hashSet);
                }
                C1335530krH c1335530krH = this.LJIIL;
                synchronized (c1335530krH) {
                    c1335530krH.LIZJ = j2;
                    c1335530krH.LIZIZ = size;
                    z = true;
                    c1335530krH.LIZ = true;
                }
            }
            LJIJI();
            this.LJFF = jCurrentTimeMillis;
            return z;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1331440kkg interfaceC1331440kkg2 = this.LJIIJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calcFileCacheSize: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            interfaceC1331440kkg2.getClass();
            return false;
        }
    }

    public final void LJIJI() {
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    Collection<InterfaceC1335610krP> collectionLJIIIZ = this.LJIIIIZZ.LJIIIZ();
                    List<InterfaceC1335610krP> listLIZLLL = this.LJIIIIZZ.LIZLLL();
                    if (collectionLJIIIZ.size() > listLIZLLL.size()) {
                        Iterator<InterfaceC1335610krP> it2 = collectionLJIIIZ.iterator();
                        while (it2.hasNext()) {
                            LJIILLIIL(it2.next().getId(), listLIZLLL);
                        }
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1328570kg3.LIZJ(LJIILLIIL, "remove config file failed");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJ() {
        EnumC1321310kUL enumC1321310kUL = this.LJIIIIZZ.isExternal() ? EnumC1321310kUL.EXTERNAL : EnumC1321310kUL.INTERNAL;
        C1335460krA c1335460krA = this.LJII;
        long jLIZIZ = this.LIZIZ - this.LJIIL.LIZIZ();
        c1335460krA.LIZ();
        c1335460krA.LIZ();
        if (((ReentrantLock) c1335460krA.LJFF).tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - c1335460krA.LJ > C1335460krA.LJIIIIZZ) {
                    c1335460krA.LIZ = C1335460krA.LIZIZ(c1335460krA.LIZ, c1335460krA.LIZIZ);
                    c1335460krA.LIZJ = C1335460krA.LIZIZ(c1335460krA.LIZJ, c1335460krA.LIZLLL);
                    c1335460krA.LJ = SystemClock.uptimeMillis();
                }
                ((ReentrantLock) c1335460krA.LJFF).unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) c1335460krA.LJFF).unlock();
                throw th;
            }
        }
        StatFs statFs = enumC1321310kUL == EnumC1321310kUL.INTERNAL ? c1335460krA.LIZ : c1335460krA.LIZJ;
        if (statFs != null) {
            long jLLIFFJFJJ = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgQ7XM/eWlgqCxGLa0QAI6qf71kkNjQrMEhFdh53k7qf3Fu4", new String[]{"019e5"})) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEgQ7XM/eWlgqCxGLa0QAI6qf71kkNjQrMEhFdh53k7qf3Fu4", new String[]{"019e5"}));
            if (jLLIFFJFJJ > 0 && jLLIFFJFJJ >= jLIZIZ) {
                this.LIZJ = this.LIZIZ;
                return;
            }
        }
        this.LIZJ = this.LIZ;
    }

    @Override // X.InterfaceC1326920kdO
    public final void clearAll() {
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    this.LJIIIIZZ.clearAll();
                    ((HashSet) this.LJ).clear();
                    this.LIZLLL.onCleared();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (IOException | NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearAll: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC1331440kkg.getClass();
            }
            this.LJIIL.LIZLLL();
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final long getCount() {
        return this.LJIIL.LIZ();
    }

    @Override // X.InterfaceC1326920kdO
    public final long getSize() {
        return this.LJIIL.LIZIZ();
    }

    @Override // X.InterfaceC1326930kdP
    public final void LIZLLL() {
        clearAll();
    }

    @Override // X.InterfaceC1326920kdO
    public final Map<String, String> LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        List<String> listLIZ = C1296830jqr.LIZ(interfaceC1324680kZm);
        Map mapLJFF = null;
        for (int i = 0; i < listLIZ.size(); i++) {
            mapLJFF = this.LJIIIIZZ.LJFF(interfaceC1324680kZm, listLIZ.get(i));
            if (mapLJFF != null) {
                break;
            }
        }
        return mapLJFF;
    }

    @Override // X.InterfaceC1326920kdO
    public final void LIZJ(Double d) {
        synchronized (this.LJIILJJIL) {
            try {
                boolean zLJIILJJIL = LJIILJJIL();
                LJIJJ();
                long jLIZIZ = this.LJIIL.LIZIZ();
                if (jLIZIZ > this.LIZJ && !zLJIILJJIL) {
                    this.LJIIL.LIZLLL();
                    LJIILJJIL();
                }
                if (jLIZIZ > ((int) (this.LIZJ * (1.0d - d.doubleValue())))) {
                    try {
                        LJIIL((long) (this.LIZJ * (1.0d - d.doubleValue())));
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final void LJ(InterfaceC1324680kZm interfaceC1324680kZm) {
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    List<String> listLIZ = C1296830jqr.LIZ(interfaceC1324680kZm);
                    for (int i = 0; i < listLIZ.size(); i++) {
                        String str = listLIZ.get(i);
                        this.LJIIIIZZ.remove(str);
                        ((HashSet) this.LJ).remove(str);
                        this.LJIIIIZZ.LJIIIIZZ(str);
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("delete: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    interfaceC1331440kkg.getClass();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final long LJI(long j) {
        long jMax;
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    this.LJIILIIL.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Collection<InterfaceC1335610krP> collectionLJ = this.LJIIIIZZ.LJ();
                    this.LJIIL.LIZIZ();
                    int i = 0;
                    long j2 = 0;
                    jMax = 0;
                    for (InterfaceC1335610krP interfaceC1335610krP : collectionLJ) {
                        try {
                            long jMax2 = Math.max(1L, Math.abs(jCurrentTimeMillis - interfaceC1335610krP.getTimestamp()));
                            if (jMax2 >= j) {
                                long jLIZJ = this.LJIIIIZZ.LIZJ(interfaceC1335610krP);
                                ((HashSet) this.LJ).remove(interfaceC1335610krP.getId());
                                this.LJIIIIZZ.LJIIIIZZ(interfaceC1335610krP.getId());
                                interfaceC1335610krP.getId();
                                if (jLIZJ > 0) {
                                    i++;
                                    j2 += jLIZJ;
                                    C1331240kkM c1331240kkMLIZ = C1331240kkM.LIZ();
                                    interfaceC1335610krP.getId();
                                    this.LIZLLL.LJ(c1331240kkMLIZ);
                                    c1331240kkMLIZ.LIZIZ();
                                }
                            } else {
                                jMax = Math.max(jMax, jMax2);
                            }
                        } catch (IOException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("clearOldEntries: ");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            interfaceC1331440kkg.getClass();
                        }
                    }
                    this.LJIIIIZZ.LIZIZ();
                    if (i > 0) {
                        LJIILJJIL();
                        this.LJIIL.LIZJ(-j2, -i);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                jMax = 0;
            }
        }
        return jMax;
    }

    @Override // X.InterfaceC1326920kdO
    public final boolean LJII(InterfaceC1324680kZm interfaceC1324680kZm) {
        synchronized (this.LJIILJJIL) {
            try {
                if (LJIIIZ(interfaceC1324680kZm)) {
                    return true;
                }
                try {
                    List<String> listLIZ = C1296830jqr.LIZ(interfaceC1324680kZm);
                    for (int i = 0; i < listLIZ.size(); i++) {
                        String str = listLIZ.get(i);
                        if (this.LJIIIIZZ.LJII(interfaceC1324680kZm, str)) {
                            ((HashSet) this.LJ).add(str);
                            return true;
                        }
                    }
                    return false;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final boolean LJIIIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        synchronized (this.LJIILJJIL) {
            try {
                List<String> listLIZ = C1296830jqr.LIZ(interfaceC1324680kZm);
                for (int i = 0; i < listLIZ.size(); i++) {
                    if (((HashSet) this.LJ).contains(listLIZ.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final InterfaceC1317730kOZ LJIIJ(InterfaceC1324680kZm interfaceC1324680kZm) {
        InterfaceC1317730kOZ interfaceC1317730kOZLJI;
        C1331240kkM c1331240kkMLIZ = C1331240kkM.LIZ();
        c1331240kkMLIZ.LIZ = interfaceC1324680kZm;
        try {
            try {
                synchronized (this.LJIILJJIL) {
                    try {
                        List<String> listLIZ = C1296830jqr.LIZ(interfaceC1324680kZm);
                        int i = 0;
                        String str = null;
                        interfaceC1317730kOZLJI = null;
                        while (true) {
                            if (i < listLIZ.size()) {
                                str = listLIZ.get(i);
                                interfaceC1317730kOZLJI = this.LJIIIIZZ.LJI(interfaceC1324680kZm, str);
                                if (interfaceC1317730kOZLJI != null) {
                                    this.LIZLLL.LIZ(c1331240kkMLIZ);
                                    ((HashSet) this.LJ).add(str);
                                    break;
                                }
                                i++;
                            } else {
                                this.LIZLLL.LIZLLL(c1331240kkMLIZ);
                                ((HashSet) this.LJ).remove(str);
                                break;
                            }
                        }
                    } finally {
                    }
                }
                c1331240kkMLIZ.LIZIZ();
                return interfaceC1317730kOZLJI;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJIIJ.getClass();
                this.LIZLLL.LJFF(c1331240kkMLIZ);
                c1331240kkMLIZ.LIZIZ();
                return null;
            }
        } catch (Throwable th) {
            c1331240kkMLIZ.LIZIZ();
            throw th;
        }
    }

    public final void LJIIL(long j) throws IOException {
        try {
            Collection<InterfaceC1335610krP> collectionLJIILIIL = LJIILIIL(this.LJIIIIZZ.LJ());
            long jLIZIZ = this.LJIIL.LIZIZ() - j;
            int i = 0;
            long j2 = 0;
            for (InterfaceC1335610krP interfaceC1335610krP : (ArrayList) collectionLJIILIIL) {
                if (j2 > jLIZIZ) {
                    break;
                }
                long jLIZJ = this.LJIIIIZZ.LIZJ(interfaceC1335610krP);
                ((HashSet) this.LJ).remove(interfaceC1335610krP.getId());
                this.LJIIIIZZ.LJIIIIZZ(interfaceC1335610krP.getId());
                if (jLIZJ > 0) {
                    i++;
                    j2 += jLIZJ;
                    C1331240kkM c1331240kkMLIZ = C1331240kkM.LIZ();
                    interfaceC1335610krP.getId();
                    this.LIZLLL.LJ(c1331240kkMLIZ);
                    c1331240kkMLIZ.LIZIZ();
                }
            }
            this.LJIIL.LIZJ(-j2, -i);
            this.LJIIIIZZ.LIZIZ();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("evictAboveSize: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC1331440kkg.getClass();
            throw e;
        }
    }

    public final Collection<InterfaceC1335610krP> LJIILIIL(Collection<InterfaceC1335610krP> collection) {
        this.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + LJIIZILJ;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC1335610krP interfaceC1335610krP : collection) {
            if (interfaceC1335610krP.getTimestamp() > jCurrentTimeMillis) {
                arrayList.add(interfaceC1335610krP);
            } else {
                arrayList2.add(interfaceC1335610krP);
            }
        }
        Collections.sort(arrayList2, this.LJIIIZ.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void LJIJ(double d) {
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    this.LJIIL.LIZLLL();
                    LJIILJJIL();
                    long jLIZIZ = this.LJIIL.LIZIZ();
                    LJIIL(jLIZIZ - ((long) (d * jLIZIZ)));
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1331440kkg interfaceC1331440kkg = this.LJIIJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trimBy: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    interfaceC1331440kkg.getClass();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1326920kdO
    public final InterfaceC1317730kOZ LJIIIIZZ(InterfaceC1324680kZm interfaceC1324680kZm, InterfaceC1327040kda interfaceC1327040kda) {
        String strLIZIZ;
        C1331240kkM c1331240kkMLIZ = C1331240kkM.LIZ();
        c1331240kkMLIZ.LIZ = interfaceC1324680kZm;
        this.LIZLLL.LIZJ(c1331240kkMLIZ);
        synchronized (this.LJIILJJIL) {
            try {
                try {
                    if (interfaceC1324680kZm instanceof C1296510jqL) {
                        strLIZIZ = C1296830jqr.LIZIZ(((C1296510jqL) interfaceC1324680kZm).LIZ.get(0));
                    } else {
                        strLIZIZ = C1296830jqr.LIZIZ(interfaceC1324680kZm);
                    }
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            try {
                InterfaceC1335640krS interfaceC1335640krSLJIIZILJ = LJIIZILJ(interfaceC1324680kZm, strLIZIZ);
                try {
                    C1335480krC c1335480krC = (C1335480krC) interfaceC1335640krSLJIIZILJ;
                    c1335480krC.LIZIZ(interfaceC1327040kda);
                    C1335740krc c1335740krcLJIIJJI = LJIIJJI(c1335480krC, interfaceC1324680kZm, strLIZIZ);
                    c1335740krcLJIIJJI.LIZ();
                    this.LJIIL.LIZIZ();
                    this.LIZLLL.LJI(c1331240kkMLIZ);
                    if (c1335480krC.LIZIZ.exists() && !c1335480krC.LIZIZ.delete()) {
                        C1328570kg3.LIZJ(LJIILLIIL, "Failed to delete temp file");
                    }
                    c1331240kkMLIZ.LIZIZ();
                    return c1335740krcLJIIJJI;
                } catch (Throwable th) {
                    C1335480krC c1335480krC2 = (C1335480krC) interfaceC1335640krSLJIIZILJ;
                    if (c1335480krC2.LIZIZ.exists() && !c1335480krC2.LIZIZ.delete()) {
                        C1328570kg3.LIZJ(LJIILLIIL, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c1331240kkMLIZ.LIZIZ();
                throw th2;
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LIZLLL.LIZIZ(c1331240kkMLIZ);
            C1328570kg3.LIZLLL(LJIILLIIL, "Failed inserting a file into the cache", e2);
            throw e2;
        }
    }

    public final void LJIILLIIL(String str, Collection<InterfaceC1335610krP> collection) throws IOException {
        Iterator<InterfaceC1335610krP> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().getId())) {
                return;
            }
        }
        try {
            this.LJIIIIZZ.LJIIIIZZ(str);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public final InterfaceC1335640krS LJIIZILJ(InterfaceC1324680kZm interfaceC1324680kZm, String str) {
        synchronized (this.LJIILJJIL) {
            try {
                boolean zLJIILJJIL = LJIILJJIL();
                LJIJJ();
                long jLIZIZ = this.LJIIL.LIZIZ();
                if (jLIZIZ > this.LIZJ && !zLJIILJJIL) {
                    this.LJIIL.LIZLLL();
                    LJIILJJIL();
                }
                long j = this.LIZJ;
                if (jLIZIZ > j) {
                    LJIIL((long) (j * (1.0f - this.LJIILL)));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJIIIIZZ.LJIIJ(interfaceC1324680kZm, str);
    }

    public final C1335740krc LJIIJJI(C1335480krC c1335480krC, InterfaceC1324680kZm interfaceC1324680kZm, String str) {
        C1335740krc c1335740krcLIZ;
        synchronized (this.LJIILJJIL) {
            try {
                c1335740krcLIZ = c1335480krC.LIZ();
                ((HashSet) this.LJ).add(str);
                this.LJIIL.LIZJ(c1335740krcLIZ.LIZ(), 1L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1335740krcLIZ;
    }

    public C1335440kr8(C1335450kr9 c1335450kr9, C1335620krQ c1335620krQ, C1330520kjC c1330520kjC, InterfaceC1335510krF interfaceC1335510krF, C1330900kjo c1330900kjo, Executor executor, float f) {
        C1335460krA c1335460krA;
        this.LIZ = c1330520kjC.LIZIZ;
        long j = c1330520kjC.LIZJ;
        this.LIZIZ = j;
        this.LIZJ = j;
        synchronized (C1335460krA.class) {
            if (C1335460krA.LJII == null) {
                C1335460krA.LJII = new C1335460krA();
            }
            c1335460krA = C1335460krA.LJII;
        }
        this.LJII = c1335460krA;
        this.LJIIIIZZ = c1335450kr9;
        this.LJIIIZ = c1335620krQ;
        this.LJFF = -1L;
        C1335500krE c1335500krE = new C1335500krE();
        this.LIZLLL = c1335500krE;
        ((CopyOnWriteArrayList) c1335500krE.LIZ).add(interfaceC1335510krF);
        this.LJI = c1330520kjC.LIZ;
        this.LJIIJ = c1330900kjo;
        this.LJIIL = new C1335530krH();
        this.LJIILIIL = C1335650krT.LIZ;
        this.LJIILL = f;
        this.LJIIJJI = false;
        this.LJ = new HashSet();
        new CountDownLatch(0);
    }
}
