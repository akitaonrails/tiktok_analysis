package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.Locale;

/* JADX INFO: renamed from: X.0qKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545710qKH {
    public static final C1545710qKH LIZ = new C1545710qKH();

    public static String LIZ() {
        String strLIZ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        String str = "";
        if (iSparkHostApi == null) {
            return "";
        }
        C1540150qBJ c1540150qBJLJJIIJ = iSparkHostApi.LJJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(' ');
        c1540150qBJLJJIIJ.getClass();
        sbLIZ.append("musical_ly");
        sbLIZ.append('_');
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZIZ());
        sbLIZ.append(" JsSdk/1.0 NetType/");
        sbLIZ.append(iSparkHostApi.getNetworkType().toUpperCase(Locale.ROOT));
        sbLIZ.append(" Channel/");
        sbLIZ.append(C844470XAv.LJIILL);
        sbLIZ.append(" AppName/");
        sbLIZ.append("musical_ly");
        sbLIZ.append(" app_version/");
        sbLIZ.append(C844470XAv.LIZJ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" ByteLocale/");
        sbLIZ2.append(iSparkHostApi.LLILLJJLI());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(" ByteFullLocale/");
        sbLIZ3.append(iSparkHostApi.LIZ());
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append(" Region/");
        if (iSparkHostApi.LLIL() != null && (strLIZ = C2222691Bz1.LIZ()) != null) {
            str = strLIZ;
        }
        sbLIZ4.append(str);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ4);
        sbLIZ5.append(" AppId/");
        sbLIZ5.append(c1540150qBJLJJIIJ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    public static String LIZIZ(Context context, WebView webView) {
        String userAgentString;
        String strF3;
        WebSettings settings;
        Activity activityLIZ = null;
        if (webView != null && (settings = webView.getSettings()) != null) {
            userAgentString = settings.getUserAgentString();
        } else {
            userAgentString = null;
        }
        if (!TextUtils.isEmpty(userAgentString)) {
            C1545940qKe.LIZ = userAgentString;
        } else if (!TextUtils.isEmpty(C1545940qKe.LIZ)) {
            userAgentString = C1545940qKe.LIZ;
        } else {
            try {
                strF3 = C786410Ut5.F3(context);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strF3 = null;
            }
            C1545940qKe.LIZ = strF3;
            if (TextUtils.isEmpty(strF3) && !C1545940qKe.LIZIZ && webView == null) {
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                }
                if (activityLIZ != null) {
                    C1545940qKe.LIZIZ = true;
                    try {
                        WebView webView2 = new WebView(activityLIZ);
                        C1545940qKe.LIZ = webView2.getSettings().getUserAgentString();
                        webView2.destroy();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
            userAgentString = C1545940qKe.LIZ;
        }
        if (userAgentString == null) {
            userAgentString = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(userAgentString);
        sbLIZ.append(LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (webView instanceof WebKitView) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" Spark/1.7.2");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }
}
