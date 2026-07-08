package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.schema.SparkSchemaModifier;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530010pux {
    public static SparkSchemaModifier LIZ(n nVar, InterfaceC1530020puy interfaceC1530020puy) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = "";
        int iIntValue = -1;
        try {
            Integer numLIZ = interfaceC1530020puy.LIZ(nVar);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            }
            String strLIZIZ = interfaceC1530020puy.LIZIZ(nVar);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            SparkSchemaModifier sparkSchemaModifier = new SparkSchemaModifier(nVar, str, iIntValue);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" version ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" is finished in ");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append(" ms");
            C1530030puz.LIZIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ), null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", iIntValue);
            jSONObject.put("time_cost", jCurrentTimeMillis2);
            jSONObject.put("identifier", str);
            LIZIZ("SparkSchemaModifierParse", jSONObject, null);
            return sparkSchemaModifier;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error occurs when parsing ");
            sbLIZ2.append(str);
            sbLIZ2.append(" version ");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(": ");
            sbLIZ2.append(th);
            C1530030puz.LIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ2), null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time_cost", System.currentTimeMillis() - jCurrentTimeMillis);
            jSONObject2.put("error", th.getMessage());
            jSONObject2.put("version", iIntValue);
            jSONObject2.put("identifier", str);
            LIZIZ("SparkSchemaModifierParse", jSONObject2, null);
            return null;
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject, SparkContext sparkContext) {
        String str2;
        String str3;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        if (sparkContext == null || (str3 = sparkContext.bid) == null) {
            str3 = "hybridkit_default_bid";
        }
        c1520360pfO.LIZIZ = str3;
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(0);
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(str2, c1520360pfO.LIZ());
    }
}
