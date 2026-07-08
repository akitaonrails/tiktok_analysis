package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715250S3v {
    public final C0S43 LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C715250S3v)) {
            return false;
        }
        C715250S3v c715250S3v = (C715250S3v) obj;
        return this.LIZ == c715250S3v.LIZ && this.LIZIZ == c715250S3v.LIZIZ && Intrinsics.LJFF(this.LIZJ, c715250S3v.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RiskActionRecord(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C715250S3v(C0S43 c0s43, long j, String str) {
        this.LIZ = c0s43;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
