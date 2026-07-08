package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.08EO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EO {
    public static String LIZ(Context context) {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open("pipo_starling.json");
                byte[] bArr = new byte[1024];
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i > 0) {
                        sb.append(new String(bArr, 0, i));
                    } else {
                        String string = sb.toString();
                        try {
                            inputStreamOpen.close();
                            return string;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return string;
                        }
                    }
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        return "";
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        return "";
                    }
                }
                return "";
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                    throw th3;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }
}
