package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08ST, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ST {
    public static final /* synthetic */ int LIZ = 0;

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

    public static void LIZIZ(File file) {
        if (!file.isDirectory()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                File file2 = (File) c089e.next();
                if (file2.isDirectory()) {
                    LIZIZ(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    public static void LIZJ(Context context, String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".metadata");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("minis/");
            sbLIZ2.append(str);
            sbLIZ2.append("/meta/");
            sbLIZ2.append(strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(LIZ(context), C2188811AlT.LIZIZ(sbLIZ2));
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("deleteMetaData, absPath:");
            sbLIZ3.append(c0vsj.getAbsolutePath());
            sbLIZ3.append(", isExist:");
            sbLIZ3.append(c0vsj.exists());
            C2188811AlT.LIZIZ(sbLIZ3);
            if (!c0vsj.exists()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("deleteMetaData, minisMetaDataFile:");
                sbLIZ4.append(c0vsj.getAbsolutePath());
                sbLIZ4.append(" not exits");
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            boolean zDelete = c0vsj.delete();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("deleteMetaData, result:");
            sbLIZ5.append(zDelete);
            C2188811AlT.LIZIZ(sbLIZ5);
            return;
        }
        int i2 = C2187451AjH.LIZ;
    }

    public static void LIZLLL(Context context, String str, NetworkResponse networkResponse) {
        Object obj;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minis/");
            sbLIZ.append(str);
            sbLIZ.append("/meta");
            C0VSJ c0vsj = new C0VSJ(LIZ(context), C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                int i = C2187451AjH.LIZ;
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(".metadata");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ2));
            if (!c0vsj2.exists() && !c0vsj2.createNewFile()) {
                int i2 = C2187451AjH.LIZ;
                return;
            }
            String absolutePath = c0vsj2.getAbsolutePath();
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("writeMetaData, absPath:");
            sbLIZ3.append(absolutePath);
            sbLIZ3.append(", isExist:");
            sbLIZ3.append(c0vsj2.exists());
            C2188811AlT.LIZIZ(sbLIZ3);
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (networkResponse != null) {
                obj = networkResponse.data;
            } else {
                obj = null;
            }
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(obj);
            if (strLJI != null && strLJI.length() != 0) {
                long jLJJIII = C13SB.LJJIII(absolutePath, strLJI);
                if (jLJJIII == 0) {
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("writeMetaData, writeSize:");
                sbLIZ4.append(jLJJIII);
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("writeMetaData, content empty:");
            sbLIZ5.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ5);
            return;
        }
        int i4 = C2187451AjH.LIZ;
    }
}
