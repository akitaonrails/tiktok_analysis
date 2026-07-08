package X;

import Y.AfS137S0200000_1;
import Y.AfS170S0100000_1;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodResp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayTrackInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876103bb {
    public static final C897503f3 LIZJ = new C897503f3();
    public static final C01GW<InterfaceC497601wk> LIZLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(79));
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1187));

    public C876103bb(Context context) {
        this.LIZ = context;
    }

    public static void LIZIZ(C876103bb c876103bb, Context context) {
        String string;
        c876103bb.getClass();
        Resources resources = context.getResources();
        if (resources != null) {
            string = resources.getString(2131832931);
        } else {
            string = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZIZ);
            c1389880mGw.LJIIIZ(string);
            c1389880mGw.LJIIJ();
        } else {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
        }
    }

    public final void LIZ(final C887503dR c887503dR, final HashMap<String, Object> map) {
        Map<String, Integer> map2 = C899503fN.LIZ;
        final ListPaymentMethodRequest listPaymentMethodRequest = new ListPaymentMethodRequest(c887503dR.LIZ, c887503dR.LIZIZ, c887503dR.LIZJ, c887503dR.LIZLLL, c887503dR.LJ, c887503dR.LJFF, c887503dR.LJII);
        C888603dc.LIZ.getClass();
        C888603dc.LJIIIIZZ("request_list_payment", c887503dR, "", null);
        PaymentApi.LIZ.getClass();
        ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJIIIIZZ(listPaymentMethodRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS170S0100000_1(this, 11)).LJJLL(new C09JN() { // from class: X.03bT
            @Override // X.C09JN
            public final void accept(Object obj) {
                ListPaymentMethodResp listPaymentMethodResp;
                PaymentMethodsData paymentMethodsData;
                String str;
                Address address;
                FragmentManager supportFragmentManager;
                String str2;
                PaymentMethod paymentMethod;
                PaymentMethodsData paymentMethodsData2;
                C1C7U.LIZ("BindHelper@eb8d.scheduleBindCards$2");
                Response response = (Response) obj;
                C876103bb c876103bb = this.LL;
                c876103bb.getClass();
                try {
                    C786410Ut5.LJIIJ((DialogC1389620mGW) c876103bb.LIZIZ.getValue());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (response.isCodeOK() && (listPaymentMethodResp = (ListPaymentMethodResp) response.data) != null && listPaymentMethodResp.pmd != null) {
                    if (C03YG.LIZ()) {
                        GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
                        Context context = this.LL.LIZ;
                        googlePayProcess.getClass();
                        GooglePayProcess.LJFF(context);
                        ListPaymentMethodResp listPaymentMethodResp2 = (ListPaymentMethodResp) response.data;
                        if (listPaymentMethodResp2 != null) {
                            paymentMethodsData2 = listPaymentMethodResp2.pmd;
                        } else {
                            paymentMethodsData2 = null;
                        }
                        GooglePayProcess.LJIIJ(Boolean.FALSE, GooglePayProcess.LIZJ(paymentMethodsData2));
                    }
                    ListPaymentMethodResp listPaymentMethodResp3 = (ListPaymentMethodResp) response.data;
                    if (listPaymentMethodResp3 != null && (paymentMethodsData = listPaymentMethodResp3.pmd) != null) {
                        C887503dR c887503dR2 = c887503dR;
                        C876103bb c876103bb2 = this.LL;
                        HashMap<String, Object> map3 = map;
                        ListPaymentMethodRequest listPaymentMethodRequest2 = listPaymentMethodRequest;
                        C888603dc c888603dc = C888603dc.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        PaymentInfo paymentInfoLJIILJJIL = paymentMethodsData.LJIILJJIL();
                        if (paymentInfoLJIILJJIL == null || (paymentMethod = paymentInfoLJIILJJIL.paymentMethod) == null || (str = paymentMethod.displayName) == null) {
                            str = "";
                        }
                        linkedHashMap.put("primary", str);
                        c888603dc.getClass();
                        C888603dc.LJIIIIZZ("request_list_payment", c887503dR2, "success", linkedHashMap);
                        ListPaymentMethodResp listPaymentMethodResp4 = (ListPaymentMethodResp) response.data;
                        if (listPaymentMethodResp4 != null) {
                            address = listPaymentMethodResp4.shippingAddress;
                        } else {
                            address = null;
                        }
                        c876103bb2.getClass();
                        PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
                        paymentHalfFragment.LLJJIII = new C875503bV(c876103bb2, listPaymentMethodRequest2, null);
                        int iOrdinal = EnumC882203ca.SAVE.ordinal();
                        PaymentInfo paymentInfoLJIILJJIL2 = paymentMethodsData.LJIILJJIL();
                        String str3 = c887503dR2.LIZJ;
                        String str4 = c887503dR2.LJFF;
                        HashMap map4 = new HashMap();
                        if (map3 != null) {
                            map4.putAll(map3);
                        }
                        PayTrackInfo payTrackInfo = paymentMethodsData.payTrackInfo;
                        if (payTrackInfo != null && (str2 = payTrackInfo.mainTrackId) != null) {
                            map4.put("cashier_original_track_id", str2);
                            map4.put("rendering_num", 1);
                        }
                        n nVar = new n();
                        nVar.LJJIIJ("pi_is_save", "true");
                        nVar.LJJIIJ("pi_ocr", "false");
                        nVar.LJJIIJ("seller_id", c887503dR2.LIZ);
                        nVar.LJJIIJ("amount", c887503dR2.LIZLLL);
                        EnterParams enterParams = new EnterParams(null, null, Integer.valueOf(iOrdinal), paymentMethodsData, null, false, paymentInfoLJIILJJIL2, map4, null, null, address, null, str3, "bind_not_pay", null, null, null, str4, null, null, false, nVar, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
                        enterParams.LJJIJIIJI = EnumC837803Pc.SNS;
                        enterParams.LJJIJL = c887503dR2;
                        paymentHalfFragment.LLJIJIL = enterParams;
                        paymentHalfFragment.LLJILJILJ = new AwS545S0100000_1(paymentHalfFragment, 1197);
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c876103bb2.LIZ);
                        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                            paymentHalfFragment.show(supportFragmentManager, "payment_fragment");
                        }
                    }
                } else {
                    C876103bb c876103bb3 = this.LL;
                    C876103bb.LIZIZ(c876103bb3, c876103bb3.LIZ);
                    C888603dc c888603dc2 = C888603dc.LIZ;
                    C887503dR c887503dR3 = c887503dR;
                    c888603dc2.getClass();
                    C888603dc.LJIIIIZZ("request_list_payment", c887503dR3, "error", null);
                }
                C1C7U.LIZIZ("BindHelper@eb8d.scheduleBindCards$2");
            }
        }, new AfS137S0200000_1(c887503dR, this, 6));
    }
}
