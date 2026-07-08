package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.0jmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293980jmG {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LIZIZ(C0VSP c0vsp) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0vsp));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Exception:");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(bufferedReader);
                throw th;
            }
        }
        LIZ(bufferedReader);
        return sb.toString();
    }

    public static long LIZJ(String str) {
        if (C1293990jmH.LIZ(str)) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isFile()) {
            return 0L;
        }
        return c0vsj.length() / 1024;
    }

    public static long LIZLLL(File file) {
        long jLIZLLL = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                jLIZLLL += LIZLLL(file2);
            }
            return jLIZLLL;
        }
        return file.length() / 1024;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0028
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LJ(java.lang.String r4) {
        /*
            X.0VSJ r3 = new X.0VSJ
            r3.<init>(r4)
            boolean r0 = r3.exists()
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Exception -> L19 java.lang.Throwable -> L28
            r1.<init>(r3)     // Catch: java.lang.Exception -> L19 java.lang.Throwable -> L28
            java.lang.String r2 = LIZIZ(r1)     // Catch: java.lang.Exception -> L17 java.lang.Throwable -> L22
            goto L1e
        L17:
            r0 = move-exception
            goto L1b
        L19:
            r0 = move-exception
            r1 = r2
        L1b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L22
        L1e:
            LIZ(r1)
            return r2
        L22:
            r0 = move-exception
            r2 = r1
        L24:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L24
        L2a:
            LIZ(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1293980jmG.LJ(java.lang.String):java.lang.String");
    }
}
