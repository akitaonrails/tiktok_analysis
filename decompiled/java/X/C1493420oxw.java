package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493420oxw {
    public static volatile C1493420oxw LJFF;
    public static final Object LJI = new Object();
    public static volatile SharedPreferences LJII;
    public volatile Context LIZ;
    public volatile int LIZIZ;
    public volatile long LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;

    public C1493420oxw(Context context) {
        if (context != null) {
            this.LIZ = C786410Ut5.N3(context);
        }
        try {
            if (LJII == null) {
                LJII = C810670Vr7.LIZJ(this.LIZ, 0, "image_opt_table");
            }
            SharedPreferences sharedPreferences = LJII;
            this.LIZIZ = sharedPreferences.getInt("image_opt_switch", 0);
            this.LIZJ = sharedPreferences.getLong("image_opt_black_interval", 0L);
            this.LIZLLL = sharedPreferences.getInt("image_opt_failed_times", 0);
            this.LJ = sharedPreferences.getInt("image_opt_limit_count", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(Context context) {
        if (LJFF == null) {
            synchronized (LJI) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1493420oxw(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
