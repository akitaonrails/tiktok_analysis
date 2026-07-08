package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477680IoI {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477680IoI)) {
            return false;
        }
        C477680IoI c477680IoI = (C477680IoI) obj;
        return Intrinsics.LJFF(this.LIZ, c477680IoI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477680IoI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c477680IoI.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestErrorInfo(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C477680IoI(Integer num, String str, String str2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
