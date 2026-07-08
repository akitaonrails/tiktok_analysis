package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703440RiY {
    public final long LIZ;
    public final C703340RiO LIZIZ;
    public final C703320RiM LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703440RiY)) {
            return false;
        }
        C703440RiY c703440RiY = (C703440RiY) obj;
        return this.LIZ == c703440RiY.LIZ && Intrinsics.LJFF(this.LIZIZ, c703440RiY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703440RiY.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecutionPlanningStage(executeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timingContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", schedulingPlan=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703440RiY(long j, C703340RiO c703340RiO, C703320RiM c703320RiM) {
        this.LIZ = j;
        this.LIZIZ = c703340RiO;
        this.LIZJ = c703320RiM;
    }
}
