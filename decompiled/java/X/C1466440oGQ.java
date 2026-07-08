package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;

/* JADX INFO: renamed from: X.0oGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466440oGQ {
    public static final MentionStickerModel LIZ(InteractStickerStruct interactStickerStruct, int i, int i2) {
        String userId;
        String secUid;
        String username;
        UrlModel avatarUrl;
        BaseStickerModel baseStickerModelLIZ = C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.MENTION, i, i2);
        String nickname = null;
        MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
        if (mentionInfo != null) {
            userId = mentionInfo.getUserId();
        } else {
            userId = null;
        }
        MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
        if (mentionInfo2 != null) {
            secUid = mentionInfo2.getSecUid();
        } else {
            secUid = null;
        }
        MentionStruct mentionInfo3 = interactStickerStruct.getMentionInfo();
        if (mentionInfo3 != null) {
            username = mentionInfo3.getUsername();
        } else {
            username = null;
        }
        MentionStruct mentionInfo4 = interactStickerStruct.getMentionInfo();
        if (mentionInfo4 != null) {
            avatarUrl = mentionInfo4.getAvatarUrl();
        } else {
            avatarUrl = null;
        }
        MentionStruct mentionInfo5 = interactStickerStruct.getMentionInfo();
        if (mentionInfo5 != null) {
            nickname = mentionInfo5.getNickname();
        }
        return new MentionStickerModel(baseStickerModelLIZ, null, userId, secUid, username, avatarUrl, nickname, true, false, true, false);
    }
}
