package X;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.19mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21642719mz {
    public static BiometricPrompt LIZJ(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    public static BiometricPrompt.Builder LIZLLL(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static void LJFF(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static void LIZIZ(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    public static void LJ(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public static void LIZ(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }
}
