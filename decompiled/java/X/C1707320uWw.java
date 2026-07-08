package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.payflow.UploadPayInfoPayFlow$execute$1$2$1", f = "UploadPayInfoPayFlow.kt", l = {}, m = "invokeSuspend")
public final class C1707320uWw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1707680uXW LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707320uWw(C1707680uXW c1707680uXW, Throwable th, InterfaceC1364105Vn<? super C1707320uWw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1707680uXW;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707320uWw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPayInfoPayFlow@83ec.execute$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CashierKey cashierKey = this.LL.LIZ.LIZIZ;
        EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_SERVER_ERROR_API_ERROR;
        int errorCode = enumC1707350uWz.getErrorCode();
        String errorMessage = enumC1707350uWz.getErrorMessage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception: ");
        sbLIZ.append(this.LLILLJJLI.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = null;
        C1707910uXt.LJFF(cashierKey, errorCode, errorMessage, null, 72);
        InterfaceC1707330uWx interfaceC1707330uWx = this.LL.LJ;
        if (interfaceC1707330uWx != null) {
            interfaceC1707330uWx.LIZ();
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("UploadPayInfoPayFlow@83ec.execute$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
