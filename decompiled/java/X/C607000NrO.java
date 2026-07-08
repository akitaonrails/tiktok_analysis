package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607000NrO {
    public final String LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C607000NrO)) {
            return false;
        }
        C607000NrO c607000NrO = (C607000NrO) obj;
        return Intrinsics.LJFF(this.LIZ, c607000NrO.LIZ) && this.LIZIZ == c607000NrO.LIZIZ && this.LIZJ == c607000NrO.LIZJ && this.LIZLLL == c607000NrO.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StallState(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isStartupStall=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStalling=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C607000NrO(String str, long j, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
