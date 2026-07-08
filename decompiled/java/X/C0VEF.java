package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMSceneModel;
import com.tiktok.strategycenterengineimpl.storagecenter.nativedb.TTMNativeDataManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0VEF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VEF {
    public static final C0VEF LIZ = new C0VEF();
    public static final ConcurrentHashMap<String, TTMSceneModel> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ;
    public static int LIZLLL;

    static {
        new AtomicLong(0L);
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

    public final synchronized void LIZIZ(Context context) {
        boolean z;
        long jCurrentTimeMillis;
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        SharedPreferences sharedPreferencesLIZJ2;
        if (LIZJ) {
            return;
        }
        TTMNativeDataManager tTMNativeDataManager = TTMNativeDataManager.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(context).getAbsolutePath());
        sbLIZ.append("/psp/");
        if (tTMNativeDataManager.initDB(C2188811AlT.LIZIZ(sbLIZ)) == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZJ = z;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = jCurrentTimeMillis2 / j;
        if (context != null && (sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(context, 0, "ttm_monitor")) != null) {
            jCurrentTimeMillis = sharedPreferencesLIZJ2.getLong("db_last_access_time", System.currentTimeMillis() / j);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() / j;
        }
        if (j2 - jCurrentTimeMillis > C2213421Bk4.LJFF) {
            tTMNativeDataManager.deleteAllData();
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() / j;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "ttm_monitor")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorPutLong = editorEdit.putLong("db_last_access_time", jCurrentTimeMillis3)) != null) {
            editorPutLong.apply();
        }
    }
}
