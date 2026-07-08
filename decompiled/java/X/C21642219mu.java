package X;

import android.app.KeyguardManager;
import android.content.Intent;

/* JADX INFO: renamed from: X.19mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21642219mu {
    public static Intent LIZ(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
