package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: X.0jj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291980jj2 implements Closeable {
    public final HttpURLConnection LL;

    public final String LIZ() {
        boolean z = false;
        try {
            try {
                if (this.LL.getResponseCode() / 100 == 2) {
                    z = true;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (z) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to fetch ");
            sbLIZ.append(this.LL.getURL());
            sbLIZ.append(". Failed with ");
            sbLIZ.append(this.LL.getResponseCode());
            sbLIZ.append("\n");
            sbLIZ.append(LIZIZ(this.LL));
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1292050jj9.LIZJ("get error failed ", e2);
            return e2.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.disconnect();
    }

    public C1291980jj2(HttpURLConnection httpURLConnection) {
        this.LL = httpURLConnection;
    }

    public static String LIZIZ(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th;
                }
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
