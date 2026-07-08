package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V36, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V36 {
    public static boolean LIZ = false;
    public static boolean LIZIZ = false;
    public static boolean LIZJ = false;
    public static int LIZLLL = -1;

    public static String LIZ(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length != 2) {
                str2 = "";
            } else {
                str2 = strArrSplit[1];
            }
            if (str.contains("{") && str.contains("}")) {
                str3 = str.split("\\{")[0];
                try {
                    String str4 = str.split("\\}")[1];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append(str4);
                    str = C2188811AlT.LIZIZ(sbLIZ);
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    TryCatchGuardChecker.doCheck(th);
                    return str;
                }
            } else {
                str3 = str;
            }
            if (str.contains(e3.g)) {
                String[] strArrSplit2 = str.split(e3.g);
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains(e3.h) && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String LIZIZ(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\tat ");
            sbLIZ.append(stackTraceElement.getClassName());
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append(e3.d);
            sb.append(stackTraceElement.getMethodName());
            sb.append(e3.h);
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }
}
