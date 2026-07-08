package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YI {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YI)) {
            return false;
        }
        C07YI c07yi = (C07YI) obj;
        return Intrinsics.LJFF(this.LIZ, c07yi.LIZ) && this.LIZIZ == c07yi.LIZIZ && this.LIZJ == c07yi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c07yi.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadCoverResult(finalCoverPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverOriginStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", downloadDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C07YI(int i, String str, long j, int i2) {
        String str2;
        i = (i2 & 2) != 0 ? 0 : i;
        j = (i2 & 4) != 0 ? 0L : j;
        if ((i2 & 8) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(i, str, j, str2);
    }

    public C07YI(int i, String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
    }
}
