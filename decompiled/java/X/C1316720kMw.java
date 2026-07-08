package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0kMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316720kMw {
    public Integer LIZJ;
    public int LJ;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIL;
    public float LJIILIIL;
    public C1316860kNA LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public String LJIJJ;
    public boolean LJIJJLI;
    public float LJIL;
    public float LJJ;
    public float[] LJJIFFI;
    public List<C1316830kN7> LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public boolean LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public C1313360kHW LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJLIJ;
    public int LJJIL;
    public float LJJIZ;
    public AbstractC1315160kKQ LJJJ;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZLLL = 3;
    public int LJFF = -1;
    public float LJIIJ = 1.0E21f;
    public float LJIIJJI = 1.0E21f;
    public float LJJI = 1.0f;
    public int LJJIJL = 4;

    public final C1316720kMw LIZ() {
        C1316720kMw c1316720kMw = new C1316720kMw();
        c1316720kMw.LIZ = this.LIZ;
        c1316720kMw.LIZIZ = this.LIZIZ;
        c1316720kMw.LIZJ = this.LIZJ;
        c1316720kMw.LIZLLL = this.LIZLLL;
        c1316720kMw.LJFF = this.LJFF;
        c1316720kMw.LJI = this.LJI;
        c1316720kMw.LJII = this.LJII;
        c1316720kMw.LJIIIIZZ = this.LJIIIIZZ;
        c1316720kMw.LJIIIZ = this.LJIIIZ;
        c1316720kMw.LJIIJ = this.LJIIJ;
        c1316720kMw.LJIIJJI = this.LJIIJJI;
        c1316720kMw.LJIIL = this.LJIIL;
        c1316720kMw.LJIILIIL = this.LJIILIIL;
        c1316720kMw.LJIILJJIL = this.LJIILJJIL;
        c1316720kMw.LJIILL = this.LJIILL;
        c1316720kMw.LJIILLIIL = this.LJIILLIIL;
        c1316720kMw.LJIIZILJ = this.LJIIZILJ;
        c1316720kMw.LJIJ = this.LJIJ;
        c1316720kMw.LJIJI = this.LJIJI;
        c1316720kMw.LJIJJ = this.LJIJJ;
        c1316720kMw.LJJIJIIJIL = this.LJJIJIIJIL;
        c1316720kMw.LJJIJIL = this.LJJIJIL;
        c1316720kMw.LJJIJL = this.LJJIJL;
        c1316720kMw.LJJIJLIJ = this.LJJIJLIJ;
        c1316720kMw.LJJIZ = this.LJJIZ;
        c1316720kMw.LJJIL = this.LJJIL;
        c1316720kMw.LJ = this.LJ;
        c1316720kMw.LJJIJIIJI = this.LJJIJIIJI;
        c1316720kMw.LJIJJLI = this.LJIJJLI;
        c1316720kMw.LJJ = this.LJJ;
        c1316720kMw.LJIL = this.LJIL;
        c1316720kMw.LJJI = this.LJJI;
        c1316720kMw.LJJIFFI = this.LJJIFFI;
        c1316720kMw.LJJII = this.LJJII == null ? null : new ArrayList(this.LJJII);
        c1316720kMw.LJJIJ = this.LJJIJ;
        c1316720kMw.LJJIII = this.LJJIII;
        c1316720kMw.LJJIIJ = this.LJJIIJ;
        c1316720kMw.LJJIIJZLJL = this.LJJIIJZLJL;
        c1316720kMw.LJJIIZ = this.LJJIIZ;
        c1316720kMw.LJJIIZI = this.LJJIIZI;
        return c1316720kMw;
    }

    public final TextDirectionHeuristic LIZIZ() {
        int i = this.LJ;
        return i == 0 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : i == 3 ? TextDirectionHeuristics.LTR : TextDirectionHeuristics.RTL;
    }

    public final String LIZJ() {
        if (!this.LJJIIZI) {
            return this.LJJIIJZLJL;
        }
        String str = this.LJJIIJZLJL;
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("'");
        sbLIZ.append("opsz");
        sbLIZ.append("' ");
        sbLIZ.append(this.LJIILIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LJ() {
        int i = this.LJI;
        if ((i == 1 || (i >= 6 && i <= 10)) && this.LJII == 2) {
            return 3;
        }
        if (i == 1) {
            return 1;
        }
        if (i < 6 || i > 10) {
            return this.LJII == 2 ? 2 : 0;
        }
        return 1;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int iIntValue = (((((((((((((((((((i + (num != null ? num.intValue() : -16777216)) * 31) + this.LIZLLL) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31) + Float.floatToIntBits(this.LJIIJJI)) * 31) + Float.floatToIntBits(this.LJIIL)) * 31) + Float.floatToIntBits(this.LJIILIIL)) * 31;
        C1316860kNA c1316860kNA = this.LJIILJJIL;
        int iHashCode = (((((((((((iIntValue + (c1316860kNA == null ? 0 : c1316860kNA.hashCode())) * 31) + Float.floatToIntBits(this.LJIILL)) * 31) + (this.LJIILLIIL ? 1 : 0)) * 31) + (this.LJIJ ? 1 : 0)) * 31) + (this.LJIIZILJ ? 1 : 0)) * 31) + (this.LJIJI ? 1 : 0)) * 31;
        String str = this.LJIJJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1313360kHW c1313360kHW = this.LJJIJIIJIL;
        int iHashCode3 = (((((((((((((iHashCode2 + (c1313360kHW == null ? 0 : c1313360kHW.hashCode())) * 31) + this.LJJIJIL) * 31) + this.LJJIJL) * 31) + this.LJJIJLIJ) * 31) + Float.floatToIntBits(this.LJJIZ)) * 31) + this.LJJIL) * 31) + this.LJ) * 31;
        AbstractC1315160kKQ abstractC1315160kKQ = this.LJJJ;
        int iHashCode4 = (((((((((((iHashCode3 + (abstractC1315160kKQ == null ? 0 : abstractC1315160kKQ.hashCode())) * 31) + this.LJJIJIIJI) * 31) + (this.LJIJJLI ? 1 : 0)) * 31) + Float.floatToIntBits(this.LJJ)) * 31) + Float.floatToIntBits(this.LJIL)) * 31) + Float.floatToIntBits(this.LJJI)) * 31;
        float[] fArr = this.LJJIFFI;
        int iHashCode5 = (iHashCode4 + (fArr == null ? 0 : fArr.hashCode())) * 31;
        List<C1316830kN7> list = this.LJJII;
        int iHashCode6 = (((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.LJJIJ) * 31) + (this.LJJIII ? 1 : 0)) * 31) + (this.LJJIIJ ? 1 : 0)) * 31;
        String str2 = this.LJJIIJZLJL;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJJIIZ;
        return ((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.LJJIIZI ? 1 : 0);
    }

    public final Layout.Alignment LIZLLL(boolean z) {
        int i = this.LIZLLL;
        if (i == 0) {
            int i2 = this.LJ;
            if (i2 == 0) {
                if (z) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (i2 == 3) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i == 2) {
            int i3 = this.LJ;
            if (i3 == 0) {
                if (z) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i3 == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316720kMw)) {
            return false;
        }
        C1316720kMw c1316720kMw = (C1316720kMw) obj;
        if (this.LIZ != c1316720kMw.LIZ || this.LIZIZ != c1316720kMw.LIZIZ) {
            return false;
        }
        Integer num = c1316720kMw.LIZJ;
        Integer num2 = this.LIZJ;
        if (num2 != null) {
            if (num == null || !num2.equals(num)) {
                return false;
            }
        } else if (num != null) {
            return false;
        }
        if (this.LIZLLL != c1316720kMw.LIZLLL || this.LJFF != c1316720kMw.LJFF || this.LJI != c1316720kMw.LJI || this.LJII != c1316720kMw.LJII || this.LJIIIIZZ != c1316720kMw.LJIIIIZZ || this.LJIIIZ != c1316720kMw.LJIIIZ || !C1314000kIY.LIZ(this.LJIIJ, c1316720kMw.LJIIJ) || !C1314000kIY.LIZ(this.LJIIJJI, c1316720kMw.LJIIJJI) || !C1314000kIY.LIZ(this.LJIIL, c1316720kMw.LJIIL) || !C1314000kIY.LIZ(this.LJIILIIL, c1316720kMw.LJIILIIL) || !Objects.equals(this.LJIILJJIL, c1316720kMw.LJIILJJIL) || this.LJIILL != c1316720kMw.LJIILL || this.LJIILLIIL != c1316720kMw.LJIILLIIL || this.LJIJ != c1316720kMw.LJIJ || this.LJIIZILJ != c1316720kMw.LJIIZILJ || this.LJIJI != c1316720kMw.LJIJI || !TextUtils.equals(this.LJIJJ, c1316720kMw.LJIJJ) || !Objects.equals(this.LJJIJIIJIL, c1316720kMw.LJJIJIIJIL) || this.LJJIJIL != c1316720kMw.LJJIJIL || this.LJ != c1316720kMw.LJ || this.LJJIJLIJ != c1316720kMw.LJJIJLIJ || this.LJJIJL != c1316720kMw.LJJIJL || this.LJJIL != c1316720kMw.LJJIL || !C1314000kIY.LIZ(this.LJJIZ, c1316720kMw.LJJIZ) || this.LJJIJIIJI != c1316720kMw.LJJIJIIJI || this.LJIJJLI != c1316720kMw.LJIJJLI || !C1314000kIY.LIZ(this.LJJ, c1316720kMw.LJJ) || !C1314000kIY.LIZ(this.LJIL, c1316720kMw.LJIL) || !C1314000kIY.LIZ(this.LJJI, c1316720kMw.LJJI) || !Arrays.equals(this.LJJIFFI, c1316720kMw.LJJIFFI) || !Objects.equals(this.LJJII, c1316720kMw.LJJII) || this.LJJIJ != c1316720kMw.LJJIJ || this.LJJIII != c1316720kMw.LJJIII || this.LJJIIJ != c1316720kMw.LJJIIJ || this.LJJIIZI != c1316720kMw.LJJIIZI || !TextUtils.equals(this.LJJIIJZLJL, c1316720kMw.LJJIIJZLJL) || !TextUtils.equals(this.LJJIIZ, c1316720kMw.LJJIIZ)) {
            return false;
        }
        return true;
    }
}
