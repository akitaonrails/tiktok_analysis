package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: renamed from: X.0qTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551420qTU {
    public SharedPreferences LIZ;

    public final void LIZIZ(Context context) {
        if (this.LIZ == null) {
            this.LIZ = C810670Vr7.LIZJ(context, 0, "sp_gecko");
        }
    }

    public final Set LIZ(Context context, String str) {
        LIZIZ(context);
        return this.LIZ.getStringSet(str, null);
    }

    public final void LIZJ(Context context, String str, String str2) {
        LIZIZ(context);
        this.LIZ.edit().putString(str, str2).apply();
    }

    public final void LIZLLL(Context context, String str, Set<String> set) {
        LIZIZ(context);
        this.LIZ.edit().putStringSet(str, set).apply();
    }
}
