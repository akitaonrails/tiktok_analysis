package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.09Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2354809Ko {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:21:0x0052, B:23:0x005c, B:25:0x005f, B:28:0x007f, B:30:0x0083, B:32:0x0093, B:35:0x00aa), top: B:47:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LJ() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2354809Ko.LJ():X.0VSJ");
    }

    public static boolean LJI() {
        try {
            return "mounted".equals(C786410Ut5.X3());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
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

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public static File LIZLLL(Context context) {
        File fileX2 = C786410Ut5.x2(context);
        if (fileX2 == null) {
            return C786410Ut5.w2(context);
        }
        return fileX2;
    }

    public static File LJFF(Context context) {
        boolean zIsExternalStorageEmulated;
        try {
            zIsExternalStorageEmulated = Environment.isExternalStorageEmulated();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zIsExternalStorageEmulated = false;
        }
        if (zIsExternalStorageEmulated) {
            return LIZ(context);
        }
        File fileY2 = C786410Ut5.y2(context, null);
        if (fileY2 != null) {
            if (fileY2.exists()) {
                return fileY2;
            }
            fileY2.mkdirs();
            return fileY2;
        }
        return LIZ(context);
    }

    public static void LJII(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJII(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIIZZ(String str) {
        if (!TextUtils.isEmpty(str) && LJI()) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        }
    }

    public static C0VSJ LIZJ(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                if (!z) {
                    c0vsj.mkdirs();
                } else {
                    try {
                        File parentFile = c0vsj.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        c0vsj.createNewFile();
                        return c0vsj;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return c0vsj;
                    }
                }
            }
            return c0vsj;
        }
        return null;
    }
}
