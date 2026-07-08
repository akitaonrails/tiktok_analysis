package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.1B2T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B2T {
    public static boolean LJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!LIZLLL(str, "http") && !LIZLLL(str, "https")) {
                if (TextUtils.isEmpty(UriProtector.parse(str).getScheme())) {
                    return true;
                }
                return false;
            }
            if (!LJFF(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(String str) {
        if (!LIZLLL(str, "https://")) {
            return false;
        }
        String host = UriProtector.parse(C1B2S.LIZIZ.LIZJ).getHost();
        String host2 = UriProtector.parse(str).getHost();
        if (host2 == null) {
            return false;
        }
        return host2.equalsIgnoreCase(host);
    }

    public static boolean LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str2.equals(str)) {
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/");
            if (str2.equals(C2188811AlT.LIZIZ(sbLIZ))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str.toLowerCase().startsWith(str2.toLowerCase());
        }
        return false;
    }

    public static String LIZ(int i, String str, String str2) {
        C1B2R c1b2r = C1B2S.LIZIZ;
        if (c1b2r != null && !TextUtils.isEmpty(str) && !LJFF(str) && LJ(str) && i > 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1B2S.LIZIZ.LIZJ);
            if (C1B2S.LIZIZ.LIZJ.endsWith("/")) {
                sb.append("api/private_midpage");
            } else {
                sb.append("/api/private_midpage");
            }
            sb.append("?aid=");
            sb.append(c1b2r.LIZ);
            sb.append("&lang=");
            sb.append(c1b2r.LIZIZ);
            sb.append("&scene=");
            sb.append(str2);
            sb.append("&ts=");
            sb.append(System.currentTimeMillis());
            sb.append("&type=");
            sb.append(i);
            sb.append("&tlm#");
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    public static String LIZIZ(int i, String str, String str2) {
        C1B2R c1b2r = C1B2S.LIZIZ;
        if (c1b2r != null && !TextUtils.isEmpty(str) && !LJFF(str) && LJ(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1B2S.LIZIZ.LIZJ);
            if (i > 0) {
                sb.append("/middle-page");
            }
            sb.append("?aid=");
            sb.append(c1b2r.LIZ);
            sb.append("&lang=");
            sb.append(c1b2r.LIZIZ);
            sb.append("&scene=");
            sb.append(str2);
            sb.append("&jumper_version=1&target=");
            sb.append(URLEncoder.encode(str));
            if (i > 0) {
                sb.append("&type=");
                sb.append(i);
            }
            return sb.toString();
        }
        return str;
    }
}
