package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00A7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A7 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final List<C118900cl> LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00A7)) {
            return false;
        }
        C00A7 c00a7 = (C00A7) obj;
        return Intrinsics.LJFF(this.LIZ, c00a7.LIZ) && this.LIZIZ == c00a7.LIZIZ && this.LIZJ == c00a7.LIZJ && this.LIZLLL == c00a7.LIZLLL && Intrinsics.LJFF(this.LJ, c00a7.LJ) && this.LJFF == c00a7.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipelineStageRecord(stageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inputCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", outputCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", filteredAssets=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scannedCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00A7(String str, int i, int i2, long j, List list, int i3, int i4) {
        list = (i4 & 16) != 0 ? C13BV.INSTANCE : list;
        i3 = (i4 & 32) != 0 ? i : i3;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = list;
        this.LJFF = i3;
    }
}
