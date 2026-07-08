package X;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1S implements InterfaceC792280V6c {
    public final Set<String> LIZ = new HashSet();

    @Override // X.InterfaceC792280V6c
    public final boolean LIZ(String str) {
        return ((HashSet) this.LIZ).contains(LIZJ("service_monitor", str));
    }

    @Override // X.InterfaceC792280V6c
    public final boolean LIZIZ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("log_type");
        String strOptString2 = jSONObject.optString("service");
        return ((HashSet) this.LIZ).contains(LIZJ(strOptString, strOptString2));
    }

    public static String LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("#");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
