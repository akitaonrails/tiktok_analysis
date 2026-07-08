package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0BwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304430BwX {
    public static final C304430BwX LIZ = new C304430BwX();
    public static final String[] LIZIZ = new String[0];

    public static String[] LIZ() {
        String[] strArr;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("incentive_reuse_urls") || (strArr = (String[]) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("incentive_reuse_urls", ""), new TypeToken<String[]>() { // from class: X.0BwY
        }.getType())) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            String[] strArr2 = LIZIZ;
            strArr = (String[]) settingsManagerLIZLLL.LJIIIIZZ("incentive_reuse_urls", String[].class, strArr2);
            if (strArr == null) {
                return strArr2;
            }
        }
        return strArr;
    }
}
