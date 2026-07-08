package X;

import Y.ARunnableS130S0100000_30;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13T3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13T3 implements C13UG {
    public final C13U8 LIZ;
    public long LIZLLL;
    public int LJFF;
    public AnonymousClass0956 LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public final ConcurrentHashMap<String, C20014813Sw> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final Charset LJ = Charsets.UTF_8;
    public final ReentrantReadWriteLock.WriteLock LJI = new ReentrantReadWriteLock().writeLock();
    public final C054G LJII = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final ARunnableS130S0100000_30 LJIIJ = new ARunnableS130S0100000_30(this, 25);
    public final ConcurrentLinkedQueue<String> LJIIJJI = new ConcurrentLinkedQueue<>();
    public final ARunnableS130S0100000_30 LJIIL = new ARunnableS130S0100000_30(this, 26);

    @Override // X.C13UG
    public final void LIZ() {
    }

    @Override // X.C13UG
    public final long LIZIZ() {
        return 0L;
    }

    @Override // X.C13UG
    public final long LJFF(int i) {
        return 0L;
    }

    @Override // X.C13UG
    public final boolean LJI() {
        return false;
    }

    @Override // X.C13UG
    public final String LJII(String str) {
        return str;
    }

    @Override // X.C13UG
    public abstract String LJIIL();

    @Override // X.C13UG
    public abstract String LJIILIIL();

    @Override // X.C13UG
    public final void LJIIZILJ() {
    }

    public boolean LJIJJ() {
        return false;
    }

    public boolean LJIJJLI(String str) {
        return false;
    }

    public void LJJIIJ(List<String> list) {
    }

    @Override // X.C13UG
    public final C20013713Sl LJ() {
        return new C20013713Sl(0);
    }

    @Override // X.C13UG
    public Pair<Integer, Long> LJIIJ() {
        File[] fileArrListFiles;
        Set<String> setKeySet = this.LIZIZ.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZJ((String) it2.next()).getAbsolutePath());
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
        C0VSJ c0vsj = new C0VSJ(LJIIL());
        int i = 0;
        long jLIZ = 0;
        if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            int i2 = 0;
            for (File file : fileArrListFiles) {
                String absolutePath = file.getAbsolutePath();
                if (!C093Y.LIZJ(new C0VSJ(LJIIL(), "journal").getAbsolutePath(), new C0VSJ(LJIIL(), "journal.bkp").getAbsolutePath(), new C0VSJ(LJIIL(), "algorithm").getAbsolutePath()).contains(absolutePath) && !hashSetLLIFFJFJJ.contains(absolutePath)) {
                    jLIZ += C1876910ywT.LIZ(file);
                    i2++;
                    C08QA.LJIIZILJ(file);
                }
            }
            i = i2;
        }
        return new Pair<>(Integer.valueOf(i), Long.valueOf(jLIZ));
    }

    public Collection<C20014813Sw> LJJI() {
        return this.LIZIZ.values();
    }

    @Override // X.C13UG
    public void initialize() {
        C1876910ywT.LIZJ(this.LJI, new AwS574S0100000_30(this, 295), new AwS609S0100000_30(this, 127));
    }

    @Override // X.C13UG
    public final boolean LJIILJJIL() {
        return LJ().LIZ;
    }

    @Override // X.C13UG
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.C13UG
    public final Map<String, String> LJIIJJI() {
        return this.LIZJ;
    }

    public C13U8 LJIJ() {
        return this.LIZ;
    }

    public Charset LJIJI() {
        return this.LJ;
    }

    @Override // X.C13UG
    public final long getSize() {
        return this.LIZLLL;
    }

    public C13T3(C13U8 c13u8) {
        this.LIZ = c13u8;
    }

    @Override // X.C13UG
    public final C0VSJ LIZJ(String str) {
        return new C0VSJ(LJIIL(), str);
    }

    @Override // X.C13UG
    public void LJIIIIZZ(C20014813Sw c20014813Sw) {
        LJJIFFI(c20014813Sw, c20014813Sw.LJ);
    }

    @Override // X.C13UG
    public final void LJIIIZ(List<String> list) {
        new LinkedHashSet().addAll(list);
    }

    @Override // X.C13UG
    public boolean LJIILL(C20014813Sw c20014813Sw) {
        long j;
        C0VSJ c0vsjLIZJ = LIZJ(c20014813Sw.LIZ);
        if (c0vsjLIZJ.exists()) {
            C20014813Sw c20014813Sw2 = this.LIZIZ.get(c20014813Sw.LIZ);
            if (c20014813Sw2 != null) {
                j = c20014813Sw2.LJ;
                this.LIZLLL -= c20014813Sw2.LIZLLL;
                this.LIZIZ.remove(c20014813Sw.LIZ);
            } else {
                j = 0;
            }
            if (c20014813Sw.LIZLLL <= 0) {
                c20014813Sw.LIZLLL = C2260008tK.LJII(c0vsjLIZJ.getAbsolutePath());
            }
            c20014813Sw.LJ = System.currentTimeMillis();
            this.LIZIZ.put(c20014813Sw.LIZ, c20014813Sw);
            this.LIZLLL += c20014813Sw.LIZLLL;
            LJJIFFI(c20014813Sw, j);
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsDiskPut failed: customDiskName: ");
        sbLIZ.append(LJIILIIL());
        sbLIZ.append(", cacheFile not exists. cacheFile: ");
        sbLIZ.append(c0vsjLIZJ.getAbsolutePath());
        C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean LJIL(List<String> list) {
        return C1876910ywT.LIZIZ(list);
    }

    public void LJJII(List<String> list) {
        Object c098200Yq;
        try {
            if (!Intrinsics.LJFF(EnumC1876880ywQ.PUT.getOperators(), list.get(0)) && !Intrinsics.LJFF(EnumC1876880ywQ.USED.getOperators(), list.get(0))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ToolsDiskInitialize failed: customDiskName: ");
                sbLIZ.append(LJIILIIL());
                sbLIZ.append(", failed line: ");
                sbLIZ.append(list);
                C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                int i = this.LJFF;
                this.LJFF = i + 1;
                c098200Yq = Integer.valueOf(i);
            } else {
                String str = list.get(1);
                C20014813Sw c20014813Sw = this.LIZIZ.get(str);
                if (c20014813Sw != null) {
                    this.LIZLLL -= c20014813Sw.LIZLLL;
                } else {
                    c20014813Sw = new C20014813Sw(str, LJIILIIL());
                }
                long j = c20014813Sw.LJ;
                long j2 = CastLongProtector.parseLong(list.get(2));
                if (j < j2) {
                    j = j2;
                }
                c20014813Sw.LJ = j;
                if (LIZJ(str).exists()) {
                    c20014813Sw.LIZLLL = CastLongProtector.parseLong(list.get(3));
                    this.LIZIZ.put(str, c20014813Sw);
                    this.LIZLLL += c20014813Sw.LIZLLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ToolsDiskInitialize customDiskName: ");
                    sbLIZ2.append(LJIILIIL());
                    sbLIZ2.append(", readLine Success : ");
                    sbLIZ2.append(c20014813Sw.LIZ);
                    C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    c098200Yq = Unit.LIZ;
                } else {
                    this.LIZIZ.remove(str);
                    int i2 = this.LJFF;
                    this.LJFF = i2 + 1;
                    c098200Yq = Integer.valueOf(i2);
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LJFF++;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ToolsDiskInitialize failed: customDiskName: ");
            sbLIZ3.append(LJIILIIL());
            sbLIZ3.append(", failed line: ");
            sbLIZ3.append(list);
            sbLIZ3.append(", e: ");
            sbLIZ3.append(thM5exceptionOrNullimpl);
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public void LJJIII(List<String> list) {
        this.LJFF++;
    }

    public Pair<Boolean, Long> LJJIIJZLJL(C20014813Sw c20014813Sw) {
        if (this.LIZIZ.get(c20014813Sw.LIZ) != null) {
            this.LIZIZ.remove(c20014813Sw.LIZ);
            this.LIZLLL -= c20014813Sw.LIZLLL;
        }
        C0VSJ c0vsjLIZJ = LIZJ(c20014813Sw.LIZ);
        if (c0vsjLIZJ.exists()) {
            C08QA.LJIIZILJ(c0vsjLIZJ);
            this.LJFF++;
            C23250099c.LIZLLL(this.LJII, null, null, new C863100XtU(this, null), 3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ToolsDiskRemove delete file success: ");
            sbLIZ.append(c0vsjLIZJ.getAbsolutePath());
            sbLIZ.append(", type : ");
            sbLIZ.append(c20014813Sw.LIZJ);
            C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return new Pair<>(Boolean.TRUE, Long.valueOf(c20014813Sw.LIZLLL));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ToolsDiskRemove failed: file not exists. cacheFile: ");
        sbLIZ2.append(c0vsjLIZJ.getAbsolutePath());
        C13UA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return new Pair<>(Boolean.TRUE, 0L);
    }

    @Override // X.C13UG
    public final Pair<Boolean, Long> LJIILLIIL(String str, boolean z) {
        C20014813Sw c20014813Sw = this.LIZIZ.get(str);
        if (c20014813Sw == null) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        if (!z && (LJIJJ() || LJIJJLI(str) || new LinkedHashSet().contains(str))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ToolsDiskRemove : allow list: customDiskName: ");
            sbLIZ.append(LJIILIIL());
            sbLIZ.append(", type: ");
            sbLIZ.append(c20014813Sw.LIZJ);
            sbLIZ.append(", key: ");
            sbLIZ.append(str);
            C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return new Pair<>(Boolean.FALSE, 0L);
        }
        return LJJIIJZLJL(c20014813Sw);
    }

    public String LJJ(EnumC1876880ywQ enumC1876880ywQ, C20014813Sw c20014813Sw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1876880ywQ.getOperators());
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LJ);
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJIFFI(C20014813Sw c20014813Sw, long j) {
        if (System.currentTimeMillis() - j < LJIJ().LJIIJ) {
            C13UA.LIZ("ToolsDiskMarkUsed timeInterval < cacheConfig.markUsedTimeInterval");
        } else {
            this.LJIIJJI.add(LJJ(EnumC1876880ywQ.USED, c20014813Sw));
            C23250099c.LIZLLL(this.LJII, null, null, new C863130XtX(this, null), 3);
        }
    }
}
