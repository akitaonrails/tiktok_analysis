package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0825, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0825 {
    public static final String LIZ;

    static {
        String lowerCase = "overseaNoasanInnerFull".toLowerCase();
        String string = null;
        try {
            String[] strArrSplit = "4.2.1-rc.114".split("-");
            int i = 1;
            String str = strArrSplit.length == 2 ? "4.2.1-rc.114".split("-")[1] : "";
            String string2 = strArrSplit[0];
            if (string2 == null) {
                string2 = null;
            } else if (!Character.isDigit(string2.charAt(string2.length() - 1))) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = string2.charAt(0);
                while (i < string2.length()) {
                    char cCharAt2 = string2.charAt(i);
                    if (!Character.isDigit(string2.charAt(i)) && cCharAt2 != '.') {
                        break;
                    }
                    sb.append(cCharAt);
                    i++;
                    cCharAt = cCharAt2;
                }
                string2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            if (lowerCase.contains("oversea")) {
                sb2.append(".oversea");
            }
            if (lowerCase.contains("lite")) {
                sb2.append(".lite");
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("-");
                sb2.append(str);
            }
            string = sb2.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (TextUtils.isEmpty(string)) {
            LIZ = "4.2.1-rc.114.oversea";
        } else {
            LIZ = string;
        }
    }
}
