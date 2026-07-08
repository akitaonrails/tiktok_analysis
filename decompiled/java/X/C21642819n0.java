package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21642819n0 {
    public static Method LIZJ() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static int LIZ(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager LIZIZ(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
