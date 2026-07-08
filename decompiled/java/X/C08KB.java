package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08KB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KB {
    public static void LIZ(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LIZIZ(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            } else {
                return sb.toString();
            }
        }
    }
}
