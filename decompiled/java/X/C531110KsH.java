package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;

/* JADX INFO: renamed from: X.0KsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531110KsH {
    public static final C531110KsH LIZ = new C531110KsH();
    public static final String[] LIZIZ = {"story", "chat_shoot"};
    public static final String[] LIZJ = {"story", "chat_shoot"};
    public static final String[] LIZLLL = {"direct_shoot", "single_song", "prop_page"};

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r29) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531110KsH.LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
    }

    public static Bundle LIZIZ(LocalMediaArgument localMediaArgument, ShortVideoContext shortVideoContext) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", localMediaArgument.supportFlag);
        bundle.putBoolean("Key_enable_multi_video", localMediaArgument.enableMultiVideo);
        bundle.putLong("Key_min_duration", localMediaArgument.minDuration);
        bundle.putInt("key_photo_select_min_count", localMediaArgument.minPhotoCount);
        bundle.putInt("key_photo_select_max_count", localMediaArgument.maxPhotoCount);
        bundle.putInt("key_video_select_min_count", localMediaArgument.minVideoCount);
        bundle.putInt("key_video_select_max_count", localMediaArgument.maxVideoCount);
        bundle.putInt("key_min_selectable_video_duration", localMediaArgument.minSelectableVideoDuration);
        bundle.putInt("key_max_selectable_video_duration", localMediaArgument.maxSelectableVideoDuration);
        bundle.putInt("key_dm_chat_type", localMediaArgument.dmChatType);
        C786410Ut5.LJJJI("key_choose_media_dm_session_id", localMediaArgument.sessionId, bundle);
        bundle.putInt("key_choose_scene", localMediaArgument.chooseScene);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putInt("key_choose_request_code", localMediaArgument.chooseRequestCode);
        bundle.putBoolean("key_choose_media_display_tns_notice", localMediaArgument.shouldDisplayTnsNotice);
        bundle.putInt("key_choose_media_notice_text", localMediaArgument.tnsNoticeRes);
        C786410Ut5.LJJJI("key_mv_hint_text", localMediaArgument.hintText, bundle);
        bundle.putBoolean("dm_group_shot", localMediaArgument.isFromGroupShot);
        C786410Ut5.LJJJI("shoot_way", localMediaArgument.shootWay, bundle);
        Bundle bundle2 = localMediaArgument.extraBundle;
        if (bundle2 != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle2);
        }
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[PHI: r1
      0x0077: PHI (r1v16 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig) = 
      (r1v0 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
      (r1v20 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
      (r1v20 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
      (r1v20 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
      (r1v20 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
      (r1v20 com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig)
     binds: [B:32:0x005b, B:34:0x005f, B:107:0x019b, B:109:0x019f, B:112:0x01ab, B:42:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161 A[PHI: r4
      0x0161: PHI (r4v5 int) = (r4v4 int), (r4v7 int) binds: [B:90:0x015d, B:66:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C531110KsH r30, com.bytedance.scene.Scene r31, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r32, boolean r33, long r34, android.os.Bundle r36, boolean r37, java.lang.Boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, int r43) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531110KsH.LIZJ(X.0KsH, com.bytedance.scene.Scene, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, boolean, long, android.os.Bundle, boolean, java.lang.Boolean, boolean, boolean, boolean, boolean, int):void");
    }
}
