package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.ForestNetStrategy;

/* JADX INFO: renamed from: X.04vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253704vP {
    public static final C1253704vP LIZ = new C1253704vP();
    public static final ForestNetStrategy LIZIZ = new ForestNetStrategy(true);

    public static ForestNetStrategy LIZ() {
        ForestNetStrategy forestNetStrategy;
        return (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("forest_net_strategy_settings") && (forestNetStrategy = (ForestNetStrategy) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("forest_net_strategy_settings", ""), ForestNetStrategy.class)) != null) ? forestNetStrategy : (ForestNetStrategy) SettingsManager.LIZLLL().LJIIIIZZ("forest_net_strategy_settings", ForestNetStrategy.class, LIZIZ);
    }
}
