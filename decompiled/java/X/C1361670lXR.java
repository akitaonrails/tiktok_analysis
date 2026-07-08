package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0lXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361670lXR {
    public static final /* synthetic */ int LIZ = 0;

    public static UrlModel LIZ(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video != null) {
            if (LIZIZ(aweme.getVideo().getCover())) {
                return video.getCover();
            }
            if (LIZIZ(aweme.getVideo().getAiCover())) {
                return video.getAiCover();
            }
            return video.getOriginCover();
        }
        return null;
    }

    public static boolean LIZIZ(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }
}
