package X;

import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxWhiteBoard;

/* JADX INFO: renamed from: X.0juu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1299340juu {
    public static int LJI;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String[] LIZLLL;
    public boolean LJ;
    public final LynxWhiteBoard LJFF;

    public static String LIZ() {
        String strJ4 = C786410Ut5.j4("%d", new Object[]{Integer.valueOf(LJI)});
        LJI++;
        return strJ4;
    }

    public C1299340juu(C1299360juw c1299360juw) {
        String str = c1299360juw.LIZ;
        String strLIZ = LIZ();
        this.LIZJ = strLIZ;
        this.LIZLLL = c1299360juw.LIZIZ;
        Boolean bool = c1299360juw.LJ;
        if (bool == null) {
            this.LJ = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_MULTI_JS_THREAD_BY_DEFAULT, false);
        } else {
            this.LJ = bool.booleanValue();
        }
        boolean z = c1299360juw.LIZLLL;
        this.LIZ = z;
        boolean z2 = c1299360juw.LIZJ;
        this.LIZIZ = z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxGroup init with name ");
        sbLIZ.append(str);
        sbLIZ.append(", id: ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(", enableV8: ");
        sbLIZ.append(z);
        sbLIZ.append(", canvas:");
        sbLIZ.append(z2);
        LynxLog.i("LynxGroup", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1299340juu(String str, String str2, String[] strArr, boolean z, boolean z2, Boolean bool, boolean z3) {
        this.LIZJ = str2;
        this.LIZLLL = strArr;
        if (bool == null) {
            this.LJ = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_MULTI_JS_THREAD_BY_DEFAULT, false);
        } else {
            this.LJ = bool.booleanValue();
        }
        if (z3) {
            this.LJFF = new LynxWhiteBoard();
        }
        this.LIZ = z2;
        this.LIZIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxGroup init with name ");
        sbLIZ.append(str);
        sbLIZ.append(", id: ");
        sbLIZ.append(str2);
        sbLIZ.append(", enableV8: ");
        sbLIZ.append(z2);
        sbLIZ.append(", canvas:");
        sbLIZ.append(z);
        LynxLog.i("LynxGroup", C2188811AlT.LIZIZ(sbLIZ));
    }
}
