package X;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476920oXK {
    public static boolean LIZ;
    public static boolean LIZJ;
    public static final C1476980oXQ LIZIZ = new C1476980oXQ();
    public static boolean LIZLLL = true;

    public static int LIZ() {
        Application application = C1475000oUE.LIZ;
        int i = -1;
        if (application == null) {
            return -1;
        }
        try {
            i = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Settings.System.getInt(application.getContentResolver(), "screen_brightness_mode") != 1) {
            return 0;
        }
        return i;
    }

    public static int LIZIZ() {
        Application application = C1475000oUE.LIZ;
        int i = -1;
        if (application == null) {
            return -1;
        }
        try {
            i = Settings.System.getInt(application.getContentResolver(), "screen_brightness");
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i;
        }
    }

    public static void LIZJ() {
        if (!LIZJ || LIZLLL || LIZ) {
            return;
        }
        LIZ = true;
        Application application = C1475000oUE.LIZ;
        if (application == null) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) C786410Ut5.H2(application, "sensor");
            if (C1475000oUE.LJIIIZ == null) {
                C1475000oUE.LJIIIZ = C1475000oUE.LIZIZ().createBpeaLightSensor(sensorManager);
            }
            Sensor sensor = C1475000oUE.LJIIIZ;
            if (sensor == null) {
                return;
            }
            C1300690jx5.LIZJ(sensorManager, LIZIZ, sensor, 3, C1475000oUE.LJFF(true));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
