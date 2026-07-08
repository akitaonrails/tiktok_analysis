package X;

import android.app.Application;
import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108808Ny {
    public static final String[] LIZ = {"files/offlineX", "app_assets", "cache/gift_assets", "cache/feedcache"};

    public static long LIZLLL() {
        C1910207e0 c1910207e0;
        File fileLIZ;
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ == null || (fileLIZ = LIZ(contextLIZ)) == null || !fileLIZ.exists()) {
                c1910207e0 = new C1910207e0(1.0d, Long.MAX_VALUE, Long.MAX_VALUE);
            } else {
                StatFs statFs = new StatFs(fileLIZ.getPath());
                long jLLFFF = C2204961BRm.LLFFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KM6tb5ra2RTmClZC", null));
                long jLLIIII = C2204961BRm.LLIIII(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KM6tb5ra2RTmClZC", null));
                c1910207e0 = new C1910207e0((jLLFFF * 1.0d) / jLLIIII, jLLFFF, jLLIIII);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1910207e0 = new C1910207e0(1.0d, Long.MAX_VALUE, Long.MAX_VALUE);
        }
        return c1910207e0.LIZ;
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

    public static void LIZIZ(String str) throws Throwable {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        File fileLIZ = LIZ(contextLIZ);
        if (fileLIZ == null) {
            return;
        }
        String parent = fileLIZ.getParent();
        if (TextUtils.isEmpty(parent)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(parent);
        sbLIZ2.append("/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        for (String str2 : LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(str2);
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
            if (c0vsj.exists()) {
                LIZJ(c0vsj);
            }
        }
    }

    public static boolean LIZJ(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            LIZJ(file2);
        }
        return file.delete();
    }
}
