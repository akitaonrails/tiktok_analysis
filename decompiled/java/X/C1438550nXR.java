package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;

/* JADX INFO: renamed from: X.0nXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438550nXR {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C1446930nkx.LJII(new C1438540nXQ());
    }

    public static final void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        if (C504670Jqj.LIZ(shortVideoContext.shootWay, "duet")) {
            c0lab.LJ("duet_entrance_type", shortVideoContext.creativeModel.duetModel.duetEntranceType);
            c0lab.LJ("duet_prev_entrance_type", shortVideoContext.creativeModel.duetModel.duetPrevEntranceType);
            c0lab.LJ("duet_from_item_id", shortVideoContext.cameraComponentModel.duetContext.duetFromAwemeId);
            c0lab.LIZ(shortVideoContext.creativeModel.duetModel.duetVideoDuration, "duet_from_video_duration");
            c0lab.LIZ(shortVideoContext.creativeModel.duetModel.isDuetFromDuet ? 1 : 0, "is_duet_from_duet");
        }
    }

    public static final void LIZIZ(C0LAB c0lab, VideoPublishEditModelKt videoPublishEditModelKt) {
        if (C504670Jqj.LIZ(videoPublishEditModelKt.mShootWay, "duet")) {
            c0lab.LJ("duet_entrance_type", videoPublishEditModelKt.getCreativeModel().duetModel.duetEntranceType);
            c0lab.LJ("duet_prev_entrance_type", videoPublishEditModelKt.getCreativeModel().duetModel.duetPrevEntranceType);
            c0lab.LJ("duet_from_item_id", videoPublishEditModelKt.getCreativeModel().duetModel.duetFromAwemeId);
            c0lab.LIZ(videoPublishEditModelKt.getCreativeModel().duetModel.duetVideoDuration, "duet_from_video_duration");
            c0lab.LIZ(videoPublishEditModelKt.getCreativeModel().duetModel.isDuetFromDuet ? 1 : 0, "is_duet_from_duet");
        }
    }
}
