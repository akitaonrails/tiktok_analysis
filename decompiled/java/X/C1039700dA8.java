package X;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.experiment.OptIABLoadFailExp;
import com.ss.android.ugc.aweme.web.experiment.ShouldDropLoadFinishInTypeExt;
import com.ss.android.ugc.aweme.web.experiment.WebViewXRequestedWithExperiment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039700dA8 {
    public static final C1039700dA8 LIZ = new C1039700dA8();
    public static boolean LIZIZ;

    public static final boolean LJII(C1035880d3y c1035880d3y) {
        if (c1035880d3y != null && c1035880d3y.getHasPageStart() != 1 && c1035880d3y.getRedirectType() == -1) {
            c1035880d3y.setRedirectType(0);
        }
        C01GW c01gw = ShouldDropLoadFinishInTypeExt.LIZIZ;
        if (((ShouldDropLoadFinishInTypeExt.DropTypeModel) c01gw.getValue()).online && c1035880d3y != null && c1035880d3y.getRedirectType() == 0 && c1035880d3y.getHasPageStart() != 1) {
            return true;
        }
        if (((ShouldDropLoadFinishInTypeExt.DropTypeModel) c01gw.getValue()).shopify && c1035880d3y != null && c1035880d3y.getRedirectType() == 1 && c1035880d3y.getHasPageStart() != 1) {
            return true;
        }
        if (((ShouldDropLoadFinishInTypeExt.DropTypeModel) c01gw.getValue()).ttnet && c1035880d3y != null && c1035880d3y.getRedirectType() == 3 && c1035880d3y.getHasPageStart() != 1) {
            return true;
        }
        if (((ShouldDropLoadFinishInTypeExt.DropTypeModel) c01gw.getValue()).ttclid) {
            if (c1035880d3y != null) {
                if (c1035880d3y.getRedirectType() == 2 && c1035880d3y.getHasPageStart() != 1) {
                    return true;
                }
                if (c1035880d3y.getRedirectType() != 4 && c1035880d3y.getHasPageStart() != 1) {
                    return true;
                }
            }
        } else if (c1035880d3y != null) {
            if (c1035880d3y.getRedirectType() != 4) {
            }
        }
        return false;
    }

    public static void LIZ(String str, Map map) {
        WebViewXRequestedWithExperiment.WebViewXRequestedWithConfig webViewXRequestedWithConfig;
        List<String> list;
        if (OptIABLoadFailExp.LJ) {
            map.put("sec-ch-ua", "");
        }
        if (OptIABLoadFailExp.LIZLLL) {
            map.put("x-requested-with", "");
            return;
        }
        String host = UriProtector.parse(str).getHost();
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            webViewXRequestedWithConfig = WebViewXRequestedWithExperiment.LIZ;
            WebViewXRequestedWithExperiment.WebViewXRequestedWithConfig webViewXRequestedWithConfig2 = (WebViewXRequestedWithExperiment.WebViewXRequestedWithConfig) c0c64LJIILLIIL.LJJII(WebViewXRequestedWithExperiment.WebViewXRequestedWithConfig.class, webViewXRequestedWithConfig, "webview_x_requested_with_config", true);
            if (webViewXRequestedWithConfig2 != null) {
                webViewXRequestedWithConfig = webViewXRequestedWithConfig2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            webViewXRequestedWithConfig = WebViewXRequestedWithExperiment.LIZ;
        }
        List<String> list2 = webViewXRequestedWithConfig.hostList;
        if (list2 != null && !list2.isEmpty() && (list = webViewXRequestedWithConfig.hostList) != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(host, it2.next())) {
                    map.put("x-requested-with", webViewXRequestedWithConfig.xRequestedWith);
                    return;
                }
            }
        }
    }

    public static void LIZIZ(C1035880d3y c1035880d3y, String str) {
        if (c1035880d3y != null) {
            c1035880d3y.setIabThemeColor(null);
            c1035880d3y.setIabThemeColorUseDarkForeground(null);
            c1035880d3y.setIabThemeColorUrl(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039700dA8.LIZLLL(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1039440d9i r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039700dA8.LJFF(X.0d9i, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v1 X.0HZe<java.lang.String, java.lang.String, java.lang.String>) = 
      (r1v6 X.0HZe<java.lang.String, java.lang.String, java.lang.String>)
      (r1v7 X.0HZe<java.lang.String, java.lang.String, java.lang.String>)
      (r1v0 X.0HZe<java.lang.String, java.lang.String, java.lang.String>)
      (r1v4 X.0HZe<java.lang.String, java.lang.String, java.lang.String>)
      (r1v4 X.0HZe<java.lang.String, java.lang.String, java.lang.String>)
     binds: [B:3:0x0005, B:5:0x000b, B:7:0x0019, B:24:0x009b, B:26:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C1039440d9i r19, android.webkit.WebView r20, int r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039700dA8.LJI(X.0d9i, android.webkit.WebView, int):void");
    }

    public static void LIZJ(WebView webView, String str, SparkContext sparkContext, boolean z) throws JSONException {
        C1035880d3y c1035880d3y;
        String strLJIILLIIL;
        boolean enable;
        boolean enable2;
        AutofillModel autofillModel;
        AutofillModel autofillModel2;
        String str2;
        int iIntValue;
        if (sparkContext == null || (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) == null) {
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ad_autofill_resource_fetch_scene", true) == 1 && c1035880d3y.autofillEnable()) {
            Integer numIsAutofillNoneffective = c1035880d3y.isAutofillNoneffective();
            if (numIsAutofillNoneffective != null) {
                iIntValue = numIsAutofillNoneffective.intValue();
            } else {
                iIntValue = 0;
            }
            ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIILLIIL(iIntValue);
            ((ICommerceGeckoPreloadService) ServiceManager.get().getService(ICommerceGeckoPreloadService.class)).LIZJ(iIntValue);
        }
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(str);
        if (c0xlqLJIIL != null) {
            strLJIILLIIL = c0xlqLJIIL.LJIILLIIL("is_instant_page");
        } else {
            strLJIILLIIL = null;
        }
        if (!Intrinsics.LJFF(strLJIILLIIL, "1") && !c1035880d3y.getAutofillJsInjected()) {
            JSONObject adInfoMethodObj = c1035880d3y.getAdInfoMethodObj();
            String requestId = c1035880d3y.getRequestId();
            if (adInfoMethodObj != null && requestId != null && !c1035880d3y.isPreviewMode() && (str == null || !u.LJJIIJZLJL(str, "about:blank", false))) {
                C1068020dto.LJI = str;
                C1068020dto.LJII = adInfoMethodObj;
                String str3 = "";
                String string = Keva.getRepo("autofill_info").getString("autofill_js", "");
                Object objLJIIJ = C1068020dto.LJIIJ();
                Object obj = "[]";
                if (objLJIIJ == null) {
                    objLJIIJ = "[]";
                }
                C1068020dto c1068020dto = C1068020dto.LIZ;
                boolean zAutofillEnable = c1035880d3y.autofillEnable();
                c1068020dto.getClass();
                int iLIZLLL = C1068020dto.LIZLLL(zAutofillEnable);
                boolean zLIZJ = C1068020dto.LIZJ(c1035880d3y.autofillEnable());
                if (zLIZJ) {
                    iLIZLLL = -1;
                } else if (string.length() == 0 && !C0C64.LJIILLIIL().LJIIIZ(31744, "opt_autofill_js_inject", true, false)) {
                    iLIZLLL = 6;
                }
                String strOptString = adInfoMethodObj.optString("cid");
                if (strOptString == null) {
                    strOptString = "";
                }
                String strOptString2 = adInfoMethodObj.optString("log_extra");
                if (strOptString2 != null) {
                    str3 = strOptString2;
                }
                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "inject_js", strOptString, str3, null);
                c1022820ciuLJ.LIZJ("autofill", "refer");
                c1022820ciuLJ.LIZIZ(str, "url");
                c1022820ciuLJ.LIZIZ(Integer.valueOf(c1035880d3y.getIsFirstPage()), "first_page");
                c1022820ciuLJ.LIZIZ(objLJIIJ.toString(), "autofill_fields");
                c1022820ciuLJ.LIZIZ(Integer.valueOf(zLIZJ ? 1 : 0), "autofill_enable");
                c1022820ciuLJ.LIZIZ(Integer.valueOf(iLIZLLL), "fail_reason");
                c1022820ciuLJ.LJII();
                if (C1068020dto.LIZJ(c1035880d3y.autofillEnable())) {
                    boolean zAutofillEnable2 = c1035880d3y.autofillEnable();
                    JSONArray jSONArrayLJIIJ = C1068020dto.LJIIJ();
                    if (jSONArrayLJIIJ != null) {
                        obj = jSONArrayLJIIJ;
                    }
                    boolean zLIZJ2 = C1068020dto.LIZJ(zAutofillEnable2);
                    adInfoMethodObj.put("url", str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("autoFillField", obj);
                    jSONObject.put("canAutoFill", zLIZJ2);
                    if (!C1035800d3q.LIZ() && C123100dR.LIZ(string)) {
                        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(string, "\"/** adInfo **/\"", String.valueOf(adInfoMethodObj), true), "\"/** autoFillInfo **/\"", C786410Ut5.J3(jSONObject), true);
                        C1068020dto.LJFF = new WeakReference<>(webView);
                        webView.evaluateJavascript(strLJJIFFI, new ValueCallback() { // from class: X.0dAU
                            @Override // android.webkit.ValueCallback
                            public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj2) {
                            }
                        });
                    }
                }
            }
            JSONObject adInfoMethodObj2 = c1035880d3y.getAdInfoMethodObj();
            if (z) {
                str2 = "load_finish";
            } else {
                str2 = "load_fail";
            }
            C1067990dtl.LJJIFFI(webView, adInfoMethodObj2, str, c1035880d3y, null, sparkContext, str2, 16);
            c1035880d3y.setAutofillJsInjected(true);
        }
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null && (autofillModel2 = awemeRawAd.getAutofillModel()) != null) {
            enable = autofillModel2.getEnable();
        } else {
            enable = false;
        }
        C1068020dto.LJIIIZ(enable);
        AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd2 != null && (autofillModel = awemeRawAd2.getAutofillModel()) != null) {
            enable2 = autofillModel.getEnable();
        } else {
            enable2 = false;
        }
        C1067990dtl.LJIIJJI(enable2, str, false, EnumC1059300dfk.AD, webView, c1035880d3y);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x021c A[PHI: r9
      0x021c: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean), (r9v3 boolean) binds: [B:119:0x0219, B:111:0x020a, B:113:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.C1039440d9i r20, android.webkit.WebView r21, java.lang.String r22, boolean r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039700dA8.LJ(X.0d9i, android.webkit.WebView, java.lang.String, boolean, int, java.lang.String):void");
    }
}
