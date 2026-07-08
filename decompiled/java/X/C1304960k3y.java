package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0k3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304960k3y {
    public static String LIZIZ(String str) {
        if (str != null) {
            try {
                URL url = new URL(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(url.getProtocol());
                sbLIZ.append("://");
                sbLIZ.append(url.getHost());
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }
        return "";
    }

    public static String LIZJ(String str) {
        String strLIZIZ;
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        if (scheme == null) {
            scheme = "https";
        }
        String host = uri.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        if (uri.getPort() == -1) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(':');
            sbLIZ.append(uri.getPort());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String path = uri.getPath();
        if (path != null) {
            str2 = path;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(scheme);
        sbLIZ2.append("://");
        sbLIZ2.append(host);
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (u.LJIIZILJ(str2, ".js", false)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(str2);
        sbLIZ4.append(".js");
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static String LIZ(Integer num, String str, String str2) {
        if (a0.LJJIIZI(str2, "/", false)) {
            str2 = a0.LJJLJLI(str2, "/", str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/cart/");
        sbLIZ.append(str2);
        sbLIZ.append(':');
        sbLIZ.append(num);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
