package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.08KO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KO {
    public static String LIZ(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String str2;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    if (strValueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(strValueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 9 + name2.length());
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
