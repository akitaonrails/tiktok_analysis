package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090270eTh {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1090270eTh)) {
            return false;
        }
        C1090270eTh c1090270eTh = (C1090270eTh) obj;
        return Intrinsics.LJFF(this.LIZ, c1090270eTh.LIZ) && this.LIZIZ == c1090270eTh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1090270eTh.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PSPFeatureProducerInfo(featureKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1090270eTh(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
