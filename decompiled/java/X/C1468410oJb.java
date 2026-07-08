package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468410oJb {
    public static String LIZ(C1468170oJD c1468170oJD) {
        String str;
        String str2 = c1468170oJD.LJJJLIIL;
        if (!TextUtils.isEmpty(c1468170oJD.i2)) {
            str2 = c1468170oJD.i2;
        }
        String str3 = "%26bti%3D";
        if (str2.indexOf("%26bti%3D") == -1) {
            str3 = "&bti=";
            str = "&";
        } else {
            str = "%26";
        }
        int iIndexOf = str2.indexOf(str3);
        String strSubstring = null;
        if (iIndexOf != -1) {
            try {
                int iIndexOf2 = str2.indexOf(str, str3.length() + iIndexOf);
                if (iIndexOf2 != -1 && iIndexOf2 > iIndexOf) {
                    strSubstring = str2.substring(iIndexOf + str3.length(), iIndexOf2);
                    return strSubstring;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strSubstring;
    }
}
