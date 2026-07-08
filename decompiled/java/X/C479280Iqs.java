package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Iqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479280Iqs {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static final void LIZ(Context context) {
        boolean z;
        Vibrator defaultVibrator;
        if (context == null) {
            return;
        }
        if (LIZ) {
            z = LIZIZ;
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                if (i >= 31) {
                    defaultVibrator = ((VibratorManager) C786410Ut5.H2(context, "vibrator_manager")).getDefaultVibrator();
                } else {
                    defaultVibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
                }
                LIZIZ = defaultVibrator.hasAmplitudeControl();
            } else {
                LIZIZ = false;
            }
            LIZ = true;
            z = LIZIZ;
        }
        if (!z) {
            return;
        }
        C01GW c01gw = C292900Bdw.LIZ;
        if ((((Number) c01gw.getValue()).intValue() & 2) == 2 && LIZJ.compareAndSet(false, true)) {
            LIZIZ(context);
        } else {
            if ((((Number) c01gw.getValue()).intValue() & 1) != 1) {
                return;
            }
            LIZIZ(context);
        }
    }

    public static void LIZIZ(Context context) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            defaultVibrator = ((VibratorManager) C786410Ut5.H2(context, "vibrator_manager")).getDefaultVibrator();
        } else {
            defaultVibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
        }
        long[] jArr = {0, 6, 4, 14};
        int[] iArr = {0, 160, 0, 255};
        if (i >= 26) {
            defaultVibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
        }
    }
}
