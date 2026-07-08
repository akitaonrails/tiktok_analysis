package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219060hpQ {
    public final AbstractC1588120rQg LIZ;
    public final List<String> LIZIZ;
    public final boolean LIZJ;

    public C1219060hpQ() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219060hpQ)) {
            return false;
        }
        C1219060hpQ c1219060hpQ = (C1219060hpQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1219060hpQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1219060hpQ.LIZIZ) && this.LIZJ == c1219060hpQ.LIZJ;
    }

    public final int hashCode() {
        AbstractC1588120rQg abstractC1588120rQg = this.LIZ;
        int iHashCode = (abstractC1588120rQg == null ? 0 : abstractC1588120rQg.hashCode()) * 31;
        List<String> list = this.LIZIZ;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BridgeCursorSnapshot(nextPagination=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sessionMafIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1219060hpQ(AbstractC1588120rQg abstractC1588120rQg, List<String> list, boolean z) {
        this.LIZ = abstractC1588120rQg;
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
