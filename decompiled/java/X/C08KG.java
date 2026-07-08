package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08KG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KG {
    public static String LIZ(Throwable th) {
        try {
            int i = 0;
            String strLIZIZ = "";
            for (Object obj : a0.LJJLIIIJILLIZJL(LIZIZ(th), new String[]{"\n"}, 0, 6)) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (2 > i) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(str);
                        sbLIZ.append('\n');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return strLIZIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "";
        }
    }

    public static final String LIZIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }
}
