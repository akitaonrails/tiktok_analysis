package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.18G6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18G6 {
    public final SharedPreferences LIZ;
    public final SharedPreferences.Editor LIZIZ;

    public C18G6(Context context, String str) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, str);
        this.LIZ = sharedPreferencesLIZJ;
        this.LIZIZ = sharedPreferencesLIZJ.edit();
    }

    public final void LIZ(String str, String str2) {
        this.LIZIZ.putString(str, str2);
        this.LIZIZ.commit();
    }

    public final String LIZIZ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final void LIZJ(String str, String str2) {
        this.LIZIZ.putString(str, str2);
        this.LIZIZ.apply();
    }
}
