package Y;

import X.AbstractC1536820q5w;
import X.C1482970oh5;
import X.C1533020pzo;
import X.C1533710q0v;
import X.C1536660q5g;
import X.C1536810q5v;
import X.C1537480q70;
import X.C1545460qJs;
import X.C1C7U;
import X.C2179971ATj;
import X.EnumC1533980q1M;
import X.InterfaceC1479620obg;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import com.tiktok.forestx.RequestParamsX;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS12S0310000_23 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S0310000_23.LIZ$0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S0310000_23.LIZ$1():void");
    }

    public final void LIZ$2() {
        C1536660q5g.LIZ.LIZ();
        Uri uri = UriProtector.parse(((C1537480q70) this.l0).LJIJI());
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_memory_cache"), "1")) {
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
        }
        String string = builderBuildUpon.build().toString();
        ((C1537480q70) this.l0).LJJIIZ(string);
        HybridSchemaParam hybridSchemaParamLIZ = C1545460qJs.LIZ(string);
        ((C1537480q70) this.l0).resourcePreloadTriggered = true;
        try {
            C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL((C1537480q70) this.l0, false, (Forest) this.l1, 1);
            if (c1533020pzoLJIILJJIL != null) {
                C1537480q70 c1537480q70 = (C1537480q70) this.l0;
                boolean z = this.z3;
                AbstractC1536820q5w abstractC1536820q5w = (AbstractC1536820q5w) this.l2;
                RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, byte[].class);
                requestParamsX.source = "PdpLynxTemplateTool";
                requestParamsX.groupId = c1537480q70.containerId;
                if (z) {
                    requestParamsX.consumeType = TemplateBundle.class;
                }
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533710q0v.LJIIIZ(requestParamsX, hybridSchemaParamLIZ);
                c1533020pzoLJIILJJIL.LIZ(C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true), requestParamsX, new AwS389S0200000_23(abstractC1536820q5w, c1537480q70, 19));
                return;
            }
            Forest forest = (Forest) this.l1;
            if (forest == null) {
                JSONArray jSONArray2 = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ((C1537480q70) this.l0, false);
                if (iResourceServiceXLIZIZ == null || (forest = iResourceServiceXLIZIZ.getForest()) == null) {
                    AbstractC1536820q5w abstractC1536820q5w2 = (AbstractC1536820q5w) this.l2;
                    if (abstractC1536820q5w2 != null) {
                        abstractC1536820q5w2.LIZ("ResourceLoader Not Found!");
                        return;
                    }
                    return;
                }
            }
            RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
            C1537480q70 c1537480q702 = (C1537480q70) this.l0;
            requestParams.loadToMemory = true;
            requestParams.needLocalFile = Boolean.FALSE;
            requestParams.customParams.put("rl_container_uuid", c1537480q702.containerId);
            requestParams.allowIOOnMainThread = true;
            JSONArray jSONArray3 = C1533710q0v.LIZ;
            C1533710q0v.LJIIIIZZ(requestParams, hybridSchemaParamLIZ);
            String strLIZJ = C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true);
            if (!Intrinsics.LJFF(strLIZJ, string)) {
                requestParams.customParams.put("resource_url", string);
            }
            forest.fetchResourceAsync(strLIZJ, requestParams, new AwS389S0200000_23((AbstractC1536820q5w) this.l2, (C1537480q70) this.l0, 20));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AbstractC1536820q5w abstractC1536820q5w3 = (AbstractC1536820q5w) this.l2;
            if (abstractC1536820q5w3 != null) {
                abstractC1536820q5w3.LIZ(th.toString());
            }
        }
    }

    public static final void run$0(ARunnableS12S0310000_23 aRunnableS12S0310000_23) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultNetAdapter@38e7.send$1");
        try {
            aRunnableS12S0310000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultNetAdapter@38e7.send$1");
    }

    public static final void run$1(ARunnableS12S0310000_23 aRunnableS12S0310000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SccNetAdapter@3608.send$1");
        try {
            aRunnableS12S0310000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SccNetAdapter@3608.send$1");
    }

    public static final void run$2(ARunnableS12S0310000_23 aRunnableS12S0310000_23) {
        C1C7U.LIZ("PreRenderStrategy@3bb6.triggerPreRenderReal$1");
        try {
            C1482970oh5 c1482970oh5 = (C1482970oh5) aRunnableS12S0310000_23.l2;
            boolean z = aRunnableS12S0310000_23.z3;
            InterfaceC1479620obg interfaceC1479620obg = (InterfaceC1479620obg) aRunnableS12S0310000_23.l0;
            c1482970oh5.getClass();
            if (!TextUtils.equals(interfaceC1479620obg.getFormat(), "mp3")) {
                c1482970oh5.LJII.LIZIZ(z);
            }
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2179971ATj.LIZ(th)) {
                C1C7U.LIZIZ("PreRenderStrategy@3bb6.triggerPreRenderReal$1");
                return;
            }
            throw th;
        }
    }

    public static final void run$3(ARunnableS12S0310000_23 aRunnableS12S0310000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PdpLynxTemplateTool@1243.preloadTemplate$runnable$1");
        try {
            aRunnableS12S0310000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpLynxTemplateTool@1243.preloadTemplate$runnable$1");
    }

    public ARunnableS12S0310000_23(Forest forest, SparkContext sparkContext, C1536810q5v c1536810q5v, int i) {
        this.$t = i;
        this.l0 = sparkContext;
        this.l1 = forest;
        this.l2 = c1536810q5v;
        this.z3 = true;
    }

    public ARunnableS12S0310000_23(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }

    public ARunnableS12S0310000_23(C1482970oh5 c1482970oh5, int i, boolean z, InterfaceC1479620obg interfaceC1479620obg, InterfaceC1479620obg interfaceC1479620obg2, int i2) {
        this.$t = i2;
        this.l2 = c1482970oh5;
        this.z3 = z;
        this.l0 = interfaceC1479620obg;
        this.l1 = interfaceC1479620obg2;
    }
}
