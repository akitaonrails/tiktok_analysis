package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PLO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLO {
    public final C0PLQ LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PLO)) {
            return false;
        }
        C0PLO c0plo = (C0PLO) obj;
        return this.LIZ == c0plo.LIZ && Intrinsics.LJFF(this.LIZIZ, c0plo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0plo.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.LIZJ;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLiveDynamicAnchorDecision(placement=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewObject=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cardLog=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PLO(C0PLQ c0plq, String str, Map<String, ? extends Object> map) {
        this.LIZ = c0plq;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
