package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565570qqJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565570qqJ)) {
            return false;
        }
        C1565570qqJ c1565570qqJ = (C1565570qqJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1565570qqJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1565570qqJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1565570qqJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1565570qqJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1565570qqJ.LJ) && Intrinsics.LJFF(this.LJFF, c1565570qqJ.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.LJFF;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicALogParams(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", module=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1565570qqJ(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = map;
    }
}
