package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BHN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BHN {
    public static final void LIZ(SparkThirdContext sparkThirdContext, String str, String str2) {
        C1BHT c1bht;
        C1BHS c1bhsLJIIIIZZ;
        String str3 = null;
        if (sparkThirdContext != null) {
            c1bht = sparkThirdContext.performanceState;
            if (c1bht != null) {
                if (c1bht.LIZIZ || c1bht.LIZ == 0) {
                    return;
                } else {
                    c1bht.LIZIZ = true;
                }
            }
        } else {
            c1bht = null;
        }
        C1BHO c1bho = C1554300qY8.LIZ;
        if (c1bho != null && (c1bhsLJIIIIZZ = c1bho.LJIIIIZZ()) != null) {
            JSONObject jSONObjectPut = new JSONObject().put("result", str);
            if (c1bht != null) {
                jSONObjectPut.put("duration", SystemClock.uptimeMillis() - c1bht.LIZ);
            }
            if (str2 != null) {
                jSONObjectPut.put("reason", str2);
            }
            EnumC1152590g6D enumC1152590g6D = EnumC1152590g6D.CONTAINER_CREATED;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report ");
            sbLIZ.append(enumC1152590g6D.getEventName());
            sbLIZ.append(" url=");
            if (sparkThirdContext != null) {
                str3 = sparkThirdContext.url;
            }
            sbLIZ.append(str3);
            sbLIZ.append(" payload=");
            sbLIZ.append(jSONObjectPut);
            C2188811AlT.LIZIZ(sbLIZ);
            c1bhsLJIIIIZZ.LIZ(enumC1152590g6D, jSONObjectPut);
        }
    }
}
