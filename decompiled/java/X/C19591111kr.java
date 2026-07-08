package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;

/* JADX INFO: renamed from: X.11kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591111kr extends AbstractC19589811ke<SingleHashTagStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1 LIZJ() {
        return new C19591011kq(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        String hashtagName;
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo == null || (hashtagName = hashtagInfo.getHashtagName()) == null) {
            hashtagName = "";
        }
        return new SingleHashTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, hashtagName, false, false, true);
    }
}
