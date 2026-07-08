package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.08KK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KK {
    public static String LIZ(String str, Object... objArr) {
        int iIndexOf;
        String strLIZIZ;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                strLIZIZ = String.valueOf(obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj.getClass().getName());
                sbLIZ.append('@');
                sbLIZ.append(Integer.toHexString(System.identityHashCode(obj)));
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                Logger logger = Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings");
                Level level = Level.WARNING;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Exception during lenientFormat for ");
                sbLIZ2.append(strLIZIZ2);
                logger.log(level, C2188811AlT.LIZIZ(sbLIZ2), (Throwable) e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("<");
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append(" threw ");
                sbLIZ3.append(e.getClass().getName());
                sbLIZ3.append(">");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            objArr[i2] = strLIZIZ;
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
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
