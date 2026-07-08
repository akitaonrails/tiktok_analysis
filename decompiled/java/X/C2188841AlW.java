package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188841AlW {
    public static Context LIZ;
    public static Keva LIZIZ;
    public static Function0<Boolean> LIZJ = new C20344914j9();
    public static final C2188851AlX LIZLLL = new C2188851AlX(new C2192431ArJ(EnumC19365010pU.SINGLE_PROCESS, null, null, null, C20430814x0.LIZ));

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

    public static final void LIZIZ(String str) {
        Keva repo = Keva.getRepo("kevaUser");
        LIZIZ = repo;
        if (str == null) {
            if (repo == null) {
                repo = null;
            }
            repo.storeBoolean("unlogin", true);
        } else {
            if (repo == null) {
                repo = null;
            }
            repo.storeBoolean(str, true);
        }
    }

    public static final void LIZJ(String str) {
        Context context = LIZ;
        if (context == null) {
            context = null;
        }
        File[] fileArrListFiles = new C0VSJ(LIZ(context).getAbsolutePath(), str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    String name = file.getName();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(name);
                    sbLIZ.append(".lxi");
                    if (new C0VSJ(file.getAbsolutePath(), C2188811AlT.LIZIZ(sbLIZ)).exists()) {
                        Keva.getRepoWithPath(name, str, 1, false).clear();
                    } else {
                        Keva.getRepoWithPath(name, str, 0, false).clear();
                    }
                }
            }
        }
    }
}
