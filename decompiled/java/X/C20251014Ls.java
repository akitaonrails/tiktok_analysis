package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.14Ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20251014Ls {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesLIZJ;
        String string;
        if ((context != null || (context = C20250914Lr.LIZ) != null) && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "key_language_sp_key")) != null && (string = sharedPreferencesLIZJ.getString(str, str2)) != null) {
            return string;
        }
        return str2;
    }

    public static final void LIZIZ(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if ((context != null || (context = C20250914Lr.LIZ) != null) && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "key_language_sp_key")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorPutString = editorEdit.putString(str, str2)) != null) {
            editorPutString.apply();
        }
    }
}
