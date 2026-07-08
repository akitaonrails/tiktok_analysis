package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.03yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1020503yt {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() == 11) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, 3));
            sbLIZ.append('.');
            sbLIZ.append(str.substring(3, 6));
            sbLIZ.append('.');
            sbLIZ.append(str.substring(6, 9));
            sbLIZ.append('-');
            sbLIZ.append(str.substring(9));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static boolean LIZIZ(String str) {
        int i;
        int i2;
        try {
            Matcher matcher = PatternProtector.compile("[0-9]").matcher(str);
            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                sb.append(matcher.group());
            }
            String string = sb.toString();
            if (string.length() < 11) {
                return false;
            }
            String strSubstring = string.substring(0, 9);
            int length = strSubstring.length();
            int i3 = 0;
            int i4 = 0;
            int i5 = 10;
            while (i3 < length) {
                i4 += CastIntegerProtector.parseInt(String.valueOf(strSubstring.charAt(i3))) * i5;
                i3++;
                i5--;
            }
            int i6 = i4 % 11;
            if (i6 < 2) {
                i = 0;
            } else {
                i = 11 - i6;
            }
            if (i != CastIntegerProtector.parseInt(String.valueOf(string.charAt(9)))) {
                return false;
            }
            String strSubstring2 = string.substring(0, 10);
            int length2 = strSubstring2.length();
            int i7 = 0;
            int i8 = 0;
            int i9 = 11;
            while (i7 < length2) {
                i8 += CastIntegerProtector.parseInt(String.valueOf(strSubstring2.charAt(i7))) * i9;
                i7++;
                i9--;
            }
            int i10 = i8 % 11;
            if (i10 < 2) {
                i2 = 0;
            } else {
                i2 = 11 - i10;
            }
            if (i2 != CastIntegerProtector.parseInt(String.valueOf(string.charAt(10)))) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR32, th, null);
            return false;
        }
    }
}
