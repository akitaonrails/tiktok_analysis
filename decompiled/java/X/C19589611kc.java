package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;

/* JADX INFO: renamed from: X.11kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19589611kc extends AbstractC19589811ke<EmbedHashTagStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1 LIZJ() {
        return new C19584311jl(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        String hashtagName;
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo == null || (hashtagName = hashtagInfo.getHashtagName()) == null) {
            hashtagName = "";
        }
        return new EmbedHashTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, hashtagName, false, false, true);
    }
}
