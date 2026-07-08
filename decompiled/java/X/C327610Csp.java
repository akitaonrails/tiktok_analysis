package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Csp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327610Csp {
    public final C1085640eME<C327610Csp> LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public C327670Csv LJI;
    public C327670Csv LJII;
    public int LJFF = -1;
    public boolean LJIIIIZZ = true;
    public volatile CopyOnWriteArrayList<C327630Csr> LJIIIZ = new CopyOnWriteArrayList<>();

    public final String LIZIZ() {
        StringBuilder sb = new StringBuilder();
        Iterator<C327630Csr> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().LLJIJIL);
        }
        return sb.toString();
    }

    public C327610Csp(C1085640eME<C327610Csp> c1085640eME) {
        this.LIZ = c1085640eME;
    }

    public final void LIZJ(long j) {
        this.LIZLLL = j;
        if (this.LIZIZ == 0) {
            this.LIZIZ = j;
        }
        long j2 = this.LIZJ;
        if (j < j2) {
            this.LJII = null;
            this.LJFF = -1;
            if ((!this.LJIIIZ.isEmpty()) && (!((C327630Csr) C13LP.LJJJJZI(this.LJIIIZ)).LLIZLLLIL.isEmpty())) {
                this.LJI = (C327670Csv) C13LP.LJJJJZI(((C327630Csr) C13LP.LJJJJZI(this.LJIIIZ)).LLIZLLLIL);
                return;
            }
            return;
        }
        long j3 = j2 + this.LJ;
        int length = 0;
        if (j >= j3) {
            this.LJII = (C327670Csv) C13LP.LJJLIIIJJI(((C327630Csr) C13LP.LJJLIIIJJI(this.LJIIIZ)).LLIZLLLIL);
            this.LJI = null;
            Iterator<C327630Csr> it2 = this.LJIIIZ.iterator();
            while (it2.hasNext()) {
                length += it2.next().LLJIJIL.length();
                this.LJFF = length;
            }
            return;
        }
        int length2 = 0;
        for (C327630Csr c327630Csr : this.LJIIIZ) {
            int i = length + 1;
            if (length >= 0) {
                C327630Csr c327630Csr2 = c327630Csr;
                long j4 = this.LIZLLL;
                long j5 = c327630Csr2.LL;
                if (j4 >= j5) {
                    if (j4 <= j5 + c327630Csr2.LLJI) {
                        for (C327670Csv c327670Csv : c327630Csr2.LLIZLLLIL) {
                            if (c327670Csv.LIZIZ <= this.LIZLLL) {
                                this.LJII = c327670Csv;
                                this.LJFF = c327670Csv.LIZJ + length2;
                                this.LJI = null;
                            } else {
                                this.LJI = c327670Csv;
                                return;
                            }
                        }
                    } else {
                        length2 += c327630Csr2.LLJIJIL.length();
                        ArrayList<C327670Csv> arrayList = c327630Csr2.LLIZLLLIL;
                        if (!arrayList.isEmpty()) {
                            this.LJII = (C327670Csv) C13LP.LJJLIIIJJI(arrayList);
                            this.LJFF = length2;
                        }
                        this.LJI = null;
                    }
                    length = i;
                } else {
                    ArrayList<C327670Csv> arrayList2 = c327630Csr2.LLIZLLLIL;
                    if (!arrayList2.isEmpty()) {
                        this.LJI = (C327670Csv) C13LP.LJJJJZI(arrayList2);
                        return;
                    }
                    return;
                }
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZ(C327630Csr c327630Csr, boolean z) {
        if (!z && c327630Csr.LL + c327630Csr.LLJI < this.LIZJ + this.LJ) {
            return;
        }
        if (this.LJIIIZ.isEmpty()) {
            this.LIZJ = c327630Csr.LL;
            this.LJ = c327630Csr.LLJI;
        } else {
            this.LJ = (c327630Csr.LL + c327630Csr.LLJI) - this.LIZJ;
        }
        this.LJIIIZ.add(c327630Csr);
        this.LJIIIIZZ = true;
    }
}
