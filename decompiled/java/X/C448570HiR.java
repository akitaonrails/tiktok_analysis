package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448570HiR {
    public final String LIZ;
    public final int LIZIZ = 2131847130;
    public final boolean LIZJ = true;
    public final String LIZLLL = "scan_it";
    public final String LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448570HiR)) {
            return false;
        }
        C448570HiR c448570HiR = (C448570HiR) obj;
        return Intrinsics.LJFF(this.LIZ, c448570HiR.LIZ) && this.LIZIZ == c448570HiR.LIZIZ && this.LIZJ == c448570HiR.LIZJ && Intrinsics.LJFF(this.LIZLLL, c448570HiR.LIZLLL) && Intrinsics.LJFF(this.LJ, c448570HiR.LJ) && this.LJFF == c448570HiR.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchQRCodeAnchorDisplay(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFixedPresentation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scanSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imprId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", qrType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448570HiR(int i, String str, String str2) {
        this.LIZ = str;
        this.LJ = str2;
        this.LJFF = i;
    }
}
