package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823290WRj {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C823290WRj)) {
            return false;
        }
        C823290WRj c823290WRj = (C823290WRj) obj;
        return Intrinsics.LJFF(this.LIZ, c823290WRj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c823290WRj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c823290WRj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c823290WRj.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        JSONObject jSONObject = this.LIZIZ;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.LIZLLL;
        return iHashCode3 + (jSONObject3 != null ? jSONObject3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedReport(serviceName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metric=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C823290WRj(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZJ = jSONObject2;
        this.LIZLLL = jSONObject3;
    }
}
