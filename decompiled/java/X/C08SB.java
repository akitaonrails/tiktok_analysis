package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08SB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SB {
    public static final String LIZ = File.separator;

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && !c0vsj.isDirectory()) {
                return false;
            }
            if (!c0vsj.exists()) {
                return c0vsj.mkdirs();
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LIZJ(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return file.delete();
        }
        for (File file2 : fileArrListFiles) {
            if (!LIZJ(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x0074
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean LIZ(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L90
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L8c
            r7 = 1
            if (r0 == 0) goto L21
            return r7
        L21:
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            r4 = 0
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L48
            int r0 = r5.read(r1, r6, r2)     // Catch: java.lang.Throwable -> L48
        L34:
            if (r0 <= 0) goto L3e
            r3.write(r1, r6, r0)     // Catch: java.lang.Throwable -> L48
            int r0 = r5.read(r1, r6, r2)     // Catch: java.lang.Throwable -> L48
            goto L34
        L3e:
            r3.flush()     // Catch: java.lang.Throwable -> L48
            r3.close()     // Catch: java.lang.Throwable -> L6c
            r5.close()     // Catch: java.lang.Throwable -> L8c
            return r7
        L48:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L4f
            throw r2     // Catch: java.lang.Throwable -> L4d
        L4d:
            r1 = move-exception
            goto L51
        L4f:
            r1 = move-exception
            r2 = r4
        L51:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r1 = move-exception
            goto L51
        L57:
            if (r2 == 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L5d
            goto L69
        L5d:
            r0 = move-exception
            goto L63
        L5f:
            r3.close()     // Catch: java.lang.Throwable -> L6a
            goto L69
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6a
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r1     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            goto L6d
        L6c:
            r0 = move-exception
        L6d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L71
        L71:
            r1 = move-exception
            r4 = r0
            goto L75
        L74:
            r1 = move-exception
        L75:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L80
            r5.close()     // Catch: java.lang.Throwable -> L7e
            goto L8a
        L7e:
            r0 = move-exception
            goto L84
        L80:
            r5.close()     // Catch: java.lang.Throwable -> L8c
            goto L8a
        L84:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8c
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L8c
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8b:
            return r6
        L8c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SB.LIZ(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006f A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #2 {all -> 0x007a, blocks: (B:5:0x0004, B:8:0x0010, B:15:0x0029, B:24:0x0044, B:26:0x0049, B:28:0x0054, B:46:0x0079, B:44:0x006f, B:45:0x0073, B:9:0x001a, B:13:0x0023, B:17:0x002d, B:19:0x0032, B:21:0x003a, B:23:0x0041, B:22:0x003d, B:41:0x0069), top: B:53:0x0004, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L10
            return r6
        L10:
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L7a
            X.0VSV r0 = new X.0VSV     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1.isFile()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = ""
            if (r0 == 0) goto L23
            goto L3d
        L23:
            java.io.File[] r3 = r1.listFiles()     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L2d
            r5.close()     // Catch: java.lang.Throwable -> L7a
            return r6
        L2d:
            int r2 = r3.length     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            r1 = 0
        L30:
            if (r1 >= r2) goto L41
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L5a
            boolean r0 = LJFF(r0, r4, r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L41
            int r1 = r1 + 1
            goto L30
        L3d:
            boolean r0 = LJFF(r1, r4, r5)     // Catch: java.lang.Throwable -> L5a
        L41:
            r5.flush()     // Catch: java.lang.Throwable -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L58
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L57
            LIZJ(r1)     // Catch: java.lang.Throwable -> L7a
        L57:
            return r6
        L58:
            r0 = 1
            return r0
        L5a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L65
        L5f:
            r1 = move-exception
            r2 = 0
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r1 = move-exception
            goto L61
        L67:
            if (r2 == 0) goto L6f
            r5.close()     // Catch: java.lang.Throwable -> L6d
            goto L79
        L6d:
            r0 = move-exception
            goto L73
        L6f:
            r5.close()     // Catch: java.lang.Throwable -> L7a
            goto L79
        L73:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L7a
        L79:
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SB.LJ(java.lang.String, java.lang.String):boolean");
    }

    public static boolean LIZLLL(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str) {
        if (bitmap != null && !bitmap.isRecycled() && str != null) {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (c0vsj.exists()) {
                    return true;
                }
                C0VSV c0vsv = new C0VSV(c0vsj);
                try {
                    bitmap.compress(compressFormat, 100, c0vsv);
                    c0vsv.flush();
                    c0vsv.close();
                    return true;
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                    }
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean LJFF(File file, String str, ZipOutputStream zipOutputStream) {
        try {
            if (file.isFile()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ)));
                C0VSP c0vsp = new C0VSP(file);
                try {
                    byte[] bArr = new byte[1024];
                    for (int i = c0vsp.read(bArr, 0, 1024); i > 0; i = c0vsp.read(bArr, 0, 1024)) {
                        zipOutputStream.write(bArr, 0, i);
                    }
                    c0vsp.close();
                    return true;
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                }
                            }
                        }
                    } catch (Throwable th3) {
                    }
                }
            } else {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return false;
                }
                for (File file2 : fileArrListFiles) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(file.getName());
                    sbLIZ2.append(LIZ);
                    LJFF(file2, C2188811AlT.LIZIZ(sbLIZ2), zipOutputStream);
                }
                return true;
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            return false;
        }
    }
}
