package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;

/* JADX INFO: renamed from: X.11pS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19619611pS extends AbstractC19589811ke<MentionStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19608811ni.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19630811rG(LJ().LIZLLL, LJ());
        }
        if (i == 2) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        boolean z = false;
        MentionStickerModel mentionStickerModelLIZ = C1466440oGQ.LIZ(interactStickerStruct, 0, 0);
        C1866270yfJ c1866270yfJ = LJ().LJ;
        if (c1866270yfJ != null) {
            z = c1866270yfJ.LJFF;
        }
        return mentionStickerModelLIZ.copy(mentionStickerModelLIZ.baseStickerModel, mentionStickerModelLIZ.user, mentionStickerModelLIZ.userId, mentionStickerModelLIZ.secUid, mentionStickerModelLIZ.userName, mentionStickerModelLIZ.avatarUrl, mentionStickerModelLIZ.nickname, mentionStickerModelLIZ.useNickName, mentionStickerModelLIZ.editable, mentionStickerModelLIZ.visible, z);
    }
}
