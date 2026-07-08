package X;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.WebView;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoRequestWrapper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.StorePaymentMethodBizContent;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.ChangeBindCardResult;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03f3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C897503f3 {
    public static String LJ() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.format(new Date());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    public static boolean LJI(EnterParams enterParams) {
        String str;
        if (enterParams != null) {
            str = enterParams.paySource;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "bind_not_pay");
    }

    public static C1713520ugw LIZIZ(C887503dR c887503dR, String str) {
        String str2;
        n nVar = new n();
        if (c887503dR != null) {
            str2 = c887503dR.LJFF;
        } else {
            str2 = null;
        }
        nVar.LJJIIJ("source_id", str2);
        HashMap map = new HashMap();
        if (c887503dR != null) {
            String str3 = c887503dR.LJIILLIIL;
            if (str3 != null) {
                map.put("biz_type", str3);
            }
            String str4 = c887503dR.LJIIL;
            if (str4 != null) {
                map.put("cashier_original_track_id", str4);
            }
            Integer num = c887503dR.LJIILIIL;
            if (num != null) {
                map.put("rendering_num", String.valueOf(num.intValue()));
            }
            String str5 = c887503dR.LJIILJJIL;
            if (str5 != null) {
                map.put("bind_source", str5);
            }
            String str6 = c887503dR.LJIILL;
            if (str6 != null) {
                map.put("checkout_type", str6);
            }
        }
        C1713840uhS c1713840uhS = new C1713840uhS(nVar, new C00IN(map));
        if (str == null) {
            str = "";
        }
        return new C1713520ugw(new C1713590uh3(c1713840uhS, null, str), new C1714040uhm(EnumC1714450uiR.HALF_PAGE, null, null, null, null, false, null, 126), null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII(java.lang.String r6, java.lang.Boolean r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r8) {
        /*
            boolean r0 = LJI(r8)
            if (r0 == 0) goto Lc
            X.03c1 r0 = X.EnumC878703c1.CHANGE_CARD
            java.lang.String r6 = r0.getValue()
        Lc:
            r2 = 1
            r5 = 0
            if (r8 == 0) goto Lbe
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r8.paymentData
            if (r0 == 0) goto Lbe
            boolean r0 = r0.LJJIFFI()
            if (r0 != r2) goto Lbe
            r0 = 1
        L1b:
            java.lang.String r3 = "TTS_"
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            X.03fT r0 = X.EnumC900103fT.MEMBERSHIP_BIND
            java.lang.String r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
        L33:
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TTS_Entrance_"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3[r5] = r0
            r3[r2] = r4
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r3)
            return r0
        L4f:
            if (r8 == 0) goto L8b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r8.paymentData
            if (r0 == 0) goto L70
            boolean r0 = r0.LJJII()
            if (r0 != r2) goto L70
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            X.03fT r0 = X.EnumC900103fT.SNS_BIND
            java.lang.String r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            goto L33
        L70:
            boolean r0 = r8.LIZ()
            if (r0 != r2) goto L8b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            X.03fT r0 = X.EnumC900103fT.BIDDING_BIND
            java.lang.String r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            goto L33
        L8b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto La8
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            X.03fT r0 = X.EnumC900103fT.NORMAL_ONETIME
            java.lang.String r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            goto L33
        La8:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            X.03fT r0 = X.EnumC900103fT.NORMAL_BIND
            java.lang.String r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            goto L33
        Lbe:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897503f3.LJII(java.lang.String, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams):java.util.List");
    }

    public static void LJIIIIZZ(C887503dR c887503dR, C893103eL c893103eL, String str) {
        String str2;
        if (c887503dR != null) {
            str2 = c887503dR.LJ;
        } else {
            str2 = null;
        }
        C1227904rF c1227904rF = C1227904rF.LIZ;
        ChangeBindCardResult changeBindCardResult = new ChangeBindCardResult(str2, c893103eL.LIZ.getValue());
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(changeBindCardResult);
        if (strLJI == null) {
            strLJI = "";
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("payment_open_bind_card_result", strLJI);
        C888603dc.LIZ.getClass();
        C888603dc.LIZ(c887503dR, c893103eL, str);
    }

    public static void LJIIJ(Context context, String str, Function0 function0) {
        try {
            C23250099c.LIZLLL(C876103bb.LIZLLL.getValue(), null, null, new C897903f7(context, str, function0, null), 3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static void LJFF(Context context, String str, Map map, final String str2, RedirectDetails redirectDetails) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "?";
        ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJFF("ecom_independent_bind", new InterfaceC1725210uzn() { // from class: X.03fd
            @Override // X.InterfaceC1725210uzn
            public final boolean LIZ(WebView webView, String str4, String str5) {
                return false;
            }

            @Override // X.InterfaceC1725210uzn
            public final JSONObject LIZIZ() throws JSONException {
                String str4 = str2;
                if (str4 == null) {
                    return null;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("payment_method_id", str4);
                return jSONObject3;
            }
        }, true);
        byte[] bytes = null;
        if (redirectDetails.header != null) {
            try {
                if (Intrinsics.LJFF(new JSONObject(redirectDetails.header).optString("three_ds_del_mid_page"), "true")) {
                    if (C123100dR.LIZ(redirectDetails.url)) {
                        str = redirectDetails.url;
                    }
                    if (Intrinsics.LJFF(redirectDetails.method, "GET")) {
                        C907803gi c907803gi = C907803gi.LIZ;
                        String str4 = redirectDetails.body;
                        if (str4 != null) {
                            jSONObject2 = new JSONObject(str4);
                        } else {
                            jSONObject2 = null;
                        }
                        c907803gi.getClass();
                        String strLIZIZ = C907803gi.LIZIZ(jSONObject2);
                        if (strLIZIZ.length() > 0) {
                            if (a0.LJJIIZI(str, "?", false)) {
                                str3 = "&";
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(str3);
                            sbLIZ.append(strLIZIZ);
                            str = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } else if (Intrinsics.LJFF(redirectDetails.method, "POST")) {
                        C907803gi c907803gi2 = C907803gi.LIZ;
                        String str5 = redirectDetails.body;
                        if (str5 != null) {
                            jSONObject = new JSONObject(str5);
                        } else {
                            jSONObject = null;
                        }
                        c907803gi2.getClass();
                        bytes = C907803gi.LIZIZ(jSONObject).getBytes(Charsets.UTF_8);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("url", str);
        ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LIZIZ(context, C919503ib.LIZLLL("aweme://echybrid", linkedHashMap).toString(), "ecom_independent_bind", false, -1, bytes, null, null);
    }

    public static final PipoRequestWrapper LIZ(Cashier cashier, EnterParams enterParams, C887503dR c887503dR, String str, PaymentInfo paymentInfo, boolean z) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        String str2;
        String str3;
        String str4;
        String str5;
        n nVar;
        List<PaymentElement> list;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        PaymentMethodsData paymentMethodsData;
        IPipoService iPipoService;
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        String string = UUID.randomUUID().toString();
        boolean z4 = true;
        String str18 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IAppSettingDependencyService.class.getName();
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        String appLanguage = ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage();
        C900203fU c900203fU = new C900203fU();
        if (cashier != null) {
            str2 = cashier.env;
        } else {
            str2 = null;
        }
        c900203fU.LIZ = str2;
        c900203fU.LIZLLL = "android";
        c900203fU.LIZJ = "";
        c900203fU.LIZIZ = appLanguage;
        if (c887503dR != null) {
            str3 = c887503dR.LIZ;
        } else {
            str3 = null;
        }
        if (cashier != null) {
            str4 = cashier.merchantId;
            str5 = cashier.nonce;
        } else {
            str4 = null;
            str5 = null;
        }
        C1724390uyT c1724390uyT = C1724390uyT.LIZ;
        if (c887503dR != null) {
            nVar = c887503dR.LJIIIIZZ;
            list = c887503dR.LJIIIZ;
            str6 = c887503dR.LJIIJ;
        } else {
            nVar = null;
            list = null;
            str6 = null;
        }
        c1724390uyT.getClass();
        JSONObject jSONObjectLIZ = C1724390uyT.LIZ(str6, nVar, list);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            C189200o6.m2constructorimpl(jSONObjectLIZ.put("user_create_time", simpleDateFormat.format(new Date())));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c887503dR != null) {
            str7 = c887503dR.LIZ;
        } else {
            str7 = null;
        }
        jSONObjectLIZ.put("user_id", str7);
        jSONObjectLIZ.put("request_id", UUID.randomUUID().toString());
        jSONObjectLIZ.put("verify_request_id", str);
        if (c887503dR != null) {
            str8 = c887503dR.LIZ;
        } else {
            str8 = null;
        }
        jSONObjectLIZ.put("uid", str8);
        if (z) {
            str9 = "independent_set";
        } else {
            str9 = "bind";
        }
        jSONObjectLIZ.put("set_scenario", str9);
        if (c887503dR != null) {
            str10 = c887503dR.LJFF;
        } else {
            str10 = null;
        }
        Boolean bool = Boolean.FALSE;
        jSONObjectLIZ.put("scene_tag", LJII(str10, bool, enterParams));
        if (enterParams != null && enterParams.LJJIIJ) {
            jSONObjectLIZ.put(Scene.SCENE_SERVICE, "coupon_purchase");
        }
        C888503db.LIZ.getClass();
        if (C888503db.LJ(enterParams) && (iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Boolean boolValueOf = Boolean.valueOf(iPipoService.LJIIJ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext()));
            if (boolValueOf.booleanValue()) {
                boolValueOf.booleanValue();
                jSONObjectLIZ.put("biometric_type", "general");
            }
        }
        if (c887503dR != null) {
            str11 = c887503dR.LJIIJJI;
        } else {
            str11 = null;
        }
        jSONObjectLIZ.put("first_checkout_consultation_id", str11);
        String strJ3 = C786410Ut5.J3(jSONObjectLIZ);
        if (c887503dR != null) {
            str12 = c887503dR.LIZJ;
            str13 = c887503dR.LIZLLL;
        } else {
            str12 = null;
            str13 = null;
        }
        Amount amount = new Amount(str12, str13, null);
        JSONObject jSONObjectLIZ2 = C03S7.LIZIZ(C03S7.LJI(paymentInfo, true, 4)).LIZ();
        if (enterParams == null || (!Intrinsics.LJFF(enterParams.LJJIJLIJ, Boolean.TRUE) && (enterParams == null || (paymentMethodsData = enterParams.paymentData) == null || ((!paymentMethodsData.LJJII() && !enterParams.LIZ() && !paymentMethodsData.LJJIFFI()) || enterParams.LJJIJIIJI == EnumC837803Pc.SECOND_PAY)))) {
            z4 = false;
        }
        if (c887503dR != null) {
            str14 = c887503dR.LJFF;
        } else {
            str14 = null;
        }
        List listLJII = LJII(str14, bool, enterParams);
        if (c887503dR != null) {
            str18 = c887503dR.LJ;
            str15 = c887503dR.LIZIZ;
        } else {
            str15 = null;
        }
        C921103ir.LIZ.getClass();
        String strLIZ = new StorePaymentMethodBizContent(c900203fU, str4, str3, string, jSONObjectLIZ2, "aweme://ec/payment_bind_card_3ds_result", strJ3, null, null, bool, str15, str5, amount, null, null, str18, Boolean.valueOf(z4), listLJII, C921103ir.LIZ("ccdc_card_info", "binding"), null).LIZ();
        C914303hl.LIZ.getClass();
        Cashier cashier2 = C914303hl.LIZIZ;
        if (cashier2 != null) {
            str16 = cashier2.merchantId;
        } else {
            str16 = null;
        }
        String strLJ = LJ();
        Cashier cashier3 = C914303hl.LIZIZ;
        if (cashier3 != null) {
            str17 = cashier3.nonce;
        } else {
            str17 = null;
        }
        return new PipoRequestWrapper(str16, strLJ, null, strLIZ, str17, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0311 A[Catch: Exception -> 0x0338, TryCatch #5 {Exception -> 0x0338, blocks: (B:71:0x014c, B:72:0x014f, B:74:0x0155, B:76:0x0164, B:81:0x016e, B:83:0x0182, B:86:0x018b, B:90:0x0193, B:92:0x01ad, B:94:0x01b1, B:95:0x01b3, B:98:0x01c1, B:100:0x01c5, B:101:0x01cb, B:103:0x01d7, B:105:0x01e3, B:107:0x01ef, B:109:0x01f5, B:111:0x01fd, B:113:0x0209, B:116:0x021c, B:118:0x0220, B:119:0x0222, B:120:0x022b, B:123:0x0230, B:124:0x0240, B:125:0x0250, B:127:0x025c, B:129:0x0262, B:132:0x0268, B:137:0x0271, B:138:0x0273, B:140:0x0277, B:141:0x0279, B:146:0x0291, B:148:0x0295, B:149:0x0297, B:150:0x02a7, B:152:0x02ba, B:154:0x02be, B:155:0x02c0, B:157:0x02cd, B:159:0x02d1, B:160:0x02d9, B:162:0x02dd, B:163:0x02df, B:168:0x0303, B:170:0x0307, B:171:0x0309, B:173:0x0311, B:175:0x0323, B:177:0x0327, B:178:0x0329, B:82:0x0179, B:88:0x018f), top: B:206:0x014c, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: Exception -> 0x033a, TryCatch #3 {Exception -> 0x033a, blocks: (B:27:0x0094, B:29:0x0098, B:31:0x009c, B:33:0x00ab, B:38:0x00b4, B:40:0x00c8, B:43:0x00d1, B:47:0x00d9, B:49:0x00e7, B:52:0x00ed, B:57:0x00f8, B:62:0x010c, B:64:0x0120, B:66:0x0124, B:67:0x0126, B:39:0x00bf, B:45:0x00d5, B:24:0x0082), top: B:203:0x0082, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8 A[Catch: Exception -> 0x033a, TryCatch #3 {Exception -> 0x033a, blocks: (B:27:0x0094, B:29:0x0098, B:31:0x009c, B:33:0x00ab, B:38:0x00b4, B:40:0x00c8, B:43:0x00d1, B:47:0x00d9, B:49:0x00e7, B:52:0x00ed, B:57:0x00f8, B:62:0x010c, B:64:0x0120, B:66:0x0124, B:67:0x0126, B:39:0x00bf, B:45:0x00d5, B:24:0x0082), top: B:203:0x0082, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1 A[Catch: Exception -> 0x0338, TryCatch #5 {Exception -> 0x0338, blocks: (B:71:0x014c, B:72:0x014f, B:74:0x0155, B:76:0x0164, B:81:0x016e, B:83:0x0182, B:86:0x018b, B:90:0x0193, B:92:0x01ad, B:94:0x01b1, B:95:0x01b3, B:98:0x01c1, B:100:0x01c5, B:101:0x01cb, B:103:0x01d7, B:105:0x01e3, B:107:0x01ef, B:109:0x01f5, B:111:0x01fd, B:113:0x0209, B:116:0x021c, B:118:0x0220, B:119:0x0222, B:120:0x022b, B:123:0x0230, B:124:0x0240, B:125:0x0250, B:127:0x025c, B:129:0x0262, B:132:0x0268, B:137:0x0271, B:138:0x0273, B:140:0x0277, B:141:0x0279, B:146:0x0291, B:148:0x0295, B:149:0x0297, B:150:0x02a7, B:152:0x02ba, B:154:0x02be, B:155:0x02c0, B:157:0x02cd, B:159:0x02d1, B:160:0x02d9, B:162:0x02dd, B:163:0x02df, B:168:0x0303, B:170:0x0307, B:171:0x0309, B:173:0x0311, B:175:0x0323, B:177:0x0327, B:178:0x0329, B:82:0x0179, B:88:0x018f), top: B:206:0x014c, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r22, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r23, java.lang.String r24, X.C887503dR r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r26, boolean r27, X.InterfaceC1685420txc<? super X.EnumC880203cG, ? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails, ? super java.lang.String, ? super java.lang.String, ? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo, kotlin.Unit> r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897503f3.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, X.03dR, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean, X.0txc, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020d A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c2 A[Catch: Exception -> 0x032d, TryCatch #2 {Exception -> 0x032d, blocks: (B:116:0x025f, B:117:0x0262, B:119:0x0268, B:121:0x0277, B:126:0x0280, B:128:0x0294, B:131:0x029d, B:138:0x02aa, B:139:0x02ac, B:141:0x02c2, B:143:0x02c6, B:144:0x02cc, B:146:0x02d8, B:147:0x02dd, B:149:0x02e0, B:151:0x02ec, B:152:0x02f2, B:154:0x02fe, B:155:0x0304, B:157:0x0308, B:158:0x030a, B:161:0x0314, B:165:0x0325, B:166:0x0327, B:127:0x028b, B:133:0x02a1), top: B:181:0x025f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314 A[Catch: Exception -> 0x032d, TryCatch #2 {Exception -> 0x032d, blocks: (B:116:0x025f, B:117:0x0262, B:119:0x0268, B:121:0x0277, B:126:0x0280, B:128:0x0294, B:131:0x029d, B:138:0x02aa, B:139:0x02ac, B:141:0x02c2, B:143:0x02c6, B:144:0x02cc, B:146:0x02d8, B:147:0x02dd, B:149:0x02e0, B:151:0x02ec, B:152:0x02f2, B:154:0x02fe, B:155:0x0304, B:157:0x0308, B:158:0x030a, B:161:0x0314, B:165:0x0325, B:166:0x0327, B:127:0x028b, B:133:0x02a1), top: B:181:0x025f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168 A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf A[Catch: Exception -> 0x032f, TRY_ENTER, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd A[Catch: Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:27:0x00a6, B:29:0x00aa, B:31:0x00ae, B:33:0x00bd, B:38:0x00c6, B:40:0x00da, B:43:0x00e3, B:49:0x00ef, B:50:0x00fd, B:52:0x0104, B:53:0x0108, B:55:0x010d, B:61:0x011c, B:62:0x011e, B:64:0x0123, B:65:0x0125, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:72:0x0144, B:74:0x014a, B:75:0x014c, B:80:0x015f, B:85:0x0168, B:86:0x016f, B:89:0x01bf, B:91:0x01cb, B:92:0x01cd, B:94:0x01d9, B:95:0x01db, B:99:0x0206, B:101:0x020d, B:102:0x020f, B:104:0x0213, B:105:0x0215, B:107:0x0238, B:113:0x0242, B:98:0x01fd, B:39:0x00d1, B:45:0x00e7), top: B:179:0x00a6, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r8v19, types: [T, com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r32, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r33, X.C887503dR r34, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r35, java.lang.String r36, java.lang.Boolean r37, kotlin.jvm.functions.Function2<? super X.EnumC880203cG, ? super com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoPreBindVerifyData, kotlin.Unit> r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897503f3.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams, X.03dR, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo, java.lang.String, java.lang.Boolean, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
