package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08Mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2105808Mu {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static Method LIZLLL;

    public static String LIZ(String str) {
        String str2;
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            if (LIZLLL == null) {
                LIZLLL = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            str2 = (String) LIZLLL.invoke(null, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getprop ");
            sbLIZ.append(str);
            Process processExec = runtime.exec(C2188811AlT.LIZIZ(sbLIZ));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                C2105408Mq.LIZ(bufferedReader2);
                return line;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2105408Mq.LIZ(bufferedReader);
                    return line;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2105408Mq.LIZ(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
