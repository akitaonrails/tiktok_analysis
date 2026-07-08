package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: renamed from: X.0KEG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) {
        if (context == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50L, 255), (AudioAttributes) null);
        } else {
            vibrator.vibrate(50L);
        }
    }
}
