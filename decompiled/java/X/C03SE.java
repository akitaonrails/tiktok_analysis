package X;

import Y.ACListenerS105S0200000_1;
import Y.AfS137S0200000_1;
import Y.AfS170S0100000_1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutFingerprintUserAgentCollectionModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentCCDCThreeDSConfigs;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomReportApplistInRiskModelConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElevatorBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MarketingTool;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LeadingElevatorBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S1200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03SE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SE {
    public static C419910GdJ LJJIJIIJIL() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.gp);
        c419910GdJ.LIZIZ = C679280Qkg.LIZ(6);
        c419910GdJ.LIZJ = C679280Qkg.LIZ(11);
        return c419910GdJ;
    }

    public static C419910GdJ LJJIJIL() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.gp);
        c419910GdJ.LIZIZ = C679280Qkg.LIZ(11);
        c419910GdJ.LIZJ = C679280Qkg.LIZ(11);
        return c419910GdJ;
    }

    public static PayRiskControlParam LJIIL() {
        if (Intrinsics.LJFF(C03SH.LIZ().enable, Boolean.TRUE)) {
            return LJIIJJI(null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r2) {
        /*
            r1 = 0
            if (r2 == 0) goto L39
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r2.paymentMethod
            if (r0 == 0) goto Lb
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r0.installmentInfo
            if (r0 != 0) goto L17
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r2.paymentMethod
            if (r0 == 0) goto L39
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r0 = r0.installmentInfoList
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
        L17:
            r1 = 1
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r2.paymentMethodInfo
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.tenure
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r2.paymentMethodInfo
            java.lang.String r0 = r0.installmentPlanId
            if (r0 != 0) goto L35
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r2.paymentMethod
            if (r0 == 0) goto L35
            boolean r0 = r0.LJJJJJ()
            if (r0 != r1) goto L35
            r1 = 0
        L35:
            return r1
        L36:
            if (r2 == 0) goto L35
            goto L2a
        L39:
            r0 = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):boolean");
    }

    public static final String LJI(PaymentMethod paymentMethod) {
        String strLIZ;
        List<CommuteInfo> list = paymentMethod.supportedPayCommuteTypes;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<CommuteInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                CommuteType commuteType = it2.next().commuteType;
                if (commuteType != null) {
                    strLIZ = C899503fN.LIZ(commuteType);
                } else {
                    strLIZ = null;
                }
                arrayList.add(strLIZ);
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "empty commute types";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r6 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r7 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7) {
        /*
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L16
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel> r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel.class
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel r1 = X.C03SG.LIZ     // Catch: java.lang.Exception -> L16
            java.lang.String r0 = "ecom_checkout_promotion_text_config"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)     // Catch: java.lang.Exception -> L16
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel) r0     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L13
            r1 = r0
        L13:
            java.util.List<java.lang.String> r6 = r1.prefixes     // Catch: java.lang.Exception -> L16
            goto L1b
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6 = 0
        L1b:
            X.013C r4 = new X.013C
            r4.<init>()
            r3 = 0
            r5 = 1
            if (r6 == 0) goto L2a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L30
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomCheckoutPromotionTextConfigModel r0 = X.C03SG.LIZ
            java.util.List<java.lang.String> r6 = r0.prefixes
            r4.element = r5
        L30:
            if (r7 == 0) goto L55
            if (r6 == 0) goto L63
            java.util.Iterator r2 = r6.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L38
            java.lang.String r0 = r7.id
            if (r0 == 0) goto L38
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r0, r1, r3)
            if (r0 != r5) goto L38
            return r5
        L55:
            if (r6 == 0) goto L61
        L57:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L61
            boolean r0 = r4.element     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L77
        L61:
            if (r7 == 0) goto L77
        L63:
            java.lang.String r2 = "rd_pipo_promotion_settings_debug"
            kotlin.jvm.internal.AwS367S0200000_1 r1 = new kotlin.jvm.internal.AwS367S0200000_1     // Catch: java.lang.Exception -> L70
            r0 = 112(0x70, float:1.57E-43)
            r1.<init>(r7, r4, r0)     // Catch: java.lang.Exception -> L70
            X.C1018703yb.LJII(r2, r1)     // Catch: java.lang.Exception -> L70
            return r3
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):boolean");
    }

    public static boolean LJIIJ(PaymentMethod paymentMethod) {
        String str;
        C03SY.LIZ.getClass();
        if (!C03SY.LIZJ(paymentMethod)) {
            C864903Zn c864903Zn = C864903Zn.LIZ;
            String str2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            c864903Zn.getClass();
            if (!C864903Zn.LIZ(str) && (paymentMethod == null || !paymentMethod.LJJJLZIJ())) {
                if (paymentMethod != null) {
                    str2 = paymentMethod.id;
                }
                if (!EcomMergeBalanceAndInstallmentSettings.LIZ(str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static PayRiskControlParam LJIIJJI(PaymentMethod paymentMethod) {
        String strOptString;
        String strOptString2;
        String str;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        String str2;
        String str3;
        DisplayMetrics displayMetrics;
        boolean z;
        String name;
        C1724230uyD.LIZ.getClass();
        JSONObject jSONObject = C1724230uyD.LIZIZ;
        List<PipoEcomReportApplistInRiskModelConfig> list = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("device_fp_id");
        } else {
            strOptString = null;
        }
        JSONObject jSONObject2 = C1724230uyD.LIZIZ;
        if (jSONObject2 != null) {
            strOptString2 = jSONObject2.optString("gp_device_fp_id");
        } else {
            strOptString2 = null;
        }
        if (paymentMethod != null) {
            str = paymentMethod.LJIIIIZZ;
        } else {
            str = null;
        }
        Boolean bool = PaymentCCDCThreeDSConfigs.LIZ().browserJavaEnabled;
        String str4 = PaymentCCDCThreeDSConfigs.LIZ().browserAcceptHeader;
        int i = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAppSettingDependencyService.class.getName();
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        String appLanguage = ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage();
        String str5 = PaymentCCDCThreeDSConfigs.LIZ().browserColorDepth;
        String strValueOf = String.valueOf(C03SI.LIZ(C7879035x.LIZ()));
        Application applicationLIZ = C7879035x.LIZ();
        if (applicationLIZ != null && (displayMetrics = applicationLIZ.getResources().getDisplayMetrics()) != null) {
            i = displayMetrics.heightPixels;
        }
        String strValueOf2 = String.valueOf(i);
        String id = TimeZone.getDefault().getID();
        String strLIZ = C09GB.LIZ();
        Boolean bool2 = PaymentCCDCThreeDSConfigs.LIZ().browserJavascriptEnabled;
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        C03SJ c03sj = C03SF.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLIZ2 = C03SF.LIZ(str2);
        try {
            C03SF.LIZ.remove(str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (strLIZ2 != null) {
            linkedHashMap.put("verify_request_id", strLIZ2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        Boolean bool3 = C03SH.LIZ().enable;
        Boolean bool4 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool3, bool4)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                str3 = C03SL.LIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
            if (str3 == null) {
                if (Intrinsics.LJFF(C03SH.LIZ().enable, bool4)) {
                    list = C03SH.LIZ().config;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (list != null) {
                    for (PipoEcomReportApplistInRiskModelConfig pipoEcomReportApplistInRiskModelConfig : list) {
                        C1725790v0j c1725790v0j = C1725790v0j.LIZ;
                        String str6 = pipoEcomReportApplistInRiskModelConfig.packageName;
                        String str7 = pipoEcomReportApplistInRiskModelConfig.schema;
                        c1725790v0j.getClass();
                        boolean zLIZIZ = C1725790v0j.LIZIZ(str6, str7);
                        String str8 = pipoEcomReportApplistInRiskModelConfig.appName;
                        if (str8 != null) {
                            linkedHashMap3.put(str8, C893803eS.LIZ(zLIZIZ));
                        }
                    }
                }
                C03SL.LIZ = C1741890vQh.LJIIIIZZ(linkedHashMap3);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAppVerifyResult cost: ");
                sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                str3 = C03SL.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
            }
            linkedHashMap2.put("app_verify_result", str3);
        }
        return new PayRiskControlParam(null, null, appLanguage, null, null, null, null, null, null, null, null, strOptString, strOptString2, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, null, str, bool, str4, str5, strValueOf2, strValueOf, id, strLIZ, bool2, linkedHashMap2);
    }

    public static InstallmentPlan LJIILIIL(PaymentMethod paymentMethod) {
        InstallmentInfo installmentInfoLJIILJJIL;
        List<InstallmentPlan> list;
        InstallmentPlan installmentPlan = null;
        if (paymentMethod.LJJIZ() || (installmentInfoLJIILJJIL = paymentMethod.LJIILJJIL()) == null || (list = installmentInfoLJIILJJIL.installmentPlans) == null) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InstallmentPlan next = it2.next();
            if (Intrinsics.LJFF(next.isDefault, Boolean.TRUE)) {
                installmentPlan = next;
                break;
            }
        }
        return installmentPlan;
    }

    public static String LJIILJJIL(BillInfoData billInfoData) {
        String str;
        Object obj;
        String str2;
        LeadingElevatorBar leadingElevatorBar;
        if (billInfoData != null && (leadingElevatorBar = billInfoData.leadingElevatorBar) != null) {
            str = leadingElevatorBar.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            obj = mapLJIIJ.get("bubble_type_info");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str2 = (String) obj) == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public static boolean LJIJJ(PaymentMethodInfo paymentMethodInfo) {
        String str;
        if (paymentMethodInfo != null) {
            String str2 = paymentMethodInfo.tenure;
            if (str2 != null && str2.length() != 0) {
                return false;
            }
            if (paymentMethodInfo != null) {
                String str3 = paymentMethodInfo.installmentPlanId;
                if (str3 != null && str3.length() != 0) {
                    return false;
                }
                if (paymentMethodInfo != null && (str = paymentMethodInfo.installmentOptionId) != null && str.length() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LJJIFFI(Function0 function0) {
        try {
            String str = (String) function0.invoke();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("installment_debug_info", str);
            C1018703yb.LIZIZ("rd_pipo_bnpl_debug", linkedHashMap);
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ(str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static List LJJIII(List list) {
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((InstallmentPlan) next).isDefault, Boolean.TRUE)) {
                if (next != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    arrayList.remove(next);
                    ListProtector.add(arrayList, 0, next);
                    return arrayList;
                }
            }
        }
        return list;
    }

    public static void LJJIJIIJI(Activity activity) {
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LIZ(2131832909);
        c1397580mTM.LJFF(2131832910);
        c1397580mTM.LJII = true;
        C1238130iKB.LIZ(c1397580mTM, new AwS580S0100000_1(activity, 204));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LIZ(Context context, Map map) {
        boolean z;
        String str;
        Object c098200Yq;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomCheckoutFingerprintUserAgentCollectionModel ecomCheckoutFingerprintUserAgentCollectionModel = C03SK.LIZ;
        EcomCheckoutFingerprintUserAgentCollectionModel ecomCheckoutFingerprintUserAgentCollectionModel2 = (EcomCheckoutFingerprintUserAgentCollectionModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_checkout_fingerprint_user_agent_collection", EcomCheckoutFingerprintUserAgentCollectionModel.class, ecomCheckoutFingerprintUserAgentCollectionModel);
        if (ecomCheckoutFingerprintUserAgentCollectionModel2 != null) {
            ecomCheckoutFingerprintUserAgentCollectionModel = ecomCheckoutFingerprintUserAgentCollectionModel2;
        }
        if (!ecomCheckoutFingerprintUserAgentCollectionModel.enableCollection) {
            return;
        }
        if (C03PI.LJJIFFI != null) {
            z = true;
        } else {
            z = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context contextN3 = C786410Ut5.N3(context);
        String property = C03PI.LJJIFFI;
        if (property == null) {
            try {
                c098200Yq = C786410Ut5.F3(C786410Ut5.N3(contextN3));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            property = (String) c098200Yq;
            if ((property == null || !(!a0.LJJJIL(property))) && (property = System.getProperty("http.agent")) == null) {
                property = "";
            }
            if (!a0.LJJJIL(property)) {
                C03PI.LJJIFFI = property;
            }
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (ecomCheckoutFingerprintUserAgentCollectionModel.enableTrack) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "payment_method");
            linkedHashMap.put("duration", Long.valueOf(jElapsedRealtime2));
            linkedHashMap.put("is_success", Integer.valueOf(!a0.LJJJIL(property) ? 1 : 0));
            if (z) {
                str = "cache";
            } else if (!a0.LJJJIL(property)) {
                str = "uncached";
            } else {
                str = "blank";
            }
            linkedHashMap.put("source", str);
            linkedHashMap.put("ua_length", Integer.valueOf(property.length()));
            linkedHashMap.put("is_main_thread", Integer.valueOf(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) ? 1 : 0));
            C1018503yZ.LIZIZ("rd_pipo_fingerprint_user_agent_duration", linkedHashMap, false);
            C921903iz.LIZ.getClass();
            C921903iz.LIZIZ(4, linkedHashMap, "rd_pipo_fingerprint_user_agent_duration");
        }
        if (!a0.LJJJIL(property)) {
            map.put("fingerprint_user_agent", property);
        }
    }

    public static void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str2);
        linkedHashMap.put("installment_debug_info", str);
        C1018703yb.LIZIZ("pipo_bnpl_debug", linkedHashMap);
        C1018703yb.LIZIZ("rd_pipo_bnpl_debug", linkedHashMap);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bnplDebugLog: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
    }

    public static boolean LIZJ(PaymentMethod paymentMethod, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        List<InstallmentPlan> list;
        if (paymentMethod == null) {
            return true;
        }
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if (installmentInfo == null) {
            z2 = true;
            z = false;
            z3 = false;
            if (1 == 0 && 0 == 0 && 0 == 0) {
                return true;
            }
        } else {
            List<InstallmentPlan> list2 = installmentInfo.installmentPlans;
            if (list2 != null && !list2.isEmpty()) {
                InstallmentInfo installmentInfo2 = paymentMethod.installmentInfo;
                if (installmentInfo2 == null || (list = installmentInfo2.installmentPlans) == null || list.isEmpty()) {
                    return true;
                }
                Iterator<InstallmentPlan> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().id;
                    if (str2 == null || !C123100dR.LIZ(str2)) {
                        z3 = true;
                        z2 = false;
                        z = false;
                    }
                }
                return true;
            }
            z = true;
            z2 = false;
            z3 = false;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("pipo bnpl installment info is not expected in scene: " + str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("installment_debug_info", z2 + ", " + z + ", " + z3);
        C1018703yb.LIZIZ("pipo_bnpl_debug", linkedHashMap);
        C1018703yb.LIZIZ("rd_pipo_bnpl_debug", linkedHashMap);
        return false;
    }

    public static void LJII(PaymentInfo paymentInfo, String str) {
        C7767031p c7767031p;
        Amount amount;
        String amount2;
        String amount3;
        String amount4;
        if (paymentInfo != null && paymentInfo.LJI()) {
            try {
                PaymentMethod paymentMethod = paymentInfo.LIZ;
                String amount5 = null;
                if (paymentMethod != null) {
                    c7767031p = paymentMethod.LJFF;
                } else {
                    c7767031p = null;
                }
                Amount amountLJII = C03S8.LJII(paymentMethod);
                if (amountLJII == null) {
                    if (c7767031p == null) {
                        amountLJII = null;
                    } else {
                        amountLJII = c7767031p.LIZJ;
                    }
                }
                HybridPaymentInfo hybridPaymentInfoLIZJ = C03S7.LIZJ(paymentInfo, paymentInfo.paymentMethod, paymentInfo.paymentMethodInfo);
                if (hybridPaymentInfoLIZJ == null || (amount = hybridPaymentInfoLIZJ.actualPaymentAmount) == null) {
                    if (c7767031p == null) {
                        amount = null;
                    } else {
                        amount = c7767031p.LIZLLL;
                    }
                }
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (amountLJII == null || (amount2 = amountLJII.getAmount()) == null) {
                    amount2 = CardStruct.IStatusCode.DEFAULT;
                }
                BigDecimal bigDecimal = new BigDecimal(amount2);
                if (amount == null || (amount3 = amount.getAmount()) == null) {
                    amount3 = CardStruct.IStatusCode.DEFAULT;
                }
                BigDecimal bigDecimalAdd = bigDecimal.add(new BigDecimal(amount3));
                if (str != null) {
                    str2 = str;
                }
                if (bigDecimalAdd.compareTo(new BigDecimal(str2)) != 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("credit amount: ");
                    if (amountLJII == null) {
                        amount4 = null;
                    } else {
                        amount4 = amountLJII.getAmount();
                    }
                    sbLIZ.append(amount4);
                    sbLIZ.append(", remained amount: ");
                    if (amount != null) {
                        amount5 = amount.getAmount();
                    }
                    sbLIZ.append(amount5);
                    sbLIZ.append(", total amount: ");
                    sbLIZ.append(str);
                    linkedHashMap.put("credit_amount_debug_info", C2188811AlT.LIZIZ(sbLIZ));
                    C1018703yb.LJI("rd_pipo_credit_debug", linkedHashMap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    public static List LJIIIZ(PaymentMethod paymentMethod, List list) {
        String string;
        String str;
        String str2;
        List list2 = list;
        if (paymentMethod != null && (str2 = paymentMethod.balance) != null && C123100dR.LIZ(str2)) {
            string = C7879035x.LIZ().getResources().getString(2131840200);
        } else {
            string = C7879035x.LIZ().getResources().getString(2131840232);
        }
        InstallmentPlan installmentPlan = new InstallmentPlan("client_dummy_balance", null, null, null, null, null, null, C7879035x.LIZ().getResources().getString(2131840233), string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        if (paymentMethod != null && (str = paymentMethod.balance) != null && str.length() != 0) {
            List listSingletonList = Collections.singletonList(installmentPlan);
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            return C13LP.LJLIL(list2, listSingletonList);
        }
        if (list2 == null) {
            return null;
        }
        return C13LP.LJLILLLLZI(installmentPlan, list2);
    }

    public static String LJIILLIIL(BillInfoData billInfoData, PaymentMethod paymentMethod) {
        PaymentMethodsData paymentMethodsData;
        String strLJIILJJIL = LJIILJJIL(billInfoData);
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        if (LJIJJLI(paymentMethod, paymentMethodsData) && strLJIILJJIL != null) {
            return strLJIILJJIL;
        }
        if (paymentMethod == null) {
            return null;
        }
        return paymentMethod.LJJIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C835203Oc LJIJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r8, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r9) {
        /*
            r7 = 0
            if (r8 == 0) goto L79
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LeadingElevatorBar r0 = r8.leadingElevatorBar
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.daInfo
        L9:
            java.util.HashMap r1 = X.C1741890vQh.LJIIJ(r0)
            if (r1 == 0) goto L77
            java.lang.String r0 = "bubble_type"
            java.lang.Object r6 = r1.get(r0)
        L15:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L75
            java.lang.String r6 = (java.lang.String) r6
        L1b:
            r5 = 1
            if (r6 == 0) goto L73
            int r0 = r6.length()
            if (r0 <= 0) goto L73
        L24:
            if (r8 == 0) goto L70
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r8.paymentMethods
            if (r0 == 0) goto L70
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElevatorBar> r0 = r0.elevatorBar
            if (r0 == 0) goto L70
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElevatorBar r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElevatorBar) r0
            if (r0 == 0) goto L71
            java.lang.String r4 = r0.pmId
        L38:
            java.lang.String r3 = ""
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.pmToken
            if (r1 != 0) goto L41
        L40:
            r1 = r3
        L41:
            if (r9 == 0) goto L6e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = r9.paymentMethod
            if (r2 == 0) goto L4e
            java.lang.String r7 = r2.id
            java.lang.String r0 = r2.token
            if (r0 == 0) goto L4e
            r3 = r0
        L4e:
            if (r4 == 0) goto L6c
            int r0 = r4.length()
            if (r0 == 0) goto L6c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r7)
            if (r0 == 0) goto L6c
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L6c
        L62:
            X.03Oc r1 = new X.03Oc
            java.lang.String r0 = LJIILLIIL(r8, r2)
            r1.<init>(r6, r5, r0)
            return r1
        L6c:
            r5 = 0
            goto L62
        L6e:
            r2 = r7
            goto L4e
        L70:
            r0 = r7
        L71:
            r4 = r7
            goto L38
        L73:
            r6 = r7
            goto L24
        L75:
            r6 = r7
            goto L1b
        L77:
            r6 = r7
            goto L15
        L79:
            r0 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJIJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):X.03Oc");
    }

    public static boolean LJIJJLI(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        ElevatorBar elevatorBar;
        String str;
        List<ElevatorBar> list;
        if (paymentMethod == null) {
            return false;
        }
        String str2 = null;
        if (paymentMethodsData != null && (list = paymentMethodsData.elevatorBar) != null) {
            elevatorBar = (ElevatorBar) C13LP.LJJJLL(list);
            if (elevatorBar != null) {
                str2 = elevatorBar.pmId;
            }
        } else {
            elevatorBar = null;
        }
        String str3 = "";
        if (elevatorBar == null || (str = elevatorBar.pmToken) == null) {
            str = "";
        }
        if (str2 == null || str2.length() == 0 || !Intrinsics.LJFF(str2, paymentMethod.id)) {
            return false;
        }
        String str4 = paymentMethod.token;
        if (str4 != null) {
            str3 = str4;
        }
        if (!Intrinsics.LJFF(str, str3)) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        String str;
        PaymentMethod paymentMethod;
        List<InstallmentInfo> list;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list2;
        String str2;
        String desc;
        String str3;
        PaymentPromotion paymentPromotion;
        String desc2;
        if (installmentPlan != null) {
            MarketingTool marketingTool = installmentPlan.marketingTool;
            if (marketingTool != null && (str3 = marketingTool.text) != null && str3.length() != 0 && (paymentPromotion = installmentPlan.promotionInfo) != null && (desc2 = paymentPromotion.getDesc()) != null && desc2.length() != 0) {
                return false;
            }
            return true;
        }
        if (paymentInfo != null) {
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                str = paymentMethodInfo.tenure;
            } else {
                str = null;
                if (paymentInfo != null) {
                }
            }
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (((paymentMethod2 != null && (installmentInfo = paymentMethod2.installmentInfo) != null) || ((paymentMethod = paymentInfo.paymentMethod) != null && (list = paymentMethod.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list)) != null)) && (list2 = installmentInfo.installmentPlans) != null) {
                for (InstallmentPlan installmentPlan2 : list2) {
                    InstallmentPlan installmentPlan3 = installmentPlan2;
                    if (Intrinsics.LJFF(installmentPlan3.tenure, str)) {
                        MarketingTool marketingTool2 = installmentPlan3.marketingTool;
                        if (marketingTool2 != null) {
                            str2 = marketingTool2.text;
                        } else {
                            str2 = null;
                        }
                        if (!C123100dR.LIZ(str2)) {
                            PaymentPromotion paymentPromotion2 = installmentPlan3.promotionInfo;
                            if (paymentPromotion2 != null) {
                                desc = paymentPromotion2.getDesc();
                            } else {
                                desc = null;
                            }
                            if (C123100dR.LIZ(desc)) {
                            }
                        }
                        if (installmentPlan2 != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.popupInfo != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r5) {
        /*
            java.util.List<java.lang.String> r0 = X.C864803Zm.LIZ
            r3 = 0
            if (r4 == 0) goto L58
            java.lang.String r1 = r4.id
        L7:
            java.lang.String r0 = "pm_pi_ew_pipocredit_c_d"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentEnableVnBalanceSettings$BalanceConfig r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentEnableVnBalanceSettings.LIZ()
            java.lang.Boolean r1 = r0.enableVnBalance
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5a
            if (r5 == 0) goto L5a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r0 = r5.creditInfo
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ExpireAmount r0 = r0.recentWillExpireBalanceAmount
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.amount
            if (r0 == 0) goto L5a
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 != r2) goto L5a
        L32:
            return r2
        L33:
            if (r4 == 0) goto L56
            java.lang.String r1 = r4.id
        L37:
            java.lang.String r0 = "pm_pi_ew_pipowallet_c_d"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5a
            if (r5 == 0) goto L4f
            if (r4 == 0) goto L45
            java.lang.String r3 = r4.id
        L45:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r0 = r5.LJIJJLI(r3)
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PopupInfo r0 = r0.popupInfo
            if (r0 != 0) goto L32
        L4f:
            if (r4 == 0) goto L5a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PopupInfo r0 = r4.popupInfo
            if (r0 == 0) goto L5a
            return r2
        L56:
            r1 = r3
            goto L37
        L58:
            r1 = r3
            goto L7
        L5a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):boolean");
    }

    public static boolean LJJIIZI(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        String str;
        String str2;
        CreditInfo creditInfo;
        Amount amount;
        String amount2;
        List<String> list = C864803Zm.LIZ;
        String str3 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "pm_pi_ew_pipocredit_c_d")) {
            if (paymentMethodsData != null && (creditInfo = paymentMethodsData.creditInfo) != null && (amount = creditInfo.timeLimitedBalanceAmount) != null && (amount2 = amount.getAmount()) != null && C123100dR.LIZ(amount2)) {
                return true;
            }
            return false;
        }
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "pm_pi_ew_pipowallet_c_d") && paymentMethodsData != null) {
            if (paymentMethod != null) {
                str3 = paymentMethod.id;
            }
            CreditInfo creditInfoLJIJJLI = paymentMethodsData.LJIJJLI(str3);
            if (creditInfoLJIJJLI != null && creditInfoLJIJJLI.popupInfo != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r6, java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    public static void LJFF(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData, String str) {
        PaymentMethodInfo paymentMethodInfo;
        String str2;
        PaymentMethod next;
        List<PaymentMethod> listLJIJI;
        PaymentMethod next2;
        PaymentMethod next3;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (str2 = paymentMethodInfo.id) != null && a0.LJJIIZI(str2, "_mb_", false)) {
            try {
                C259800zU c259800zU = new C259800zU();
                Object obj = null;
                if (paymentMethodsData != null && (listLJIJI = paymentMethodsData.LJIJI()) != null) {
                    Iterator<PaymentMethod> it2 = listLJIJI.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            PaymentMethod paymentMethod = next2;
                            if (Intrinsics.LJFF(paymentMethod.id, paymentInfo.paymentMethodInfo.id)) {
                                c259800zU.element = paymentMethod;
                                break;
                            }
                            List<PaymentMethod> list = paymentMethod.subPaymentMethods;
                            if (list != null) {
                                Iterator<PaymentMethod> it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next3 = it3.next();
                                        if (Intrinsics.LJFF(next3.id, paymentInfo.paymentMethodInfo.id)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                PaymentMethod paymentMethod2 = next3;
                                if (paymentMethod2 != 0) {
                                    c259800zU.element = paymentMethod2;
                                    break;
                                }
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod3 = next2;
                }
                C259800zU c259800zU2 = new C259800zU();
                if (paymentMethodsData != null) {
                    for (Object obj2 : (ArrayList) paymentMethodsData.LJI()) {
                        ?? r2 = (PaymentMethod) obj2;
                        if (Intrinsics.LJFF(r2.id, paymentInfo.paymentMethodInfo.id)) {
                            c259800zU2.element = r2;
                        } else {
                            List<PaymentMethod> list2 = r2.subPaymentMethods;
                            if (list2 != null) {
                                Iterator<PaymentMethod> it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next = it4.next();
                                        if (Intrinsics.LJFF(next.id, paymentInfo.paymentMethodInfo.id)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                PaymentMethod paymentMethod4 = next;
                                if (paymentMethod4 != 0) {
                                    c259800zU2.element = paymentMethod4;
                                }
                            }
                        }
                        obj = obj2;
                    }
                }
                C03SE c03se = C03PI.LJIJI;
                AwS118S1200000_1 awS118S1200000_1 = new AwS118S1200000_1(c259800zU, (C259800zU<PaymentMethod>) c259800zU2, (C259800zU<PaymentMethod>) str, (String) 2);
                c03se.getClass();
                LJJIFFI(awS118S1200000_1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static String LJIILL(InstallmentPlan installmentPlan, PaymentMethod paymentMethod, BillInfoData billInfoData) {
        PaymentMethodsData paymentMethodsData;
        String strLJIILJJIL = LJIILJJIL(billInfoData);
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        if (LJIJJLI(paymentMethod, paymentMethodsData) && strLJIILJJIL != null) {
            return strLJIILJJIL;
        }
        if (installmentPlan == null) {
            return null;
        }
        return installmentPlan.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIZILJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5) {
        /*
            java.lang.String r2 = LJIILJJIL(r3)
            r1 = 0
            if (r3 == 0) goto L1e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r3.paymentMethods
        L9:
            boolean r0 = LJIJJLI(r4, r0)
            if (r0 != 0) goto L19
            if (r3 == 0) goto L1c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r3.paymentMethods
        L13:
            boolean r0 = LJIJJLI(r5, r0)
            if (r0 == 0) goto L20
        L19:
            if (r2 == 0) goto L20
            return r2
        L1c:
            r0 = r1
            goto L13
        L1e:
            r0 = r1
            goto L9
        L20:
            if (r5 == 0) goto L27
            java.lang.String r2 = r5.LJJIJ()
            return r2
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJIIZILJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):java.lang.String");
    }

    public static Object LJIJ(PaymentListRequest paymentListRequest, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        PaymentApi.LIZ.getClass();
        C877403bo.LIZ(paymentListRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS137S0200000_1(c23260099m, function1, 7), new AfS170S0100000_1(c23260099m, 16));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static void LJJII(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, String str) {
        String str2;
        String str3;
        String str4 = null;
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "pm_pi_ins_pipobnpl_c_d")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("payment view installment action, element key: ");
            sbLIZ.append(paymentMethod.LJIIJ());
            sbLIZ.append(", installment plan: ");
            if (installmentPlan != null) {
                str3 = installmentPlan.tenure;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            sbLIZ.append(", ");
            if (installmentPlan != null) {
                str4 = installmentPlan.id;
            }
            sbLIZ.append(str4);
            linkedHashMap.put("installment_debug_info", C2188811AlT.LIZIZ(sbLIZ));
            C1018703yb.LIZIZ("pipo_bnpl_debug", linkedHashMap);
            C1018703yb.LIZIZ("rd_pipo_bnpl_debug", linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C03RY LJJIIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r8, java.lang.String r9) {
        /*
            X.03RY r4 = X.C03RY.SUCC
            if (r7 == 0) goto L7a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r7.paymentMethodInfo
            r1 = 0
            if (r0 == 0) goto L98
            java.lang.String r6 = r0.tenure
            java.lang.String r5 = r0.installmentPlanId
            java.lang.String r1 = r0.id
        Lf:
            java.lang.String r0 = "pm_pi_ins_pipobnpl_c_d"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7a
            boolean r2 = X.C123100dR.LIZ(r5)
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "pipo_bnpl_tts_precheck_tenure"
            r0 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            if (r0 == 0) goto L31
            if (r2 == 0) goto L33
            boolean r2 = X.C123100dR.LIZ(r6)
        L31:
            if (r2 != 0) goto L7a
        L33:
            X.03SE r1 = X.C03PI.LJIJI
            boolean r0 = r7.LJI()
            r1.getClass()
            boolean r0 = LIZLLL(r8, r9, r0)
            if (r0 != 0) goto L7b
            X.03RY r4 = X.C03RY.RAW_DATA_ERR
            java.lang.String r3 = "server error"
        L46:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "scene"
            r2.put(r0, r9)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = ", tenure: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", installment_id: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "installment_debug_info"
            r2.put(r0, r1)
            java.lang.String r0 = "pipo_bnpl_debug"
            X.C1018703yb.LIZIZ(r0, r2)
            java.lang.String r0 = "rd_pipo_bnpl_debug"
            X.C1018703yb.LIZIZ(r0, r2)
        L7a:
            return r4
        L7b:
            X.03RY r4 = X.C03RY.CLIENT_ERR
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pipo bnpl installment info is wrong due to client err: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            java.lang.String r3 = "client error"
            goto L46
        L98:
            r6 = r1
            r5 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJIIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, java.lang.String):X.03RY");
    }

    public static boolean LJJIJ(boolean z, PaymentMethod paymentMethod, PaymentInfo paymentInfo) {
        boolean z2;
        InstallmentInfo installmentInfoLJIILJJIL;
        List<InstallmentPlan> list;
        C03SY.LIZ.getClass();
        if (!C03SY.LJIJJLI(paymentMethod)) {
            return false;
        }
        if (paymentMethod != null && paymentMethod.LJJIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        PaymentMethodInfo paymentMethodInfo = null;
        if (z2) {
            if (paymentInfo != null) {
                paymentMethodInfo = paymentInfo.paymentMethodInfo;
            }
            return LJIJJ(paymentMethodInfo);
        }
        if (!z) {
            return false;
        }
        if (paymentMethod != null && (installmentInfoLJIILJJIL = paymentMethod.LJIILJJIL()) != null && (list = installmentInfoLJIILJJIL.installmentPlans) != null && !list.isEmpty()) {
            Iterator<InstallmentPlan> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().isDefault, Boolean.TRUE)) {
                    return false;
                }
            }
        }
        if (paymentInfo != null) {
            paymentMethodInfo = paymentInfo.paymentMethodInfo;
        }
        return LJIJJ(paymentMethodInfo);
    }

    public static boolean LJJIIJZLJL(PaymentMethod paymentMethod, boolean z, boolean z2, PaymentInfo paymentInfo) {
        InstallmentInfo installmentInfoLJIILJJIL;
        List<InstallmentPlan> list;
        if (paymentMethod == null) {
            return false;
        }
        if (z) {
            return true;
        }
        C03SY c03sy = C03SY.LIZ;
        String str = paymentMethod.id;
        c03sy.getClass();
        if ((C03SY.LJIJ(str) && !paymentMethod.LJJJJJ()) || (installmentInfoLJIILJJIL = paymentMethod.LJIILJJIL()) == null || (list = installmentInfoLJIILJJIL.installmentPlans) == null || list.isEmpty()) {
            return false;
        }
        if (LJJIJ(z2, paymentMethod, paymentInfo) && !paymentMethod.LJJIFFI) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x017c, code lost:
    
        if (X.C756302xN.LIZ(r0) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (X.C756302xN.LIZ(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x056f, code lost:
    
        if (X.C756302xN.LIZ(r0) == false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x05c2, code lost:
    
        if (X.C756302xN.LIZ(r0) != false) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x05c4, code lost:
    
        if (r10 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x05c6, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x05c8, code lost:
    
        if (r0 == null) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x05ca, code lost:
    
        r0 = r0.installmentInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x05cc, code lost:
    
        if (r0 != null) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x05ce, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x05d0, code lost:
    
        if (r0 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x05d2, code lost:
    
        r0 = r0.installmentInfoList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x05d4, code lost:
    
        if (r0 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x05d6, code lost:
    
        r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) X.C13LP.LJJJLL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x05dc, code lost:
    
        if (r0 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x05de, code lost:
    
        r8 = r0.installmentPlans;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x05e6, code lost:
    
        if (X.C03Q4.LJIIIZ(r11) == false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x05ec, code lost:
    
        if (X.C756302xN.LIZ(r8) == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x05ee, code lost:
    
        if (r10 == null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x05f0, code lost:
    
        r0 = r10.paymentMethodInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x05f2, code lost:
    
        if (r0 == null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x05f4, code lost:
    
        r9 = r0.tenure;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x05f6, code lost:
    
        if (r8 == null) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x05f8, code lost:
    
        r1 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0600, code lost:
    
        if (r1.hasNext() == false) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0602, code lost:
    
        r8 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x060f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r8.tenure, r9) == false) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0611, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0613, code lost:
    
        if (r8 == null) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0619, code lost:
    
        if (X.C123100dR.LIZ(r9) == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x061b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x061c, code lost:
    
        r2 = X.C03OI.LIZ;
        r1 = X.C2188811AlT.LIZ();
        r1.append("tenure: ");
        r1.append(r9);
        r1.append(", ospScene: ");
        r1.append(r13);
        r1.append(", isSelectLegalTenure: ");
        r1.append(r6);
        r1.append(", price_version_id: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x063d, code lost:
    
        if (r8 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x063f, code lost:
    
        r0 = r8.paymentPriceVersionId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0641, code lost:
    
        r1.append(r0);
        r0 = X.C2188811AlT.LIZIZ(r1);
        r2.getClass();
        X.C03OI.LJFF("osp_whetherNeedCheckPaymentSummary_new_flow", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x064e, code lost:
    
        if (r8 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0650, code lost:
    
        r2 = r8.paymentPriceVersionId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0652, code lost:
    
        if (r2 != null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0654, code lost:
    
        if (r10 == null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0656, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0658, code lost:
    
        if (r0 == null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x065a, code lost:
    
        r2 = r0.paymentPriceVersionId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x065c, code lost:
    
        r1 = X.C03OI.LIZ;
        r0 = X.C2188811AlT.LIZ();
        r0.append("price_id: ");
        r0.append(r2);
        r0 = X.C2188811AlT.LIZIZ(r0);
        r1.getClass();
        X.C03OI.LJFF("osp_whetherNeedCheckPaymentSummary_new_flow", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0672, code lost:
    
        if (r2 == null) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0678, code lost:
    
        if (r2.length() == 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x067a, code lost:
    
        if (r6 == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x067c, code lost:
    
        r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig.LIZJ().enableTenurePriceText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0682, code lost:
    
        if (r0 == null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0688, code lost:
    
        if (r0.booleanValue() == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x068a, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2);
        r1.append(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig.LIZLLL());
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0698, code lost:
    
        if (r10 == null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x069a, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x069c, code lost:
    
        if (r0 == null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x069e, code lost:
    
        r0 = r0.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x06a0, code lost:
    
        r1.append(r0);
        r1.append(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig.LIZLLL());
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06aa, code lost:
    
        if (r10 == null) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06ac, code lost:
    
        r0 = r10.paymentMethodInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x06ae, code lost:
    
        if (r0 == null) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x06b0, code lost:
    
        r0 = r0.tenure;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x06b2, code lost:
    
        r1.append(r0);
        r1 = X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x06c0, code lost:
    
        return new X.C443120HZe(java.lang.Boolean.TRUE, r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x06c1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x06c3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x06c5, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2);
        r1.append(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig.LIZLLL());
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x06d3, code lost:
    
        if (r10 == null) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x06d5, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x06d7, code lost:
    
        if (r0 == null) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x06d9, code lost:
    
        r0 = r0.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x06db, code lost:
    
        r1.append(r0);
        r1 = X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x06e3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x06e5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x06e8, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x06eb, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x06ec, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x06ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x06f6, code lost:
    
        if (X.C756302xN.LIZ(r8) == false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x06f8, code lost:
    
        if (r10 == null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x06fa, code lost:
    
        r0 = r10.paymentMethodInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x06fc, code lost:
    
        if (r0 == null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x06fe, code lost:
    
        r6 = r0.tenure;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0700, code lost:
    
        r2 = X.C03OI.LIZ;
        r0 = X.C2188811AlT.LIZ();
        r0.append("tenure: ");
        r0.append(r6);
        r1 = X.C2188811AlT.LIZIZ(r0);
        r2.getClass();
        X.C03OI.LJFF("osp_whetherNeedCheckPaymentSummary", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0718, code lost:
    
        if (r8 == null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x071a, code lost:
    
        r2 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0722, code lost:
    
        if (r2.hasNext() == false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0724, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0731, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1.tenure, r6) == false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0733, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0735, code lost:
    
        if (r1 == null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0737, code lost:
    
        r2 = r1.paymentUnitId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0739, code lost:
    
        if (r2 != null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x073b, code lost:
    
        if (r10 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x073d, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x073f, code lost:
    
        if (r0 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0741, code lost:
    
        r2 = r0.paymentUnitId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0744, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0746, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0748, code lost:
    
        if (r10 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x074a, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x074c, code lost:
    
        if (r0 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x074e, code lost:
    
        r2 = r0.paymentUnitId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0751, code lost:
    
        if (r10 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0753, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0755, code lost:
    
        if (r0 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0757, code lost:
    
        r2 = r0.paymentPriceVersionId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0759, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x075c, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x075d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0760, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0805, code lost:
    
        r1 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0809, code lost:
    
        if (r10 == null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x080b, code lost:
    
        r0 = r10.paymentMethod;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x080d, code lost:
    
        if (r0 == null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x080f, code lost:
    
        r0 = r0.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0814, code lost:
    
        return new X.C443120HZe(r1, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0815, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LJJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r10, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean, boolean):X.0HZe");
    }

    public static void LJJ(PaymentMethodsData paymentMethodsData, PaymentMethod paymentMethod, InstallmentPlan installmentPlan, PaymentMethod paymentMethod2, String str) {
        Boolean boolValueOf;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5 = null;
        if (paymentMethodsData != null) {
            ArrayList arrayList = (ArrayList) paymentMethodsData.LJI();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((PaymentMethod) it2.next()).id, "pm_pi_ins_pipobnpl_c_d")) {
                        z = true;
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generate payment info pm: ");
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", installment plan: ");
        if (installmentPlan != null) {
            str3 = installmentPlan.tenure;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", ");
        if (installmentPlan != null) {
            str4 = installmentPlan.id;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append(", sub pm: ");
        if (paymentMethod2 != null) {
            str5 = paymentMethod2.id;
        }
        sbLIZ.append(str5);
        linkedHashMap.put("installment_debug_info", C2188811AlT.LIZIZ(sbLIZ));
        C1018703yb.LIZIZ("pipo_bnpl_debug", linkedHashMap);
        C1018703yb.LIZIZ("rd_pipo_bnpl_debug", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5, boolean r6, com.bytedance.tux.input.TuxTextView r7, android.view.View r8, java.lang.Boolean r9, kotlin.jvm.functions.Function2 r10) {
        /*
            if (r5 == 0) goto L85
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r4 = r5.LJIILJJIL()
            if (r4 == 0) goto L85
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r0 = r4.interestFeePromotion
            r2 = 0
            if (r0 == 0) goto L94
            java.lang.String r0 = r0.desc
        Lf:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L85
            r0 = 0
            X.C12ES.LJIILL(r0, r8)
            X.C12ES.LJIILL(r0, r7)
            if (r6 == 0) goto L8a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r0 = r4.interestFeePromotion
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.selectedDesc
            if (r0 == 0) goto L8a
            boolean r1 = X.C123100dR.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L8a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r0 = r4.interestFeePromotion
            java.lang.String r0 = r0.selectedDesc
        L31:
            if (r0 == 0) goto L91
        L33:
            r7.setText(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r0 = r4.interestFeePromotion
            if (r0 == 0) goto L88
            java.lang.String r3 = r0.link
        L3c:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 != 0) goto L43
            r3 = r2
        L43:
            r1 = 3
            if (r3 == 0) goto L97
            int r0 = X.C679280Qkg.LIZ(r1)
            r7.setCompoundDrawablePadding(r0)
            if (r6 == 0) goto L86
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 != 0) goto L86
            X.03SE r0 = X.C03PI.LJIJI
            r0.getClass()
            X.0GdJ r1 = LJJIJIL()
            android.content.Context r0 = r7.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r3 = r1.LIZ(r0)
        L68:
            X.03SE r0 = X.C03PI.LJIJI
            r0.getClass()
            X.0GdJ r1 = LJJIJIIJIL()
            android.content.Context r0 = r7.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r1.LIZ(r0)
            r7.setCompoundDrawablesWithIntrinsicBounds(r3, r2, r0, r2)
            Y.ACListenerS69S0300000_1 r1 = new Y.ACListenerS69S0300000_1
            r0 = 1
            r1.<init>(r10, r5, r4, r0)
            X.C786410Ut5.T7(r7, r1)
        L85:
            return
        L86:
            r3 = r2
            goto L68
        L88:
            r3 = r2
            goto L3c
        L8a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r0 = r4.interestFeePromotion
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.desc
            goto L31
        L91:
            java.lang.String r0 = ""
            goto L33
        L94:
            r0 = r2
            goto Lf
        L97:
            X.03SE r0 = X.C03PI.LJIJI
            X.C786410Ut5.T7(r7, r2)
            if (r6 == 0) goto Lc2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 != 0) goto Lc2
            int r0 = X.C679280Qkg.LIZ(r1)
            r7.setCompoundDrawablePadding(r0)
            X.03SE r0 = X.C03PI.LJIJI
            r0.getClass()
            X.0GdJ r1 = LJJIJIL()
            android.content.Context r0 = r7.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r1.LIZ(r0)
            r7.setCompoundDrawables(r0, r2, r2, r2)
            return
        Lc2:
            r7.setCompoundDrawables(r2, r2, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean, com.bytedance.tux.input.TuxTextView, android.view.View, java.lang.Boolean, kotlin.jvm.functions.Function2):void");
    }

    public static void LJJIJL(C03SE c03se, String str, Context context, TuxTextView tuxTextView, boolean z, PaymentMethod paymentMethod, Function1 function1) {
        String promotionLink;
        TuxIconDrawable tuxIconDrawableLIZ;
        TuxIconDrawable tuxIconDrawableLIZ2;
        PaymentPromotion paymentPromotionLJIIL;
        c03se.getClass();
        tuxTextView.setText(str);
        tuxTextView.setMaxLines(1);
        tuxTextView.setBackgroundResource(R.drawable.b2t);
        tuxTextView.setPadding(C679280Qkg.LIZ(4), C679280Qkg.LIZ(1), C679280Qkg.LIZ(4), C679280Qkg.LIZ(1));
        Integer numValueOf = Integer.valueOf(R.attr.ga);
        tuxTextView.setTextColorRes(R.attr.ga);
        if (paymentMethod != null && (paymentPromotionLJIIL = paymentMethod.LJIIL()) != null) {
            promotionLink = paymentPromotionLJIIL.getPromotionLink();
        } else {
            promotionLink = null;
        }
        boolean zLIZ = C123100dR.LIZ(promotionLink);
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
            c419910GdJ.LJ = numValueOf;
            c419910GdJ.LIZIZ = C679280Qkg.LIZ(11);
            c419910GdJ.LIZJ = C679280Qkg.LIZ(11);
            tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        } else {
            tuxIconDrawableLIZ = null;
        }
        if (zLIZ) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_chevron_right_slim_ltr;
            c419910GdJ2.LJ = numValueOf;
            c419910GdJ2.LIZIZ = C679280Qkg.LIZ(6);
            c419910GdJ2.LIZJ = C679280Qkg.LIZ(11);
            tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
        } else {
            tuxIconDrawableLIZ2 = null;
        }
        tuxTextView.setCompoundDrawablePadding(C679280Qkg.LIZ(3));
        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, tuxIconDrawableLIZ2, (Drawable) null);
        tuxTextView.setClickable(zLIZ);
        if (zLIZ) {
            C786410Ut5.h9(tuxTextView, new ACListenerS105S0200000_1(function1, paymentMethod, 2));
        } else {
            C786410Ut5.h9(tuxTextView, null);
        }
    }

    public static void LJJIJLIJ(String str, Context context, TuxTextView tuxTextView, boolean z, int i, PaymentMethod paymentMethod, Function1 function1) {
        boolean z2;
        Boolean boolValueOf;
        String strLJIL;
        TuxIconDrawable tuxIconDrawableLIZ;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        List<InstallmentInfo> list2;
        List<PaymentMethod> list3;
        tuxTextView.setText(str);
        tuxTextView.setMaxLines(i);
        C419910GdJ c419910GdJLJJIJIIJIL = LJJIJIIJIL();
        boolean z3 = false;
        if (paymentMethod != null && (list3 = paymentMethod.subPaymentMethods) != null && (!list3.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (paymentMethod != null && (((installmentInfo = paymentMethod.installmentInfo) != null || ((list2 = paymentMethod.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) != null)) && (list = installmentInfo.installmentPlans) != null)) {
            boolValueOf = Boolean.valueOf(C756302xN.LIZ(list));
        } else {
            boolValueOf = null;
        }
        if (paymentMethod != null) {
            if (paymentMethod.LJJJJLL()) {
                tuxTextView.setBackgroundResource(R.drawable.b2s);
                tuxTextView.setTextColorRes(R.attr.a1j);
                c419910GdJLJJIJIIJIL.LJ = Integer.valueOf(R.attr.a1j);
            } else {
                tuxTextView.setBackgroundResource(R.drawable.b2w);
                tuxTextView.setTextColorRes(R.attr.gp);
            }
            if (paymentMethod.LJJJJLL()) {
                z3 = true;
            }
            strLJIL = paymentMethod.LJIL();
        } else {
            strLJIL = null;
        }
        if (C123100dR.LIZ(strLJIL)) {
            tuxTextView.setCompoundDrawablePadding(C679280Qkg.LIZ(3));
            if ((C03Q4.LJJ(C03Q4.LIZ, paymentMethod) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) || !z || z2 || z3) {
                tuxIconDrawableLIZ = null;
            } else {
                tuxIconDrawableLIZ = LJJIJIL().LIZ(context);
            }
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, c419910GdJLJJIJIIJIL.LIZ(context), (Drawable) null);
            C786410Ut5.h9(tuxTextView, new ACListenerS105S0200000_1(function1, paymentMethod, 5));
            return;
        }
        C786410Ut5.h9(tuxTextView, null);
        if (!z || z2 || z3 || (C03Q4.LJJ(C03Q4.LIZ, paymentMethod) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE))) {
            tuxTextView.setCompoundDrawables(null, null, null, null);
        } else {
            tuxTextView.setCompoundDrawablePadding(C679280Qkg.LIZ(3));
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(LJJIJIL().LIZ(context), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[PHI: r6
      0x00ce: PHI (r6v2 boolean) = (r6v1 boolean), (r6v4 boolean), (r6v4 boolean) binds: [B:19:0x003c, B:33:0x0078, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJI(X.C03SE r5, java.lang.String r6, android.content.Context r7, com.bytedance.tux.input.TuxTextView r8, boolean r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r10, kotlin.jvm.functions.Function1 r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJJI(X.03SE, java.lang.String, android.content.Context, com.bytedance.tux.input.TuxTextView, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f A[EDGE_INSN: B:54:0x008f->B:55:0x0092 BREAK  A[LOOP:0: B:41:0x0061->B:73:0x00d5]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJ(X.C03SE r8, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r9, int r10, com.bytedance.tux.input.TuxTextView r11, com.bytedance.tux.input.TuxTextView r12, android.view.View r13, com.bytedance.tux.input.TuxTextView r14, androidx.cardview.widget.CardView r15, com.bytedance.tux.input.TuxTextView r16, android.view.ViewGroup r17, android.view.ViewGroup r18, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r19, java.lang.Boolean r20, java.lang.Boolean r21, java.lang.Boolean r22, int r23) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SE.LJJJ(X.03SE, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, android.view.View, com.bytedance.tux.input.TuxTextView, androidx.cardview.widget.CardView, com.bytedance.tux.input.TuxTextView, android.view.ViewGroup, android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
