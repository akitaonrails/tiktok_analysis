package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.PayResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.CashierPayHelper$payInternal$1$1$1", f = "CashierPayHelper.kt", l = {}, m = "invokeSuspend")
public final class C1707290uWt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<C1707120uWc> LL;
    public final /* synthetic */ C1707120uWc LLILLJJLI;
    public final /* synthetic */ C1707300uWu LLILLL;
    public final /* synthetic */ InterfaceC1707310uWv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707290uWt(C0X52<C1707120uWc> c0x52, C1707120uWc c1707120uWc, C1707300uWu c1707300uWu, InterfaceC1707310uWv interfaceC1707310uWv, InterfaceC1364105Vn<? super C1707290uWt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = c1707120uWc;
        this.LLILLL = c1707300uWu;
        this.LLILZ = interfaceC1707310uWv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707290uWt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CashierPayHelper@4352.payInternal$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZJ() && this.LLILLJJLI.LIZ()) {
            C1707120uWc c1707120uWc = this.LL.LIZIZ;
            T t = c1707120uWc.data;
            PayResponseData payResponseData = (PayResponseData) t;
            if (payResponseData != null) {
                payResponseData.amount = this.LLILLL.LJ;
            }
            PayResponseData payResponseData2 = (PayResponseData) t;
            if (payResponseData2 != null) {
                payResponseData2.currency = this.LLILLL.LJFF;
            }
            PayResponseData payResponseData3 = (PayResponseData) t;
            if (payResponseData3 != null) {
                payResponseData3.merchantId = this.LLILLL.LIZJ;
            }
            PayResponseData payResponseData4 = (PayResponseData) t;
            if (payResponseData4 != null) {
                payResponseData4.merchantUserId = this.LLILLL.LIZLLL;
            }
            PayResponseData payResponseData5 = (PayResponseData) t;
            if (payResponseData5 != null) {
                payResponseData5.paymentReference = this.LLILLL.LJI;
            }
            InterfaceC1707310uWv interfaceC1707310uWv = this.LLILZ;
            c1707120uWc.getClass();
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(c1707120uWc);
            if (strLJI == null) {
                strLJI = "";
            }
            interfaceC1707310uWv.onSuccess(strLJI);
        } else if (this.LL.LIZJ()) {
            InterfaceC1707310uWv interfaceC1707310uWv2 = this.LLILZ;
            C1707120uWc c1707120uWc2 = this.LL.LIZIZ;
            interfaceC1707310uWv2.LIZ(c1707120uWc2.errorCode, c1707120uWc2.errorContent, c1707120uWc2.pipoErrorAction);
        } else {
            this.LLILZ.LIZ(String.valueOf(this.LL.LIZ.LIZIZ), EnumC1707350uWz.PAY_RESULT_NETWORK_ERROR.getErrorMessage(), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CashierPayHelper@4352.payInternal$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
