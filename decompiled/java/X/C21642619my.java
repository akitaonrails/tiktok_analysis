package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: renamed from: X.19my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21642619my {
    public static FingerprintManager.CryptoObject LIZIZ(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager LIZJ(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean LIZLLL(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean LJ(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static C21643119n3 LJFF(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C21643119n3(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C21643119n3(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() == null) {
            return null;
        }
        return new C21643119n3(cryptoObject.getMac());
    }

    public static FingerprintManager.CryptoObject LJI(C21643119n3 c21643119n3) {
        if (c21643119n3 == null) {
            return null;
        }
        if (c21643119n3.LIZIZ != null) {
            return new FingerprintManager.CryptoObject(c21643119n3.LIZIZ);
        }
        if (c21643119n3.LIZ != null) {
            return new FingerprintManager.CryptoObject(c21643119n3.LIZ);
        }
        if (c21643119n3.LIZJ == null) {
            return null;
        }
        return new FingerprintManager.CryptoObject(c21643119n3.LIZJ);
    }

    public static void LIZ(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
    }
}
