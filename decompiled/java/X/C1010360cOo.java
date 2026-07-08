package X;

import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* JADX INFO: renamed from: X.0cOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010360cOo {
    public static AlphaVideoData LIZ(AwemeRawAd awemeRawAd) {
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        AnoleModel anoleModel = awemeRawAd.getAnoleModel();
        if (anoleModel == null || (map = anoleModel.components) == null || map.isEmpty() || (anoleComponentModel = map.get(EnumC1008920cMU.SEARCH_EASTER_EGG.getType())) == null) {
            return null;
        }
        return anoleComponentModel.getAlphaVideoData("easter_egg");
    }
}
