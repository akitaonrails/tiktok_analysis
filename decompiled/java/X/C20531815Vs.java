package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20531815Vs {
    public final EnumC20125213oo LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public boolean LIZLLL = false;
    public Long LJ = null;
    public boolean LJFF = false;
    public boolean LJI = false;
    public Long LJII = null;
    public boolean LJIIIIZZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20531815Vs)) {
            return false;
        }
        C20531815Vs c20531815Vs = (C20531815Vs) obj;
        return this.LIZ == c20531815Vs.LIZ && this.LIZIZ == c20531815Vs.LIZIZ && this.LIZJ == c20531815Vs.LIZJ && this.LIZLLL == c20531815Vs.LIZLLL && Intrinsics.LJFF(this.LJ, c20531815Vs.LJ) && this.LJFF == c20531815Vs.LJFF && this.LJI == c20531815Vs.LJI && Intrinsics.LJFF(this.LJII, c20531815Vs.LJII) && this.LJIIIIZZ == c20531815Vs.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Long l = this.LJ;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Long l2 = this.LJII;
        return ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellState(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", modelSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appearAt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", coverLoaded=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverAt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", coverSuccess=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", avatarLoaded=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", avatarAt=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", avatarSuccess=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20531815Vs(EnumC20125213oo enumC20125213oo, int i, long j) {
        this.LIZ = enumC20125213oo;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
