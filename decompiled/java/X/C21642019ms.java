package X;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: renamed from: X.19ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21642019ms {
    public static KeyguardManager LIZ(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean LIZIZ(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
