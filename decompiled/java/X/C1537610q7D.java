package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.scene.Scene;
import com.lynx.tasm.TemplateBundle;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0q7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537610q7D extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1537720q7O LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537610q7D(C1537720q7O c1537720q7O, C259800zU<String> c259800zU, long j, String str) {
        super(1);
        this.LL = c1537720q7O;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) throws Throwable {
        Object obj;
        TemplateBundle templateBundle;
        ByteBuffer byteBuffer;
        final byte[] bArrLJIIIZ;
        HybridSchemaParam hybridSchemaParam;
        Integer numValueOf;
        int iIntValue;
        TemplateBundle templateBundleLJIILLIIL;
        C1537260q6e c1537260q6e;
        C1536760q5q c1536760q5q;
        C1533790q13 c1533790q132 = c1533790q13;
        this.LL.getHybridContext();
        if (c1533790q132.LIZIZ) {
            C1537910q7h c1537910q7h = this.LL.LLILZIL;
            if (c1537910q7h != null && (c1536760q5q = c1537910q7h.LJIJI) != null) {
                c1536760q5q.LJ(c1533790q132);
            }
            System.currentTimeMillis();
            AbstractC1534220q1k<?> abstractC1534220q1kLIZ = c1533790q132.LIZ();
            if (abstractC1534220q1kLIZ != null) {
                obj = abstractC1534220q1kLIZ.LIZLLL;
            } else {
                obj = null;
            }
            if (obj instanceof TemplateBundle) {
                templateBundle = (TemplateBundle) obj;
            } else {
                templateBundle = null;
            }
            if (obj instanceof ByteBuffer) {
                byteBuffer = (ByteBuffer) obj;
            } else {
                byteBuffer = null;
            }
            if (templateBundle == null && byteBuffer == null) {
                if (!(obj instanceof byte[]) || (bArrLJIIIZ = (byte[]) obj) == null) {
                    bArrLJIIIZ = c1533790q132.LJIIIZ();
                }
            } else {
                bArrLJIIIZ = null;
            }
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            if (C1161970gLL.LIZIZ().LIZ) {
                getClass();
                getClass();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bArrLJIIIZ == null && templateBundle == null && byteBuffer == null) {
                this.LL.LJJI(this.LLILLJJLI.element, c1533790q132, 205, "forest load succeeded but null bytes");
            } else {
                C1530570pvr.LJ(this.LL.getHybridContext(), "spark_main_res_state", 2);
                C1537540q76.LIZLLL(this.LL.getHybridContext()).LJIILLIIL = Long.valueOf(C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_END}, Long.valueOf(System.currentTimeMillis())));
                this.LL.getHybridContext().LJFF(C1538200q8A.class);
                if (templateBundle != null) {
                    C1537720q7O c1537720q7O = this.LL;
                    if (c1533790q132.LJJIJIIJI || c1533790q132.LJJIJL) {
                        C1530570pvr.LJFF(c1537720q7O.getHybridContext(), EnumC1537150q6T.OPT_PRE_DECODE, 1);
                    }
                    c1537720q7O.getHybridContext().LJJ(TemplateBundle.class, templateBundle);
                }
                if (byteBuffer != null) {
                    this.LL.getHybridContext().LJJ(ByteBuffer.class, byteBuffer);
                }
                if (C1535630q41.LJIILJJIL) {
                    this.LL.setForestResponse(c1533790q132);
                }
                final String strLIZ = c1533790q132.LIZ.LJJJJIZL;
                String str = this.LLILZ;
                if (strLIZ.length() == 0) {
                    C1533510q0b c1533510q0b = c1533790q132.LIZ.LJJJJLI;
                    strLIZ = C1533270q0D.LIZ(c1533510q0b.LIZIZ, c1533510q0b.LIZJ, str);
                }
                C1537720q7O c1537720q7O2 = this.LL;
                C1537910q7h c1537910q7h2 = c1537720q7O2.LLILZIL;
                if (c1537910q7h2 != null && c1537910q7h2.LJJIZ) {
                    long jLIZJ = C1530570pvr.LIZJ(c1537720q7O2.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.EXTRA_INFO_CALLBACK_START}, Long.valueOf(System.currentTimeMillis()));
                    Map<String, ? extends Object> mapLJJIIJZLJL = this.LL.LJJIIJZLJL(c1533790q132, null, templateBundle, byteBuffer, bArrLJIIIZ, strLIZ);
                    if (mapLJJIIJZLJL != null) {
                        C1537720q7O c1537720q7O3 = this.LL;
                        C1537910q7h c1537910q7h3 = c1537720q7O3.LLILZIL;
                        if (c1537910q7h3 != null && (c1537260q6e = c1537910q7h3.LJIJJLI) != null) {
                            c1537260q6e.LIZ(mapLJJIIJZLJL);
                        }
                        c1537720q7O3.LJJIIJ(mapLJJIIJZLJL);
                    }
                    if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
                        C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "extra_info"), new Pair("duration", Long.valueOf(C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.EXTRA_INFO_CALLBACK_END}, Long.valueOf(System.currentTimeMillis())) - jLIZJ))));
                    }
                }
                Map<String, Object> globalProps = this.LL.getGlobalProps();
                if (globalProps == null || !globalProps.containsKey("abParams")) {
                    C01GW<C1538070q7x> c01gw2 = C1538070q7x.LJ;
                    C1326430kcb.LIZ().LIZLLL(this.LL.getHybridContext().containerId);
                }
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533710q0v.LJI(this.LLILLJJLI.element, this.LL.getHybridContext().templateResData, c1533790q132, this.LLILLL, jCurrentTimeMillis, false);
                C1537910q7h c1537910q7h4 = this.LL.LLILZIL;
                if (c1537910q7h4 != null && c1537910q7h4.LJJIJL && c1537910q7h4.LJJIIZI) {
                    if (c1537910q7h4.LJIILLIIL() == null) {
                        C1537910q7h c1537910q7h5 = this.LL.LLILZIL;
                        if (c1537910q7h5 != null) {
                            C1537660q7I c1537660q7I = new C1537660q7I();
                            c1537660q7I.LIZ = strLIZ;
                            c1537910q7h5.LJJIII(TemplateBundle.LIZIZ(bArrLJIIIZ, c1537660q7I.LIZ()));
                        }
                        C1537910q7h c1537910q7h6 = this.LL.LLILZIL;
                        if (c1537910q7h6 != null) {
                            c1537910q7h6.LJJIFFI(bArrLJIIIZ);
                        }
                        this.LL.getHybridContext().LJJ(C1533790q13.class, c1533790q132);
                    }
                    C1537910q7h c1537910q7h7 = this.LL.LLILZIL;
                    if (c1537910q7h7 != null && (templateBundleLJIILLIIL = c1537910q7h7.LJIILLIIL()) != null) {
                        String str2 = this.LLILZ;
                        C1537720q7O c1537720q7O4 = this.LL;
                        C1537890q7f c1537890q7f = C1537890q7f.LIZ;
                        C1537480q70 hybridContext = c1537720q7O4.getHybridContext();
                        c1537890q7f.getClass();
                        templateBundleLJIILLIIL.LJI(C1537890q7f.LIZIZ(hybridContext, str2), null);
                    }
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "enable pre code cache", null, "PreCodeCache", 2);
                    C1520080pew.LJFF(this.LL.getHybridContext().containerId, "lynx_precodecache", "use", null, this.LLILZ, this.LL.getHybridContext().bid, null, null, 200);
                }
                C1537910q7h c1537910q7h8 = this.LL.LLILZIL;
                if (c1537910q7h8 != null && (hybridSchemaParam = c1537910q7h8.LJJIIJ) != null && ((iIntValue = (numValueOf = Integer.valueOf(hybridSchemaParam.getParallelFetchResource())).intValue()) == 1 || iIntValue == 2)) {
                    final C1537720q7O c1537720q7O5 = this.LL;
                    final String str3 = this.LLILZ;
                    numValueOf.intValue();
                    C086F c086f = C086F.LIZ;
                    Runnable runnable = new Runnable() { // from class: X.0q7G
                        public final void LIZ() throws JSONException {
                            c1537720q7O5.LJIJJ(strLIZ, bArrLJIIIZ);
                            C1520080pew.LJFF(c1537720q7O5.getHybridContext().containerId, "container_resource_preload", "use", null, str3, c1537720q7O5.getHybridContext().bid, null, null, 200);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiteLynxKitView@73dd.loadWithForest$3$7$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiteLynxKitView@73dd.loadWithForest$3$7$1");
                        }
                    };
                    c086f.getClass();
                    C086F.LJII(runnable);
                } else {
                    this.LL.LJIJJ(strLIZ, bArrLJIIIZ);
                }
            }
        } else {
            this.LL.LJJI(this.LLILLJJLI.element, c1533790q132, 204, "forest load failed");
        }
        return Unit.LIZ;
    }
}
