package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: X.015O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015O {
    public static String LIZIZ(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public static String LIZ(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("?");
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (str.endsWith("?")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(LIZIZ("sdk_version"));
                sbLIZ2.append("=");
                sbLIZ2.append(LIZIZ(String.valueOf(1)));
                str = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("&");
                sbLIZ3.append(LIZIZ("sdk_version"));
                sbLIZ3.append("=");
                sbLIZ3.append(LIZIZ(String.valueOf(1)));
                str = C2188811AlT.LIZIZ(sbLIZ3);
            }
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        if (str.endsWith("?")) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(str);
                            sbLIZ4.append(LIZIZ(entry.getKey().toString()));
                            sbLIZ4.append("=");
                            String str2 = map.get(entry.getKey());
                            str2.toString();
                            sbLIZ4.append(LIZIZ(str2));
                            str = C2188811AlT.LIZIZ(sbLIZ4);
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(str);
                            sbLIZ5.append("&");
                            sbLIZ5.append(LIZIZ(entry.getKey().toString()));
                            sbLIZ5.append("=");
                            String str3 = map.get(entry.getKey());
                            str3.toString();
                            sbLIZ5.append(LIZIZ(str3));
                            str = C2188811AlT.LIZIZ(sbLIZ5);
                        }
                    }
                }
            }
        }
        return str;
    }
}
