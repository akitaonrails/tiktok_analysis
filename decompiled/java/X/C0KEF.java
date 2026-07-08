package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: renamed from: X.0KEF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) {
        Vibrator vibrator;
        if (context == null) {
            return;
        }
        Object objH2 = C786410Ut5.H2(context, "vibrator");
        if ((objH2 instanceof Vibrator) && (vibrator = (Vibrator) objH2) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(50L, 255), (AudioAttributes) null);
            } else {
                vibrator.vibrate(50L);
            }
        }
    }
}
