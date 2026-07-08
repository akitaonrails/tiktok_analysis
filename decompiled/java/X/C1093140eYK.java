package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093140eYK {
    public final String LIZ;
    public final String LIZIZ;
    public final Object LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093140eYK)) {
            return false;
        }
        C1093140eYK c1093140eYK = (C1093140eYK) obj;
        return Intrinsics.LJFF(this.LIZ, c1093140eYK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1093140eYK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1093140eYK.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Object obj = this.LIZJ;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveTTMResultData(bizName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1093140eYK(String str, String str2, Object obj) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = obj;
    }
}
