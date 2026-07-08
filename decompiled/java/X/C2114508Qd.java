package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114508Qd {
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

    public static boolean LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("..");
        sbLIZ.append(File.separator);
        return a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static final File LIZJ(File file, String str) {
        String path;
        if (file != null) {
            path = file.getPath();
        } else {
            path = null;
        }
        return LIZLLL(path, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File LIZLLL(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            if (r3 == 0) goto La
            int r0 = r3.length()     // Catch: java.io.IOException -> L4d
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1d
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L4d
            r0.<init>(r3, r4)     // Catch: java.io.IOException -> L4d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            return r0
        L1d:
            boolean r0 = LIZIZ(r3)     // Catch: java.io.IOException -> L4d
            if (r0 == 0) goto L24
            return r2
        L24:
            boolean r0 = LIZIZ(r4)     // Catch: java.io.IOException -> L4d
            if (r0 == 0) goto L2b
            return r2
        L2b:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L4d
            r0.<init>(r3, r4)     // Catch: java.io.IOException -> L4d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            java.io.File r1 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L4d
            r0.<init>(r3)     // Catch: java.io.IOException -> L4d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L4d
            boolean r0 = LJII(r1, r0)     // Catch: java.io.IOException -> L4d
            if (r0 == 0) goto L4c
            return r1
        L4c:
            return r2
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2114508Qd.LIZLLL(java.lang.String, java.lang.String):java.io.File");
    }

    public static final File LJ(File file, File file2) {
        try {
            File canonicalFile = file.getCanonicalFile().getCanonicalFile();
            if (LJII(canonicalFile, file2.getCanonicalFile().getCanonicalFile())) {
                return canonicalFile;
            }
            return null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final File LJFF(File file, String str) {
        return LJ(new File(str), file);
    }

    public static final boolean LJI(Context context, String str) throws IOException {
        File file = new File(str);
        try {
            File fileY2 = C786410Ut5.y2(context, null);
            if (fileY2 == null) {
                Intrinsics.LJIIL();
            }
            String parent = fileY2.getParent();
            if (parent == null) {
                Intrinsics.LJIIL();
            }
            String canonicalPath = new File(parent).getCanonicalPath();
            String canonicalPath2 = new File(context.getApplicationInfo().dataDir).getCanonicalPath();
            String canonicalPath3 = file.getCanonicalFile().getCanonicalFile().getCanonicalPath();
            boolean zLJJIIJZLJL = u.LJJIIJZLJL(canonicalPath3, canonicalPath, false) | u.LJJIIJZLJL(canonicalPath3, canonicalPath2, false);
            if (zLJJIIJZLJL) {
                File file2 = new File(C786410Ut5.y2(context, Environment.DIRECTORY_DCIM), "browser-photos");
                if (u.LJJIIJZLJL(canonicalPath3, new File(new File(LIZ(context), Environment.DIRECTORY_DCIM), "browser-photos").getCanonicalFile().getCanonicalFile().getCanonicalPath(), false)) {
                    return false;
                }
                if (u.LJJIIJZLJL(canonicalPath3, file2.getCanonicalFile().getCanonicalFile().getCanonicalPath(), false)) {
                    return false;
                }
            }
            return zLJJIIJZLJL;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static boolean LJII(File file, File file2) {
        boolean zEquals;
        boolean z = false;
        try {
            File file3 = new File(file2, "/");
            C2085708Fb c2085708FbLIZIZ = C08DM.LIZIZ(file);
            C2085708Fb c2085708FbLIZIZ2 = C08DM.LIZIZ(file3);
            if (Intrinsics.LJFF(c2085708FbLIZIZ.LIZ, c2085708FbLIZIZ2.LIZ) && c2085708FbLIZIZ.LIZ() >= c2085708FbLIZIZ2.LIZ()) {
                zEquals = c2085708FbLIZIZ.LIZIZ.subList(0, c2085708FbLIZIZ2.LIZ()).equals(c2085708FbLIZIZ2.LIZIZ);
            } else {
                zEquals = false;
            }
            z = zEquals & (!Intrinsics.LJFF(file, file2));
            return z;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static final boolean LJIIIIZZ(Context context, Uri uri) throws IOException {
        try {
            if (Intrinsics.LJFF(uri.getScheme(), "file") && uri.getPath() != null) {
                if (uri.getPath() == null) {
                    Intrinsics.LJIIL();
                }
                return !LJI(context, r0);
            }
            if (!Intrinsics.LJFF(uri.getScheme(), "content")) {
                return true;
            }
            return !LJIIIZ(context, uri);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static boolean LJIIIZ(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            int fd = parcelFileDescriptorOpenFileDescriptor.getFd();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/self/fd/");
            sbLIZ.append(fd);
            String canonicalPath = new File(C2188811AlT.LIZIZ(sbLIZ)).getCanonicalPath();
            String canonicalPath2 = new File(context.getApplicationInfo().dataDir).getCanonicalPath();
            String str = File.separator;
            if (!u.LJIIZILJ(canonicalPath2, str, false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(canonicalPath2);
                sbLIZ2.append(str);
                canonicalPath2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            return u.LJJIIJZLJL(canonicalPath, canonicalPath2, false);
        }
        throw new IOException("File descriptor is null");
    }
}
