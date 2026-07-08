package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183560guA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final Map<String, String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183560guA)) {
            return false;
        }
        C1183560guA c1183560guA = (C1183560guA) obj;
        return Intrinsics.LJFF(this.LIZ, c1183560guA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1183560guA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1183560guA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1183560guA.LIZLLL) && Intrinsics.LJFF(this.LJ, c1183560guA.LJ) && Intrinsics.LJFF(this.LJFF, c1183560guA.LJFF) && Intrinsics.LJFF(this.LJI, c1183560guA.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailSlashApiParam(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slashParam=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serviceType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sourceMerchantIds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sourceProductIds=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", businessParam=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183560guA(String str, String str2, String str3, String str4, List<String> list, List<String> list2, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = map;
    }
}
