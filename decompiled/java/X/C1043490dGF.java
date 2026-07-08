package X;

import android.webkit.WebResourceResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043490dGF {
    public static WebResourceResponse LIZ(InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                HashMap map = new HashMap();
                map.put("Access-Control-Allow-Origin", "*");
                map.put("Content-Type", str);
                if ("font/ttf".equals(str)) {
                    return new WebResourceResponse(str, "", 200, "OK", map, inputStream);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(str, "", inputStream);
                webResourceResponse.setResponseHeaders(map);
                return webResourceResponse;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
