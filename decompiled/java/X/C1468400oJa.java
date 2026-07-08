package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468400oJa {
    public static AudioManager LIZ = null;
    public static long LIZIZ = 0;
    public static int LIZJ = 3;

    public static int LIZ() {
        if (Build.VERSION.SDK_INT < 29 || LIZJ(C1475000oUE.LIZ)) {
            return -1;
        }
        try {
            return LIZ.getAllowedCapturePolicy();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static int LIZIZ() {
        AudioDeviceInfo[] devices;
        if (LIZJ(C1475000oUE.LIZ) || (devices = LIZ.getDevices(2)) == null) {
            return 3;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4) {
                return 4;
            }
            if (type == 22) {
                return 5;
            }
            if (type == 7 || type == 8) {
                return 2;
            }
        }
        return 0;
    }

    public static boolean LIZJ(Context context) {
        if (LIZ == null) {
            try {
                LIZ = (AudioManager) C786410Ut5.H2(context, "audio");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (LIZ == null) {
            return true;
        }
        return false;
    }
}
