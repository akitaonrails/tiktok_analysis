package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.07uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010407uA {
    public static final C2010407uA LIZ = new C2010407uA();
    public static final n LIZIZ = new n();

    public static n LIZ() {
        n nVar;
        return (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("gecko_cdn_config") && (nVar = (n) C08JS.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("gecko_cdn_config", "{}"), n.class)) != null) ? nVar : (n) SettingsManager.LIZLLL().LJIIIIZZ("gecko_cdn_config", n.class, LIZIZ);
    }
}
