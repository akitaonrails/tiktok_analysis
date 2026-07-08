package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.ISSPService;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537930q7j {
    public static final C1537930q7j LIZ = new C1537930q7j();

    public static void LIZ(Context context, SparkContext sparkContext, SparkSchemaParam sparkSchemaParam) {
        C1536330q59 c1536330q59BootSSPLifecycle;
        if (sparkContext.LJJJ().get("ssp_config") == null && !a0.LJJIIZI(sparkContext.LJIJI(), "ssp_config", false)) {
            return;
        }
        if (sparkContext.hasBootSSP) {
            C1530030puz.LIZIZ("SspLifeCycle", "has boot ssp", sparkContext);
            return;
        }
        sparkContext.hasBootSSP = true;
        if (sparkSchemaParam == null) {
            SparkContext sparkContext2 = new SparkContext();
            sparkContext2.LJJLIIJ(sparkContext.LJIJI());
            sparkSchemaParam = sparkContext2.LJJJI(-1);
            if (sparkSchemaParam == null) {
                return;
            }
        }
        if (sparkSchemaParam.getSspConfig() <= 0) {
            return;
        }
        C1540240qBS.LIZ.getClass();
        String strLIZLLL = C1540240qBS.LIZLLL(sparkContext, sparkSchemaParam);
        if (strLIZLLL != null && C1546560qLe.LIZ.LJ(sparkContext.LJIJI(), strLIZLLL) != null) {
            return;
        }
        C1530030puz.LIZIZ("SspLifeCycle_", "boot SspLifeCycle. URL: " + sparkContext.LJIJI(), sparkContext);
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        ISSPService iSSPService = (ISSPService) C1075530e5v.LIZIZ().LIZIZ(ISSPService.class, sparkContext.bidFrom);
        if (iSSPService != null && (c1536330q59BootSSPLifecycle = iSSPService.bootSSPLifecycle(context, sparkContext, sparkSchemaParam)) != null) {
            sparkContext.LJJ(C1536330q59.class, c1536330q59BootSSPLifecycle);
            sparkContext.LJJJJZI(new C1554520qYU(c1536330q59BootSSPLifecycle, 7));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("boot success, url:");
            sbLIZ.append(sparkContext.LJIJI());
            C1530030puz.LIZIZ("SspLifeCycle", C2188811AlT.LIZIZ(sbLIZ), sparkContext);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("boot failed, url:");
        sbLIZ2.append(sparkContext.LJIJI());
        C1530030puz.LIZIZ("SspLifeCycle", C2188811AlT.LIZIZ(sbLIZ2), sparkContext);
    }
}
