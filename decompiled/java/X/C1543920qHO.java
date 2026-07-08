package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543920qHO {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C1544400qIA>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Pair<Boolean, String>> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(WebView webView) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyWebviewToken with webview = ");
        sbLIZ.append(webView);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        ConcurrentHashMap<String, ConcurrentHashMap<String, C1544400qIA>> concurrentHashMap = LIZ;
        ConcurrentHashMap<String, C1544400qIA> concurrentHashMap2 = concurrentHashMap.get(String.valueOf(webView.hashCode()));
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        concurrentHashMap.remove(String.valueOf(webView.hashCode()));
        LIZIZ.remove(String.valueOf(webView.hashCode()));
        try {
            webView.setTag(R.id.webview_destroy_tag, Boolean.TRUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("destroyWebviewToken webview = ");
            sbLIZ2.append(webView);
            sbLIZ2.append(" set tag error e = ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
        }
    }

    public static Pair LIZIZ(WebView webView) {
        if (C1544000qHW.LIZIZ) {
            try {
                return new Pair(Boolean.valueOf(Intrinsics.LJFF(webView.getTag(R.id.webview_no_token_tag), Boolean.TRUE)), (String) webView.getTag(R.id.webview_no_token_reason));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getWebViewNoTokenState webview = ");
                sbLIZ.append(webView);
                sbLIZ.append(" get tag error e = ");
                sbLIZ.append(e.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                return new Pair(Boolean.valueOf(Intrinsics.LJFF(webView.getTag(R.id.webview_no_token_tag), Boolean.TRUE)), strLIZIZ);
            }
        }
        return LIZIZ.get(String.valueOf(webView.hashCode()));
    }

    public static boolean LJ(String str) {
        Iterator<String> it2 = C1543410qGZ.LJIIZILJ.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void LJFF(WebView webView, String str) {
        if (C1544000qHW.LIZIZ) {
            try {
                webView.setTag(R.id.webview_no_token_tag, Boolean.TRUE);
                webView.setTag(R.id.webview_no_token_reason, str);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setWebviewNoTokenTag webview = ");
                sbLIZ.append(webView);
                sbLIZ.append(" set tag error e = ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                return;
            }
        }
        LIZIZ.put(String.valueOf(webView.hashCode()), new Pair<>(Boolean.TRUE, str));
    }

    public static String LIZJ(WebView webView, C1543850qHH c1543850qHH, String str) {
        C1544400qIA c1544400qIA;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getWebViewRealUrl with token = ");
        sbLIZ.append(str);
        sbLIZ.append(", webview = ");
        sbLIZ.append(webView);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        try {
            Object tag = webView.getTag(R.id.webview_destroy_tag);
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(tag, bool)) {
                c1543850qHH.LJIIIIZZ.put("jsb_auth_webview_released", bool);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ConcurrentHashMap<String, Object> concurrentHashMap = c1543850qHH.LJIIIIZZ;
            String message = e.getMessage();
            if (message == null) {
                message = "error message null";
            }
            concurrentHashMap.put("jsb_auth_webview_released", message);
        }
        ConcurrentHashMap<String, C1544400qIA> concurrentHashMap2 = LIZ.get(String.valueOf(webView.hashCode()));
        if (concurrentHashMap2 != null && (c1544400qIA = concurrentHashMap2.get(str)) != null) {
            return c1544400qIA.LIZ;
        }
        return null;
    }

    public static boolean LIZLLL(WebView webView, C1543850qHH c1543850qHH, String str) {
        String str2;
        Pair pairLIZIZ;
        if (LJ(str)) {
            c1543850qHH.LIZLLL = "isNoTokenPass";
        }
        if (C1543410qGZ.LJIILL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1543850qHH.LIZLLL);
            sbLIZ.append("|noTokenUseUrl");
            c1543850qHH.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        }
        Pair pairLIZIZ2 = LIZIZ(webView);
        if (pairLIZIZ2 != null && ((Boolean) pairLIZIZ2.getFirst()).booleanValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1543850qHH.LIZLLL);
            sbLIZ2.append("|webviewWasMarked");
            c1543850qHH.LIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
            c1543850qHH.LJ = "wasMarked";
            c1543850qHH.LJFF = (String) pairLIZIZ2.getSecond();
        } else {
            c1543850qHH.LJ = "noMarked";
            if (pairLIZIZ2 != null) {
                str2 = (String) pairLIZIZ2.getSecond();
            } else {
                str2 = null;
            }
            c1543850qHH.LJFF = str2;
        }
        String str3 = c1543850qHH.LJIIJJI;
        if (str3 != null && str3.length() > 0 && C1543410qGZ.LJIJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1543850qHH.LIZLLL);
            sbLIZ3.append("|iframeCanPass");
            c1543850qHH.LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
            return true;
        }
        if (C1543410qGZ.LJIJI) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c1543850qHH.LIZLLL);
            sbLIZ4.append("|hookerInitFailed");
            c1543850qHH.LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
            return true;
        }
        if (!LJ(str) && !C1543410qGZ.LJIILL && ((pairLIZIZ = LIZIZ(webView)) == null || !((Boolean) pairLIZIZ.getFirst()).booleanValue())) {
            return false;
        }
        return true;
    }
}
