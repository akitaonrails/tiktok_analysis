package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.018L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018L {
    public final Map<String, String> LIZ = new LinkedHashMap();
    public final String LIZIZ;

    public final String toString() {
        String strEncode;
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        Map<String, String> map = this.LIZ;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            try {
                String strEncode2 = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String str = (String) entry.getValue();
                if (str != null) {
                    try {
                        strEncode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    strEncode = "";
                }
                if (!TextUtils.isEmpty(strEncode)) {
                    strEncode = strEncode.replace("+", "%20");
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(strEncode2);
                sb.append("=");
                sb.append(strEncode);
            } catch (UnsupportedEncodingException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        String string = sb.toString();
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            return string;
        }
        if (this.LIZIZ.indexOf(63) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("&");
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("?");
        sbLIZ2.append(string);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C018L(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
