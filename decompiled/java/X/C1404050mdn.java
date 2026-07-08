package X;

import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404050mdn {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        TTStoryUploadModel ttStoryUploadModel = videoPublishEditModel.getTtStoryUploadModel();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (ttStoryUploadModel != null) {
            c0lab.LJ("is_photo_template_post", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        if (videoPublishEditModel.creativeModel.photoModeTemplateData.showOriginTemplateAnchor == null) {
            boolean zLIZLLL = C1451040nra.LIZLLL(videoPublishEditModel);
            videoPublishEditModel.creativeModel.photoModeTemplateData.showOriginTemplateAnchor = Boolean.valueOf(zLIZLLL);
        }
        if (Intrinsics.LJFF(videoPublishEditModel.creativeModel.photoModeTemplateData.showOriginTemplateAnchor, Boolean.TRUE)) {
            str = "1";
        }
        c0lab.LJ("is_photo_template_post", str);
    }
}
