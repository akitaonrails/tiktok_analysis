package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XBL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBL {
    public static void LIZ(Context context, C844630XBl c844630XBl, C844770XBz c844770XBz) {
        SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(context, c844770XBz);
        SharedPreferences sharedPreferencesLIZ2 = c844630XBl.LIZ(c844770XBz);
        boolean z = false;
        if (sharedPreferencesLIZ.getBoolean("dr_install_migrate", false)) {
            return;
        }
        SharedPreferences sharedPreferencesLIZJ = c844770XBz.LIZJ();
        String string = sharedPreferencesLIZJ.getString("device_id", null);
        String string2 = sharedPreferencesLIZJ.getString("bd_did", null);
        String string3 = sharedPreferencesLIZJ.getString("install_id", null);
        String string4 = sharedPreferencesLIZJ.getString("ssid", null);
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZ2.edit();
        if (!TextUtils.isEmpty(string)) {
            editorEdit.putString("device_id", string);
            z = true;
        }
        if (!TextUtils.isEmpty(string2)) {
            editorEdit.putString("bd_did", string2);
            z = true;
        }
        if (!TextUtils.isEmpty(string3)) {
            editorEdit.putString("install_id", string3);
            z = true;
        }
        if (!TextUtils.isEmpty(string4)) {
            editorEdit.putString("ssid", string4);
        } else {
            if (z) {
            }
            sharedPreferencesLIZ.edit().putBoolean("dr_install_migrate", true).apply();
        }
        editorEdit.apply();
        sharedPreferencesLIZ.edit().putBoolean("dr_install_migrate", true).apply();
    }
}
