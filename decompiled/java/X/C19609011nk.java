package X;

import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;

/* JADX INFO: renamed from: X.11nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19609011nk extends AbstractC19589811ke<SharedCommentStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19608911nj.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19578811is(6, LJ().LIZLLL, LJ());
        }
        if (i == 2) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return new SharedCommentStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SHARED_COMMENT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), new CommentVideoModel("", "", null, "", null, "", "", "", "", "", 0, "", 0, 0, CommentVideoModel.Type.COMMENT, "", "", null));
    }
}
