package X;

import android.os.Process;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0X9F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9F {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0056
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(X.C0VSJ r5) {
        /*
            boolean r0 = r5.exists()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "template.js"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            return
        L15:
            long r3 = r5.length()
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L5e
            r1 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "r"
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L56
            r1 = 0
        L28:
            byte r0 = r3.readByte()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L2f
            goto L35
        L2f:
            int r1 = r1 + 1
            r0 = 4
            if (r1 < r0) goto L28
            goto L39
        L35:
            X.C08IQ.LIZ(r3)
            return
        L39:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "file start with 4 zero: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L53
            r1.append(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L53
            throw r2     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            r1 = r3
            goto L57
        L56:
            r0 = move-exception
        L57:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L56
            X.C08IQ.LIZ(r1)
            throw r0
        L5e:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "file size less than 4: "
            r1.append(r0)
            java.lang.String r0 = r5.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X9F.LIZIZ(X.0VSJ):void");
    }

    public static long LIZJ(File file) {
        if (file.isFile()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jLJIIIZ = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jLJIIIZ += LJIIIZ(file2);
            }
        }
        return jLJIIIZ;
    }

    public static void LIZLLL(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                throw new RuntimeException("create dir failed: path is a file");
            }
        } else if (!file.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create dir failed: ");
            sbLIZ.append(file.getPath());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LJ(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(", file:");
        sbLIZ.append(file.getAbsolutePath());
        C1553130qWF.LIZ("gecko-debug-tag", "delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", C786410Ut5.u3().toString(), C2188811AlT.LIZIZ(sbLIZ));
        return LJI(file);
    }

    public static boolean LJFF(File file) {
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!LJFF(new C0VSJ(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(java.io.File r6) {
        /*
            r5 = 1
            if (r6 == 0) goto L34
            boolean r0 = r6.exists()
            if (r0 == 0) goto L34
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L2c
            java.io.File[] r4 = r6.listFiles()
            if (r4 == 0) goto L2c
            int r3 = r4.length
            r2 = 1
            r1 = 0
        L18:
            if (r1 >= r3) goto L2a
            r0 = r4[r1]
            if (r2 == 0) goto L28
            boolean r0 = LJI(r0)
            if (r0 == 0) goto L28
            r2 = 1
        L25:
            int r1 = r1 + 1
            goto L18
        L28:
            r2 = 0
            goto L25
        L2a:
            if (r2 == 0) goto L33
        L2c:
            boolean r0 = r6.delete()
            if (r0 == 0) goto L33
            return r5
        L33:
            r5 = 0
        L34:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X9F.LJI(java.io.File):boolean");
    }

    public static long LJIIIZ(File file) {
        if (C2259908tJ.LIZIZ()) {
            long jLIZ = C2259908tJ.LIZ(file);
            if (jLIZ <= 0) {
                return LIZJ(file);
            }
            return jLIZ;
        }
        return LIZJ(file);
    }

    public static Pair LIZ(C0VSJ c0vsj, String str) throws Throwable {
        if (c0vsj.exists()) {
            try {
                String strLIZJ = C08IP.LIZJ(c0vsj);
                return new Pair(strLIZJ, Boolean.valueOf(str.equals(strLIZJ)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1553130qWF.LIZ("gecko-debug-tag", "check file failed:", c0vsj.getAbsolutePath(), e);
                return null;
            }
        }
        return null;
    }

    public static long LJII(String str, String str2) {
        long jLJIIIZ;
        C0VSJ c0vsj;
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File[] fileArrListFiles = new C0VSJ(new C0VSJ(c1551940qUK.LIZLLL.getRootDirectory(), str), str2).listFiles(new C0X9G());
        long j = 0;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                try {
                    C0VSJ c0vsj2 = new C0VSJ(file, "res.zip");
                    if (c0vsj2.exists()) {
                        c0vsj2.delete();
                    }
                    CastLongProtector.valueOf(file.getName());
                    c0vsj = new C0VSJ(file, "res");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jLJIIIZ = LJIIIZ(file);
                }
                if (c0vsj.exists()) {
                    jLJIIIZ = LJIIIZ(c0vsj);
                    j += jLJIIIZ;
                }
            }
        }
        return j;
    }

    public static String LJIIIIZZ(InputStream inputStream, C0VSV c0vsv) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c0vsv);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i != -1) {
                    bufferedOutputStream.write(bArr, 0, i);
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    bufferedOutputStream.flush();
                    byteArrayOutputStream.flush();
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    return string;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
