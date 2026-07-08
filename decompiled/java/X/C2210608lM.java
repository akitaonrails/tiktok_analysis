package X;

/* JADX INFO: renamed from: X.08lM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2210608lM {
    public static final String LIZ(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(exc.getMessage());
        StackTraceElement[] stackTrace = exc.getStackTrace();
        int i = 0;
        if (stackTrace != null && stackTrace.length != 0) {
            sb.append(" | ");
            int length = stackTrace.length;
            int length2 = stackTrace.length;
            int i2 = 0;
            while (i < length2) {
                int i3 = i2 + 1;
                sb.append(stackTrace[i]);
                if (i2 != length - 1) {
                    sb.append("\n");
                }
                i++;
                i2 = i3;
            }
        }
        return sb.toString();
    }
}
