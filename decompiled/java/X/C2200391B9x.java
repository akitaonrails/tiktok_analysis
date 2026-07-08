package X;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1B9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200391B9x {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ(String str) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LIZ(String str, Throwable th) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SafeModeCallback msg:");
            sbLIZ.append(str);
            sbLIZ.append(" throwable:");
            sbLIZ.append(th);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZIZ(String str, String str2) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            String strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SafeModeCallback msg:");
            sbLIZ.append(strJ4);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZLLL(String str, String str2) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            String strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg:");
            sbLIZ.append(strJ4);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
