package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351210lGZ {
    public final Vibrator LIZ;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            VibrationEffect vibrationEffectCreatePredefined = VibrationEffect.createPredefined(0);
            Vibrator vibrator = this.LIZ;
            if (vibrator != null) {
                vibrator.vibrate(vibrationEffectCreatePredefined);
            }
        }
    }

    public C1351210lGZ(Context context) {
        this.LIZ = (Vibrator) C786410Ut5.H2(context, "vibrator");
    }

    public final void LIZIZ(int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                VibrationEffect vibrationEffectCreateOneShot = VibrationEffect.createOneShot(i, i2);
                Vibrator vibrator = this.LIZ;
                if (vibrator != null) {
                    vibrator.vibrate(vibrationEffectCreateOneShot);
                    return;
                }
                return;
            }
            Vibrator vibrator2 = this.LIZ;
            if (vibrator2 != null) {
                vibrator2.vibrate(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
