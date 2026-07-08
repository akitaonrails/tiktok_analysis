package X;

import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0caO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017540caO {
    public static final boolean LIZ(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        String enterScene;
        AdStyleActionModel adStyleActionModel;
        AdOneStopLandingPageConfig adOneStopLandingPageConfig;
        AdOneStopLandingPageComponentConfig backgroundConfig;
        List<String> scenes;
        if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (enterScene = c1035880d3y.getEnterScene()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) == null || (backgroundConfig = adOneStopLandingPageConfig.getBackgroundConfig()) == null || (scenes = backgroundConfig.getScenes()) == null || !scenes.contains(enterScene)) {
            return false;
        }
        return true;
    }
}
