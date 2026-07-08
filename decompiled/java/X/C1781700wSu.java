package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781700wSu {
    public final String LIZ;
    public final Long LIZIZ;
    public final JSONObject LIZJ;
    public final Map<String, Object> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781700wSu)) {
            return false;
        }
        C1781700wSu c1781700wSu = (C1781700wSu) obj;
        return Intrinsics.LJFF(this.LIZ, c1781700wSu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781700wSu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781700wSu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781700wSu.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781700wSu.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        JSONObject jSONObject = this.LIZJ;
        return ((((iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxRenderArtifacts(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadPageParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resolvedLoadSchema=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781700wSu(String str, Long l, JSONObject jSONObject, Map<String, ? extends Object> map, String str2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = jSONObject;
        this.LIZLLL = map;
        this.LJ = str2;
    }
}
