package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ikb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254510ikb {
    public static final C1254510ikb LIZ = new C1254510ikb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(957));

    public static boolean LIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (!C2431009fo.LIZJ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("http://");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return false;
            }
            for (String str2 : (Set) LIZIZ.getValue()) {
                if (!TextUtils.equals(uri.getHost(), str2)) {
                    String host = uri.getHost();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('.');
                    sbLIZ2.append(str2);
                    if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                    }
                }
                return true;
            }
            return false;
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("illegal char in url: ");
            sbLIZ3.append(str);
            C1720106oR.LIZ("AmazonDomainHelper", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
    }

    public static void LIZIZ(String str, C1254440ikU c1254440ikU) {
        Activity activityLIZLLL = C1537820q7Y.LIZLLL();
        if (activityLIZLLL != null) {
            LIZ.getClass();
            if (!C2431009fo.LIZJ(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("http://");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("amazon link open in browser ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            boolean zLIZIZ = C839050Wvn.LIZIZ(activityLIZLLL, str);
            if (c1254440ikU != null) {
                if (c1254440ikU.LIZ) {
                    C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                    String str2 = c1254440ikU.LIZIZ;
                    c1254430ikT.getClass();
                    C1254430ikT.LIZIZ(zLIZIZ ? 1 : 0, str2, true);
                    return;
                }
                C1254430ikT c1254430ikT2 = C1254430ikT.LIZ;
                String str3 = c1254440ikU.LIZIZ;
                c1254430ikT2.getClass();
                C1254430ikT.LIZLLL(zLIZIZ ? 1 : 0, str3, true);
            }
        }
    }
}
