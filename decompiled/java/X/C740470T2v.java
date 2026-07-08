package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0T2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740470T2v {
    public static SharedPreferences LIZLLL() {
        C844470XAv.LIZ.getClass();
        return C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "MainTabPreferences");
    }

    public static final int LIZ() {
        return LIZLLL().getInt("diggUnloginCount", 0);
    }

    public static final boolean LIZIZ() {
        return LIZLLL().getBoolean("deviceHasDigged", false);
    }

    public static final void LIZJ() {
        LIZLLL().edit().putBoolean("deviceHasDigged", true).apply();
    }

    public static final void LJ(int i) {
        LIZLLL().edit().putInt("diggUnloginCount", i).apply();
    }
}
