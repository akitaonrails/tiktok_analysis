package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;

/* JADX INFO: renamed from: X.08Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096908Jj {
    public static String LIZ() throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new C0VSF("/proc/self/cmdline"));
            } catch (Exception e) {
                e = e;
                bufferedReader = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            if (!TextUtils.isEmpty(line)) {
                String strTrim = line.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    try {
                        bufferedReader.close();
                        return strTrim;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return strTrim;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            if (bufferedReader != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(th);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    throw th;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
            throw th;
        }
        try {
            bufferedReader.close();
            return null;
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            return null;
        }
    }
}
