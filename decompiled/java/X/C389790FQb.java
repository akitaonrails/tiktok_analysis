package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0FQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389790FQb {
    public static final C389790FQb LIZ = new C389790FQb();
    public static boolean LIZIZ;
    public static MvCreateVideoData LIZJ;

    static {
        C1446930nkx.LJ(AFwS234S0000000_5.get$arr$(1));
        C1446930nkx.LJ(AFwS234S0000000_5.get$arr$(2));
        C1446930nkx.LIZJ(AFwS234S0000000_5.get$arr$(3));
        C1446930nkx.LIZJ(AFwS234S0000000_5.get$arr$(4));
        C1446930nkx.LIZLLL(AFwS234S0000000_5.get$arr$(5));
        C1446930nkx.LIZLLL(AFwS234S0000000_5.get$arr$(6));
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (z) {
            LIZIZ = true;
            videoPublishEditModel.setPhotoMvMode(false);
            videoPublishEditModel.setPhotoMvMode1080p(false);
            videoPublishEditModel.setPhotoMvMusic(false);
            LIZJ = videoPublishEditModel.getMvCreateVideoData();
            videoPublishEditModel.setMvCreateVideoData(null);
            videoPublishEditModel.getAvetParameter().setContentType("video");
            return;
        }
        LIZIZ = false;
        videoPublishEditModel.setPhotoMvMode(true);
        videoPublishEditModel.setPhotoMvMode1080p(true);
        videoPublishEditModel.setPhotoMvMusic(true);
        videoPublishEditModel.setMvCreateVideoData(LIZJ);
        LIZJ = null;
        videoPublishEditModel.getAvetParameter().setContentType("slideshow");
    }
}
