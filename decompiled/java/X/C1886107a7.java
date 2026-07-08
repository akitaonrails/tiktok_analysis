package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886107a7 {
    public final List<Long> LIZ;
    public final List<Integer> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1886107a7)) {
            return false;
        }
        C1886107a7 c1886107a7 = (C1886107a7) obj;
        return Intrinsics.LJFF(this.LIZ, c1886107a7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1886107a7.LIZIZ) && this.LIZJ == c1886107a7.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RealTimePanelInsertResult(insertedGiftIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", changedIndexes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timedOut=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1886107a7(List<Long> list, List<Integer> list2, boolean z) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = z;
    }
}
