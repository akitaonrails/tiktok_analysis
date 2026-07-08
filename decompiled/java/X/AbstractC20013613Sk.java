package X;

import Y.AComparatorS524S0100000_30;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20013613Sk implements C13UG {
    public final String LIZIZ;
    public final C20013713Sl LIZJ;
    public long LJ;
    public final String LIZ = "music";
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL = new ConcurrentHashMap<>();
    public final float LJFF = 0.5f;

    @Override // X.C13UG
    public final boolean LJI() {
        return true;
    }

    @Override // X.C13UG
    public final String LJII(String str) {
        return str;
    }

    @Override // X.C13UG
    public final void initialize() {
    }

    @Override // X.C13UG
    public final void LIZ() {
        this.LIZLLL.clear();
        this.LJ = 0L;
    }

    @Override // X.C13UG
    public final Pair<Integer, Long> LJIIJ() {
        return new Pair<>(0, 0L);
    }

    @Override // X.C13UG
    public final Map<String, String> LJIIJJI() {
        Set<String> setKeySet = this.LIZLLL.keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : setKeySet) {
            C0VSJ c0vsj = new C0VSJ(this.LIZIZ, str);
            if (c0vsj.exists() && (c0vsj.isFile() || c0vsj.isDirectory())) {
                arrayList.add(new Pair(str, c0vsj.getAbsolutePath()));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    @Override // X.C13UG
    public final void LJIIZILJ() {
        C0VSJ c0vsj = new C0VSJ(this.LIZIZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZLLL.clear();
        this.LJ = 0L;
        if (!c0vsj.isDirectory()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbstractFileScanDiskCache rescan skip: not directory ");
            sbLIZ.append(this.LIZ);
            C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() || file.isDirectory()) {
                    String name = file.getName();
                    C20014813Sw c20014813Sw = new C20014813Sw(name, this.LIZ);
                    c20014813Sw.LIZLLL = LJIJ(file);
                    c20014813Sw.LJ = file.lastModified();
                    c20014813Sw.LJFF = new LinkedHashSet().contains(name);
                    this.LIZLLL.put(name, c20014813Sw);
                    this.LJ += c20014813Sw.LIZLLL;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AbstractFileScanDiskCache rescan: ");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" entries=");
        sbLIZ2.append(this.LIZLLL.size());
        sbLIZ2.append(" size=");
        sbLIZ2.append(this.LJ);
        C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C13UG
    public final long LIZIZ() {
        if (!LJIILJJIL()) {
            return 0L;
        }
        LJIIZILJ();
        return ((Number) LJIJJ(this.LIZJ.LIZLLL).getSecond()).longValue();
    }

    @Override // X.C13UG
    public final boolean LJIILJJIL() {
        return LJ().LIZ;
    }

    @Override // X.C13UG
    public final ConcurrentHashMap<String, C20014813Sw> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.C13UG
    public final C20013713Sl LJ() {
        return this.LIZJ;
    }

    @Override // X.C13UG
    public final String LJIIL() {
        return this.LIZIZ;
    }

    @Override // X.C13UG
    public final String LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.C13UG
    public final long getSize() {
        return this.LJ;
    }

    public static long LJIJ(File file) {
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        return C2260008tK.LJII(file.getAbsolutePath());
    }

    @Override // X.C13UG
    public final C0VSJ LIZJ(String str) {
        return new C0VSJ(this.LIZIZ, str);
    }

    @Override // X.C13UG
    public final long LJFF(int i) {
        Pair pair;
        if (!LJIILJJIL()) {
            return 0L;
        }
        LJIIZILJ();
        C20013713Sl c20013713Sl = this.LIZJ;
        if (c20013713Sl.LIZIZ) {
            return ((Number) LJIJI(c20013713Sl.LIZJ).getSecond()).longValue();
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    pair = new Pair(0L, 0L);
                } else {
                    pair = new Pair(Long.valueOf(c20013713Sl.LJ), Long.valueOf(this.LIZJ.LJI));
                }
            } else {
                pair = new Pair(Long.valueOf(c20013713Sl.LJ), Long.valueOf(this.LIZJ.LJFF));
            }
        } else {
            pair = new Pair(Long.valueOf(c20013713Sl.LJ), Long.valueOf(this.LIZJ.LIZJ));
        }
        long jLongValue = ((Number) pair.getFirst()).longValue();
        return ((Number) LJIJI(((Number) pair.getSecond()).longValue()).getSecond()).longValue() + ((Number) LJIJJ(jLongValue).getSecond()).longValue();
    }

    @Override // X.C13UG
    public final void LJIIIIZZ(C20014813Sw c20014813Sw) {
        C0VSJ c0vsj = new C0VSJ(this.LIZIZ, c20014813Sw.LIZ);
        if (!c0vsj.exists()) {
            return;
        }
        if (!c0vsj.setLastModified(System.currentTimeMillis())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbstractFileScanDiskCache markUsed setLastModified failed key=");
            sbLIZ.append(c20014813Sw.LIZ);
            C13UA.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C20014813Sw c20014813Sw2 = this.LIZLLL.get(c20014813Sw.LIZ);
        if (c20014813Sw2 != null) {
            c20014813Sw2.LJ = c0vsj.lastModified();
        }
    }

    @Override // X.C13UG
    public final void LJIIIZ(List<String> list) {
        new LinkedHashSet().addAll(list);
        for (C20014813Sw c20014813Sw : this.LIZLLL.values()) {
            c20014813Sw.LJFF = new LinkedHashSet().contains(c20014813Sw.LIZ);
        }
    }

    @Override // X.C13UG
    public final boolean LJIILL(C20014813Sw c20014813Sw) {
        C0VSJ c0vsj = new C0VSJ(this.LIZIZ, c20014813Sw.LIZ);
        C20014813Sw c20014813Sw2 = this.LIZLLL.get(c20014813Sw.LIZ);
        if (c20014813Sw2 != null) {
            this.LJ -= c20014813Sw2.LIZLLL;
        }
        c20014813Sw.LIZLLL = LJIJ(c0vsj);
        c20014813Sw.LJ = c0vsj.lastModified();
        c20014813Sw.LJFF = new LinkedHashSet().contains(c20014813Sw.LIZ);
        this.LIZLLL.put(c20014813Sw.LIZ, c20014813Sw);
        this.LJ += c20014813Sw.LIZLLL;
        return true;
    }

    public final Pair LJIJI(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        long j2 = 0;
        for (String str : C13LP.LLIIII(this.LIZLLL.keySet())) {
            C20014813Sw c20014813Sw = this.LIZLLL.get(str);
            if (c20014813Sw != null && jCurrentTimeMillis - c20014813Sw.LJ > j && !c20014813Sw.LJFF) {
                long jLongValue = LJIILLIIL(str, false).getSecond().longValue();
                if (jLongValue > 0) {
                    i++;
                    j2 += jLongValue;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Long.valueOf(j2));
    }

    public final Pair LJIJJ(long j) {
        if (this.LJ <= j) {
            return new Pair(0, 0L);
        }
        long j2 = (long) (j * this.LJFF);
        int i = 0;
        long j3 = 0;
        for (String str : C13LP.LJLLLL(new AComparatorS524S0100000_30(this, 4), this.LIZLLL.keySet())) {
            C20014813Sw c20014813Sw = this.LIZLLL.get(str);
            if (c20014813Sw != null && !c20014813Sw.LJFF) {
                long jLongValue = LJIILLIIL(str, false).getSecond().longValue();
                if (jLongValue > 0) {
                    i++;
                    j3 += jLongValue;
                }
                if (this.LJ <= j2) {
                    break;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Long.valueOf(j3));
    }

    public AbstractC20013613Sk(String str, C20013713Sl c20013713Sl) {
        this.LIZIZ = str;
        this.LIZJ = c20013713Sl;
    }

    @Override // X.C13UG
    public final Pair<Boolean, Long> LJIILLIIL(String str, boolean z) {
        C20014813Sw c20014813Sw = this.LIZLLL.get(str);
        if (c20014813Sw == null) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        if (c20014813Sw.LJFF && !z) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        C0VSJ c0vsj = new C0VSJ(this.LIZIZ, str);
        if (c0vsj.exists() && !C08QA.LJIIZILJ(c0vsj)) {
            return new Pair<>(Boolean.FALSE, 0L);
        }
        this.LIZLLL.remove(str);
        long j = this.LJ;
        long j2 = c20014813Sw.LIZLLL;
        this.LJ = j - j2;
        return new Pair<>(Boolean.TRUE, Long.valueOf(j2));
    }
}
