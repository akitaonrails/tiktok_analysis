package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;

/* JADX INFO: renamed from: X.07hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934607hw {
    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        String strLIZIZ;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = UriProtector.parse(str);
        if (uri.getScheme() != null && uri.getHost() != null) {
            String path = uri.getPath();
            String query = uri.getQuery();
            if (!TextUtils.isEmpty(path) && path.charAt(path.length() - 1) == '/') {
                path = path.substring(0, path.length() - 1);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            sbLIZ.append(uri.getHost());
            sbLIZ.append(path);
            if (TextUtils.isEmpty(query)) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("?");
                sbLIZ2.append(query);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static String LIZJ(h hVar) {
        String strLJIL;
        k kVarLJJIIJZLJL;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hVar.size(); i++) {
            try {
                kVarLJJIIJZLJL = hVar.LJJIIJZLJL(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (kVarLJJIIJZLJL != null) {
                strLJIL = kVarLJJIIJZLJL.LJIL();
            } else {
                strLJIL = null;
            }
            if (!TextUtils.isEmpty(strLJIL)) {
                if (sb.length() > 0) {
                    sb.append("|");
                }
                sb.append(".*");
                sb.append(strLJIL);
            }
        }
        return sb.toString();
    }
}
