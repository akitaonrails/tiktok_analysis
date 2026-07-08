package X;

import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* JADX INFO: renamed from: X.0nN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432170nN9 extends AbstractC1430630nKf {
    @Override // X.AbstractC1430630nKf
    public final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (C1429320nIY.LIZJ(videoPublishEditModel) && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1430630nKf
    public final String LJIJI(VideoPublishEditModel videoPublishEditModel) {
        String coverFromLocalPath;
        CoverPublishModel coverPublishModel = videoPublishEditModel.creativeModel.coverPublishModel;
        if (coverPublishModel == null || (coverFromLocalPath = coverPublishModel.getCoverFromLocalPath()) == null) {
            coverFromLocalPath = "";
        }
        String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        if ((!C123100dR.LIZ(coverFromLocalPath) && (coverPublishModel == null || !coverPublishModel.isCoverFromUrl())) || !C123100dR.LIZ(strLIZIZ)) {
            return "";
        }
        return strLIZIZ;
    }

    @Override // X.AbstractC1430630nKf
    public final void LJIILL(AbstractImageUploader abstractImageUploader, UploadImageConfig uploadImageConfig, VideoPublishEditModel videoPublishEditModel) {
        C2208411Bbz c2208411Bbz = new C2208411Bbz();
        c2208411Bbz.LIZJ(uploadImageConfig);
        if (C1429320nIY.LIZJ(videoPublishEditModel) && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
            c2208411Bbz.LIZIZ("Scene", "poster");
        }
        abstractImageUploader.LJIIL(c2208411Bbz.LIZLLL());
    }
}
