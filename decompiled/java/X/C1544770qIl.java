package X;

import Y.ARunnableS92S0200000_23;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544770qIl {
    public static InterfaceC1544790qIn LIZIZ;
    public static InterfaceC1544560qIQ LIZJ;
    public static InterfaceC1544390qI9 LIZLLL;
    public static InterfaceC1545030qJB LJ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, AbstractC1544900qIy> LJFF = new ConcurrentHashMap<>();

    public static AbstractC1544900qIy LIZIZ(String str) {
        return LJFF.get(str);
    }

    public static final void LIZJ(AbstractC1544900qIy abstractC1544900qIy) {
        LJFF.put(abstractC1544900qIy.LJI(), abstractC1544900qIy);
    }

    public static boolean LIZLLL(String str) {
        if (((Boolean) C256380A2y.LIZ.getValue()).booleanValue()) {
            if (Intrinsics.LJFF(str, "_jsmanage_js_recording_core") || Intrinsics.LJFF(str, "_jsmanage_js_recording_rules")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LIZ(WebView webView, AbstractC1544900qIy abstractC1544900qIy) {
        if (LIZ.get()) {
            HandlerHook.viewPost(webView, new ARunnableS92S0200000_23(webView, abstractC1544900qIy, 94));
            return;
        }
        String url = webView.getUrl();
        String strLJI = abstractC1544900qIy.LJI();
        IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.ERROR_MANUAL_WEBVIEWJSINJECTSDK_NOT_INIT;
        C1544940qJ2.LIZ(webView, url, strLJI, null, iJSInjectCallback$ErrorCode);
        abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode);
        String strLJI2 = abstractC1544900qIy.LJI();
        if (!LIZLLL(strLJI2)) {
            return;
        }
        int code = iJSInjectCallback$ErrorCode.getCode();
        String url2 = webView.getUrl();
        String str = "";
        if (url2 == null) {
            url2 = "";
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("func", "evaluateJavascript");
        pairArr[1] = new Pair("name", strLJI2);
        String url3 = webView.getUrl();
        if (url3 != null) {
            str = url3;
        }
        pairArr[2] = new Pair("url", str);
        abstractC1544900qIy.LJIIJ(code, C2097608Jq.LJIIIIZZ(pairArr), url2);
    }
}
