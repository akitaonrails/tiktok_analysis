package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Q0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q0 {
    public static SharedPreferences LIZ;

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

    public static SharedPreferences LJFF(Context context) {
        if (LIZ == null) {
            LIZ = context.getSharedPreferences("cold_boot_sp", 0);
        }
        return LIZ;
    }

    public static void LJI(Context context, int i) {
        LJFF(context).edit().putInt("key_gson_get_adapter_1", i).apply();
    }

    public static int LIZIZ(Context context, int i, String str) {
        try {
            return LJFF(context).getInt(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i;
        }
    }

    public static long LIZJ(Context context, String str, long j) {
        try {
            return LJFF(context).getLong(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    public static String LIZLLL(Context context, String str, String str2) {
        try {
            return LJFF(context).getString(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str2;
        }
    }

    public static boolean LJ(Context context, String str, boolean z) {
        try {
            return LJFF(context).getBoolean(str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return z;
        }
    }
}
