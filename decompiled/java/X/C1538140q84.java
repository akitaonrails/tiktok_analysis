package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538140q84 {
    public static final C1538140q84 LIZ = new C1538140q84();

    public final SparkContext LIZJ(String str, C1538590q8n c1538590q8n) {
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIIZ(str);
        LIZIZ(this, sparkContext, c1538590q8n, 4);
        return sparkContext;
    }

    public static void LIZ(SparkContext sparkContext, C1538590q8n c1538590q8n, HybridSchemaParam hybridSchemaParam) {
        int iIntValue;
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1539040q9W interfaceC1539040q9W;
        if (C1535630q41.LJJIJIIJI || Intrinsics.LJFF(C1535630q41.LIZIZ("fix_hybrid_init_dead_lock"), Boolean.TRUE)) {
            C1541950qED.LIZJ.LJIIL();
            C587540N2q.LIZ.getClass();
            ISparkInnerPIA iSparkInnerPIA = (ISparkInnerPIA) C587540N2q.LIZ(ISparkInnerPIA.class);
            if (iSparkInnerPIA != null) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                iSparkInnerPIA.warmup(sparkContext, C1161970gLL.LIZIZ().LIZJ());
            }
        }
        String strLJIJI = sparkContext.LJIJI();
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.START}, null);
        Long lLJI = C1550300qRg.LIZIZ.LJI();
        if (lLJI != null) {
            C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.APP_START}, Long.valueOf(System.currentTimeMillis() - lLJI.longValue()));
        }
        sparkContext.LJIIIZ().LIZJ("spark_container_name", "Spark");
        sparkContext.LJIIIZ().LIZJ("spark_schema", sparkContext.LJIJI());
        sparkContext.LJIIIZ().LIZJ("spark_container_version", "1.7.2");
        C1540240qBS.LIZ.getClass();
        String str = C1540240qBS.LIZIZ;
        if (str != null) {
            sparkContext.LJIIIZ().LIZJ("pre_schema", str);
        }
        C1540240qBS.LIZIZ = strLJIJI;
        C1537540q76.LIZLLL(sparkContext).LJFF = Long.valueOf(C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_INIT_DATA_START}, null));
        LIZLLL(sparkContext, c1538590q8n, hybridSchemaParam);
        C1538880q9G.LIZ.getClass();
        Integer numValueOf = C1538880q9G.LIZJ;
        if (numValueOf != null || ((interfaceC1539040q9W = C1538880q9G.LIZIZ) != null && (numValueOf = Integer.valueOf(interfaceC1539040q9W.LIZ())) != null)) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("networkLevel", Integer.valueOf(iIntValue)));
        sparkContext.runtimeInfo.putAll(mapLIZJ);
        C01GW<C1538070q7x> c01gw2 = C1538070q7x.LJ;
        C1326430kcb.LIZ().LJ(sparkContext.containerId, mapLIZJ);
        if (c1538590q8n.LJFF) {
            C1536840q5y.LIZLLL(sparkContext, null, null, true, 48);
        }
        if (c1538590q8n.LJI) {
            C1536840q5y.LIZIZ(sparkContext, null, null, true, null, 48);
        }
        if (c1538590q8n.LJII || ((interfaceC1531560pxS = sparkContext.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getEnablePreDecodeTemplate() == 1)) {
            InterfaceC497601wk interfaceC497601wk = sparkContext.coroutineScope;
            if (interfaceC497601wk == null) {
                interfaceC497601wk = C817503Hh.LL;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C372901cd(sparkContext, null), 3);
        }
    }

    public static void LIZLLL(SparkContext sparkContext, C1538590q8n c1538590q8n, HybridSchemaParam hybridSchemaParam) {
        if (sparkContext.hybridParams == null) {
            String strLJIJI = sparkContext.LJIJI();
            if (hybridSchemaParam == null) {
                hybridSchemaParam = C1545470qJt.LIZ(strLJIJI, sparkContext.LJJJ(), sparkContext.bundle, sparkContext.containerId);
            }
            C1537540q76.LIZLLL(sparkContext).LJI = Long.valueOf(C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_INIT_DATA_END}, null));
            C1537830q7Z c1537830q7Z = new C1537830q7Z(C1946007jm.LJ(strLJIJI), sparkContext);
            c1537830q7Z.LJJIJIIJIL = true;
            c1537830q7Z.LJJIIJ = hybridSchemaParam;
            sparkContext.LJJIIZ(strLJIJI);
            sparkContext.liteLynxConfig = c1538590q8n;
            sparkContext.hybridParams = c1537830q7Z;
        }
    }

    public static /* synthetic */ void LJ(C1538140q84 c1538140q84, SparkContext sparkContext, C1538590q8n c1538590q8n) {
        c1538140q84.getClass();
        LIZLLL(sparkContext, c1538590q8n, null);
    }

    public static /* synthetic */ void LIZIZ(C1538140q84 c1538140q84, SparkContext sparkContext, C1538590q8n c1538590q8n, int i) {
        if ((i & 2) != 0) {
            c1538590q8n = new C1538590q8n();
        }
        c1538140q84.getClass();
        LIZ(sparkContext, c1538590q8n, null);
    }
}
