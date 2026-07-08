package X;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.09Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2354709Kn {
    public static Context LIZ;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:20:0x004f, B:22:0x0059, B:24:0x005c, B:27:0x007c, B:29:0x0080, B:31:0x0090, B:34:0x00a7), top: B:41:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILLIIL() {
        /*
            java.lang.String r11 = "mounted"
            r10 = 0
            r9 = 1
            java.lang.String r1 = X.C786410Ut5.X3()     // Catch: java.lang.Exception -> L16
            boolean r0 = r11.equals(r1)     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto Lac
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L16
            goto Laa
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.content.Context r1 = X.C2354709Kn.LIZ
            r8 = 0
            if (r1 == 0) goto Lb2
            java.lang.String r0 = "storage"
            java.lang.Object r7 = X.C786410Ut5.H2(r1, r0)
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "getVolumeList"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L44
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = "getVolumeState"
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L42
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r10] = r0     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r8 = r3.getMethod(r2, r1)     // Catch: java.lang.Exception -> L42
            goto L49
        L42:
            r0 = move-exception
            goto L46
        L44:
            r0 = move-exception
            r4 = r8
        L46:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            if (r7 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            if (r8 == 0) goto Lb2
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.Object r6 = r4.invoke(r7, r0)     // Catch: java.lang.Exception -> Lae
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Exception -> Lae
            if (r6 == 0) goto Lb2
            int r0 = r6.length     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto Lb2
            r0 = r6[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = "getPath"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.reflect.Method r5 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> Lae
            r0 = r6[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = "isEmulated"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> Lae
            if (r5 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            int r3 = r6.length     // Catch: java.lang.Exception -> Lae
            r2 = 0
        L7e:
            if (r2 >= r3) goto Lb2
            r1 = r6[r2]     // Catch: java.lang.Exception -> Lae
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch: java.lang.Exception -> Lae
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> Lae
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto La7
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> Lae
            java.lang.Object r1 = r5.invoke(r1, r0)     // Catch: java.lang.Exception -> Lae
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lae
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> Lae
            r0[r10] = r1     // Catch: java.lang.Exception -> Lae
            java.lang.Object r0 = r8.invoke(r7, r0)     // Catch: java.lang.Exception -> Lae
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto La7
            goto Lac
        La7:
            int r2 = r2 + 1
            goto L7e
        Laa:
            if (r0 == 0) goto Lb2
        Lac:
            r10 = 1
            return r10
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2354709Kn.LJIILLIIL():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.api.ICommonLogger] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.0VSV, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ() throws java.lang.Throwable {
        /*
            java.lang.String r4 = "file_path"
            r3 = 0
            java.lang.String r5 = X.C786410Ut5.X3()     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L10
            goto L22
        L10:
            return r0
        L11:
            r2 = move-exception
            goto L16
        L13:
            r2 = move-exception
            java.lang.String r5 = ""
        L16:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            com.ss.android.ugc.aweme.api.ICommonLogger r1 = X.C1110304Vx.LIZ()
            java.lang.String r0 = "isSdcardWritable catch error"
            r1.e(r4, r0, r2)
        L22:
            r7 = 0
            android.content.Context r0 = X.C2354709Kn.LIZ     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            java.io.File r0 = X.C786410Ut5.y2(r0, r7)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            java.lang.String r6 = "sd_can_write"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            r1.append(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            r1.append(r6)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            X.0VSJ r1 = LJ(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            if (r1 == 0) goto L87
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            if (r0 == 0) goto L87
            X.0VSV r2 = new X.0VSV     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            r2.<init>(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L70
            byte[] r0 = r6.getBytes()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6a
            r2.write(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6a
            r2.flush()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L6a
            r3 = 1
            r2.close()     // Catch: java.io.IOException -> L83
            goto L87
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r2 = r7
        L66:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6a
            goto L7d
        L6a:
            r1 = move-exception
            r7 = r2
        L6c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r1 = move-exception
            goto L6c
        L72:
            if (r7 == 0) goto L7c
            r7.close()     // Catch: java.io.IOException -> L78
            throw r1
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7c:
            throw r1
        L7d:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L83
            goto L87
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L87:
            com.ss.android.ugc.aweme.api.ICommonLogger r2 = X.C1110304Vx.LIZ()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "isSdcardWritable: "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", externalStorageState: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.e(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2354709Kn.LJIIZILJ():boolean");
    }

    public static C0VSJ LJIILIIL() {
        if (!LJIILLIIL() || !LJIIZILJ()) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(LJIIIZ(LIZ), "picture");
        LJI(c0vsj);
        return c0vsj;
    }

    public static C0VSJ LJIILJJIL() {
        if (!LJIILLIIL() || !LJIIZILJ()) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(LJIIIZ(LIZ), "video");
        LJI(c0vsj);
        return c0vsj;
    }

    public static long LJIILL() {
        if (LJIILLIIL()) {
            return LJIIIIZZ(C1948707kD.LIZ().getApplicationContext());
        }
        return 0L;
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

    public static C0VSJ LJ(String str) {
        if (str == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.getParentFile().getFreeSpace() < 1024) {
            return null;
        }
        if (!c0vsj.exists()) {
            try {
                c0vsj.createNewFile();
                return c0vsj;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c0vsj;
    }

    public static void LJI(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static long LJIIIIZZ(Context context) {
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(LIZ(context).getParent());
                return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkhTf0nYlA8ZrNDc=", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkhTf0nYlA8ZrNDc=", null));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1L;
    }

    public static File LJIIIZ(Context context) {
        File fileX2 = C786410Ut5.x2(context);
        if (fileX2 == null) {
            return C786410Ut5.w2(context);
        }
        return fileX2;
    }

    public static long LJIIJ(String str) {
        File[] fileArrListFiles;
        long jLJIIJ;
        long j = 0;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (LJIIZILJ() && !TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    jLJIIJ = file.length();
                } else if (file.isDirectory()) {
                    jLJIIJ = LJIIJ(file.getAbsolutePath());
                }
                j += jLJIIJ;
            }
            return j;
        }
        return 0L;
    }

    public static C0VSJ LJIIJJI(C0VSJ c0vsj) {
        if (LJIILLIIL() && LJIIZILJ() && !TextUtils.isEmpty("cache")) {
            File fileLJIIIZ = c0vsj;
            if (c0vsj == null) {
                fileLJIIIZ = LJIIIZ(LIZ);
            }
            C0VSJ c0vsj2 = new C0VSJ(fileLJIIIZ, "cache");
            LJI(c0vsj2);
            return c0vsj2;
        }
        return null;
    }

    public static C0VSJ LJIIL(String str) {
        if (LJIILLIIL() && LJIIZILJ() && !TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(LJIIIZ(LIZ), str);
            LJI(c0vsj);
            return c0vsj;
        }
        return null;
    }

    public static String LJIJ(String str) throws Throwable {
        C0VSF c0vsf;
        C0VSF c0vsf2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                c0vsf = new C0VSF(str);
            } catch (Exception e) {
                e = e;
                c0vsf = null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[1024];
                while (true) {
                    int i = c0vsf.read(cArr);
                    if (i != -1) {
                        sb.append(cArr, 0, i);
                    } else {
                        String string = sb.toString();
                        try {
                            c0vsf.close();
                            return string;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return string;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                if (c0vsf != null) {
                    try {
                        c0vsf.close();
                        return null;
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c0vsf2 = c0vsf;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        TryCatchGuardChecker.doCheck(th);
        if (c0vsf2 != null) {
            try {
                c0vsf2.close();
                throw th;
            } catch (IOException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
        throw th;
    }

    public static void LJIJI(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJIJI(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIJJ(String str) {
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
                LJIJI(file);
            } else {
                file.delete();
            }
        }
    }

    public static boolean LJIJJLI(String str) {
        if (TextUtils.isEmpty(str) || !LJIIZILJ()) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.delete()) {
            return false;
        }
        return true;
    }

    public static void LIZJ(String str, String str2) throws Throwable {
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
                        sbLIZ.append(File.separator);
                        sbLIZ.append(file.getName());
                        LIZJ(path, C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        String path2 = file.getPath();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(File.separator);
                        sbLIZ2.append(file.getName());
                        LJII(path2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }

    public static boolean LIZLLL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new C0VSJ(str).exists()) {
            return false;
        }
        LJFF(str2, true);
        return LJII(str, str2);
    }

    public static C0VSJ LJFF(String str, boolean z) {
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x006c A[Catch: IOException -> 0x007a, TryCatch #0 {IOException -> 0x007a, blocks: (B:43:0x0067, B:45:0x006c, B:47:0x0071, B:49:0x0076), top: B:87:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071 A[Catch: IOException -> 0x007a, TryCatch #0 {IOException -> 0x007a, blocks: (B:43:0x0067, B:45:0x006c, B:47:0x0071, B:49:0x0076), top: B:87:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[Catch: IOException -> 0x007a, TryCatch #0 {IOException -> 0x007a, blocks: (B:43:0x0067, B:45:0x006c, B:47:0x0071, B:49:0x0076), top: B:87:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0091 A[Catch: IOException -> 0x009f, TryCatch #12 {IOException -> 0x009f, blocks: (B:62:0x008c, B:64:0x0091, B:66:0x0096, B:68:0x009b), top: B:92:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0096 A[Catch: IOException -> 0x009f, TryCatch #12 {IOException -> 0x009f, blocks: (B:62:0x008c, B:64:0x0091, B:66:0x0096, B:68:0x009b), top: B:92:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009b A[Catch: IOException -> 0x009f, TryCatch #12 {IOException -> 0x009f, blocks: (B:62:0x008c, B:64:0x0091, B:66:0x0096, B:68:0x009b), top: B:92:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af A[Catch: IOException -> 0x00bd, TryCatch #13 {IOException -> 0x00bd, blocks: (B:76:0x00aa, B:78:0x00af, B:80:0x00b4, B:82:0x00b9), top: B:94:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4 A[Catch: IOException -> 0x00bd, TryCatch #13 {IOException -> 0x00bd, blocks: (B:76:0x00aa, B:78:0x00af, B:80:0x00b4, B:82:0x00b9), top: B:94:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b9 A[Catch: IOException -> 0x00bd, TRY_LEAVE, TryCatch #13 {IOException -> 0x00bd, blocks: (B:76:0x00aa, B:78:0x00af, B:80:0x00b4, B:82:0x00b9), top: B:94:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(java.lang.String r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            boolean r0 = LJIIZILJ()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            r10 = 0
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5a java.io.FileNotFoundException -> L7f
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5a java.io.FileNotFoundException -> L7f
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49 java.io.FileNotFoundException -> L4d
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49 java.io.FileNotFoundException -> L4d
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L5e java.io.FileNotFoundException -> L83
            java.nio.channels.FileChannel r10 = r3.getChannel()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d java.io.FileNotFoundException -> L41
            r6 = 0
            long r8 = r5.size()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d java.io.FileNotFoundException -> L41
            r5.transferTo(r6, r8, r10)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d java.io.FileNotFoundException -> L41
            r4.close()     // Catch: java.io.IOException -> L33
            r5.close()     // Catch: java.io.IOException -> L33
            r3.close()     // Catch: java.io.IOException -> L33
            if (r10 == 0) goto L37
            r10.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            r0 = 1
            return r0
        L39:
            r2 = move-exception
            r1 = r10
            r10 = r4
            goto La5
        L3d:
            r0 = move-exception
            r1 = r10
            r10 = r4
            goto L62
        L41:
            r0 = move-exception
            r1 = r10
            r10 = r4
            goto L87
        L45:
            r2 = move-exception
            r3 = r10
            r5 = r10
            goto L57
        L49:
            r0 = move-exception
            r3 = r10
            r5 = r10
            goto L60
        L4d:
            r0 = move-exception
            r3 = r10
            r5 = r10
            goto L85
        L51:
            r2 = move-exception
            r3 = r10
            r5 = r10
            goto L58
        L55:
            r2 = move-exception
            r5 = r10
        L57:
            r10 = r4
        L58:
            r1 = r5
            goto La5
        L5a:
            r0 = move-exception
            r3 = r10
            r5 = r10
            goto L61
        L5e:
            r0 = move-exception
            r5 = r10
        L60:
            r10 = r4
        L61:
            r1 = r5
        L62:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L6a
            r10.close()     // Catch: java.io.IOException -> L7a
        L6a:
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.io.IOException -> L7a
        L6f:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.io.IOException -> L7a
        L74:
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L7a
            return r2
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            return r2
        L7f:
            r0 = move-exception
            r3 = r10
            r5 = r10
            goto L86
        L83:
            r0 = move-exception
            r5 = r10
        L85:
            r10 = r4
        L86:
            r1 = r5
        L87:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto L8f
            r10.close()     // Catch: java.io.IOException -> L9f
        L8f:
            if (r5 == 0) goto L94
            r5.close()     // Catch: java.io.IOException -> L9f
        L94:
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.io.IOException -> L9f
        L99:
            if (r1 == 0) goto La3
            r1.close()     // Catch: java.io.IOException -> L9f
            return r2
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La3:
            return r2
        La4:
            r2 = move-exception
        La5:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto Lad
            r10.close()     // Catch: java.io.IOException -> Lbd
        Lad:
            if (r5 == 0) goto Lb2
            r5.close()     // Catch: java.io.IOException -> Lbd
        Lb2:
            if (r3 == 0) goto Lb7
            r3.close()     // Catch: java.io.IOException -> Lbd
        Lb7:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.io.IOException -> Lbd
            throw r2
        Lbd:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2354709Kn.LJII(java.lang.String, java.lang.String):boolean");
    }

    public static boolean LJIL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (!c0vsj.exists() || !c0vsj.renameTo(c0vsj2)) {
            return false;
        }
        return true;
    }

    public static boolean LJJ(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            C794210VDn c794210VDn = new C794210VDn(str, false);
            c794210VDn.write(str2);
            c794210VDn.flush();
            c794210VDn.close();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
