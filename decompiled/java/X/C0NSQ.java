package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.RouteStatusApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptor$getUserStatus$2", f = "TEARouterInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C0NSQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public C0NSQ(InterfaceC1364105Vn<? super C0NSQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSQ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TEARouterInterceptor@3442.getUserStatus$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0NSS.LIZ.getClass();
            n data = ((RouteStatusApi) C0NSS.LIZ(RouteStatusApi.class)).getStatus().execute().LIZIZ.getData();
            if (data == null) {
                data = new n();
            }
            C1C7U.LIZIZ("TEARouterInterceptor@3442.getUserStatus$2");
            return data;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            n nVar = new n();
            C1C7U.LIZIZ("TEARouterInterceptor@3442.getUserStatus$2");
            return nVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return new C0NSQ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
