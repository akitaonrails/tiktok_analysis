package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D0R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0R {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D0R)) {
            return false;
        }
        C0D0R c0d0r = (C0D0R) obj;
        return Intrinsics.LJFF(this.LIZ, c0d0r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d0r.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d0r.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d0r.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d0r.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaterfallRecommendationRequest(spuId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shopId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", passThrough=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", externalProductId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D0R(String str, String str2, String str3, String str4, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = str4;
    }
}
