package X;

import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;

/* JADX INFO: renamed from: X.0SyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738630SyD {
    public static final StoryNoteInfoModel.BackGroundInfo LIZ(BackgroundModel backgroundModel) {
        StoryNoteInfoModel.GradientImageData gradientImageData;
        int i = backgroundModel.backgroundType;
        BackgroundModel.GradientImageData gradientImageData2 = backgroundModel.gradientImgData;
        if (gradientImageData2 != null) {
            gradientImageData = new StoryNoteInfoModel.GradientImageData(gradientImageData2.colors, gradientImageData2.locations);
        } else {
            gradientImageData = null;
        }
        return new StoryNoteInfoModel.BackGroundInfo(i, gradientImageData, backgroundModel.backgroundImgUrl, backgroundModel.backgroundGeckoId);
    }

    public static final BackgroundModel LIZIZ(StoryNoteInfoModel.BackGroundInfo backGroundInfo) {
        BackgroundModel.GradientImageData gradientImageData;
        int i = backGroundInfo.backGroundImageType;
        StoryNoteInfoModel.GradientImageData gradientImageData2 = backGroundInfo.gradientImgData;
        if (gradientImageData2 != null) {
            gradientImageData = new BackgroundModel.GradientImageData(gradientImageData2.colors, gradientImageData2.locations);
        } else {
            gradientImageData = null;
        }
        return new BackgroundModel(i, gradientImageData, null, backGroundInfo.backgroundImgUrl, backGroundInfo.backgroundGeckoId);
    }
}
