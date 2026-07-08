package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNZ implements InterfaceC898720ZNm {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZNZ)) {
            return false;
        }
        C0ZNZ c0znz = (C0ZNZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0znz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0znz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0znz.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.LIZJ;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardUnavailable(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZNZ(String str, String str2, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
    }
}
