package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0or0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489120or0 extends C09AY implements Function0<String> {
    public C1489120or0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strF3;
        String str;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        String str2 = C1489110oqz.LIZ;
        boolean z = true;
        if (str2 == null || str2.length() == 0) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            try {
                strF3 = C786410Ut5.F3(contextLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strF3 = null;
            }
            C1489110oqz.LIZ = strF3;
            if ((strF3 == null || strF3.length() == 0) && !C1489110oqz.LIZIZ && (contextLIZ instanceof Activity)) {
                try {
                    WebView webView = new WebView(contextLIZ);
                    C1489110oqz.LIZ = webView.getSettings().getUserAgentString();
                    C1489110oqz.LIZIZ = true;
                    webView.destroy();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                }
                str = C1489110oqz.LIZ;
            } else {
                str = C1489110oqz.LIZ;
            }
        } else {
            str = C1489110oqz.LIZ;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 7, "ad_web_ua_update_frequency", true) != 0) {
            C1489110oqz.LIZJ = System.currentTimeMillis();
            SharedPreferences sharedPreferences = (SharedPreferences) C1489110oqz.LJ.getValue();
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutLong = editorEdit.putLong("ad_user_agent_update_time", C1489110oqz.LIZJ)) != null) {
                editorPutLong.apply();
            }
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            return str;
        }
        String property = System.getProperty("http.agent");
        return property == null ? "" : property;
    }
}
