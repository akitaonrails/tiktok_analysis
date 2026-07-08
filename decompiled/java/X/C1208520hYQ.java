package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0hYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208520hYQ {
    public final SharedPreferences LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("globalSystemPopup: lastResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rejectCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastPopupTime=");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208520hYQ(SharedPreferences sharedPreferences) {
        this.LIZ = sharedPreferences;
        this.LIZIZ = sharedPreferences.getInt("last_system_popup_result", -1);
        this.LIZJ = sharedPreferences.getInt("system_popup_count", 0);
        this.LIZLLL = sharedPreferences.getInt("system_popup_reject_count", 0);
        long j = sharedPreferences.getLong("last_system_popup_time", 0L);
        this.LJ = j;
        if (j == 0) {
            this.LJ = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("last_system_popup_time", this.LJ);
            editorEdit.apply();
        }
    }
}
