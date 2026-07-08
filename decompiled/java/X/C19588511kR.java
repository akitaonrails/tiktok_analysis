package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;

/* JADX INFO: renamed from: X.11kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19588511kR extends AbstractC19589811ke<SecretRepliesStickerModel> implements InterfaceC19588911kV {
    public Aweme LJFF;

    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19589111kX.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        if (i == 2) {
            return new C19577711ih(LJ().LIZLLL, LJ(), this.LJFF);
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        SecretRepliesStickerStruct secretRepliesStickerStruct = interactStickerStruct.getSecretRepliesStickerStruct();
        if (secretRepliesStickerStruct != null) {
            return new SecretRepliesStickerModel(C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.SECRET_REPLIES, 0, 0), true, secretRepliesStickerStruct.getQuestionText(), false);
        }
        return new SecretRepliesStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, null, false);
    }

    @Override // X.InterfaceC19588911kV
    public final void LJIILIIL(Aweme aweme) {
        this.LJFF = aweme;
    }
}
