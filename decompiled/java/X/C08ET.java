package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.08ET, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ET {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, String str) throws Throwable {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str2 = new String(bArr, StandardCharsets.UTF_8);
                C2107108Nh.LIZ(inputStreamOpen, null);
                return str2;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamOpen, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
