package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19607511nV extends AbstractC19589811ke<AddYoursStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1 LIZJ() {
        return new C19614411oc(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return C1466100oFs.LIZ(interactStickerStruct.getAddYoursStickerStruct());
    }

    @Override // X.AbstractC19589811ke
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        if (C1428650nHT.LIZ()) {
            return;
        }
        super.LIZIZ(interactStickerStruct, stickerModel);
        if (LJ().LIZ == EnumC19589411ka.INTERACT) {
            C01TT.LIZJ(new AwS573S0100000_29(this, 791));
        }
    }
}
