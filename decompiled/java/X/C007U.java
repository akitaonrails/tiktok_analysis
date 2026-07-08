package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007U {
    public final String LIZIZ;
    public final String LIZ = "success";
    public final String LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C007U)) {
            return false;
        }
        C007U c007u = (C007U) obj;
        return Intrinsics.LJFF(this.LIZ, c007u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c007u.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c007u.LIZJ);
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
        sbLIZ.append("LynxData(loadStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C007U(String str) {
        this.LIZIZ = str;
    }
}
