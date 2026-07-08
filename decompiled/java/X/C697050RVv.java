package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.LiveInfo;
import com.ss.android.ugc.aweme.feed.model.LiveRelatedLabelInfo;
import com.ss.android.ugc.aweme.feed.model.LiveRelatedLabelType;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697050RVv {
    public static boolean LIZ(Aweme aweme) {
        String str;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        LiveInfo liveInfo;
        LiveRelatedLabelInfo liveRelatedLabelInfo;
        for (LiveRelatedLabelType liveRelatedLabelType : LiveRelatedLabelType.values()) {
            String value = liveRelatedLabelType.getValue();
            if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (liveInfo = standardBusinessModel.getLiveInfo()) != null && (liveRelatedLabelInfo = liveInfo.liveRelatedLabel) != null) {
                str = liveRelatedLabelInfo.labelType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(value, str)) {
                return true;
            }
        }
        return false;
    }
}
