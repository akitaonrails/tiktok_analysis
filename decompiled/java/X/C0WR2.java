package X;

import android.net.Uri;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WR2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WR2 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI(".css", ".js");

    public static String LIZ(String... strArr) {
        for (String str : strArr) {
            if (str != null && !a0.LJJJIL(str)) {
                return a0.LJLIIIL(str).toString();
            }
        }
        return null;
    }

    public static String LIZIZ(String str) {
        String string;
        String lowerCase;
        Uri uriLIZLLL;
        String path;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null || lowerCase.length() <= 0 || !u.LJJIIJZLJL(lowerCase, "https://", false) || (uriLIZLLL = C759510Tqn.LIZLLL(lowerCase, "normalizePipoSspPath")) == null || (path = uriLIZLLL.getPath()) == null || !(!a0.LJJJIL(path)) || Intrinsics.LJFF(path, "/")) {
            return null;
        }
        if (!u.LJJIIJZLJL(path, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(path);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return path;
    }

    public static String LIZJ(String str) {
        String string;
        String lowerCase;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null || lowerCase.length() <= 0) {
            return null;
        }
        if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(lowerCase);
            Uri uriLIZLLL = C759510Tqn.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "normalizePipoSspRouteWithoutScheme");
            if (uriLIZLLL == null) {
                return null;
            }
            return LIZLLL(uriLIZLLL);
        }
        Uri uriLIZLLL2 = C759510Tqn.LIZLLL(lowerCase, "normalizePipoSspRoute");
        if (uriLIZLLL2 == null) {
            return null;
        }
        return LIZLLL(uriLIZLLL2);
    }

    public static String LIZLLL(Uri uri) {
        String string;
        String lowerCase;
        String host = uri.getHost();
        if (host == null || (string = a0.LJLIIIL(host).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null || lowerCase.length() <= 0) {
            return null;
        }
        String path = uri.getPath();
        if (path != null && (!a0.LJJJIL(path)) && !Intrinsics.LJFF(path, "/")) {
            return lowerCase.concat(path);
        }
        return lowerCase;
    }
}
