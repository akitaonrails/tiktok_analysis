package X;

import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2160208dE {
    public static long[] LIZIZ() {
        File fileLIZJ;
        long[] jArr = new long[2];
        if (!"mounted".equals(C786410Ut5.X3()) || (fileLIZJ = C08SC.LIZJ(C792400V6o.LIZ)) == null) {
            return jArr;
        }
        StatFs statFs = new StatFs(fileLIZJ.getPath());
        long jLLI = C2204961BRm.LLI(statFs, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+chLNJHHzHU8JtPZW", null));
        long jLLFII = C2204961BRm.LLFII(statFs, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+chLNJHHzHU8JtPZW", null));
        long jLLF = C2204961BRm.LLF(statFs, new C0WZX("dzBzEg81UcPIWkVvRh6Lc1BpyWOLzbZ4hLihUtD+chLNJHHzHU8JtPZW", null));
        jArr[0] = ((jLLFII * jLLI) / 1024) / 1024;
        jArr[1] = ((jLLI * jLLF) / 1024) / 1024;
        return jArr;
    }

    public static String[] LIZ() throws Throwable {
        C0VSF c0vsf;
        BufferedReader bufferedReader;
        String[] strArr = {"", ""};
        BufferedReader bufferedReader2 = null;
        try {
            try {
                c0vsf = new C0VSF("/proc/cpuinfo");
                try {
                    bufferedReader = new BufferedReader(c0vsf, 8192);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            c0vsf = null;
        } catch (Throwable th2) {
            th = th2;
            c0vsf = null;
        }
        try {
            String[] strArrSplit = bufferedReader.readLine().split("\\s+");
            for (int i = 2; i < strArrSplit.length; i++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strArr[0]);
                sbLIZ.append(strArrSplit[i]);
                sbLIZ.append(" ");
                strArr[0] = C2188811AlT.LIZIZ(sbLIZ);
            }
            String[] strArrSplit2 = bufferedReader.readLine().split("\\s+");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strArr[1]);
            sbLIZ2.append(strArrSplit2[2]);
            strArr[1] = C2188811AlT.LIZIZ(sbLIZ2);
            C2105408Mq.LIZ(bufferedReader);
        } catch (IOException e3) {
            e = e3;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(e);
            C2105408Mq.LIZ(bufferedReader2);
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(th);
            C2105408Mq.LIZ(bufferedReader2);
            C2105408Mq.LIZ(c0vsf);
            throw th;
        }
        C2105408Mq.LIZ(c0vsf);
        return strArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x004f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String[] LIZJ() {
        /*
            java.lang.String r0 = "null"
            java.lang.String[] r5 = new java.lang.String[]{r0, r0, r0, r0}
            java.lang.String r0 = "/proc/version"
            r4 = 2
            r1 = 0
            X.0VSF r3 = new X.0VSF     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L4f
            r0 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r0)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L4f
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L49
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = r1.split(r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L49
            r1 = r0[r4]     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L49
            r0 = 0
            r5[r0] = r1     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L49
            goto L34
        L26:
            r0 = move-exception
            goto L31
        L28:
            r0 = move-exception
            r2 = r1
            goto L31
        L2b:
            r0 = move-exception
            r3 = r1
            goto L4b
        L2e:
            r0 = move-exception
            r3 = r1
            r2 = r3
        L31:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
        L34:
            X.C2105408Mq.LIZ(r2)
            X.C2105408Mq.LIZ(r3)
            r1 = 1
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r5[r1] = r0
            java.lang.String r0 = android.os.Build.MODEL
            r5[r4] = r0
            r1 = 3
            java.lang.String r0 = android.os.Build.DISPLAY
            r5[r1] = r0
            return r5
        L49:
            r0 = move-exception
            r1 = r2
        L4b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r0 = move-exception
            goto L4b
        L51:
            X.C2105408Mq.LIZ(r1)
            X.C2105408Mq.LIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2160208dE.LIZJ():java.lang.String[]");
    }
}
