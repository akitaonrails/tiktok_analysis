package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0UOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771610UOp {
    public static String LIZ(Context context, String str) {
        SharedPreferences sharedPreferencesLIZJ;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "live_mode")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("live_start_live_mode");
            String string = sharedPreferencesLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), "VIDEO");
            if (string != null) {
                return string;
            }
            return "";
        }
        return "";
    }

    public static void LIZJ(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "live_mode")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("live_start_live_mode");
            editorEdit.putString(C2188811AlT.LIZIZ(sbLIZ), str);
            editorEdit.apply();
        }
    }

    public static void LIZIZ(Context context, String str, String str2, boolean z) {
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        if (context != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "Congrats")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str);
            sbLIZ.append("apply_status");
            editorEdit.putBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
            editorEdit.apply();
        }
    }
}
