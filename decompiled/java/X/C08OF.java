package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08OF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OF {
    public static final Set<String> LIZ = new HashSet();

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

    public static void LIZIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static synchronized boolean LIZJ(Context context) {
        if (TextUtils.isEmpty("standalone_fileinfo")) {
            return false;
        }
        Set<String> set = LIZ;
        if (((HashSet) set).contains("standalone_fileinfo")) {
            return true;
        }
        try {
            LoadSoLancet.LIZJ("standalone_fileinfo");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("standalone_fileinfo");
            LoadSoLancet.LJ(jUptimeMillis, "standalone_fileinfo");
            LoadSoLancet.LIZLLL(jUptimeMillis, "standalone_fileinfo");
            LoadSoLancet.LIZIZ("standalone_fileinfo");
            ((HashSet) set).add("standalone_fileinfo");
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            if (context != null && LIZ(context) != null) {
                C0VSJ c0vsj = new C0VSJ(LIZ(context), "libso");
                if (c0vsj.exists() || c0vsj.mkdirs() || c0vsj.exists()) {
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, System.mapLibraryName("standalone_fileinfo"));
                    if (c0vsj2.exists()) {
                        c0vsj2.delete();
                    }
                    if (LIZLLL(context, c0vsj2) != null) {
                        return false;
                    }
                    try {
                        System.load(c0vsj2.getAbsolutePath());
                        ((HashSet) LIZ).add("standalone_fileinfo");
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return false;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public static String LIZLLL(Context context, C0VSJ c0vsj) {
        InputStream inputStream;
        C09NU c09nu;
        C0VSV c0vsv;
        C0VSV c0vsv2 = null;
        try {
            c09nu = new C09NU(new C0VSJ(context.getApplicationInfo().sourceDir));
            try {
                String strMapLibraryName = System.mapLibraryName("standalone_fileinfo");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib/");
                String strSubstring = Build.CPU_ABI;
                sbLIZ.append(strSubstring);
                sbLIZ.append("/");
                sbLIZ.append(strMapLibraryName);
                ZipEntry entry = c09nu.getEntry(C2188811AlT.LIZIZ(sbLIZ));
                if (entry == null) {
                    int iIndexOf = strSubstring.indexOf(45);
                    if (iIndexOf > 0) {
                        strSubstring = strSubstring.substring(0, iIndexOf);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("lib/");
                    sbLIZ2.append(strSubstring);
                    sbLIZ2.append("/");
                    sbLIZ2.append(strMapLibraryName);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    entry = c09nu.getEntry(strLIZIZ);
                    if (entry == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("library entry not found in apk: ");
                        sbLIZ3.append(strLIZIZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        LIZIZ(c09nu);
                        return strLIZIZ2;
                    }
                }
                if (!c0vsj.createNewFile() && !c0vsj.exists()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cannot create ");
                    sbLIZ4.append(c0vsj.getAbsolutePath());
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    LIZIZ(c09nu);
                    return strLIZIZ3;
                }
                inputStream = c09nu.getInputStream(entry);
                try {
                    c0vsv = new C0VSV(c0vsj);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i > 0) {
                            c0vsv.write(bArr, 0, i);
                        } else {
                            c0vsj.setReadable(true, false);
                            c0vsj.setExecutable(true, false);
                            LIZIZ(c0vsv);
                            LIZIZ(inputStream);
                            LIZIZ(c09nu);
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0vsv2 = c0vsv;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(th.getClass().getSimpleName());
                        sbLIZ5.append(": ");
                        sbLIZ5.append(th.getMessage());
                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                        LIZIZ(c0vsv2);
                        LIZIZ(inputStream);
                        LIZIZ(c09nu);
                        return strLIZIZ4;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        LIZIZ(c0vsv2);
                        LIZIZ(inputStream);
                        LIZIZ(c09nu);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            c09nu = null;
        }
    }
}
