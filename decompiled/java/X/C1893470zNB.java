package X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleConfig;
import com.ss.android.ugc.incentive.crossplatform.experiment.PageCreateOptConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893470zNB extends AbstractC1538690q8x {
    public static final C1893470zNB LIZIZ = new C1893470zNB();

    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "pa_incentive";
    }

    static {
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0zN3
            @Override // X.InterfaceC1893530zNH
            public final void LIZ(SparkContext sparkContext) {
                String strLJIILLIIL;
                String strLJIILJJIL;
                Uri uri = UriProtector.parse(C1893600zNO.LJI(sparkContext.LJJIL()));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    return;
                }
                C1893580zNM c1893580zNM = C1893580zNM.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                HashMap map = new HashMap();
                String str = "";
                if (abstractC1896090zRP == null || (strLJIILLIIL = abstractC1896090zRP.LJIILLIIL()) == null) {
                    strLJIILLIIL = "";
                }
                map.put("device_id", strLJIILLIIL);
                if (abstractC1896090zRP != null && (strLJIILJJIL = abstractC1896090zRP.LJIILJJIL()) != null) {
                    str = strLJIILJJIL;
                }
                map.put("carrier_region", str);
                C1893790zNh.LIZ.getClass();
                map.put("inc_is_first_launch", String.valueOf(C1893790zNh.LJFF));
                map.put("launch_count", String.valueOf(c1893580zNM.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)));
                map.putAll(C1868970yjf.LIZ().dynamicUrlParams);
                String strLIZ = C1893580zNM.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, map);
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                C13DA c13da = new C13DA();
                if (C1893350zMz.LIZ(sparkContext) && ((IncentiveJsLogicModuleConfig) C1893960zNy.LIZIZ.getValue()).predecodeEnable) {
                    c13da.put("enable_pre_decode", "1");
                    c13da.put("spark_perf_biz", C1868970yjf.LIZ().biz);
                }
                boolean z = !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJIJI()), "incentive_no_saf"), "1");
                C1878650yzH.LIZ.getClass();
                if (C1878650yzH.LIZ() && z) {
                    c13da.put("enable_saf", "1");
                    c13da.put("saf_opt_anim", "1");
                }
                Map mapBuild = c13da.build();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    if (!mapBuild.containsKey(str2)) {
                        if (str2 != null) {
                            int iHashCode = str2.hashCode();
                            if (iHashCode != -1883856682) {
                                if (iHashCode != 116079) {
                                    if (iHashCode == 3542044 && str2.equals("surl")) {
                                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                                        while (it2.hasNext()) {
                                            builderClearQuery.appendQueryParameter(str2, it2.next());
                                        }
                                    }
                                } else if (str2.equals("url")) {
                                    builderClearQuery.appendQueryParameter("url", strLIZ);
                                }
                            } else if (str2.equals("origin_url")) {
                                for (String str3 : UriProtector.getQueryParameters(uri, str2)) {
                                    if (Intrinsics.LJFF(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                        str3 = strLIZ;
                                    }
                                    builderClearQuery.appendQueryParameter(str2, str3);
                                }
                            }
                        }
                        Iterator<String> it3 = UriProtector.getQueryParameters(uri, str2).iterator();
                        while (it3.hasNext()) {
                            builderClearQuery.appendQueryParameter(str2, it3.next());
                        }
                    }
                }
                for (Map.Entry entry : mapBuild.entrySet()) {
                    builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                sparkContext.LJJLIIJ(builderClearQuery.build().toString());
                C1893580zNM.LIZ.getClass();
                C01U6.LIZIZ(new AwS88S1000000_3(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 23));
            }
        });
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0zNA
            @Override // X.InterfaceC1893530zNH
            public final void LIZ(SparkContext sparkContext) throws JSONException {
                JSONObject jSONObject;
                boolean z;
                String str;
                String strLJIILLIIL;
                String strLJIILJJIL;
                Uri uri = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJJIL()), "url"));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContext.LJJIL()), "touch_point_event_params");
                String str2 = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                try {
                    jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_prefetch");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("region", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "region"));
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                if (abstractC1896090zRP != null && abstractC1896090zRP.LJJIJIL()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.put("is_login", str);
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                }
                String strJ3 = C786410Ut5.J3(jSONObject2);
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP2 == null || (strLJIILLIIL = abstractC1896090zRP2.LJIILLIIL()) == null) {
                    strLJIILLIIL = "";
                }
                sparkContext.LJJJZ("device_id", strLJIILLIIL);
                AbstractC1896090zRP abstractC1896090zRP3 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP3 == null || (strLJIILJJIL = abstractC1896090zRP3.LJIILJJIL()) == null) {
                    strLJIILJJIL = "";
                }
                sparkContext.LJJJZ("carrier_region", strLJIILJJIL);
                sparkContext.LJJJZ("_enable_stay_time_report", "1");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    sparkContext.LJJJZ("_enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    sparkContext.LJJJZ("enable_prefetch", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                sparkContext.LJJJZ("_extra_query", strJ3);
                String path = uri.getPath();
                if (path != null) {
                    str2 = path;
                }
                sparkContext.LJJJZ("_project_name", str2);
                HashMap<String, String> map = C1868970yjf.LIZ().dynamicSchemaParams;
                if (!map.isEmpty()) {
                    String strLJJIL = sparkContext.LJJIL();
                    C1893580zNM.LIZ.getClass();
                    sparkContext.LJJLIIJ(C1893580zNM.LIZ(strLJJIL, map));
                }
            }
        });
        C1893510zNF.LIZ(new C1893280zMs());
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0zNE
            /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
            @Override // X.InterfaceC1893530zNH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.hybrid.spark.SparkContext r3) {
                /*
                    r2 = this;
                    X.0zNg r0 = X.C1893780zNg.LIZIZ
                    if (r0 == 0) goto L15
                    boolean r1 = r0.LJIIIZ()
                    r0 = 1
                    if (r1 != r0) goto L15
                Lb:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.String r0 = "watch_video_task_closed_by_user"
                    r3.LJJLIIIJ(r1, r0)
                    return
                L15:
                    r0 = 0
                    goto Lb
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1893500zNE.LIZ(com.bytedance.hybrid.spark.SparkContext):void");
            }
        });
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0zDu
            @Override // X.InterfaceC1893530zNH
            public final void LIZ(SparkContext sparkContext) {
                Context contextLJIIJJI;
                String string;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                if (abstractC1896090zRP != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null) {
                    Object objLJIIIZ = C1323690kYB.LIZ(contextLJIIJJI).LJIIIZ("", "appsflyer_deep_link");
                    if (objLJIIIZ != null && (string = objLJIIIZ.toString()) != null && string.length() != 0) {
                        sparkContext.LJJLIIIJ(string, "appsflyer_deep_link");
                    } else {
                        sparkContext.LJJLIIIJ("", "appsflyer_deep_link");
                    }
                }
            }
        });
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0zN0
            public static boolean LLILLJJLI = true;

            @Override // X.InterfaceC1893530zNH
            public final void LIZ(SparkContext sparkContext) {
                String strLJJII;
                long jLJJ;
                String str;
                JSONObject jSONObjectLJ;
                JSONObject jSONObjectLJIIIIZZ;
                sparkContext.LJJLIIIJ("1", "_pa_inc_hit_incentive_spark_plugin");
                if (C1868970yjf.LIZ().enableBaseInfoJsbOpt) {
                    C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                    C1893370zN1 c1893370zN1 = (C1893370zN1) c1619720sFe.LIZ(1003);
                    if (c1893370zN1 != null && (jSONObjectLJIIIIZZ = c1893370zN1.LJIIIIZZ()) != null) {
                        sparkContext.LJJLIIIJ(C786410Ut5.J3(jSONObjectLJIIIIZZ), "_pa_inc_user_info");
                    }
                    C1893370zN1 c1893370zN12 = (C1893370zN1) c1619720sFe.LIZ(1003);
                    if (c1893370zN12 != null && (jSONObjectLJ = c1893370zN12.LJ()) != null) {
                        sparkContext.LJJLIIIJ(C786410Ut5.J3(jSONObjectLJ), "_pa_inc_app_info");
                    }
                }
                C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
                c1619720sFe2.LIZ(1003);
                if (((Boolean) AnonymousClass0510.LIZJ.getValue()).booleanValue()) {
                    sparkContext.LJJLIIIJ(((k) AnonymousClass0510.LIZIZ.getValue()).toString(), "_pa_inc_ab_params");
                }
                if (C1868970yjf.LIZ().feWebViewGoneDisableAutoReload) {
                    sparkContext.LJJJJZ(new C1554490qYR(2));
                }
                if (!sparkContext.usePreload) {
                    if (LLILLJJLI) {
                        str = "cold";
                    } else {
                        str = "hot";
                    }
                    LLILLJJLI = false;
                    sparkContext.LJJLIIIJ(str, "_pa_inc_launch_type");
                }
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                if (abstractC1896090zRP == null || (strLJJII = abstractC1896090zRP.LJJII()) == null) {
                    strLJJII = "";
                }
                sparkContext.LJJLIIIJ(strLJJII, "userID");
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                if (abstractC1896090zRP2 != null) {
                    jLJJ = abstractC1896090zRP2.LJJ();
                } else {
                    jLJJ = -1;
                }
                sparkContext.LJJLIIIJ(Long.valueOf(jLJJ), "serverTime");
                sparkContext.LJJJZ("auto_continue_load", "1");
                c1619720sFe2.LIZ(1003);
            }
        });
        C1893510zNF.LIZ(C1893340zMy.LL);
        C1893510zNF.LIZ(new InterfaceC1893530zNH() { // from class: X.0yzF
            @Override // X.InterfaceC1893530zNH
            public final void LIZ(SparkContext sparkContext) {
                PageCreateOptConfig pageCreateOptConfig = (PageCreateOptConfig) C1867750yhh.LIZIZ.getValue();
                if (!pageCreateOptConfig.enable) {
                    return;
                }
                C01U6.LIZIZ(new AwS429S0200000_28(sparkContext, pageCreateOptConfig, 154));
            }
        });
    }

    public static boolean LJII(String str) {
        for (Object obj : (List) C01CI.LIZIZ.getValue()) {
            if (a0.LJJIIZI(str, (String) obj, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(String str) {
        InterfaceC1910807e6 interfaceC1910807e6LIZ;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ2 = C1910707e5.LIZ();
        if (((interfaceC1910807e6LIZ2 == null || !interfaceC1910807e6LIZ2.isDebug()) && ((interfaceC1910807e6LIZ = C1910707e5.LIZ()) == null || !interfaceC1910807e6LIZ.isLocalTest())) || str == null || (uri = UriProtector.parse(str)) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "incentive_debug_tag")) == null || CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) != 1) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(SparkContext sparkContext) {
        String string;
        try {
            String strLJJIL = sparkContext.LJJIL();
            Uri uri = UriProtector.parse(strLJJIL);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "touch_point_id");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "origin_url");
            String str = "";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "launch_plan_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "touch_point_event_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4.length() == 0 && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "8")) {
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    Integer numLIZIZ = C2178808gE.LIZ().LIZIZ(8);
                    if (numLIZIZ == null || (string = numLIZIZ.toString()) == null) {
                        string = "";
                    }
                    if (!Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                        str = string;
                    }
                } else {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                C1894320zOY.LIZ.getClass();
                C1894320zOY.LJIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strLJJIL, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
            } else {
                C1894320zOY.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                linkedHashMap.put("router_url", strLJJIL);
                linkedHashMap.put("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("jump_incentive_page", linkedHashMap);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mob jump: touchPointId:");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ.append(", url:");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            sbLIZ.append(", finalUrl:");
            sbLIZ.append(strLJJIL);
            sbLIZ.append(", enterFrom:");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("IncentiveSparkPlugin", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LJIIJ(String str) {
        return ((Boolean) C01U6.LJ(new AwS112S1000000_28(str, 18), Boolean.FALSE)).booleanValue();
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        super.LJ(sparkContext, str);
        C01U6.LIZIZ(new AwS572S0100000_28(sparkContext, 897));
    }
}
