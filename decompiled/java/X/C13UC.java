package X;

import Y.AComparatorS524S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13UC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UC implements C13S6 {
    public static final C13U9 LJIIJJI = new C13U9();
    public static volatile C13UC LJIIL;
    public final C13U8 LIZ;
    public final HashMap<String, C13UG> LIZIZ;
    public final float LIZJ;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public final ExecutorService LJII;
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL = new ConcurrentHashMap<>();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS130S0100000_30 LJIIJ = new ARunnableS130S0100000_30(this, 36);

    @Override // X.C13S6
    public final void LIZ() {
        for (Map.Entry<String, C20014813Sw> entry : this.LIZLLL.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().LIZIZ, "effect")) {
                this.LIZLLL.remove(entry.getKey());
                this.LJ -= entry.getValue().LIZLLL;
                if (entry.getValue().LJFF) {
                    this.LJFF -= entry.getValue().LIZLLL;
                }
            }
        }
        C13UG c13ug = this.LIZIZ.get("effect");
        if (c13ug != null) {
            c13ug.LIZ();
        }
    }

    @Override // X.C13S6
    public final void LIZIZ() {
        if (!this.LJIIIIZZ.compareAndSet(false, true)) {
            C13UB c13ub = C13UA.LIZ;
            if (c13ub != null) {
                c13ub.w("ToolsDiskClean cleanupInUse skipped: another disk cleanup is running");
                return;
            }
            return;
        }
        try {
            C13UD c13ud = new C13UD(4);
            c13ud.LJFF = this.LJ;
            c13ud.LJIIIIZZ = LJIIZILJ();
            LJIJI();
            c13ud.LIZJ = LJIL(this.LIZ.LJ, false);
            Collection<C13UG> collectionValues = this.LIZIZ.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (((C13UG) obj).LJIILJJIL()) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C13UG) it2.next()).LIZIZ();
            }
            LJIILLIIL(c13ud);
            c13ud.LJIIJJI = System.currentTimeMillis() - c13ud.LJIIL;
            C13UO c13uo = this.LIZ.LJIIIZ;
            if (c13uo != null) {
                c13uo.LIZ(c13ud);
            }
            C13UA.LIZ("ToolsDiskClean cleanupInUse success: " + c13ud);
            this.LJIIIIZZ.set(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIIIZZ.set(false);
            throw th;
        }
    }

    @Override // X.C13S6
    public final long LIZJ() {
        return LJIILL(this, 1, this.LIZ.LJI, true);
    }

    @Override // X.C13S6
    public final long LIZLLL() {
        return LJIILL(this, 0, this.LIZ.LJFF, false);
    }

    @Override // X.C13S6
    public final long LJ() {
        return LJIILL(this, 2, this.LIZ.LJII, true);
    }

    @Override // X.C13S6
    public final Map LJIILJJIL() {
        Object c098200Yq;
        try {
            C13UG c13ug = this.LIZIZ.get("music");
            c098200Yq = c13ug != null ? c13ug.LJIIJJI() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIdToPathCacheMap error, please check diskName: ");
            sbLIZ.append("music");
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        return (Map) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final HashMap<String, Long> LJIIZILJ() {
        HashMap<String, Long> map = new HashMap<>();
        for (Map.Entry<String, C13UG> entry : this.LIZIZ.entrySet()) {
            map.put(entry.getKey(), Long.valueOf(entry.getValue().getSize()));
        }
        return map;
    }

    public final void LJIJI() {
        Collection<C13UG> collectionValues = this.LIZIZ.values();
        ArrayList<C13UG> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C13UG) obj).LJI()) {
                arrayList.add(obj);
            }
        }
        for (C13UG c13ug : arrayList) {
            if (!c13ug.LJIILJJIL()) {
                String strLJIILIIL = c13ug.LJIILIIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ToolsDiskClean refreshExternalSources: ");
                sbLIZ.append(strLJIILIIL);
                C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                Set<String> setKeySet = this.LIZLLL.keySet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setKeySet) {
                    C20014813Sw c20014813Sw = this.LIZLLL.get(obj2);
                    if (Intrinsics.LJFF(c20014813Sw != null ? c20014813Sw.LIZIZ : null, strLJIILIIL)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C20014813Sw c20014813SwRemove = this.LIZLLL.remove(it2.next());
                    if (c20014813SwRemove != null) {
                        this.LJ -= c20014813SwRemove.LIZLLL;
                        if (c20014813SwRemove.LJFF) {
                            this.LJFF -= c20014813SwRemove.LIZLLL;
                        }
                    }
                }
                c13ug.LJIIZILJ();
                for (C20014813Sw c20014813Sw2 : c13ug.LIZLLL().values()) {
                    if (!this.LIZLLL.containsKey(c20014813Sw2.LIZ)) {
                        this.LIZLLL.put(c20014813Sw2.LIZ, c20014813Sw2);
                        this.LJ += c20014813Sw2.LIZLLL;
                        if (c20014813Sw2.LJFF) {
                            this.LJFF += c20014813Sw2.LIZLLL;
                        }
                    }
                }
                C13UA.LIZ("ToolsDiskClean refreshExternalSources done: " + strLJIILIIL + ", size=" + this.LJ);
            }
        }
    }

    public final Pair<Integer, Long> LJIJJLI() {
        long jLongValue = 0;
        int iIntValue = 0;
        if (!this.LIZ.LJIIL) {
            return new Pair<>(0, 0L);
        }
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            Pair<Integer, Long> pairLJIIJ = ((C13UG) it2.next()).LJIIJ();
            iIntValue += pairLJIIJ.getFirst().intValue();
            jLongValue += pairLJIIJ.getSecond().longValue();
        }
        return new Pair<>(Integer.valueOf(iIntValue), Long.valueOf(jLongValue));
    }

    @Override // X.C13S6
    public final String LJIIIIZZ(String str) {
        Object next;
        String strLJIILIIL;
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(new C0VSJ(((C13UG) next).LJIIL()).getAbsolutePath(), new C0VSJ(str).getAbsolutePath()));
        C13UG c13ug = (C13UG) next;
        if (c13ug == null || (strLJIILIIL = c13ug.LJIILIIL()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCustomDiskKey fail: path: ");
            sbLIZ.append(str);
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
        return strLJIILIIL;
    }

    @Override // X.C13S6
    public final Set<String> LJIIJ(String str) {
        Object c098200Yq;
        ConcurrentHashMap<String, C20014813Sw> concurrentHashMapLIZLLL;
        Set<String> setKeySet;
        try {
            C13UG c13ug = this.LIZIZ.get(str);
            if (c13ug == null || (concurrentHashMapLIZLLL = c13ug.LIZLLL()) == null || (setKeySet = concurrentHashMapLIZLLL.keySet()) == null || (c098200Yq = C13LP.LLIIJI(setKeySet)) == null) {
                c098200Yq = C08CX.INSTANCE;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAllCustomCacheKeys failed for customDiskName: ");
            sbLIZ.append(str);
            sbLIZ.append(" e -> ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Set<String> set = (Set) c098200Yq;
        if (set == null) {
            return C08CX.INSTANCE;
        }
        return set;
    }

    public final void LJIILLIIL(C13UD c13ud) {
        long jLongValue;
        c13ud.LJI = this.LJ;
        HashMap<String, Long> mapLJIIZILJ = LJIIZILJ();
        c13ud.LJIIIZ = mapLJIIZILJ;
        c13ud.LJII = C13LP.LJZL(mapLJIIZILJ.values());
        HashMap<String, Long> map = new HashMap<>();
        for (Map.Entry<String, Long> entry : c13ud.LJIIIIZZ.entrySet()) {
            String key = entry.getKey();
            long jLongValue2 = entry.getValue().longValue();
            Long l = c13ud.LJIIIZ.get(key);
            long j = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j2 = jLongValue2 - jLongValue;
            if (j2 >= 0) {
                j = j2;
            }
            map.put(key, Long.valueOf(j));
        }
        c13ud.LJIIJ = map;
    }

    public C13UC(C13U8 c13u8, HashMap map) {
        this.LIZ = c13u8;
        this.LIZIZ = map;
        this.LIZJ = c13u8.LIZIZ;
        this.LJII = c13u8.LIZJ;
    }

    @Override // X.C13S6
    public final boolean LJFF(String str, String str2) {
        C13UG c13ug = this.LIZIZ.get(str2);
        if (c13ug != null && c13ug.LJIILJJIL()) {
            return c13ug.LIZLLL().containsKey(str);
        }
        return this.LIZLLL.containsKey(LJIJ(str2, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // X.C13S6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LJII(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r2 = 0
            java.util.HashMap<java.lang.String, X.13UG> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1d
            X.13UG r0 = (X.C13UG) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            X.0VSJ r1 = r0.LIZJ(r4)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
        L17:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1d
            goto L29
        L1b:
            r1 = r2
            goto L17
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L29:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L30
            r2 = r1
        L30:
            java.io.File r2 = (java.io.File) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13UC.LJII(java.lang.String, java.lang.String):java.io.File");
    }

    @Override // X.C13S6
    public final void LJIIIZ(String str, Regex regex) {
        C13UG c13ug = this.LIZIZ.get(str);
        if (c13ug != null && this.LJI) {
            for (String str2 : new ArrayList(c13ug.LIZLLL().keySet())) {
                if (regex.matches(str2)) {
                    LJIJJ(LJIJ(str, str2), true);
                }
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsDiskRemovePattern failed: customDiskName ");
        sbLIZ.append(str);
        sbLIZ.append(" not found");
        C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C13S6
    public final Pair<Integer, Long> LJIIL(long j, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsDiskClean removeUnused start: ");
        sbLIZ.append(j);
        sbLIZ.append(" removeAllowList: ");
        sbLIZ.append(z);
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL.keySet());
        Iterator it2 = arrayList.iterator();
        int i = 0;
        long jLongValue = 0;
        while (it2.hasNext()) {
            C20014813Sw c20014813Sw = this.LIZLLL.get(it2.next());
            if (c20014813Sw != null && System.currentTimeMillis() - c20014813Sw.LJ > j) {
                Pair<Boolean, Long> pairLJIJJ = LJIJJ(c20014813Sw.LIZ, z);
                if (pairLJIJJ.getFirst().booleanValue()) {
                    jLongValue += pairLJIJJ.getSecond().longValue();
                    i++;
                }
            }
        }
        return new Pair<>(Integer.valueOf(i), Long.valueOf(jLongValue));
    }

    @Override // X.C13S6
    public final void LJIILIIL(String str, List<String> list) {
        C13UG c13ug = this.LIZIZ.get(str);
        if (c13ug != null) {
            c13ug.LJIIIZ(list);
        }
    }

    public final String LJIJ(String str, String str2) {
        String strLJII;
        C13UG c13ug = this.LIZIZ.get(str);
        if (c13ug != null && (strLJII = c13ug.LJII(str2)) != null) {
            return strLJII;
        }
        return str2;
    }

    public final Pair<Boolean, Long> LJIJJ(String str, boolean z) {
        Pair<Boolean, Long> pairLJIILLIIL;
        C20014813Sw c20014813Sw = this.LIZLLL.get(str);
        if (c20014813Sw == null) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        C13UG c13ug = this.LIZIZ.get(c20014813Sw.LIZIZ);
        if (c13ug != null && (pairLJIILLIIL = c13ug.LJIILLIIL(c20014813Sw.LIZ, z)) != null) {
            if (pairLJIILLIIL.getFirst().booleanValue()) {
                this.LJ -= c20014813Sw.LIZLLL;
                if (c20014813Sw.LJFF) {
                    this.LJFF -= c20014813Sw.LIZLLL;
                }
                this.LIZLLL.remove(str);
                if (pairLJIILLIIL != null) {
                    return pairLJIILLIIL;
                }
            } else {
                return pairLJIILLIIL;
            }
        }
        return new Pair<>(Boolean.FALSE, 0L);
    }

    public final Pair LJIL(long j, boolean z) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsDiskClean trimToSize start, enable: ");
        int i = 0;
        if (this.LJ > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(". size: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(". threshold: ");
        sbLIZ.append(j);
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        long jLongValue = 0;
        if (this.LJ <= j) {
            C13UA.LIZ("ToolsDiskClean trimToSize enable: false");
            return new Pair(0, 0L);
        }
        long j2 = (long) (j * this.LIZJ);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL.keySet());
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS524S0100000_30(this, 5));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair<Boolean, Long> pairLJIJJ = LJIJJ((String) it2.next(), z);
            if (pairLJIJJ.getFirst().booleanValue()) {
                jLongValue += pairLJIJJ.getSecond().longValue();
                i++;
            }
            if (this.LJ <= j2) {
                break;
            }
        }
        return new Pair(Integer.valueOf(i), Long.valueOf(jLongValue));
    }

    @Override // X.C13S6
    public final void remove(String str, String str2) {
        C0VSJ c0vsjLIZJ;
        C13UG c13ug = this.LIZIZ.get(str2);
        if (c13ug != null && c13ug.LJIILJJIL()) {
            c13ug.LJIILLIIL(str, true);
            return;
        }
        String strLJIJ = LJIJ(str2, str);
        if (!this.LJI && this.LIZLLL.get(strLJIJ) == null) {
            C13UA.LIZ("ToolsDiskRemove removeSuc: !initialized only remove file");
            if (c13ug != null && (c0vsjLIZJ = c13ug.LIZJ(str)) != null && c0vsjLIZJ.exists()) {
                C08QA.LJIIZILJ(c0vsjLIZJ);
                return;
            }
            return;
        }
        LJIJJ(strLJIJ, true);
    }

    @Override // X.C13S6
    public final void LJI(String str, String str2, String str3) {
        C0VSJ c0vsjLIZJ;
        String strLJIJ = LJIJ(str2, str);
        if (this.LIZLLL.containsKey(strLJIJ)) {
            C20014813Sw c20014813Sw = this.LIZLLL.get(strLJIJ);
            if (c20014813Sw != null) {
                c20014813Sw.LJ = System.currentTimeMillis();
                C13UG c13ug = this.LIZIZ.get(c20014813Sw.LIZIZ);
                if (c13ug != null) {
                    c13ug.LJIIIIZZ(c20014813Sw);
                    return;
                }
                return;
            }
            return;
        }
        C13UG c13ug2 = this.LIZIZ.get(str2);
        if (c13ug2 == null || (c0vsjLIZJ = c13ug2.LIZJ(str)) == null || !c0vsjLIZJ.exists()) {
            return;
        }
        LJIIJJI(str2, str, str3, null);
    }

    public static long LJIILL(C13UC c13uc, int i, long j, boolean z) {
        if (!c13uc.LJIIIIZZ.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ToolsDiskClean autoCleaning skipped (cleanType=");
            sbLIZ.append(i);
            sbLIZ.append("): another disk cleanup is running");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13UB c13ub = C13UA.LIZ;
            if (c13ub != null) {
                c13ub.w(strLIZIZ);
                return 0L;
            }
            return 0L;
        }
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ToolsDiskClean autoCleaning start, cleanType: ");
            sbLIZ2.append(i);
            C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c13uc.LJIJI();
            C13UD c13ud = new C13UD(i);
            c13ud.LJFF = c13uc.LJ;
            c13ud.LJIIIIZZ = c13uc.LJIIZILJ();
            c13ud.LIZIZ = c13uc.LJIIL(j, z);
            c13ud.LIZJ = c13uc.LJIL(c13uc.LIZ.LJ, z);
            c13ud.LIZLLL = c13uc.LJIJJLI();
            Collection<C13UG> collectionValues = c13uc.LIZIZ.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (((C13UG) obj).LJIILJJIL()) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C13UG) it2.next()).LJFF(i);
            }
            c13uc.LJIILLIIL(c13ud);
            c13ud.LJIIJJI = System.currentTimeMillis() - c13ud.LJIIL;
            C13UO c13uo = c13uc.LIZ.LJIIIZ;
            if (c13uo != null) {
                c13uo.LIZ(c13ud);
            }
            C13UA.LIZ("ToolsDiskClean autoCleaning success: " + c13ud);
            long jLongValue = c13ud.LIZ().getSecond().longValue();
            c13uc.LJIIIIZZ.set(false);
            return jLongValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13uc.LJIIIIZZ.set(false);
            throw th;
        }
    }

    @Override // X.C13S6
    public final void LJIIJJI(String str, String str2, String str3, HashMap<String, Object> map) {
        if (a0.LJJJIL(str3)) {
            str3 = str;
        }
        C20014813Sw c20014813Sw = new C20014813Sw(str2, str, str3);
        c20014813Sw.LJI = map;
        C13UG c13ug = this.LIZIZ.get(str);
        if (c13ug != null && c13ug.LJIILL(c20014813Sw) && !c13ug.LJIILJJIL()) {
            String strLJII = c13ug.LJII(str2);
            C20014813Sw c20014813Sw2 = this.LIZLLL.get(strLJII);
            if (c20014813Sw2 != null) {
                this.LJ -= c20014813Sw2.LIZLLL;
                if (c20014813Sw2.LJFF) {
                    this.LJFF -= c20014813Sw2.LIZLLL;
                }
            }
            this.LIZLLL.put(strLJII, c20014813Sw);
            this.LJ += c20014813Sw.LIZLLL;
            if (c20014813Sw.LJFF) {
                this.LJFF += c20014813Sw.LIZLLL;
            }
            if (this.LIZ.LIZLLL) {
                this.LJIIIZ.removeCallbacks(this.LJIIJ);
                C786410Ut5.LJLIIL(10000L, this.LJIIIZ, this.LJIIJ);
            }
        }
    }
}
