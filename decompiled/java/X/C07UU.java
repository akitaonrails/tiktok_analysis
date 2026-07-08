package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07UU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UU {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07UU)) {
            return false;
        }
        C07UU c07uu = (C07UU) obj;
        return Intrinsics.LJFF(this.LIZ, c07uu.LIZ) && this.LIZIZ == c07uu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadCoverResult(finalCoverPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", downloadDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UU(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
