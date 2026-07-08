package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080708Dd {
    public static final String LIZ(TypedInput typedInput) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(typedInput.in()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    bufferedReader.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return "";
        }
    }
}
