package X;

import android.content.Context;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import java.security.Signature;

/* JADX INFO: renamed from: X.0xtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836510xtJ {
    public static C1716070ul3 LIZIZ(Context context) {
        return new C1716070ul3(new C21642419mw(new C1836550xtN(context)), C786410Ut5.N3(context));
    }

    public static void LIZ(Context context, Fragment fragment, String str, String str2, Signature signature, AbstractC21643419n6 abstractC21643419n6) {
        BiometricPrompt biometricPrompt = new BiometricPrompt(fragment, C838410Wul.LIZJ(context), abstractC21643419n6);
        C1836520xtK c1836520xtK = new C1836520xtK();
        c1836520xtK.LIZ = str;
        c1836520xtK.LIZIZ = str2;
        c1836520xtK.LIZJ = true;
        c1836520xtK.LIZLLL = 15;
        C1836540xtM c1836540xtMLIZ = c1836520xtK.LIZ();
        C14BY c14by = new C14BY(signature);
        int iLIZ = C1836530xtL.LIZ(c1836540xtMLIZ, c14by);
        if ((iLIZ & 255) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && C1836530xtL.LIZIZ(iLIZ)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        biometricPrompt.LIZ(c1836540xtMLIZ, c14by);
    }
}
