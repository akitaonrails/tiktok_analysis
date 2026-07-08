package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287860jcO {
    public static final C1287860jcO LIZ = new C1287860jcO();

    public static void LIZIZ(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("javascript: ");
            sbLIZ.append(str);
            C786410Ut5.ue(webView, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ(final WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append(e3.h);
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "null";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb.append('\"');
                                sb.append(string);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append(string);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            final String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0hh2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("h@61c1.a$1");
                        try {
                            C1287860jcO c1287860jcO = this.LLILLL;
                            WebView webView2 = webView;
                            String str2 = string2;
                            c1287860jcO.getClass();
                            C1287860jcO.LIZIZ(webView2, str2);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("h@61c1.a$1");
                    }
                });
                return;
            } else {
                LIZIZ(webView, string2);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The WebView is null for ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C1287870jcP.LIZ.booleanValue()) {
            TextUtils.isEmpty(strLIZIZ);
        }
    }
}
