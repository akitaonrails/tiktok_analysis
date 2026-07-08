package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.tiktok.forestx.RequestParamsX;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0puW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.hybrid.spark.prefetch.LynxPrefetch$tryLynxPrefetchV2$4", f = "LynxPrefetch.kt", l = {}, m = "invokeSuspend")
public final class C1529740puW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SparkContext LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ LynxBackgroundRuntime LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529740puW(SparkContext sparkContext, C259800zU<String> c259800zU, LynxBackgroundRuntime lynxBackgroundRuntime, InterfaceC1364105Vn<? super C1529740puW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sparkContext;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = lynxBackgroundRuntime;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529740puW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        String strLIZ2;
        List<String> list;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1533790q13 c1533790q13LIZIZ;
        String strLJJLIIIJ;
        String strLIZIZ;
        String strLIZ3;
        String strLIZ4;
        List<String> list2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        C1532310pyf c1532310pyfLIZ;
        String strLJJLIIIJ2;
        String strLIZIZ2;
        C1C7U.LIZ("LynxPrefetch@7065.tryLynxPrefetchV2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1489090oqx c1489090oqx = C1489090oqx.LIZ;
        SparkContext sparkContext = this.LL;
        String str = this.LLILLJJLI.element;
        LynxBackgroundRuntime lynxBackgroundRuntime = this.LLILLL;
        c1489090oqx.getClass();
        C1530570pvr.LIZIZ(sparkContext, "spark_lynx_prefetch_load_prefetch_start");
        C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(sparkContext, false, null, 3);
        if (c1533020pzoLJIILJJIL != null) {
            RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_CHILD_RESOURCE, byte[].class);
            requestParamsX.waitGeckoUpdate = false;
            C1533760q10 c1533760q10 = sparkContext.mainDocumentGeckoInfo;
            if (c1533760q10 == null || (strLIZ3 = c1533760q10.LIZIZ) == null) {
                strLIZ3 = C1489090oqx.LIZ(sparkContext.LJIJI(), "channel");
            }
            requestParamsX.channel = strLIZ3;
            C1533760q10 c1533760q102 = sparkContext.mainDocumentGeckoInfo;
            if (c1533760q102 == null || (strLIZ4 = c1533760q102.LIZJ) == null) {
                strLIZ4 = C1489090oqx.LIZ(sparkContext.LJIJI(), "bundle");
            }
            requestParamsX.bundle = strLIZ4;
            requestParamsX.source = "LynxPrefetchV2";
            String str2 = sparkContext.containerId;
            requestParamsX.groupId = str2;
            requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str2), new Pair("resource_url", str), new Pair("hybrid_channel", "prefetch"));
            C1529870puj.LIZ.getClass();
            C1529870puj.LIZ(sparkContext);
            String str3 = requestParamsX.bundle;
            if (str3 != null && str3.length() != 0) {
                String str4 = requestParamsX.bundle;
                if (str4 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4.substring(0, a0.LJJJJ(str4, '/', 0, 6) + 1));
                    sbLIZ.append("prefetch_v2.js");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ2 = null;
                }
                requestParamsX.bundle = strLIZIZ2;
            } else {
                requestParamsX.bundle = "prefetch_v2.js";
            }
            C1529750puX c1529750puX = C1535630q41.LIZIZ;
            if (c1529750puX != null) {
                list2 = c1529750puX.LIZJ;
                boolValueOf3 = Boolean.valueOf(c1529750puX.LIZIZ);
            } else {
                list2 = null;
                boolValueOf3 = null;
            }
            C1529750puX c1529750puX2 = C1535630q41.LIZIZ;
            if (c1529750puX2 != null) {
                boolValueOf4 = Boolean.valueOf(c1529750puX2.LIZ);
            } else {
                boolValueOf4 = null;
            }
            if (C1489090oqx.LIZIZ(requestParamsX.bundle, list2)) {
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolValueOf3, bool)) {
                    Pair[] pairArr = new Pair[3];
                    String str5 = requestParamsX.channel;
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[0] = new Pair("channel", str5);
                    String str6 = requestParamsX.bundle;
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr[1] = new Pair("bundle", str6);
                    if (list2 == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63)) == null) {
                        strLJJLIIIJ2 = "";
                    }
                    pairArr[2] = new Pair("illegalBundleWords", strLJJLIIIJ2);
                    C1520080pew.LIZLLL("spark_lynx_illegal_bundle", C2097608Jq.LJIIJ(pairArr));
                }
                if (Intrinsics.LJFF(boolValueOf4, bool)) {
                    requestParamsX.bundle = "";
                }
            }
            C1532970pzj c1532970pzjLIZIZ = c1533020pzoLJIILJJIL.LIZIZ(str, requestParamsX);
            if (c1532970pzjLIZIZ != null && (c1532310pyfLIZ = c1532970pzjLIZIZ.LIZ()) != null) {
                if (c1532310pyfLIZ.isSuccess()) {
                    C1520080pew.LJFF(sparkContext.containerId, "lynx_prefetch_v2", "prefetchResourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, null, "success", 72);
                    byte[] bArrLJIIJ = c1532310pyfLIZ.LJIIJ();
                    if (bArrLJIIJ != null) {
                        lynxBackgroundRuntime.LIZIZ(str, new String(bArrLJIIJ, Charsets.UTF_8));
                    }
                } else {
                    C1520080pew.LJFF(sparkContext.containerId, "lynx_prefetch_v2", "prefetchResourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, c1532310pyfLIZ.LIZJ.LIZJ(), "fail", 8);
                }
            }
        } else {
            RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_CHILD_RESOURCE);
            requestParams.loadToMemory = true;
            requestParams.waitGeckoUpdate = false;
            requestParams.needLocalFile = Boolean.FALSE;
            C1533760q10 c1533760q103 = sparkContext.mainDocumentGeckoInfo;
            if (c1533760q103 == null || (strLIZ = c1533760q103.LIZIZ) == null) {
                strLIZ = C1489090oqx.LIZ(sparkContext.LJIJI(), "channel");
            }
            requestParams.channel = strLIZ;
            C1533760q10 c1533760q104 = sparkContext.mainDocumentGeckoInfo;
            if (c1533760q104 == null || (strLIZ2 = c1533760q104.LIZJ) == null) {
                strLIZ2 = C1489090oqx.LIZ(sparkContext.LJIJI(), "bundle");
            }
            requestParams.bundle = strLIZ2;
            requestParams.customParams.put("rl_container_uuid", sparkContext.containerId);
            requestParams.customParams.put("resource_url", str);
            C1529870puj.LIZ.getClass();
            C1529870puj.LIZ(sparkContext);
            requestParams.customParams.put("hybrid_channel", "prefetch");
            String str7 = requestParams.bundle;
            if (str7 != null && str7.length() != 0) {
                String str8 = requestParams.bundle;
                if (str8 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str8.substring(0, a0.LJJJJ(str8, '/', 0, 6) + 1));
                    sbLIZ2.append("prefetch_v2.js");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLIZIZ = null;
                }
                requestParams.bundle = strLIZIZ;
            } else {
                requestParams.bundle = "prefetch_v2.js";
            }
            C1529750puX c1529750puX3 = C1535630q41.LIZIZ;
            if (c1529750puX3 != null) {
                list = c1529750puX3.LIZJ;
                boolValueOf = Boolean.valueOf(c1529750puX3.LIZIZ);
            } else {
                list = null;
                boolValueOf = null;
            }
            C1529750puX c1529750puX4 = C1535630q41.LIZIZ;
            if (c1529750puX4 != null) {
                boolValueOf2 = Boolean.valueOf(c1529750puX4.LIZ);
            } else {
                boolValueOf2 = null;
            }
            if (C1489090oqx.LIZIZ(requestParams.bundle, list)) {
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(boolValueOf, bool2)) {
                    Pair[] pairArr2 = new Pair[3];
                    String str9 = requestParams.channel;
                    if (str9 == null) {
                        str9 = "";
                    }
                    pairArr2[0] = new Pair("channel", str9);
                    String str10 = requestParams.bundle;
                    if (str10 == null) {
                        str10 = "";
                    }
                    pairArr2[1] = new Pair("bundle", str10);
                    if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63)) == null) {
                        strLJJLIIIJ = "";
                    }
                    pairArr2[2] = new Pair("illegalBundleWords", strLJJLIIIJ);
                    C1520080pew.LIZLLL("spark_lynx_illegal_bundle", C2097608Jq.LJIIJ(pairArr2));
                }
                if (Intrinsics.LJFF(boolValueOf2, bool2)) {
                    requestParams.bundle = "";
                }
            }
            JSONArray jSONArray = C1533710q0v.LIZ;
            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
            if (iResourceServiceXLIZIZ != null && (c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest(str, requestParams)) != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null) {
                if (c1533790q13LIZIZ.LIZIZ) {
                    C1520080pew.LJFF(sparkContext.containerId, "lynx_prefetch_v2", "prefetchResourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, null, "success", 72);
                    byte[] bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ();
                    if (bArrLJIIIZ != null) {
                        lynxBackgroundRuntime.LIZIZ(str, new String(bArrLJIIIZ, Charsets.UTF_8));
                    }
                } else {
                    C1520080pew.LJFF(sparkContext.containerId, "lynx_prefetch_v2", "prefetchResourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, c1533790q13LIZIZ.LIZLLL.toString(), "fail", 8);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxPrefetch@7065.tryLynxPrefetchV2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
