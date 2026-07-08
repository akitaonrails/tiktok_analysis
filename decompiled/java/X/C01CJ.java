package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CJ {
    public static final String LIZ(String str) {
        Object c098200Yq;
        if (str == null) {
            return "";
        }
        Uri uriLJ = LJ(str);
        if (!u.LJJIIJZLJL(str, "http", false) && !u.LJJIIJZLJL(str, "lynxview", false)) {
            String strLIZJ = LIZJ(uriLJ, "url");
            if (strLIZJ == null) {
                strLIZJ = LIZJ(uriLJ, "surl");
            }
            if (LIZLLL(strLIZJ)) {
                return LIZ(strLIZJ);
            }
            String strLIZJ2 = LIZJ(uriLJ, "channel");
            String strLIZJ3 = LIZJ(uriLJ, "bundle");
            if (LIZLLL(strLIZJ2) && LIZLLL(strLIZJ3)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lynxview://");
                sbLIZ.append(strLIZJ2);
                sbLIZ.append('/');
                sbLIZ.append(strLIZJ3);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        if (!uriLJ.isHierarchical()) {
            return uriLJ.toString();
        }
        try {
            c098200Yq = uriLJ.buildUpon().clearQuery().toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String string = uriLJ.toString();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = string;
        }
        return (String) c098200Yq;
    }

    public static final String LIZIZ(String str) {
        Uri uriLJ = LJ(str);
        String strLIZJ = LIZJ(uriLJ, "url");
        if (strLIZJ == null) {
            String strLIZJ2 = LIZJ(uriLJ, "surl");
            if (strLIZJ2 != null) {
                return strLIZJ2;
            }
            return str;
        }
        return strLIZJ;
    }

    public static final boolean LIZLLL(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final Uri LJ(String str) {
        Object c098200Yq;
        if (str == null) {
            return Uri.EMPTY;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        return (Uri) c098200Yq;
    }

    public static final String LIZJ(Uri uri, String str) {
        Object c098200Yq;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }
}
