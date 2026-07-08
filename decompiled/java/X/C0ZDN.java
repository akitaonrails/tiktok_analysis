package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZDN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDN {
    public final Vibrator LIZ;

    public C0ZDN(Context context) {
        this.LIZ = (Vibrator) C786410Ut5.H2(context, "vibrator");
    }

    public final void LIZ(int i) {
        VibrationEffect vibrationEffectCreateOneShot;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                vibrationEffectCreateOneShot = VibrationEffect.createOneShot(12L, 100);
                            } else {
                                vibrationEffectCreateOneShot = VibrationEffect.createWaveform(new long[]{12, 100, 12, 100, 12}, new int[]{200, 0, 150, 0, 100}, -1);
                            }
                        } else {
                            vibrationEffectCreateOneShot = VibrationEffect.createWaveform(new long[]{12, 100, 12}, new int[]{100, 0, 150}, -1);
                        }
                    } else {
                        vibrationEffectCreateOneShot = VibrationEffect.createOneShot(12L, 200);
                    }
                } else {
                    vibrationEffectCreateOneShot = VibrationEffect.createOneShot(12L, 100);
                }
                Vibrator vibrator = this.LIZ;
                if (vibrator != null) {
                    vibrator.vibrate(vibrationEffectCreateOneShot);
                    return;
                }
                return;
            }
            if (i != 0 && i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        long[] jArr = {0, 12, 100, 12, 100, 12};
                        Vibrator vibrator2 = this.LIZ;
                        if (vibrator2 != null) {
                            vibrator2.vibrate(jArr, -1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                long[] jArr2 = {0, 12, 100, 12};
                Vibrator vibrator3 = this.LIZ;
                if (vibrator3 != null) {
                    vibrator3.vibrate(jArr2, -1);
                    return;
                }
                return;
            }
            Vibrator vibrator4 = this.LIZ;
            if (vibrator4 != null) {
                vibrator4.vibrate(12L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
