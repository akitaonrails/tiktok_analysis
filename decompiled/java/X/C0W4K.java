package X;

import android.os.Process;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: X.0W4K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4K {
    public static String LIZ;
    public static int LIZIZ;

    public static String LIZ() throws Throwable {
        String strTrim;
        BufferedReader bufferedReader;
        if (LIZ == null) {
            int iMyPid = LIZIZ;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                LIZIZ = iMyPid;
            }
            String str = null;
            BufferedReader bufferedReader2 = null;
            BufferedReader bufferedReader3 = null;
            if (iMyPid > 0) {
                try {
                    String str2 = "/proc/" + iMyPid + "/cmdline";
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new C0VSF(str2));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strTrim = null;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                }
                try {
                    String line = bufferedReader.readLine();
                    C0W3J.LJIIIIZZ(line);
                    strTrim = line.trim();
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    strTrim = null;
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    bufferedReader3 = bufferedReader;
                    C0W4L.LIZ(bufferedReader3);
                    throw th;
                }
                bufferedReader2 = bufferedReader;
                C0W4L.LIZ(bufferedReader2);
                str = strTrim;
            }
            LIZ = str;
        }
        return LIZ;
    }
}
