package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08E3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08E3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, Context context) {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\n");
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        bufferedReader.close();
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    bufferedReader.close();
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw th;
                }
            }
        }
        bufferedReader.close();
        inputStreamOpenRawResource.close();
        return sb.toString();
    }
}
