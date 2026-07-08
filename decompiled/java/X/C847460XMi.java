package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0XMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847460XMi implements C0XNI {
    public long LIZ;
    public long LIZIZ;
    public final SharedPreferences LIZJ;
    public boolean LIZLLL;

    public C847460XMi(Context context) {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "token_ntp_provider");
        this.LIZJ = sharedPreferencesLIZJ;
        if (sharedPreferencesLIZJ != null) {
            long j = sharedPreferencesLIZJ.getLong("ntp_time_ms", -1L);
            long j2 = sharedPreferencesLIZJ.getLong("ntp_time_saved_ms", -1L);
            if (j > 0 && j2 > 0 && System.currentTimeMillis() - j2 < 864000000) {
                this.LIZ = j;
                this.LIZIZ = j2;
            }
        }
    }
}
