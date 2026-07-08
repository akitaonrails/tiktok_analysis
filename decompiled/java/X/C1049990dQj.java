package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049990dQj {
    public static C1050000dQk LIZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1050000dQk c1050000dQk = new C1050000dQk();
        String strLIZ = C1981907pZ.LIZ(str, jSONObject);
        Uri uri = UriProtector.parse(strLIZ);
        if (uri == null) {
            return null;
        }
        c1050000dQk.LIZ = strLIZ;
        if (!TextUtils.isEmpty(uri.getScheme())) {
            c1050000dQk.LIZJ = uri.getScheme();
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        c1050000dQk.LIZLLL = authority;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1050000dQk.LIZJ);
        sbLIZ.append("://");
        sbLIZ.append(c1050000dQk.LIZLLL);
        c1050000dQk.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = new HashMap();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, C1981907pZ.LIZ(UriProtector.getQueryParameter(uri, str2), jSONObject));
            }
        }
        c1050000dQk.LJ = map;
        return c1050000dQk;
    }
}
