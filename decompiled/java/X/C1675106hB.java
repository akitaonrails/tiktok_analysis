package X;

import com.ss.android.ugc.aweme.im.common.experiment.StreaksPushRemindConfig;

/* JADX INFO: renamed from: X.06hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675106hB {
    public static final C1675106hB LIZ = new C1675106hB();
    public static final StreaksPushRemindConfig LIZIZ = new StreaksPushRemindConfig(0, 15, 15);

    public static StreaksPushRemindConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        StreaksPushRemindConfig streaksPushRemindConfig = LIZIZ;
        StreaksPushRemindConfig streaksPushRemindConfig2 = (StreaksPushRemindConfig) c0c64LJIILLIIL.LJJII(StreaksPushRemindConfig.class, streaksPushRemindConfig, "im_remind_streaks_turn_on_push_notifications", true);
        return streaksPushRemindConfig2 != null ? streaksPushRemindConfig2 : streaksPushRemindConfig;
    }

    public static boolean LIZIZ() {
        return LIZ().variant > 0;
    }

    public static boolean LIZJ() {
        return LIZ().variant == 2;
    }
}
