package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0pHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505830pHx {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Context context, String str) {
        String string;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "js_kv_methods_20191113");
        if (sharedPreferencesLIZJ == null || (string = sharedPreferencesLIZJ.getString(str, "")) == null) {
            return "";
        }
        return string;
    }

    public static final void LIZIZ(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "js_kv_methods_20191113");
        if (sharedPreferencesLIZJ != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorPutString = editorEdit.putString(str, str2)) != null) {
            editorPutString.apply();
        }
    }
}
