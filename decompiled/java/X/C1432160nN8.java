package X;

import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432160nN8 extends C1432150nN7 {
    public static boolean LJIJJ(VideoPublishEditModel videoPublishEditModel) {
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel;
        String str = videoPublishEditModel.creativeModel.postPageModel.customCoverPath;
        if (!C1429320nIY.LIZJ(videoPublishEditModel) || !C1447250nlT.LIZ() || !C2286708xd.LIZJ(str) || (coverPublishModel = videoPublishEditModel.getCoverPublishModel()) == null || (effectTextModel = coverPublishModel.getEffectTextModel()) == null || effectTextModel.getHasCoverText()) {
            return false;
        }
        return true;
    }

    @Override // X.C1432150nN7, X.AbstractC1430630nKf
    public final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        EffectTextModel effectTextModel;
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if ((coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && effectTextModel.getHasCoverText()) || LJIJJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    @Override // X.C1432150nN7, X.AbstractC1430630nKf
    public final String LJIJI(VideoPublishEditModel videoPublishEditModel) {
        String strLJII;
        PublishSecureModel publishSecureModel = videoPublishEditModel.creativeModel.publishSecureModel;
        String strLIZIZ = C0MH7.LIZIZ(videoPublishEditModel);
        String strLIZIZ2 = C1429320nIY.LIZIZ(videoPublishEditModel);
        if (LJIJJ(videoPublishEditModel) && strLIZIZ2 != null) {
            strLIZIZ = strLIZIZ2;
        }
        if (C493401w4.LIZ() && (strLJII = C0MH8.LIZ.LJII(videoPublishEditModel, -1)) != null) {
            strLIZIZ = strLJII;
        }
        if (C1440950nbJ.LIZ(publishSecureModel.coverMD5, publishSecureModel.coverSecureSalt, videoPublishEditModel.getCreationId(), strLIZIZ)) {
            return strLIZIZ;
        }
        return "";
    }
}
