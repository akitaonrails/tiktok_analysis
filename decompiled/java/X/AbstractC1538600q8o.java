package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IParseMetaConfigAPI;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1538600q8o {
    public boolean LIZJ(SparkContext sparkContext) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.hybrid.spark.SparkContext r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1538600q8o.LIZLLL(com.bytedance.hybrid.spark.SparkContext):void");
    }

    public void LIZIZ(SparkContext sparkContext, String str) {
        if (LIZJ(sparkContext)) {
            String strLJIJI = sparkContext.LJIJI();
            String strLIZIZ = C1542410qEx.LIZIZ(UriProtector.parse(strLJIJI), "target_handler");
            String str2 = sparkContext.containerId;
            C1520360pfO c1520360pfO = new C1520360pfO("pluginStrictGlobal");
            c1520360pfO.LIZIZ = "sparkTrace";
            c1520360pfO.LIZ = strLJIJI;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("businessFrom", str);
            jSONObject.put("targetHandler", strLIZIZ);
            c1520360pfO.LIZLLL = jSONObject;
            C1520080pew.LIZ(str2, c1520360pfO.LIZ());
            LIZLLL(sparkContext);
            return;
        }
        C587540N2q.LIZ.getClass();
        IParseMetaConfigAPI iParseMetaConfigAPI = (IParseMetaConfigAPI) C587540N2q.LIZ(IParseMetaConfigAPI.class);
        if (iParseMetaConfigAPI != null) {
            iParseMetaConfigAPI.configSparkPlatform(sparkContext);
        }
        LIZLLL(sparkContext);
    }

    public static void LIZ(AbstractC1538680q8w abstractC1538680q8w, boolean z, SparkContext sparkContext, String str) {
        if (abstractC1538680q8w instanceof AbstractC1538690q8x) {
            if (z) {
                AbstractC1538690q8x abstractC1538690q8x = (AbstractC1538690q8x) abstractC1538680q8w;
                if (str == null) {
                    str = "";
                }
                abstractC1538690q8x.LJFF(sparkContext, str);
                return;
            }
            AbstractC1538690q8x abstractC1538690q8x2 = (AbstractC1538690q8x) abstractC1538680q8w;
            if (str == null) {
                str = "";
            }
            abstractC1538690q8x2.LJ(sparkContext, str);
            return;
        }
        if (!(abstractC1538680q8w instanceof AbstractC1538680q8w)) {
            return;
        }
        if (z) {
            abstractC1538680q8w.LIZIZ(sparkContext);
        } else {
            abstractC1538680q8w.LIZ(sparkContext);
        }
    }
}
