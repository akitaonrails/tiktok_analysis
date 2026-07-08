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

/* JADX INFO: renamed from: X.0q7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537580q7A extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ C1537720q7O LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537580q7A(C1537720q7O c1537720q7O, C259800zU<String> c259800zU, boolean z, long j, boolean z2, String str) {
        super(1);
        this.LL = c1537720q7O;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = z2;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) throws Throwable {
        Object obj;
        TemplateBundle templateBundleLIZIZ;
        ByteBuffer byteBuffer;
        final byte[] bArrLJIIJ;
        C1537260q6e c1537260q6e;
        TemplateBundle templateBundleLJIILLIIL;
        HybridSchemaParam hybridSchemaParam;
        Integer numValueOf;
        int iIntValue;
        C1537910q7h c1537910q7h;
        C1537910q7h c1537910q7h2;
        String str;
        String str2;
        C1536760q5q c1536760q5q;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        this.LL.getHybridContext();
        if (c1532310pyf2.isSuccess()) {
            this.LL.getHybridContext().LJJ(C1532310pyf.class, c1532310pyf2);
            C1537910q7h c1537910q7h3 = this.LL.LLILZIL;
            if (c1537910q7h3 != null && (c1536760q5q = c1537910q7h3.LJIJI) != null) {
                c1536760q5q.LJFF(c1532310pyf2);
            }
            System.currentTimeMillis();
            AbstractC1532350pyj<?> abstractC1532350pyjLJII = c1532310pyf2.LJII();
            if (abstractC1532350pyjLJII != null) {
                obj = abstractC1532350pyjLJII.LIZ;
            } else {
                obj = null;
            }
            if (obj instanceof TemplateBundle) {
                templateBundleLIZIZ = (TemplateBundle) obj;
            } else {
                templateBundleLIZIZ = null;
            }
            if (obj instanceof ByteBuffer) {
                byteBuffer = (ByteBuffer) obj;
            } else {
                byteBuffer = null;
            }
            if (templateBundleLIZIZ == null && byteBuffer == null) {
                if (!(obj instanceof byte[]) || (bArrLJIIJ = (byte[]) obj) == null) {
                    bArrLJIIJ = c1532310pyf2.LJIIJ();
                }
            } else {
                bArrLJIIJ = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bArrLJIIJ == null && templateBundleLIZIZ == null && byteBuffer == null) {
                this.LL.LJJIFFI(this.LLILLJJLI.element, c1532310pyf2, 205, "forest load succeeded but null bytes");
            } else {
                C1530570pvr.LJ(this.LL.getHybridContext(), "spark_main_res_state", 2);
                C1537540q76.LIZLLL(this.LL.getHybridContext()).LJIILLIIL = Long.valueOf(C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_TEMPLATE_END}, Long.valueOf(System.currentTimeMillis())));
                this.LL.getHybridContext().LJFF(C1538200q8A.class);
                if (templateBundleLIZIZ != null) {
                    C1537720q7O c1537720q7O = this.LL;
                    if (c1532310pyf2.LJ || c1532310pyf2.LIZLLL) {
                        C1530570pvr.LJFF(c1537720q7O.getHybridContext(), EnumC1537150q6T.OPT_PRE_DECODE, 1);
                    }
                    c1537720q7O.getHybridContext().LJJ(TemplateBundle.class, templateBundleLIZIZ);
                }
                if (byteBuffer != null) {
                    this.LL.getHybridContext().LJJ(ByteBuffer.class, byteBuffer);
                }
                final String strLIZ = c1532310pyf2.LIZ.LJJIII.LIZ;
                String str3 = this.LLILZLL;
                if (strLIZ.length() == 0) {
                    C1529350ptt c1529350ptt = c1532310pyf2.LIZ.LJJIIJ;
                    if (c1529350ptt != null) {
                        str = c1529350ptt.LIZIZ;
                    } else {
                        str = null;
                    }
                    String str4 = "";
                    if (str == null) {
                        str = "";
                    }
                    if (c1529350ptt != null && (str2 = c1529350ptt.LIZJ) != null) {
                        str4 = str2;
                    }
                    strLIZ = C1533270q0D.LIZ(str, str4, str3);
                }
                if (this.LLILLL || ((c1537910q7h2 = this.LL.LLILZIL) != null && c1537910q7h2.LJJIZ)) {
                    long jLIZJ = C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.EXTRA_INFO_CALLBACK_START}, Long.valueOf(System.currentTimeMillis()));
                    Map<String, ? extends Object> mapLJJIIJZLJL = this.LL.LJJIIJZLJL(null, c1532310pyf2, templateBundleLIZIZ, byteBuffer, bArrLJIIJ, strLIZ);
                    if (mapLJJIIJZLJL != null) {
                        C1537720q7O c1537720q7O2 = this.LL;
                        C1537910q7h c1537910q7h4 = c1537720q7O2.LLILZIL;
                        if (c1537910q7h4 != null && (c1537260q6e = c1537910q7h4.LJIJJLI) != null) {
                            c1537260q6e.LIZ(mapLJJIIJZLJL);
                        }
                        c1537720q7O2.LJJIIJ(mapLJJIIJZLJL);
                    }
                    if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
                        C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "extra_info"), new Pair("duration", Long.valueOf(C1530570pvr.LIZJ(this.LL.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.EXTRA_INFO_CALLBACK_END}, Long.valueOf(System.currentTimeMillis())) - jLIZJ))));
                    }
                }
                Map<String, Object> globalProps = this.LL.getGlobalProps();
                if (globalProps == null || !globalProps.containsKey("abParams")) {
                    C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                    C1326430kcb.LIZ().LIZLLL(this.LL.getHybridContext().containerId);
                }
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533710q0v.LJII(this.LL.getHybridContext().templateResData, c1532310pyf2, this.LLILZ, jCurrentTimeMillis);
                if (this.LLILZIL || ((c1537910q7h = this.LL.LLILZIL) != null && c1537910q7h.LJJIJL && c1537910q7h.LJJIIZI)) {
                    C1537910q7h c1537910q7h5 = this.LL.LLILZIL;
                    if (c1537910q7h5 == null || c1537910q7h5.LJIILLIIL() == null) {
                        C1537910q7h c1537910q7h6 = this.LL.LLILZIL;
                        if (c1537910q7h6 != null) {
                            if (templateBundleLIZIZ == null) {
                                if (bArrLJIIJ != null) {
                                    C1537660q7I c1537660q7I = new C1537660q7I();
                                    c1537660q7I.LIZ = strLIZ;
                                    templateBundleLIZIZ = TemplateBundle.LIZIZ(bArrLJIIJ, c1537660q7I.LIZ());
                                } else {
                                    templateBundleLIZIZ = null;
                                }
                            }
                            c1537910q7h6.LJJIII(templateBundleLIZIZ);
                        }
                        C1537910q7h c1537910q7h7 = this.LL.LLILZIL;
                        if (c1537910q7h7 != null) {
                            c1537910q7h7.LJJIFFI(bArrLJIIJ);
                        }
                        this.LL.getHybridContext().LJJ(C1532310pyf.class, c1532310pyf2);
                    }
                    C1537910q7h c1537910q7h8 = this.LL.LLILZIL;
                    if (c1537910q7h8 != null && (templateBundleLJIILLIIL = c1537910q7h8.LJIILLIIL()) != null) {
                        String str5 = this.LLILZLL;
                        C1537720q7O c1537720q7O3 = this.LL;
                        if (C1535630q41.LJIL) {
                            C1535980q4a c1535980q4a = C1535980q4a.LIZ;
                            C1532710pzJ c1532710pzJ = c1532310pyf2.LIZ;
                            InterfaceC1532190pyT interfaceC1532190pyT = c1532310pyf2.LJII;
                            c1535980q4a.getClass();
                            C1535980q4a.LIZLLL("LiteLynxKitView", c1532710pzJ, interfaceC1532190pyT, templateBundleLJIILLIIL);
                        } else {
                            C1537890q7f c1537890q7f = C1537890q7f.LIZ;
                            C1537480q70 hybridContext = c1537720q7O3.getHybridContext();
                            c1537890q7f.getClass();
                            templateBundleLJIILLIIL.LJI(C1537890q7f.LIZIZ(hybridContext, str5), null);
                        }
                    }
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "enable pre code cache", null, "PreCodeCache", 2);
                    C1520080pew.LJFF(this.LL.getHybridContext().containerId, "lynx_precodecache", "use", null, this.LLILZLL, this.LL.getHybridContext().bid, null, null, 200);
                }
                C1537910q7h c1537910q7h9 = this.LL.LLILZIL;
                if (c1537910q7h9 != null && (hybridSchemaParam = c1537910q7h9.LJJIIJ) != null && ((iIntValue = (numValueOf = Integer.valueOf(hybridSchemaParam.getParallelFetchResource())).intValue()) == 1 || iIntValue == 2)) {
                    final C1537720q7O c1537720q7O4 = this.LL;
                    final String str6 = this.LLILZLL;
                    numValueOf.intValue();
                    C086F c086f = C086F.LIZ;
                    Runnable runnable = new Runnable() { // from class: X.0q7H
                        public final void LIZ() throws JSONException {
                            c1537720q7O4.LJIJJ(strLIZ, bArrLJIIJ);
                            C1520080pew.LJFF(c1537720q7O4.getHybridContext().containerId, "container_resource_preload", "use", null, str6, c1537720q7O4.getHybridContext().bid, null, null, 200);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiteLynxKitView@73dd.loadWithResourceGroupX$1$8$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiteLynxKitView@73dd.loadWithResourceGroupX$1$8$1");
                        }
                    };
                    c086f.getClass();
                    C086F.LJII(runnable);
                } else {
                    this.LL.LJIJJ(strLIZ, bArrLJIIJ);
                }
            }
        } else {
            C1537720q7O c1537720q7O5 = this.LL;
            String str7 = this.LLILLJJLI.element;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forest load failed, ");
            sbLIZ.append(c1532310pyf2.LIZJ.LIZJ());
            c1537720q7O5.LJJIFFI(str7, c1532310pyf2, 204, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
