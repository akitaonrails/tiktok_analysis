package X;

import android.net.Uri;
import kotlin.text.u;

/* JADX INFO: renamed from: X.081r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20509081r {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Uri uri) {
        String scheme;
        if (!uri.isHierarchical() || (scheme = uri.getScheme()) == null || !u.LJJIIJZLJL(scheme, "http", false) || uri.getHost() == null || uri.getPath() == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Uri uri) {
        String scheme;
        String host;
        if (uri == null || (scheme = uri.getScheme()) == null || (host = uri.getHost()) == null) {
            return null;
        }
        int port = uri.getPort();
        if (port != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(scheme);
            sbLIZ.append("://");
            sbLIZ.append(host);
            sbLIZ.append(':');
            sbLIZ.append(port);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(scheme);
        sbLIZ2.append("://");
        sbLIZ2.append(host);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
