package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411810mqJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(356));
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ() {
        LIZ().storeLong("unlimited_music_tip_show_time", System.currentTimeMillis());
        LIZ().storeInt("unlimited_music_tip_show_count", LIZ().getInt("unlimited_music_tip_show_count", 0) + 1);
        LIZIZ.set(false);
    }

    public static boolean LIZJ() {
        if (!LIZ().getBoolean("unlimited_music_tip_closed_manually", false) && LIZ().getInt("unlimited_music_tip_show_count", 0) < 5) {
            return TimeUnit.MILLISECONDS.toSeconds(Math.abs(System.currentTimeMillis() - LIZ().getLong("unlimited_music_tip_show_time", 0L))) > ((long) C0C64.LJIILLIIL().LJIJ(31744, 259200, "unlimited_music_tips_max_show_interval", true)) && !LIZ().getBoolean("unlimited_music_used", false);
        }
        return false;
    }
}
