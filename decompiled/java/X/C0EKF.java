package X;

import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EKF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKF {
    public static final boolean LIZ(LyricStickerModel lyricStickerModel, boolean z) {
        float realClipStart = lyricStickerModel.getRealClipStart() + (lyricStickerModel.getBaseStickerModel().getEndTime() - lyricStickerModel.getBaseStickerModel().getStartTime());
        if (realClipStart <= lyricStickerModel.getRealClipStart()) {
            return false;
        }
        List<TextStickerModel> textStickerModels = lyricStickerModel.getTextStickerModels();
        if (!(textStickerModels instanceof Collection) || !textStickerModels.isEmpty()) {
            for (TextStickerModel textStickerModel : textStickerModels) {
                if (!a0.LJJJIL(textStickerModel.getTextStr()) && (!z || !Intrinsics.LJFF(textStickerModel.getTextStr(), "sticker placeholder"))) {
                    long startTime = (long) textStickerModel.getBaseStickerModel().getStartTime();
                    if (((long) textStickerModel.getBaseStickerModel().getEndTime()) > lyricStickerModel.getRealClipStart() && startTime < realClipStart) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
