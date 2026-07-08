package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;

/* JADX INFO: renamed from: X.11oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19612111oF extends AbstractC19589811ke<LinkStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19594011lK(LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        LinkStickerStruct urlLinkSticker = interactStickerStruct.getUrlLinkSticker();
        if (urlLinkSticker != null) {
            return new LinkStickerModel(C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.LINK, 0, 0), 0, EnumC19613311oR.DEFAULT, true, urlLinkSticker.getFullURL(), urlLinkSticker.getDisplayText(), urlLinkSticker.getLinkEnableStatus(), urlLinkSticker.getLinkRiskScore(), urlLinkSticker.getSafetyConclusion());
        }
        return new LinkStickerModel(new BaseStickerModel(106, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), 0, EnumC19613311oR.DEFAULT, true, "", "", "Enabled", 100, 0);
    }
}
