package X;

/* JADX INFO: renamed from: X.0Vcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801780Vcm {
    public static final char[] LIZIZ = {'(', 'N', 'a', 't', 'i', 'v', 'e', ' ', 'M', 'e', 't', 'h', 'o', 'd', ')'};
    public static final char[] LIZJ = {'(', 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ', 'S', 'o', 'u', 'r', 'c', 'e', ')'};
    public static final char[] LIZLLL = {'(', 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ', 'S', 'o', 'u', 'r', 'c', 'e', ':'};
    public final C801730Vch LIZ;

    public C801780Vcm(C801730Vch c801730Vch) {
        this.LIZ = c801730Vch;
    }

    public final void LIZ(char c) {
        this.LIZ.LIZ(c);
    }

    public final void LIZIZ(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        boolean zIsNativeMethod = stackTraceElement.isNativeMethod();
        if (className.length() != 0) {
            this.LIZ.LIZLLL(className);
        }
        this.LIZ.LIZ('.');
        if (methodName.length() != 0) {
            this.LIZ.LIZLLL(methodName);
        }
        if (zIsNativeMethod) {
            LIZJ(LIZIZ);
            return;
        }
        if (fileName != null) {
            if (stackTraceElement.getLineNumber() >= 0) {
                this.LIZ.LIZ('(');
                if (fileName.length() != 0) {
                    this.LIZ.LIZLLL(fileName);
                }
                this.LIZ.LIZ(':');
                this.LIZ.LIZIZ(lineNumber);
                LIZ(')');
                return;
            }
            this.LIZ.LIZ('(');
            if (fileName.length() != 0) {
                this.LIZ.LIZLLL(fileName);
            }
            LIZ(')');
            return;
        }
        if (lineNumber >= 0) {
            LIZJ(LIZLLL);
            this.LIZ.LIZIZ(lineNumber);
            LIZ(')');
            return;
        }
        LIZJ(LIZJ);
    }

    public final void LIZJ(char[] cArr) {
        if (cArr.length != 0) {
            this.LIZ.LIZ.LJ(cArr);
        }
    }
}
