package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.ForestMemoryStrategy;

/* JADX INFO: renamed from: X.0Bup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303370Bup {
    public static final C303370Bup LIZ = new C303370Bup();
    public static final ForestMemoryStrategy LIZIZ = new ForestMemoryStrategy(false, false, false, null);

    public static ForestMemoryStrategy LIZ() {
        ForestMemoryStrategy forestMemoryStrategy;
        return (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("forest_memory_strategy_settings") && (forestMemoryStrategy = (ForestMemoryStrategy) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("forest_memory_strategy_settings", ""), ForestMemoryStrategy.class)) != null) ? forestMemoryStrategy : (ForestMemoryStrategy) SettingsManager.LIZLLL().LJIIIIZZ("forest_memory_strategy_settings", ForestMemoryStrategy.class, LIZIZ);
    }
}
