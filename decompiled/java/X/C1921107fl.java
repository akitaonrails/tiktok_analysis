package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921107fl {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921107fl)) {
            return false;
        }
        C1921107fl c1921107fl = (C1921107fl) obj;
        return Intrinsics.LJFF(this.LIZ, c1921107fl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1921107fl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1921107fl.LIZJ) && this.LIZLLL == c1921107fl.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        JSONObject jSONObject = this.LIZIZ;
        return ((((iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUpdate(metrics=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentTypeRates=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newAids=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sampleCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1921107fl(JSONObject jSONObject, JSONObject jSONObject2, List<String> list, int i) {
        this.LIZ = jSONObject;
        this.LIZIZ = jSONObject2;
        this.LIZJ = list;
        this.LIZLLL = i;
    }
}
