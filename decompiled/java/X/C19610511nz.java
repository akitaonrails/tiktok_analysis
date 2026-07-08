package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;

/* JADX INFO: renamed from: X.11nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19610511nz extends AbstractC19589811ke<PollStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19608511nf.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19615211ok(LJ().LIZLLL);
        }
        if (i == 2) {
            return new C19631811rQ(LJ().LIZLLL, LJ());
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return new PollStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.POLL, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, false, false, "", "", "", "");
    }
}
