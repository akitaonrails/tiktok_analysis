package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541780LMq {
    public final String LIZ = "task_framework";
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C541780LMq)) {
            return false;
        }
        C541780LMq c541780LMq = (C541780LMq) obj;
        return Intrinsics.LJFF(this.LIZ, c541780LMq.LIZ) && this.LIZIZ == c541780LMq.LIZIZ && this.LIZJ == c541780LMq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c541780LMq.LIZLLL) && this.LJ == c541780LMq.LJ && Intrinsics.LJFF(this.LJFF, c541780LMq.LJFF) && Intrinsics.LJFF(this.LJI, c541780LMq.LJI) && Intrinsics.LJFF(this.LJII, c541780LMq.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ) * 31;
        Integer num2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJI;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.LJII;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadMobSummary(stack=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalAttempt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failAttempt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxAttempt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hadRetry=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", retryEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lastErrorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", lastErrorMsg=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C541780LMq(int i, int i2, Integer num, int i3, Integer num2, Integer num3, String str) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = num;
        this.LJ = i3;
        this.LJFF = num2;
        this.LJI = num3;
        this.LJII = str;
    }
}
