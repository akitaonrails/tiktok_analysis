package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Stj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735850Stj {
    public static final MentionStruct LIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (it2.hasNext()) {
                MentionStruct mentionInfo = it2.next().getMentionInfo();
                if (mentionInfo != null && (mentionInfo.getScenario() == EnumC19597511lt.POST_BACKWARDS_MENTION.getValue() || mentionInfo.getScenario() == EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue())) {
                    return mentionInfo;
                }
            }
        }
        return null;
    }

    public static final VideoShareInfoStruct LIZIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (it2.hasNext()) {
                VideoShareInfoStruct videoShareInfoStruct = it2.next().getVideoShareInfoStruct();
                if (videoShareInfoStruct != null) {
                    return videoShareInfoStruct;
                }
            }
        }
        return null;
    }
}
