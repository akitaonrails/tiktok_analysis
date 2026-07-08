package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08SE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SE {
    public static boolean LIZIZ(File file) {
        boolean zLIZIZ;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isFile()) {
                    if (fileArrListFiles[i].canWrite()) {
                        zLIZIZ = fileArrListFiles[i].delete();
                    } else {
                        z = false;
                    }
                } else {
                    zLIZIZ = LIZIZ(fileArrListFiles[i]);
                }
                z &= zLIZIZ;
            }
        }
        return z & file.delete();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0038
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZJ(java.io.File r5) {
        /*
            java.lang.String r4 = "\n"
            if (r5 == 0) goto L40
            boolean r0 = r5.exists()
            if (r0 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            X.0VSF r0 = new X.0VSF     // Catch: java.lang.Throwable -> L38
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L38
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L38
        L1a:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L2d
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L29
            r3.append(r4)     // Catch: java.lang.Throwable -> L35
        L29:
            r3.append(r1)     // Catch: java.lang.Throwable -> L35
            goto L1a
        L2d:
            X.C2112008Pe.LIZ(r2)
            java.lang.String r0 = r3.toString()
            return r0
        L35:
            r0 = move-exception
            r1 = r2
            goto L39
        L38:
            r0 = move-exception
        L39:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L38
            X.C2112008Pe.LIZ(r1)
            throw r0
        L40:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SE.LIZJ(java.io.File):java.lang.String");
    }

    public static String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return LIZJ(new C0VSJ(str));
    }

    public static JSONArray LJ(File file) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        jSONArray.put(line);
                    } else {
                        C2112008Pe.LIZ(bufferedReader2);
                        return jSONArray;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    TryCatchGuardChecker.doCheck(th);
                    C2112008Pe.LIZ(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static JSONArray LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return LJ(new C0VSJ(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0VSV, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static void LJI(C0VSJ c0vsj, JSONArray jSONArray) {
        ?? bufferedWriter;
        if (c0vsj == null) {
            return;
        }
        c0vsj.getParentFile().mkdirs();
        try {
            if (jSONArray == null) {
                bufferedWriter = new C0VSV((File) c0vsj, false);
                try {
                    bufferedWriter.write("".getBytes());
                    bufferedWriter.flush();
                    bufferedWriter = bufferedWriter;
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2112008Pe.LIZ(bufferedWriter);
                        throw th2;
                    }
                }
            } else {
                bufferedWriter = new BufferedWriter(new C794210VDn((File) c0vsj, false));
                try {
                    new C08SF(bufferedWriter).LIZ(jSONArray);
                    bufferedWriter.flush();
                    bufferedWriter = bufferedWriter;
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = 0;
        }
        C2112008Pe.LIZ(bufferedWriter);
    }

    public static void LJII(C0VSJ c0vsj, JSONArray jSONArray) {
        BufferedWriter bufferedWriter;
        c0vsj.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new C794210VDn((File) c0vsj, false));
        } catch (Throwable th) {
            th = th;
            bufferedWriter = null;
        }
        try {
            new C08SF(bufferedWriter).LIZ(jSONArray);
            bufferedWriter.flush();
        } catch (Throwable th2) {
            th = th2;
            try {
                TryCatchGuardChecker.doCheck(th);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C2112008Pe.LIZ(bufferedWriter);
                throw th3;
            }
        }
        C2112008Pe.LIZ(bufferedWriter);
    }

    public static void LJIIIZ(File file, JSONObject jSONObject) {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new C794210VDn(file, false));
            try {
                new C08SF(bufferedWriter).LIZJ(jSONObject);
                bufferedWriter.flush();
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2112008Pe.LIZ(bufferedWriter);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
        C2112008Pe.LIZ(bufferedWriter);
    }

    public static void LIZ(File file, C0VSJ c0vsj, boolean z) throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2;
        C0VSP c0vsp;
        if (file.exists()) {
            if (c0vsj.exists() && !z) {
                return;
            }
            C0VSP c0vsp2 = null;
            C0VSV c0vsv3 = null;
            C0VSV c0vsv4 = null;
            c0vsp2 = null;
            C0VSP c0vsp3 = null;
            try {
                try {
                    c0vsj.getParentFile().mkdirs();
                    c0vsp = new C0VSP(file);
                    try {
                        c0vsv2 = new C0VSV(c0vsj, z);
                    } catch (Exception e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                    }
                }
                try {
                    byte[] bArr = new byte[8192];
                    int i = 0;
                    do {
                        int i2 = c0vsp.read(bArr);
                        if (i2 <= 0) {
                            break;
                        }
                        c0vsv2.write(bArr, 0, i2);
                        i += i2;
                    } while (i < Integer.MAX_VALUE);
                    C2112008Pe.LIZ(c0vsp);
                } catch (Exception e2) {
                    e = e2;
                    c0vsv3 = c0vsv2;
                    c0vsv2 = c0vsv3;
                    c0vsp3 = c0vsp;
                    TryCatchGuardChecker.doCheck(e);
                    C2112008Pe.LIZ(c0vsp3);
                } catch (Throwable th3) {
                    th = th3;
                    c0vsv4 = c0vsv2;
                    c0vsv = c0vsv4;
                    c0vsp2 = c0vsp;
                    TryCatchGuardChecker.doCheck(th);
                    C2112008Pe.LIZ(c0vsp2);
                    C2112008Pe.LIZ(c0vsv);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                c0vsv2 = null;
            } catch (Throwable th4) {
                th = th4;
                c0vsv = null;
            }
            C2112008Pe.LIZ(c0vsv2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIIIZZ(java.io.File r3, java.lang.String r4, boolean r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = r3.getParentFile()
            r0.mkdirs()
            r2 = 0
            X.0VSV r1 = new X.0VSV     // Catch: java.lang.Throwable -> L25
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L25
            byte[] r0 = r4.getBytes()     // Catch: java.lang.Throwable -> L22
            r1.write(r0)     // Catch: java.lang.Throwable -> L22
            r1.flush()     // Catch: java.lang.Throwable -> L22
            X.C2112008Pe.LIZ(r1)
            return
        L22:
            r0 = move-exception
            r2 = r1
            goto L26
        L25:
            r0 = move-exception
        L26:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L25
            X.C2112008Pe.LIZ(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SE.LJIIIIZZ(java.io.File, java.lang.String, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x0085
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIJ(java.io.File r6, java.lang.String r7, java.util.zip.ZipOutputStream r8) {
        /*
            boolean r0 = r6.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r6.isDirectory()
            r4 = 0
            if (r0 == 0) goto L61
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto L15
            return
        L15:
            java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r7)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r2.<init>(r0)
            r8.putNextEntry(r2)
            int r0 = r7.length()
            if (r0 != 0) goto L52
            java.lang.String r5 = ""
        L35:
            int r3 = r6.length
        L36:
            if (r4 >= r3) goto L81
            r2 = r6[r4]
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIIJ(r2, r0, r8)
            int r4 = r4 + 1
            goto L36
        L52:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r0)
            goto L35
        L61:
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r7)
            r8.putNextEntry(r0)
            r1 = 0
            X.0VSP r3 = new X.0VSP     // Catch: java.lang.Throwable -> L85
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L85
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L82
        L73:
            int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L82
            r0 = -1
            if (r0 == r1) goto L7e
            r8.write(r2, r4, r1)     // Catch: java.lang.Throwable -> L82
            goto L73
        L7e:
            X.C2112008Pe.LIZ(r3)
        L81:
            return
        L82:
            r0 = move-exception
            r1 = r3
            goto L86
        L85:
            r0 = move-exception
        L86:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L85
            X.C2112008Pe.LIZ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SE.LJIIJ(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }
}
