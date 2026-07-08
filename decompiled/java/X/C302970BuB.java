package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.ForestStrategy;

/* JADX INFO: renamed from: X.0BuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302970BuB {
    public static final C302970BuB LIZ = new C302970BuB();
    public static final ForestStrategy LIZIZ = new ForestStrategy(0, null, false, false, false, 0, null, null, false, false, false, false, false, 0.0f, Long.MAX_VALUE, false, false, 20, 0.1f, 0.1f);

    public static ForestStrategy LIZ() {
        ForestStrategy forestStrategy;
        return (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("forest_strategy_settings") && (forestStrategy = (ForestStrategy) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("forest_strategy_settings", ""), ForestStrategy.class)) != null) ? forestStrategy : (ForestStrategy) SettingsManager.LIZLLL().LJIIIIZZ("forest_strategy_settings", ForestStrategy.class, LIZIZ);
    }
}
