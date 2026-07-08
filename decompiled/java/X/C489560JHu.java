package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0JHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489560JHu {
    public static final VideoPublishEditModel LIZ(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            return (VideoPublishEditModel) baseShortVideoContext;
        }
        return null;
    }
}
