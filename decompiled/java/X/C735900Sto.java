package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0Sto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735900Sto {
    public static final boolean LIZ(Aweme aweme, EnumC19597511lt enumC19597511lt) {
        List<InteractStickerStruct> interactStickerStructs;
        MentionStruct mentionInfo;
        String userId;
        if (aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null || interactStickerStructs.isEmpty()) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
            if (mentionInfo2 != null && mentionInfo2.getScenario() == enumC19597511lt.getValue() && (mentionInfo = interactStickerStruct.getMentionInfo()) != null && (userId = mentionInfo.getUserId()) != null && userId.length() != 0) {
                return true;
            }
        }
        return false;
    }
}
