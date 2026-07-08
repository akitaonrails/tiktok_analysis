package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183120gtS {
    public final C1183210gtb LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183120gtS)) {
            return false;
        }
        C1183120gtS c1183120gtS = (C1183120gtS) obj;
        return Intrinsics.LJFF(this.LIZ, c1183120gtS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1183120gtS.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryFeatureDetailContext(dataParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183120gtS(C1183210gtb c1183210gtb) {
        String str = c1183210gtb.poiId;
        this.LIZ = c1183210gtb;
        this.LIZIZ = str;
    }
}
