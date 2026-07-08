package X;

import com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKTracker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKTracker$reportGetServiceLog$1", f = "ECSDKTracker.kt", l = {}, m = "invokeSuspend")
public final class C1508470pMD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1508480pME> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508470pMD(List<C1508480pME> list, InterfaceC1364105Vn<? super C1508470pMD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1508470pMD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("ECSDKTracker@c109.reportGetServiceLog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1508480pME c1508480pME : this.LL) {
            float fNextFloat = AbstractC19994813Le.Default.nextFloat();
            ECSDKTracker eCSDKTracker = ECSDKTracker.INSTANCE;
            if (fNextFloat <= eCSDKTracker.getREPORT_RATE()) {
                ILogDependencyService logService = eCSDKTracker.getLogService();
                Pair[] pairArr = new Pair[7];
                pairArr[0] = new Pair("service_name", c1508480pME.LIZJ);
                pairArr[1] = new Pair("service_type", String.valueOf(c1508480pME.LIZLLL));
                pairArr[2] = new Pair("cost_time", String.valueOf(c1508480pME.LJ));
                pairArr[3] = new Pair("in_main_thread", String.valueOf(C08L8.LIZ() ? 1 : 0));
                pairArr[4] = new Pair("is_success", String.valueOf(c1508480pME.LIZ ? 1 : 0));
                Boolean bool = c1508480pME.LIZIZ;
                if (bool != null) {
                    numLJ = C2286608xc.LJ(bool.booleanValue() ? 1 : 0);
                } else {
                    numLJ = null;
                }
                pairArr[5] = new Pair("is_default", String.valueOf(numLJ));
                pairArr[6] = new Pair("service_impl_name", c1508480pME.LJFF);
                logService.onEventV3("rd_tiktokec_saas_service_get", C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSDKTracker@c109.reportGetServiceLog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
