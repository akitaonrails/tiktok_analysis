package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01WM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01WM {
    public final String LIZ;
    public final Map<?, ?> LIZIZ;
    public final Map<?, ?> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01WM)) {
            return false;
        }
        C01WM c01wm = (C01WM) obj;
        return Intrinsics.LJFF(this.LIZ, c01wm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c01wm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c01wm.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<?, ?> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<?, ?> map2 = this.LIZJ;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessVisitActionData(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01WM(String str, Map<?, ?> map, Map<?, ?> map2) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = map2;
    }
}
