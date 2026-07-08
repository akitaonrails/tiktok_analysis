package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0pWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514830pWT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        SharedPreferences sharedPreferencesLIZ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences sharedPreferencesLIZ2 = C1519430pdt.LIZ();
        boolean z = sharedPreferencesLIZ2 != null ? sharedPreferencesLIZ2.getBoolean("monitor_is_reinstall", false) : false;
        if (!z && (sharedPreferencesLIZ = C1519430pdt.LIZ()) != null && (editorEdit = sharedPreferencesLIZ.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("monitor_is_reinstall", true)) != null) {
            editorPutBoolean.apply();
        }
        return true ^ z;
    }
}
