package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015960cXq {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final C1020920cfq LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1015960cXq)) {
            return false;
        }
        C1015960cXq c1015960cXq = (C1015960cXq) obj;
        return Intrinsics.LJFF(this.LIZ, c1015960cXq.LIZ) && this.LIZIZ == c1015960cXq.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1015960cXq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1015960cXq.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1020920cfq c1020920cfq = this.LIZLLL;
        return iHashCode2 + (c1020920cfq != null ? c1020920cfq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenImageLoadResult(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackTag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1015960cXq(String str, boolean z, String str2, C1020920cfq c1020920cfq) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = c1020920cfq;
    }
}
