package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0J54, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J54 {
    public static boolean LIZ(Context context) {
        SharedPreferences sharedPreferencesLIZJ;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 4, "ttlive_sdk_shared_pref_cache")) != null) {
            if (((int) ((System.currentTimeMillis() - sharedPreferencesLIZJ.getLong("key_ttlive_sdk_flow_remind", 0L)) / 86400000)) <= 30) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(Context context) {
        SharedPreferences sharedPreferencesLIZJ;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 4, "ttlive_sdk_shared_pref_cache")) != null) {
            sharedPreferencesLIZJ.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
        }
    }
}
