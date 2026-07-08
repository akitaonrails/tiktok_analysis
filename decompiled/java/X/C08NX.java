package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* JADX INFO: renamed from: X.08NX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NX {
    public static String LIZ(String str, String str2) {
        try {
            if (str2 == null) {
                return URLEncoder.encode(str, "ISO-8859-1");
            }
            if (str2.equals("null_encoding")) {
                return str;
            }
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public static String LIZIZ(List<? extends C08NY> list, String str) {
        String strLIZ;
        StringBuilder sb = new StringBuilder();
        for (C08NY c08ny : list) {
            String strLIZ2 = LIZ(c08ny.getName(), str);
            String value = c08ny.getValue();
            if (value != null) {
                strLIZ = LIZ(value, str);
            } else {
                strLIZ = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strLIZ2);
            sb.append("=");
            sb.append(strLIZ);
        }
        return sb.toString();
    }
}
