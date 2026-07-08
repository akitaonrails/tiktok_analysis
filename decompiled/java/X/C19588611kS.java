package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;

/* JADX INFO: renamed from: X.11kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19588611kS extends AbstractC19589811ke<DonationStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return !LJI().getShouldRenderRealtimeOverlay() ? new C19594011lK(LJ().LIZIZ.getContext(), LJ()) : new C19578211im(LJ().LIZIZ.getContext(), LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return C19583911jh.LIZ(interactStickerStruct, LJ().LIZJ.LIZ, LJ().LIZJ.LIZIZ);
    }
}
