package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.a0;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0puC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.hybrid.spark.Spark$Companion$handleInitDataUrlReal$1", f = "Spark.kt", l = {}, m = "invokeSuspend")
public final class C1529540puC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Object>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SparkContext LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529540puC(String str, SparkContext sparkContext, InterfaceC1364105Vn<? super C1529540puC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = sparkContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529540puC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1533790q13 c1533790q13LIZIZ;
        C1C7U.LIZ("Spark$Companion@60a9.handleInitDataUrlReal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        String str = this.LL;
        int length = 0;
        String strSubstring = str.substring(0, a0.LJJJJ(str, '/', 0, 6));
        String str2 = this.LL;
        String strSubstring2 = str2.substring(a0.LJJJJ(str2, '/', 0, 6), this.LL.length());
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_CHILD_RESOURCE);
        requestParams.onlyLocal = true;
        requestParams.channel = strSubstring;
        requestParams.bundle = strSubstring2;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(this.LLILLJJLI, false);
        if (iResourceServiceXLIZIZ != null && (c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest(this.LL, requestParams)) != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null) {
            SparkContext sparkContext = this.LLILLJJLI;
            if (c1533790q13LIZIZ.LIZIZ) {
                byte[] bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ();
                if (bArrLJIIIZ != null) {
                    length = bArrLJIIIZ.length;
                    c259800zU.element = GsonProtectorUtils.fromJson(C1551400qTS.LIZIZ.LIZ, new String(bArrLJIIIZ, Charsets.UTF_8), new TypeToken<Map<String, ? extends Object>>() { // from class: X.0puD
                    }.getType());
                }
                C1520080pew.LJFF(sparkContext.containerId, "init_data_url", "resourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, String.valueOf(length), "success", 8);
            } else {
                C1520080pew.LJFF(sparkContext.containerId, "init_data_url", "resourceLoad", null, sparkContext.LJIJI(), sparkContext.bid, c1533790q13LIZIZ.LIZLLL.toString(), "fail", 8);
            }
        }
        T t = c259800zU.element;
        C1C7U.LIZIZ("Spark$Companion@60a9.handleInitDataUrlReal$1");
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
