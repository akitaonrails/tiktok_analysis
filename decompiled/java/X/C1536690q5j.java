package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import com.tiktok.forestx.RequestParamsX;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.DeferredLynxTemplateTool$preloadTemplate$2", f = "DeferredLynxTemplateTool.kt", l = {456, 467}, m = "invokeSuspend")
public final class C1536690q5j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1537480q70 LLILZLL;
    public final /* synthetic */ Forest LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536690q5j(C1537480q70 c1537480q70, Forest forest, boolean z, InterfaceC1364105Vn<? super C1536690q5j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1537480q70;
        this.LLIZ = forest;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536690q5j(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLJIJ = obj;
        C1C7U.LIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLJIJ);
                    C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                    return objLJIJ;
                }
                C155000ia.LIZIZ(objLJIJ);
                C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                return objLJIJ;
            }
            C155000ia.LIZIZ(objLJIJ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1529870puj c1529870puj = C1529870puj.LIZ;
            C1537480q70 c1537480q70 = this.LLILZLL;
            c1529870puj.getClass();
            C1529870puj.LIZ(c1537480q70);
            C1536660q5g.LIZ.LIZ();
            Uri uri = UriProtector.parse(this.LLILZLL.LJIJI());
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_memory_cache"), "1")) {
                builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            }
            String string = builderBuildUpon.build().toString();
            this.LLILZLL.LJJIIZ(string);
            HybridSchemaParam hybridSchemaParamLIZ = C1545460qJs.LIZ(string);
            this.LLILZLL.resourcePreloadTriggered = true;
            C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(this.LLILZLL, false, this.LLIZ, 1);
            if (c1533020pzoLJIILJJIL != null) {
                C1537480q70 c1537480q702 = this.LLILZLL;
                boolean z2 = this.LLIZLLLIL;
                RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, byte[].class);
                if (C1535630q41.LJIJ) {
                    requestParamsX.allowRedirectInternally = false;
                }
                requestParamsX.groupId = c1537480q702.containerId;
                requestParamsX.enableMemoryCache = true;
                requestParamsX.source = "DeferredLynxTemplateTool";
                if (z2 && C1535630q41.LJIJI) {
                    requestParamsX.consumeType = TemplateBundle.class;
                }
                C1533760q10 c1533760q10 = c1537480q702.mainDocumentGeckoInfo;
                if (c1533760q10 != null) {
                    requestParamsX.accessKey = c1533760q10.LIZ;
                    requestParamsX.channel = c1533760q10.LIZIZ;
                    requestParamsX.bundle = c1533760q10.LIZJ;
                    requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
                }
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533710q0v.LJIIIZ(requestParamsX, hybridSchemaParamLIZ);
                String strLIZJ = C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true);
                this.LL = c1537480q702;
                this.LLILLJJLI = c1533020pzoLJIILJJIL;
                this.LLILLL = strLIZJ;
                this.LLILZ = this;
                this.LLILZIL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c1533020pzoLJIILJJIL.LIZ(strLIZJ, requestParamsX, new C1536710q5l(jCurrentTimeMillis, c2252611DEt, c1537480q702));
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                    return objLJFF;
                }
                C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                return objLJIJ;
            }
            JSONArray jSONArray2 = C1533710q0v.LIZ;
            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(this.LLILZLL, false);
            if (iResourceServiceXLIZIZ != null) {
                Forest forest = this.LLIZ;
                if ((iResourceServiceXLIZIZ instanceof C1533850q19) && forest != null && ((C1533850q19) iResourceServiceXLIZIZ).LIZ != forest) {
                    iResourceServiceXLIZIZ = new C1533850q19(forest);
                } else if ((iResourceServiceXLIZIZ instanceof C1533840q18) && forest != null) {
                    ((C1533840q18) iResourceServiceXLIZIZ).LIZ.LIZ = forest;
                }
            } else {
                Forest forest2 = this.LLIZ;
                if (forest2 != null) {
                    iResourceServiceXLIZIZ = new C1533850q19(forest2);
                } else {
                    this.LLILZLL.LJIJI();
                    C1536920q66 c1536920q66 = new C1536920q66(null, null, null, null, null, 8094);
                    C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                    return c1536920q66;
                }
            }
            RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
            boolean z3 = this.LLIZLLLIL;
            C1537480q70 c1537480q703 = this.LLILZLL;
            requestParams.loadToMemory = true;
            if (!z3) {
                z = true;
            } else {
                z = false;
            }
            requestParams.enableMemoryCache = Boolean.valueOf(z);
            requestParams.needLocalFile = false;
            if (C1535630q41.LJIJ) {
                requestParams.allowRedirectInternally = false;
            }
            if (z3 && C1535630q41.LJIJI && (iResourceServiceXLIZIZ instanceof C1533840q18)) {
                requestParams.consumeType = TemplateBundle.class;
                requestParams.dataSupplier = C1535630q41.LJJIFFI;
                requestParams.lightSupplier = C1535630q41.LJJII;
            }
            requestParams.customParams.put("rl_container_uuid", c1537480q703.containerId);
            requestParams.customParams.put("hybrid_channel", "Lynx_Template_Preload");
            requestParams.allowIOOnMainThread = true;
            C1533760q10 c1533760q102 = this.LLILZLL.mainDocumentGeckoInfo;
            if (c1533760q102 != null) {
                requestParams.accessKey = c1533760q102.LIZ;
                requestParams.channel = c1533760q102.LIZIZ;
                requestParams.bundle = c1533760q102.LIZJ;
                requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
            }
            C1533710q0v.LJIIIIZZ(requestParams, hybridSchemaParamLIZ);
            String strLIZJ2 = C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true);
            if (!Intrinsics.LJFF(strLIZJ2, string)) {
                requestParams.customParams.put("resource_url", string);
            }
            C1537480q70 c1537480q704 = this.LLILZLL;
            this.LL = iResourceServiceXLIZIZ;
            this.LLILLJJLI = requestParams;
            this.LLILLL = strLIZJ2;
            this.LLILZ = c1537480q704;
            this.LLILZIL = 2;
            C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt2.LJIJJ();
            iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(strLIZJ2, requestParams, new C1536700q5k(jCurrentTimeMillis, iResourceServiceXLIZIZ, c2252611DEt2, c1537480q704, strLIZJ2));
            objLJIJ = c2252611DEt2.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
                return objLJFF;
            }
            C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
            return objLJIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc.LIZIZ(C1490740otc.LIZ, "load template failed: " + th, null, "DeferredLynxTemplateTool", 2);
            this.LLILZLL.LJIJI();
            th.toString();
            C1536920q66 c1536920q662 = new C1536920q66(null, null, null, null, null, 8094);
            C1C7U.LIZIZ("DeferredLynxTemplateTool@5017.preloadTemplate$2");
            return c1536920q662;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1536920q66> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
