package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.streak.impl.milestone.MilestoneResourceOptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1604006Pu extends C09AY implements Function0<MilestoneResourceOptConfig> {
    public C1604006Pu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.streak.impl.milestone.MilestoneResourceOptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MilestoneResourceOptConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MilestoneResourceOptConfig milestoneResourceOptConfig = C1603906Pt.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("streak_milestone_resource_opt_settings", MilestoneResourceOptConfig.class, milestoneResourceOptConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : milestoneResourceOptConfig;
    }
}
