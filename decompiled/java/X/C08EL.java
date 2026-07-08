package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08EL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EL {
    public static final String LIZ(Context context) throws Throwable {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        C2107108Nh.LIZ(bufferedReader, null);
                        C2107108Nh.LIZ(inputStreamReader, null);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                th = null;
                TryCatchGuardChecker.doCheck(th);
                C2107108Nh.LIZ(inputStreamReader, th);
                throw th;
            }
        }
    }
}
