package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044770dIJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Map<String, Object> LJII;
    public final Map<String, Object> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044770dIJ)) {
            return false;
        }
        C1044770dIJ c1044770dIJ = (C1044770dIJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1044770dIJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1044770dIJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1044770dIJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1044770dIJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1044770dIJ.LJ) && Intrinsics.LJFF(this.LJFF, c1044770dIJ.LJFF) && Intrinsics.LJFF(this.LJI, c1044770dIJ.LJI) && Intrinsics.LJFF(this.LJII, c1044770dIJ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1044770dIJ.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskReportRequest(itemId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reqId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rit=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044770dIJ(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = map;
        this.LJIIIIZZ = map2;
    }
}
