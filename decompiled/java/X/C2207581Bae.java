package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TimerTask;

/* JADX INFO: renamed from: X.1Bae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207581Bae {
    public static Vibrator LIZ;
    public static boolean LIZIZ;

    public static void LIZ(float f) {
        if (LIZ == null) {
            C2207231Ba5.LIZ(6);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int i2 = (int) (255.0f * f);
            long j = (long) (f * 300.0f);
            if (i2 < 1) {
                return;
            }
            if (i2 > 255) {
                i2 = 255;
            }
            LIZ.vibrate(VibrationEffect.createOneShot(j, i2));
            return;
        }
        if (i >= 24) {
            long j2 = (long) (f * 90.0f);
            LIZ.vibrate(new long[]{5, j2, 5, j2}, 2);
            new PthreadTimer("om/vboost/g/j").schedule(new TimerTask() { // from class: X.1Bah
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
                        C2207581Bae.LIZ.cancel();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, 300L);
        }
    }

    public static String LIZJ(String str) {
        try {
            File file = new File(str);
            FileReader fileReader = new FileReader(file);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = inputStreamReader.read();
                if (i != -1) {
                    stringBuffer.append((char) i);
                } else {
                    fileReader.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(float f, float f2) {
        if (LIZ == null) {
            C2207231Ba5.LIZ(6);
            return;
        }
        int i = (int) f2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            int i3 = (int) (f * 255.0f);
            if (i3 < 1) {
                return;
            }
            if (i3 > 255) {
                i3 = 255;
            }
            LIZ.vibrate(VibrationEffect.createOneShot(i, i3));
            return;
        }
        if (i2 >= 24) {
            long j = (long) (f * 90.0f);
            LIZ.vibrate(new long[]{5, j, 5, j}, 2);
            new PthreadTimer("om/vboost/g/j").schedule(new TimerTask() { // from class: X.1Bai
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
                        C2207581Bae.LIZ.cancel();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, i);
        }
    }
}
