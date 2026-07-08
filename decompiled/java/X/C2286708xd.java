package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2286708xd {
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

    public static boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C2471909mP.LJJIIZI(str)) {
            return C2471909mP.LJJIIZ(null, str, false);
        }
        return new C0VSJ(str).exists();
    }

    public static void LIZLLL(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIZ(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        file.exists();
    }

    public static int LJIIJJI(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return 0;
        }
        int iLJIIJJI = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                iLJIIJJI += LJIIJJI(file2);
            } else if (file2.isFile() && file2.exists()) {
                iLJIIJJI++;
            }
        }
        return iLJIIJJI;
    }

    public static long LJIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return C2471909mP.LJIIIZ(str);
    }

    public static File LJIILIIL(Context context) {
        if (Environment.isExternalStorageEmulated()) {
            return LIZ(context);
        }
        File fileY2 = C786410Ut5.y2(context, null);
        if (fileY2 != null) {
            LJIIIZ(fileY2);
            return fileY2;
        }
        return LIZ(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILJJIL(X.C0VSP r6) throws java.lang.Throwable {
        /*
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L40
            r3.<init>(r6)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L40
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
        Lf:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
            r0 = -1
            if (r0 == r1) goto L1b
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
            goto Lf
        L1b:
            r3.close()     // Catch: java.io.IOException -> L1f
            goto L23
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L23:
            java.lang.String r0 = r5.toString()
            return r0
        L28:
            r0 = move-exception
            goto L2c
        L2a:
            r0 = move-exception
            r3 = r4
        L2c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L39
            r3.close()     // Catch: java.io.IOException -> L35
            return r4
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            return r4
        L3a:
            r1 = move-exception
            r4 = r3
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r1 = move-exception
            goto L3c
        L42:
            if (r4 == 0) goto L4c
            r4.close()     // Catch: java.io.IOException -> L48
            throw r1
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2286708xd.LJIILJJIL(X.0VSP):java.lang.String");
    }

    public static boolean LJIILL(String str) {
        if (!LIZJ(str)) {
            return false;
        }
        return C2471909mP.LJJII(str, true, null);
    }

    public static void LJIILLIIL(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJIILLIIL(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIZILJ(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                LJIILLIIL(file);
            } else {
                file.delete();
            }
        }
    }

    public static boolean LJIJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if ("mounted".equals(C786410Ut5.X3())) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (c0vsj.exists() && c0vsj.delete()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static void LJ(String str, String str2) throws Throwable {
        File[] fileArrListFiles;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length != 0) {
                C0VSJ c0vsj2 = new C0VSJ(str2);
                if (!c0vsj2.exists() || !c0vsj2.isDirectory()) {
                    c0vsj2.mkdirs();
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        String path = file.getPath();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(file.getName());
                        sbLIZ.append(File.separator);
                        LJ(path, C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        String path2 = file.getPath();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(file.getName());
                        LJIIJ(path2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }

    public static boolean LJFF(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new C0VSJ(str).exists()) {
            return false;
        }
        LJIIIIZZ(str2, true);
        return LJIIJ(str, str2);
    }

    public static boolean LJI(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (C2471909mP.LJJIIZI(str) && C2471909mP.LJJIIZ(null, str, false)) {
            LJIIIIZZ(str2, true);
            return C2471909mP.LIZJ(str, str2);
        }
        if (!new C0VSJ(str).exists()) {
            return false;
        }
        LJIIIIZZ(str2, true);
        return LJIIJ(str, str2);
    }

    public static void LJII(InputStream inputStream, C0VSV c0vsv) {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        c0vsv.write(bArr, 0, i);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LIZLLL(inputStream);
                LIZLLL(c0vsv);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZLLL(inputStream);
                LIZLLL(c0vsv);
                throw th;
            }
        }
        c0vsv.flush();
        LIZLLL(inputStream);
        LIZLLL(c0vsv);
    }

    public static void LJIIIIZZ(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                if (!z) {
                    c0vsj.mkdirs();
                    return;
                }
                try {
                    File parentFile = c0vsj.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    c0vsj.createNewFile();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006a A[Catch: IOException -> 0x0078, TryCatch #4 {IOException -> 0x0078, blocks: (B:39:0x0065, B:41:0x006a, B:43:0x006f, B:45:0x0074), top: B:87:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[Catch: IOException -> 0x0078, TryCatch #4 {IOException -> 0x0078, blocks: (B:39:0x0065, B:41:0x006a, B:43:0x006f, B:45:0x0074), top: B:87:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074 A[Catch: IOException -> 0x0078, TryCatch #4 {IOException -> 0x0078, blocks: (B:39:0x0065, B:41:0x006a, B:43:0x006f, B:45:0x0074), top: B:87:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d A[Catch: IOException -> 0x009b, TryCatch #16 {IOException -> 0x009b, blocks: (B:56:0x0088, B:58:0x008d, B:60:0x0092, B:62:0x0097), top: B:93:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[Catch: IOException -> 0x009b, TryCatch #16 {IOException -> 0x009b, blocks: (B:56:0x0088, B:58:0x008d, B:60:0x0092, B:62:0x0097), top: B:93:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097 A[Catch: IOException -> 0x009b, TryCatch #16 {IOException -> 0x009b, blocks: (B:56:0x0088, B:58:0x008d, B:60:0x0092, B:62:0x0097), top: B:93:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ab A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:70:0x00a6, B:72:0x00ab, B:74:0x00b0, B:76:0x00b5), top: B:84:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:70:0x00a6, B:72:0x00ab, B:74:0x00b0, B:76:0x00b5), top: B:84:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b5 A[Catch: IOException -> 0x00b9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:70:0x00a6, B:72:0x00ab, B:74:0x00b0, B:76:0x00b5), top: B:84:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r5 = 0
            java.lang.String r1 = "mounted"
            java.lang.String r0 = X.C786410Ut5.X3()     // Catch: java.lang.Exception -> Lbe
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lc2
            r11 = 0
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L5a java.io.FileNotFoundException -> L7d
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L5a java.io.FileNotFoundException -> L7d
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            java.nio.channels.FileChannel r6 = r4.getChannel()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5e java.io.FileNotFoundException -> L81
            java.nio.channels.FileChannel r11 = r3.getChannel()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.io.FileNotFoundException -> L46
            r7 = 0
            long r9 = r6.size()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.io.FileNotFoundException -> L46
            r6.transferTo(r7, r9, r11)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.io.FileNotFoundException -> L46
            r4.close()     // Catch: java.io.IOException -> L38
            r6.close()     // Catch: java.io.IOException -> L38
            r3.close()     // Catch: java.io.IOException -> L38
            if (r11 == 0) goto L3c
            r11.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3c:
            r0 = 1
            return r0
        L3e:
            r1 = move-exception
            r2 = r11
            r11 = r6
            goto La1
        L42:
            r0 = move-exception
            r2 = r11
            r11 = r6
            goto L60
        L46:
            r0 = move-exception
            r2 = r11
            r11 = r6
            goto L83
        L4a:
            r1 = move-exception
            r3 = r11
            goto L58
        L4d:
            r0 = move-exception
            r3 = r11
            goto L5f
        L50:
            r0 = move-exception
            r3 = r11
            goto L82
        L53:
            r1 = move-exception
            r3 = r11
            r4 = r11
            goto L58
        L57:
            r1 = move-exception
        L58:
            r2 = r11
            goto La1
        L5a:
            r0 = move-exception
            r3 = r11
            r4 = r11
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            r2 = r11
        L60:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L68
            r4.close()     // Catch: java.io.IOException -> L78
        L68:
            if (r11 == 0) goto L6d
            r11.close()     // Catch: java.io.IOException -> L78
        L6d:
            if (r3 == 0) goto L72
            r3.close()     // Catch: java.io.IOException -> L78
        L72:
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L78
            return r5
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            return r5
        L7d:
            r0 = move-exception
            r3 = r11
            r4 = r11
            goto L82
        L81:
            r0 = move-exception
        L82:
            r2 = r11
        L83:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L8b
            r4.close()     // Catch: java.io.IOException -> L9b
        L8b:
            if (r11 == 0) goto L90
            r11.close()     // Catch: java.io.IOException -> L9b
        L90:
            if (r3 == 0) goto L95
            r3.close()     // Catch: java.io.IOException -> L9b
        L95:
            if (r2 == 0) goto L9f
            r2.close()     // Catch: java.io.IOException -> L9b
            return r5
        L9b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9f:
            return r5
        La0:
            r1 = move-exception
        La1:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto La9
            r4.close()     // Catch: java.io.IOException -> Lb9
        La9:
            if (r11 == 0) goto Lae
            r11.close()     // Catch: java.io.IOException -> Lb9
        Lae:
            if (r3 == 0) goto Lb3
            r3.close()     // Catch: java.io.IOException -> Lb9
        Lb3:
            if (r2 == 0) goto Lbd
            r2.close()     // Catch: java.io.IOException -> Lb9
            throw r1
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbd:
            throw r1
        Lbe:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2286708xd.LJIIJ(java.lang.String, java.lang.String):boolean");
    }

    public static void LJIJI(File file, InterfaceC2287108xh<File, Boolean> interfaceC2287108xh) {
        File[] fileArrListFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJIJI(file2, interfaceC2287108xh);
                } else if (interfaceC2287108xh.apply(file2).booleanValue()) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIJJ(String str, InterfaceC2287108xh<File, Boolean> interfaceC2287108xh) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                LJIJI(file, interfaceC2287108xh);
            } else if (interfaceC2287108xh.apply(file).booleanValue()) {
                file.delete();
            }
        }
    }

    public static void LIZIZ(InterfaceC2286808xe interfaceC2286808xe, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            interfaceC2286808xe.LIZ(Boolean.FALSE);
        } else if (C2471909mP.LJJIIZI(str)) {
            C2471909mP.LJJIIZ(interfaceC2286808xe, str, z);
        } else {
            interfaceC2286808xe.LIZ(Boolean.valueOf(new C0VSJ(str).exists()));
        }
    }
}
