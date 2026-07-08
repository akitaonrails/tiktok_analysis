package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0Bxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305200Bxm {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if ((!((Boolean) C277970Aux.LIZ.getValue()).booleanValue() && (!videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || !((Boolean) C0AH3.LIZ.getValue()).booleanValue())) || !C1416310mxZ.LJIJJ(videoPublishEditModel)) {
            return false;
        }
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_caption_animation", true, false) && !C1416310mxZ.LJJJLIIL(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !C1416310mxZ.LJJJLL(videoPublishEditModel) && !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) || !C1416310mxZ.LJIJ(videoPublishEditModel) || !C1416310mxZ.LJIJJLI(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (u4.LJJIJIIJI(videoPublishEditModel)) {
            return ((Boolean) C0AYG.LIZ.getValue()).booleanValue();
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_caption_animation", true, false);
    }
}
