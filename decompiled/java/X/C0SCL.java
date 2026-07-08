package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SCL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SCL extends AbstractC1007980cKy {
    public final JSONObject LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SCL) && Intrinsics.LJFF(this.LIZ, ((C0SCL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessCustomized(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SCL(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }
}
