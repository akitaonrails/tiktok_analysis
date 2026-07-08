package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0F7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7Y {
    public static final StickerItemModel LIZ(TextStickerData textStickerData, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text_sticker_");
        sbLIZ.append(i);
        StickerItemModel stickerItemModel = new StickerItemModel(C2188811AlT.LIZIZ(sbLIZ), null, GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData), i, false, 0, LSPassThroughRecordSizeConfig.DEFAULT, 2);
        stickerItemModel.isImageStickerLayer = true;
        return stickerItemModel;
    }
}
