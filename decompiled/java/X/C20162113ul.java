package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.13ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceRequestParamsMonitor$onComplete$3", f = "EcommerceRequestParamsMonitor.kt", l = {}, m = "invokeSuspend")
public final class C20162113ul extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Request LLILLJJLI;
    public final /* synthetic */ C0X52<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20162113ul(Request request, C0X52<?> c0x52, InterfaceC1364105Vn<? super C20162113ul> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = request;
        this.LLILLL = c0x52;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20162113ul c20162113ul = new C20162113ul(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c20162113ul.LL = obj;
        return c20162113ul;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLJFF;
        String string;
        String strLIZIZ;
        C1C7U.LIZ("EcommerceRequestParamsMonitor@971a.onComplete$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Request request = this.LLILLJJLI;
        C0X52<?> c0x52 = this.LLILLL;
        try {
            String strLIZJ = C080W.LIZJ(request);
            C1701440uNS c1701440uNS = C1701440uNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("path: ");
            sbLIZ.append(request.getPath());
            sbLIZ.append(", code: ");
            C1494570ozn metrics = request.getMetrics();
            if (metrics != null) {
                objLJFF = C2286608xc.LJFF(metrics.LJJIJ);
            } else {
                objLJFF = "null";
            }
            sbLIZ.append(objLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            C1701440uNS.LIZ(c1701440uNS);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(request.getBody().mimeType());
            sbLIZ2.append(" _ ");
            sbLIZ2.append(request.getMethod());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            String method = request.getMethod();
            if (Intrinsics.LJFF(method, "POST")) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLIZJ);
                if (mapLJIIJ == null && (mapLJIIJ = C1741890vQh.LJIIJ(C080W.LIZ(strLIZJ))) == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onComplete$3");
                    return unit;
                }
                Uri.Builder builderAuthority = UriProtector.parse(request.getUrl()).buildUpon().authority("");
                for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                    builderAuthority.appendQueryParameter(entry.getKey(), C1741890vQh.LJIIIIZZ(entry.getValue()));
                }
                string = builderAuthority.build().toString();
            } else if (Intrinsics.LJFF(method, "GET")) {
                string = UriProtector.parse(request.getUrl()).buildUpon().authority("").toString();
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onComplete$3");
                return unit2;
            }
            if (c0x52 == null) {
                new C21187417vk("unknown").LJIIIZ(EnumC1005660cHE.UNKNOWN.getValue(), EnumC1005690cHH.REQUEST.getValue(), request.getUrl(), request.getPath(), "onComplete response is null");
            }
            ISmartCheckIntegrate iSmartCheckIntegrateLIZLLL = SmartCheckIntegrateImpl.LIZLLL();
            String value = EnumC1005690cHH.REQUEST.getValue();
            if (c0x52 != null) {
                strLIZIZ = C2381909Uz.LIZIZ(c0x52);
            } else {
                strLIZIZ = null;
            }
            iSmartCheckIntegrateLIZLLL.LIZJ(string, value, strLIZIZ, null, strLIZJ, strLIZIZ2, new LinkedHashMap(), false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Request request2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            new C21187417vk("unknown").LJIIIZ(EnumC1005660cHE.REQUEST_PARAM.getValue(), EnumC1005690cHH.REQUEST.getValue(), request2.getUrl(), request2.getPath(), String.valueOf(thM5exceptionOrNullimpl.getMessage()));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onComplete$3");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
