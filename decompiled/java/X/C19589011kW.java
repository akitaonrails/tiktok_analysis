package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;

/* JADX INFO: renamed from: X.11kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19589011kW extends AbstractC19589811ke<AICaptionTagStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        EnumC19589411ka enumC19589411ka;
        C19591211ks c19591211ksLJ = LJ();
        if (c19591211ksLJ == null || (enumC19589411ka = c19591211ksLJ.LIZ) == null) {
            enumC19589411ka = EnumC19589411ka.PREVIEW;
        }
        return C19589311kZ.LIZ[enumC19589411ka.ordinal()] == 1 ? new C1884640z8w(LJ().LIZLLL) : new C19594011lK(LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        return new AICaptionTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), false, true, 1.0f, false, false);
    }
}
