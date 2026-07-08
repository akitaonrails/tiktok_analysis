package X;

import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525050KiV {
    public static final void LIZ(TikTokMediaModel tikTokMediaModel, LivePhotoInfo livePhotoInfo) {
        if (tikTokMediaModel != null && livePhotoInfo != null) {
            LivePhotoInfo livePhotoInfo2 = tikTokMediaModel.livePhotoInfo;
            if (livePhotoInfo2 != null) {
                livePhotoInfo2.setLivePhotoPreviewMode(livePhotoInfo.getLivePhotoPreviewMode());
                livePhotoInfo2.setHasUserClickedIcon(livePhotoInfo.getHasUserClickedIcon());
            } else {
                tikTokMediaModel.livePhotoInfo = livePhotoInfo.copy(livePhotoInfo.videoPath, livePhotoInfo.videoDuration, livePhotoInfo.livePhotoPreviewModeStr, livePhotoInfo.hasUserClickedIcon);
            }
        }
    }

    public static final boolean LIZIZ(TikTokMediaModel tikTokMediaModel, List<? extends TikTokMediaModel> list) {
        LivePhotoInfo livePhotoInfo;
        if (tikTokMediaModel == null || list == null || list.isEmpty() || !tikTokMediaModel.LJIIJJI() || (livePhotoInfo = tikTokMediaModel.livePhotoInfo) == null) {
            return false;
        }
        for (TikTokMediaModel tikTokMediaModel2 : list) {
            if (tikTokMediaModel2.LJIIJJI() && Intrinsics.LJFF(((MediaModel) tikTokMediaModel2).id, ((MediaModel) tikTokMediaModel).id)) {
                if (tikTokMediaModel2 != tikTokMediaModel) {
                    LIZ(tikTokMediaModel2, livePhotoInfo);
                }
                return true;
            }
        }
        return false;
    }
}
