package X;

import android.net.Uri;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.19pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21660119pn {
    public static final boolean LIZ(C21660019pm c21660019pm) {
        if ((!a0.LJJJIL(c21660019pm.LIZIZ)) || c21660019pm.LIZLLL != null) {
            return true;
        }
        String string = c21660019pm.LIZJ.getString("flexible_inset_fragment");
        if (string != null && !a0.LJJJIL(string)) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(Uri uri) {
        String str = "";
        if (uri == null) {
            return "";
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String str2 = "unknown";
        if (a0.LJJJIL(scheme)) {
            scheme = "unknown";
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            str = authority;
        }
        if (!a0.LJJJIL(str)) {
            str2 = str;
        }
        int size = uri.getPathSegments().size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(scheme);
        sbLIZ.append("://");
        sbLIZ.append(str2);
        sbLIZ.append("/path_depth=");
        sbLIZ.append(size);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
