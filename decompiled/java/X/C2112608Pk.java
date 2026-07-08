package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2112608Pk {
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

    public static void LIZIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        int length = fileArrListFiles.length;
        for (int i = 0; i < length; i++) {
            if (fileArrListFiles[i].isDirectory()) {
                LJIIIIZZ(fileArrListFiles[i].getAbsolutePath());
            } else if (fileArrListFiles[i].isFile()) {
                fileArrListFiles[i].delete();
            }
        }
    }

    public static long LIZJ(File file) {
        long length;
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0L;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = LJI(file2);
                } else if (file2.isFile()) {
                    length = file2.length();
                }
                j += length;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public static boolean LJ(String str) {
        if (!C2093608Ic.LJ(str)) {
            return new C0VSJ(str).exists();
        }
        return false;
    }

    public static String LJFF(Context context) {
        if (context != null) {
            String path = null;
            try {
                if (C786410Ut5.w2(context) != null) {
                    path = C786410Ut5.w2(context).getPath();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/data/data/");
                    sbLIZ.append(context.getPackageName());
                    sbLIZ.append("/cache/");
                    File dir = context.getDir(C2188811AlT.LIZIZ(sbLIZ), 0);
                    if (dir != null) {
                        path = dir.getPath();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!C2093608Ic.LJ(path)) {
                return path;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    public static long LJI(File file) {
        if (C2259908tJ.LIZIZ()) {
            long jLIZ = C2259908tJ.LIZ(file);
            if (jLIZ <= 0) {
                return LIZJ(file);
            }
            return jLIZ;
        }
        return LIZJ(file);
    }

    public static String LJII(Context context) {
        if (context != null) {
            String path = null;
            try {
                if (LIZ(context) != null) {
                    path = LIZ(context).getPath();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/data/data/");
                    sbLIZ.append(context.getPackageName());
                    sbLIZ.append("/files/");
                    File dir = context.getDir(C2188811AlT.LIZIZ(sbLIZ), 0);
                    if (dir != null) {
                        path = dir.getPath();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!C2093608Ic.LJ(path)) {
                return path;
            }
            throw new NullPointerException("Cannot Create Files Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    public static void LJIIIIZZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            int length = fileArrListFiles.length;
            for (int i = 0; i < length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    LJIIIIZZ(fileArrListFiles[i].getAbsolutePath());
                } else {
                    fileArrListFiles[i].delete();
                }
            }
            c0vsj.delete();
        }
    }

    public static boolean LIZLLL(String str, String str2, String str3) throws Throwable {
        C0VSP c0vsp;
        if (C2093608Ic.LJ(str) || C2093608Ic.LJ(str2) || C2093608Ic.LJ(str3)) {
            return false;
        }
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zLJIIIZ = LJIIIZ(c0vsp, str2, str3);
            try {
                c0vsp.close();
                return zLJIIIZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return zLJIIIZ;
            }
        } catch (Exception e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return false;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static boolean LJIIIZ(C0VSP c0vsp, String str, String str2) throws Throwable {
        C0VSV c0vsv = null;
        try {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    try {
                        c0vsp.close();
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
                C0VSV c0vsv2 = new C0VSV(new C0VSJ(c0vsj, str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = c0vsp.read(bArr);
                        if (i != -1) {
                            c0vsv2.write(bArr, 0, i);
                        } else {
                            c0vsv2.flush();
                            c0vsv2.close();
                            c0vsp.close();
                            try {
                                c0vsp.close();
                                return true;
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                return true;
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    c0vsv = c0vsv2;
                } catch (Throwable th) {
                    th = th;
                    c0vsv = c0vsv2;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv != null) {
                        try {
                            c0vsv.close();
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    try {
                        c0vsp.close();
                        throw th;
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        throw th;
                    }
                }
            } catch (Exception e6) {
                e = e6;
            }
            TryCatchGuardChecker.doCheck(e);
            if (c0vsv != null) {
                try {
                    c0vsv.close();
                } catch (Exception e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
            }
            try {
                c0vsp.close();
                return false;
            } catch (Exception e8) {
                TryCatchGuardChecker.doCheck(e8);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
