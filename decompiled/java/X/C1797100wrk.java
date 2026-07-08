package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveQueryOrderExceptionMappingDisabledSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS489S0200000_27;
import kotlin.jvm.internal.AwS676S0100000_27;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* JADX INFO: renamed from: X.0wrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797100wrk implements InterfaceC1797160wrq {
    public static final C1797100wrk LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static volatile boolean LIZLLL;
    public static final C054G LJ;
    public volatile C1568880qve LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1797100wrk.class, "cashierPreloadJSTriggerUseCase", "getCashierPreloadJSTriggerUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/preload/IFECashierPreloadJSTriggerUseCase;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1797100wrk c1797100wrk = new C1797100wrk();
        LIZIZ = c1797100wrk;
        LJ = C2296808zG.LIZ(C0PEM.LIZJ);
        c1797100wrk.init();
    }

    @Override // X.InterfaceC1797160wrq
    public final void LIZ() {
        if (C1797030wrd.LIZIZ) {
            C1803540x28.LJII(null, null, null);
        }
    }

    @Override // X.InterfaceC1797160wrq
    public final void init() {
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        C1795430wp3.LIZ.LIZJ();
        C1793920wmc.LIZ().addIapObserver(new InterfaceC1794730wnv() { // from class: X.0wpg
            @Override // X.InterfaceC1794730wnv
            public final void LIZ() {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZJ(EnumC1791830wjF enumC1791830wjF, String str) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIIIZZ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
                String str;
                HashMap map = new HashMap();
                if (enumC1791830wjF != null) {
                    str = enumC1791830wjF.channelName;
                } else {
                    str = "";
                }
                map.put("pay_method", str);
                if (c1792840wks == null) {
                    C1796590wqv.LIZJ("ttlive_pipo_init", -1, -1, "iapResult is null", map);
                } else {
                    if (c1792840wks.LIZIZ()) {
                        return;
                    }
                    C1796590wqv.LIZJ("ttlive_pipo_init", c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, map);
                }
            }
        });
        C1793920wmc.LIZ().addIapObserver(C1796480wqk.LIZJ);
    }

    @Override // X.InterfaceC1797160wrq
    public final void LJ(List<String> list, InterfaceC1796910wrR interfaceC1796910wrR) {
        EnumC1791830wjF enumC1791830wjF;
        String payload;
        if (C1796440wqg.LIZIZ()) {
            enumC1791830wjF = EnumC1791830wjF.AMAZON;
        } else {
            enumC1791830wjF = EnumC1791830wjF.GOOGLE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() != 0) {
                arrayList.add(str);
            }
        }
        if (C086I.LIZIZ(arrayList)) {
            C1796590wqv.LIZIZ(20, "ttlive_query_pipo_purchase", "query pipo product id list empty");
            LJIIIIZZ(this, interfaceC1796910wrR, 1, 20, -1, "1-10-10-00", "Empty Product Detail from google", "ttlive_query_pipo_purchase", new Exception("query pipo product id list empty"), null, null, 1792);
            return;
        }
        IapExternalService iapExternalServiceLIZ = C1793920wmc.LIZ();
        if (interfaceC1796910wrR == null || (payload = interfaceC1796910wrR.getPayload()) == null) {
            payload = "";
        }
        iapExternalServiceLIZ.queryProductDetails(enumC1791830wjF, arrayList, payload, new C1796470wqj(interfaceC1796910wrR));
    }

    @Override // X.InterfaceC1797160wrq
    public final void LIZLLL(final String str, final String str2, final int i, final InterfaceC1796910wrR interfaceC1796910wrR, final boolean z) {
        String billingCountryCode;
        boolean zLJI = MethodIDManager.LJI(202496);
        final long jUptimeMillis = SystemClock.uptimeMillis();
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJJIJIIJIL = ((IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class)).checkOrderResult(str2, billingCountryCode).LJIILIIL(new C0UO0()).LJJIJIIJIL(new C09JN() { // from class: X.0gG7
            @Override // X.C09JN
            public final void accept(Object obj) throws Exception {
                int i2;
                Integer numValueOf;
                C1C7U.LIZ("PayManager@437b.chargeCheckOrder$subscribe$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                QueryOrderResult.ChargeOrderData chargeOrderData = (QueryOrderResult.ChargeOrderData) baseResponse.data;
                if (chargeOrderData != null && chargeOrderData.status == 1) {
                    C1C7U.LIZIZ("PayManager@437b.chargeCheckOrder$subscribe$1");
                    return;
                }
                if (LiveQueryOrderExceptionMappingDisabledSetting.INSTANCE.getValue()) {
                    QueryOrderResult.ChargeOrderData chargeOrderData2 = (QueryOrderResult.ChargeOrderData) baseResponse.data;
                    if (chargeOrderData2 != null) {
                        i2 = chargeOrderData2.status;
                    } else {
                        i2 = -313;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("server status is not 1. Server status ");
                    QueryOrderResult.ChargeOrderData chargeOrderData3 = (QueryOrderResult.ChargeOrderData) baseResponse.data;
                    if (chargeOrderData3 != null) {
                        numValueOf = Integer.valueOf(chargeOrderData3.status);
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    throw new C517460KRc(i2, C2188811AlT.LIZIZ(sbLIZ));
                }
                throw new Exception("server status is not 1");
            }
        });
        if (!z) {
            c11nzLJJIJIIJIL = c11nzLJJIJIIJIL.LJJLIIIJLJLI(new C1811860xFY(3, 1000L));
        }
        c11nzLJJIJIIJIL.LJJLL(new C09JN() { // from class: X.0wrS
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PayManager@437b.chargeCheckOrder$subscribe$3");
                BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse = (BaseResponse) obj;
                HashMap<String, Object> map = new HashMap<>();
                map.put("duration", Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                map.put("productId", str);
                map.put("orderId", str2);
                map.put("isPreCheck", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
                C1796590wqv.LIZ("ttlive_wallet_check_order", map);
                map.put("is_subscription", 0);
                C1796530wqp.LIZ.LIZLLL(map);
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (C1797030wrd.LIZIZ) {
                    C1797030wrd.LJIILL = jUptimeMillis2;
                }
                C1796880wrO c1796880wrO = new C1796880wrO(str, str2, i);
                C1797270ws1.LJ().LIZ(str2, baseResponse);
                C1797100wrk c1797100wrk = C1797100wrk.LIZIZ;
                InterfaceC1796910wrR interfaceC1796910wrR2 = interfaceC1796910wrR;
                C1797010wrb c1797010wrb = new C1797010wrb(3, null, null, c1796880wrO, null, null, 502);
                c1797100wrk.getClass();
                if (interfaceC1796910wrR2 != null) {
                    interfaceC1796910wrR2.LJIILJJIL(3, c1797010wrb);
                    interfaceC1796910wrR2.LJIILIIL(c1797010wrb);
                }
                C1C7U.LIZIZ("PayManager@437b.chargeCheckOrder$subscribe$3");
            }
        }, new C09JN() { // from class: X.0wrT
            @Override // X.C09JN
            public final void accept(Object obj) {
                Exception exc;
                C1C7U.LIZ("PayManager@437b.chargeCheckOrder$subscribe$4");
                Throwable th = (Throwable) obj;
                HashMap map = new HashMap();
                map.put("isPreCheck", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
                C1796590wqv.LIZJ("ttlive_wallet_check_order", 41, -1, "check order fail", map);
                Pair pairLIZ = C517450KRb.LIZ(-1, th);
                long j = jUptimeMillis;
                C1796530wqp.LIZ.LJFF(((Number) pairLIZ.getFirst()).intValue(), str, SystemClock.uptimeMillis() - j, str2, (String) pairLIZ.getSecond(), false);
                C1797100wrk c1797100wrk = C1797100wrk.LIZIZ;
                InterfaceC1796910wrR interfaceC1796910wrR2 = interfaceC1796910wrR;
                if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                    exc = new Exception(th);
                }
                C1797100wrk.LJIIIIZZ(c1797100wrk, interfaceC1796910wrR2, 3, 41, -1, "1-40-51-00", "Business Query Order Failure", "ttlive_wallet_check_order", exc, str, str2, 1024);
                C1C7U.LIZIZ("PayManager@437b.chargeCheckOrder$subscribe$4");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJII(InterfaceC1796910wrR interfaceC1796910wrR, int i, int i2, Throwable th, String str) {
        if (th instanceof Exception) {
            LJIIIIZZ(this, interfaceC1796910wrR, i, 31, i2, "1-20-51-00", "create wallet order api error", "ttlive_wallet_create_order", (Exception) th, str, null, 1536);
        }
    }

    @Override // X.InterfaceC1797160wrq
    public final void LIZIZ(int i, int i2, int i3, int i4, C19EG c19eg, C1807550x8b c1807550x8b, Diamond diamond, String str) throws Throwable {
        LJFF(c19eg, diamond, c1807550x8b, str, i, i2, 0, i3, i4, null, false, "", new AwS489S0200000_27(diamond, c1807550x8b, 2), new C1797230wrx(i2, i, i3, i4, c19eg, c1807550x8b, diamond, str), null, null, "", String.valueOf(i2), 0, null, null, null, false, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0wry] */
    @Override // X.InterfaceC1797160wrq
    public final void LIZJ(Context context, Diamond diamond, InterfaceC1796910wrR interfaceC1796910wrR, Long l, RechargeRequestParams rechargeRequestParams, C1776960wLG c1776960wLG, C1797120wrm c1797120wrm, String str, boolean z, Function0<Unit> function0) throws Throwable {
        int i;
        Activity activityLIZ;
        if (diamond.LJ != null && C1796440wqg.LIZIZ()) {
            i = 6;
        } else {
            i = 3;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1797240wry(interfaceC1796910wrR, diamond, rechargeRequestParams, context, c259800zU, i, l, c1797120wrm, str, z, function0);
        Function1<? super Throwable, Boolean> function1 = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        int i2 = rechargeRequestParams.chargeSource;
        Integer num = rechargeRequestParams.subSource;
        Boolean bool = rechargeRequestParams.firstRecharge;
        String str2 = rechargeRequestParams.penaltyWarningSkip;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        AwS676S0100000_27 awS676S0100000_27 = new AwS676S0100000_27(function0, (Function0<Unit>) 3);
        T t = c259800zU.element;
        if (t != 0) {
            function1 = (Function1) t;
        }
        List<String> list = rechargeRequestParams.voucherList;
        String str4 = rechargeRequestParams.chargeReason;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = rechargeRequestParams.requestPage;
        if (str5 != null) {
            str3 = str5;
        }
        LJFF(activityLIZ, diamond, interfaceC1796910wrR, "", i, i2, num, 0, 0, bool, false, str2, awS676S0100000_27, function1, list, l, str4, str3, rechargeRequestParams.campaignType, c1797120wrm, rechargeRequestParams.LIZ, str, z, rechargeRequestParams.vaultGiftId, c1776960wLG);
    }

    public static void LJIIIIZZ(C1797100wrk c1797100wrk, InterfaceC1796910wrR interfaceC1796910wrR, int i, int i2, int i3, String str, String str2, String str3, Exception exc, String str4, String str5, int i4) {
        String str6 = str4;
        String str7 = "";
        if ((i4 & 256) != 0) {
            str6 = "";
        }
        if ((i4 & 512) == 0) {
            str7 = str5;
        }
        c1797100wrk.getClass();
        C1797200wru c1797200wru = new C1797200wru(i, i2, i3, str, str2, str3, exc, str6, str7, 0, 0, null, 3072, null);
        String strValueOf = String.valueOf(i2);
        String strValueOf2 = String.valueOf(i3);
        String message = exc.getMessage();
        if (C1797030wrd.LIZIZ) {
            C1803540x28.LJII(strValueOf, strValueOf2, message);
        }
        if (interfaceC1796910wrR != null) {
            interfaceC1796910wrR.LIZLLL(i, c1797200wru);
        }
        switch (i) {
            case -1:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJ(i, c1797200wru);
                }
                break;
            case 1:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJIIZILJ(i, c1797200wru);
                }
                break;
            case 2:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJ(i, c1797200wru);
                }
                break;
            case 3:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJIIL(i, c1797200wru);
                }
                break;
            case 4:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJIILL(i, c1797200wru);
                }
                break;
            case 5:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LIZIZ(i, c1797200wru);
                }
                break;
            case 6:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJFF(i, c1797200wru);
                }
                break;
            case 7:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJIIIZ(i, c1797200wru);
                }
                break;
            case 8:
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJFF(i, c1797200wru);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182 A[PHI: r3
      0x0182: PHI (r3v8 int) = (r3v7 int), (r3v12 int), (r3v12 int) binds: [B:74:0x017b, B:60:0x0110, B:62:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v75, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.app.Activity r41, final com.bytedance.android.livesdk.wallet.Diamond r42, final X.InterfaceC1796910wrR r43, java.lang.String r44, int r45, final int r46, java.lang.Integer r47, int r48, int r49, java.lang.Boolean r50, boolean r51, java.lang.String r52, X.InterfaceC1631620sYq<? super com.bytedance.android.live.wallet.model.DiamondBuyResult, ? super X.C1792170wjn, ? super java.lang.Boolean, java.lang.Boolean> r53, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r54, java.util.List<java.lang.String> r55, java.lang.Long r56, java.lang.String r57, java.lang.String r58, int r59, X.C1797120wrm r60, X.C1802730x0p r61, final java.lang.String r62, final boolean r63, java.lang.Integer r64, final X.C1776960wLG r65) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1797100wrk.LJFF(android.app.Activity, com.bytedance.android.livesdk.wallet.Diamond, X.0wrR, java.lang.String, int, int, java.lang.Integer, int, int, java.lang.Boolean, boolean, java.lang.String, X.0sYq, kotlin.jvm.functions.Function1, java.util.List, java.lang.Long, java.lang.String, java.lang.String, int, X.0wrm, X.0x0p, java.lang.String, boolean, java.lang.Integer, X.0wLG):void");
    }
}
