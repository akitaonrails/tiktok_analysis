package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21394518o3 {
    public final C21394718o5 LIZ;
    public long LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStayStart info:");
        sbLIZ.append(this.LIZ);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZ() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStayEnd info:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration:");
        sbLIZ.append(jCurrentTimeMillis);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
        EnumC1067640dtC enumC1067640dtC = this.LIZ.LIZLLL;
        int i = enumC1067640dtC == null ? -1 : C1324230kZ3.LIZ[enumC1067640dtC.ordinal()];
        String str = i != 1 ? i != 2 ? "" : "lynx" : "h5";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("project_name", this.LIZ.LIZ);
        jSONObject.put("enter_from", this.LIZ.LIZIZ);
        jSONObject.put("duration", jCurrentTimeMillis);
        jSONObject.put("fe_flag", 1);
        if (!this.LIZ.LIZJ.isEmpty()) {
            for (Map.Entry<String, Object> entry : this.LIZ.LIZJ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.onEventV3("stay_time", jSONObject);
        }
    }

    public C21394518o3(C21394718o5 c21394718o5) {
        this.LIZ = c21394718o5;
    }
}
