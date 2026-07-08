package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZN {
    public final long LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZN)) {
            return false;
        }
        C07ZN c07zn = (C07ZN) obj;
        return this.LIZ == c07zn.LIZ && this.LIZIZ == c07zn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c07zn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07zn.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollingConfig(intervalMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sumTimes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sectionIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pollingParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZN(int i, long j, List list, Map map) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = map;
    }
}
