package X;

import com.ss.android.ugc.aweme.creative.model.forward.SimpleAweme;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0MPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568110MPx {
    public static final Aweme LIZ(SimpleAweme simpleAweme) {
        Aweme aweme = new Aweme();
        aweme.setAid(simpleAweme.getAid());
        aweme.setAwemeType(simpleAweme.getAwemeType());
        aweme.setVideo(simpleAweme.getVideo());
        aweme.setDesc(simpleAweme.getDesc());
        aweme.setAuthor(simpleAweme.getAuthor());
        aweme.setMusic(simpleAweme.getMusic());
        aweme.setPhotoModeImageInfo(simpleAweme.getPhotoModeImageInfo());
        aweme.setCreateTime(simpleAweme.getCreateTime());
        aweme.setIsTikTokStory(simpleAweme.isTikTokStory());
        aweme.setIsStreaksPost(simpleAweme.isStreaksPost());
        aweme.aigcInfo = simpleAweme.getAigcInfo();
        return aweme;
    }
}
