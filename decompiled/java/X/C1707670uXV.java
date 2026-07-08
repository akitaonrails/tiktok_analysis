package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.GeneralQueryResultData;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager;

/* JADX INFO: renamed from: X.0uXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707670uXV extends C1707690uXX {
    public final C1707840uXm LIZ;
    public final InterfaceC1707330uWx LIZIZ;

    public final void LIZ() {
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        String str = this.LIZ.LIZIZ.payRequestId;
        if (str == null) {
            str = "";
        }
        c1708030uY5.LIZ(new C1708070uY9(str)).LIZJ("processing", null);
        QueryStatusManager queryStatusManager = new QueryStatusManager(EnumC1707210uWl.QUERY_TRADE_RESULT, new InterfaceC1707160uWg() { // from class: X.0uXU
            @Override // X.InterfaceC1707160uWg
            public final void LIZ() {
                C1708030uY5 c1708030uY52 = C1708030uY5.LIZ;
                String str2 = this.LIZ.LIZ.LIZIZ.payRequestId;
                if (str2 == null) {
                    str2 = "";
                }
                c1708030uY52.LIZ(new C1708070uY9(str2)).LIZIZ("processing", null, null, 0);
                if (C1707910uXt.LIZJ(this.LIZ.LIZ.LIZIZ)) {
                    return;
                }
                InterfaceC1707330uWx interfaceC1707330uWx = this.LIZ.LIZIZ;
                if (interfaceC1707330uWx != null) {
                    interfaceC1707330uWx.LIZ();
                }
                C1707910uXt.LJ(this.LIZ.LIZ.LIZIZ, 0L, "processing_pay_flow", "pending");
            }

            public final void LIZJ() {
                C1708030uY5 c1708030uY52 = C1708030uY5.LIZ;
                String str2 = this.LIZ.LIZ.LIZIZ.payRequestId;
                if (str2 == null) {
                    str2 = "";
                }
                c1708030uY52.LIZ(new C1708070uY9(str2)).LIZIZ("processing", null, null, 1);
                if (C1707910uXt.LIZJ(this.LIZ.LIZ.LIZIZ)) {
                    return;
                }
                InterfaceC1707330uWx interfaceC1707330uWx = this.LIZ.LIZIZ;
                if (interfaceC1707330uWx != null) {
                    interfaceC1707330uWx.LIZ();
                }
                C1707910uXt.LJII(this.LIZ.LIZ.LIZIZ);
            }

            @Override // X.InterfaceC1707160uWg
            public final void LIZIZ(GeneralQueryResultData generalQueryResultData) {
                LIZJ();
            }

            @Override // X.InterfaceC1707160uWg
            public final void onFail(String str2, String str3) {
                C1708030uY5 c1708030uY52 = C1708030uY5.LIZ;
                String str4 = this.LIZ.LIZ.LIZIZ.payRequestId;
                if (str4 == null) {
                    str4 = "";
                }
                c1708030uY52.LIZ(new C1708070uY9(str4)).LIZIZ("processing", null, null, 0);
                if (C1707910uXt.LIZJ(this.LIZ.LIZ.LIZIZ)) {
                    return;
                }
                InterfaceC1707330uWx interfaceC1707330uWx = this.LIZ.LIZIZ;
                if (interfaceC1707330uWx != null) {
                    interfaceC1707330uWx.LIZ();
                }
                CashierKey cashierKey = this.LIZ.LIZ.LIZIZ;
                EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_NETWORK_ERROR;
                int errorCode = enumC1707350uWz.getErrorCode();
                String errorMessage = enumC1707350uWz.getErrorMessage();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("query order status fail: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C1707910uXt.LJFF(cashierKey, errorCode, errorMessage, str3, 8);
            }
        }, this.LIZ.LIZIZ.payRequestId);
        C1707840uXm c1707840uXm = this.LIZ;
        QueryStatusManager.LIZJ(queryStatusManager, c1707840uXm.LIZJ, c1707840uXm.LIZLLL, c1707840uXm.LJ, c1707840uXm.LJFF, c1707840uXm.LJII, null, c1707840uXm.LJIILJJIL, c1707840uXm.LJIILL, c1707840uXm.LJIILLIIL, 32);
    }

    public C1707670uXV(C1707840uXm c1707840uXm, InterfaceC1707330uWx interfaceC1707330uWx) {
        this.LIZ = c1707840uXm;
        this.LIZIZ = interfaceC1707330uWx;
    }
}
