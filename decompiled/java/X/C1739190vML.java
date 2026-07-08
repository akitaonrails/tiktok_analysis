package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkReportConfig;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739190vML extends AbstractC1547260qMm {
    public static final C1739190vML LL = new C1739190vML();
    public static String LLILLJJLI;

    public static void LIZ(String str) {
        Object obj;
        String str2;
        String str3;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        String str4;
        if (LLILLJJLI != null) {
            try {
                Map<String, EcomSparkReportConfig.EcomSparkReportConfigModel> map = EcomSparkReportConfig.LIZJ;
                EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((LinkedHashMap) map).get(LLILLJJLI);
                if (ecomSparkReportConfigModel != null) {
                    str2 = ecomSparkReportConfigModel.pageName;
                } else {
                    str2 = null;
                }
                EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel2 = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((LinkedHashMap) map).get(LLILLJJLI);
                if (ecomSparkReportConfigModel2 != null) {
                    str3 = ecomSparkReportConfigModel2.subPageName;
                } else {
                    str3 = null;
                }
                Uri uri = UriProtector.parse(str);
                try {
                    c098200Yq = C1741890vQh.LIZJ(uri, "trackParams");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                HashMap map2 = (HashMap) c098200Yq;
                try {
                    c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page");
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                Object obj2 = (String) c098200Yq2;
                if (obj2 == null) {
                    if (map2 != null) {
                        obj2 = map2.get("previous_page");
                    } else {
                        obj2 = null;
                    }
                }
                try {
                    c098200Yq3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance_form");
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = null;
                }
                Object obj3 = (String) c098200Yq3;
                if (obj3 == null) {
                    if (map2 != null) {
                        obj3 = map2.get("entrance_form");
                    } else {
                        obj3 = null;
                    }
                }
                try {
                    c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_info");
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq4 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                    c098200Yq4 = null;
                }
                Object obj4 = (String) c098200Yq4;
                if (obj4 == null) {
                    if (map2 == null) {
                        obj4 = null;
                    } else {
                        obj4 = map2.get("enter_from_info");
                    }
                }
                HashMap<String, Object> map3 = new HashMap<>();
                if (obj2 != null) {
                    map3.put("previous_page", obj2);
                }
                if (obj3 != null) {
                    map3.put("entrance_form", obj3);
                }
                if (obj4 != null) {
                    map3.put("enter_from_info", obj4);
                }
                String strLIZ = C2011207uI.LIZ(uri, "is_self");
                if (strLIZ != null) {
                    map3.put("is_self", strLIZ);
                }
                if (str2 == null) {
                    str4 = null;
                } else {
                    ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ(str2, map3, null, str3, null);
                    str4 = str2;
                }
                C189200o6.m2constructorimpl(str4);
                obj = str4;
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                C098200Yq c098200Yq5 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq5);
                obj = c098200Yq5;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR6, thM5exceptionOrNullimpl, null);
            }
        }
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        String strLIZJ = C1947207jy.LIZJ(str);
        Iterator it2 = ((LinkedHashMap) EcomSparkReportConfig.LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            EcomSparkReportConfig.EcomSparkReportConfigModel ecomSparkReportConfigModel = (EcomSparkReportConfig.EcomSparkReportConfigModel) ((Map.Entry) it2.next()).getValue();
            if (a0.LJJIIZI(strLIZJ, ecomSparkReportConfigModel.channel, false)) {
                if (C770702zh.LIZIZ(ecomSparkReportConfigModel.subParam) && C770702zh.LIZIZ(ecomSparkReportConfigModel.subValue)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), ecomSparkReportConfigModel.subParam);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    if (a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, ecomSparkReportConfigModel.subValue, false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(ecomSparkReportConfigModel.channel);
                        sbLIZ.append('_');
                        sbLIZ.append(ecomSparkReportConfigModel.subParam);
                        sbLIZ.append('_');
                        sbLIZ.append(ecomSparkReportConfigModel.subValue);
                        LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
                        return true;
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(ecomSparkReportConfigModel.channel);
                    sbLIZ2.append('_');
                    sbLIZ2.append(ecomSparkReportConfigModel.subParam);
                    sbLIZ2.append('_');
                    sbLIZ2.append(ecomSparkReportConfigModel.subValue);
                    LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        if (sparkContext.usePreload) {
            return;
        }
        LIZ(str);
    }
}
