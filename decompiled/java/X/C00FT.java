package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FT implements C0LUV {
    public final String LIZ;
    public final String LIZIZ;

    public C00FT() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FT)) {
            return false;
        }
        C00FT c00ft = (C00FT) obj;
        return Intrinsics.LJFF(this.LIZ, c00ft.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ft.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerSubTaskParams(serverTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUV
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LIZ;
        if (str != null) {
            jSONObject.put("server_task_id", str);
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            jSONObject.put("log_id", str2);
        }
        return jSONObject;
    }

    public C00FT(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
