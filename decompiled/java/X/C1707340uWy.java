package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.payflow.UploadPayInfoPayFlow$execute$1$1$1", f = "UploadPayInfoPayFlow.kt", l = {}, m = "invokeSuspend")
public final class C1707340uWy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<C1707120uWc> LL;
    public final /* synthetic */ C1707680uXW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707340uWy(C0X52<C1707120uWc> c0x52, C1707680uXW c1707680uXW, InterfaceC1364105Vn<? super C1707340uWy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = c1707680uXW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707340uWy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPayInfoPayFlow@83ec.execute$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = null;
        if (this.LL.LIZJ() && this.LL.LIZIZ.LIZ()) {
            C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
            String str = this.LLILLJJLI.LIZ.LIZIZ.payRequestId;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c1708030uY5.LIZ(new C1708070uY9(str)).LIZIZ("upload_pay_info", null, null, 1);
            Function1<String, Unit> function1 = this.LLILLJJLI.LIZJ;
            C1707120uWc c1707120uWc = this.LL.LIZIZ;
            c1707120uWc.getClass();
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(c1707120uWc);
            if (strLJI != null) {
                str2 = strLJI;
            }
            function1.invoke(str2);
            unit = Unit.LIZ;
        } else {
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload pay info pay flow error, server error, ");
            sbLIZ.append(this.LL);
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LL.LIZJ()) {
                CashierKey cashierKey = this.LLILLJJLI.LIZ.LIZIZ;
                EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_SERVER_ERROR_API_ERROR;
                int errorCode = enumC1707350uWz.getErrorCode();
                String errorMessage = this.LL.LIZIZ.errorContent;
                if (errorMessage == null) {
                    errorMessage = enumC1707350uWz.getErrorMessage();
                }
                C1707910uXt.LJFF(cashierKey, errorCode, errorMessage, this.LL.LIZIZ.pipoErrorAction, 8);
            } else {
                CashierKey cashierKey2 = this.LLILLJJLI.LIZ.LIZIZ;
                EnumC1707350uWz enumC1707350uWz2 = EnumC1707350uWz.PAY_RESULT_NETWORK_ERROR;
                C1707910uXt.LJFF(cashierKey2, enumC1707350uWz2.getErrorCode(), enumC1707350uWz2.getErrorMessage(), null, 72);
            }
            InterfaceC1707330uWx interfaceC1707330uWx = this.LLILLJJLI.LJ;
            if (interfaceC1707330uWx != null) {
                interfaceC1707330uWx.LIZ();
                unit = Unit.LIZ;
            }
        }
        C1C7U.LIZIZ("UploadPayInfoPayFlow@83ec.execute$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
