package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;

/* JADX INFO: renamed from: X.11m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19598311m1 {
    public static final HashTagStickerModel LIZ(InteractStickerStruct interactStickerStruct, int i, int i2) {
        String hashtagName;
        BaseStickerModel baseStickerModelLIZ = C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.MENTION, i, i2);
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo != null) {
            hashtagName = hashtagInfo.getHashtagName();
        } else {
            hashtagName = null;
        }
        return new HashTagStickerModel(baseStickerModelLIZ, hashtagName, false, true, false);
    }
}
