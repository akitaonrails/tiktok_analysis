package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS33S0102000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692150u8T {
    public final C1683230tu5 LIZ;
    public final C1692200u8Y LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final List<C1683130ttv> LJFF;

    public final boolean LIZLLL() {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        return c1692200u8Y.LIZJ || ((float) ((int) (this.LIZJ & 4294967295L))) < c1692200u8Y.LJ;
    }

    public final boolean LJ() {
        return ((float) ((int) (this.LIZJ >> 32))) < this.LIZIZ.LIZLLL || LIZLLL();
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextLayoutResult(layoutInput=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", multiParagraph=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append((Object) C1682900ttY.LIZLLL(this.LIZJ));
        sbLIZ.append(", firstBaseline=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastBaseline=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", placeholderRects=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC1680400tpW LIZ(int i) {
        int iLIZ;
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILIIL(i);
        if (i == c1692200u8Y.LIZ.LIZ.length()) {
            iLIZ = C1697810uHb.LJIIJ(c1692200u8Y.LJII);
        } else {
            iLIZ = C1692240u8c.LIZ(i, c1692200u8Y.LJII);
        }
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, iLIZ);
        return c1692260u8e.LIZ.LJJ(c1692260u8e.LIZLLL(i));
    }

    public final C1683130ttv LIZIZ(int i) {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZ(i, c1692200u8Y.LJII));
        return c1692260u8e.LIZ(c1692260u8e.LIZ.LIZLLL(c1692260u8e.LIZLLL(i)));
    }

    public final C1683130ttv LIZJ(int i) {
        int iLIZ;
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILIIL(i);
        if (i == c1692200u8Y.LIZ.LIZ.length()) {
            iLIZ = C1697810uHb.LJIIJ(c1692200u8Y.LJII);
        } else {
            iLIZ = C1692240u8c.LIZ(i, c1692200u8Y.LJII);
        }
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, iLIZ);
        return c1692260u8e.LIZ(c1692260u8e.LIZ.LJIIJJI(c1692260u8e.LIZLLL(i)));
    }

    public final float LJFF(int i) {
        return this.LIZIZ.LIZIZ(i);
    }

    public final int LJII(int i) {
        return this.LIZIZ.LIZLLL(i);
    }

    public final int LJIIIIZZ(float f) {
        return this.LIZIZ.LJ(f);
    }

    public final float LJIIIZ(int i) {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZIZ(i, c1692200u8Y.LJII));
        return c1692260u8e.LIZ.LJFF(i - c1692260u8e.LIZLLL);
    }

    public final float LJIIJ(int i) {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZIZ(i, c1692200u8Y.LJII));
        return c1692260u8e.LIZ.LJIJJ(i - c1692260u8e.LIZLLL);
    }

    public final int LJIIJJI(int i) {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILJJIL(i);
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, C1692240u8c.LIZIZ(i, c1692200u8Y.LJII));
        return c1692260u8e.LIZ.LIZIZ(i - c1692260u8e.LIZLLL) + c1692260u8e.LIZIZ;
    }

    public final float LJIIL(int i) {
        return this.LIZIZ.LJFF(i);
    }

    public final EnumC1680400tpW LJIILIIL(int i) {
        int iLIZ;
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILIIL(i);
        if (i == c1692200u8Y.LIZ.LIZ.length()) {
            iLIZ = C1697810uHb.LJIIJ(c1692200u8Y.LJII);
        } else {
            iLIZ = C1692240u8c.LIZ(i, c1692200u8Y.LJII);
        }
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, iLIZ);
        return c1692260u8e.LIZ.LIZ(c1692260u8e.LIZLLL(i));
    }

    public final long LJIILL(int i) {
        int iLIZ;
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.LJIILIIL(i);
        if (i == c1692200u8Y.LIZ.LIZ.length()) {
            iLIZ = C1697810uHb.LJIIJ(c1692200u8Y.LJII);
        } else {
            iLIZ = C1692240u8c.LIZ(i, c1692200u8Y.LJII);
        }
        C1692260u8e c1692260u8e = (C1692260u8e) ListProtector.get(c1692200u8Y.LJII, iLIZ);
        return c1692260u8e.LIZIZ(c1692260u8e.LIZ.LJIILJJIL(c1692260u8e.LIZLLL(i)), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692150u8T)) {
            return false;
        }
        C1692150u8T c1692150u8T = (C1692150u8T) obj;
        if (Intrinsics.LJFF(this.LIZ, c1692150u8T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1692150u8T.LIZIZ) && C1682900ttY.LIZIZ(this.LIZJ, c1692150u8T.LIZJ) && this.LIZLLL == c1692150u8T.LIZLLL && this.LJ == c1692150u8T.LJ && Intrinsics.LJFF(this.LJFF, c1692150u8T.LJFF)) {
            return true;
        }
        return false;
    }

    public final int LJI(int i, boolean z) {
        return this.LIZIZ.LIZJ(i, z);
    }

    public final C1695950uEb LJIILJJIL(int i, int i2) {
        C1692200u8Y c1692200u8Y = this.LIZIZ;
        c1692200u8Y.getClass();
        if (i < 0 || i > i2 || i2 > c1692200u8Y.LIZ.LIZ.LLILLJJLI.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start(");
            sbLIZ.append(i);
            sbLIZ.append(") or End(");
            sbLIZ.append(i2);
            sbLIZ.append(") is out of range [0..");
            sbLIZ.append(c1692200u8Y.LIZ.LIZ.LLILLJJLI.length());
            sbLIZ.append("), or start > end!");
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i == i2) {
            return C1695940uEa.LIZ();
        }
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        C1692240u8c.LIZLLL(c1692200u8Y.LJII, C1680680tpy.LIZ(i, i2), new AwS33S0102000_25(c1695950uEbLIZ, i, i2, 6));
        return c1695950uEbLIZ;
    }

    public C1692150u8T(C1683230tu5 c1683230tu5, C1692200u8Y c1692200u8Y, long j) {
        float fLJIIJ;
        this.LIZ = c1683230tu5;
        this.LIZIZ = c1692200u8Y;
        this.LIZJ = j;
        float fLIZJ = 0.0f;
        if (((ArrayList) c1692200u8Y.LJII).isEmpty()) {
            fLJIIJ = 0.0f;
        } else {
            fLJIIJ = ((C1692260u8e) ListProtector.get(c1692200u8Y.LJII, 0)).LIZ.LJIIJ();
        }
        this.LIZLLL = fLJIIJ;
        if (!((ArrayList) c1692200u8Y.LJII).isEmpty()) {
            C1692260u8e c1692260u8e = (C1692260u8e) C13LP.LJJLIIIJJI(c1692200u8Y.LJII);
            fLIZJ = c1692260u8e.LIZ.LIZJ() + c1692260u8e.LJFF;
        }
        this.LJ = fLIZJ;
        this.LJFF = c1692200u8Y.LJI;
    }
}
