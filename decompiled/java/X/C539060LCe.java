package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539060LCe {
    public final C0LBD LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C539060LCe() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C539060LCe)) {
            return false;
        }
        C539060LCe c539060LCe = (C539060LCe) obj;
        return this.LIZ == c539060LCe.LIZ && this.LIZIZ == c539060LCe.LIZIZ && Intrinsics.LJFF(this.LIZJ, c539060LCe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c539060LCe.LIZLLL) && Intrinsics.LJFF(this.LJ, c539060LCe.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleRestoreInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nleModelJson=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C539060LCe(C0LBD c0lbd, int i, String str, Integer num, String str2) {
        this.LIZ = c0lbd;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = str2;
    }

    public /* synthetic */ C539060LCe(C0LBD c0lbd, int i, String str, Integer num, String str2, int i2) {
        this((i2 & 1) != 0 ? C0LBD.DEFAULT : c0lbd, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) == 0 ? num : null, (i2 & 16) != 0 ? "" : str2);
    }
}
