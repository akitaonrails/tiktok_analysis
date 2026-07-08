package X;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524690pmN {
    public static C1525120pn4 LIZ(String str) {
        return C1525150pn7.LIZ(600009, str, C786410Ut5.j4("invalid URL", Arrays.copyOf(new Object[0], 0))).LIZIZ();
    }

    public static C1525120pn4 LIZLLL(String str) {
        return C1525150pn7.LIZ(600005, str, "network argv error").LIZIZ();
    }

    public static C1525120pn4 LJ(String str) {
        return C1525150pn7.LIZ(10403, str, "unknown error on method " + str + " stack:" + LJFF(1, 5, new Throwable())).LIZIZ();
    }

    public static C1525120pn4 LIZIZ(String str, Throwable th) {
        return C1525150pn7.LIZ(10402, str, "native exception " + th + " stack:" + LJFF(0, 1, th)).LIZIZ();
    }

    public static C1525120pn4 LIZJ(String str, JSONObject jSONObject) {
        C1524700pmO c1524700pmO = new C1524700pmO(str, "ok");
        c1524700pmO.LIZIZ = jSONObject;
        return c1524700pmO.LIZIZ();
    }

    public static String LJFF(int i, int i2, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int length = i2 + i;
        if (length > stackTrace.length) {
            length = stackTrace.length;
        }
        if (i < length) {
            sb.append(stackTrace[i]);
            while (true) {
                i++;
                if (i >= length) {
                    break;
                }
                sb.append(" ");
                sb.append(stackTrace[i]);
            }
        }
        return sb.toString();
    }
}
