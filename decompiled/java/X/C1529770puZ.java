package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.tiktok.forestx.RequestParamsX;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0puZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.jsruntime.SparkLynxJSRuntime$loadScript$1", f = "SparkLynxJSRuntime.kt", l = {}, m = "invokeSuspend")
public final class C1529770puZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1540540qBw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529770puZ(C1540540qBw c1540540qBw, InterfaceC1364105Vn<? super C1529770puZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1540540qBw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529770puZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1533790q13 c1533790q13LIZIZ;
        C1532310pyf c1532310pyfLIZ;
        String str;
        Object obj2;
        C1C7U.LIZ("SparkLynxJSRuntime@a5f2.loadScript$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1540540qBw c1540540qBw = this.LL;
        String str2 = c1540540qBw.LJI;
        SparkSecurityLynxService sparkSecurityLynxService = (SparkSecurityLynxService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointLynx, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        c828420Wee.LJFF.put("URL", str2);
        C821850WLv c821850WLvHandleWillLoadLynxTemplateWithEvent = sparkSecurityLynxService.handleWillLoadLynxTemplateWithEvent(c828420Wee);
        String str3 = "";
        if (c821850WLvHandleWillLoadLynxTemplateWithEvent != null) {
            Map<?, ?> map = c821850WLvHandleWillLoadLynxTemplateWithEvent.LIZIZ;
            if (map != null) {
                obj2 = map.get("URL");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                str2 = "";
            }
        }
        if (str2.length() == 0) {
            c1540540qBw.LJ.LIZLLL(new C1529820pue(-2, "The Lynx script url is not in the first party list. Please check it", null));
        } else {
            c1540540qBw.LJ.LJII();
            C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1540540qBw.LIZ, false, null, 3);
            if (c1533020pzoLJIILJJIL != null) {
                RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_CHILD_RESOURCE, byte[].class);
                requestParamsX.waitGeckoUpdate = false;
                requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", c1540540qBw.LIZ.containerId), new Pair("resource_url", str2), new Pair("hybrid_channel", "SPARK_LYNX_JS_RUNTIME"));
                requestParamsX.groupId = c1540540qBw.LIZ.containerId;
                requestParamsX.source = "SparkLynxJSRuntime";
                C1532970pzj c1532970pzjLIZIZ = c1533020pzoLJIILJJIL.LIZIZ(str2, requestParamsX);
                if (c1532970pzjLIZIZ != null && (c1532310pyfLIZ = c1532970pzjLIZIZ.LIZ()) != null) {
                    c1540540qBw.LJ.LJI();
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetch script : ");
                    sbLIZ.append(c1532310pyfLIZ.isSuccess());
                    sbLIZ.append(", resource_error_code: ");
                    sbLIZ.append(c1532310pyfLIZ.LIZJ.LIZ());
                    sbLIZ.append(", errorInfo: ");
                    sbLIZ.append(c1532310pyfLIZ.LIZJ.LIZJ());
                    C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SPARK_LYNX_JS_RUNTIME", 2);
                    byte[] bArrLJIIJ = c1532310pyfLIZ.LJIIJ();
                    if (bArrLJIIJ != null) {
                        str = new String(bArrLJIIJ, Charsets.UTF_8);
                    } else {
                        str = null;
                    }
                    if (!c1532310pyfLIZ.isSuccess()) {
                        C1529800puc c1529800puc = c1540540qBw.LJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("script download failed! errorInfo : ");
                        sbLIZ2.append(c1532310pyfLIZ.LIZJ.LIZJ());
                        c1529800puc.LIZLLL(new C1529820pue(-3, C2188811AlT.LIZIZ(sbLIZ2), C2097608Jq.LJI(new Pair("resource_error_code", Integer.valueOf(c1532310pyfLIZ.LIZJ.LIZ())))));
                    } else {
                        LynxBackgroundRuntime lynxBackgroundRuntime = c1540540qBw.LIZLLL;
                        if (lynxBackgroundRuntime != null) {
                            if (str != null) {
                                str3 = str;
                            }
                            lynxBackgroundRuntime.LIZIZ(str2, str3);
                        }
                        c1540540qBw.LJ.LIZJ();
                        c1540540qBw.LJ.LJIIIZ(str2);
                        c1540540qBw.LJIIIIZZ.set(true);
                    }
                }
            } else {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1540540qBw.LIZ, false);
                RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_CHILD_RESOURCE);
                requestParams.loadToMemory = true;
                requestParams.waitGeckoUpdate = false;
                requestParams.needLocalFile = Boolean.FALSE;
                requestParams.customParams.put("rl_container_uuid", c1540540qBw.LIZ.containerId);
                requestParams.customParams.put("resource_url", str2);
                requestParams.customParams.put("hybrid_channel", "SPARK_LYNX_JS_RUNTIME");
                if (iResourceServiceXLIZIZ != null && (c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest(str2, requestParams)) != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null) {
                    c1540540qBw.LJ.LJI();
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fetch script : ");
                    sbLIZ3.append(c1533790q13LIZIZ.LIZIZ);
                    sbLIZ3.append(", resource_error_code: ");
                    sbLIZ3.append(c1533790q13LIZIZ.LIZLLL.LIZIZ);
                    sbLIZ3.append(", errorInfo: ");
                    sbLIZ3.append(c1533790q13LIZIZ.LIZLLL);
                    String str4 = null;
                    C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ3), null, "SPARK_LYNX_JS_RUNTIME", 2);
                    byte[] bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ();
                    if (bArrLJIIIZ != null) {
                        str4 = new String(bArrLJIIIZ, Charsets.UTF_8);
                    }
                    if (!c1533790q13LIZIZ.LIZIZ) {
                        C1529800puc c1529800puc2 = c1540540qBw.LJ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("script download failed! errorInfo : ");
                        sbLIZ4.append(c1533790q13LIZIZ.LIZLLL);
                        c1529800puc2.LIZLLL(new C1529820pue(-3, C2188811AlT.LIZIZ(sbLIZ4), C2097608Jq.LJI(new Pair("resource_error_code", Integer.valueOf(c1533790q13LIZIZ.LIZLLL.LIZIZ)))));
                    } else {
                        LynxBackgroundRuntime lynxBackgroundRuntime2 = c1540540qBw.LIZLLL;
                        if (lynxBackgroundRuntime2 != null) {
                            if (str4 != null) {
                                str3 = str4;
                            }
                            lynxBackgroundRuntime2.LIZIZ(str2, str3);
                        }
                        c1540540qBw.LJ.LIZJ();
                        c1540540qBw.LJ.LJIIIZ(str2);
                        c1540540qBw.LJIIIIZZ.set(true);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SparkLynxJSRuntime@a5f2.loadScript$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
