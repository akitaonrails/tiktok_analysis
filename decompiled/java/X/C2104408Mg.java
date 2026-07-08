package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2104408Mg {
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
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEhEpEcvSUUUuTBbKb0rY9lS0wn/ICOdX5M0OG6yhEtp09yh1k4g=", null))) {
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
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            sb = new StringBuilder();
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            LIZ = string;
            return string;
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:22:0x004a, B:27:0x005c, B:35:0x006d, B:36:0x006f, B:42:0x008b, B:43:0x009b, B:48:0x00c6, B:87:0x011f, B:92:0x012b, B:58:0x00d7, B:64:0x00e3, B:70:0x00ef, B:76:0x00f9, B:85:0x010c, B:34:0x006a), top: B:106:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010c A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:22:0x004a, B:27:0x005c, B:35:0x006d, B:36:0x006f, B:42:0x008b, B:43:0x009b, B:48:0x00c6, B:87:0x011f, B:92:0x012b, B:58:0x00d7, B:64:0x00e3, B:70:0x00ef, B:76:0x00f9, B:85:0x010c, B:34:0x006a), top: B:106:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2104408Mg.LIZIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZJ(Context context) {
        String strLIZIZ = LIZIZ(context);
        if (strLIZIZ == null || strLIZIZ.contains(":") || !strLIZIZ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }
}
