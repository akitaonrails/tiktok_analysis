package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823810WTj {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public final List<String> LJ;

    public C823810WTj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C823810WTj)) {
            return false;
        }
        C823810WTj c823810WTj = (C823810WTj) obj;
        return this.LIZ == c823810WTj.LIZ && this.LIZIZ == c823810WTj.LIZIZ && this.LIZJ == c823810WTj.LIZJ && this.LIZLLL == c823810WTj.LIZLLL && Intrinsics.LJFF(this.LJ, c823810WTj.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatencyMetrics(maxWaitLatencyMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalWaitLatencyMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxQueueLength=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", longRunningTasks=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0;
        this.LJ.clear();
    }

    public C823810WTj(Object obj) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0;
        this.LJ = arrayList;
    }
}
