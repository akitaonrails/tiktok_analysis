package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;

/* JADX INFO: renamed from: X.11nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19609211nm extends AbstractC19589811ke<LiveCountDownStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19635611s2(LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIIIZZ().destroy();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return C19616311ov.LIZ(interactStickerStruct, 0, 0);
    }
}
