package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0d88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1038460d88 implements InterfaceC1038440d86 {
    public abstract InterfaceC1038430d85 LIZIZ(SparkContext sparkContext, C1035880d3y c1035880d3y, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig);

    public abstract AdOneStopLandingPageComponentConfig LIZJ(C1035880d3y c1035880d3y);

    @Override // X.InterfaceC1038440d86
    public final InterfaceC1038430d85 LIZ(SparkContext sparkContext, C1035880d3y c1035880d3y) {
        List<String> scenes;
        AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfigLIZJ = LIZJ(c1035880d3y);
        if (adOneStopLandingPageComponentConfigLIZJ == null || (scenes = adOneStopLandingPageComponentConfigLIZJ.getScenes()) == null) {
            return null;
        }
        String enterScene = c1035880d3y.getEnterScene();
        if (enterScene == null) {
            enterScene = "";
        }
        if (!scenes.contains(enterScene) && !scenes.contains("all")) {
            return null;
        }
        return LIZIZ(sparkContext, c1035880d3y, adOneStopLandingPageComponentConfigLIZJ);
    }
}
