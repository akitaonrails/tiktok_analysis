package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FP implements C0LUV {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public C00FP() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FP)) {
            return false;
        }
        C00FP c00fp = (C00FP) obj;
        return Intrinsics.LJFF(this.LIZ, c00fp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00fp.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueSubTaskParams(totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUV
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Integer num = this.LIZ;
        if (num != null) {
            jSONObject.put("total_count", num.intValue());
        }
        Integer num2 = this.LIZIZ;
        if (num2 != null) {
            jSONObject.put("remain_count", num2.intValue());
        }
        return jSONObject;
    }

    public C00FP(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
