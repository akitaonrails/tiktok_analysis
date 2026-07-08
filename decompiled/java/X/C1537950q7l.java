package X;

import android.app.Application;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0q7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537950q7l extends C09AY implements Function1<C1537480q70, Unit> {
    public C1537950q7l() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1537480q70 c1537480q70) throws JSONException {
        String tracingUUID;
        C1537480q70 c1537480q702 = c1537480q70;
        if (c1537480q702 instanceof SparkContext) {
            C1530570pvr.LIZJ(c1537480q702, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_PLUGIN_START}, null);
            C1541950qED.LIZJ.getClass();
            C1537900q7g.LJII();
            SparkContext sparkContext = (SparkContext) c1537480q702;
            if (!sparkContext.hasExecuteGlobalPreHandler) {
                sparkContext.hasExecuteGlobalPreHandler = true;
            }
            C1537900q7g.LJIIJJI(sparkContext);
            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            if (sparkSchemaParamLJJJI != null && (tracingUUID = sparkSchemaParamLJJJI.getTracingUUID()) != null) {
                c1537480q702.LJJIJIL(tracingUUID);
            }
            c1537480q702.dslPrefetchConfig.LIZ(c1537480q702);
            SparkContext sparkContext2 = (SparkContext) c1537480q702;
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1161970gLL.LIZIZ().getClass();
            C1537900q7g.LIZJ(sparkContext2, sparkSchemaParamLJJJI);
            C1537930q7j c1537930q7j = C1537930q7j.LIZ;
            Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
            c1537930q7j.getClass();
            C1537930q7j.LIZ(applicationLIZJ, sparkContext2, sparkSchemaParamLJJJI);
            C1537900q7g.LIZIZ(sparkSchemaParamLJJJI);
            if (!sparkContext2.hasParseSchema) {
                HybridSchemaParam hybridSchemaParamLIZ = C1545470qJt.LIZ(c1537480q702.LJIJI(), sparkContext2.LJJJ(), sparkContext2.bundle, c1537480q702.containerId);
                InterfaceC1531560pxS interfaceC1531560pxS = c1537480q702.hybridParams;
                if (interfaceC1531560pxS != null) {
                    interfaceC1531560pxS.LJ(hybridSchemaParamLIZ);
                }
            }
            C1530570pvr.LIZJ(c1537480q702, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_PLUGIN_END}, null);
        }
        return Unit.LIZ;
    }
}
