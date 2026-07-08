package X;

import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0SSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721770SSx {
    public static final List<String> LIZ(LivePhotoStruct livePhotoStruct) {
        VideoUrlModel playAddr;
        Video video = livePhotoStruct.videoModel;
        if (video != null && (playAddr = video.getPlayAddr()) != null) {
            return playAddr.getUrlList();
        }
        return null;
    }
}
