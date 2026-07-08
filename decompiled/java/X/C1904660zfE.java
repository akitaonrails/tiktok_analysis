package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0zfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904660zfE {
    public static final C1904660zfE LIZ = new C1904660zfE();
    public static final Keva LIZIZ = Keva.getRepo("sync_inbox_2_app_banner_kv");
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static boolean LIZ() {
        C312050CLb.LIZ.getClass();
        if ((C312050CLb.LIZ() != 2 && C312050CLb.LIZ() != 4) || !C312050CLb.LIZIZ()) {
            return false;
        }
        Keva keva = LIZIZ;
        int i = keva.getInt("banner_show_times", 0);
        long j = keva.getLong("initial_timestamp", 0L);
        return j > 0 && System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(30L) && i < 2 && !keva.getBoolean("banner_manual_close", false);
    }

    public static void LIZIZ() {
        C312050CLb.LIZ.getClass();
        if (C312050CLb.LIZIZ()) {
            Keva keva = LIZIZ;
            if (keva.getLong("initial_timestamp", 0L) <= 0) {
                keva.storeLong("initial_timestamp", System.currentTimeMillis());
            }
        }
    }
}
