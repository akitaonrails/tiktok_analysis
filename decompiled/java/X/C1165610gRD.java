package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfoWrapper;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0gRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel$requestCashierBasicInfo$2$2$1$3", f = "RefundCashierViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1165610gRD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RefundCashierViewModel LL;
    public final /* synthetic */ C0X52<BaseResponse<RefundCashierBasicInfoWrapper>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165610gRD(RefundCashierViewModel refundCashierViewModel, C0X52<BaseResponse<RefundCashierBasicInfoWrapper>> c0x52, InterfaceC1364105Vn<? super C1165610gRD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = refundCashierViewModel;
        this.LLILLJJLI = c0x52;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165610gRD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RefundCashierViewModel@2a78.requestCashierBasicInfo$2$2$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS605S0100000_26(this.LLILLJJLI, (C0X52<com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse<WalletFlowDecision>>) 380));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RefundCashierViewModel@2a78.requestCashierBasicInfo$2$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
