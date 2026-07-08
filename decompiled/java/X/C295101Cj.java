package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C295101Cj {
    public static final /* synthetic */ int LIZ = 0;

    public static C295201Ck LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String string = uri.buildUpon().clearQuery().toString();
            if (!u.LJJIIJZLJL(string, "/data/", false) && !u.LJJIIJZLJL(string, "local_file://", false)) {
                String str = "";
                if (uri.getScheme() == null && uri.getHost() == null) {
                    return new C295201Ck(string, "", UriProtector.getQueryParameterNames(uri));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                sbLIZ.append(scheme);
                sbLIZ.append("://");
                String host = uri.getHost();
                if (host != null) {
                    str = host;
                }
                sbLIZ.append(str);
                return new C295201Ck(C2188811AlT.LIZIZ(sbLIZ), uri.getPath(), UriProtector.getQueryParameterNames(uri));
            }
            return new C295201Ck(string, null, UriProtector.getQueryParameterNames(uri));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
