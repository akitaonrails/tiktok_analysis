package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693480uAc implements InterfaceC1692820u9Y {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final C1693390uAT LIZLLL;
    public final C1693520uAg LJ;
    public final C1695380uDg LJFF;
    public final int LJI;
    public final int LJII;
    public final C1693790uB7 LJIIIIZZ;

    public C1693480uAc() {
        this(5, 4, C1682440tso.LIZJ, null, null, null, 0, Integer.MIN_VALUE, null);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        long j = this.LIZJ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        int iY2 = (i + C786410Ut5.Y2(j)) * 31;
        C1693390uAT c1693390uAT = this.LIZLLL;
        int iHashCode = (iY2 + (c1693390uAT != null ? c1693390uAT.hashCode() : 0)) * 31;
        C1693520uAg c1693520uAg = this.LJ;
        int iHashCode2 = (iHashCode + (c1693520uAg != null ? c1693520uAg.hashCode() : 0)) * 31;
        C1695380uDg c1695380uDg = this.LJFF;
        int iHashCode3 = (((((iHashCode2 + (c1695380uDg != null ? c1695380uDg.hashCode() : 0)) * 31) + this.LJI) * 31) + this.LJII) * 31;
        C1693790uB7 c1693790uB7 = this.LJIIIIZZ;
        return iHashCode3 + (c1693790uB7 != null ? c1693790uB7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParagraphStyle(textAlign=");
        sbLIZ.append((Object) C1692070u8L.LIZ(this.LIZ));
        sbLIZ.append(", textDirection=");
        sbLIZ.append((Object) C1693820uBA.LIZ(this.LIZIZ));
        sbLIZ.append(", lineHeight=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZJ));
        sbLIZ.append(", textIndent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", platformStyle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lineHeightStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lineBreak=");
        sbLIZ.append((Object) C1693660uAu.LIZ(this.LJI));
        sbLIZ.append(", hyphens=");
        sbLIZ.append((Object) C1693860uBE.LIZ(this.LJII));
        sbLIZ.append(", textMotion=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1693480uAc LIZ(C1693480uAc c1693480uAc) {
        if (c1693480uAc == null) {
            return this;
        }
        return C1683300tuC.LIZ(this, c1693480uAc.LIZ, c1693480uAc.LIZIZ, c1693480uAc.LIZJ, c1693480uAc.LIZLLL, c1693480uAc.LJ, c1693480uAc.LJFF, c1693480uAc.LJI, c1693480uAc.LJII, c1693480uAc.LJIIIIZZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693480uAc)) {
            return false;
        }
        C1693480uAc c1693480uAc = (C1693480uAc) obj;
        if (this.LIZ == c1693480uAc.LIZ && this.LIZIZ == c1693480uAc.LIZIZ && C1682440tso.LIZ(this.LIZJ, c1693480uAc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1693480uAc.LIZLLL) && Intrinsics.LJFF(this.LJ, c1693480uAc.LJ) && Intrinsics.LJFF(this.LJFF, c1693480uAc.LJFF) && this.LJI == c1693480uAc.LJI && this.LJII == c1693480uAc.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1693480uAc.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public C1693480uAc(int i, int i2, long j, C1693390uAT c1693390uAT, C1693520uAg c1693520uAg, C1695380uDg c1695380uDg, int i3, int i4, C1693790uB7 c1693790uB7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = c1693390uAT;
        this.LJ = c1693520uAg;
        this.LJFF = c1695380uDg;
        this.LJI = i3;
        this.LJII = i4;
        this.LJIIIIZZ = c1693790uB7;
        if (!C1682440tso.LIZ(j, C1682440tso.LIZJ) && C1682440tso.LIZLLL(j) < 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lineHeight can't be negative (");
            sbLIZ.append(C1682440tso.LIZLLL(j));
            sbLIZ.append(')');
            C1681000tqU.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
