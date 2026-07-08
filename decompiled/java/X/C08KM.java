package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.08KM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KM {
    public static String LIZ(String str, Object... objArr) {
        int iIndexOf;
        String str2;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
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
                    String strValueOf2 = String.valueOf(string2);
                    if (strValueOf2.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(strValueOf2);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e);
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
        }
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) strValueOf, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
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
