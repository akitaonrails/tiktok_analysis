package X;

import android.text.TextUtils;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.011l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2667011l {
    public static String LIZ(int i, String str) {
        if (!TextUtils.isEmpty(str) && i >= 0 && i < str.length()) {
            String strEncode = URLEncoder.encode(String.valueOf(str.charAt(i)));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, i));
            sbLIZ.append(strEncode);
            sbLIZ.append(str.substring(i + 1));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
