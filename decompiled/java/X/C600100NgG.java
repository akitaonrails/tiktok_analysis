package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0NgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600100NgG {
    public static final C0NNE LIZ(Aweme aweme) {
        InteractStickerStruct next;
        QaStruct qaStruct;
        InteractStickerStruct next2;
        AddYoursStickerStruct addYoursStickerStruct;
        Long topicId;
        if (aweme.getInteractStickerStructs() == null) {
            return null;
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (next2.getAddYoursStickerStruct() != null) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next2;
            if (interactStickerStruct != null && (addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct()) != null && (topicId = addYoursStickerStruct.getTopicId()) != null) {
                return new C0NNC(topicId.longValue(), addYoursStickerStruct, addYoursStickerStruct.getText());
            }
        }
        List<InteractStickerStruct> interactStickerStructs2 = aweme.getInteractStickerStructs();
        if (interactStickerStructs2 != null) {
            Iterator<InteractStickerStruct> it3 = interactStickerStructs2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next.getQaStruct() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct2 = next;
            if (interactStickerStruct2 != null && (qaStruct = interactStickerStruct2.getQaStruct()) != null) {
                return new C0NND(qaStruct.questionId, qaStruct, qaStruct.questionContent);
            }
        }
        return null;
    }
}
