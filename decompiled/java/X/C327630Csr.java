package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Csr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327630Csr implements Comparable<Object> {
    public long LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final long LLIZ;
    public float LLJ;
    public long LLJI;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C327630Csr LLJJ;
    public final ArrayList<C327670Csv> LLIZLLLIL = new ArrayList<>();
    public String LLJIJIL = "";
    public final List<Long> LLJILLL = new ArrayList();

    public final void LJFF() {
        if (this.LLIZLLLIL.isEmpty()) {
            return;
        }
        long size = this.LLJI / ((long) this.LLIZLLLIL.size());
        long j = this.LL;
        for (C327670Csv c327670Csv : this.LLIZLLLIL) {
            c327670Csv.LIZIZ = j;
            c327670Csv.LJI = size;
            j += size;
        }
    }

    public final void LIZJ(C327670Csv c327670Csv) {
        this.LLIZLLLIL.add(c327670Csv);
        this.LLJ += c327670Csv.LJ;
        this.LLJI += c327670Csv.LJI;
        c327670Csv.LIZLLL = this.LLJIJIL.length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(c327670Csv.LIZ);
        this.LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
        c327670Csv.LIZJ = c327670Csv.LIZLLL + c327670Csv.LIZ.length();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj != null && (obj instanceof C327630Csr)) {
            return 0;
        }
        return -1;
    }

    public C327630Csr(long j, long j2, long j3, boolean z, long j4, long j5, long j6) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = z;
        this.LLILZIL = j4;
        this.LLILZLL = j5;
        this.LLIZ = j6;
    }
}
