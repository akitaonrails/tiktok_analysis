package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ttp.TTWebResLoaderDelegate;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X69, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X69 {
    public static final /* synthetic */ int LIZ = 0;

    public static C0X68 LIZIZ(WebView webView, String str) throws JSONException, IOException {
        Object c098200Yq;
        boolean zLJI = MethodIDManager.LJI(137658);
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        C843070X5l.LIZJ(6, "RESOURCE_INTERCEPT, request by TTNetAndroidDelegate, " + str, null, null);
        C0X68 c0x68LIZJ = C0X6A.LIZJ(webView, false, "GET", uri, C2097608Jq.LJ(), null, C843460X6y.LIZIZ.get(), false, C0X61.RESOURCE_INTERCEPT);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0x68LIZJ;
    }

    public static C0X68 LIZJ(WebView webView, C843090X5n c843090X5n) {
        boolean zLJI = MethodIDManager.LJI(137658);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AjaxRequest, request by TTNetAndroidDelegate, ");
        sbLIZ.append(c843090X5n.LIZJ);
        C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C0X68 c0x68LIZJ = C0X6A.LIZJ(webView, false, c843090X5n.LIZ, c843090X5n.LIZLLL, c843090X5n.LJFF, c843090X5n.LJ, null, c843090X5n.LJI, C0X61.AJAX_HOOK);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0x68LIZJ;
    }

    public static C0X68 LIZ(WebView webView, WebResourceRequest webResourceRequest, C0X65 c0x65) throws JSONException, IOException {
        C0X68 c0x68LIZJ;
        boolean zLJI = MethodIDManager.LJI(137658);
        C0X65 c0x652 = C0X65.TTNet_Native;
        if (c0x65 == c0x652) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RESOURCE_INTERCEPT, request by TTWebResLoaderDelegate, ");
            sbLIZ.append(webResourceRequest.getUrl());
            C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
            boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
            String method = webResourceRequest.getMethod();
            Uri url = webResourceRequest.getUrl();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            C0X70 c0x70 = C843460X6y.LIZIZ.get();
            C0X61 c0x61 = C0X61.RESOURCE_INTERCEPT;
            C843360X6o c843360X6o = new C843360X6o();
            String string = url.toString();
            LinkedHashMap linkedHashMap = new LinkedHashMap(requestHeaders);
            C0X6M c0x6m = new C0X6M(new WeakReference(webView), string, method, linkedHashMap, zIsForMainFrame, c0x61);
            C0X6L c0x6l = c843360X6o.LIZ;
            c0x6l.LIZ = string;
            c0x6l.LJIIJJI = c0x652;
            c0x6l.LIZJ = method;
            c0x6l.LIZLLL = zIsForMainFrame;
            String str = requestHeaders.get("Accept");
            if (str == null) {
                str = requestHeaders.get("accept");
            }
            c0x6l.LJ = str;
            C0X6L c0x6l2 = c843360X6o.LIZ;
            String str2 = requestHeaders.get("Accept-Encoding");
            if (str2 == null) {
                str2 = requestHeaders.get("accept-encoding");
            }
            c0x6l2.LJFF = str2;
            c843360X6o.LIZIZ.LIZJ = System.currentTimeMillis();
            c843360X6o.LIZIZ.LIZ = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ttp interceptor start, origin:");
            sbLIZ2.append(string);
            C843070X5l.LIZJ(2, C2188811AlT.LIZIZ(sbLIZ2), "_TTWebResLoaderDelegate_", null);
            C0X68 c0x68LIZ = new C0X6G().LIZ(webView, c0x6m);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ttp interceptor end, origin:");
            sbLIZ3.append(string);
            C843070X5l.LIZJ(2, C2188811AlT.LIZIZ(sbLIZ3), "_TTWebResLoaderDelegate_", null);
            if (c0x68LIZ != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("HIT ttp interceptor: origin:");
                sbLIZ4.append(string);
                sbLIZ4.append(", \n ");
                sbLIZ4.append(c0x68LIZ);
                C843070X5l.LIZLLL(2, C2188811AlT.LIZIZ(sbLIZ4), "_TTWebResLoaderDelegate_");
                c0x68LIZJ = new C0X68(c0x68LIZ.LIZ, c0x68LIZ.LIZIZ, new C0X6B(c843360X6o, c0x68LIZ, webView, c0x70, c0x61, c0x68LIZ.LJFF), c0x68LIZ.LIZJ, c0x68LIZ.LIZLLL, c0x68LIZ.LJ);
            } else {
                c843360X6o.LIZIZ.LIZLLL = System.currentTimeMillis();
                String strLIZLLL = C843010X5f.LIZLLL(webView);
                String str3 = "";
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                linkedHashMap.put("x-tt-web-proxy", "TTNet");
                if (((C843150X5t) C843290X6h.LJI.getValue()).LIZ) {
                    linkedHashMap.put("x-tt-web-ttp", "v2");
                }
                boolean zLIZIZ = C0X6A.LIZIZ(strLIZLLL);
                if (zLIZIZ) {
                    linkedHashMap.put("x-ttnet-httpcache-enable", "1");
                }
                Pair[] pairArr = new Pair[6];
                pairArr[0] = new Pair("X-TTWEB-CONTROL-LOADER-TYPE", "TTNET");
                pairArr[1] = new Pair("X-TTWEB-CONTROL-DELEGATE-TYPE", "TTP");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("skip_common_business", true);
                jSONObject.put("enable_http_cache", zLIZIZ);
                jSONObject.put("follow_redirect_internal", !zIsForMainFrame);
                pairArr[2] = new Pair("X-TTWEB-CONTROL-TTNET-PARAMS", C786410Ut5.J3(jSONObject));
                pairArr[3] = new Pair("X-TTWEB-CONTROL-FINAL-URL", c0x6m.LIZ);
                String str4 = (String) linkedHashMap.get("Accept");
                if (str4 == null && (str4 = (String) linkedHashMap.get("accept")) == null) {
                    str4 = "";
                }
                String str5 = (String) linkedHashMap.get("Accept-Encoding");
                if (str5 == null && (str5 = (String) linkedHashMap.get("accept-encoding")) == null) {
                    str5 = "";
                }
                String strLIZLLL2 = C1058250de3.LIZLLL(new TTWebResLoaderDelegate.Extra(strLIZLLL, str4, str5, c843360X6o.LIZIZ.LIZJ, "cdn"));
                if (strLIZLLL2 != null) {
                    str3 = strLIZLLL2;
                }
                pairArr[4] = new Pair("X-TTWEB-CONTROL-EXTRA", str3);
                pairArr[5] = new Pair("X-TTWEB-CONTROL-REQUEST-HEADER", C786410Ut5.J3(new JSONObject(linkedHashMap)));
                c0x68LIZJ = new C0X68("text/plain", "UTF-8", null, 200, "Redirect To TTWeb", C2097608Jq.LJIIIIZZ(pairArr));
            }
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("RESOURCE_INTERCEPT, request by TTNetAndroidDelegate, ");
            sbLIZ5.append(webResourceRequest.getUrl());
            C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ5), null, null);
            c0x68LIZJ = C0X6A.LIZJ(webView, webResourceRequest.isForMainFrame(), webResourceRequest.getMethod(), webResourceRequest.getUrl(), webResourceRequest.getRequestHeaders(), null, C843460X6y.LIZIZ.get(), false, C0X61.RESOURCE_INTERCEPT);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0x68LIZJ;
    }
}
