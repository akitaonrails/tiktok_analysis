package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VA5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VA5 implements C0VAH {
    public final List<List<Long>> LIZ = new ArrayList();
    public final List<List<Long>> LIZIZ = new ArrayList();
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = 0;

    public final long LIZ() {
        if (this.LIZJ == 0 && !((ArrayList) this.LIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((List) it2.next()).iterator();
                while (it3.hasNext()) {
                    this.LIZJ += ((Long) it3.next()).longValue();
                }
            }
        }
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpuIdleTimeStatInfo{stateTimeLists=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateDeltaTimeLists=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalCpuIdleTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deltaCpuIdleTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mergedDeltaCpuIdleTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
