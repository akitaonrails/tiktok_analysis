package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: X.09bU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2404209bU {
    public static Properties LIZ;

    public static String LIZ() {
        InputStream inputStreamOpen;
        Context context = C792400V6o.LIZ;
        Object obj = null;
        if (LIZ == null) {
            LIZ = new Properties();
            try {
                inputStreamOpen = C786410Ut5.N3(context).getAssets().open("slardar.properties");
                try {
                    LIZ.load(inputStreamOpen);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ = null;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2105408Mq.LIZ(inputStreamOpen);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamOpen = null;
            }
            C2105408Mq.LIZ(inputStreamOpen);
        }
        try {
            Properties properties = LIZ;
            if (properties != null && properties.containsKey("release_build")) {
                obj = LIZ.get("release_build");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return String.valueOf(obj);
    }
}
