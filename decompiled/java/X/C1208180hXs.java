package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208180hXs {
    public final String LIZ;
    public final int LIZIZ;
    public final List<Long> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C1210150hb3 LJI;
    public final C1210150hb3 LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1208180hXs)) {
            return false;
        }
        C1208180hXs c1208180hXs = (C1208180hXs) obj;
        return Intrinsics.LJFF(this.LIZ, c1208180hXs.LIZ) && this.LIZIZ == c1208180hXs.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1208180hXs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1208180hXs.LIZLLL) && Intrinsics.LJFF(this.LJ, c1208180hXs.LJ) && Intrinsics.LJFF(this.LJFF, c1208180hXs.LJFF) && Intrinsics.LJFF(this.LJI, c1208180hXs.LJI) && Intrinsics.LJFF(this.LJII, c1208180hXs.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        C1210150hb3 c1210150hb3 = this.LJII;
        return iHashCode + (c1210150hb3 == null ? 0 : c1210150hb3.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentConfig(certName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minIntervalSec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", styledContent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", key1=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", key2=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208180hXs(String str, int i, List<Long> list, String str2, String str3, String str4, C1210150hb3 c1210150hb3, C1210150hb3 c1210150hb32) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = c1210150hb3;
        this.LJII = c1210150hb32;
    }
}
