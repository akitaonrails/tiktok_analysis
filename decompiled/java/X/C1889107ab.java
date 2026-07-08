package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889107ab {
    public final long LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C1889107ab() {
        this(null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889107ab)) {
            return false;
        }
        C1889107ab c1889107ab = (C1889107ab) obj;
        return this.LIZ == c1889107ab.LIZ && Intrinsics.LJFF(this.LIZIZ, c1889107ab.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1889107ab.LIZJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        int iHashCode = (iY2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmbPreviewState(activeSkuCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", kybVerificationStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", kycVerificationStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889107ab(Integer num, Integer num2, long j) {
        this.LIZ = j;
        this.LIZIZ = num;
        this.LIZJ = num2;
    }
}
