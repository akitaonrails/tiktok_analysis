package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0nNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432530nNj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        EffectTextModel effectTextModel;
        CoverPublishModel coverPublishModel;
        CoverPublishModel coverPublishModel2;
        CoverPublishModel coverPublishModel3;
        PostPageModel postPageModel;
        PostPageModel postPageModel2;
        CreativeModel creativeModel;
        PostPageModel postPageModel3;
        String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (postPageModel3 = creativeModel.postPageModel) != null) {
            str = postPageModel3.customCoverOriginalPath;
        } else {
            str = null;
        }
        if (strLIZIZ != null && C2286708xd.LIZJ(strLIZIZ)) {
            new C0VSJ(strLIZIZ).delete();
        }
        if (str != null && C2286708xd.LIZJ(str)) {
            new C0VSJ(str).delete();
        }
        if (videoPublishEditModel != null) {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2 != null && (postPageModel2 = creativeModel2.postPageModel) != null) {
                postPageModel2.customCoverPath = null;
            }
            CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
            if (creativeModel3 != null && (postPageModel = creativeModel3.postPageModel) != null) {
                postPageModel.customCoverOriginalPath = null;
            }
            CreativeModel creativeModel4 = videoPublishEditModel.creativeModel;
            if (creativeModel4 != null && (coverPublishModel3 = creativeModel4.coverPublishModel) != null) {
                coverPublishModel3.setCoverFromLocalPath("");
            }
            CreativeModel creativeModel5 = videoPublishEditModel.creativeModel;
            if (creativeModel5 != null && (coverPublishModel2 = creativeModel5.coverPublishModel) != null) {
                coverPublishModel2.setCoverFromUrl(false);
            }
            CreativeModel creativeModel6 = videoPublishEditModel.creativeModel;
            if (creativeModel6 != null && (coverPublishModel = creativeModel6.coverPublishModel) != null) {
                coverPublishModel.setPreviewMatrix(new ArrayList());
            }
            CoverPublishModel coverPublishModel4 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel4 != null && (effectTextModel = coverPublishModel4.getEffectTextModel()) != null) {
                effectTextModel.reset();
            }
        }
        if (C493401w4.LIZ() && videoPublishEditModel != null) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            C0MH8.LJIILJJIL(c0mh8, videoPublishEditModel, null, 4, 2);
            C0MH8.LJIILJJIL(c0mh8, videoPublishEditModel, null, 5, 2);
            C0MH8.LJIILJJIL(c0mh8, videoPublishEditModel, null, 6, 2);
        }
    }
}
