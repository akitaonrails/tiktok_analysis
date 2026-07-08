package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL = "aigc";
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LUR)) {
            return false;
        }
        C0LUR c0lur = (C0LUR) obj;
        return Intrinsics.LJFF(this.LIZ, c0lur.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lur.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lur.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lur.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lur.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITaskTraceInfo(traceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tenant=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", prefix=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LUR(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJ = str4;
    }
}
