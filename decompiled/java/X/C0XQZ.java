package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0XQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQZ {
    public static SharedPreferences LIZ() {
        return C810670Vr7.LIZJ(C0XPY.LIZIZ, 0, "aweme-app");
    }

    public static void LIZIZ(boolean z) {
        LIZ().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    public static void LIZJ(boolean z) {
        LIZ().edit().putBoolean("ftc_create_password_showing", z).apply();
    }
}
