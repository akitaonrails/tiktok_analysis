package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1911707eF {
    public final String LIZ;
    public final String LIZIZ;
    public final double LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1911707eF)) {
            return false;
        }
        C1911707eF c1911707eF = (C1911707eF) obj;
        return Intrinsics.LJFF(this.LIZ, c1911707eF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1911707eF.LIZIZ) && Double.compare(this.LIZJ, c1911707eF.LIZJ) == 0 && this.LIZLLL == c1911707eF.LIZLLL && this.LJ == c1911707eF.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessConfig(businessName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ttnetPriority=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reportIntervalSec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", leadingEdgeEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", backgroundFlushEnabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1911707eF(String str, String str2, double d, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = d;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
