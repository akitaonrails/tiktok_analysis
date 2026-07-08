package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.BizStrategy;

/* JADX INFO: renamed from: X.0VMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMZ {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ;
    public final BizStrategy LIZIZ;
    public final C796430VMb LIZJ;
    public final C0VMQ LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMZ)) {
            return false;
        }
        C0VMZ c0vmz = (C0VMZ) obj;
        return this.LIZ == c0vmz.LIZ && Intrinsics.LJFF(this.LIZIZ, c0vmz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0vmz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0vmz.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C0VMQ c0vmq = this.LIZLLL;
        return iHashCode + (c0vmq == null ? 0 : c0vmq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyRunTaskInfo(optType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategyContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", packageInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMZ(int i, BizStrategy bizStrategy, C796430VMb c796430VMb, C0VMQ c0vmq) {
        this.LIZ = i;
        this.LIZIZ = bizStrategy;
        this.LIZJ = c796430VMb;
        this.LIZLLL = c0vmq;
    }
}
