package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2200521BAk {
    public static final /* synthetic */ int LIZ = 0;

    static {
        int i = C1BBD.LIZ;
    }

    public static String LIZ(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(simpleName);
            sbLIZ.append(":");
            sbLIZ.append(message);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ.length() > 40) {
                return strLIZIZ.substring(0, 40);
            }
            return strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static C2200671BAz LIZJ(int i, EnumC2200651BAx enumC2200651BAx) {
        try {
            C1BBB c1bbbLJIJJLI = C2200671BAz.LJIJJLI();
            c1bbbLJIJJLI.LJFF(i);
            if (!enumC2200651BAx.equals(EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED)) {
                c1bbbLJIJJLI.LIZLLL();
                C2200671BAz.LJJI((C2200671BAz) c1bbbLJIJJLI.LLILLJJLI, enumC2200651BAx);
            }
            return (C2200671BAz) c1bbbLJIJJLI.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C2200661BAy LIZIZ(C1BAX c1bax, int i, C19885612rG c19885612rG, String str, EnumC2200651BAx enumC2200651BAx) {
        try {
            C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
            c1bb7LJIJJLI.LJI(c19885612rG.LIZ);
            String str2 = c19885612rG.LIZJ;
            c1bb7LJIJJLI.LIZLLL();
            C1BB1.LJJI((C1BB1) c1bb7LJIJJLI.LLILLJJLI, str2);
            int i2 = c19885612rG.LIZIZ;
            if (i2 != 0) {
                c1bb7LJIJJLI.LIZLLL();
                C1BB1.LJJII((C1BB1) c1bb7LJIJJLI.LLILLJJLI, i2);
            }
            if (c1bax != null) {
                c1bb7LJIJJLI.LJFF(c1bax);
            }
            if (str != null) {
                c1bb7LJIJJLI.LIZLLL();
                C1BB1.LJJ((C1BB1) c1bb7LJIJJLI.LLILLJJLI, str);
            }
            C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
            c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
            c2200641BAwLJJ.LJII(i);
            if (!enumC2200651BAx.equals(EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED)) {
                c2200641BAwLJJ.LIZLLL();
                C2200661BAy.LJJIII((C2200661BAy) c2200641BAwLJJ.LLILLJJLI, enumC2200651BAx);
            }
            return (C2200661BAy) c2200641BAwLJJ.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
