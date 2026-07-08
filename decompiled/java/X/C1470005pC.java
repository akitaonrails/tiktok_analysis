package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1470005pC extends AbstractC1470205pE {
    public final int LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1470005pC)) {
            return false;
        }
        C1470005pC c1470005pC = (C1470005pC) obj;
        return this.LIZ == c1470005pC.LIZ && Intrinsics.LJFF(this.LIZIZ, c1470005pC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1470005pC.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Map<String, Object> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1470005pC(int i, String str, Map<String, ? extends Object> map) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
