package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1911807eG {
    public static final /* synthetic */ int LJ = 0;
    public final List<C1911707eF> LIZ;
    public final double LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1911807eG)) {
            return false;
        }
        C1911807eG c1911807eG = (C1911807eG) obj;
        return Intrinsics.LJFF(this.LIZ, c1911807eG.LIZ) && Double.compare(this.LIZIZ, c1911807eG.LIZIZ) == 0 && this.LIZJ == c1911807eG.LIZJ && this.LIZLLL == c1911807eG.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProbeObserverConfig(businesses=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultReportIntervalSec=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultLeadingEdgeEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultBackgroundFlushEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1911807eG(List<C1911707eF> list, double d, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = d;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
