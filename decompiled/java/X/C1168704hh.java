package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1168704hh {
    public final List<Integer> LIZ;
    public final List<Integer> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168704hh)) {
            return false;
        }
        C1168704hh c1168704hh = (C1168704hh) obj;
        return Intrinsics.LJFF(this.LIZ, c1168704hh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1168704hh.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<Integer> list = this.LIZIZ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioDriveResult(points=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reorderMapping=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1168704hh(List<Integer> list, List<Integer> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
