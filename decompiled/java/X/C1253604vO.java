package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.ForestLinkStrategy;

/* JADX INFO: renamed from: X.04vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253604vO {
    public static final C1253604vO LIZ = new C1253604vO();
    public static final ForestLinkStrategy LIZIZ = new ForestLinkStrategy(false);

    public static ForestLinkStrategy LIZ() {
        ForestLinkStrategy forestLinkStrategy;
        return (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("forest_link_strategy_settings") && (forestLinkStrategy = (ForestLinkStrategy) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("forest_link_strategy_settings", ""), ForestLinkStrategy.class)) != null) ? forestLinkStrategy : (ForestLinkStrategy) SettingsManager.LIZLLL().LJIIIIZZ("forest_link_strategy_settings", ForestLinkStrategy.class, LIZIZ);
    }
}
