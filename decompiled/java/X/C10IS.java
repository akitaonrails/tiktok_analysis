package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10IS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IS {
    public static String LIZ(C2189821An6 c2189821An6) {
        if (Intrinsics.LJFF(c2189821An6.getEventType(), "push_notice")) {
            return "inbox";
        }
        return c2189821An6.getEventType();
    }

    public static String LIZIZ(C2189821An6 c2189821An6) {
        String muteStripBannerEnterMethod = c2189821An6.getMuteStripBannerEnterMethod();
        if (muteStripBannerEnterMethod != null && muteStripBannerEnterMethod.length() != 0) {
            return c2189821An6.getMuteStripBannerEnterMethod();
        }
        return "inbox";
    }

    public static boolean LIZJ(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            return AwemeExtKt.isProhibitedAndShouldTell(aweme);
        }
        return false;
    }

    public static boolean LJ(VideoItemParams videoItemParams) {
        if (Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")) {
            return false;
        }
        return LJFF(videoItemParams);
    }

    public static boolean LJFF(VideoItemParams videoItemParams) {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(videoItemParams.getAweme());
        if (statusSafety == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null) {
            mappedMuteStripStatus = AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
        }
        if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE || !Intrinsics.LJFF(AwemeExtKt.getAuthorUid(videoItemParams.getAweme()), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return false;
        }
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c10it.getClass();
        if (C10IT.LJIIJ(aweme)) {
            return false;
        }
        if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_ADD_SONGS) {
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(videoItemParams.getAweme());
            if (statusSafety2 != null) {
                return statusSafety2.isCanAddSongs();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_NO_SHOW || mappedMuteStripStatus == AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN) {
            return false;
        }
        return true;
    }

    public static boolean LJI(VideoItemParams videoItemParams) {
        if (LJFF(videoItemParams) && Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(Aweme aweme, C2189821An6 c2189821An6) {
        String idStr;
        int i;
        String str;
        String str2;
        UrlModel urlModel;
        List<String> urlList;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZ(c2189821An6));
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        Music music = aweme.getMusic();
        if (music != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        c2344009Gk.LJIIIIZZ("music_id", idStr);
        Video video = aweme.getVideo();
        int i2 = 0;
        if (video != null && video.isLongVideo()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_long_video");
        if (C10IT.LJI(aweme)) {
            str = "copyright";
        } else {
            str = "other";
        }
        c2344009Gk.LJIIIIZZ("mute_reason", str);
        OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
        if (originalAudioStruct != null && (urlModel = originalAudioStruct.playUrl) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "has_original_sound");
        if (AwemeExtKt.isPhotoMode(aweme)) {
            str2 = "photo_mode";
        } else {
            str2 = "video";
        }
        c2344009Gk.LJIIIIZZ("replace_music_content_type", str2);
        c2344009Gk.LIZJ(aweme.getVideo().getDuration(), "creation_duration");
        c2344009Gk.LJIIIIZZ("enter_method", LIZIZ(c2189821An6));
        c2344009Gk.LJIIIIZZ("mute_follow_up_status", C10IT.LJ(aweme));
        C20684815ws.LJIILLIIL("replace_bar_show", c2344009Gk.LIZ);
    }
}
