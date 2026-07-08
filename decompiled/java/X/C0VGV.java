package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VGV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VGV)) {
            return false;
        }
        C0VGV c0vgv = (C0VGV) obj;
        return Intrinsics.LJFF(this.LIZ, c0vgv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0vgv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0vgv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0vgv.LIZLLL) && this.LJ == c0vgv.LJ && Intrinsics.LJFF(this.LJFF, c0vgv.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimInfo(simOperator=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", networkOperator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", simOperatorName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", networkOperatorName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isRoaming=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", types=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VGV(String str, String str2, String str3, String str4, boolean z, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = list;
    }
}
