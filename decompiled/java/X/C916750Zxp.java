package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916750Zxp {
    public final int LIZ;
    public final long LIZIZ;
    public String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C916750Zxp)) {
            return false;
        }
        C916750Zxp c916750Zxp = (C916750Zxp) obj;
        return this.LIZ == c916750Zxp.LIZ && this.LIZIZ == c916750Zxp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c916750Zxp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeboardData(officialMaterialType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaNodeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C916750Zxp(int i, long j, String str) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
