package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183250gtf {
    public final C1183240gte LIZ;
    public final String LIZIZ;
    public final C1184490gvf LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183250gtf)) {
            return false;
        }
        C1183250gtf c1183250gtf = (C1183250gtf) obj;
        return Intrinsics.LJFF(this.LIZ, c1183250gtf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1183250gtf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1183250gtf.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryFeatureListContext(dataParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183250gtf(C1183240gte c1183240gte) {
        String str = c1183240gte.poiId;
        C1184490gvf c1184490gvf = c1183240gte.shareParams;
        this.LIZ = c1183240gte;
        this.LIZIZ = str;
        this.LIZJ = c1184490gvf;
    }
}
