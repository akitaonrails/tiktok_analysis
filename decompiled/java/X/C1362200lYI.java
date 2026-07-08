package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362200lYI {
    public final int LIZ;
    public final List<InterfaceC1361730lXX> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362200lYI)) {
            return false;
        }
        C1362200lYI c1362200lYI = (C1362200lYI) obj;
        return this.LIZ == c1362200lYI.LIZ && Intrinsics.LJFF(this.LIZIZ, c1362200lYI.LIZIZ) && this.LIZJ == c1362200lYI.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregationExpandInfo(phase=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fullList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", insertIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1362200lYI(int i, List<? extends InterfaceC1361730lXX> list, int i2) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = i2;
    }
}
