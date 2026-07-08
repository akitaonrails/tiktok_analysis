package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.13uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceRequestParamsMonitor$onHandleRequest$2", f = "EcommerceRequestParamsMonitor.kt", l = {}, m = "invokeSuspend")
public final class C20162013uk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Request LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20162013uk(Request request, InterfaceC1364105Vn<? super C20162013uk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20162013uk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String string;
        C1C7U.LIZ("EcommerceRequestParamsMonitor@971a.onHandleRequest$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Request request = this.LL;
        try {
            String method = request.getMethod();
            if (Intrinsics.LJFF(method, "POST")) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C080W.LIZIZ(request));
                if (mapLJIIJ == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onHandleRequest$2");
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
                C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onHandleRequest$2");
                return unit2;
            }
            SmartCheckIntegrateImpl.LIZLLL().LIZJ(string, EnumC1005690cHH.REQUEST.getValue(), null, null, null, null, new LinkedHashMap(), false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Request request2 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            new C21187417vk("unknown").LJIIIZ(EnumC1005660cHE.REQUEST_PARAM.getValue(), EnumC1005690cHH.REQUEST.getValue(), request2.getUrl(), request2.getPath(), String.valueOf(thM5exceptionOrNullimpl.getMessage()));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceRequestParamsMonitor@971a.onHandleRequest$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
