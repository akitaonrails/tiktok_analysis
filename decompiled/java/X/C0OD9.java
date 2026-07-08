package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;

/* JADX INFO: renamed from: X.0OD9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OD9 {
    public static final AddYoursTopic LIZ(AddYoursStickerStruct addYoursStickerStruct) {
        return new AddYoursTopic(addYoursStickerStruct.getTopicId(), addYoursStickerStruct.getText(), null, null, null, addYoursStickerStruct.getVideoCount(), null, addYoursStickerStruct.getFromQuestion(), -1, addYoursStickerStruct.getViewerInvited(), addYoursStickerStruct.getEoyCampaign(), addYoursStickerStruct.getEoyCampaignSchema(), addYoursStickerStruct.getTopicType());
    }
}
