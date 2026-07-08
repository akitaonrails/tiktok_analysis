package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KQ {
    public static String LIZ(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strLIZIZ;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strLIZIZ = "null";
            } else {
                try {
                    strLIZIZ = obj.toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(name);
                    sbLIZ.append(e3.g);
                    sbLIZ.append(hexString);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strLIZIZ2), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("<");
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append(" threw ");
                    sbLIZ2.append(name2);
                    sbLIZ2.append(">");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            objArr[i2] = strLIZIZ;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
