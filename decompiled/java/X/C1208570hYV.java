package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0hYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208570hYV {
    public final SharedPreferences LIZ;
    public final EnumC2192761Arq LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("globalInAppPromote: lastResult=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastPopupTime=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208570hYV(SharedPreferences sharedPreferences, EnumC2192761Arq enumC2192761Arq) {
        this.LIZ = sharedPreferences;
        this.LIZIZ = enumC2192761Arq;
        this.LIZJ = sharedPreferences.getInt("in_app_popup_count", 0);
        this.LIZLLL = sharedPreferences.getLong("last_in_app_popup_time", 0L);
        this.LJ = sharedPreferences.getInt("last_in_app_popup_result", 0);
    }
}
