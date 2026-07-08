package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.110i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194310110i {
    public final C01GW LIZ;

    public final void LIZ() {
        Vibrator vibrator = (Vibrator) this.LIZ.getValue();
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Vibrator vibrator2 = (Vibrator) this.LIZ.getValue();
            if (vibrator2 != null) {
                vibrator2.vibrate(80L);
                return;
            }
            return;
        }
        VibrationEffect vibrationEffectCreateOneShot = VibrationEffect.createOneShot(80L, 100);
        Vibrator vibrator3 = (Vibrator) this.LIZ.getValue();
        if (vibrator3 != null) {
            vibrator3.vibrate(vibrationEffectCreateOneShot);
        }
    }

    public C194310110i(Context context) {
        this.LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 842));
    }
}
