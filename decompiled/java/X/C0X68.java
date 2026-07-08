package X;

import android.webkit.WebResourceResponse;
import com.bytedance.lynx.hybrid.ttp.model.TTPContentTypeSettingBean;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X68, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X68 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final InputStream LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("webResponseCompat(mimeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" \n encoding=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" \n statusCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" \n reasonPhrase=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" \n interceptor=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static WebResourceResponse LIZ(C0X68 c0x68, String str) {
        HashMap map;
        HashMap map2;
        Map<String, String> map3 = c0x68.LJ;
        if (map3 instanceof HashMap) {
            map = (HashMap) map3;
        } else {
            map = null;
        }
        if (map != null) {
            TTPContentTypeSettingBean tTPContentTypeSettingBean = (TTPContentTypeSettingBean) C843290X6h.LJFF.getValue();
            if (tTPContentTypeSettingBean.enabled) {
                for (String str2 : tTPContentTypeSettingBean.allowList) {
                    if (Intrinsics.LJFF(str2, "*") || (str != null && a0.LJJIIZI(str, str2, false))) {
                        if (Intrinsics.LJFF(map.get("content-type"), c0x68.LIZ) || Intrinsics.LJFF(map.get("Content-Type"), c0x68.LIZ)) {
                            Map<String, String> map4 = c0x68.LJ;
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
        return new WebResourceResponse(c0x68.LIZ, c0x68.LIZIZ, c0x68.LIZJ, c0x68.LIZLLL, c0x68.LJ, c0x68.LJFF);
    }

    public C0X68(String str, String str2, InputStream inputStream, int i, String str3, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = inputStream;
    }
}
