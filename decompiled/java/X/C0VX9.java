package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VX9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VX9 {
    public static volatile C0VX9 LJI = null;
    public static String LJII = "default";
    public static volatile boolean LJIIIIZZ;
    public static String LJIIIZ;
    public Context LIZ;
    public C0VSJ LIZIZ;
    public Application LIZJ;
    public final long LJ;
    public long LIZLLL = System.currentTimeMillis();
    public final long LJFF = SystemClock.uptimeMillis();

    public static C0VX9 LIZIZ() {
        if (LJI == null) {
            synchronized (C0VX9.class) {
                try {
                    if (LJI == null) {
                        LJI = new C0VX9();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public static String LIZLLL() {
        C0VSJ c0vsj = new C0VSJ(LJFF(), "configs");
        if (!c0vsj.exists()) {
            C2112008Pe.LIZJ(c0vsj);
        }
        return c0vsj.getAbsolutePath();
    }

    public C0VX9() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LJ = jElapsedRealtime;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LIZLLL -= jElapsedRealtime - Process.getStartElapsedRealtime();
        }
    }

    public static long LIZJ() {
        return LIZIZ().LIZLLL;
    }

    public static Context LJ() {
        return LIZIZ().LIZ;
    }

    public static C0VSJ LJFF() {
        return LIZIZ().LIZIZ;
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

    public static C0VSJ LJI(Context context) {
        C0VSJ c0vsjLJFF = LJFF();
        if (c0vsjLJFF == null) {
            return C2112008Pe.LIZIZ(LIZ(context), "npth");
        }
        return c0vsjLJFF;
    }

    public static void LJIIIIZZ(Context context) {
        if (context != null) {
            C0VX9 c0vx9LIZIZ = LIZIZ();
            if (c0vx9LIZIZ.LIZJ == null) {
                if (context instanceof Application) {
                    c0vx9LIZIZ.LIZJ = (Application) context;
                } else {
                    c0vx9LIZIZ.LIZJ = (Application) C786410Ut5.N3(context);
                }
            }
            if (c0vx9LIZIZ.LIZ == null) {
                synchronized (c0vx9LIZIZ) {
                    try {
                        if (c0vx9LIZIZ.LIZ == null) {
                            c0vx9LIZIZ.LIZ = context;
                        }
                    } finally {
                    }
                }
            }
            if (c0vx9LIZIZ.LIZIZ == null) {
                synchronized (c0vx9LIZIZ) {
                    try {
                        if (c0vx9LIZIZ.LIZIZ == null) {
                            c0vx9LIZIZ.LIZIZ = C2112008Pe.LIZIZ(LIZ(context), "npth");
                        }
                    } finally {
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static void LJII(long j, long j2, long j3, String str) {
        String strJ3;
        if (LJIIIZ == null) {
            if (j != 0 && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("version_code", j);
                    jSONObject.put("update_version_code", j2);
                    jSONObject.put("version_name", str);
                    jSONObject.put("manifest_version_code", j3);
                    strJ3 = C786410Ut5.J3(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strJ3 = null;
                }
            } else {
                strJ3 = null;
            }
            LJIIIZ = strJ3;
            if (strJ3 != null) {
                NativeBridge.LJJJJLL(strJ3);
            }
        }
    }
}
