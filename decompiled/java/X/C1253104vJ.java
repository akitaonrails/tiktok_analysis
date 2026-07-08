package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.04vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253104vJ {
    public static final n LIZ = new n();

    public static final n LIZ() {
        n nVar;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("hybrid_monitor_settings_timing") || (nVar = (n) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("hybrid_monitor_settings_timing", ""), n.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            n nVar2 = LIZ;
            nVar = (n) settingsManagerLIZLLL.LJIIIIZZ("hybrid_monitor_settings_timing", n.class, nVar2);
            if (nVar == null) {
                return nVar2;
            }
        }
        return nVar;
    }
}
