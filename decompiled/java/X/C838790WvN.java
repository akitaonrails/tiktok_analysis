package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838790WvN {
    public static String LIZ(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                str3 = (String) C838800WvO.LIZIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                for (String str5 : str3.split(";")) {
                    if (!TextUtils.isEmpty(str5)) {
                        String[] strArrSplit = str5.split("=");
                        if (strArrSplit.length >= 2 && (str4 = strArrSplit[0]) != null && str4.trim().equalsIgnoreCase(str2)) {
                            return strArrSplit[1];
                        }
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "";
        }
    }

    public static String LIZIZ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2 + "/";
    }
}
