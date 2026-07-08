package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C294901Ch {
    public static final /* synthetic */ int LIZ = 0;

    public static C295001Ci LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String string = uri.buildUpon().clearQuery().toString();
            if (!u.LJJIIJZLJL(string, "/data/", false) && !u.LJJIIJZLJL(string, "local_file://", false)) {
                if (uri.getScheme() == null && uri.getHost() == null) {
                    return new C295001Ci(string, "", UriProtector.getQueryParameterNames(uri));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri.getScheme());
                sbLIZ.append("://");
                sbLIZ.append(uri.getHost());
                return new C295001Ci(C2188811AlT.LIZIZ(sbLIZ), uri.getPath(), UriProtector.getQueryParameterNames(uri));
            }
            return new C295001Ci(string, null, UriProtector.getQueryParameterNames(uri));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static C295001Ci LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LIZ(UriProtector.parse(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
