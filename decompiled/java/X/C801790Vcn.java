package X;

/* JADX INFO: renamed from: X.0Vcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801790Vcn {
    public static final char[] LIZ = {'C', 'a', 'u', 's', 'e', 'd', ' ', 'b', 'y', ':', ' '};
    public static final char[] LIZIZ = {'S', 'u', 'p', 'p', 'r', 'e', 's', 's', 'e', 'd', ':', ' '};
    public static final char[] LIZJ = {'\t', 'a', 't', ' '};
    public static final char[] LIZLLL = {'\t', '.', '.', '.', ' '};
    public static final char[] LJ = {' ', 'm', 'o', 'r', 'e', '\n'};
    public static final char[] LJFF = {' ', 's', 'k', 'i', 'p', '\n'};

    public static void LIZ(C801780Vcm c801780Vcm, StackTraceElement[] stackTraceElementArr, int i) {
        char[] cArr = LIZJ;
        int i2 = 0;
        if (i > 256) {
            do {
                c801780Vcm.LIZJ(cArr);
                c801780Vcm.LIZIZ(stackTraceElementArr[i2]);
                c801780Vcm.LIZ('\n');
                i2++;
            } while (i2 < 128);
            c801780Vcm.LIZJ(LIZLLL);
            c801780Vcm.LIZ.LIZIZ(i - 256);
            c801780Vcm.LIZJ(LJFF);
            for (int i3 = i - 128; i3 < i; i3++) {
                c801780Vcm.LIZJ(cArr);
                c801780Vcm.LIZIZ(stackTraceElementArr[i3]);
                c801780Vcm.LIZ('\n');
            }
            return;
        }
        while (i2 < i) {
            c801780Vcm.LIZJ(cArr);
            c801780Vcm.LIZIZ(stackTraceElementArr[i2]);
            c801780Vcm.LIZ('\n');
            i2++;
        }
    }

    public static void LIZIZ(C801780Vcm c801780Vcm, char[] cArr, int i, Throwable th, Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        int length = stackTrace2.length - 1;
        int length2 = stackTrace.length;
        while (true) {
            length2--;
            if (length < 0 || length2 < 0 || !stackTrace2[length].equals(stackTrace[length2])) {
                break;
            } else {
                length--;
            }
        }
        int length3 = (stackTrace2.length - 1) - length;
        for (int i2 = 0; i2 < i; i2++) {
            c801780Vcm.LIZ.LIZ('\t');
        }
        c801780Vcm.LIZJ(cArr);
        c801780Vcm.LIZ.LJ(th);
        c801780Vcm.LIZ('\n');
        LIZ(c801780Vcm, stackTrace2, stackTrace2.length - length3);
        if (length3 != 0) {
            for (int i3 = 0; i3 < i; i3++) {
                c801780Vcm.LIZ.LIZ('\t');
            }
            c801780Vcm.LIZJ(LIZLLL);
            c801780Vcm.LIZ.LIZIZ(length3);
            c801780Vcm.LIZJ(LJ);
        }
        for (Throwable th3 : th.getSuppressed()) {
            LIZIZ(c801780Vcm, LIZIZ, i + 1, th3, th);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            LIZIZ(c801780Vcm, LIZ, i, cause, th);
        }
    }
}
