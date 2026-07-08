package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682050Qp9 implements C006Y {
    public final Map<String, Object> LIZ;
    public final Map<String, Long> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C682050Qp9)) {
            return false;
        }
        C682050Qp9 c682050Qp9 = (C682050Qp9) obj;
        return Intrinsics.LJFF(this.LIZ, c682050Qp9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c682050Qp9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c682050Qp9.LIZJ);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LIZ;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Long> map2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimingUpdatePayload(timingInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateTiming=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", flag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C682050Qp9(Map<String, Object> map, Map<String, Long> map2, String str) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = str;
    }
}
