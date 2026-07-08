package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q78, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537560q78 extends C09AY implements InterfaceC1631620sYq<Context, String, C1537480q70, Object> {
    public final /* synthetic */ C1523810pkx LL;
    public final /* synthetic */ ECSparkPreloadInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537560q78(C1523810pkx c1523810pkx, ECSparkPreloadInfo eCSparkPreloadInfo, String str) {
        super(3);
        this.LL = c1523810pkx;
        this.LLILLJJLI = eCSparkPreloadInfo;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Context context, String str, C1537480q70 c1537480q70) {
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParam;
        SparkSchemaParam sparkSchemaParamLJJJI;
        Context context2 = context;
        C1537480q70 c1537480q702 = c1537480q70;
        Object objLIZ = null;
        if (c1537480q702 instanceof SparkContext) {
            sparkContext = (SparkContext) c1537480q702;
        } else {
            sparkContext = null;
        }
        if (sparkContext == null) {
            C1523770pkt c1523770pkt = C1523770pkt.LIZ;
            C1523810pkx c1523810pkx = this.LL;
            c1523770pkt.getClass();
            sparkContext = new SparkContext();
            sparkContext.usePreload = true;
            if (c1523810pkx != null) {
                sparkContext.LJJ(AbstractC1537120q6Q.class, new C1523820pky(c1523810pkx));
            }
        }
        new C1547240qMk().LIZ(sparkContext);
        String strLJIJI = sparkContext.LJIJI();
        String str2 = "sparklite";
        int iHashCode = 0;
        if (Intrinsics.LJFF(this.LLILLJJLI.containerType, "sparklite") || ((sparkSchemaParamLJJJI = sparkContext.LJJJI(-1)) != null && sparkSchemaParamLJJJI.getEnableLiteMode())) {
            C1523770pkt.LIZ.getClass();
            sparkContext.LJJLIIJ(strLJIJI);
            C1538140q84 c1538140q84 = C1538140q84.LIZ;
            C1538590q8n c1538590q8n = new C1538590q8n();
            SparkSchemaParam sparkSchemaParamLJJJI2 = sparkContext.LJJJI(-1);
            if (sparkSchemaParamLJJJI2 != null && sparkSchemaParamLJJJI2.getEnablePreDecodeTemplate() == 1) {
                c1538590q8n.LJII = true;
            }
            C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
            if (interfaceC1531560pxS == null || (hybridSchemaParam = interfaceC1531560pxS.LIZJ()) == null) {
                hybridSchemaParam = new HybridSchemaParam(EnumC1067640dtC.LYNX);
            }
            InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext, context2, null);
            if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
                objLIZ = interfaceC1541990qEHLIZIZ;
            }
        } else {
            C1523770pkt.LIZ.getClass();
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            sparkContext.LJJLIIJ(strLJIJI);
            c1537900q7g.getClass();
            objLIZ = new C1541950qED(context2, sparkContext).LIZ(false);
            str2 = "spark";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" preloadViewFactory, schema: ");
        sbLIZ.append(strLJIJI);
        sbLIZ.append(", hashCode: ");
        if (c1537480q702 != null) {
            iHashCode = c1537480q702.hashCode();
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", containerType: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return objLIZ;
    }
}
