package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119508Sb {
    public static final Pattern LIZ = PatternProtector.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
    public static final Pattern LIZIZ = PatternProtector.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern LIZJ = PatternProtector.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static boolean LIZ(String str) {
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        if (str != null) {
            try {
                if (str.length() >= 7 && str.length() <= 15 && !str.equals("")) {
                    if (LIZ.matcher(str).matches()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    int iIndexOf3 = str.indexOf(46);
                    if (iIndexOf3 == -1 || str.charAt(0) == '-' || CastIntegerProtector.parseInt(str.substring(0, iIndexOf3)) > 255 || (iIndexOf = str.indexOf(46, (i = iIndexOf3 + 1))) == -1 || str.charAt(i) == '-' || CastIntegerProtector.parseInt(str.substring(i, iIndexOf)) > 255 || (iIndexOf2 = str.indexOf(46, (i2 = iIndexOf + 1))) == -1 || str.charAt(i2) == '-' || CastIntegerProtector.parseInt(str.substring(i2, iIndexOf2)) > 255) {
                        return false;
                    }
                    int i3 = iIndexOf2 + 1;
                    if (str.charAt(i3) == '-' || CastIntegerProtector.parseInt(str.substring(i3, str.length())) > 255) {
                        return false;
                    }
                    if (str.charAt(str.length() - 1) == '.') {
                        return false;
                    }
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        try {
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (LIZIZ.matcher(str).matches()) {
            return true;
        }
        try {
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (!LIZJ.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
