package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120108Sh {
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

    public static void LJ(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (file.isDirectory()) {
                        LJ(file2);
                    }
                }
            }
            file.delete();
        }
    }

    public static File LJFF(Context context) {
        File fileY2 = C786410Ut5.y2(context, "cloudMessage");
        if (fileY2 == null) {
            fileY2 = new C0VSJ(LIZ(context), "cloudMessage");
        }
        if (!fileY2.exists()) {
            fileY2.mkdir();
        }
        return fileY2;
    }

    public static boolean LJII(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            int length = fileArrListFiles.length;
            boolean z = true;
            for (int i = 0; i < length; i++) {
                if (!fileArrListFiles[i].isDirectory() ? !(!z || !fileArrListFiles[i].delete()) : !(!z || !LJII(fileArrListFiles[i].getAbsolutePath()))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z || !c0vsj.delete()) {
                return false;
            }
        }
        return true;
    }

    public static void LIZJ(String str, String... strArr) throws Throwable {
        CheckedOutputStream checkedOutputStream;
        C0VSV c0vsv;
        Closeable closeable;
        try {
            try {
                c0vsv = new C0VSV(new C0VSJ(str));
                try {
                    checkedOutputStream = new CheckedOutputStream(c0vsv, new CRC32());
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    checkedOutputStream = null;
                    closeable = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            checkedOutputStream = null;
            c0vsv = null;
            closeable = null;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(checkedOutputStream);
            try {
                for (String str2 : strArr) {
                    C0VSJ c0vsj = new C0VSJ(str2);
                    if (c0vsj.exists()) {
                        LIZIZ(c0vsj, "", zipOutputStream);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append("不存在！");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C2105408Mq.LIZ(zipOutputStream);
                C2105408Mq.LIZ(checkedOutputStream);
                C2105408Mq.LIZ(c0vsv);
            } catch (Exception e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            TryCatchGuardChecker.doCheck(th);
            C2105408Mq.LIZ(closeable);
            C2105408Mq.LIZ(checkedOutputStream);
            C2105408Mq.LIZ(c0vsv);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r7.equals("sd_package_cache") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7.equals("data_package_cache") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r7.equals("data_package_file") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LJI(java.lang.String r7, java.lang.String r8) {
        /*
            X.0VDB r0 = X.C0VDB.LIZIZ()
            r0.getClass()
            android.content.Context r2 = X.C0VDB.LJFF
            r7.getClass()
            int r0 = r7.hashCode()
            r6 = 5
            r5 = 4
            r4 = 3
            r3 = 2
            r1 = 1
            switch(r0) {
                case -1481211727: goto L25;
                case -1427366653: goto L3b;
                case -1301710629: goto L45;
                case -540898700: goto L4e;
                case 70125656: goto L57;
                case 1506669642: goto L61;
                default: goto L18;
            }
        L18:
            r7 = -1
        L19:
            r0 = 0
            if (r7 == r1) goto L78
            if (r7 == r3) goto L82
            if (r7 == r4) goto L8c
            if (r7 == r5) goto L6a
            if (r7 == r6) goto L96
            return r0
        L25:
            java.lang.String r0 = "data_package"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = LIZ(r2)
            java.io.File r0 = r0.getParentFile()
            r1.<init>(r0, r8)
            return r1
        L3b:
            java.lang.String r0 = "sd_package_file"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r7 = 1
            goto L19
        L45:
            java.lang.String r0 = "sd_package_cache"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L82
            goto L18
        L4e:
            java.lang.String r0 = "data_package_cache"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L8c
            goto L18
        L57:
            java.lang.String r0 = "sd_package"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            r7 = 4
            goto L19
        L61:
            java.lang.String r0 = "data_package_file"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L96
            goto L18
        L6a:
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = X.C786410Ut5.y2(r2, r0)
            java.io.File r0 = r0.getParentFile()
            r1.<init>(r0, r8)
            return r1
        L78:
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = X.C786410Ut5.y2(r2, r0)
            r1.<init>(r0, r8)
            return r1
        L82:
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = X.C786410Ut5.x2(r2)
            r1.<init>(r0, r8)
            return r1
        L8c:
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = X.C786410Ut5.w2(r2)
            r1.<init>(r0, r8)
            return r1
        L96:
            X.0VSJ r1 = new X.0VSJ
            java.io.File r0 = LIZ(r2)
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2120108Sh.LJI(java.lang.String, java.lang.String):X.0VSJ");
    }

    public static void LJIIJ(String str, String str2) throws Throwable {
        ZipOutputStream zipOutputStream;
        C0VSJ c0vsj = new C0VSJ(str);
        try {
            zipOutputStream = new ZipOutputStream(new C0VSV(str2));
            try {
                LJIIIZ(c0vsj, "", zipOutputStream);
                C2105408Mq.LIZ(zipOutputStream);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C2105408Mq.LIZ(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x00af
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(java.io.File r7, java.lang.String r8, java.util.zip.ZipOutputStream r9) {
        /*
            boolean r0 = r7.isDirectory()
            r6 = 0
            if (r0 == 0) goto L33
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r8)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r7.exists()
            if (r0 == 0) goto Lb8
            java.io.File[] r1 = r7.listFiles()
        L28:
            int r0 = r1.length
            if (r6 >= r0) goto Lb8
            r0 = r1[r6]
            LIZIZ(r0, r2, r9)
            int r6 = r6 + 1
            goto L28
        L33:
            boolean r0 = X.C792400V6o.LJIIIIZZ()
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "压缩："
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L4f:
            boolean r0 = r7.exists()
            if (r0 == 0) goto Lb8
            r2 = 0
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Laf
            r4.<init>(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> Laf
            java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r1.append(r8)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r1.append(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r2.<init>(r0)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r9.putNextEntry(r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r3]     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
        L7e:
            int r1 = r4.read(r2, r6, r3)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            r0 = -1
            if (r1 == r0) goto L89
            r9.write(r2, r6, r1)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> La7
            goto L7e
        L89:
            X.C2105408Mq.LIZ(r4)
            X.C2105408Mq.LIZ(r5)
            return
        L90:
            r1 = move-exception
            goto L94
        L92:
            r1 = move-exception
            r2 = r4
        L94:
            r4 = r2
            r2 = r5
            goto L9c
        L97:
            r0 = move-exception
            r5 = r2
            goto Lab
        L9a:
            r1 = move-exception
            r4 = r2
        L9c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La5
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            goto La9
        La7:
            r0 = move-exception
            r2 = r5
        La9:
            r5 = r2
            r2 = r4
        Lab:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Laf
            goto Lb1
        Laf:
            r0 = move-exception
            goto Lab
        Lb1:
            X.C2105408Mq.LIZ(r2)
            X.C2105408Mq.LIZ(r5)
            throw r0
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2120108Sh.LIZIZ(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    public static boolean LIZLLL(String str, String str2, String str3) throws Throwable {
        C0VSP c0vsp;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
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
            boolean zLJIIIIZZ = LJIIIIZZ(c0vsp, str2, str3);
            try {
                c0vsp.close();
                return zLJIIIIZZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return zLJIIIIZZ;
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

    public static boolean LJIIIIZZ(C0VSP c0vsp, String str, String str2) throws Throwable {
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

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0079
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIIZ(java.io.File r5, java.lang.String r6, java.util.zip.ZipOutputStream r7) {
        /*
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L59
            java.io.File[] r5 = r5.listFiles()
            java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r6)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r2.<init>(r0)
            r7.putNextEntry(r2)
            int r0 = r6.length()
            if (r0 != 0) goto L4a
            java.lang.String r4 = ""
        L2a:
            r3 = 0
        L2b:
            int r0 = r5.length
            if (r3 >= r0) goto L75
            r2 = r5[r3]
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r0 = r5[r3]
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIIIZ(r2, r0, r7)
            int r3 = r3 + 1
            goto L2b
        L4a:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r6)
            r0.append(r1)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r0)
            goto L2a
        L59:
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r6)
            r7.putNextEntry(r0)
            r1 = 0
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L79
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L79
        L67:
            int r1 = r2.read()     // Catch: java.lang.Throwable -> L76
            r0 = -1
            if (r1 == r0) goto L72
            r7.write(r1)     // Catch: java.lang.Throwable -> L76
            goto L67
        L72:
            X.C2105408Mq.LIZ(r2)
        L75:
            return
        L76:
            r0 = move-exception
            r1 = r2
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L79
            X.C2105408Mq.LIZ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2120108Sh.LJIIIZ(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }
}
