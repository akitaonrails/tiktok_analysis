package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;

/* JADX INFO: renamed from: X.11nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19609311nn extends AbstractC19589811ke<HashTagStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19608611ng.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19630611rE(LJ().LIZLLL, LJ());
        }
        if (i == 2) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        boolean z = false;
        HashTagStickerModel hashTagStickerModelLIZ = C19598311m1.LIZ(interactStickerStruct, 0, 0);
        C1866270yfJ c1866270yfJ = LJ().LJ;
        if (c1866270yfJ != null) {
            z = c1866270yfJ.LJFF;
        }
        return hashTagStickerModelLIZ.copy(hashTagStickerModelLIZ.baseStickerModel, hashTagStickerModelLIZ.hashtagName, hashTagStickerModelLIZ.editable, hashTagStickerModelLIZ.visible, z);
    }
}
