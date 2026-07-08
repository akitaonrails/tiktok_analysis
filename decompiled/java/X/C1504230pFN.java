package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504230pFN {
    public final String LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1504230pFN)) {
            return false;
        }
        C1504230pFN c1504230pFN = (C1504230pFN) obj;
        return Intrinsics.LJFF(this.LIZ, c1504230pFN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1504230pFN.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrentTrackSnapshot(endCategory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", connectivityType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1504230pFN(String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = num;
    }
}
