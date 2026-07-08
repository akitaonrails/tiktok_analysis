package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584760Mwc {
    public static final String LIZ(String str, String str2) {
        if (!TextUtils.equals("homepage_hot", str) && !TextUtils.equals("homepage_follow", str)) {
            return "";
        }
        return str2;
    }

    public static final Map<String, String> LIZIZ(String str, String str2) {
        HashMap map = new HashMap();
        String strLIZ = LIZ(str, str2);
        if (strLIZ != null && strLIZ.length() != 0) {
            map.put("from_group_id", strLIZ);
        }
        return map;
    }
}
