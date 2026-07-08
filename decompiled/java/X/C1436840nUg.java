package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0nUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436840nUg {
    public final C01GW LIZ;

    public final SharedPreferences LIZJ() {
        return (SharedPreferences) this.LIZ.getValue();
    }

    public final String LIZIZ() {
        String string = LIZJ().getString("publish_parallel_uploadRecoverPath", "");
        return string != null ? string : "";
    }

    public final String LIZLLL() {
        String string = LIZJ().getString("publish_story_upload_recover_path", "");
        return string != null ? string : "";
    }

    public final void LJ() {
        LIZJ().edit().putBoolean("is_first_enter_record_page", false).apply();
    }

    public C1436840nUg(Context context) {
        this.LIZ = C452501pT.LIZIZ(new C1439200nYU(context));
    }

    public final String LIZ(String str) {
        String string = LIZJ().getString("parallel_last_auto_recover_paths", str);
        if (string != null) {
            return string;
        }
        return str;
    }

    public final void LJFF(String str) {
        LIZJ().edit().putString("publish_parallel_uploadRecoverPath", str).apply();
    }

    public final void LJI(String str) {
        LIZJ().edit().putString("publish_story_upload_recover_path", str).apply();
    }
}
