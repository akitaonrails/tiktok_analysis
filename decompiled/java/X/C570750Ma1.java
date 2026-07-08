package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Ma1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570750Ma1 {
    public static final C570750Ma1 LIZ = new C570750Ma1();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static C0MPH LIZJ;

    public static void LIZ(C19EG c19eg) {
        C0MPH c0mph;
        if (LIZIZ.decrementAndGet() == 0 && (c0mph = LIZJ) != null && c0mph.isShowing() && c19eg != null && !c19eg.isFinishing()) {
            C0MPH c0mph2 = LIZJ;
            if (c0mph2 != null) {
                c0mph2.dismiss();
                C785410UrT.LIZ(c0mph2);
            }
            LIZJ = null;
            C194353111z.LIZ.LIZIZ(1112, C0MVY.DISMISS, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
        }
    }

    public static void LIZIZ(C19EG c19eg) {
        LIZIZ.incrementAndGet();
        if (LIZJ == null && c19eg != null && !c19eg.isFinishing()) {
            LIZJ = C0MPH.LIZLLL(c19eg, c19eg.getString(2131845263));
            C194353111z.LIZ.LIZIZ(1112, C0MVY.SHOW, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
        }
    }

    public static Intent LIZJ(int i, VideoPublishEditModel videoPublishEditModel) {
        Intent intent = new Intent();
        C580250MpL.LIZ(intent, videoPublishEditModel, true);
        intent.putExtra("draft_to_edit_from", i);
        EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
        if (editPostModel != null) {
            intent.putExtra("EDIT_POST_MODEL_MUSIC_URL_MODEL", editPostModel.getMusicUrlModel());
            intent.putExtra("EDIT_POST_MODEL_MUSIC_URL", editPostModel.getMusicUrlModel());
            intent.putExtra("EDIT_POST_MODEL_VIDEO_PLAY_ADDR", editPostModel.getVideoPlayAddr());
            intent.putExtra("EDIT_POST_MODEL_VIDEO_COVER_ADDR", editPostModel.getVideoCoverAddr());
            intent.putExtra("EDIT_POST_MODEL_VIDEO_DYNAMIC_COVER", editPostModel.getVideoDynamicCover());
        }
        return intent;
    }
}
