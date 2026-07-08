package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FR implements C0LUV {
    public final String LIZ;

    public C00FR() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00FR) && Intrinsics.LJFF(this.LIZ, ((C00FR) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMMessageSubTaskParams(messageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUV
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LIZ;
        if (str != null) {
            jSONObject.put("message_id", str);
        }
        return jSONObject;
    }

    public C00FR(String str) {
        this.LIZ = str;
    }
}
