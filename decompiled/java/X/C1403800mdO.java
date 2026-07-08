package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403800mdO extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C1403800mdO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        String str;
        String str2;
        Integer numLJIIJJI;
        TTSModel ttsModel;
        Map<String, String> map;
        String str3;
        Integer numLJIIJJI2;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel2)) {
            for (TextStickerModel textStickerModel : C1416310mxZ.LJJIJIL(videoPublishEditModel2)) {
                TTSModel ttsModel2 = textStickerModel.getTtsModel();
                if (ttsModel2 != null && ttsModel2.hasReadTextAudio && (ttsModel = textStickerModel.getTtsModel()) != null && (map = ttsModel.ttsExtraMap) != null && (str3 = map.get("is_aigc_content")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null && numLJIIJJI2.intValue() == 1) {
                    return Boolean.TRUE;
                }
            }
        } else if (videoPublishEditModel2.hasInfoStickers() && (infoStickerModel = videoPublishEditModel2.getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null) {
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (str = stickerItemModel.extra) != null) {
                    SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, SimpleTextStickerData.class);
                    if (simpleTextStickerData.getHasReadTextAudio() && (str2 = simpleTextStickerData.getTtsExtraMap().get("is_aigc_content")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 1) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}
