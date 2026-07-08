package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344660l60 {
    public static final C1344660l60 LJFF = new C1344660l60(-1, -1, -1, -1, "");
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1344660l60)) {
            return false;
        }
        C1344660l60 c1344660l60 = (C1344660l60) obj;
        return this.LIZ == c1344660l60.LIZ && this.LIZIZ == c1344660l60.LIZIZ && this.LIZJ == c1344660l60.LIZJ && this.LIZLLL == c1344660l60.LIZLLL && Intrinsics.LJFF(this.LJ, c1344660l60.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadBreakdown(decodeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", downloadMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", queueMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileSizeBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1344660l60(long j, long j2, long j3, long j4, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
    }
}
