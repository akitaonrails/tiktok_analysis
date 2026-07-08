package X;

import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;

/* JADX INFO: renamed from: X.0nXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438630nXZ {
    public static final boolean[] LIZ(InfoStickerModel infoStickerModel) {
        boolean[] zArr = {false, false};
        if (C2401009ay.LIZ(infoStickerModel.stickers)) {
            return zArr;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel.isImageSticker() || stickerItemModel.infoStickerSubtype == 29) {
                zArr[0] = true;
                if (stickerItemModel.cutout) {
                    zArr[1] = true;
                }
            }
        }
        return zArr;
    }
}
