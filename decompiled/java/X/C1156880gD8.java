package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156880gD8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156880gD8)) {
            return false;
        }
        C1156880gD8 c1156880gD8 = (C1156880gD8) obj;
        return Intrinsics.LJFF(this.LIZ, c1156880gD8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156880gD8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1156880gD8.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectContactContainerInfo(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156880gD8(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
