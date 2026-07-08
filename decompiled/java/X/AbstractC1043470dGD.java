package X;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1043470dGD implements InterfaceC1041260dCe {
    public final boolean LIZ;

    public abstract InputStream LIZIZ(String str);

    public abstract String LIZLLL();

    public AbstractC1043470dGD(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC1041260dCe
    public WebResourceResponse LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strLIZLLL = LIZLLL();
        if (TextUtils.isEmpty(strLIZLLL) || !PatternProtector.compile(strLIZLLL).matcher(str).find()) {
            return null;
        }
        return LJ(LIZJ(str), "", LIZIZ(str), null);
    }

    public String LIZJ(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (!str.endsWith(".jpeg") && !str.endsWith(".jpg")) {
            if (str.endsWith(".png")) {
                return "image/png";
            }
            if (str.endsWith(".gif")) {
                return "image/gif";
            }
            if (str.endsWith(".woff")) {
                return "font/woff";
            }
            if (str.endsWith(".svg")) {
                return "image/svg+xml";
            }
            if (str.endsWith(".ttf")) {
                return "font/ttf";
            }
            if (str.endsWith(".webp")) {
                return "font/webp";
            }
            if (str.endsWith(".woff2")) {
                return "font/woff2";
            }
            if (str.endsWith(".otf")) {
                return "font/otf";
            }
            if (str.endsWith(".sfnt")) {
                return "font/sfnt";
            }
            if (str.endsWith(".mp3")) {
                return "audio/mp3";
            }
            if (str.endsWith(".mp4")) {
                return "video/mpeg4";
            }
            return "";
        }
        return "image/jpeg";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WebResourceResponse LJ(String str, String str2, InputStream inputStream, Map map) {
        Map map2 = map;
        if (inputStream != null) {
            if (map2 == null) {
                try {
                    map2 = new HashMap();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            if (!map2.containsKey("Access-Control-Allow-Origin") && !map2.containsKey("access-control-allow-origin")) {
                map2.put("Access-Control-Allow-Origin", "*");
            }
            if ("font/ttf".equals(str)) {
                return new WebResourceResponse(str, str2, 200, "OK", map2, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            webResourceResponse.setResponseHeaders(map2);
            return webResourceResponse;
        }
        return null;
    }
}
