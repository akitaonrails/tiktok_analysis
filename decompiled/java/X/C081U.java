package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.081U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081U {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Uri uri) throws IOException {
        try {
            StringBuilder sb = new StringBuilder();
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
            if (host != null) {
                if (scheme != null) {
                    sb.append(scheme);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new IOException("#parseUrl fail uri=" + uri, th);
        }
    }
}
