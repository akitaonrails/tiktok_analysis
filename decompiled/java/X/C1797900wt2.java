package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797900wt2 {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1797900wt2)) {
            return false;
        }
        C1797900wt2 c1797900wt2 = (C1797900wt2) obj;
        return Intrinsics.LJFF(this.LIZ, c1797900wt2.LIZ) && this.LIZIZ == c1797900wt2.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1797900wt2.LIZJ) && this.LIZLLL == c1797900wt2.LIZLLL && this.LJ == c1797900wt2.LJ && this.LJFF == c1797900wt2.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataRefreshMonitorResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", successCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failedCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", clearedCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1797900wt2(int i, String str, String str2) {
        this(i, 0, 0, 0, str, str2);
    }

    public C1797900wt2(int i, int i2, int i3, int i4, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}
