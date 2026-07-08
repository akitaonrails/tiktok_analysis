package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionRequestOpt;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSnapboostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.145o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.OrderSubmitPrefetchHelperV2$tryEnterOspPage$1$1", f = "OrderSubmitPrefetchHelperV2.kt", l = {}, m = "invokeSuspend")
public final class C202090145o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C202090145o(InterfaceC1364105Vn<? super C202090145o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C202090145o(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitPrefetchHelperV2@715.tryEnterOspPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IEcomSnapboostService iEcomSnapboostService = (IEcomSnapboostService) PluggableExtentionKt.pluggableSpi$default(IEcomSnapboostService.class, false, false, false, 14, null);
        C01GW c01gw = EcTransactionRequestOpt.LIZIZ;
        if (((EcTransactionRequestOpt.EcTransactionRequestOptConfig) c01gw.getValue()).ospPreloadClass && iEcomSnapboostService != null && iEcomSnapboostService.LIZIZ("snapboost_list_ecommerce_osp.txt")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ = C202079145d.LIZ("snapboost_list_ecommerce_osp.txt").LIZIZ();
            iEcomSnapboostService.LIZJ("snapboost_list_ecommerce_osp.txt");
            iEcomSnapboostService.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, c1489405sKLIZIZ, "order_submit", "order_submit");
        }
        if (((EcTransactionRequestOpt.EcTransactionRequestOptConfig) c01gw.getValue()).opsPreloadPbClass && iEcomSnapboostService != null && iEcomSnapboostService.LIZIZ("snapboost_list_ecommerce_pb.txt")) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C1489405sK c1489405sKLIZIZ2 = C202079145d.LIZ("snapboost_list_ecommerce_pb.txt").LIZIZ();
            iEcomSnapboostService.LIZJ("snapboost_list_ecommerce_pb.txt");
            iEcomSnapboostService.LIZ(System.currentTimeMillis() - jCurrentTimeMillis2, c1489405sKLIZIZ2, "order_submit", "protobuf");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitPrefetchHelperV2@715.tryEnterOspPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C202090145o(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
