package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FS implements C0LUV {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;

    public C00FS() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FS)) {
            return false;
        }
        C00FS c00fs = (C00FS) obj;
        return Intrinsics.LJFF(this.LIZ, c00fs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00fs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00fs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00fs.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollingSubTaskParams(serverTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZLLL);
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
        Long l = this.LIZJ;
        if (l != null) {
            jSONObject.put("remain_time", l.longValue());
        }
        Integer num = this.LIZIZ;
        if (num != null) {
            jSONObject.put("server_progress", num.intValue());
        }
        String str2 = this.LIZLLL;
        if (str2 != null) {
            jSONObject.put("log_id", str2);
        }
        return jSONObject;
    }

    public C00FS(Integer num, Long l, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = l;
        this.LIZLLL = str2;
    }
}
