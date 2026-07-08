package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889407ae {
    public final String LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889407ae)) {
            return false;
        }
        C1889407ae c1889407ae = (C1889407ae) obj;
        return Intrinsics.LJFF(this.LIZ, c1889407ae.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1889407ae.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1889407ae.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.LIZIZ;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LIZJ;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurveSpeedInfo(curveSpeedName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dstDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", srcDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889407ae(Float f, Float f2, String str) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
