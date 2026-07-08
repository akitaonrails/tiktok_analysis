package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092660eXY {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092660eXY)) {
            return false;
        }
        C1092660eXY c1092660eXY = (C1092660eXY) obj;
        return Intrinsics.LJFF(this.LIZ, c1092660eXY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1092660eXY.LIZIZ) && this.LIZJ == c1092660eXY.LIZJ && this.LIZLLL == c1092660eXY.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposureRecord(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeTs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", operationComplete=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092660eXY(long j, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = z;
    }
}
