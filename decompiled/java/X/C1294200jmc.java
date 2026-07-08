package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0jmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294200jmc {
    public static String LIZ(File file) throws Throwable {
        Context appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (LIZJ(file)) {
            return file.getAbsolutePath();
        }
        Context applicationContext = null;
        if (appContext == null) {
            C1490830otl.LIZJ("DownloadDirUtils", "getValidDownloadPath", "Context is null");
            return null;
        }
        File fileY2 = C786410Ut5.y2(appContext, Environment.DIRECTORY_DOWNLOADS);
        if (LIZJ(fileY2)) {
            return fileY2.getAbsolutePath();
        }
        Context appContext2 = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext2 == null) {
            return null;
        }
        File file2 = C786450Ut9.LIZJ;
        if (file2 == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = appContext2.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
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
            file2 = C786450Ut9.LIZJ;
        }
        return file2.getAbsolutePath();
    }

    public static boolean LIZIZ(String str) {
        Context appContext;
        if (C2199751B7l.LJFF.LJIIIIZZ("save_path_security", 1) <= 0 || (appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()) == null || TextUtils.isEmpty(str) || str.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
            return true;
        }
        try {
            File fileX2 = C786410Ut5.x2(appContext);
            if (fileX2 != null) {
                if (str.startsWith(fileX2.getParent())) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZJ(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
            if (!file.isDirectory()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
