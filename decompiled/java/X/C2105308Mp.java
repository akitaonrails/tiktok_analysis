package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2105308Mp {
    public static String LIZ;

    public static long LIZ() {
        BufferedReader bufferedReader;
        int iMyPid = Process.myPid();
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(iMyPid);
            sbLIZ.append("/stat");
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ))), LSPassThroughRecordSizeConfig.DEFAULT);
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            String[] strArrSplit = line.split(" ");
            long j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]);
            C2105408Mq.LIZIZ(bufferedReader);
            return j;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(th);
            C2105408Mq.LIZIZ(bufferedReader2);
            return -1L;
        }
    }

    public static String LIZIZ(int i) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(i);
            sbLIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                LIZ = line;
                try {
                    bufferedReader.close();
                    return line;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return line;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
