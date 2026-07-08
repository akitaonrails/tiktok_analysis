package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.07fK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918407fK {
    public static String LIZ(Uri uri) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMinisToken, uri:");
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
        List<String> pathSegments = uri.getPathSegments();
        String str = "";
        if (pathSegments == null) {
            return "";
        }
        if (pathSegments.size() <= 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getMinisToken, pathSegments invalid, token:");
            sbLIZ2.append("");
            C2188811AlT.LIZIZ(sbLIZ2);
            return "";
        }
        if (!"minis".equals(ListProtector.get(pathSegments, 0))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getMinisToken, bizIdentifier invalid, token:");
            sbLIZ3.append("");
            C2188811AlT.LIZIZ(sbLIZ3);
            return "";
        }
        String str2 = (String) C13LP.LJJJLZIJ(1, pathSegments);
        if (str2 != null) {
            str = str2;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getMinisToken, token:");
        sbLIZ4.append(str);
        C2188811AlT.LIZIZ(sbLIZ4);
        return str;
    }
}
