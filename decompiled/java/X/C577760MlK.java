package X;

import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0MlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577760MlK {
    public static final int LIZ(VideoPublishEditModel videoPublishEditModel) {
        return LIZIZ(videoPublishEditModel.creativeModel.beautyModel.beautifyUsedSegments);
    }

    public static final int LIZIZ(List<BeautifySegmentInfo> list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (BeautifySegmentInfo beautifySegmentInfo : list) {
            if (beautifySegmentInfo.getBeautifyUsed() == 1) {
                i = 1;
            } else if (beautifySegmentInfo.getBeautifyUsed() == 2) {
                return 2;
            }
        }
        return i;
    }
}
