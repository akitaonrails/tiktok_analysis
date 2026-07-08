package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: X.081N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081N {
    public static C081O LIZ = C081O.UNINITED;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C081O LIZIZ() {
        /*
            X.081O r1 = X.C081N.LIZ
            X.081O r0 = X.C081O.UNINITED
            if (r1 == r0) goto L9
            X.081O r0 = X.C081N.LIZ
            return r0
        L9:
            java.lang.String r0 = "ro.hardware"
            java.lang.String r1 = X.C081A.LIZ(r0)
            if (r1 != 0) goto L29
            X.081O r2 = X.C081O.UNKNOWN
        L13:
            X.C081N.LIZ = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "hardware platform type: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 3
            X.C2207231Ba5.LIZ(r0)
            return r2
        L29:
            java.lang.String r0 = "qcom"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = "msm"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = "qsc"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = "sdm"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = "mt"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L54
            X.081O r2 = X.C081O.MTK
            goto L13
        L54:
            java.lang.String r0 = "kirin"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "hi"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "ro.hardware.egl"
            java.lang.String r0 = X.C081A.LIZ(r0)
            if (r0 == 0) goto L7b
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "adreno"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7b
        L78:
            X.081O r2 = X.C081O.QCOM
            goto L13
        L7b:
            r0 = 5
            X.C2207231Ba5.LIZ(r0)
            X.081O r2 = X.C081O.UNKNOWN
            goto L13
        L82:
            X.081O r2 = X.C081O.CHRY
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C081N.LIZIZ():X.081O");
    }

    public static int LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/sys/devices/system/cpu/cpu");
        sbLIZ.append(i);
        sbLIZ.append("/cpufreq/cpuinfo_max_freq");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(strLIZIZ, "r");
                String line = randomAccessFile.readLine();
                randomAccessFile.close();
                return CastIntegerProtector.parseInt(line);
            } catch (IOException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                return -1;
            } catch (NumberFormatException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return -1;
    }
}
