package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405530mgB {
    public final String LIZ;
    public final String LIZIZ = "cameo_record";
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405530mgB)) {
            return false;
        }
        C1405530mgB c1405530mgB = (C1405530mgB) obj;
        return Intrinsics.LJFF(this.LIZ, c1405530mgB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1405530mgB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1405530mgB.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceDownloadMobParams(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1405530mgB(String str, String str2) {
        this.LIZ = str;
        this.LIZJ = str2;
    }
}
