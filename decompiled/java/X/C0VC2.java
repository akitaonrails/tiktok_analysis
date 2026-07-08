package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VC2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC2 {
    public static C0VSJ LIZ;
    public static C0VSJ LIZIZ;
    public static C0VSJ LIZJ;
    public static C0VSJ LIZLLL;
    public static C0VSJ LJ;
    public static C0VSJ LJFF;

    public static synchronized File LIZIZ() {
        if (LIZIZ == null) {
            C0VSJ c0vsj = new C0VSJ(LJI(), "flush");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LIZIZ = c0vsj;
        }
        return LIZIZ;
    }

    public static synchronized File LIZJ() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VCY.LIZIZ("header", e);
        }
        if (LJFF == null) {
            C0VSJ c0vsj = new C0VSJ(LJI(), "header");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LJFF = c0vsj;
        }
        return LJFF;
    }

    public static synchronized File LIZLLL() {
        if (LJ == null) {
            C0VSJ c0vsj = new C0VSJ(LJI(), "log");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LJ = c0vsj;
        }
        return LJ;
    }

    public static synchronized File LJ() {
        if (LIZJ == null) {
            C0VSJ c0vsj = new C0VSJ(LJI(), "persistent");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            LIZJ = c0vsj;
        }
        return LIZJ;
    }

    public static synchronized File LJFF() {
        if (LIZ == null) {
            try {
                String strLIZ = C2162308dZ.LIZ(C0VC5.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ.replace(e3.d, "_").replace(":", "-"));
                sbLIZ.append(".bin");
                C0VSJ c0vsj = new C0VSJ(LJ(), C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj.exists()) {
                    c0vsj.createNewFile();
                }
                LIZ = c0vsj;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0VCY.LIZIZ("prepare PersistentFile fail.", e);
            }
        }
        return LIZ;
    }

    public static synchronized File LJI() {
        if (LIZLLL == null) {
            C0VSJ c0vsj = new C0VSJ(LIZ(C0VC5.LIZ), "apm6_sdk");
            LIZLLL = c0vsj;
            if (!c0vsj.exists()) {
                LIZLLL.mkdirs();
            }
        }
        return LIZLLL;
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
}
