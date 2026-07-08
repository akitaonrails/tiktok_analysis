package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.payment.MinisPayResponse;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.minis.request.payment.MinisPayBeansRequest;
import com.ss.android.ugc.aweme.minis.request.payment.MinisPaymentApi;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.1AzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197431AzN extends C2197471AzR {
    public String LJIILIIL;

    @Override // X.C2197471AzR
    public final void LJFF() {
        C1232850iBf c1232850iBf = C2197731Azr.LIZLLL;
        C2197481AzS c2197481AzS = this.LJIIJ;
        int i = c1232850iBf.LIZ;
        String str = c1232850iBf.LIZIZ;
        if (str == null) {
            str = "";
        }
        C2197481AzS.LIZJ(c2197481AzS, "minis_pay_jsb_result_success", i, str, c2197481AzS.LIZ("pay_query_order_start"), 0, 0L, 0L, null, null, 0, null, null, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, null, 40944);
        C2197481AzS c2197481AzS2 = this.LJIIJ;
        C2197681Azm.LIZJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, c2197481AzS2.LJFF, c2197481AzS2.LJ, c2197481AzS2.LIZJ);
    }

    @Override // X.C2197471AzR
    public final void LJIIIIZZ() {
        C2197481AzS.LIZJ(this.LJIIJ, "get_recommend_tier_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
    }

    @Override // X.C2197471AzR
    public final String LIZLLL() {
        return "minis_pay_flow";
    }

    @Override // X.C2197471AzR
    public final void LIZ(String str) {
        LJIIZILJ(this.LJIILIIL, true);
    }

    @Override // X.C2197471AzR
    public final void LJI(String str) {
        int i;
        int i2;
        String str2;
        C2197481AzS c2197481AzS = this.LJIIJ;
        long jLIZ = c2197481AzS.LIZ("show_recharge_and_pay_sheet");
        MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i = 1;
        } else {
            i = 0;
        }
        C2197481AzS.LIZJ(c2197481AzS, "dismiss_recharge_and_pay_sheet", 0, null, jLIZ, 0, 0L, 0L, str, null, i, null, null, false, null, null, null, 64886);
        C2197481AzS c2197481AzS2 = this.LJIIJ;
        MinisRechargeFragment minisRechargeFragment2 = this.LIZLLL;
        if (minisRechargeFragment2 != null && minisRechargeFragment2.iS()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        long jLIZ2 = this.LJIIJ.LIZ("show_recharge_and_pay_sheet");
        if (this.LJII) {
            str2 = "external";
        } else {
            str2 = "iap";
        }
        C2197481AzS.LIZIZ(c2197481AzS2, "tm_recharge_and_unlock_panel_exit", jLIZ2, i2, str, str2, null, 32);
    }

    public final void LJIJ(String str) {
        String str2;
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        if (minisMetaResp == null || (str2 = minisMetaResp.merchantId) == null) {
            str2 = "80M5HX6P1501";
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2197421AzM(this, str2, str, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final void LJIIZILJ(String str, final boolean z) {
        ?? r5;
        C11NZ<MinisPayResponse> c11nzPayBeans;
        final String str2;
        MinisPaymentApi.PaymentApi paymentApiLIZIZ;
        ?? r52 = 0;
        C2197481AzS.LIZJ(this.LJIIJ, "pay_bean_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
        String strLIZ = this.LIZIZ.LIZ();
        String str3 = this.LJIIJ.LIZJ;
        C2197361AzG c2197361AzG = this.LIZIZ;
        String str4 = c2197361AzG.LIZ;
        String strLIZIZ = c2197361AzG.LIZIZ();
        int iLJ = C204575153d.LJ();
        boolean zLIZIZ = C204575153d.LIZIZ();
        Map mapLIZ = C0TAU.LIZ(this.LIZIZ.LIZIZ);
        try {
            r52 = str;
            paymentApiLIZIZ = C0TAU.LIZIZ();
            r5 = r52;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            r5 = r52;
        }
        if (paymentApiLIZIZ != null) {
            if (!(!mapLIZ.isEmpty())) {
                mapLIZ = null;
            }
            c11nzPayBeans = paymentApiLIZIZ.payBeans(new MinisPayBeansRequest(r52, strLIZ, str3, str4, iLJ, strLIZIZ, zLIZIZ, mapLIZ));
            str2 = r52;
        } else {
            c11nzPayBeans = C11IR.LL;
            str2 = r5;
        }
        this.LJFF.LIZ(c11nzPayBeans.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1Azg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MinisRechargeAndPayTask@2904.startPayBeans$1");
                MinisPayResponse minisPayResponse = (MinisPayResponse) obj;
                long jLIZ = -1;
                if (minisPayResponse.success) {
                    C2197481AzS c2197481AzS = this.LL.LJIIJ;
                    long jLIZ2 = c2197481AzS.LIZ("pay_bean_start");
                    if (z) {
                        jLIZ = this.LL.LJIIJ.LIZ("get_iap_product_start");
                    }
                    C2197481AzS.LIZJ(c2197481AzS, "pay_bean_success", 0, null, jLIZ2, 0, 0L, jLIZ, null, null, 0, null, null, false, null, null, null, 65462);
                    C1B09 c1b09 = this.LL.LIZJ;
                    C2195941Awy c2195941Awy = new C2195941Awy(EnumC2197771Azv.SUCCESS_PAY, null, null, 14);
                    c2195941Awy.LIZJ.put("trade_order_id", str2);
                    c1b09.LIZIZ(c2195941Awy);
                    C786410Ut5.LJIIJ(this.LL.LJ);
                    MinisRechargeFragment minisRechargeFragment = this.LL.LIZLLL;
                    if (minisRechargeFragment != null) {
                        minisRechargeFragment.SR();
                    }
                    this.LL.LIZIZ(false);
                } else {
                    C786410Ut5.LJIIJ(this.LL.LJ);
                    MinisRechargeFragment minisRechargeFragment2 = this.LL.LIZLLL;
                    if (minisRechargeFragment2 != null) {
                        minisRechargeFragment2.SR();
                    }
                    C1232850iBf c1232850iBf = C2197731Azr.LJJIII;
                    c1232850iBf.LIZ = minisPayResponse.status_code;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Server] ");
                    sbLIZ.append(minisPayResponse.status_msg);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    c1232850iBf.LIZIZ = strLIZIZ2;
                    C2197481AzS c2197481AzS2 = this.LL.LJIIJ;
                    int i = c1232850iBf.LIZ;
                    if (strLIZIZ2 == null) {
                        strLIZIZ2 = "";
                    }
                    Integer num = c1232850iBf.LIZJ;
                    String str5 = c1232850iBf.LIZLLL;
                    long jLIZ3 = c2197481AzS2.LIZ("pay_bean_start");
                    if (z) {
                        jLIZ = this.LL.LJIIJ.LIZ("get_iap_product_start");
                    }
                    C2197481AzS.LIZJ(c2197481AzS2, "pay_bean_fail", i, strLIZIZ2, jLIZ3, 0, 0L, jLIZ, null, null, 0, "SERVER", null, false, num, str5, c1232850iBf, 7088);
                    if (z) {
                        C2197431AzN c2197431AzN = this.LL;
                        C1B09 c1b092 = c2197431AzN.LIZJ;
                        EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i2 = c1232850iBf.LIZ;
                        String strLIZJ = c1232850iBf.LJ;
                        if (strLIZJ == null) {
                            strLIZJ = c2197431AzN.LIZJ();
                        }
                        c1b092.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i2, null, strLIZJ, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
                        this.LL.LIZIZ(false);
                    } else {
                        C2197431AzN c2197431AzN2 = this.LL;
                        C1B09 c1b093 = c2197431AzN2.LIZJ;
                        EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i3 = c1232850iBf.LIZ;
                        String strLIZJ2 = c1232850iBf.LJ;
                        if (strLIZJ2 == null) {
                            strLIZJ2 = c2197431AzN2.LIZJ();
                        }
                        c1b093.LIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i3, null, strLIZJ2, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
                    }
                }
                C1C7U.LIZIZ("MinisRechargeAndPayTask@2904.startPayBeans$1");
            }
        }, new C09JN() { // from class: X.1AzV
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MinisRechargeAndPayTask@2904.startPayBeans$2");
                Throwable th = (Throwable) obj;
                C786410Ut5.LJIIJ(this.LL.LJ);
                MinisRechargeFragment minisRechargeFragment = this.LL.LIZLLL;
                if (minisRechargeFragment != null) {
                    minisRechargeFragment.SR();
                }
                long jLIZ = -1;
                String str5 = "";
                if (th instanceof C0XIR) {
                    C1232850iBf c1232850iBf = C2197731Azr.LJJIII;
                    C0XIR c0xir = (C0XIR) th;
                    c1232850iBf.LIZ = c0xir.getErrorCode();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Server] ");
                    sbLIZ.append(c0xir.getErrorMsg());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    c1232850iBf.LIZIZ = strLIZIZ2;
                    C2197481AzS c2197481AzS = this.LL.LJIIJ;
                    int i = c1232850iBf.LIZ;
                    if (strLIZIZ2 != null) {
                        str5 = strLIZIZ2;
                    }
                    Integer num = c1232850iBf.LIZJ;
                    String str6 = c1232850iBf.LIZLLL;
                    long jLIZ2 = c2197481AzS.LIZ("pay_bean_start");
                    if (z) {
                        jLIZ = this.LL.LJIIJ.LIZ("get_iap_product_start");
                    }
                    C2197481AzS.LIZJ(c2197481AzS, "pay_bean_fail", i, str5, jLIZ2, 0, 0L, jLIZ, null, null, 0, "SERVER", null, false, num, str6, c1232850iBf, 7088);
                    if (z) {
                        C2197431AzN c2197431AzN = this.LL;
                        C1B09 c1b09 = c2197431AzN.LIZJ;
                        EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i2 = c1232850iBf.LIZ;
                        String strLIZJ = c1232850iBf.LJ;
                        if (strLIZJ == null) {
                            strLIZJ = c2197431AzN.LIZJ();
                        }
                        c1b09.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i2, null, strLIZJ, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
                        this.LL.LIZIZ(false);
                    } else {
                        C2197431AzN c2197431AzN2 = this.LL;
                        C1B09 c1b092 = c2197431AzN2.LIZJ;
                        EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i3 = c1232850iBf.LIZ;
                        String strLIZJ2 = c1232850iBf.LJ;
                        if (strLIZJ2 == null) {
                            strLIZJ2 = c2197431AzN2.LIZJ();
                        }
                        c1b092.LIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i3, null, strLIZJ2, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
                    }
                } else {
                    C1232850iBf c1232850iBf2 = C2197731Azr.LJJI;
                    C2197481AzS c2197481AzS2 = this.LL.LJIIJ;
                    int i4 = c1232850iBf2.LIZ;
                    String str7 = c1232850iBf2.LIZIZ;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    Integer num2 = c1232850iBf2.LIZJ;
                    String str8 = c1232850iBf2.LIZLLL;
                    long jLIZ3 = c2197481AzS2.LIZ("pay_bean_start");
                    if (z) {
                        jLIZ = this.LL.LJIIJ.LIZ("get_iap_product_start");
                    }
                    C2197481AzS.LIZJ(c2197481AzS2, "pay_bean_fail", i4, str5, jLIZ3, 0, 0L, jLIZ, null, null, 0, "NETWORK", null, false, num2, str8, c1232850iBf2, 7088);
                    if (z) {
                        C2197431AzN c2197431AzN3 = this.LL;
                        C1B09 c1b093 = c2197431AzN3.LIZJ;
                        EnumC2197771Azv enumC2197771Azv3 = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i5 = c1232850iBf2.LIZ;
                        String strLIZJ3 = c1232850iBf2.LJ;
                        if (strLIZJ3 == null) {
                            strLIZJ3 = c2197431AzN3.LIZJ();
                        }
                        c1b093.LIZIZ(new C2195941Awy(enumC2197771Azv3, new C2195931Awx(i5, null, strLIZJ3, EnumC2197781Azw.NETWORK, 2), c1232850iBf2, 4));
                        this.LL.LIZIZ(false);
                    } else {
                        C2197431AzN c2197431AzN4 = this.LL;
                        C1B09 c1b094 = c2197431AzN4.LIZJ;
                        EnumC2197771Azv enumC2197771Azv4 = EnumC2197771Azv.SERVER_PAY_FAIL;
                        int i6 = c1232850iBf2.LIZ;
                        String strLIZJ4 = c1232850iBf2.LJ;
                        if (strLIZJ4 == null) {
                            strLIZJ4 = c2197431AzN4.LIZJ();
                        }
                        c1b094.LIZ(new C2195941Awy(enumC2197771Azv4, new C2195931Awx(i6, null, strLIZJ4, EnumC2197781Azw.NETWORK, 2), c1232850iBf2, 4));
                    }
                }
                C1C7U.LIZIZ("MinisRechargeAndPayTask@2904.startPayBeans$2");
            }
        }));
    }

    public C2197431AzN(Context context, C2197361AzG c2197361AzG, C2195531AwJ c2195531AwJ) {
        super(context, c2197361AzG, c2195531AwJ);
        this.LJIILIIL = "";
    }

    @Override // X.C2197471AzR
    public final void LJ(int i, String str, C1232850iBf c1232850iBf) {
        Integer num;
        String str2 = str;
        C2197481AzS c2197481AzS = this.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = null;
        if (c1232850iBf != null) {
            num = c1232850iBf.LIZJ;
            str3 = c1232850iBf.LIZLLL;
        } else {
            num = null;
        }
        C2197481AzS.LIZJ(c2197481AzS, "minis_pay_jsb_result_fail", i, str2, c2197481AzS.LIZ("pay_query_order_start"), 0, 0L, 0L, null, this.LJIIJ.LIZIZ, 0, null, null, false, num, str3, c1232850iBf, 7920);
        if (c1232850iBf != null) {
            C2197481AzS c2197481AzS2 = this.LJIIJ;
            C2197681Azm.LIZJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, c2197481AzS2.LJFF, c2197481AzS2.LJ, c2197481AzS2.LIZJ);
        }
    }
}
