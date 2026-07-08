package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import com.ss.android.ugc.aweme.geoblocking.interceptor.GeoBlockInterceptor;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.geoblocking.interceptor.GeoBlockInterceptor$intercept$1", f = "GeoBlockInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1518940pd6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Exception LL;
    public final /* synthetic */ Request LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518940pd6(Exception exc, Request request, InterfaceC1364105Vn<? super C1518940pd6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exc;
        this.LLILLJJLI = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518940pd6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1494690ozz c1494690ozz;
        String string;
        JSONObject jSONObject;
        String string2;
        C1C7U.LIZ("GeoBlockInterceptor@aef1.intercept$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZIZ = ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LIZIZ(this.LL);
        int iLJI = ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LJI(this.LL);
        String strLJIIIZ = ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LJIIIZ(this.LL);
        Exception exc = this.LL;
        GeoBlockInterceptor.LL.getClass();
        Integer num = null;
        if ((exc instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) exc) != null) {
            try {
                C1494600ozq requestInfo = c1494690ozz.getRequestInfo();
                if (requestInfo == null || (jSONObject = requestInfo.LJJIIJZLJL) == null || (string2 = JSONObjectProtectorUtils.getString(jSONObject, "response-headers")) == null || (string = JSONObjectProtectorUtils.getString(new JSONObject(string2), "x-tt-system-error")) == null) {
                    string = "";
                }
                if (((C1494690ozz) exc).getStatusCode() == 503 && Intrinsics.LJFF(string, "23")) {
                    num = 503;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String host = this.LLILLJJLI.getHost();
        String path = this.LLILLJJLI.getPath();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("rule_id", strLJIIIZ));
        if ((iLIZIZ == -555 || u.LJIJI(exc.getMessage(), "ERR_TTNET_TRAFFIC_CONTROL_DROP, -555", false)) && iLJI == 2 && 555 != null) {
            num = 555;
        }
        C13DA c13da = new C13DA();
        if (host == null) {
            host = "";
        }
        c13da.put("domain", host);
        if (path == null) {
            str = "";
        } else {
            str = path;
        }
        c13da.put("path", str);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        c13da.put("errorMsg", message);
        c13da.put(Scene.SCENE_SERVICE, String.valueOf(num));
        if (mapLIZJ != null) {
            c13da.putAll(mapLIZJ);
        }
        Map mapBuild = c13da.build();
        if (num != null) {
            C1518950pd7 c1518950pd7 = C1518950pd7.LIZ;
            if (path == null) {
                path = "";
            }
            C1518830pcv c1518830pcv = new C1518830pcv(path, num.intValue(), mapBuild);
            synchronized (c1518950pd7) {
                try {
                    C100C c100c = C100C.LIZ;
                    c100c.LIZJ().LIZJ("GeoBlocking_invoke", C2097608Jq.LJ(), null, null);
                    InterfaceC1519000pdC interfaceC1519000pdCLIZIZ = C1518950pd7.LIZIZ(c1518830pcv);
                    if (interfaceC1519000pdCLIZIZ != null) {
                        c100c.LIZJ().LIZJ("GeoBlocking_strategy_execute", C2097608Jq.LJ(), null, null);
                        c100c.LIZJ().LIZ("pns_geoblock_strategy_execute", C2097608Jq.LJIIIIZZ(new Pair("strategy_tag", interfaceC1519000pdCLIZIZ.getTag()), new Pair("strategy_level", interfaceC1519000pdCLIZIZ.getLevel().getValue())));
                        interfaceC1519000pdCLIZIZ.LIZ(c1518830pcv);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeoBlockInterceptor@aef1.intercept$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
