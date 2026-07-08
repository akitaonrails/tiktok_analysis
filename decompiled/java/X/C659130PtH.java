package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0PtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659130PtH {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        VideoTag videoTag;
        String englishTitle;
        if (aweme != null) {
            if (aweme.getNewLabel() == 1) {
                return "New";
            }
            Video video = aweme.getVideo();
            if (video != null && (videoTag = video.getVideoTag()) != null && (englishTitle = videoTag.getEnglishTitle()) != null) {
                return englishTitle;
            }
            return "";
        }
        return "";
    }

    public static final void LIZIZ(Aweme aweme) {
        String str;
        String title;
        Video video;
        Video video2;
        VideoTag videoTag;
        if (aweme != null && aweme.getNewLabel() == 1) {
            str = "New";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (aweme != null && (video2 = aweme.getVideo()) != null && (videoTag = video2.getVideoTag()) != null) {
                title = videoTag.getTitle();
            } else {
                title = null;
            }
            if (TextUtils.isEmpty(title) && aweme != null && (video = aweme.getVideo()) != null) {
                VideoTag videoTag2 = new VideoTag();
                videoTag2.setTitle(str);
                video.setVideoTag(videoTag2);
            }
        }
    }
}
