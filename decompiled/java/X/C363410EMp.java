package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363410EMp {
    public static StickerItemModel LIZ(String str, Pair pair) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(str);
        TextStickerData textStickerData = new TextStickerData(C2188811AlT.LIZIZ(sbLIZ), 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -2, -1, -1, 4095, null);
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.stickerId = "";
        stickerItemModel.type = LSPassThroughRecordSizeConfig.DEFAULT;
        stickerItemModel.layerWeight = 1000000;
        float fFloatValue = 0.5f;
        stickerItemModel.currentOffsetX = 0.5f;
        stickerItemModel.currentOffsetY = 0.5f;
        stickerItemModel.startTime = 0;
        stickerItemModel.endTime = -2;
        stickerItemModel.path = "";
        stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
        if (((Number) pair.getFirst()).floatValue() != 0.0f && ((Number) pair.getSecond()).floatValue() != 0.0f) {
            fFloatValue = (((Number) pair.getSecond()).floatValue() * (1080.0f / ((Number) pair.getFirst()).floatValue())) / 1920.0f;
        }
        stickerItemModel.photoModeShareToStoryRatio = fFloatValue;
        return stickerItemModel;
    }
}
