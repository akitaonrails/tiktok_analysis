package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698890RbD {
    public final C698780Rb2 LIZ;
    public final List<C700060Rd6> LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698890RbD)) {
            return false;
        }
        C698890RbD c698890RbD = (C698890RbD) obj;
        return Intrinsics.LJFF(this.LIZ, c698890RbD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c698890RbD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c698890RbD.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        List<String> list = this.LIZJ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteRequest(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotCandidates=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timingKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698890RbD(C698780Rb2 c698780Rb2, List<C700060Rd6> list, List<String> list2) {
        this.LIZ = c698780Rb2;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
