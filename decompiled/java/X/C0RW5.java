package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.util.List;

/* JADX INFO: renamed from: X.0RW5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW5 {
    public static boolean LIZ(Aweme aweme) {
        boolean z;
        List<AwemeLabelModel> list;
        AwemeRawAd awemeRawAd;
        if (aweme == null) {
            return false;
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel != null && relationLabel.isValid()) {
            z = true;
        } else {
            z = false;
        }
        C698200Ra6.LIZ.getClass();
        if ((aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdTagPosition() == 1) || (((list = aweme.videoLabels) == null || list.isEmpty()) && !z)) {
            return false;
        }
        return true;
    }
}
