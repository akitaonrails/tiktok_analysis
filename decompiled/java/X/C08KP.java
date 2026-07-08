package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08KP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KP {
    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(name);
            sbLIZ.append(e3.g);
            sbLIZ.append(hexString);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strLIZIZ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("<");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" threw ");
            sbLIZ2.append(name2);
            sbLIZ2.append(">");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static String LIZ(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(LIZIZ(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(LIZIZ(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
