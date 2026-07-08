package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUB extends C0LU9 {
    public final C0LU2 LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LUB)) {
            return false;
        }
        C0LUB c0lub = (C0LUB) obj;
        return this.LIZ == c0lub.LIZ && this.LIZIZ == c0lub.LIZIZ && this.LIZJ == c0lub.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0lub.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lub.LJ) && Intrinsics.LJFF(this.LJFF, c0lub.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowRunning(step=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", leftQuota=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LUB(C0LU2 c0lu2, int i, long j, String str, Integer num, Integer num2) {
        this.LIZ = c0lu2;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = num;
        this.LJFF = num2;
    }
}
