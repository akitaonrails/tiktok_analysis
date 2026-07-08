package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V2X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2X {
    public static String LIZ(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
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
            if (i > 30) {
                break;
            }
        }
        return sb.toString();
    }
}
