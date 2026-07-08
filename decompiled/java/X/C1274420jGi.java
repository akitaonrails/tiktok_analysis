package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274420jGi {
    public static int LIZ = -1;

    public static String LIZ(Context context) {
        if (LIZ < 0) {
            try {
                LIZ = ((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isES3Supported fail, message");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ("DeviceUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int i = LIZ;
        if (i > 0) {
            String strValueOf = String.valueOf((i & (-65536)) >>> 16);
            String strValueOf2 = String.valueOf(LIZ & 65535);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strValueOf);
            sbLIZ2.append(e3.d);
            sbLIZ2.append(strValueOf2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return "2";
    }
}
