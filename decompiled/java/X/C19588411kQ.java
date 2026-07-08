package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;

/* JADX INFO: renamed from: X.11kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19588411kQ extends AbstractC19589811ke<SecretRepliesResponseStickerModel> implements InterfaceC19588911kV {
    public Aweme LJFF;

    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19589211kY.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        if (i == 2) {
            return new C19578111il(LJ().LIZLLL, LJ(), this.LJFF, 6);
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = interactStickerStruct.getSecretRepliesResponseStickerStruct();
        if (secretRepliesResponseStickerStruct != null) {
            return new SecretRepliesResponseStickerModel(C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.SECRET_REPLIES_RESPONSE, 0, 0), secretRepliesResponseStickerStruct.getBaseAwemeId(), secretRepliesResponseStickerStruct.getQuestionText(), secretRepliesResponseStickerStruct.getResponseText(), true);
        }
        return new SecretRepliesResponseStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SECRET_REPLIES_RESPONSE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, true);
    }

    @Override // X.InterfaceC19588911kV
    public final void LJIILIIL(Aweme aweme) {
        this.LJFF = aweme;
    }
}
