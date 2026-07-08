package X;

import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B2V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B2V implements C1B2O {
    public static boolean LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needBuildSecLink : ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C1B2S.LIZJ || !C1B2T.LJ(str)) {
            return false;
        }
        List<String> list = C1B2S.LIZIZ.LIZLLL;
        if (list != null && str != null) {
            for (String str2 : (ArrayList) list) {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    try {
                        String host = UriProtector.parse(str).getHost();
                        if (!TextUtils.isEmpty(host) && TextUtils.equals(host, str2)) {
                            return false;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('.');
                        sbLIZ2.append(str2);
                        if (host.endsWith(C2188811AlT.LIZIZ(sbLIZ2))) {
                            return false;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        C1B2U c1b2uLIZIZ = C1B2W.LIZ().LIZIZ(str);
        if (c1b2uLIZIZ != null && !c1b2uLIZIZ.LIZJ) {
            try {
                new JSONObject().put("url", str);
                return false;
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        C2198391B2f.LIZ().getClass();
        if (System.currentTimeMillis() - C2198391B2f.LJIIIIZZ < 1800000) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(WebView webView, boolean z) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        WebHistoryItem currentItem;
        if (C1B2S.LIZJ && (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) != null && (currentItem = webBackForwardListCopyBackForwardList.getCurrentItem()) != null && C1B2S.LIZIZ != null) {
            if (currentItem.getUrl().startsWith(C1B2S.LIZIZ.LIZJ)) {
                return webView.canGoBackOrForward(-2);
            }
            if (webBackForwardListCopyBackForwardList.getSize() == 2 && C1B2T.LJFF(webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() - 1).getUrl())) {
                return webView.canGoBackOrForward(-2);
            }
        }
        return z;
    }
}
