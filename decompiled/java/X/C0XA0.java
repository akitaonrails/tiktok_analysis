package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0XA0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA0 implements C0XA1 {
    public static final String LIZ(String str) {
        if (((Boolean) C1474810oTv.Z0.getValue()).booleanValue()) {
            if (C844250X9z.LIZIZ == null) {
                List<String> listAsList = Arrays.asList("device_id", "aid", "accurateRegion", "device_type", "update_version_code", "device_platform", "ac");
                C0XI4 c0xi4 = new C0XI4("https://temp?");
                HashMap map = new HashMap();
                C0XDN.LIZJ(map, true);
                for (String str2 : listAsList) {
                    if (!TextUtils.isEmpty((CharSequence) map.get(str2))) {
                        c0xi4.LJ(str2, (String) map.get(str2));
                    }
                }
                String strSubstring = c0xi4.LJFF().substring(13);
                C844250X9z.LIZIZ = strSubstring;
                if (strSubstring.startsWith("?") || C844250X9z.LIZIZ.startsWith("&")) {
                    C844250X9z.LIZIZ = C844250X9z.LIZIZ.substring(1);
                }
            }
            StringBuilder sb = new StringBuilder(str);
            if (str.indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            String str3 = C844250X9z.LIZIZ;
            if (str3 != null) {
                sb.append(str3);
            }
            return sb.toString();
        }
        return C844250X9z.LIZ(str).LJFF();
    }
}
