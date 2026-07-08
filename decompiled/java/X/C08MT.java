package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08MT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MT {
    public static String LIZ;

    public static String LIZ(Context context) {
        BufferedReader bufferedReader;
        StringBuilder sb;
        String str = LIZ;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String string = null;
        try {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnuxeu5Rue0okfw/2LoxkbgoLCQ=", null))) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    String str2 = runningAppProcessInfo.processName;
                    LIZ = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/cmdline");
                bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ)), "iso-8859-1"));
                try {
                    sb = new StringBuilder();
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    LIZ = string;
                    return string;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        while (true) {
            int i = bufferedReader.read();
            if (i <= 0) {
                break;
            }
            sb.append((char) i);
            LIZ = string;
            return string;
        }
        string = sb.toString();
        bufferedReader.close();
        LIZ = string;
        return string;
    }
}
