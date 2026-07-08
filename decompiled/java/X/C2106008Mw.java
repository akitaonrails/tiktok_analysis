package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106008Mw {
    public static long LIZ = -1;
    public static C2183741AdI LIZIZ;

    public static long LIZJ() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP("/proc/stat")), LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                String[] strArrSplit = line.split(" ");
                long j = Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]) + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[7]) + Long.parseLong(strArrSplit[8]);
                LIZ(bufferedReader);
                return j;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                LIZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static long LIZIZ() {
        int iMyPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(iMyPid);
            sbLIZ.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ))), LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                String line = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] strArrSplit = line.split(" ");
                long j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16]);
                LIZ(bufferedReader2);
                return j;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                TryCatchGuardChecker.doCheck(th);
                LIZ(bufferedReader);
                return -1L;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJFF("CommonMonitorUtil", "", th);
            }
        }
    }
}
