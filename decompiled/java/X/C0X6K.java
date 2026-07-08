package X;

import android.webkit.WebResourceResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.WebResponseContentTypeModifySettings;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X6K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6K {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final InputStream LJFF;
    public final Integer LJI;

    public final WebResourceResponse LIZ(String str) {
        HashMap map;
        HashMap map2;
        Map<String, String> map3 = this.LJ;
        if (map3 instanceof HashMap) {
            map = (HashMap) map3;
        } else {
            map = null;
        }
        if (map != null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel webResponseContentTypeModifyModel = WebResponseContentTypeModifySettings.LIZ;
            WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel webResponseContentTypeModifyModel2 = (WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel) settingsManagerLIZLLL.LJIIIIZZ("web_response_content_type_modefify", WebResponseContentTypeModifySettings.WebResponseContentTypeModifyModel.class, webResponseContentTypeModifyModel);
            if (webResponseContentTypeModifyModel2 != null) {
                webResponseContentTypeModifyModel = webResponseContentTypeModifyModel2;
            }
            if (webResponseContentTypeModifyModel.enabled) {
                for (String str2 : webResponseContentTypeModifyModel.allowList) {
                    if (Intrinsics.LJFF(str2, "*") || (str != null && a0.LJJIIZI(str, str2, false))) {
                        if (Intrinsics.LJFF(map.get("content-type"), this.LIZ) || Intrinsics.LJFF(map.get("Content-Type"), this.LIZ)) {
                            Map<String, String> map4 = this.LJ;
                            if ((map4 instanceof HashMap) && (map2 = (HashMap) map4) != null) {
                                if (map2.containsKey("content-type")) {
                                    map2.remove("content-type");
                                } else if (map2.containsKey("Content-Type")) {
                                    map2.remove("Content-Type");
                                }
                            }
                        }
                    }
                }
            }
        }
        return new WebResourceResponse(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public /* synthetic */ C0X6K(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        this(str, str2, i, str3, map, inputStream, null);
    }

    public C0X6K(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = inputStream;
        this.LJI = num;
    }
}
