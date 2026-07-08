package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Q6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665110Q6z {
    public static final String LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '_') {
                    if (z2) {
                        sb.append(Character.toUpperCase(cCharAt));
                        z2 = false;
                    } else {
                        sb.append(cCharAt);
                    }
                } else {
                    z2 = true;
                }
            }
            str = sb.toString();
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
