package X;

import java.io.PrintStream;

/* JADX INFO: renamed from: X.13AC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AC {
    public static final EnumC1152990g6r LIZ;
    public static final C13AB LIZIZ;

    static {
        EnumC1152990g6r enumC1152990g6r;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC1152990g6r = EnumC1152990g6r.Stderr;
                    break;
                } else {
                    if (strArr[i].equalsIgnoreCase(property)) {
                        enumC1152990g6r = EnumC1152990g6r.Stdout;
                        break;
                    }
                    i++;
                }
            }
        } else {
            enumC1152990g6r = EnumC1152990g6r.Stderr;
        }
        LIZ = enumC1152990g6r;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        LIZIZ = (property2 == null || property2.isEmpty()) ? C13AB.INFO : property2.equalsIgnoreCase("DEBUG") ? C13AB.DEBUG : property2.equalsIgnoreCase("ERROR") ? C13AB.ERROR : property2.equalsIgnoreCase("WARN") ? C13AB.WARN : C13AB.INFO;
    }

    public static PrintStream LIZIZ() {
        return LIZ.ordinal() != 1 ? System.err : System.out;
    }

    public static void LIZJ(String str) {
        if (1 >= LIZIZ.LL) {
            PrintStream printStreamLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SLF4J(I): ");
            sbLIZ.append(str);
            printStreamLIZIZ.println(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZLLL(String str) {
        if (2 >= LIZIZ.LL) {
            PrintStream printStreamLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SLF4J(W): ");
            sbLIZ.append(str);
            printStreamLIZIZ.println(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZ(String str, Throwable th) {
        PrintStream printStreamLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SLF4J(E): ");
        sbLIZ.append(str);
        printStreamLIZIZ.println(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ().println("SLF4J(E): Reported exception:");
        th.printStackTrace(LIZIZ());
    }
}
