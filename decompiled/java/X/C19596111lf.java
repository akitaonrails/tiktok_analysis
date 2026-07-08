package X;

import com.ss.android.ugc.aweme.social.sticker.editcomponent.share2story.Share2StoryStickerModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* JADX INFO: renamed from: X.11lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19596111lf extends AbstractC19589811ke<Share2StoryStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19596311lh.LIZ[LJ().LIZ.ordinal()];
        if (i == 1 || i == 2) {
            return new C19594011lK(LJ().LIZLLL, LJ());
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        boolean z;
        String str;
        Integer numValueOf;
        if (interactStickerStruct.getVideoShareInfoStruct() != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStickerModel type=");
        sbLIZ.append(interactStickerStruct.getType());
        sbLIZ.append(" hasVideoShareInfo=");
        sbLIZ.append(z);
        sbLIZ.append(" awemeId=");
        VideoShareInfoStruct videoShareInfoStruct = interactStickerStruct.getVideoShareInfoStruct();
        if (videoShareInfoStruct != null) {
            str = videoShareInfoStruct.awemeId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" photomodeIndex=");
        VideoShareInfoStruct videoShareInfoStruct2 = interactStickerStruct.getVideoShareInfoStruct();
        if (videoShareInfoStruct2 != null) {
            numValueOf = Integer.valueOf(videoShareInfoStruct2.photomodeIndex);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        return new Share2StoryStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null));
    }
}
