package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundMethodData;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel$requestRefund$2$2", f = "RefundCashierViewModel.kt", l = {196, 210, 223, 248}, m = "invokeSuspend")
public final class C1709100uZo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RefundCashierViewModel LL;
    public C1709110uZp LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ RefundCashierViewModel LLILZ;
    public final /* synthetic */ C1709110uZp LLILZIL;
    public final /* synthetic */ RefundMethodData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709100uZo(RefundCashierViewModel refundCashierViewModel, C1709110uZp c1709110uZp, RefundMethodData refundMethodData, InterfaceC1364105Vn<? super C1709100uZo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = refundCashierViewModel;
        this.LLILZIL = c1709110uZp;
        this.LLILZLL = refundMethodData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1709100uZo(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709100uZo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
