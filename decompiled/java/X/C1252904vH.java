package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.04vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1252904vH {
    public static final C1252904vH LIZ = new C1252904vH();
    public static final n LIZIZ = new n();

    public static n LIZ() {
        n nVar;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_resource_manifest") || (nVar = (n) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_resource_manifest", ""), n.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            n nVar2 = LIZIZ;
            nVar = (n) settingsManagerLIZLLL.LJIIIIZZ("spark_resource_manifest", n.class, nVar2);
            if (nVar == null) {
                return nVar2;
            }
        }
        return nVar;
    }
}
