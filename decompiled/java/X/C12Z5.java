package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.12Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12Z5 {
    public final C19804712eD LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public String LJIILLIIL;
    public Boolean LJIIZILJ;
    public long LJIJ;
    public List<String> LJIJI;
    public String LJIJJ;
    public boolean LJIJJLI;
    public long LJIL;
    public long LJJ;
    public int LJJI;
    public boolean LJJIFFI;
    public Long LJJII;
    public Long LJJIII;
    public long LJJIIJ;
    public String LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public long LJJIJ;
    public String LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public long LJJIL;
    public long LJJIZ;
    public String LJJJ;
    public boolean LJJJI;
    public long LJJJIL;
    public long LJJJJ;

    public final String LIZLLL() {
        this.LIZ.LJIIL().LJ();
        return this.LJIILLIIL;
    }

    public final String LJ() {
        this.LIZ.LJIIL().LJ();
        String str = this.LJJJ;
        LJJIII(null);
        return str;
    }

    public final String LJFF() {
        this.LIZ.LJIIL().LJ();
        return this.LIZIZ;
    }

    public final String LJI() {
        this.LIZ.LJIIL().LJ();
        return this.LIZJ;
    }

    public final String LJII() {
        this.LIZ.LJIIL().LJ();
        return this.LJIIIZ;
    }

    public final String LJIIIIZZ() {
        this.LIZ.LJIIL().LJ();
        return this.LJFF;
    }

    public final String LJIIIZ() {
        this.LIZ.LJIIL().LJ();
        return this.LIZLLL;
    }

    public final String LJIIJ() {
        this.LIZ.LJIIL().LJ();
        return this.LJJIIJZLJL;
    }

    public final void LJIIJJI() {
        this.LIZ.LJIIL().LJ();
        this.LJJJI = false;
    }

    public final long LJIJJLI() {
        this.LIZ.LJIIL().LJ();
        return this.LJIIJ;
    }

    public final void LIZ(long j) {
        this.LIZ.LJIIL().LJ();
        long j2 = this.LJI + j;
        if (j2 > 2147483647L) {
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(C19806212eS.LJIIJ(this.LIZIZ), "Bundle index overflow. appId");
            j2 = j - 1;
        }
        long j3 = this.LJJIJ + 1;
        if (j3 > 2147483647L) {
            this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(C19806212eS.LJIIJ(this.LIZIZ), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.LJJJI = true;
        this.LJI = j2;
        this.LJJIJ = j3;
    }

    public final void LIZIZ(String str) {
        this.LIZ.LJIIL().LJ();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.LJJJI |= !Objects.equals(this.LJIILLIIL, str);
        this.LJIILLIIL = str;
    }

    public final void LIZJ(List<String> list) {
        ArrayList arrayList;
        this.LIZ.LJIIL().LJ();
        if (!Objects.equals(this.LJIJI, list)) {
            this.LJJJI = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.LJIJI = arrayList;
        }
    }

    public final void LJIIL(int i) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIIZI != i) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIIZI = i;
    }

    public final void LJIILIIL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJIIJ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJIIJ = j;
    }

    public final void LJIILJJIL(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LIZJ, str);
        this.LIZJ = str;
    }

    public final void LJIILL(boolean z) {
        boolean z2;
        this.LIZ.LJIIL().LJ();
        boolean z3 = this.LJJJI;
        if (this.LJIILJJIL != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJJI = z3 | z2;
        this.LJIILJJIL = z;
    }

    public final void LJIILLIIL(int i) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIIZ != i) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIIZ = i;
    }

    public final void LJIIZILJ(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIIJ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIIJ = j;
    }

    public final void LJIJ(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LJIIJJI, str);
        this.LJIIJJI = str;
    }

    public final void LJIJI(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJJIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJJIL = j;
    }

    public final void LJIJJ(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LJIIIZ, str);
        this.LJIIIZ = str;
    }

    public final void LJIL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIJLIJ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIJLIJ = j;
    }

    public final void LJJ(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LJFF, str);
        this.LJFF = str;
    }

    public final void LJJI(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIL = j;
    }

    public final void LJJIFFI(String str) {
        this.LIZ.LJIIL().LJ();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.LJJJI |= !Objects.equals(this.LIZLLL, str);
        this.LIZLLL = str;
    }

    public final void LJJII(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIJL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIJL = j;
    }

    public final void LJJIII(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LJJJ, str);
        this.LJJJ = str;
    }

    public final void LJJIIJ(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIJIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIJIL = j;
    }

    public final void LJJIIJZLJL(String str) {
        this.LIZ.LJIIL().LJ();
        this.LJJJI |= !Objects.equals(this.LJ, str);
        this.LJ = str;
    }

    public final void LJJIIZ(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIZ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIZ = j;
    }

    public final void LJJIIZI(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIJIIJIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIJIIJIL = j;
    }

    public final void LJJIJ(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJIILIIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJIILIIL = j;
    }

    public final void LJJIJIIJI(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJIJ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJIJ = j;
    }

    public final void LJJIJIIJIL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJIIL != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJIIL = j;
    }

    public final void LJJIJIL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJJIJ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJJIJ = j;
    }

    public final void LJJIJL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJIIIIZZ != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJIIIIZZ = j;
    }

    public final void LJJIJLIJ(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        this.LIZ.LJIIL().LJ();
        boolean z3 = this.LJJJI;
        if (this.LJI == j) {
            z2 = false;
        }
        this.LJJJI = z3 | z2;
        this.LJI = j;
    }

    public final void LJJIL(long j) {
        boolean z;
        this.LIZ.LJIIL().LJ();
        boolean z2 = this.LJJJI;
        if (this.LJII != j) {
            z = true;
        } else {
            z = false;
        }
        this.LJJJI = z2 | z;
        this.LJII = j;
    }

    public C12Z5(C19804712eD c19804712eD, String str) {
        C0W3J.LJIIIIZZ(c19804712eD);
        C0W3J.LJI(str);
        this.LIZ = c19804712eD;
        this.LIZIZ = str;
        c19804712eD.LJIIL().LJ();
    }
}
