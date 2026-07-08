package X;

import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801910Vcz {
    public static boolean LJ;
    public final Set<String> LIZ;
    public final boolean LIZIZ;
    public final JSONObject LIZJ;
    public final boolean LIZLLL;

    public C801910Vcz() {
        this.LIZLLL = true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnsureConfig{sampledLogType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCoreExceptionEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exceptionMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAllEnable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(String str) {
        if (LJ) {
            return false;
        }
        if (this.LIZLLL) {
            return true;
        }
        if ("core_exception_monitor".equals(str)) {
            return this.LIZIZ;
        }
        Set<String> set = this.LIZ;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(String str, String str2) {
        JSONObject jSONObject;
        if (LJ || !LIZ(str)) {
            return false;
        }
        if (!this.LIZLLL && (jSONObject = this.LIZJ) != null) {
            if (Math.random() > jSONObject.optDouble(str2, 1.0d)) {
                return false;
            }
        }
        return true;
    }

    public C801910Vcz(Set<String> set, JSONObject jSONObject, boolean z) {
        this.LIZ = set;
        this.LIZIZ = z;
        if (jSONObject != null) {
            this.LIZJ = jSONObject;
        } else {
            this.LIZJ = new JSONObject();
        }
    }
}
