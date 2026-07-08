package X;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785440UrW {
    public static float LIZ = -999.0f;

    public static float LIZ(Context context) {
        int i;
        float integer;
        Resources system;
        int iN3;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            i = -999;
        }
        if (LIZ == -999.0f) {
            try {
                system = Resources.getSystem();
                iN3 = C786410Ut5.n3(system, "config_screenBrightnessSettingMaximum", "integer", "android");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (iN3 != 0) {
                integer = system.getInteger(iN3);
            } else {
                integer = 255.0f;
            }
            LIZ = integer;
        }
        float f = LIZ;
        if (i < 0 || f <= 0.0f) {
            return -999.0f;
        }
        return C13LZ.LIZLLL(i / f, 0.0f, 1.0f);
    }
}
