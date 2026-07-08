package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453840nw6 {
    public static final String LIZIZ() {
        C01GW c01gw = C298350Bmj.LIZ;
        return ((Number) c01gw.getValue()).intValue() == 1 ? "filtercomposer" : ((Number) c01gw.getValue()).intValue() == 2 ? "story_new_editfilter" : "story-editeffects";
    }

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isStoryEditMode()) {
            return LIZIZ();
        }
        return "colorfilternew";
    }

    public static final boolean LIZJ(FilterBean filterBean) {
        String enName;
        if (filterBean != null) {
            enName = filterBean.getEnName();
        } else {
            enName = null;
        }
        return u.LJIJI(enName, "normal", true);
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getShootMode() == 30) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        if (videoPublishEditModel == null || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || !C1444940nhk.LJFF(canvasVideoData)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (!LJ(videoPublishEditModel) || ((Number) C0B0E.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJ(videoPublishEditModel) || ((Number) C263540AUm.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (!LJ(videoPublishEditModel) || ((Number) C263550AUn.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        if (videoPublishEditModel == null || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || !C1444940nhk.LJIIZILJ(canvasVideoData)) {
            return false;
        }
        return true;
    }
}
