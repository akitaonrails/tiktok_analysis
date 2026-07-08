package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.11rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19633311rf {
    public final SharedPreferences LIZ;
    public SharedPreferences.Editor LIZIZ;

    public final SharedPreferences.Editor LIZLLL() {
        if (this.LIZIZ == null) {
            this.LIZIZ = this.LIZ.edit();
        }
        return this.LIZIZ;
    }

    public C19633311rf(Context context, String str) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, str);
    }

    public final int LIZ(int i, String str) {
        return this.LIZ.getInt(str, i);
    }

    public final String LIZIZ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final boolean LIZJ(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    public final void LJ(String str, int i) {
        LIZLLL().putInt(str, i).apply();
    }

    public final void LJFF(String str, String str2) {
        LIZLLL().putString(str, str2).apply();
    }

    public final void LJI(String str, boolean z) {
        LIZLLL().putBoolean(str, z).apply();
    }
}
