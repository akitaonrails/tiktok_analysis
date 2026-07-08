package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0VZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ7 {
    public static final SharedPreferences LIZ;
    public static int LIZIZ;

    static {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C2213981Bky.LIZIZ.getApplicationContext(), 0, "aweme-app");
        LIZ = sharedPreferencesLIZJ;
        LIZIZ = sharedPreferencesLIZJ.getInt("x2c_switch", 2);
    }
}
