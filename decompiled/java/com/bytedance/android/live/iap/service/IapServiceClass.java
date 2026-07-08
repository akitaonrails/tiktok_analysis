package com.bytedance.android.live.iap.service;

import X.AbstractC1157490gE7;
import X.AbstractC19484711Kz;
import X.C086I;
import X.C0KMX;
import X.C0KPG;
import X.C0KPI;
import X.C0KQG;
import X.C0KQW;
import X.C0KSM;
import X.C0KSV;
import X.C0TP3;
import X.C0WZX;
import X.C1017903yT;
import X.C1161920gLG;
import X.C1617170sBX;
import X.C1701330uNH;
import X.C1782250wTn;
import X.C1788220wdQ;
import X.C1788890weV;
import X.C1789900wg8;
import X.C1789910wg9;
import X.C1789920wgA;
import X.C1789930wgB;
import X.C1789940wgC;
import X.C1789950wgD;
import X.C1789960wgE;
import X.C1789970wgF;
import X.C1790090wgR;
import X.C1791590wir;
import X.C1791720wj4;
import X.C1791730wj5;
import X.C1791740wj6;
import X.C1791780wjA;
import X.C1791850wjH;
import X.C1792010wjX;
import X.C1792030wjZ;
import X.C1792170wjn;
import X.C1792200wjq;
import X.C1792240wju;
import X.C1792760wkk;
import X.C1792770wkl;
import X.C1792940wl2;
import X.C1793920wmc;
import X.C1795430wp3;
import X.C1796530wqp;
import X.C1864850yd1;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C352701Yn;
import X.C497740JfY;
import X.C518080KTm;
import X.C518150KTt;
import X.C518160KTu;
import X.C519980KaK;
import X.C519990KaL;
import X.C597480Nc2;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1782240wTm;
import X.EnumC1791830wjF;
import X.EnumC1792020wjY;
import X.EnumC1792040wja;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1789300wfA;
import X.InterfaceC1791300wiO;
import X.InterfaceC1791550win;
import X.InterfaceC1791670wiz;
import X.InterfaceC1791680wj0;
import X.InterfaceC1791700wj2;
import X.InterfaceC1791790wjB;
import X.InterfaceC1791820wjE;
import X.InterfaceC1795130woZ;
import X.InterfaceC1795150wob;
import X.InterfaceC1795160woc;
import X.InterfaceC518100KTo;
import X.InterfaceC518110KTp;
import X.InterfaceC518120KTq;
import Y.AkS488S0100000_27;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapServiceClass;
import com.bytedance.android.livesdk.iap.AbsIapPricing;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIAPRefactorErrorHandling;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIAPRefactorPaymentSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIAPRefactorQuerySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIapRefactorPrecheck;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.globalpayment.iap.model.AbsIapPricingPhase;
import com.bytedance.globalpayment.iap.model.IapCommonProduct;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class IapServiceClass implements IapService {
    public final String LL = "";

    @Override // X.InterfaceC1791930wjP
    public final Object LJIIJ(C1788220wdQ c1788220wdQ, InterfaceC1364105Vn<? super AbstractC1157490gE7<InterfaceC1791790wjB>> interfaceC1364105Vn) {
        return LJIJJLI(this, c1788220wdQ, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1791930wjP
    public final Object LJIIJJI(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LJIILLIIL(this, str, str2, interfaceC1364105Vn);
    }

    public static EnumC1791830wjF LJIJI() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        return C2093608Ic.LIZJ("amazon_int", iHostAppContext != null ? iHostAppContext.getChannel() : null) ? EnumC1791830wjF.AMAZON : EnumC1791830wjF.GOOGLE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.iap.service.IapService
    public final String getCurrencyCode() {
        String str = C1792940wl2.LIZIZ;
        if (str.length() != 0) {
            return str;
        }
        C1792940wl2 c1792940wl2 = new C1792940wl2();
        return (String) AbstractC19484711Kz.LJII(new C1864850yd1(c1792940wl2, 1)).LJJII(new AkS488S0100000_27(c1792940wl2, 8)).LJ();
    }

    public IapServiceClass() {
        C1795430wp3.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1791930wjP
    public final String getBillingCountryCode() {
        return C1793920wmc.LIZ().getBillingCountryCode();
    }

    @Override // com.bytedance.android.live.iap.service.IapService
    @InterfaceC1294060jmO
    public final boolean ti1() {
        if (LJIJI() == EnumC1791830wjF.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().isSupportGooglePay();
        }
        return false;
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJ(InterfaceC518110KTp interfaceC518110KTp) {
        C1793920wmc.LIZ().queryHasSubscriptionProducts(LJIJI(), new C1792200wjq(null, null, null, interfaceC518110KTp, 2));
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJIIL(final C1792760wkk c1792760wkk) {
        C1793920wmc.LIZ().checkExternalLinkEligibility(LJIJI(), new InterfaceC1795130woZ() { // from class: X.0wjc
            @Override // X.InterfaceC1795130woZ
            public final void LIZ(C1792840wks c1792840wks) {
                C1792150wjl c1792150wjl;
                EnumC1792040wja enumC1792040wja;
                boolean z = true;
                if (c1792840wks.LIZ == 0) {
                    c1792150wjl = new C1792150wjl(true, true, null);
                } else {
                    C1791850wjH c1791850wjH = c1792840wks.LJIIIIZZ;
                    if (c1791850wjH == null || (enumC1792040wja = c1791850wjH.LIZ) == null || (enumC1792040wja != EnumC1792040wja.FEATURE_NOT_SUPPORTED && enumC1792040wja != EnumC1792040wja.BILLING_NOT_SUPPORTED)) {
                        z = false;
                    }
                    c1792150wjl = new C1792150wjl(z, false, C1792030wjZ.LIZJ(c1792840wks));
                }
                c1792760wkk.LIZ(c1792150wjl);
            }
        });
    }

    public static C1792170wjn LJIJ(C1791720wj4 c1791720wj4, HashMap map) {
        String strLIZ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1791730wj5 c1791730wj5 = c1791720wj4.LIZJ;
        C519990KaL c519990KaL = c1791720wj4.LIZLLL;
        boolean z = c1791720wj4.LIZIZ;
        C1792170wjn c1792170wjn = new C1792170wjn(jUptimeMillis);
        c1792170wjn.LIZIZ = c1791720wj4.LIZ;
        c1792170wjn.LJ = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        c1792170wjn.LIZLLL = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        c1792170wjn.LJIIJJI = z;
        if (map != null) {
            Object obj = map.get("series_category");
            if (obj != null && (strLIZ = C1791740wj6.LIZ(obj)) != null) {
                map.put("biz_scenario", strLIZ);
            }
            c1792170wjn.LIZLLL(map);
        }
        if (c1791730wj5 != null) {
            c1792170wjn.LJIIIZ = c1791730wj5.LIZ;
            boolean zLJFF = Intrinsics.LJFF(c1791730wj5.LIZIZ, "subs");
            c1792170wjn.LJII = zLJFF;
            if (zLJFF) {
                c1792170wjn.LJIIL = C2097608Jq.LJIIJ(new Pair("OfferIDToken", c1791730wj5.LIZJ), new Pair("price_currency", c1791730wj5.LJ), new Pair("price_amount_micros", String.valueOf(c1791730wj5.LIZLLL)));
            }
        }
        if (z && c519990KaL != null) {
            c1792170wjn.LJIIIIZZ = c519990KaL.LIZIZ;
            c1792170wjn.LJFF = c519990KaL.LIZ;
        }
        return c1792170wjn;
    }

    public static C518160KTu LJIJJ(String str, List list) {
        if (C086I.LIZIZ(list)) {
            C518160KTu c518160KTu = new C518160KTu();
            EnumC1792040wja enumC1792040wja = EnumC1792040wja.INTEGRATION_ERROR;
            C1791850wjH c1791850wjH = new C1791850wjH(enumC1792040wja);
            c518160KTu.LJIIIIZZ = Integer.valueOf(enumC1792040wja.getValue());
            c518160KTu.LJIIIZ = c1791850wjH.LIZIZ;
            c518160KTu.LIZ = 0;
            c518160KTu.LIZIZ = 20;
            c518160KTu.LIZJ = -1;
            c518160KTu.LJFF = "query pipo product id list empty";
            if (Intrinsics.LJFF(str, "inapp")) {
                C1796530wqp.LIZ(20, -1, "query pipo product id list empty");
                return c518160KTu;
            }
            C1796530wqp.LIZJ(20, -1, "query pipo product id list empty");
            return c518160KTu;
        }
        return null;
    }

    @Override // X.InterfaceC1791930wjP
    public final void LIZ(C1617170sBX c1617170sBX, InterfaceC1791300wiO interfaceC1791300wiO) {
        if (LiveIAPRefactorQuerySetting.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789910wg9(c1617170sBX, null), new AwS606S0100000_27(interfaceC1791300wiO, 39));
            return;
        }
        C1791590wir c1791590wirLJIIZILJ = LJIIZILJ(interfaceC1791300wiO, c1617170sBX, false);
        List<String> list = c1617170sBX.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        C518160KTu c518160KTuLJIJJ = LJIJJ(c1617170sBX.LIZJ, arrayList);
        if (c518160KTuLJIJJ != null) {
            c1791590wirLJIIZILJ.LIZLLL(new C518150KTt(false, null, C1792030wjZ.LIZIZ(c518160KTuLJIJJ)));
            return;
        }
        C1792200wjq c1792200wjq = new C1792200wjq(null, c1791590wirLJIIZILJ, null, null, 13);
        String str2 = c1617170sBX.LIZJ;
        if (Intrinsics.LJFF(str2, "inapp")) {
            C1793920wmc.LIZ().queryProductDetails(LJIJI(), arrayList, this.LL, c1792200wjq);
            return;
        }
        if (Intrinsics.LJFF(str2, "subs")) {
            C1793920wmc.LIZ().querySubscriptionDetails(LJIJI(), arrayList, this.LL, c1792200wjq);
            return;
        }
        C518080KTm c518080KTm = new C518080KTm();
        c518080KTm.LIZ = 0;
        c518080KTm.LIZIZ = 10;
        c518080KTm.LIZJ = -1;
        c518080KTm.LJFF = "invalid query parameter";
        c1791590wirLJIIZILJ.LIZLLL(new C518150KTt(false, null, C1792030wjZ.LIZIZ(c518080KTm)));
    }

    @Override // X.InterfaceC1791930wjP
    public final void LIZJ(final InterfaceC518100KTo interfaceC518100KTo, C1789940wgC c1789940wgC) {
        if (LiveIapRefactorPrecheck.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789930wgB(InterfaceC1789300wfA.LIZ.LIZIZ(), c1789940wgC, null), new AwS393S0200000_27(interfaceC518100KTo, c1789940wgC, 185));
            return;
        }
        InterfaceC1791550win interfaceC1791550win = new InterfaceC1791550win() { // from class: X.0wim
            @Override // X.InterfaceC1791550win
            public final void LIZ(List<C1791560wio> list) {
                C0KQW c0kqwLIZJ;
                C0KQD c0kqd;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C1791560wio c1791560wio : list) {
                    String str = c1791560wio.LJIILL;
                    C0KM0 c0km0LIZLLL = C1792030wjZ.LIZLLL(c1791560wio.LJIILIIL);
                    if (c1791560wio.LJIILIIL == 1) {
                        c0kqwLIZJ = C1792030wjZ.LIZJ(c1791560wio);
                    } else {
                        c0kqwLIZJ = null;
                    }
                    C0KTZ c0ktzLIZ = C1792030wjZ.LIZ(c1791560wio.LJIIZILJ);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) c1791560wio.LJIILJJIL).iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Integer) it2.next()).intValue();
                        if (iIntValue != 0) {
                            if (iIntValue != 1) {
                                if (iIntValue != 2) {
                                    if (iIntValue != 3) {
                                        c0kqd = C0KQD.UNKNOWN;
                                    } else {
                                        c0kqd = C0KQD.CANCEL;
                                    }
                                } else {
                                    c0kqd = C0KQD.PLAN_CHANGE;
                                }
                            } else {
                                c0kqd = C0KQD.RESIGN_UP;
                            }
                        } else {
                            c0kqd = C0KQD.PURCHASES;
                        }
                        arrayList.add(c0kqd);
                    }
                    Pair pair = new Pair(str, new C517630KRt(c0km0LIZLLL, c0kqwLIZJ, arrayList, c1791560wio.LJIILL, c1791560wio.LJIILLIIL, c0ktzLIZ, c1791560wio.LJ));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                interfaceC518100KTo.LIZ(linkedHashMap);
            }
        };
        C1793920wmc.LIZ().subscriptionPreCheck(new C1792240wju(c1789940wgC.LIZ, c1789940wgC.LJ, c1789940wgC.LIZIZ, c1789940wgC.LIZLLL, c1789940wgC.LIZJ), interfaceC1791550win);
    }

    @Override // X.InterfaceC1791930wjP
    public final void LIZLLL(EnumC1782240wTm enumC1782240wTm, Context context) {
        String str;
        int i = C1782250wTn.LIZ[enumC1782240wTm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "";
                    } else {
                        str = "https://play.google.com/store/paymentmethods";
                    }
                } else {
                    str = "https://play.google.com/store";
                }
            } else {
                str = "https://play.google.com/store/account/orderhistory";
            }
        } else {
            str = "https://play.google.com/store/account/subscriptions";
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse(str).buildUpon().appendQueryParameter("sku", "").appendQueryParameter("package", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
        intent.setPackage("com.android.vending");
        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965953);
        if (context != null) {
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYFZp7pTnJ3RduqbDGA+JuJdOlTQDTRZPwYbaw", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C766270U4b.LIZLLL(2131842040);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0wiy] */
    @Override // X.InterfaceC1791930wjP
    @InterfaceC1294060jmO
    public final void LJIIIZ(final InterfaceC1791670wiz interfaceC1791670wiz, final C1617170sBX c1617170sBX) {
        if (LiveIAPRefactorQuerySetting.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789920wgA(c1617170sBX, null), new AwS606S0100000_27(interfaceC1791670wiz, 663));
            return;
        }
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final String strLIZ = C1017903yT.LIZ();
        C1788890weV.LIZJ(c1617170sBX.LIZ, c1617170sBX.LIZIZ, strLIZ, LJIJI(), false);
        ?? r5 = new InterfaceC1791670wiz() { // from class: X.0wiy
            @Override // X.InterfaceC1791670wiz
            public final void LIZLLL(C518160KTu c518160KTu) {
                ArrayList arrayList;
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                C1617170sBX c1617170sBX2 = c1617170sBX;
                String str = c1617170sBX2.LIZ;
                List<String> list = c1617170sBX2.LIZIZ;
                Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
                if (map != null) {
                    arrayList = new ArrayList(map.size());
                    Iterator<Map.Entry<String, IapProductDetail>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getKey());
                    }
                } else {
                    arrayList = null;
                }
                String str2 = strLIZ;
                this.getClass();
                C1788890weV.LIZ(str, jUptimeMillis2, list, arrayList, null, null, str2, IapServiceClass.LJIJI(), false);
                interfaceC1791670wiz.LIZLLL(c518160KTu);
            }

            @Override // X.InterfaceC1791670wiz
            public final void LJ(C518080KTm c518080KTm) {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                C1617170sBX c1617170sBX2 = c1617170sBX;
                String str = c1617170sBX2.LIZ;
                List<String> list = c1617170sBX2.LIZIZ;
                Integer num = c518080KTm.LJIIIIZZ;
                String str2 = c518080KTm.LJIIIZ;
                String str3 = strLIZ;
                this.getClass();
                C1788890weV.LIZ(str, jUptimeMillis2, list, null, num, str2, str3, IapServiceClass.LJIJI(), false);
                interfaceC1791670wiz.LJ(c518080KTm);
            }
        };
        List<String> list = c1617170sBX.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        C518160KTu c518160KTuLJIJJ = LJIJJ(c1617170sBX.LIZJ, arrayList);
        if (c518160KTuLJIJJ != null) {
            r5.LJ(c518160KTuLJIJJ);
            return;
        }
        C1792200wjq c1792200wjq = new C1792200wjq(r5, null, null, null, 2);
        String str2 = c1617170sBX.LIZJ;
        if (Intrinsics.LJFF(str2, "inapp")) {
            C1793920wmc.LIZ().queryProductDetails(LJIJI(), arrayList, this.LL, c1792200wjq);
            return;
        }
        if (Intrinsics.LJFF(str2, "subs")) {
            C1793920wmc.LIZ().querySubscriptionDetails(LJIJI(), arrayList, this.LL, c1792200wjq);
            return;
        }
        C518080KTm c518080KTm = new C518080KTm();
        c518080KTm.LIZ = 0;
        c518080KTm.LIZIZ = 10;
        c518080KTm.LIZJ = -1;
        c518080KTm.LJFF = "invalid query parameter";
        r5.LJ(c518080KTm);
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJIILJJIL(C1617170sBX c1617170sBX, C0KSM c0ksm) {
        if (LiveIAPRefactorQuerySetting.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789900wg8(c1617170sBX, null), new AwS606S0100000_27(c0ksm, 662));
            return;
        }
        final C1791590wir c1791590wirLJIIZILJ = LJIIZILJ(c0ksm, c1617170sBX, true);
        InterfaceC1791680wj0 interfaceC1791680wj0 = new InterfaceC1791680wj0() { // from class: X.0wis
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
            @Override // X.InterfaceC1791680wj0
            public final void LIZ(Map<String, IapCommonProduct> map, C1792840wks c1792840wks) {
                ?? arrayList;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Object key = entry.getKey();
                        IapCommonProduct iapCommonProduct = (IapCommonProduct) entry.getValue();
                        List<AbsIapPricingPhase> list = iapCommonProduct.pricePhases;
                        if (list != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (AbsIapPricingPhase absIapPricingPhase : list) {
                                arrayList.add(new AbsIapPricing(absIapPricingPhase.mPrice, absIapPricingPhase.mPriceAmountMicros, absIapPricingPhase.mPriceCurrencyCode));
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        String str = iapCommonProduct.clientPayload;
                        if (str == null) {
                            str = "";
                        }
                        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                        if (iHostAppContext != null) {
                            iHostAppContext.currentRegionCode();
                        }
                        linkedHashMap.put(key, new C0KSW(str, arrayList));
                    }
                    c1791590wirLJIIZILJ.LJ(new C0KSV(true, linkedHashMap, null));
                    return;
                }
                C518160KTu c518160KTu = new C518160KTu();
                C1791760wj8.LIZ(c518160KTu, c1792840wks);
                c1791590wirLJIIZILJ.LJ(new C0KSV(false, null, C1792030wjZ.LIZIZ(c518160KTu)));
            }
        };
        List<String> list = c1617170sBX.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        C518160KTu c518160KTuLJIJJ = LJIJJ(c1617170sBX.LIZJ, arrayList);
        if (c518160KTuLJIJJ != null) {
            c1791590wirLJIIZILJ.LJ(new C0KSV(false, null, C1792030wjZ.LIZIZ(c518160KTuLJIJJ)));
        } else {
            C1793920wmc.LIZ().queryCommonProductDetails(c1617170sBX.LIZIZ, c1617170sBX.LIZ, interfaceC1791680wj0);
        }
    }

    @Override // X.InterfaceC1791930wjP
    public final void triggerInAppMessages(Activity activity, String str) {
        C1793920wmc.LIZ().triggerInAppMessages(activity, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJJLI(com.bytedance.android.live.iap.service.IapServiceClass r8, X.C1788220wdQ r9, X.InterfaceC1364105Vn<? super X.AbstractC1157490gE7<X.InterfaceC1791790wjB>> r10) {
        /*
            boolean r0 = r10 instanceof X.C1790350wgr
            if (r0 == 0) goto L70
            r7 = r10
            X.0wgr r7 = (X.C1790350wgr) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto La6
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0gEg r1 = (X.AbstractC1157840gEg) r1
            boolean r0 = r1 instanceof X.C1157830gEf
            if (r0 == 0) goto L7c
            X.0gEf r1 = (X.C1157830gEf) r1
            T r3 = r1.LIZ
            X.0wby r3 = (X.InterfaceC1787320wby) r3
            boolean r0 = r3 instanceof X.C1157590gEH
            if (r0 == 0) goto L43
            X.0gE5 r2 = new X.0gE5
            X.0gEH r3 = (X.C1157590gEH) r3
            java.lang.String r1 = r3.LIZ
            java.lang.String r0 = r3.LIZIZ
            r2.<init>(r1, r0)
        L3d:
            X.0gE6 r0 = new X.0gE6
            r0.<init>(r2)
            return r0
        L43:
            boolean r0 = r3 instanceof X.C1787330wbz
            if (r0 == 0) goto L4a
            X.0wjD r2 = X.C1791810wjD.LIZ
            goto L3d
        L4a:
            boolean r0 = r3 instanceof X.C1787310wbx
            if (r0 == 0) goto L76
            X.0wjC r2 = X.C1791800wjC.LIZ
            goto L3d
        L51:
            X.C155000ia.LIZIZ(r1)
            X.0wdG r4 = new X.0wdG
            android.app.Activity r3 = r9.LIZ
            java.lang.String r2 = r9.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r9.LIZJ
            java.lang.String r0 = r9.LIZLLL
            r4.<init>(r3, r2, r1, r0)
            X.0wf7 r0 = X.InterfaceC1789300wfA.LIZ
            X.0weu r0 = r0.LIZIZ()
            r7.LLILLL = r5
            java.lang.Object r1 = r0.LJFF(r4, r7)
            if (r1 != r6) goto L22
            return r6
        L70:
            X.0wgr r7 = new X.0wgr
            r7.<init>(r8, r10)
            goto L12
        L76:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L7c:
            boolean r0 = r1 instanceof X.C1157850gEh
            if (r0 == 0) goto La0
            X.0gEh r1 = (X.C1157850gEh) r1
            X.0wbk r3 = r1.LIZ
            X.0KQW r2 = new X.0KQW
            X.0wje r1 = X.EnumC1792020wjY.Companion
            int r0 = r3.getCode()
            r1.getClass()
            X.0wjY r1 = X.C1792080wje.LIZ(r0)
            java.lang.String r0 = r3.getMessage()
            r2.<init>(r1, r0)
            X.0gE8 r0 = new X.0gE8
            r0.<init>(r2)
            return r0
        La0:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.iap.service.IapServiceClass.LJIJJLI(com.bytedance.android.live.iap.service.IapServiceClass, X.0wdQ, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1791930wjP
    public final void LIZIZ(Activity activity, C1789970wgF c1789970wgF, final InterfaceC518120KTq interfaceC518120KTq) {
        if (LiveIAPRefactorPaymentSetting.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789950wgD(activity, c1789970wgF, null), new AwS606S0100000_27(interfaceC518120KTq, 38));
            return;
        }
        String str = c1789970wgF.LIZ;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        try {
            String string = a0.LJLIIIL(str).toString();
            if (u.LJIIZILJ(string, ".1", false)) {
                string = new String(Base64.getDecoder().decode(a0.LJLIIIL(string).toString().substring(0, string.length() - 2)), Charsets.UTF_8);
            }
            JSONObject jSONObject = new JSONObject(string);
            C1791720wj4 c1791720wj4 = new C1791720wj4(0);
            c1791720wj4.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "merchant_id");
            c1791720wj4.LIZJ = C0KQG.LIZ(jSONObject);
            c1791720wj4.LIZLLL = C519980KaK.LIZIZ(strValueOf, jSONObject);
            c1791720wj4.LIZIZ = true;
            C1793920wmc.LIZ().newPay(activity, LJIJ(c1791720wj4, c1789970wgF.LIZIZ), new C1792200wjq(null, null, new InterfaceC1791700wj2() { // from class: X.0wj1
                @Override // X.InterfaceC1791700wj2
                public final void LIZIZ(C518140KTs c518140KTs) {
                    interfaceC518120KTq.LIZ(new C0KPG(C0KPI.SUCCESS, c518140KTs.LJIIJ, c518140KTs.LJIIJJI, null, null, 24));
                }

                @Override // X.InterfaceC1791700wj2
                public final void LIZJ(C518140KTs c518140KTs) {
                    interfaceC518120KTq.LIZ(new C0KPG(c518140KTs.LJII, null, null, C1792030wjZ.LIZIZ(c518140KTs), c518140KTs, 6));
                }
            }, null, 2));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC518120KTq.LIZ(new C0KPG(C0KPI.FAILED, null, null, new C0KQW(EnumC1792020wjY.INTEGRATION_ERROR, "Integration error occurred"), null, 22));
        }
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJII(Activity activity, String str, final C1792770wkl c1792770wkl) {
        C1793920wmc.LIZ().launchExternalLink(LJIJI(), activity, str, new InterfaceC1795150wob() { // from class: X.0wjd
            @Override // X.InterfaceC1795150wob
            public final void LIZ(C1794920woE c1794920woE) {
                C1792160wjm c1792160wjm;
                C0KQW c0kqwLIZJ = null;
                if (c1794920woE.LIZ == 0) {
                    c1792160wjm = new C1792160wjm(true, c1794920woE.LJIILIIL, null);
                } else {
                    if (c1794920woE.LJIIIIZZ != null) {
                        c0kqwLIZJ = C1792030wjZ.LIZJ(c1794920woE);
                    }
                    c1792160wjm = new C1792160wjm(false, c1794920woE.LJIILIIL, c0kqwLIZJ);
                }
                c1792770wkl.LIZ(c1792160wjm);
            }
        });
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJIIIIZZ(Context context, final InterfaceC1791820wjE interfaceC1791820wjE, final String str) {
        if (LiveIapRefactorPrecheck.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C597480Nc2(InterfaceC1789300wfA.LIZ.LIZIZ(), str, null), new AwS606S0100000_27(interfaceC1791820wjE, 664));
        } else {
            final long jUptimeMillis = SystemClock.uptimeMillis();
            C1793920wmc.LIZ().checkPaymentEnvironment(LJIJI(), new InterfaceC1795160woc() { // from class: X.0wj7
                @Override // X.InterfaceC1795160woc
                public final void LIZ(C1792840wks c1792840wks) {
                    C1791770wj9 c1791770wj9;
                    Integer numValueOf;
                    String str2;
                    EnumC1792020wjY enumC1792020wjY;
                    if (c1792840wks.LIZ == 0) {
                        c1791770wj9 = new C1791770wj9(true, 2);
                    } else {
                        c1791770wj9 = new C1791770wj9(false, C1792030wjZ.LIZJ(c1792840wks));
                    }
                    String str3 = str;
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    this.getClass();
                    EnumC1791830wjF enumC1791830wjFLJIJI = IapServiceClass.LJIJI();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_env_precheck_result");
                    c474500IjALIZ.LJJII(str3, "merchant_id");
                    c474500IjALIZ.LJJII(C1792910wkz.LIZIZ, "channel_sdk_version");
                    c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis2), "time_consuming");
                    c474500IjALIZ.LJJII(Boolean.valueOf(c1791770wj9.LIZ), "can_make_payment");
                    c474500IjALIZ.LJJII(enumC1791830wjFLJIJI, "payment_method");
                    if (true ^ c1791770wj9.LIZ) {
                        C0KQW c0kqw = c1791770wj9.LIZIZ;
                        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                            numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                        } else {
                            numValueOf = null;
                        }
                        c474500IjALIZ.LJJII(numValueOf, "iap_error_code");
                        C0KQW c0kqw2 = c1791770wj9.LIZIZ;
                        if (c0kqw2 == null || (str2 = c0kqw2.LIZIZ) == null) {
                            str2 = "";
                        }
                        c474500IjALIZ.LJJII(str2, "iap_error_message");
                        c474500IjALIZ.LJJII(Integer.valueOf(c1792840wks.LIZ), "result_code");
                        c474500IjALIZ.LJJII(Integer.valueOf(c1792840wks.LIZIZ), "result_detail_code");
                        c474500IjALIZ.LJJII(c1792840wks.LJ, "result_message");
                    }
                    c474500IjALIZ.LIZ();
                    interfaceC1791820wjE.LIZ(c1791770wj9);
                }
            }, context);
        }
    }

    public final C1791590wir LJIIZILJ(InterfaceC1791300wiO interfaceC1791300wiO, C1617170sBX c1617170sBX, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        String strLIZ = C1017903yT.LIZ();
        C1788890weV.LIZJ(c1617170sBX.LIZ, c1617170sBX.LIZIZ, strLIZ, LJIJI(), z);
        return new C1791590wir(jUptimeMillis, c1617170sBX, strLIZ, this, z, interfaceC1791300wiO);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LJIILLIIL(com.bytedance.android.live.iap.service.IapServiceClass r5, java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof X.C1790360wgs
            if (r0 == 0) goto L40
            r4 = r8
            X.0wgs r4 = (X.C1790360wgs) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            boolean r0 = r1 instanceof X.C1157830gEf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0wf7 r0 = X.InterfaceC1789300wfA.LIZ
            X.0weu r1 = r0.LIZIZ()
            com.bytedance.iap.core.model.IAPCheckExternalPaymentRequest r0 = new com.bytedance.iap.core.model.IAPCheckExternalPaymentRequest
            r0.<init>(r6, r7)
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LIZJ(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L40:
            X.0wgs r4 = new X.0wgs
            r4.<init>(r5, r8)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.iap.service.IapServiceClass.LJIILLIIL(com.bytedance.android.live.iap.service.IapServiceClass, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1791930wjP
    public final void LJFF(Context context, C0KPG c0kpg, String str, JSONObject jSONObject) throws JSONException {
        String strName;
        EnumC1792020wjY enumC1792020wjY;
        String str2;
        EnumC1792020wjY enumC1792020wjY2;
        if (!LiveIAPRefactorErrorHandling.INSTANCE.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleExternalBusinessError(): resultState=");
            sbLIZ.append(c0kpg.LIZ.name());
            sbLIZ.append(" error.code=");
            C0KQW c0kqw = c0kpg.LIZLLL;
            Object objValueOf = "NOERROR";
            if (c0kqw == null || (enumC1792020wjY2 = c0kqw.LIZ) == null || (strName = enumC1792020wjY2.name()) == null) {
                strName = "NOERROR";
            }
            sbLIZ.append(strName);
            sbLIZ.append(" iapInternalError.detailCode=");
            C518080KTm c518080KTm = c0kpg.LJ;
            if (c518080KTm != null) {
                objValueOf = Integer.valueOf(c518080KTm.LIZJ);
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LIZIZ("IapExceptionUtils", C2188811AlT.LIZIZ(sbLIZ));
            if (context != null) {
                IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                C0TP3.LIZ.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("merchant_id", str);
                jSONObject2.put("iap_order_id", c0kpg.LIZJ);
                C0KQW c0kqw2 = c0kpg.LIZLLL;
                if (c0kqw2 == null || (enumC1792020wjY = c0kqw2.LIZ) == null) {
                    enumC1792020wjY = EnumC1792020wjY.UNDEFINED;
                }
                jSONObject2.put("iap_error_code", enumC1792020wjY.getValue());
                C0KQW c0kqw3 = c0kpg.LIZLLL;
                if (c0kqw3 == null || (str2 = c0kqw3.LIZIZ) == null) {
                    str2 = "UNDEFINED";
                }
                jSONObject2.put("iap_error_message", str2);
                jSONObject2.put("biz_meta", jSONObject);
                iHostUser.event("iap_recharge", C786410Ut5.J3(jSONObject2));
                int i = C1792010wjX.LIZIZ[c0kpg.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleExternalBusinessError(): NOTREACHED resultState=");
                                sbLIZ2.append(c0kpg.LIZ.name());
                                C20441214yg.LIZIZ("IapExceptionUtils", C2188811AlT.LIZIZ(sbLIZ2));
                                C0TP3.LIZ(context, context.getString(2131851586), context.getString(2131837519), 2131837517, C0TP3.LIZIZ(context, str, c0kpg));
                                return;
                            }
                            C0KQW c0kqw4 = c0kpg.LIZLLL;
                            if (c0kqw4 == null) {
                                return;
                            }
                            switch (C1792010wjX.LIZ[c0kqw4.LIZ.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    if (c0kqw4.LIZ == EnumC1792020wjY.PAYMENT_BLOCK) {
                                        C0TP3.LIZ(context, context.getString(2131851586), context.getString(2131837518), 2131842037, new AwS413S0200000_12(EnumC1782240wTm.ORDER_HISTORY, context, 31));
                                    } else {
                                        C0TP3.LIZ(context, context.getString(2131851586), context.getString(2131837519), 2131837517, C0TP3.LIZIZ(context, str, c0kpg));
                                    }
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131837510));
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131837509));
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841097));
                                    break;
                                default:
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("handleExternalBusinessError(): NOTREACHED resultState=FAILED errorCode=");
                                    sbLIZ3.append(c0kqw4.LIZ.name());
                                    C20441214yg.LIZIZ("IapExceptionUtils", C2188811AlT.LIZIZ(sbLIZ3));
                                    C0TP3.LIZ(context, context.getString(2131851586), context.getString(2131837519), 2131837517, C0TP3.LIZIZ(context, str, c0kpg));
                                    break;
                            }
                            return;
                        }
                        C0TP3.LIZ(context, context.getString(2131842039), context.getString(2131837518), 2131842037, new AwS413S0200000_12(EnumC1782240wTm.ORDER_HISTORY, context, 31));
                        return;
                    }
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843724));
                    return;
                }
                C20441214yg.LIZIZ("IapExceptionUtils", "handleExternalBusinessError(): NOTREACHED resultState=SUCCESS");
            }
        }
    }

    @Override // X.InterfaceC1791930wjP
    @InterfaceC1294060jmO
    public final void LJIILL(Activity activity, C0KMX c0kmx, InterfaceC1791700wj2 interfaceC1791700wj2, HashMap<String, Object> map) {
        String strLIZ;
        C1792170wjn c1792170wjnLJIJ;
        if (LiveIAPRefactorPaymentSetting.INSTANCE.getValue()) {
            C352701Yn.LIZ(C786410Ut5.N3(C497740JfY.LJII()), new C1789960wgE(c0kmx, activity, map, null), new AwS606S0100000_27(interfaceC1791700wj2, 37));
            return;
        }
        if (c0kmx instanceof C1791720wj4) {
            c1792170wjnLJIJ = LJIJ((C1791720wj4) c0kmx, map);
        } else if (c0kmx instanceof C1790090wgR) {
            C1790090wgR c1790090wgR = (C1790090wgR) c0kmx;
            C1791780wjA c1791780wjA = new C1791780wjA(SystemClock.uptimeMillis());
            c1791780wjA.LJIILL = c1790090wgR.LIZ;
            c1791780wjA.LJIILLIIL = c1790090wgR.LIZIZ;
            LJIJI();
            c1791780wjA.LJIIIZ = c1790090wgR.LIZJ;
            c1791780wjA.LIZIZ = c1790090wgR.LIZLLL;
            c1791780wjA.LJ = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            c1791780wjA.LIZLLL = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            c1792170wjnLJIJ = c1791780wjA;
            if (map != null) {
                Object obj = map.get("series_category");
                if (obj != null && (strLIZ = C1791740wj6.LIZ(obj)) != null) {
                    map.put("biz_scenario", strLIZ);
                }
                c1791780wjA.LIZLLL(map);
                c1792170wjnLJIJ = c1791780wjA;
            }
        } else {
            throw new RuntimeException("unsupported type");
        }
        C1793920wmc.LIZ().newPay(activity, c1792170wjnLJIJ, new C1792200wjq(null, null, interfaceC1791700wj2, null, 2));
    }
}
