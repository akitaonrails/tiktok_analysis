package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VY4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY4 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new StackTraceElement("", "", "", 0);
    }

    public static String LIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            LIZLLL(th, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                printWriter.close();
                return "";
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                printWriter.close();
                throw th3;
            }
        }
    }

    public static void LIZIZ(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(e3.d);
        sb.append(stackTraceElement.getMethodName());
        sb.append(e3.h);
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
    }

    public static void LIZLLL(Throwable th, PrintWriter printWriter) {
        boolean z;
        if (th != null) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            setNewSetFromMap.add(th);
            printWriter.println(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 384) {
                z = true;
            } else {
                z = false;
            }
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (z && i2 > 256) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("\t... skip ");
                        sbLIZ.append((stackTrace.length - i2) - 128);
                        sbLIZ.append(" lines");
                        printWriter.println(C2188811AlT.LIZIZ(sbLIZ));
                        break;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("\tat ");
                    sbLIZ2.append(stackTraceElement);
                    printWriter.println(C2188811AlT.LIZIZ(sbLIZ2));
                    i2++;
                    i++;
                } else if (z) {
                    break;
                }
            }
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("\tat ");
                sbLIZ3.append(stackTrace[length2]);
                printWriter.println(C2188811AlT.LIZIZ(sbLIZ3));
            }
            for (Throwable th2 : th.getSuppressed()) {
                LIZJ(th2, printWriter, "Suppressed: ", "\t", setNewSetFromMap, 128);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                LIZJ(cause, printWriter, "Caused by: ", "", setNewSetFromMap, 128);
            }
        }
    }

    public static void LIZJ(Throwable th, PrintWriter printWriter, String str, String str2, Set set, int i) {
        boolean z;
        if (set.contains(th)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\t[CIRCULAR REFERENCE:");
            sbLIZ.append(th);
            sbLIZ.append(e3.f);
            printWriter.println(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > i) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        sbLIZ2.append(th);
        printWriter.println(C2188811AlT.LIZIZ(sbLIZ2));
        int length = stackTrace.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (z && i3 > i) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("\t... skip ");
                    sbLIZ3.append((stackTrace.length - i3) - (i / 2));
                    sbLIZ3.append(" lines");
                    printWriter.println(C2188811AlT.LIZIZ(sbLIZ3));
                    break;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("\tat ");
                sbLIZ4.append(stackTraceElement);
                printWriter.println(C2188811AlT.LIZIZ(sbLIZ4));
                i3++;
                i2++;
            } else if (z) {
                break;
            }
        }
        for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("\tat ");
            sbLIZ5.append(stackTrace[length2]);
            printWriter.println(C2188811AlT.LIZIZ(sbLIZ5));
        }
        for (Throwable th2 : th.getSuppressed()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str2);
            sbLIZ6.append("\t");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            int i4 = i / 2;
            if (i4 <= 10) {
                i4 = 10;
            }
            LIZJ(th2, printWriter, "Suppressed: ", strLIZIZ, set, i4);
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            return;
        }
        int i5 = i / 2;
        if (i5 <= 10) {
            i5 = 10;
        }
        LIZJ(cause, printWriter, "Caused by: ", str2, set, i5);
    }
}
