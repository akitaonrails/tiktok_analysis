package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.RdOneClickPayEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03QL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QL implements InterfaceC838003Pe, InterfaceC1164530gPT {
    public static final /* synthetic */ int LLJLL = 0;
    public final Context LL;
    public final C1019703yl LLILLJJLI;
    public final OneClickPayContext LLILLL;
    public final String LLILZ;
    public C841103Qj LLIZ;
    public String LLJ;
    public C897703f5 LLJI;
    public boolean LLJIJIL;
    public ActivityUserSelection LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJJIII;
    public String LLJJIJI;
    public volatile boolean LLJJJ;
    public boolean LLJJJIL;
    public C841703Qp LLJJJJ;
    public BillInfoData LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJLIL;
    public C03WH LLJLILLLLZIIL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(522));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(525));
    public final C03PJ LLIZLLLIL = new C03PJ(this);
    public final List<VoucherInfoNew> LLJILLL = new ArrayList();
    public final HashMap<String, List<VoucherInfoNew>> LLJJ = new HashMap<>();
    public String LLJJI = "";
    public String LLJJIJIIJIL = "unknown";
    public String LLJJIJIL = "";
    public final C840503Qd LLJJJJJIL = new C840503Qd(0);
    public final C7873035r LLJJLIIIJLLLLLLLZ = new C7873035r(null, null, false, null, null, null, null, 32767);
    public final HashMap<String, Object> LLJL = new HashMap<>();

    @Override // X.InterfaceC838003Pe
    public final void XC(boolean z, String str, String str2, Integer num, Object obj, Object obj2, String str3, boolean z2, String str4) {
    }

    @Override // X.InterfaceC838003Pe
    public final void wP1() {
    }

    public final void LJIIIIZZ() {
        PaymentMethod paymentMethod;
        PaymentMethodInfo paymentMethodInfo;
        C897703f5 c897703f5 = this.LLJI;
        if (c897703f5 == null) {
            return;
        }
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("payment_status", "success");
        pairArr[1] = new Pair("pay_source", c897703f5.LJIIIIZZ);
        PaymentInfo paymentInfo = c897703f5.LJI;
        pairArr[2] = new Pair("channel_type", (paymentInfo == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null || !Intrinsics.LJFF(paymentMethodInfo.isChooseSave(), Boolean.TRUE)) ? "pay" : "pay_and_bindcard");
        PaymentInfo paymentInfo2 = c897703f5.LJI;
        pairArr[3] = new Pair("pay_type", String.valueOf((paymentInfo2 == null || (paymentMethod = paymentInfo2.paymentMethod) == null) ? null : paymentMethod.LJJIIZ()));
        pairArr[4] = new Pair("pay_request_id", c897703f5.LJIIJ);
        pairArr[5] = new Pair("us_localization", Integer.valueOf(Intrinsics.LJFF(c897703f5.LJIILLIIL, Boolean.TRUE) ? 1 : 0));
        List<String> list = c897703f5.LIZIZ;
        pairArr[6] = new Pair("main_order_id", list != null ? C13LP.LJJJLL(list) : null);
        OneClickPayContext oneClickPayContext = c897703f5.LJIIJJI;
        pairArr[7] = new Pair("last_main_order_id", oneClickPayContext != null ? oneClickPayContext.mainOrderId : null);
        C1019703yl c1019703yl = this.LLILLJJLI;
        c1019703yl.getClass();
        pairArr[8] = new Pair("source_btm_token", c1019703yl.LJI("c1771.d3261", null));
        Set<Map.Entry> setEntrySet = C2097608Jq.LJI(pairArr).entrySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append('=');
            sbLIZ.append(entry.getValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62);
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_aftersale_popup");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_page_one_click_pay");
        c495520Jby.LIZJ("roma_url_query", strLJJLIIIJ);
        SmartRouter.buildRoute(this.LL, c495520Jby.LIZLLL()).open();
    }

    public final boolean LJIIL() {
        Integer num;
        OneClickPayContext oneClickPayContext = this.LLILLL;
        if (oneClickPayContext == null || (num = oneClickPayContext.payMethodSelectEnable) == null || num.intValue() != 1) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ecom_checkout_ocp_enable_payment_switch", false);
    }

    public final void LJIILIIL() {
        this.LLIZLLLIL.LJII();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter == null) {
            return;
        }
        iEventCenter.LIZJ("ec_ocp_payment_cancel", this);
        iEventCenter.LIZJ("ec_pay_middle_successed", this);
        iEventCenter.LIZJ("ec_payment_interrupted", this);
    }

    public final boolean LJIIJJI() {
        return C03QK.LIZ().enableRetryCashier && C835903Oj.LIZ() && !this.LLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap LJ(X.C043B r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r4.LLIIIJ()
            if (r0 == 0) goto L53
            java.lang.Boolean r0 = r0.pdpFullScreen
            if (r0 == 0) goto L53
            boolean r3 = r0.booleanValue()
        Le:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter r0 = com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r1 = r4.LLIIIJ()
            r0.getClass()
            r0 = 0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r2 = com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter.LIZIZ(r1, r0)
            X.03QN r1 = X.C03QN.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r4.Dh()
            r1.getClass()
            java.util.HashMap r4 = X.C03QN.LIZJ(r2, r0, r3)
            java.lang.String r3 = "one_click_pay"
            java.lang.String r0 = "1"
            r4.put(r3, r0)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "sku"
            r4.put(r1, r0)
            java.lang.String r2 = "checkout_type"
            r4.put(r2, r3)
            java.lang.String r1 = "entrance_info"
            java.util.HashMap r0 = X.C1741890vQh.LJ(r1, r4)
            if (r0 == 0) goto L4d
            r0.put(r2, r3)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r0)
            if (r0 != 0) goto L4f
        L4d:
            java.lang.String r0 = "{}"
        L4f:
            r4.put(r1, r0)
            return r4
        L53:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QL.LJ(X.043B):java.util.HashMap");
    }

    public final C03WH LIZLLL(Map<String, ? extends Object> map) {
        if (!C03QK.LIZ().enableOcpLog) {
            return null;
        }
        C03WH c03wh = this.LLJLILLLLZIIL;
        if (c03wh != null) {
            return c03wh;
        }
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        EnterParams enterParams = new EnterParams(null, null, null, null, null, false, null, map2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
        enterParams.LJJIJIIJI = EnumC837803Pc.OCP_PANEL;
        C03WH c03wh2 = new C03WH(enterParams);
        this.LLJLILLLLZIIL = c03wh2;
        return c03wh2;
    }

    public final void LJIIIZ(HashMap<String, Object> map) {
        String currency;
        String priceStr;
        String strLJIIIIZZ;
        Summary summary;
        Price price;
        String priceVal;
        Summary summary2;
        Price price2;
        Summary summary3;
        Price price3;
        String string;
        String str;
        try {
            this.LLJJL = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SettingsManager.LIZLLL().getClass();
            String strValueOf = String.valueOf(SettingsManager.LJ("pipo_ec_eu_retry_cashier_type", 0));
            linkedHashMap.put("source", "ordersubmit");
            HashMap map2 = new HashMap();
            map2.putAll(map);
            map2.put("previous_page", "sku");
            map2.put("ocp_retry_cashier_type", strValueOf);
            List<String> list = C03QK.LIZ().paramKeysToBeRemoved;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    map2.remove(it2.next());
                }
            }
            linkedHashMap.put("trackParams", C786410Ut5.J3(new JSONObject(map2)));
            String str2 = this.LLJJLIIIJLLLLLLLZ.LIZIZ;
            if (str2 != null) {
                linkedHashMap.put("combo_id", str2);
            }
            List<String> list2 = this.LLJJLIIIJLLLLLLLZ.LIZ;
            String str3 = "";
            if (list2 != null && (string = list2.toString()) != null) {
                List<String> list3 = this.LLJJLIIIJLLLLLLLZ.LIZ;
                if (list3 == null || (str = (String) C13LP.LJJJLL(list3)) == null) {
                    str = "";
                }
                linkedHashMap.put("order_id", str);
                linkedHashMap.put("order_ids", string);
            }
            String str4 = this.LLJJLIIIJLLLLLLLZ.LJIIJJI;
            if (str4 != null) {
                linkedHashMap.put("last_pay_order_id", str4);
            }
            BillInfoData billInfoData = this.LLJJJJLIIL;
            if (billInfoData == null || (summary3 = billInfoData.summary) == null || (price3 = summary3.total) == null || (currency = price3.getCurrency()) == null) {
                currency = "";
            }
            linkedHashMap.put("currency", currency);
            BillInfoData billInfoData2 = this.LLJJJJLIIL;
            if (billInfoData2 == null || (summary2 = billInfoData2.summary) == null || (price2 = summary2.total) == null || (priceStr = price2.getPriceStr()) == null) {
                priceStr = "";
            }
            linkedHashMap.put("price", priceStr);
            BillInfoData billInfoData3 = this.LLJJJJLIIL;
            if (billInfoData3 != null && (summary = billInfoData3.summary) != null && (price = summary.total) != null && (priceVal = price.getPriceVal()) != null) {
                str3 = priceVal;
            }
            linkedHashMap.put("price_val", str3);
            linkedHashMap.put("is_need_intercept", String.valueOf(C7845034p.LIZ()));
            linkedHashMap.put("retry_cashier_type", strValueOf);
            OneClickPayContext oneClickPayContext = this.LLILLL;
            if (oneClickPayContext != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(oneClickPayContext)) != null) {
                linkedHashMap.put("ocp_context", strLJIIIIZZ);
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashMap.entrySet(), "&", null, null, 0, null, AFwS228S0000000_1.get$arr$(904), 30);
            String str5 = "aweme://ec/handle_pay";
            if (strLJJLIIIJ.length() > 0) {
                str5 = "aweme://ec/handle_pay?" + strLJJLIIIJ;
            }
            SmartRouter.buildRoute(this.LL, str5).open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
    }

    public final void LJII(Context context, String str) {
        C841703Qp c841703Qp = this.LLJJJJ;
        if (c841703Qp != null) {
            String strLJIIIZ = C907803gi.LJIIIZ(C907803gi.LIZ, c841703Qp.LIZ, c841703Qp.LIZIZ, c841703Qp.LIZJ, false, true, null, null, null, 232);
            PaymentResult paymentResult = new PaymentResult("fail", str);
            AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(strLJIIIZ);
            anonymousClass0181.LJFF(3, C2097608Jq.LJIIJ(new Pair("pay_route", "h5"), new Pair("pay_result", C1741890vQh.LJIIIIZZ(paymentResult))));
            SmartRouter.buildRoute(context, anonymousClass0181.LIZ()).open();
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C841103Qj c841103Qj;
        int iHashCode = str.hashCode();
        if (iHashCode != -2092891032) {
            if (iHashCode != 78722455) {
                if (iHashCode == 1025755504 && str.equals("ec_pay_middle_successed") && (c841103Qj = this.LLIZ) != null) {
                    c841103Qj.LIZIZ();
                    return;
                }
                return;
            }
            if (!str.equals("ec_ocp_payment_cancel") || this.LLJLIL) {
                return;
            }
            this.LLJLIL = true;
            C841103Qj c841103Qj2 = this.LLIZ;
            if (c841103Qj2 != null) {
                c841103Qj2.LIZ(this.LLJJIJIIJIL);
            }
            C841103Qj c841103Qj3 = this.LLIZ;
            if (c841103Qj3 == null) {
                return;
            }
            c841103Qj3.LIZIZ();
            return;
        }
        if (!str.equals("ec_payment_interrupted")) {
            return;
        }
        if (LJIIJJI()) {
            LJIIIZ(this.LLJL);
            return;
        }
        C841103Qj c841103Qj4 = this.LLIZ;
        if (c841103Qj4 != null) {
            c841103Qj4.LIZ(this.LLJJIJIIJIL);
        }
        C841103Qj c841103Qj5 = this.LLIZ;
        if (c841103Qj5 == null) {
            return;
        }
        c841103Qj5.LIZIZ();
    }

    public final Unit LJIIJ(C043B c043b, BillInfoData billInfoData, String str) {
        if (this.LLJJJIL) {
            return Unit.LIZ;
        }
        this.LLJJIJIIJIL = str;
        this.LLJJJIL = true;
        this.LLJJI = UUID.randomUUID().toString();
        HashMap mapLJ = LJ(c043b);
        C03Y0 c03y0 = C03Y0.LIZ;
        Context context = this.LL;
        PaymentInfo paymentInfoNp = c043b.np();
        AwS100S0400000_1 awS100S0400000_1 = new AwS100S0400000_1(this, (C03QL) c043b, (C043B<?>) billInfoData, (BillInfoData) mapLJ, (HashMap<String, Object>) 35);
        c03y0.getClass();
        C03Y0.LIZJ(context, billInfoData, mapLJ, true, paymentInfoNp, awS100S0400000_1);
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }

    public C03QL(Context context, C1019703yl c1019703yl, OneClickPayContext oneClickPayContext, String str) {
        this.LL = context;
        this.LLILLJJLI = c1019703yl;
        this.LLILLL = oneClickPayContext;
        this.LLILZ = str;
    }

    public final void LJFF(C043B<?> c043b, BillInfoData billInfoData, HashMap<String, Object> map, C860903Xz c860903Xz) {
        if (this.LLILLL == null) {
            return;
        }
        C03Y2 c03y2 = c860903Xz.LIZ;
        String str = "unknown";
        if (c03y2 == C03Y2.USER_CANCEL) {
            String str2 = this.LLJJI;
            OneClickPayContext oneClickPayContext = this.LLILLL;
            String str3 = oneClickPayContext.paymentId;
            if (str3 == null) {
                str3 = "unknown";
            }
            String str4 = oneClickPayContext.mainOrderId;
            if (str4 == null) {
                str4 = "unknown";
            }
            String str5 = this.LLILZ;
            if (str5 != null) {
                str = str5;
            }
            new RdOneClickPayEvent("cancelled", str2, str3, str4, null, null, null, null, "user cancelled payment selection", null, null, str).LIZ();
            this.LLJJJIL = false;
            LJIILIIL();
            C841103Qj c841103Qj = this.LLIZ;
            if (c841103Qj != null) {
                c841103Qj.LIZ.Lo().OG(false);
                return;
            }
            return;
        }
        if (c03y2 != C03Y2.SUCCESS) {
            String str6 = this.LLJJI;
            OneClickPayContext oneClickPayContext2 = this.LLILLL;
            String str7 = oneClickPayContext2.paymentId;
            if (str7 == null) {
                str7 = "unknown";
            }
            String str8 = oneClickPayContext2.mainOrderId;
            if (str8 == null) {
                str8 = "unknown";
            }
            String str9 = this.LLILZ;
            if (str9 != null) {
                str = str9;
            }
            new RdOneClickPayEvent("error", str6, str7, str8, null, null, null, null, "payment selection error", null, null, str).LIZ();
            this.LLJJJIL = false;
            LJIILIIL();
            C841103Qj c841103Qj2 = this.LLIZ;
            if (c841103Qj2 != null) {
                c841103Qj2.LIZ(this.LLJJIJIIJIL);
                return;
            }
            return;
        }
        if (c860903Xz.LIZJ != null && c860903Xz.LIZIZ != null) {
            c043b.C01(c860903Xz.LIZLLL);
            this.LLJJIII = c860903Xz.LIZJ.id;
            C03VQ.LIZ.getClass();
            C03VQ.LIZIZ();
            C03VQ.LJIILL = System.currentTimeMillis();
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C03QQ(this, c043b, billInfoData, map, c860903Xz, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent r23, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r24, android.view.View r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QL.LJI(com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM, android.view.View, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[PHI: r5
      0x001e: PHI (r5v8 java.lang.String) = (r5v5 java.lang.String), (r5v9 java.lang.String) binds: [B:12:0x001c, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[PHI: r5
      0x0022: PHI (r5v7 java.lang.String) = (r5v5 java.lang.String), (r5v8 java.lang.String) binds: [B:12:0x001c, B:14:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[PHI: r5
      0x0082: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:40:0x0080, B:38:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[PHI: r5
      0x0086: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:40:0x0080, B:42:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC838003Pe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jM0(boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor.CommonPayResultEvent r22) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QL.jM0(boolean, boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor$CommonPayResultEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x097d  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Throwable, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r20v7, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r22v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo] */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo] */
    /* JADX WARN: Type inference failed for: r45v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r78v2, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r80v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo] */
    /* JADX WARN: Type inference failed for: r81v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C043B<?> r105, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r106, java.util.HashMap<java.lang.String, java.lang.Object> r107, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r108, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r109, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r110, X.InterfaceC1364105Vn<? super kotlin.Unit> r111) {
        /*
            Method dump skipped, instruction units count: 2444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QL.LIZ(X.043B, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0430  */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r7v62, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C043B<?> r86, android.view.View r87, java.util.List<java.lang.String> r88, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta> r89, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r90, boolean r91, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r92) {
        /*
            Method dump skipped, instruction units count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QL.LIZIZ(X.043B, android.view.View, java.util.List, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // X.InterfaceC838003Pe
    public final void Lv1(EnumC828303Ll enumC828303Ll, String str, ExceptionUX exceptionUX, C03N8 c03n8, String str2, EcomPaymentInterceptor.PayResultEvent payResultEvent, EcomPaymentInterceptor.CommonPayResultEvent commonPayResultEvent) {
        Price price;
        String priceVal;
        String strLJJIIZ;
        ?? LJIIJJI;
        Integer num;
        String string;
        OneClickPayContext oneClickPayContext;
        Integer num2;
        ToastContent toastContent;
        Summary summary;
        C840503Qd c840503Qd = this.LLJJJJJIL;
        BillInfoData billInfoData = c840503Qd.LJ;
        if (billInfoData != null && (summary = billInfoData.summary) != null) {
            price = summary.total;
        } else {
            price = null;
        }
        String str3 = c840503Qd.LJII;
        String str4 = "";
        if (price == null || (priceVal = price.getPriceVal()) == null) {
            priceVal = "";
        }
        PaymentMethod paymentMethod = this.LLJJJJJIL.LJFF;
        if (paymentMethod == null) {
            strLJJIIZ = "";
        } else {
            strLJJIIZ = paymentMethod.LJJIIZ();
        }
        Boolean bool = Boolean.TRUE;
        C840503Qd c840503Qd2 = this.LLJJJJJIL;
        String str5 = c840503Qd2.LJIIIIZZ;
        BillInfoData billInfoData2 = c840503Qd2.LJ;
        if (billInfoData2 != null) {
            LJIIJJI = billInfoData2.LJIIJJI();
        } else {
            LJIIJJI = 0;
        }
        HashMap mapLIZ = C03OJ.LIZ(str3, priceVal, strLJJIIZ, bool, null, str5, LJIIJJI, 1, null);
        C841103Qj c841103Qj = this.LLIZ;
        if (c841103Qj != null) {
            c841103Qj.LIZIZ();
        }
        C048A c048a = new C048A();
        c048a.LJIIIIZZ(new AwS43S1300000_1(str, c03n8, this, exceptionUX, 22));
        c048a.LIZJ(false);
        int i = C828403Lm.LIZ[enumC828303Ll.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            AnonymousClass0489 anonymousClass0489 = new AnonymousClass0489();
            anonymousClass0489.LJIIIIZZ(new AwS115S1100000_1(str, mapLIZ, 4));
            anonymousClass0489.LIZJ(false);
            if (exceptionUX != null && (toastContent = exceptionUX.toastContent) != null && toastContent.message != null) {
                if (toastContent != null) {
                    string = toastContent.message;
                } else {
                    string = null;
                }
            } else {
                string = this.LL.getString(2131832960);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            if (C7806033c.LJIL() || ((oneClickPayContext = this.LLILLL) != null && (num2 = oneClickPayContext.payMethodSelectEnable) != null && num2.intValue() == 1)) {
                C841103Qj c841103Qj2 = this.LLIZ;
                if (c841103Qj2 != null) {
                    c841103Qj2.LIZ(this.LLJJIJIIJIL);
                    return;
                }
                return;
            }
            if (commonPayResultEvent != null) {
                C03VQ c03vq = C03VQ.LIZ;
                String str6 = commonPayResultEvent.payRequestId;
                String str7 = commonPayResultEvent.payType;
                boolean zLJFF = Intrinsics.LJFF(commonPayResultEvent.getPayParamsFromStorage, bool);
                if (string == null) {
                    string = "";
                }
                c03vq.getClass();
                C03VQ.LJIIJJI(str6, str7, string, zLJFF, true, false);
                return;
            }
            Context context = this.LL;
            if (string != null) {
                str4 = string;
            }
            LJII(context, str4);
            return;
        }
        AnonymousClass0489 anonymousClass04892 = new AnonymousClass0489();
        anonymousClass04892.LJIIIIZZ(new AwS580S0100000_1(mapLIZ, (HashMap<String, Object>) 34));
        anonymousClass04892.LIZJ(false);
        if (commonPayResultEvent != null) {
            C03VQ c03vq2 = C03VQ.LIZ;
            String str8 = this.LLJJI;
            String str9 = commonPayResultEvent.payType;
            boolean zLJFF2 = Intrinsics.LJFF(commonPayResultEvent.getPayParamsFromStorage, bool);
            c03vq2.getClass();
            C03VQ.LJIIJJI(str8, str9, null, zLJFF2, true, true);
            return;
        }
        C03VQ c03vq3 = C03VQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c03vq3.getClass();
        C03VQ.LJIL = jCurrentTimeMillis;
        C03O0.LIZ.getClass();
        C03O0.LJJIZ(null, null, null);
        LJIIIIZZ();
        OneClickPayContext oneClickPayContext2 = this.LLILLL;
        if (oneClickPayContext2 != null && (num = oneClickPayContext2.payMethodSelectEnable) != null && num.intValue() == 1 && Intrinsics.LJFF(this.LLJJIJIL, "live")) {
            AnonymousClass0378.LIZ().LIZ("ec_pdp_dismiss", "{}");
        }
    }
}
