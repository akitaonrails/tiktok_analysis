package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1603106Pl extends C09AY implements Function0<StreakMilestoneUnlockAnimationConfig> {
    public C1603106Pl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StreakMilestoneUnlockAnimationConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        StreakMilestoneUnlockAnimationConfig streakMilestoneUnlockAnimationConfig = C1603606Pq.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_streak_milestone_unlock_animation_settings", StreakMilestoneUnlockAnimationConfig.class, streakMilestoneUnlockAnimationConfig);
        if (LJIIIIZZ != 0) {
            return LJIIIIZZ;
        }
        C1603606Pq.LIZ.getClass();
        return streakMilestoneUnlockAnimationConfig;
    }
}
