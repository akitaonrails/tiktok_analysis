package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutPlayerType;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDJ {
    public static long LIZIZ;
    public static final C0LDJ LIZ = new C0LDJ();
    public static final ConcurrentLinkedQueue<Pair<Long, C443120HZe<Integer, Integer, Integer>>> LIZJ = new ConcurrentLinkedQueue<>();

    public static C0LAB LIZJ(ShortVideoContext shortVideoContext) {
        String str;
        LayoutApplyFrom layoutApplyFrom;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        String value = null;
        if (cameraLayoutModel != null) {
            str = cameraLayoutModel.layoutMode;
        } else {
            str = null;
        }
        c0lab.LJ("layout_mode", str);
        CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel2 != null && (layoutApplyFrom = cameraLayoutModel2.layoutApplyFrom) != null) {
            value = layoutApplyFrom.getValue();
        }
        c0lab.LJ("layout_apply_from", value);
        return c0lab;
    }

    public static void LJI(C0LAB c0lab) {
        if (c0lab == null) {
            return;
        }
        c0lab.LIZIZ(SystemClock.elapsedRealtime() - LIZIZ, "duration");
        C20684815ws.LJIILLIIL("layout_performance_compose", c0lab.LIZ);
    }

    public static C0LAB LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        String str;
        String value;
        String value2;
        Integer numValueOf;
        Integer numValueOf2;
        LayoutPlayerType layoutPlayerType;
        LayoutApplyFrom layoutApplyFrom;
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null && cameraLayoutModel.layoutEnabled) {
            Integer numValueOf3 = null;
            if (cameraLayoutModel != null) {
                str = cameraLayoutModel.layoutMode;
            } else {
                str = null;
            }
            c0lab.LJ("layout_mode", str);
            CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel2 != null && (layoutApplyFrom = cameraLayoutModel2.layoutApplyFrom) != null) {
                value = layoutApplyFrom.getValue();
            } else {
                value = null;
            }
            c0lab.LJ("layout_apply_from", value);
            CameraLayoutModel cameraLayoutModel3 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel3 != null && (layoutPlayerType = cameraLayoutModel3.layoutPlayerType) != null) {
                value2 = layoutPlayerType.getValue();
            } else {
                value2 = null;
            }
            c0lab.LJ("layout_player_type", value2);
            CameraLayoutModel cameraLayoutModel4 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel4 != null) {
                numValueOf = Integer.valueOf(C0L5H.LJFF(cameraLayoutModel4));
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "layout_fill_video_cnt");
            CameraLayoutModel cameraLayoutModel5 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel5 != null) {
                numValueOf2 = Integer.valueOf(C0L5H.LIZLLL(cameraLayoutModel5));
            } else {
                numValueOf2 = null;
            }
            c0lab.LIZLLL(numValueOf2, "layout_fill_pic_cnt");
            CameraLayoutModel cameraLayoutModel6 = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel6 != null) {
                numValueOf3 = Integer.valueOf(C0L5H.LIZJ(cameraLayoutModel6));
            }
            c0lab.LIZLLL(numValueOf3, "layout_fill_live_photo_cnt");
            return c0lab;
        }
        return c0lab;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        LayoutApplyFrom layoutApplyFrom;
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null && cameraLayoutModel.layoutEnabled) {
            String value = null;
            if (cameraLayoutModel != null) {
                str = cameraLayoutModel.layoutMode;
            } else {
                str = null;
            }
            c0lab.LJ("layout_mode", str);
            CameraLayoutModel cameraLayoutModel2 = videoPublishEditModel.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel2 != null && (layoutApplyFrom = cameraLayoutModel2.layoutApplyFrom) != null) {
                value = layoutApplyFrom.getValue();
            }
            c0lab.LJ("layout_apply_from", value);
        }
    }

    public static void LIZLLL(ShortVideoContext shortVideoContext, float f) {
        Integer numValueOf;
        Integer numValueOf2;
        C0LAB c0labLIZJ = LIZJ(shortVideoContext);
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        Integer numValueOf3 = null;
        if (cameraLayoutModel != null) {
            numValueOf = Integer.valueOf(C0L5H.LJFF(cameraLayoutModel));
        } else {
            numValueOf = null;
        }
        c0labLIZJ.LIZLLL(numValueOf, "layout_fill_video_cnt");
        CameraLayoutModel cameraLayoutModel2 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel2 != null) {
            numValueOf2 = Integer.valueOf(C0L5H.LIZLLL(cameraLayoutModel2));
        } else {
            numValueOf2 = null;
        }
        c0labLIZJ.LIZLLL(numValueOf2, "layout_fill_pic_cnt");
        CameraLayoutModel cameraLayoutModel3 = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel3 != null) {
            numValueOf3 = Integer.valueOf(C0L5H.LIZJ(cameraLayoutModel3));
        }
        c0labLIZJ.LIZLLL(numValueOf3, "layout_fill_live_photo_cnt");
        c0labLIZJ.LJ("playback_fps", String.valueOf(f));
        C20684815ws.LJIILLIIL("layout_performance_shoot_playback_fps", c0labLIZJ.LIZ);
    }

    public static void LJ(C0LAB c0lab, int i) {
        if (c0lab == null) {
            return;
        }
        c0lab.LIZIZ(SystemClock.elapsedRealtime() - LIZIZ, "duration");
        c0lab.LIZ(i, "error_code");
        C20684815ws.LJIILLIIL("layout_performance_compose", c0lab.LIZ);
    }

    public static C0LAB LJFF(String str, ShortVideoContext shortVideoContext, boolean z) {
        String str2;
        LIZIZ = SystemClock.elapsedRealtime();
        if (z) {
            str2 = "layout_photo_compile";
        } else {
            str2 = "layout_video_compile";
        }
        C0LAB c0labLIZJ = LIZJ(shortVideoContext);
        c0labLIZJ.LJ("compose_type", str2);
        c0labLIZJ.LJ("compose_resolution", str);
        return c0labLIZJ;
    }
}
