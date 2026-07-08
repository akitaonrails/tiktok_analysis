package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390140FRk {
    public static final AddYoursStickerModel LIZ(AddYoursStickerModel addYoursStickerModel, int i, int i2) {
        if (addYoursStickerModel.getBaseStickerModel().getMediaWidth() > 0 || addYoursStickerModel.getBaseStickerModel().getMediaHeight() > 0) {
            return addYoursStickerModel;
        }
        int width = addYoursStickerModel.getBaseStickerModel().getWidth();
        int height = addYoursStickerModel.getBaseStickerModel().getHeight();
        if (width == 0 && height == 0) {
            C388980FMy.LIZ.getClass();
            Pair<Integer, Integer> pair = C388980FMy.LIZIZ;
            width = pair.getFirst().intValue();
            height = pair.getSecond().intValue();
        }
        return addYoursStickerModel.copy(BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, width, height, 0, 0, 0, 0, i, i2, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -24961, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }
}
