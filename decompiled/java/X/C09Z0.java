package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.09Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Z0 {
    public static boolean LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static boolean LJ;

    public static String LJFF() {
        String strLJIIJ;
        String str = LIZIZ;
        if (str != null) {
            return str;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        return (contextLIZ == null || (strLJIIJ = LJIIJ(contextLIZ)) == null) ? "" : strLJIIJ;
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append('/');
        sbLIZ.append(LJ ? "MinisNativeRuntime/Library/Caches/minis_debug" : "MinisNativeRuntime/Library/Caches/minis");
        sbLIZ.append('/');
        sbLIZ.append(LIZJ);
        sbLIZ.append("/code");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append("/MinisNativeRuntime/Documents/");
        sbLIZ.append(LIZLLL);
        sbLIZ.append('/');
        sbLIZ.append(LIZJ);
        sbLIZ.append("/arch");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append('/');
        sbLIZ.append(LJ ? "MinisNativeRuntime/Library/Caches/minis_debug_pkgs" : "MinisNativeRuntime/Library/Caches/minis_pkgs");
        sbLIZ.append("/pkgs_config.json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append("/MinisNativeRuntime/Library/Caches/plugins");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append("/MinisNativeRuntime/Documents/");
        sbLIZ.append(LIZLLL);
        sbLIZ.append('/');
        sbLIZ.append(LIZJ);
        sbLIZ.append("/sandbox");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJFF());
        sbLIZ.append("/MinisNativeRuntime/Documents/");
        sbLIZ.append(LIZLLL);
        sbLIZ.append('/');
        sbLIZ.append(LIZJ);
        sbLIZ.append("/temp");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static String LJ(C19EG c19eg) {
        String strLJIIJ;
        if (LIZ) {
            strLJIIJ = LJFF();
        } else {
            strLJIIJ = LJIIJ(c19eg);
            if (strLJIIJ == null) {
                strLJIIJ = "";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIJ);
        sbLIZ.append("/MinisNativeRuntime/Library/Caches/minis_debug");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIJ(Context context) {
        File fileLIZ;
        String absolutePath = null;
        try {
            fileLIZ = LIZ(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fileLIZ = null;
        }
        if (fileLIZ != null) {
            try {
                absolutePath = fileLIZ.getAbsolutePath();
                return absolutePath;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return absolutePath;
    }

    public static String LIZJ(Context context, String str) {
        String strLJIIJ;
        if (LIZ) {
            strLJIIJ = LJFF();
        } else {
            strLJIIJ = LJIIJ(context);
            if (strLJIIJ == null) {
                strLJIIJ = "";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIJ);
        sbLIZ.append("/MinisNativeRuntime/Library/Caches/minis/");
        sbLIZ.append(str);
        sbLIZ.append("/code");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
